package com.example.controlador;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Empleado;
import model.Genero;
import model.Usuario;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.controlador.AppController.INSTANCE;

public class AdministradorController {

        @FXML
        private TextField tfNumeroIdentificacion;
        @FXML
        private TextField tfNombre;
        @FXML
        private TextField tfCorreo;
        @FXML
        private TextField tfContrasena;
        @FXML
        private ComboBox cbGenero;
        @FXML
        private Button botRegistrar;
        @FXML
        private Button botBloquear;
        @FXML
        private Button botActualizar;
        @FXML
        private TableColumn <Empleado, String>colNumeroIdentificacion;
        @FXML
        private  TableColumn <Empleado, String >colNombre;
        @FXML
        private TableColumn <Empleado, String > colGenero;
        @FXML
        private TableColumn <Empleado, String > colCorreo;
        @FXML
        private TableView<Empleado> tbEmpleados;




        @FXML
        public void initialize() {

                llenarTabla(FXCollections.observableArrayList(INSTANCE.getFinca().getEmplados()));
                colNumeroIdentificacion.setCellValueFactory(new PropertyValueFactory<>("numeroIdentificacion"));
                colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
                colGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
                colCorreo.setCellValueFactory(new PropertyValueFactory<>("email"));

                cbGenero.setItems(FXCollections.observableArrayList(Genero.values()));


        }

        public void onRegistrarClick() {
                String nombre = tfNombre.getText();
                String id = tfNumeroIdentificacion.getText();
                String correo = tfCorreo.getText();
                String contrasena = tfContrasena.getText();
                Genero genero = (Genero) cbGenero.getValue();

                INSTANCE.getFinca().regitrarEmpleado(new Empleado(correo, contrasena,id,genero, nombre));
                tbEmpleados.refresh();





        }

        public void onRemoverClick() {

        }

        public void onBuscarClick() {

        }

        public void adicionarNota() {

        }

        private void llenarTabla(List<Empleado> empleados) {

                tbEmpleados.setItems(FXCollections.observableArrayList(empleados));
                tbEmpleados.refresh();
        }


}
