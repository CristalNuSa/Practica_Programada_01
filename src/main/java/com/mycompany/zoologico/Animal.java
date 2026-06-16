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

        if (identificador == null) {
            System.out.println("El identificador del animal no puede estar vacío");
        } else {
            this.identificador = identificador;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null) {
            System.out.println("El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
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
            System.out.println("La edad no puede ser negativa");
        } else {
            this.edad = edad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        if (peso <= 0) {
            System.out.println("El peso debe ser mayor que cero");
        } else {
            this.peso = peso;
        }
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {

        if (zona == null) {
            System.out.println("La zona no puede estar vacía");
        } else {
            this.zona = zona;
        }
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
