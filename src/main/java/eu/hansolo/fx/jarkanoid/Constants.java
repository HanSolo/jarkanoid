package eu.hansolo.fx.jarkanoid;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class Constants {
    public static final String HOME_FOLDER          = new StringBuilder(System.getProperty("user.home")).append(File.separator).toString();
    public static final String PROPERTIES_FILE_NAME = "jarkanoid.properties";
    public static final String HIGHSCORE            = "highscore";

    public enum BlockType {
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

        public final int maxHits;

        BlockType(final int maxHits) {
            this.maxHits = maxHits;
        }
    }

    public static final BlockType[][] LEVEL_1 = {
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY},
        {BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED},
        {BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW, BlockType.YELLOW},
        {BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE},
        {BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA},
        {BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
    };
    public static final BlockType[][] LEVEL_2 = {
        {BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.RED, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE},
        {BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE}
    };
    public static final BlockType[][] LEVEL_3 = {
        {BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.WHITE, BlockType.WHITE, BlockType.WHITE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED, BlockType.RED},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.WHITE, BlockType.WHITE, BlockType.WHITE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.MAGENTA},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE}
    };
    public static final BlockType[][] LEVEL_4 = {
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE},
        {BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE},
        {BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE},
        {BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE},
        {BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE},
        {BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE},
        {BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.NONE},
        {BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE, BlockType.ORANGE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.NONE},
        {BlockType.NONE, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.NONE},
        {BlockType.NONE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.ORANGE, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MAGENTA, BlockType.YELLOW, BlockType.WHITE, BlockType.NONE}
    };
    public static final BlockType[][] LEVEL_5 = {
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RED, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE}
    };
    public static final BlockType[][] LEVEL_6 = {
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.ORANGE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.ORANGE, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORANGE, BlockType.NONE, BlockType.ORANGE},
        {BlockType.BLUE, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RED, BlockType.NONE, BlockType.BLUE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE}
    };
    public static final BlockType[][] LEVEL_7 = {
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.YELLOW, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.MAGENTA, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.RED, BlockType.RED, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.ORANGE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.ORANGE, BlockType.WHITE, BlockType.WHITE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE},
        {BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE}
    };
    


    public static final Map<Integer, BlockType[][]> LEVEL_MAP = new HashMap<>();
    static {
        LEVEL_MAP.put(1, LEVEL_1);
        LEVEL_MAP.put(2, LEVEL_2);
        LEVEL_MAP.put(3, LEVEL_3);
        LEVEL_MAP.put(4, LEVEL_4);
        LEVEL_MAP.put(5, LEVEL_5);
        LEVEL_MAP.put(6, LEVEL_6);
        LEVEL_MAP.put(7, LEVEL_7);
    }
}
