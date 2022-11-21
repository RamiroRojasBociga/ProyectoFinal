package com.example.controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Administrador;
import model.Empleado;
import model.FincaRaiz;
import model.Usuario;

import static com.example.controlador.AppController.INSTANCE;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField tfCorreo;
    @FXML
    private TextField tfContrasena;
    @FXML
    private Button btnInicioSesion;


    public void iniciarSesion() throws IOException {
        String contra = tfContrasena.getText();
        String correo = tfCorreo.getText();
        Usuario user = INSTANCE.getFinca().iniciarSesion(correo, contra);


        if(user instanceof Administrador){
            Parent parent = FXMLLoader.load(MainApp.class.getResource("administrador.fxml"));
            Scene scene = new Scene(parent, 600, 600);
            Stage stage = new Stage();
            stage.setTitle("Administrador");
            stage.setScene(scene);


            stage.initOwner(btnInicioSesion.getScene().getWindow());
            btnInicioSesion.getScene().getWindow().hide();
            stage.show();

        }else if(user instanceof Empleado){

        }else{
            welcomeText.setText("CREDENCIALES INCORRECTAS.");
        }

    }
}