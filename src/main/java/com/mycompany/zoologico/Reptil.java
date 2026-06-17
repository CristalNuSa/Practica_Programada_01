/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**

 * @author Usuario
 * Clase tipo Reptil
 */
public class Reptil extends Animal {
 
    private String tipoHabitat;
    private int temperaturaRequerida;

    public Reptil(String tipoHabitat, int temperaturaRequerida, String identificador, String nombre, String especie, int edad, double peso, String zona) {
        super(identificador, nombre, especie, edad, peso, zona);
        this.tipoHabitat = tipoHabitat;
        this.temperaturaRequerida = temperaturaRequerida;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {

        if (tipoHabitat == null) {
            System.out.println("El tipo de hábitat no puede estar vacío");
          } else {
             this.tipoHabitat = tipoHabitat;
        }
    }

    public int getTemperaturaRequerida() {
        return temperaturaRequerida;
    }

    public void setTemperaturaRequerida(int temperaturaRequerida) {

        if (temperaturaRequerida < 0) {
            System.out.println("La temperatura requerida no puede ser negativa");
         } else {
            this.temperaturaRequerida = temperaturaRequerida;
        }
    }

    @Override
    public double calcularCostoMantenimiento() {
        double alimentacion = 160.0;
        double habitat = 87.0;
        double calefaccion = 210.0;
        return alimentacion + habitat + calefaccion;
    }
    
    @Override
    public String descripcion() {
        return super.descripcion() + " - Reptil ( " + tipoHabitat + temperaturaRequerida + "°) "; 
    }  
    
}
