/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**

 * @author Usuario
 * Clase tipo Ave
 */
public class Ave extends Animal {
    
    private int tamanoAlas;
    boolean puedeVolar;

    public Ave(int tamanoAlas, boolean puedeVolar, String identificador, String nombre, String especie, int edad, double peso, String zona) {
        super(identificador, nombre, especie, edad, peso, zona);
        this.tamanoAlas = tamanoAlas;
        this.puedeVolar = puedeVolar;
    }

    public int getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(int tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public double calcularCostoMantenimiento() {
        double dieta = 80.0;
        double mantenimientoAviario = 170.0;      
        return dieta + mantenimientoAviario;
    }
    
    @Override
    public String descripcion(){        
        return super.descripcion() + " - Ave ( " +(puedeVolar ? " - Ave arborícola" : "- Ave terrestre") + tamanoAlas +"cm)";
    }
    public void setTamanoAlas(int tamanoAlas) {

        if (tamanoAlas <= 0) {
            throw new IllegalArgumentException("El tamaño de alas debe ser mayor que cero");
        }

        this.tamanoAlas = tamanoAlas;
    }   
}
