package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FincaRaiz {


    List<Empleado> empleados;
    List<Administrador> administradores;

    public FincaRaiz(){
        administradores = new ArrayList<Administrador>();
        empleados = new ArrayList<Empleado>();

        Administrador admin = new Administrador("admin", "123", "12121", Genero.MASCULINO, "Carlos");

        administradores.add(admin);
    }

    public Usuario iniciarSesion (String email, String password){
        Administrador administrador= administradores.stream()
                .filter( (user)-> user.getEmail().equals(email) &&
                        user.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        Empleado empleado= empleados.stream()
                .filter( (user)-> user.getEmail().equals(email) &&
                        user.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        if (administrador!=null){
            return administrador;
        } else if (empleado!=null) {
            return empleado;
        }
        else {
            return null;
        }

    }

    public void registrarPropiedad(){

    }

    public void regitrarEmpleado(Empleado e1) {

        if(e1 != null){
            empleados.add(e1);
        }

    }

    public List<Empleado> getEmplados(){
        return this.empleados;
    }

}