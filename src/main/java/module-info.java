module com.interfaz.interfaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.interfaz.interfaz to javafx.fxml;
    exports com.interfaz.interfaz;
}