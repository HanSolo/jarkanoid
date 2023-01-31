package eu.hansolo.fx.jarkanoid;

import javafx.scene.text.Font;


public class Fonts {
    private static final String URL_LINEAR_NAME;
    private static       String urwLinearName;

    private Fonts() {}


    static {
        try {
            urwLinearName   = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/jarkanoid/URWLinearTExtBolWid.ttf"), 10).getName();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        URL_LINEAR_NAME   = urwLinearName;
    }


    // ******************** Methods *******************************************
    public static Font urwLinear(final double size) { return new Font(URL_LINEAR_NAME, size); }
}
