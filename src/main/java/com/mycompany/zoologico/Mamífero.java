/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 * @author Usuario
 * Clase tipo Mamífero
 */
public class Mamífero extends Animal {
    
    private String tipoPelaje;
    private int cantAlimentoDiario;

    public Mamífero(String tipoPelaje, int cantAlimentoDiario, String identificador, String nombre, String especie, int edad, double peso, String zona) {
        super(identificador, nombre, especie, edad, peso, zona);
        this.tipoPelaje = tipoPelaje;
        this.cantAlimentoDiario = cantAlimentoDiario;
    }  

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {

        if (tipoPelaje == null) {
            System.out.println("El tipo de pelaje no puede estar vacío");
        } else {
            this.tipoPelaje = tipoPelaje;
        }
    }

    public int getCantAlimentoDiario() {
        return cantAlimentoDiario;
    }

    public void setCantAlimentoDiario(int cantAlimentoDiario) {

        if (cantAlimentoDiario < 0) {
            System.out.println("La cantidad de alimento no puede ser negativa");
        } else {
            this.cantAlimentoDiario = cantAlimentoDiario;
        }
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        double alimentacion = cantAlimentoDiario * 30.0 ;
        double salud = 112.0;
        return alimentacion + salud;
    }
    
    @Override
    public String descripcion() {
        return super.descripcion() + " - Mamífero ( " + tipoPelaje + cantAlimentoDiario + "kg) "; 
    }
    
}
