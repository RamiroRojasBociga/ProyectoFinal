package model;

public class Administrador extends Usuario{

    public Administrador(String email, String password, String numeroIdentificaion, Genero genero, String nombre) {
        super(email, password, numeroIdentificaion, nombre, genero);

    }
}
