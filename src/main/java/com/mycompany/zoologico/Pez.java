/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**

 * @author Usuario
 * Clase tipo Pez
 */
public class Pez extends Animal {
    
    private int tipoAgua;
    private int tamanoAcuario;

    public Pez(int tipoAgua, int tamanoAcuario, String identificador, String nombre, String especie, int edad, double peso, String zona) {
        super(identificador, nombre, especie, edad, peso, zona);
        this.tipoAgua = tipoAgua;
        this.tamanoAcuario = tamanoAcuario;
    }

    public int getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(int tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getTamanoAcuario() {
        return tamanoAcuario;
    }

    public void setTamanoAcuario(int tamanoAcuario) {
        this.tamanoAcuario = tamanoAcuario;
    }   

    @Override
    public double calcularCostoMantenimiento() {
        double  tamanoAcuario = 90.0;
        double tipoAgua = 80.0;
        double alimentacion = 100.0;
        return tamanoAcuario + tipoAgua + alimentacion;
    }
    
    @Override
    public String descripcion() {
        return super.descripcion() + " - Pez ( " + tipoAgua + tamanoAcuario + "m) "; 
    }
    
}
