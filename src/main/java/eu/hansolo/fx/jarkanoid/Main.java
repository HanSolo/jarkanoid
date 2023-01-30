package eu.hansolo.fx.jarkanoid;

import eu.hansolo.toolbox.Helper;
import eu.hansolo.toolboxfx.geom.Rectangle;
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
import java.util.List;
import java.util.Optional;
import java.util.Random;


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

    private static final Random      RND            = new Random();
    private static final double      WIDTH          = 560;
    private static final double      HEIGHT         = 740;
    private static final double      INSET          = 22;
    private static final double      PADDLE_SPEED   = 8;
    private static final double      TORPEDO_SPEED  = 12;
    private static final double      BALL_SPEED     = 5;
    private static final double      MAX_BALL_SPEED = 10;
    private static final double      BLOCK_WIDTH    = 38;
    private static final double      BLOCK_HEIGHT   = 20;
    private static final double      BLOCK_STEP_X   = 40;
    private static final double      BLOCK_STEP_Y   = 22;
    private static final Color[]     BLOCK_COLORS   = { Color.GRAY, Color.RED, Color.YELLOW, Color.BLUE, Color.MAGENTA, Color.LIME };
    private static final InnerShadow BLOCK_SHADOW   = new InnerShadow(BlurType.TWO_PASS_BOX, Color.rgb(0, 0, 0, 0.65), 1, 0.0, 0, 0);
    private static final DropShadow  DROP_SHADOW    = new DropShadow(BlurType.TWO_PASS_BOX, Color.rgb(0, 0, 0, 0.65), 5, 0.0, 10, 10);
    private static final Font        SCORE_FONT     = Fonts.urwLinear(36);

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
    //private Image                explosionImg;
    private Ball                 ball;
    private Paddle               paddle;
    private List<Block>          blocks;
    private List<Torpedo>        torpedoes;
    private int                  noOfLifes;
    private long                 score;
    private PaddleState          paddleState;


    @Override public void init() {
        paddleState   = PaddleState.GUN;

        lastTimerCall = System.nanoTime();
        timer         = new AnimationTimer() {
            @Override public void handle(final long now) {
                if (now > lastTimerCall) {
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

        ball = new Ball(ballImg, WIDTH * 0.5, paddle.y, RND.nextDouble() * (BALL_SPEED - 1.0) + 1.0);

        blocks = new ArrayList<>();
        for (int iy = 0 ; iy < 6 ; iy++) {
            for (int ix = 0 ; ix < 13 ; ix++) {
                Block block = new Block(BLOCK_COLORS[iy], INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10);
                blocks.add(block);
            }
        }
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
                case SPACE -> fire(paddle.x);
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
        //explosionImg    = new Image(getClass().getResourceAsStream("explosion.png"), 39, 36, true, false);
    }

    private static String padLeft(final String text, final String filler, final int n) {
        return String.format("%" + n + "s", text).replace(" ", filler);
    }

    // Hit test
    private static Optional<Block> isBlockHit(final List<Block> blocks, final Rectangle bounds) {
        return blocks.parallelStream().filter(block -> collisionCheck(bounds, block.bounds)).findFirst();
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
                Block block = new Block(BLOCK_COLORS[iy], INSET + ix * BLOCK_STEP_X, INSET + 155 + iy * BLOCK_STEP_Y, 70 - iy * 10);
                blocks.add(block);
            }
        }
        torpedoes.clear();
        noOfLifes = 3;
    }

    // Re-Spawn Ball
    private void respawnBall() {
        ball = new Ball(ballImg, WIDTH * 0.5, paddle.y, RND.nextDouble() * (BALL_SPEED - 1.0) + 1.0);
    }

    // Game Over
    private void gameOver() {
        System.exit(0);
    }

    // Rectangle - Rectangle collision
    private static boolean collisionCheck(final Rectangle rect1, final Rectangle rect2) {
        return rectRectCollision(rect1.x, rect1.y, rect1.width, rect1.height, rect2.x, rect2.y, rect2.width, rect2.height);
    }
    private static boolean rectRectCollision(final double r1x, final double r1y, final double r1w, final double r1h, final double r2x, final double r2y, final double r2w, final double r2h) {
        return (r1x + r1w >= r2x &&    // r1 right edge past r2 left
                r1x <= r2x + r2w &&    // r1 left edge past r2 right
                r1y + r1h >= r2y &&    // r1 top edge past r2 bottom
                r1y <= r2y + r2h);     // r1 bottom edge past r2 top
    }

    // Border check
    private static boolean borderCheck(final Rectangle rect1, final Rectangle rect2) {
        if (rect1.x < rect2.x &&
            rect1.x + rect1.width > rect1.x &&
            rect1.y + rect1.height > rect2.y) { return true; }
        if (rect1.x + rect1.width > rect2.x + rect2.width &&
            rect1.x < rect2.x + rect2.width &&
            rect1.y + rect1.height > rect2.y) { return true; }
        return false;
    }

    // ******************** Redraw ********************************************
    private void drawBackground() {
        bkgCtx.clearRect(0, 0, WIDTH, HEIGHT);
        bkgCtx.setFill(Color.BLACK);
        bkgCtx.fillRect(0, 0, WIDTH, HEIGHT);
        bkgCtx.setFill(bkgPatternFill);
        bkgCtx.fillRect(0, 85, WIDTH, HEIGHT);

        bkgCtx.save();
        bkgCtx.setEffect(DROP_SHADOW);

        bkgCtx.save();
        bkgCtx.setFill(pipePatternFill);
        bkgCtx.fillRect(17, 68, WIDTH - 34, 17);
        bkgCtx.setFill(borderPatternFill);
        bkgCtx.fillRect(0, 85, 20, HEIGHT);
        bkgCtx.fillRect(WIDTH - 20, 85, 20, HEIGHT);
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
        blocks.forEach(block -> {
            // Draw block
            ctx.setFill(block.color);
            ctx.fillRect(block.x, block.y, block.width, block.height);
        });

        // Check for torpedo hits
        for (Torpedo torpedo : torpedoes) {
            Optional<Block> optionalBlock = isBlockHit(blocks, torpedo.bounds);
            if (optionalBlock.isPresent()) {
                Block block = optionalBlock.get();
                score += block.value;
                block.toBeRemoved   = true;
                torpedo.toBeRemoved = true;
                //playSound(explosionSnd);
            }
        }

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
        public Rectangle bounds;
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
            this.bounds      = null == image ? new Rectangle(0, 0, 0, 0) : new Rectangle(x - image.getWidth() * 0.5, y - image.getHeight() * 0.5, image.getWidth(), image.getHeight());
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
            this.y             = HEIGHT - 68;
            this.width         = paddleState.width;
            this.height        = image.getHeight();
            this.size          = height;
            this.radius        = size * 0.5;
            this.vX            = 0;
            this.vY            = 0;
            this.bounds.x      = x;
            this.bounds.y      = y;
        }

        @Override public void respawn() {
            this.x  = WIDTH * 0.5;
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
            bounds.x = x - paddleState.width * 0.5;
        }
    }

    private class Block extends Sprite {
        public int     value;
        public Color   color;
        public long    lastShot;
        public boolean toBeRemoved;


        public Block(final Color color, final double x, final double y, final int value) {
            super(null);
            this.toBeRemoved   = false;
            this.x             = x;
            this.y             = y;
            this.value         = value;
            this.color         = color;
            this.width         = BLOCK_WIDTH;
            this.height        = BLOCK_HEIGHT;
            this.bounds.x      = x;
            this.bounds.y      = y;
            this.bounds.width  = width;
            this.bounds.height = height;
            init();
        }


        @Override protected void init() {
            size   = width > height ? width : height;
            radius = size * 0.5;

            // Velocity
            vX = 0;
            vY = 0;
        }

        @Override public void update() {
            if (toBeRemoved) { return; }
            //x += vX;
            //y += vY;
        }
    }

    private class Ball extends Sprite {

        public Ball(final Image image, final double x, final double y, final double vX) {
            super(image, x, y - image.getHeight(), 0, BALL_SPEED);
            this.vX = vX;
            this.vY = -BALL_SPEED;
        }

        @Override public void update() {
            x += vX;
            y += vY;

            if (x + width * 0.5 > WIDTH - INSET) {
                x  = WIDTH - INSET - width * 0.5;
                vX = -BALL_SPEED;
            }
            if (x - width * 0.5 < INSET) {
                x  = INSET + width * 0.5;
                vX = BALL_SPEED;
            }
            if (y - height * 0.5 < INSET) {
                y  = INSET + height * 0.5;
                vY = BALL_SPEED;
            }

            this.bounds.x = x - width * 0.5;
            this.bounds.y = y - height * 0.5;

            if (y > HEIGHT) {
                toBeRemoved = true;
                noOfLifes -= 1;
                if (noOfLifes == 0) { gameOver(); }
                respawnBall();
                return;
            }

            // Check for block hit
            Optional<Block> optionalBlock = isBlockHit(blocks, bounds);
            if (optionalBlock.isPresent()) {
                Block block = optionalBlock.get();
                score += block.value;
                block.toBeRemoved = true;
                vY = -vY;
            }

            // Check for paddle hit
            if (collisionCheck(bounds, paddle.bounds)) { vY = -vY; }
            if (borderCheck(bounds, paddle.bounds)) { vX = -vX; }

            vX = Helper.clamp(-BALL_SPEED, BALL_SPEED, vX);
            vY = Helper.clamp(-BALL_SPEED, BALL_SPEED, vY);
        }
    }

    private class Torpedo extends Sprite {

        public Torpedo(final Image image, final double x, final double y) {
            super(image, x, y - image.getHeight(), 0, TORPEDO_SPEED);
        }

        @Override public void update() {
            y -= vY;
            bounds.y = y - height * 0.5;
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


    // ******************** Start *********************************************
    public static void main(String[] args) {
        launch(args);
    }
}