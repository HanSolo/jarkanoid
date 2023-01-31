package eu.hansolo.fx.jarkanoid;

import eu.hansolo.toolbox.Helper;
import eu.hansolo.toolbox.observables.ObservableMatrix;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class Main extends Application {
    private enum PaddleState {
        STANDARD(80),
        WIDE(121),
        GUN(80);

        public final double width;

        PaddleState(final double width) {
            this.width = width;
        }
    }

    private static final Random      RND             = new Random();
    private static final double      WIDTH           = 560;
    private static final double      HEIGHT          = 740;
    private static final double      INSET           = 22;
    private static final double      UPPER_INSET     = 85;
    private static final double      PADDLE_OFFSET_Y = 68;
    private static final double      PADDLE_SPEED    = 8;
    private static final double      TORPEDO_SPEED   = 12;
    private static final double      BALL_SPEED      = 5;
    private static final double      MAX_BALL_SPEED  = 10;
    private static final double      BLOCK_WIDTH     = 38;
    private static final double      BLOCK_HEIGHT    = 20;
    private static final double      BLOCK_STEP_X    = 40;
    private static final double      BLOCK_STEP_Y    = 22;
    private static final DropShadow  DROP_SHADOW     = new DropShadow(BlurType.TWO_PASS_BOX, Color.rgb(0, 0, 0, 0.65), 5, 0.0, 10, 10);
    private static final Font        SCORE_FONT      = Fonts.urwLinear(36);

    private ScheduledExecutorService executor       = Executors.newSingleThreadScheduledExecutor();

    private AnimationTimer       timer;
    private long                 lastTimerCall;
    private Canvas               bkgCanvas;
    private GraphicsContext      bkgCtx;
    private Canvas               canvas;
    private GraphicsContext      ctx;
    private Image                bkgPatternImg;
    private ImagePattern         bkgPatternFill;
    private Image                borderPatternImg;
    private ImagePattern         borderPatternFill;
    private Image                topPartImg;
    private Image                ulCornerImg;
    private Image                urCornerImg;
    private Image                pipeImg;
    private ImagePattern         pipePatternFill;
    private Image                paddle_mini_Img;
    private Image                paddle_std_Img;
    private Image                paddle_wide_Img;
    private Image                paddle_gun_Img;
    private Image                ballImg;
    private Image                torpedoImg;
    private Image                grayBlockImg;
    private Image                redBlockImg;
    private Image                yellowBlockImg;
    private Image                blueBlockImg;
    private Image                magentaBlockImg;
    private Image                limeBlockImg;
    //private Image                explosionImg;
    private Ball                 ball;
    private Paddle               paddle;
    private List<Block>          blocks;
    private List<Block>          blocksToCheck;
    private List<Torpedo>        torpedoes;
    private int                  noOfLifes;
    private long                 score;
    private PaddleState          paddleState;


    @Override public void init() {
        paddleState   = PaddleState.STANDARD;

        lastTimerCall = System.nanoTime();
        timer         = new AnimationTimer() {
            @Override public void handle(final long now) {
                if (now > lastTimerCall) {
                    hitTests();
                    updateAndDraw();
                    lastTimerCall = now;
                }
            }
        };

        bkgCanvas     = new Canvas(WIDTH, HEIGHT);
        bkgCtx        = bkgCanvas.getGraphicsContext2D();

        canvas        = new Canvas(WIDTH, HEIGHT);
        ctx           = canvas.getGraphicsContext2D();

        // Load all images
        loadImages();

        bkgPatternFill    = new ImagePattern(bkgPatternImg, 0, 0, 68, 117, false);
        borderPatternFill = new ImagePattern(borderPatternImg, 0, 0, 20, 113, false);
        pipePatternFill   = new ImagePattern(pipeImg, 0, 0, 5, 17, false);

        // Initialize invaders, mothership and ship
        paddle = new Paddle(paddle_std_Img, paddle_wide_Img, paddle_gun_Img);

        ball = new Ball(ballImg, WIDTH * 0.5, HEIGHT - PADDLE_OFFSET_Y - ballImg.getHeight() * 0.5, (RND.nextDouble() * (2 * BALL_SPEED) - BALL_SPEED));

        blocks = new ArrayList<>();
        for (int iy = 0 ; iy < 6 ; iy++) {
            for (int ix = 0 ; ix < 13 ; ix++) {
                final int maxHits = iy == 0 ? 5 : 1;
                Block block;
                switch (iy) {
                    case 0 -> block = new Block(grayBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 1 -> block = new Block(redBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 2 -> block = new Block(yellowBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 3 -> block = new Block(blueBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 4 -> block = new Block(magentaBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 5 -> block = new Block(limeBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    default -> { continue; }
                }
                blocks.add(block);
            }
        }
        blocksToCheck = blocks.stream().sorted((block1, block2) -> block2.bounds.maxY > block1.bounds.maxY ? 1 : -1).collect(Collectors.toList());

        torpedoes  = new ArrayList<>();
        noOfLifes  = 3;
        score      = 0;
    }

    @Override public void start(final Stage stage) {
        StackPane pane = new StackPane(bkgCanvas, canvas);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case RIGHT -> movePaddleRight();
                case LEFT  -> movePaddleLeft();
                case SPACE -> { if (PaddleState.GUN == paddleState) { fire(paddle.x); } }
            }
        });
        scene.setOnKeyReleased(e -> {
            switch(e.getCode()) {
                case RIGHT -> stopPaddle();
                case LEFT  -> stopPaddle();
            }
        });

        stage.setTitle("JArkanoid");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        drawBackground();

        timer.start();
    }

    @Override public void stop() {
        Platform.exit();
    }


    // Helper methods
    private void loadImages() {
        bkgPatternImg    = new Image(getClass().getResourceAsStream("backgroundPattern.png"), 68, 117, true, false);
        borderPatternImg = new Image(getClass().getResourceAsStream("borderPattern.png"), 20, 113, true, false);
        topPartImg       = new Image(getClass().getResourceAsStream("topPart.png"), 64, 23, true, false);
        ulCornerImg      = new Image(getClass().getResourceAsStream("upperLeftCorner.png"), 15, 20, true, false);
        urCornerImg      = new Image(getClass().getResourceAsStream("upperRightCorner.png"), 15, 20, true, false);
        pipeImg          = new Image(getClass().getResourceAsStream("pipe.png"), 5, 17, true, false);
        paddle_mini_Img  = new Image(getClass().getResourceAsStream("paddle_std.png"), 40, 11, true, false);
        paddle_std_Img   = new Image(getClass().getResourceAsStream("paddle_std.png"), 80, 22, true, false);
        paddle_wide_Img  = new Image(getClass().getResourceAsStream("paddle_wide.png"), 121, 22, true, false);
        paddle_gun_Img   = new Image(getClass().getResourceAsStream("paddle_gun.png"), 80, 22, true, false);
        ballImg          = new Image(getClass().getResourceAsStream("ball.png"), 12, 12, true, false);
        torpedoImg       = new Image(getClass().getResourceAsStream("torpedo.png"), 41, 23, true, false);
        grayBlockImg     = new Image(getClass().getResourceAsStream("grayBlock.png"), 38, 20, true, false);
        redBlockImg      = new Image(getClass().getResourceAsStream("redBlock.png"), 38, 20, true, false);
        yellowBlockImg   = new Image(getClass().getResourceAsStream("yellowBlock.png"), 38, 20, true, false);
        blueBlockImg     = new Image(getClass().getResourceAsStream("blueBlock.png"), 38, 20, true, false);
        magentaBlockImg  = new Image(getClass().getResourceAsStream("magentaBlock.png"), 38, 20, true, false);
        limeBlockImg     = new Image(getClass().getResourceAsStream("greenBlock.png"), 38, 20, true, false);
        //explosionImg    = new Image(getClass().getResourceAsStream("explosion.png"), 39, 36, true, false);
    }

    private static String padLeft(final String text, final String filler, final int n) {
        return String.format("%" + n + "s", text).replace(" ", filler);
    }


    // ******************** Game control **************************************
    private void movePaddleRight() {
        paddle.vX = PADDLE_SPEED;
    }

    private void movePaddleLeft() {
        paddle.vX = -PADDLE_SPEED;
    }

    private void stopPaddle() { paddle.vX = 0; }

    private void fire(final double x) {
        if (torpedoes.size() > 0) { return; }
        torpedoes.add(new Torpedo(torpedoImg, x, HEIGHT - 50));
    }


    // Play audio clips
    private void playSound(final AudioClip audioClip) { audioClip.play(); }


    // Re-Init
    private void reinit() {
        lastTimerCall = System.nanoTime();

        // Initialize blocks and paddle
        paddle = new Paddle(paddle_std_Img, paddle_wide_Img, paddle_gun_Img);

        // Initialize ball
        ball = new Ball(ballImg, WIDTH * 0.5, paddle.y, RND.nextDouble() * (BALL_SPEED - 1.0) + 1.0);

        blocks.clear();
        for (int iy = 0 ; iy < 6 ; iy++) {
            for (int ix = 0 ; ix < 13 ; ix++) {
                final int maxHits = iy == 0 ? 5 : 1;
                Block block;
                switch (iy) {
                    case 0 -> block = new Block(grayBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 1 -> block = new Block(redBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 2 -> block = new Block(yellowBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 3 -> block = new Block(blueBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 4 -> block = new Block(magentaBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    case 5 -> block = new Block(limeBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10, maxHits);
                    default -> { continue; }
                }
                blocks.add(block);
            }
        }
        torpedoes.clear();
        noOfLifes = 3;
    }

    // Re-Spawn Ball
    private void respawnBall() {
        ball = new Ball(ballImg, paddle.bounds.centerX, HEIGHT - PADDLE_OFFSET_Y - ballImg.getHeight() * 0.5, (RND.nextDouble() * (2 * BALL_SPEED) - BALL_SPEED));
    }

    // Game Over
    private void gameOver() {
        System.exit(0);
    }


    // ******************** HitTests ******************************************
    private void hitTests() {
        // Sort list of blocks by maxY
        blocksToCheck.clear();
        blocksToCheck.addAll(blocks.stream().sorted((block1, block2) -> block2.bounds.maxY > block1.bounds.maxY ? 1 : -1).collect(Collectors.toList()));

        for (Block block : blocksToCheck) {
            if (PaddleState.GUN == paddleState) {
                for (Torpedo torpedo : torpedoes) {
                    // Torpedo - Block
                    if (torpedo.bounds.maxX > block.bounds.minX && torpedo.bounds.minX < block.bounds.maxX && torpedo.bounds.maxY > block.bounds.minY && torpedo.bounds.minY < block.bounds.maxY) {
                        block.hits++;
                        if (block.hits == block.maxHits) {
                            block.toBeRemoved = true;
                            score += block.value;
                        }
                        torpedo.toBeRemoved = true;
                        //playSound(explosionSnd);
                        break;
                    }
                }
            }
            // Ball - Block
            if(ball.bounds.maxX > block.bounds.minX && ball.bounds.minX < block.bounds.maxX && ball.bounds.maxY > block.bounds.minY && ball.bounds.minY < block.bounds.maxY) {
                block.hits++;
                if (block.hits == block.maxHits) {
                    score += block.value;
                    block.toBeRemoved = true;
                }
                ball.vY = -ball.vY;
                break;
            }
        }

        // Ball - Paddle
        if(ball.bounds.maxX > paddle.bounds.minX && ball.bounds.minX < paddle.bounds.maxX && ball.bounds.maxY > paddle.bounds.minY && ball.bounds.minY < paddle.bounds.maxY) {
            ball.vY = -ball.vY;
        }
    }


    // ******************** Redraw ********************************************
    private void drawBackground() {
        bkgCtx.clearRect(0, 0, WIDTH, HEIGHT);
        bkgCtx.setFill(Color.BLACK);
        bkgCtx.fillRect(0, 0, WIDTH, HEIGHT);
        bkgCtx.setFill(bkgPatternFill);
        bkgCtx.fillRect(0, UPPER_INSET, WIDTH, HEIGHT);

        bkgCtx.save();
        bkgCtx.setEffect(DROP_SHADOW);

        bkgCtx.save();
        bkgCtx.setFill(pipePatternFill);
        bkgCtx.fillRect(17, 68, WIDTH - 34, 17);
        bkgCtx.setFill(borderPatternFill);
        bkgCtx.fillRect(0, UPPER_INSET, 20, HEIGHT);
        bkgCtx.fillRect(WIDTH - 20, UPPER_INSET, 20, HEIGHT);
        bkgCtx.restore();

        bkgCtx.restore();

        bkgCtx.drawImage(ulCornerImg, 2.5, 67.5);
        bkgCtx.drawImage(urCornerImg, WIDTH - urCornerImg.getWidth() - 2.5, 67.5);
        bkgCtx.drawImage(topPartImg, 100, 65);
        bkgCtx.drawImage(topPartImg, WIDTH - 100 - topPartImg.getWidth(), 65);
    }

    private void updateAndDraw() {
        ctx.clearRect(0, 0, WIDTH, HEIGHT);

        // Draw Torpedos
        for (Torpedo torpedo : torpedoes) {
            torpedo.update();
            ctx.drawImage(torpedo.image, torpedo.bounds.x, torpedo.bounds.y);
        }

        ctx.save();
        ctx.setEffect(DROP_SHADOW);

        // Draw blocks
        ctx.setStroke(Color.TRANSPARENT);
        blocks.forEach(block -> ctx.drawImage(block.image, block.x, block.y));

        // Draw ball
        ball.update();
        ctx.drawImage(ballImg, ball.bounds.x, ball.bounds.y);

        // Draw paddle
        if (noOfLifes > 0) {
            paddle.update();
            switch (paddleState) {
                case STANDARD -> ctx.drawImage(paddle_std_Img, paddle.bounds.x, paddle.bounds.y);
                case WIDE     -> ctx.drawImage(paddle_wide_Img, paddle.bounds.x, paddle.bounds.y);
                case GUN      -> ctx.drawImage(paddle_gun_Img, paddle.bounds.x, paddle.bounds.y);
            }
        }

        // Draw score
        ctx.setFill(Color.LIGHTGRAY);
        ctx.setFont(SCORE_FONT);
        ctx.setTextAlign(TextAlignment.RIGHT);
        ctx.setTextBaseline(VPos.TOP);
        ctx.fillText(padLeft(Long.toString(score), "0", 4), 140, 20);

        // Draw no of lifes
        switch(noOfLifes) {
            case 3 -> {
                ctx.drawImage(paddle_mini_Img, 24, HEIGHT - 30);
                ctx.drawImage(paddle_mini_Img, 66, HEIGHT - 30);
            }
            case 2 -> { ctx.drawImage(paddle_mini_Img, 24, HEIGHT - 30); }
        }

        ctx.restore();

        // Remove sprites
        blocks.removeIf(block -> block.toBeRemoved);
        torpedoes.removeIf(torpedo -> torpedo.toBeRemoved);
    }


    // ******************** Inner Classes *************************************
    private abstract class Sprite {
        public Image     image;
        public Bounds    bounds;
        public double    x; // Center of Sprite in x-direction
        public double    y; // Center of Sprite in y-direction
        public double    r;
        public double    vX;
        public double    vY;
        public double    vR;
        public double    width;
        public double    height;
        public double    size;
        public double    radius;
        public boolean   toBeRemoved;


        public Sprite() {
            this(null, 0, 0, 0, 0, 0, 0);
        }
        public Sprite(final Image image) {
            this(image, 0, 0, 0, 0, 0, 0);
        }
        public Sprite(final Image image, final double x, final double y) {
            this(image, x, y, 0, 0, 0, 0);
        }
        public Sprite(final Image image, final double x, final double y, final double vX, final double vY) {
            this(image, x, y, 0, vX, vY, 0);
        }
        public Sprite(final Image image, final double x, final double y, final double r, final double vX, final double vY) {
            this(image, x, y, r, vX, vY, 0);
        }
        public Sprite(final Image image, final double x, final double y, final double r, final double vX, final double vY, final double vR) {
            this.image       = image;
            this.x           = x;
            this.y           = y;
            this.r           = r;
            this.vX          = vX;
            this.vY          = vY;
            this.vR          = vR;
            this.width       = null == image ? 0 : image.getWidth();
            this.height      = null == image ? 0 : image.getHeight();
            this.size        = this.width > this.height ? width : height;
            this.radius      = this.size * 0.5;
            this.toBeRemoved = false;
            this.bounds      = null == image ? new Bounds(0, 0, 0, 0) : new Bounds(x - image.getWidth() * 0.5, y - image.getHeight() * 0.5, image.getWidth(), image.getHeight());
        }


        protected void init() {}

        public void respawn() {}

        public abstract void update();
    }

    public abstract class AnimatedSprite extends Sprite {
        protected final int    maxFrameX;
        protected final int    maxFrameY;
        protected       double scale;
        protected       int    countX;
        protected       int    countY;


        public AnimatedSprite(final int maxFrameX, final int maxFrameY, final double scale) {
            this(0, 0, 0, 0, 0, 0, maxFrameX, maxFrameY, scale);
        }
        public AnimatedSprite(final double x, final double y, final double vX, final double vY, final int maxFrameX, final int maxFrameY, final double scale) {
            this(x, y, 0, vX, vY, 0, maxFrameX, maxFrameY, scale);
        }
        public AnimatedSprite(final double x, final double y, final double r, final double vX, final double vY, final double vR, final int maxFrameX, final int maxFrameY, final double scale) {
            super(null, x, y, r, vX, vY, vR);
            this.maxFrameX = maxFrameX;
            this.maxFrameY = maxFrameY;
            this.scale     = scale;
            this.countX    = 0;
            this.countY    = 0;
        }


        @Override public void update() {
            x += vX;
            y += vY;

            countX++;
            if (countX == maxFrameX) {
                countY++;
                if (countX == maxFrameX && countY == maxFrameY) {
                    toBeRemoved = true;
                }
                countX = 0;
                if (countY == maxFrameY) {
                    countY = 0;
                }
            }
        }
    }

    private class Paddle extends Sprite {
        public Image       wideImage;
        public Image       gunImage;


        public Paddle(final Image image, final Image wideImage, final Image gunImage) {
            super(image);
            this.wideImage    = wideImage;
            this.gunImage     = gunImage;
            this.bounds.width = paddleState.width;
            init();
        }


        @Override protected void init() {
            this.x             = WIDTH * 0.5;
            this.y             = HEIGHT - PADDLE_OFFSET_Y;
            this.width         = paddleState.width;
            this.height        = image.getHeight();
            this.size          = height;
            this.radius        = size * 0.5;
            this.vX            = 0;
            this.vY            = 0;
            this.bounds.set(this.x - paddleState.width * 0.5, this.y - this.height * 0.5, paddleState.width, this.height);
        }

        @Override public void respawn() {
            this.x  = WIDTH * 0.5;
            this.bounds.set(this.x - paddleState.width * 0.5, this.y - this.height * 0.5, paddleState.width, this.height);
            this.vX = 0;
            this.vY = 0;
        }

        @Override public void update() {
            x += vX;
            if (x + paddleState.width * 0.5 > WIDTH - INSET) {
                x = WIDTH - INSET - paddleState.width * 0.5;
            }
            if (x - paddleState.width * 0.5 < INSET) {
                x = INSET + paddleState.width * 0.5;
            }
            this.bounds.set(this.x - paddleState.width * 0.5, this.y - this.height * 0.5, paddleState.width, this.height);
        }
    }

    private class Block extends Sprite {
        public       int     value;
        public       int     hits;
        public final int     maxHits;
        public       boolean toBeRemoved;


        public Block(final Image image, final double x, final double y, final int value, final int maxHits) {
            super(image);
            this.x             = x;
            this.y             = y;
            this.value         = value;
            this.maxHits       = maxHits;
            this.toBeRemoved   = false;
            this.hits          = 0;
            this.width         = BLOCK_WIDTH;
            this.height        = BLOCK_HEIGHT;
            this.bounds.set(x, y, width, height);
            init();
        }


        @Override protected void init() {
            size   = width > height ? width : height;
            radius = size * 0.5;

            // Velocity
            vX = 0;
            vY = 0;
        }

        @Override public void update() { }
    }

    private class Ball extends Sprite {

        public Ball(final Image image, final double x, final double y, final double vX) {
            super(image, x, y - image.getHeight(), 0, BALL_SPEED);
            this.vX = vX;
            this.vY = -BALL_SPEED;
        }

        @Override public void update() {
            this.x += this.vX;
            this.y += this.vY;

            if (bounds.maxX > WIDTH - INSET) {
                this.x  = WIDTH - INSET - this.width * 0.5;
                this.vX = -BALL_SPEED;
            }
            if (bounds.minX < INSET) {
                this.x  = INSET + this.width * 0.5;
                this.vX = BALL_SPEED;
            }
            if (bounds.minY < UPPER_INSET) {
                this.y  = UPPER_INSET + this.radius;
                this.vY = BALL_SPEED;
            }

            this.bounds.set(this.x - this.width * 0.5, this.y - this.height * 0.5, this.width, this.height);

            if (this.y > HEIGHT && !toBeRemoved) {
                toBeRemoved = true;
                noOfLifes -= 1;
                if (noOfLifes == 0) { gameOver(); }
                executor.schedule(() -> respawnBall(), 2, TimeUnit.SECONDS);
                return;
            }

            this.vX = Helper.clamp(-BALL_SPEED, BALL_SPEED, this.vX);
            this.vY = Helper.clamp(-BALL_SPEED, BALL_SPEED, this.vY);
        }
    }

    private class Torpedo extends Sprite {

        public Torpedo(final Image image, final double x, final double y) {
            super(image, x, y - image.getHeight(), 0, TORPEDO_SPEED);
        }

        @Override public void update() {
            y -= vY;
            this.bounds.set(this.x - this.width * 0.5, this.y - this.height * 0.5, this.width, this.height);
            if (y < -size) {
                toBeRemoved = true;
            }
        }
    }

    private class Explosion extends Sprite {
        public Explosion(final Image image, final double x, final double y) {
            super(image, x, y - image.getHeight(), 0, 0);
        }

        @Override public void update() {
            y -= vY;
            if (y < -size) {
                toBeRemoved = true;
            }
        }
    }

    public class Bounds {
        public double x;
        public double y;
        public double width;
        public double height;
        public double minX;
        public double minY;
        public double maxX;
        public double maxY;
        public double centerX;
        public double centerY;



        // ******************** Constructors **************************************
        public Bounds() {
            this(0, 0, 0, 0);
        }
        public Bounds(final double width, final double height) {
            this(0, 0, width, height);
        }
        public Bounds(final double x, final double y, final double width, final double height) {
            set(x, y, width, height);
        }


        // ******************** Methods *******************************************
        public void set(final Bounds bounds) {
            set(bounds.x, bounds.y, bounds.width, bounds.height);
        }
        public void set(final double x, final double y, final double width, final double height) {
            this.x       = x;
            this.y       = y;
            this.width   = width;
            this.height  = height;
            this.minX    = x;
            this.minY    = y;
            this.maxX    = x + width;
            this.maxY    = y + height;
            this.centerX = x + width * 0.5;
            this.centerY = y + height * 0.5;
        }

        public boolean contains(final double x, final double y) {
            return (Double.compare(x, minX) >= 0 && Double.compare(x, maxX) <= 0 && Double.compare(y, minY) >= 0 && Double.compare(y, maxY) <= 0);
        }

        public boolean intersects(final Bounds other) {
            return (other.maxX >= minX && other.maxY >= minY && other.minX <= maxX && other.minY <= maxY);
        }
        public boolean intersects(final double x, final double y, final double width, final double height) {
            return (x + width >= minX && y + height >= minY && x <= maxX && y <= maxY);
        }
    }


    // ******************** Start *********************************************
    public static void main(String[] args) {
        launch(args);
    }
}