package eu.hansolo.fx.jarkanoid;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class Constants {
    protected enum BlockType {
        NONE(0),
        GOLD(-1),
        GRAY(2),
        RED(1),
        YELLOW(1),
        BLUE(1),
        MAGENTA(1),
        LIME(1),
        WHITE(1),
        ORANGE(1),
        CYAN(1);

        protected final int maxHits;

        BlockType(final int maxHits) {
            this.maxHits = maxHits;
        }
    }

    protected static final String     HOME_FOLDER          = new StringBuilder(System.getProperty("user.home")).append(File.separator).toString();
    protected static final String     PROPERTIES_FILE_NAME = "jarkanoid.properties";
    protected static final String     HIGHSCORE_KEY        = "highscore";
    protected static final String     BALL_SPEED_KEY       = "ball_speed";

    protected static final BlockType[][] LEVEL_1  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED },
      { BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA },
      { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE }, };

    protected static final BlockType[][] LEVEL_2  =
    { { BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_3  =
    { { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_4  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE },
      { BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE },
      { BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE },
      { BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE },
      { BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE },
      { BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_5  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_6  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.ORANGE, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.ORANGE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_7  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_8  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_9  =
    { { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.CYAN, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.CYAN, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.ORANGE, BlockType.ORANGE, BlockType.ORANGE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_10 =
    { { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.GRAY, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHITE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD } };

    protected static final BlockType[][] LEVEL_11 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_12 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.WHITE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.ORANGE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.RED, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD } };

    protected static final BlockType[][] LEVEL_13 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.NONE, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.NONE },
      { BlockType.NONE, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.NONE, BlockType.ORANGE, BlockType.ORANGE, BlockType.ORANGE, BlockType.NONE, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE },
      { BlockType.NONE, BlockType.ORANGE, BlockType.ORANGE, BlockType.ORANGE, BlockType.NONE, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.NONE, BlockType.ORANGE, BlockType.ORANGE, BlockType.ORANGE, BlockType.NONE },
      { BlockType.NONE, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.NONE, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };


    protected static final Map<Integer, BlockType[][]> LEVEL_MAP = new HashMap<>();

    static {
        LEVEL_MAP.put(1, LEVEL_1);
        LEVEL_MAP.put(2, LEVEL_2);
        LEVEL_MAP.put(3, LEVEL_3);
        LEVEL_MAP.put(4, LEVEL_4);
        LEVEL_MAP.put(5, LEVEL_5);
        LEVEL_MAP.put(6, LEVEL_6);
        LEVEL_MAP.put(7, LEVEL_7);
        LEVEL_MAP.put(8, LEVEL_8);
        LEVEL_MAP.put(9, LEVEL_9);
        LEVEL_MAP.put(10, LEVEL_10);
        LEVEL_MAP.put(11, LEVEL_11);
        LEVEL_MAP.put(12, LEVEL_12);
        LEVEL_MAP.put(13, LEVEL_13);
    }
}
