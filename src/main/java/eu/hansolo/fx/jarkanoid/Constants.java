package eu.hansolo.fx.jarkanoid;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class Constants {
    protected enum BlockType {
        NONE(0),
        GOLD(-1),
        GRAY(2),
        RUBY(1),
        YLLW(1),
        BLUE(1),
        MGNT(1),
        LIME(1),
        WHIT(1),
        ORNG(1),
        CYAN(1);

        protected final int maxHits;

        BlockType(final int maxHits) {
            this.maxHits = maxHits;
        }
    }

    protected static final String     HOME_FOLDER           = new StringBuilder(System.getProperty("user.home")).append(File.separator).toString();
    protected static final String     PROPERTIES_FILE_NAME  = "jarkanoid.properties";
    protected static final String     HIGHSCORE_KEY         = "highscore";
    protected static final String     BALL_SPEED_KEY        = "ball_speed";
    protected static final String     BONUS_BLOCK_SPEED_KEY = "bonus_block_speed";
    protected static final String     ENEMY_SPEED_KEY       = "enemy_speed";

    protected static final BlockType[][] LEVEL_1  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT },
      { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE }, };

    protected static final BlockType[][] LEVEL_2  =
    { { BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RUBY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_3  =
    { { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT },
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
      { BlockType.NONE, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.NONE, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.NONE, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.NONE },
      { BlockType.NONE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.NONE },
      { BlockType.NONE, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.NONE, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.NONE },
      { BlockType.NONE, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.NONE },
      { BlockType.NONE, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.NONE, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.NONE, BlockType.ORNG, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.NONE, BlockType.CYAN, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.NONE, BlockType.LIME, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.NONE },
      { BlockType.NONE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.ORNG, BlockType.CYAN, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.WHIT, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_5  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
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
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.ORNG },
      { BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_7  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.MGNT, BlockType.MGNT, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.MGNT, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.MGNT, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.MGNT, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORNG, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORNG, BlockType.ORNG, BlockType.WHIT, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORNG, BlockType.ORNG, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.CYAN, BlockType.CYAN, BlockType.ORNG, BlockType.ORNG, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.ORNG, BlockType.ORNG, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.ORNG, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_8  =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
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
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
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
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.GRAY, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.CYAN, BlockType.WHIT, BlockType.CYAN, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
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
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.WHIT, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.YLLW },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD } };

    protected static final BlockType[][] LEVEL_13 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.NONE },
      { BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.NONE },
      { BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE },
      { BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.NONE },
      { BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_14 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.ORNG, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.ORNG },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.CYAN, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.CYAN },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD } };

    protected static final BlockType[][] LEVEL_15 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.CYAN, BlockType.WHIT, BlockType.GOLD, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GOLD, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.GOLD, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GOLD, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.WHIT, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.WHIT, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.WHIT, BlockType.CYAN },
      { BlockType.CYAN, BlockType.GRAY, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.GRAY, BlockType.CYAN },
      { BlockType.CYAN, BlockType.CYAN, BlockType.GRAY, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.GRAY, BlockType.CYAN, BlockType.CYAN },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GRAY, BlockType.YLLW, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.GRAY, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GRAY, BlockType.YLLW, BlockType.WHIT, BlockType.LIME, BlockType.GRAY, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GRAY, BlockType.WHIT, BlockType.GRAY, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN } };

    protected static final BlockType[][] LEVEL_16 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT },
      { BlockType.NONE, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.NONE },
      { BlockType.ORNG, BlockType.ORNG, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.ORNG, BlockType.ORNG },
      { BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.RUBY, BlockType.RUBY },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE } };

    protected static final BlockType[][] LEVEL_17 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GRAY, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_18 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.GOLD, BlockType.YLLW, BlockType.GOLD, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.ORNG },
      { BlockType.ORNG, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.MGNT, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.ORNG },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_19 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.LIME, BlockType.RUBY, BlockType.BLUE, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_20 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.WHIT, BlockType.GOLD, BlockType.ORNG, BlockType.GOLD, BlockType.CYAN, BlockType.GOLD, BlockType.LIME, BlockType.GOLD, BlockType.RUBY, BlockType.GOLD, BlockType.BLUE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.GRAY, BlockType.GOLD, BlockType.GRAY, BlockType.GOLD, BlockType.GRAY, BlockType.GOLD, BlockType.GRAY, BlockType.GOLD, BlockType.YLLW, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_21 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.ORNG, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_22 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW },
      { BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY },
      { BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY },
      { BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY },
      { BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT },
      { BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_23 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.LIME, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.LIME, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.LIME, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.RUBY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.BLUE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.BLUE, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_24 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.BLUE, BlockType.WHIT, BlockType.BLUE, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.WHIT, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.BLUE, BlockType.BLUE, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE } };

    protected static final BlockType[][] LEVEL_25 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD },
      { BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD },
      { BlockType.GOLD, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GOLD },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_26 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_27 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY } };

    protected static final BlockType[][] LEVEL_28 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.BLUE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.BLUE },
      { BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.BLUE },
      { BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE },
      { BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE },
      { BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE },
      { BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.GOLD, BlockType.MGNT, BlockType.GOLD, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.MGNT, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_29 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW },
      { BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT },
      { BlockType.GOLD, BlockType.GOLD, BlockType.WHIT, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GOLD, BlockType.GOLD, BlockType.WHIT, BlockType.GOLD, BlockType.GOLD },
      { BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE },
      { BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY },
      { BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME, BlockType.LIME },
      { BlockType.GRAY, BlockType.GRAY, BlockType.WHIT, BlockType.GRAY, BlockType.GRAY, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.GRAY, BlockType.WHIT, BlockType.GRAY, BlockType.GRAY },
      { BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN, BlockType.CYAN },
      { BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG, BlockType.ORNG },
      { BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT, BlockType.WHIT },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_30 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.CYAN, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.CYAN, BlockType.ORNG, BlockType.WHIT, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.CYAN, BlockType.ORNG, BlockType.WHIT, BlockType.YLLW, BlockType.MGNT, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.GRAY, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME, BlockType.CYAN, BlockType.ORNG, BlockType.WHIT, BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.NONE },
      { BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.RUBY, BlockType.LIME, BlockType.CYAN, BlockType.ORNG, BlockType.WHIT, BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.CYAN, BlockType.ORNG, BlockType.WHIT, BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.WHIT, BlockType.YLLW, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.MGNT, BlockType.BLUE, BlockType.RUBY, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY, BlockType.RUBY, BlockType.LIME },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_31 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.WHIT, BlockType.NONE, BlockType.ORNG },
      { BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY },
      { BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.WHIT, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.WHIT },
      { BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY },
      { BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.ORNG, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.ORNG, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.YLLW },
      { BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY },
      { BlockType.NONE, BlockType.YLLW, BlockType.NONE, BlockType.MGNT, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.CYAN, BlockType.NONE },
      { BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE },
      { BlockType.WHIT, BlockType.NONE, BlockType.ORNG, BlockType.NONE, BlockType.CYAN, BlockType.NONE, BlockType.LIME, BlockType.NONE, BlockType.RUBY, BlockType.NONE, BlockType.BLUE, BlockType.NONE, BlockType.MGNT },
      { BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY, BlockType.NONE, BlockType.GRAY },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_32 =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.LIME, BlockType.LIME, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.RUBY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.BLUE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.MGNT, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.GOLD, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.YLLW, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.GRAY, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE } };

    protected static final BlockType[][] LEVEL_TEMPLATE =
    { { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
      { BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE, BlockType.NONE },
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
        LEVEL_MAP.put(14, LEVEL_14);
        LEVEL_MAP.put(15, LEVEL_15);
        LEVEL_MAP.put(16, LEVEL_16);
        LEVEL_MAP.put(17, LEVEL_17);
        LEVEL_MAP.put(18, LEVEL_18);
        LEVEL_MAP.put(19, LEVEL_19);
        LEVEL_MAP.put(20, LEVEL_20);
        LEVEL_MAP.put(21, LEVEL_21);
        LEVEL_MAP.put(22, LEVEL_22);
        LEVEL_MAP.put(23, LEVEL_23);
        LEVEL_MAP.put(24, LEVEL_24);
        LEVEL_MAP.put(25, LEVEL_25);
        LEVEL_MAP.put(26, LEVEL_26);
        LEVEL_MAP.put(27, LEVEL_27);
        LEVEL_MAP.put(28, LEVEL_28);
        LEVEL_MAP.put(29, LEVEL_29);
        LEVEL_MAP.put(30, LEVEL_30);
        LEVEL_MAP.put(31, LEVEL_31);
        LEVEL_MAP.put(32, LEVEL_32);
    }
}
