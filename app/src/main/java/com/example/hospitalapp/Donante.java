package com.example.hospitalapp;
import java.io.Serializable;

public class Donante implements Serializable {
    private String nombre;
    private int edad;
    private String tipoSangre;
    private boolean aptoParaDonar;

    // Constructor
    public Donante(String nombre, int edad, String tipoSangre, boolean aptoParaDonar) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
        this.aptoParaDonar = aptoParaDonar;
    }

    // Getters y setters (opcional)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public boolean isAptoParaDonar() {
        return aptoParaDonar;
    }

    public void setAptoParaDonar(boolean aptoParaDonar) {
        this.aptoParaDonar = aptoParaDonar;
    }
}

