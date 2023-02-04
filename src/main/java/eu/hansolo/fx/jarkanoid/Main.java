package eu.hansolo.fx.jarkanoid;

import eu.hansolo.fx.jarkanoid.Constants.BlockType;
import eu.hansolo.toolbox.Helper;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
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
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


public class Main extends Application {
    private enum PaddleState {
        STANDARD(80, 22),
        WIDE(121, 22),
        GUN(80, 22);

        public final double width;
        public final double height;

        PaddleState(final double width, final double height) {
            this.width  = width;
            this.height = height;
        }
    }
    private enum BonusType {
        NONE,
        ONE_UP,
        WIDE,
        GUN
    }

    private static final Random      RND             = new Random();
    private static final double      WIDTH           = 560;
    private static final double      HEIGHT          = 740;
    private static final double      INSET           = 22;
    private static final double      UPPER_INSET     = 85;
    private static final double      PADDLE_OFFSET_Y = 68;
    private static final double      PADDLE_SPEED    = 8;
    private static final double      TORPEDO_SPEED   = 12;
    private static final double      BALL_SPEED      = 2;
    private static final double      BLOCK_WIDTH     = 38;
    private static final double      BLOCK_HEIGHT    = 20;
    private static final double      BLOCK_STEP_X    = 40;
    private static final double      BLOCK_STEP_Y    = 22;
    private static final DropShadow  DROP_SHADOW     = new DropShadow(BlurType.TWO_PASS_BOX, Color.rgb(0, 0, 0, 0.65), 5, 0.0, 10, 10);
    private static final Font        SCORE_FONT      = Fonts.emulogic(20);
    private static final Color       HIGH_SCORE_RED  = Color.rgb(229, 2, 1);
    private static final Color       SCORE_WHITE     = Color.WHITE;
    private static final Color       TEXT_GRAY       = Color.rgb(216, 216, 216);

    private ScheduledExecutorService executor        = Executors.newSingleThreadScheduledExecutor();

    private boolean              running;
    private AnimationTimer       timer;
    private long                 lastTimerCall;
    private long                 lastAnimCall;
    private Canvas               bkgCanvas;
    private GraphicsContext      bkgCtx;
    private Canvas               canvas;
    private GraphicsContext      ctx;
    private Image                logoImg;
    private Image                copyrightImg;
    private Image                bkgPatternImg;
    private ImagePattern         bkgPatternFill;
    private Image                borderPatternImg;
    private ImagePattern         borderPatternFill;
    private Image                topPartImg;
    private Image                ulCornerImg;
    private Image                urCornerImg;
    private Image                pipeImg;
    private ImagePattern         pipePatternFill;
    private Image                paddleMiniImg;
    private Image                paddleStdShadowImg;
    private Image                paddleWideShadowImg;
    private Image                paddleGunShadowImg;
    private Image                paddleWideImg;
    private Image                paddleGunImg;
    private Image                paddleMapStdImg;
    private Image                blinkMapImg;
    private Image                ballImg;
    private Image                ballShadowImg;
    private Image                torpedoImg;
    private Image                goldBlockImg;
    private Image                grayBlockImg;
    private Image                whiteBlockImg;
    private Image                orangeBlockImg;
    private Image                cyanBlockImg;
    private Image                limeBlockImg;
    private Image                redBlockImg;
    private Image                blueBlockImg;
    private Image                magentaBlockImg;
    private Image                yellowBlockImg;
    private Image                blockShadowImg;
    //private Image                explosionImg;
    private AudioClip            startLevelSnd;
    private AudioClip            ballPaddleSnd;
    private AudioClip            ballBlockSnd;
    private AudioClip            ballHardBlockSnd;
    private AudioClip            gunSnd;
    private Ball                 ball;
    private Paddle               paddle;
    private List<Block>          blocks;
    private List<Block>          blocksToCheck;
    private List<Torpedo>        torpedoes;
    private int                  noOfLifes;
    private long                 score;
    private PaddleState          paddleState;
    private long                 highscore;
    private int                  level;
    private int                  animateInc;
    private List<Blink>          blinks;


    @Override public void init() {
        running     = false;
        paddleState = PaddleState.STANDARD;
        highscore     = PropertyManager.INSTANCE.getLong(Constants.HIGHSCORE, 0);
        level         = 1;
        blinks        = new ArrayList<>();

        lastTimerCall = System.nanoTime();
        lastAnimCall  = System.nanoTime();
        timer         = new AnimationTimer() {
            @Override public void handle(final long now) {
                // Animation of paddle glow
                if (now > lastAnimCall + 5_000_000) {
                    animateInc++;
                    blinks.forEach(blink -> blink.update());
                    lastAnimCall = now;
                }
                // Main loop
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

        // Load all sounds
        loadSounds();

        bkgPatternFill    = new ImagePattern(bkgPatternImg, 0, 0, 68, 117, false);
        borderPatternFill = new ImagePattern(borderPatternImg, 0, 0, 20, 113, false);
        pipePatternFill   = new ImagePattern(pipeImg, 0, 0, 5, 17, false);

        // Initialize paddles
        paddle = new Paddle();

        // Initialize level
        blocks    = new ArrayList<>();
        torpedoes = new ArrayList<>();
        noOfLifes = 3;
        score     = 0;
    }

    @Override public void start(final Stage stage) {
        StackPane pane = new StackPane(bkgCanvas, canvas);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        scene.setOnKeyPressed(e -> {
            if (running) {
                switch (e.getCode()) {
                    case RIGHT -> movePaddleRight();
                    case LEFT  -> movePaddleLeft();
                    case SPACE -> {
                        if (ball.active) {
                            if (PaddleState.GUN == paddleState) { fire(paddle.x); }
                        } else {
                            ball.active = true;
                        }
                    }
                }
            } else {
                level = 1;
                startLevel(level);
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

        startScreen();
    }

    @Override public void stop() {
        Platform.exit();
        System.exit(0);
    }


    // Helper methods
    private void loadImages() {
        logoImg                = new Image(getClass().getResourceAsStream("jarkanoid_logo.png"), 460, 118, true, false);
        copyrightImg           = new Image(getClass().getResourceAsStream("copyright.png"), 458, 115, true, false);
        bkgPatternImg          = new Image(getClass().getResourceAsStream("backgroundPattern.png"), 68, 117, true, false);
        borderPatternImg       = new Image(getClass().getResourceAsStream("borderPattern.png"), 20, 113, true, false);
        topPartImg             = new Image(getClass().getResourceAsStream("topPart.png"), 64, 23, true, false);
        ulCornerImg            = new Image(getClass().getResourceAsStream("upperLeftCorner.png"), 15, 20, true, false);
        urCornerImg            = new Image(getClass().getResourceAsStream("upperRightCorner.png"), 15, 20, true, false);
        pipeImg                = new Image(getClass().getResourceAsStream("pipe.png"), 5, 17, true, false);
        paddleMapStdImg        = new Image(getClass().getResourceAsStream("paddlemap_std.png"), 640, 176, false, false);
        blinkMapImg            = new Image(getClass().getResourceAsStream("blink_map.png"), 304, 200, false, false);
        paddleMiniImg          = new Image(getClass().getResourceAsStream("paddle_std.png"), 40, 11, true, false);
        paddleWideImg          = new Image(getClass().getResourceAsStream("paddle_wide.png"), 121, 22, true, false);
        paddleGunImg           = new Image(getClass().getResourceAsStream("paddle_gun.png"), 80, 22, true, false);
        paddleStdShadowImg     = new Image(getClass().getResourceAsStream("paddle_std_shadow.png"), 80, 22, true, false);
        paddleWideShadowImg    = new Image(getClass().getResourceAsStream("paddle_wide_shadow.png"), 121, 22, true, false);
        paddleGunShadowImg     = new Image(getClass().getResourceAsStream("paddle_gun_shadow.png"), 80, 22, true, false);
        ballImg                = new Image(getClass().getResourceAsStream("ball.png"), 12, 12, true, false);
        ballShadowImg          = new Image(getClass().getResourceAsStream("ball_shadow.png"), 12, 12, true, false);
        torpedoImg             = new Image(getClass().getResourceAsStream("torpedo.png"), 41, 23, true, false);
        goldBlockImg           = new Image(getClass().getResourceAsStream("goldBlock.png"), 38, 20, true, false);
        grayBlockImg           = new Image(getClass().getResourceAsStream("grayBlock.png"), 38, 20, true, false);
        whiteBlockImg          = new Image(getClass().getResourceAsStream("whiteBlock.png"), 38, 20, true, false);
        orangeBlockImg         = new Image(getClass().getResourceAsStream("orangeBlock.png"), 38, 20, true, false);
        cyanBlockImg           = new Image(getClass().getResourceAsStream("cyanBlock.png"), 38, 20, true, false);
        limeBlockImg           = new Image(getClass().getResourceAsStream("limeBlock.png"), 38, 20, true, false);
        redBlockImg            = new Image(getClass().getResourceAsStream("redBlock.png"), 38, 20, true, false);
        blueBlockImg           = new Image(getClass().getResourceAsStream("blueBlock.png"), 38, 20, true, false);
        magentaBlockImg        = new Image(getClass().getResourceAsStream("magentaBlock.png"), 38, 20, true, false);
        yellowBlockImg         = new Image(getClass().getResourceAsStream("yellowBlock.png"), 38, 20, true, false);
        blockShadowImg         = new Image(getClass().getResourceAsStream("block_shadow.png"), 38, 20, true, false);
        //explosionImg    = new Image(getClass().getResourceAsStream("explosion.png"), 39, 36, true, false);
    }

    private void loadSounds() {
        startLevelSnd    = new AudioClip(getClass().getResource("Level_Ready.mp3").toExternalForm());
        ballPaddleSnd    = new AudioClip(getClass().getResource("Ball_Paddle.mp3").toExternalForm());
        ballBlockSnd     = new AudioClip(getClass().getResource("Ball_Block.mp3").toExternalForm());
        ballHardBlockSnd = new AudioClip(getClass().getResource("Ball_Hard_Block.mp3").toExternalForm());
        gunSnd           = new AudioClip(getClass().getResource("Gun.mp3").toExternalForm());
    }

    private static String padLeft(final String text, final String filler, final int n) {
        return String.format("%" + n + "s", text).replace(" ", filler);
    }


    // ******************** Game control **************************************
    private void movePaddleRight() { paddle.vX = PADDLE_SPEED; }

    private void movePaddleLeft() { paddle.vX = -PADDLE_SPEED; }

    private void stopPaddle() { paddle.vX = 0; }

    private void fire(final double x) {
        if (torpedoes.size() > 0) { return; }
        torpedoes.add(new Torpedo(torpedoImg, x, HEIGHT - 50));
    }


    // Play audio clips
    private void playSound(final AudioClip audioClip) { audioClip.play(); }


    // Restart
    private void restart() {
        lastTimerCall = System.nanoTime();

        // Initialize blocks and paddle
        paddle = new Paddle();

        // Initialize ball
        ball = new Ball(ballImg, WIDTH * 0.5, paddle.bounds.y, RND.nextDouble() * (BALL_SPEED - 1.0) + 1.0);

        setupBlocks(1);

        torpedoes.clear();
        noOfLifes = 3;
    }

    // Re-Spawn Ball
    private void spawnBall() {
        ball = new Ball(ballImg, paddle.bounds.centerX, paddle.bounds.y, (RND.nextDouble() * (2 * BALL_SPEED) - BALL_SPEED));
    }

    // Start Screen
    private void startScreen() {
        ctx.clearRect(0, 0, WIDTH, HEIGHT);
        drawBackground(1);
    }

    // Start Level
    private void startLevel(final int level) {
        playSound(startLevelSnd);
        setupBlocks(level);
        if (!running) {
            running = true;
            timer.start();
        }
        drawBackground(level);
        executor.schedule(() -> spawnBall(), 1, TimeUnit.SECONDS);
    }

    // Game Over
    private void gameOver() {
        updateAndDraw();

        if (score > highscore) {
            PropertyManager.INSTANCE.setLong(Constants.HIGHSCORE, score);
            highscore = score;
        }
        PropertyManager.INSTANCE.storeProperties();
        score = 0;

        timer.stop();
        running = false;
        executor.schedule(() -> startScreen(), 5, TimeUnit.SECONDS);
    }

    private void setupBlocks(final int level) {
        blocks.clear();
        BlockType[][] level2 = Constants.LEVEL_MAP.get(level);
        for (int iy = 0 ; iy < level2.length ; iy++) {
            for (int ix = 0 ; ix < level2[iy].length ; ix++) {
                Block block;
                BlockType blockType = level2[iy][ix];
                switch (blockType) {
                    case GOLD    -> block = new Block(goldBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 0, blockType.maxHits, BonusType.NONE);
                    case GRAY    -> block = new Block(grayBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 20, blockType.maxHits, BonusType.NONE);
                    case WHITE   -> block = new Block(whiteBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case ORANGE  -> block = new Block(orangeBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case CYAN    -> block = new Block(cyanBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case LIME    -> block = new Block(limeBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case RED     -> block = new Block(redBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case BLUE    -> block = new Block(blueBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case MAGENTA -> block = new Block(magentaBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    case YELLOW  -> block = new Block(yellowBlockImg, INSET + ix * BLOCK_STEP_X, INSET + 110 + iy * BLOCK_STEP_Y, 10, blockType.maxHits, BonusType.NONE);
                    default      -> block = null;
                }
                if (null == block) { continue; }
                blocks.add(block);
            }
        }
        blocksToCheck = blocks.stream().sorted((block1, block2) -> block2.bounds.maxY > block1.bounds.maxY ? 1 : -1).collect(Collectors.toList());
    }


    // ******************** HitTests ******************************************
    private void hitTests() {
        if (null == ball) { return; }
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
                if (block.maxHits > 0) { // Blocks (Gold) that will never be removed have maxHits = -1
                    if (block.hits == block.maxHits) {
                        score += block.value;
                        block.toBeRemoved = true;
                        playSound(ballBlockSnd);
                    } else {
                        playSound(ballHardBlockSnd);
                        blinks.add(new Blink(block.bounds.minX, block.bounds.minY));
                    }
                } else {
                    playSound(ballHardBlockSnd);
                    blinks.add(new Blink(block.bounds.minX, block.bounds.minY));
                }
                ball.vY = -ball.vY;
                break;
            }
        }

        //TODO: change ball angle if ball hits paddle on the sides and only check from incoming side
        // Ball - Paddle
        if(ball.bounds.maxX > paddle.bounds.minX && ball.bounds.minX < paddle.bounds.maxX && ball.bounds.maxY > paddle.bounds.minY && ball.bounds.minY < paddle.bounds.maxY) {
            ball.vY = -ball.vY;
            playSound(ballPaddleSnd);
        }
    }


    // ******************** Redraw ********************************************
    private void drawBackground(final int level) {
        bkgCtx.clearRect(0, 0, WIDTH, HEIGHT);
        bkgCtx.setFill(Color.BLACK);
        bkgCtx.fillRect(0, 0, WIDTH, HEIGHT);

        if (running) {
            // Use background pattern related to level
            switch (level) {
                default -> bkgCtx.setFill(bkgPatternFill);
            }

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
        } else {
            ctx.setFont(SCORE_FONT);
            ctx.setTextBaseline(VPos.TOP);
            ctx.setFill(HIGH_SCORE_RED);
            ctx.setTextAlign(TextAlignment.CENTER);
            ctx.fillText("HIGH SCORE", WIDTH * 0.5, 0);
            ctx.setFill(SCORE_WHITE);
            ctx.fillText(Long.toString(highscore), WIDTH * 0.5, 30);

            bkgCtx.drawImage(logoImg, (WIDTH - logoImg.getWidth()) * 0.5, HEIGHT * 0.25);

            bkgCtx.drawImage(copyrightImg, (WIDTH - copyrightImg.getWidth()) * 0.5, HEIGHT * 0.75);
        }
    }

    private void updateAndDraw() {
        ctx.clearRect(0, 0, WIDTH, HEIGHT);

        // Draw Torpedos
        for (Torpedo torpedo : torpedoes) {
            torpedo.update();
            ctx.drawImage(torpedo.image, torpedo.bounds.x, torpedo.bounds.y);
        }

        // Draw shadows
        ctx.save();
        ctx.translate(10, 10);
        // Draw block shadows
        blocks.forEach(block -> ctx.drawImage(blockShadowImg, block.x, block.y));
        // Draw paddle shadow
        if (noOfLifes > 0) {
            switch (paddleState) {
                case STANDARD -> ctx.drawImage(paddleStdShadowImg, paddle.bounds.minX, paddle.bounds.minY);
                case WIDE -> ctx.drawImage(paddleWideShadowImg, paddle.bounds.minX, paddle.bounds.minY);
                case GUN -> ctx.drawImage(paddleGunShadowImg, paddle.bounds.minX, paddle.bounds.minY);
            }
        }
        // Draw ball shadow
        if (null != ball) {
            ctx.drawImage(ballShadowImg, ball.bounds.minX, ball.bounds.minY);
        }
        ctx.restore();

        // Draw blocks
        blocks.forEach(block -> ctx.drawImage(block.image, block.x, block.y));

        // Draw blinks
        blinks.forEach(blink -> ctx.drawImage(blinkMapImg, blink.countX * BLOCK_WIDTH, blink.countY * BLOCK_HEIGHT, BLOCK_WIDTH, BLOCK_HEIGHT, blink.x, blink.y, BLOCK_WIDTH, BLOCK_HEIGHT));

        // Draw ball
        if (null != ball) {
            ball.update();
            ctx.drawImage(ballImg, ball.bounds.x, ball.bounds.y);
        }

        // Draw paddle
        if (noOfLifes > 0) {
            paddle.update();
            switch (paddleState) {
                //case STANDARD -> ctx.drawImage(paddleMap_std_Img, 80, 22, 80, 22, paddle.bounds.x, paddle.bounds.y, 80, 22);
                case WIDE     -> ctx.drawImage(paddleWideImg, paddle.bounds.x, paddle.bounds.y);
                case GUN      -> ctx.drawImage(paddleGunImg, paddle.bounds.x, paddle.bounds.y);
            }

            ctx.drawImage(paddleMapStdImg, paddle.countX * paddleState.width, paddle.countY * paddleState.height, paddleState.width, paddleState.height, paddle.x, paddle.y, paddleState.width, paddleState.height);
        } else {
            ctx.setFill(TEXT_GRAY);
            ctx.setTextAlign(TextAlignment.CENTER);
            ctx.fillText("GAME OVER", WIDTH * 0.5, HEIGHT * 0.75);
        }

        // Draw score
        ctx.setFill(Color.WHITE);
        ctx.setFont(SCORE_FONT);
        ctx.setTextAlign(TextAlignment.RIGHT);
        ctx.setTextBaseline(VPos.TOP);
        ctx.fillText(Long.toString(score), 140, 30);

        ctx.setFill(HIGH_SCORE_RED);
        ctx.setTextAlign(TextAlignment.CENTER);
        ctx.fillText("HIGH SCORE", WIDTH * 0.5, 0);
        ctx.setFill(SCORE_WHITE);
        ctx.fillText(Long.toString(score > highscore ? score : highscore), WIDTH * 0.5, 30);

        // Draw no of lifes
        for (int i = 1 ; i < noOfLifes ; i++) {
            ctx.drawImage(paddleMiniImg, 24 + 42 * i, HEIGHT - 30);
        }

        // Remove sprites
        blinks.removeIf(blink -> blink.toBeRemoved);
        blocks.removeIf(block -> block.toBeRemoved);
        torpedoes.removeIf(torpedo -> torpedo.toBeRemoved);

        // Check for level completeness
        if (blocks.isEmpty() || blocks.stream().filter(block -> block.maxHits > -1).count() == 0) {
            level++;
            if (level > Constants.LEVEL_MAP.size()) { level = 1; }
            executor.schedule(() -> startLevel(level), 1, TimeUnit.SECONDS);
        }
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

    private class Paddle extends AnimatedSprite {
        public Paddle() {
            super(WIDTH * 0.5 - paddleState.width * 0.5, HEIGHT - PADDLE_OFFSET_Y, 0, 0, 7, 7, 1.0);
            init();
        }

        @Override protected void init() {
            this.width  = paddleState.width;
            this.height = paddleState.height;
            this.size   = height;
            this.radius = size * 0.5;
            this.bounds.set(this.x, this.y, paddleState.width, this.height);
        }

        @Override public void respawn() {
            this.x  = WIDTH * 0.5;
            this.bounds.set(this.x, this.y, paddleState.width, this.height);
            this.vX = 0;
            this.vY = 0;
        }

        @Override public void update() {
            x += vX;
            //y += vY;

            if (x + paddleState.width > WIDTH - INSET) {
                x = WIDTH - INSET - paddleState.width;
            }
            if (x < INSET) {
                x = INSET;
            }
            this.bounds.set(this.x, this.y, paddleState.width, this.height);

            //countX++;
            countX = animateInc;
            if (countX == maxFrameX) {
                countX     = 0;
                animateInc = 0;
                countY++;
                if (countY == maxFrameY) {
                    countY = 0;
                }
            }
        }
    }

    private class Blink extends AnimatedSprite {

        public Blink(final double x, final double y) {
            super(x, y, 0, 0, 7, 1, 1.0);
        }

        @Override public void update() {
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

    private class Block extends Sprite {
        public       int       value;
        public       int       hits;
        public final int       maxHits;
        public final BonusType bonusType;
        public       boolean   toBeRemoved;


        public Block(final Image image, final double x, final double y, final int value, final int maxHits, final BonusType bonusType) {
            super(image);
            this.x           = x;
            this.y           = y;
            this.value       = value;
            this.maxHits     = maxHits;
            this.bonusType   = bonusType;
            this.toBeRemoved = false;
            this.hits        = 0;
            this.width       = BLOCK_WIDTH;
            this.height      = BLOCK_HEIGHT;
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

    private class BonusBlock extends AnimatedSprite {
        public BonusType bonusType;
        public boolean toBeRemoved;


        public BonusBlock(final Image image, final double x, final double y, final BonusType bonusType) {
            super(x, y, 0, 5, 7, 7, 1.0);
            this.bonusType   = bonusType;
            this.toBeRemoved = false;
            this.width       = BLOCK_WIDTH;
            this.height      = BLOCK_HEIGHT;
            this.bounds.set(x, y, width, height);
        }

        @Override public void update() { }
    }

    private class Ball extends Sprite {
        public boolean active;

        public Ball(final Image image, final double x, final double y, final double vX) {
            super(image, paddle.bounds.centerX, paddle.bounds.minY - image.getHeight() * 0.5, 0, BALL_SPEED);
            this.vX     = vX;
            this.vY     = -BALL_SPEED;
            this.active = false;
        }

        @Override public void update() {
            if (active) {
                this.x += this.vX;
                this.y += this.vY;
            } else {
                this.x = paddle.bounds.centerX;
                this.y = paddle.bounds.minY - image.getHeight() * 0.5;
            }

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
                executor.schedule(() -> spawnBall(), 2, TimeUnit.SECONDS);
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