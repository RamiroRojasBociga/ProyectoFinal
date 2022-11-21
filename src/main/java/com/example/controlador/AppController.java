package com.example.controlador;

import model.FincaRaiz;

public enum AppController {
    INSTANCE;
    private final FincaRaiz finca;

    AppController() {

        finca = new FincaRaiz();
    }

    public FincaRaiz getFinca() {

        return finca;
    }
}
