package com.ejemplo.practica.model;

import jakarta.persistence.*;

@Entity
public class ObraSocial extends Base {

    private String nombre;

    public ObraSocial() {}
    public ObraSocial(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
