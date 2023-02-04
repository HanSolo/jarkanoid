package eu.hansolo.fx.jarkanoid;

import javafx.scene.text.Font;


public class Fonts {
    private static final String EMULOGIC_NAME;
    private static       String emulogicName;

    private Fonts() {}


    static {
        try {
            emulogicName  = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/jarkanoid/Emulogic-zrEw.ttf"), 10).getName();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        EMULOGIC_NAME   = emulogicName;
    }


    // ******************** Methods *******************************************
    public static Font emulogic(final double size) { return new Font(EMULOGIC_NAME, size); }

}
