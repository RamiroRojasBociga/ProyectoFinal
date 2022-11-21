package model;

public class Empleado extends Usuario{



    public Empleado(String email, String password, String numeroIdentificaion, Genero genero, String nombre) {
        super(email, password, numeroIdentificaion, nombre, genero);

    }
}
