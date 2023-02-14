module eus.ehu.f1fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql; // THIS LINE WAS MISSING IN YOUR PREVIOUS module-info.java

    exports eus.ehu.f1;
    opens eus.ehu.f1 to javafx.fxml;
}