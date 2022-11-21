module com.example.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlador to javafx.fxml;
    exports com.example.controlador;
}