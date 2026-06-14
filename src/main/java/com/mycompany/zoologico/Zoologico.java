/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoologico;

import java.util.Scanner;

/**
 * Practica Programada #1
 * Autores: Cristal Núñez, Jorhsam Mora, Stward Lezcano, Diego Benavides.
 */
public class Zoologico {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DEL ZOOLOGICO =====");
            System.out.println("Digite una opcion:");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Listar Animales");
            System.out.println("3. Ver Reporte de Animales");
            System.out.println("4. Salir");             

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrar Animal");
                    
                    break;
                case 2:
                    System.out.println("Lista de Animales");
                    break;

                case 3:
                    System.out.println("Reporte de Animales");
                    
                    break;
                case 4:
                    System.out.println("Saliendo... Gracias por usar el sistema :)");
                    
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}
