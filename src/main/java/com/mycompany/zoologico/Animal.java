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

    setIdentificador(identificador);
    setNombre(nombre);
    this.especie = especie;
    setEdad(edad);
    setPeso(peso);
    setZona(zona);

    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {

        if (identificador == null) {
            throw new IllegalArgumentException("El identificador del animal no puede estar vacío");
        }

        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

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

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero");
        }

        this.peso = peso;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {

        if (zona == null) {
            throw new IllegalArgumentException("La zona no puede estar vacía");
        }

        this.zona = zona;
    }
    
    
    
    public abstract double calcularCostoMantenimiento();
    
    public String descripcion(){
        // peso como es de tipo double puede dar error al imprimirlo por que la %d es para int
        return String.format("%s %s %s %d %.2f %s", identificador, nombre, especie, edad, peso, zona);
    }
    
    public final void imprimirDescripcion(){
        System.out.println("[Animal]: " + descripcion());
        
    }         
}
