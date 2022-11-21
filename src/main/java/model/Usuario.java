package model;

import java.security.GeneralSecurityException;

public class Usuario extends Persona{

    private String email;
    private String password;
    private String numeroIdentificaion;
    private Genero genero;
    private String nombre;

    public Usuario(String email, String password, String numeroIdentificaion, String nombre, Genero genero) {
        this.email = email;
        this.password = password;
        this.numeroIdentificaion = numeroIdentificaion;
        this.nombre = nombre;
        this.genero = genero;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
