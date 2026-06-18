/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 * @author Usuario
 * Clase Base "Animal"
 */
public abstract class Animal {
    
    private String identificador;
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String zona;

    public Animal(String identificador, String nombre, String especie, int edad, double peso, String zona) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.zona = zona;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    
    public abstract double calcularCostoMantenimiento();

    public String descripcion() {
        return "Identificador: " + identificador
                + ", Nombre: " + nombre
                + ", Especie: " + especie
                + ", Edad: " + edad
                + ", Peso: " + peso
                + ", Zona: " + zona;
    }

    public final void imprimirDescripcion() {
        System.out.println("[Animal]: " + descripcion());
    }

}
