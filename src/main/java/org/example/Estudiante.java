package org.example;

public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String nombre, String codigo) {
        super(nombre);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
