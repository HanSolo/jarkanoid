module eu.hansolo.fx.jarkanoid {

    // Java-FX
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.swing;
    requires javafx.media;

    // 3rd party
    requires transitive eu.hansolo.toolbox;

    opens eu.hansolo.fx.jarkanoid to eu.hansolo.toolbox;

    exports eu.hansolo.fx.jarkanoid;
}