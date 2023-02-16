module eu.hansolo.fx.jarkanoid {
    // Java
    requires java.base;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.media;

    exports eu.hansolo.fx.jarkanoid to javafx.base,javafx.graphics,javafx.controls,javafx.media;
}