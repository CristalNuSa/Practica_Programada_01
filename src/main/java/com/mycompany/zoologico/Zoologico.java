/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoologico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Practica Programada #1
 * Autores: Cristal Núñez, Jorhsam Mora, Stward Lezcano, Diego Benavides.
 */
public class Zoologico {

    public static void main(String[] args) {
        
        //
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTION DEL ZOOLOGICO =====");
            System.out.println("Digite una opcion:");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Listar Animales");
            System.out.println("3. Ver Reporte de Animales");
            System.out.println("4. Salir");             

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n===== REGISTRAR ANIMAL =====");
                    System.out.println("Seleccione el tipo de animal:");
                    System.out.println("1. Mamifero");
                    System.out.println("2. Ave");
                    System.out.println("3. Reptil");
                    System.out.println("4. Pez");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite el identificador:");
                    String identificador = sc.nextLine();

                    System.out.println("Digite el nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Digite la especie:");
                    String especie = sc.nextLine();

                    System.out.println("Digite la edad:");
                    int edad = sc.nextInt();

                    System.out.println("Digite el peso:");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite la zona:");
                    String zona = sc.nextLine();

                    if (identificador.equals("") || nombre.equals("") || edad < 0 || peso <= 0 || zona.equals("")) {
                        System.out.println("No se pudo registrar. Hay datos invalidos.");
                        break;
                    }

                    switch (tipo) {
                        case 1:
                            System.out.println("Digite el tipo de pelaje:");
                            String tipoPelaje = sc.nextLine();

                            System.out.println("Digite la cantidad de alimento diario:");
                            int cantAlimentoDiario = sc.nextInt();
                            sc.nextLine();

                            Mamífero mamifero = new Mamífero(tipoPelaje, cantAlimentoDiario, identificador, nombre, especie, edad, peso, zona);
                            animales.add(mamifero);

                            System.out.println("Mamifero registrado correctamente.");
                            break;

                        case 2:
                            System.out.println("Digite el tamaño de alas en cm:");
                            int tamanoAlas = sc.nextInt();

                            System.out.println("Digite 1 si puede volar, 2 si no puede volar:");
                            int respuestaVolar = sc.nextInt();
                            sc.nextLine();

                            boolean puedeVolar = false;

                            if (respuestaVolar == 1) {
                                puedeVolar = true;
                            }

                            Ave ave = new Ave(tamanoAlas, puedeVolar, identificador, nombre, especie, edad, peso, zona);
                            animales.add(ave);

                            System.out.println("Ave registrada correctamente.");
                            break;

                        case 3:
                            System.out.println("Digite el tipo de habitat:");
                            String tipoHabitat = sc.nextLine();

                            System.out.println("Digite la temperatura requerida:");
                            int temperaturaRequerida = sc.nextInt();
                            sc.nextLine();

                            Reptil reptil = new Reptil(tipoHabitat, temperaturaRequerida, identificador, nombre, especie, edad, peso, zona);
                            animales.add(reptil);

                            System.out.println("Reptil registrado correctamente.");
                            break;

                        case 4:
                            System.out.println("Digite el tipo de agua:");
                            int tipoAgua = sc.nextInt();

                            System.out.println("Digite el tamano del acuario:");
                            int tamanoAcuario = sc.nextInt();
                            sc.nextLine();

                            Pez pez = new Pez(tipoAgua, tamanoAcuario, identificador, nombre, especie, edad, peso, zona);
                            animales.add(pez);

                            System.out.println("Pez registrado correctamente.");
                            break;

                        default:
                            System.out.println("Tipo de animal invalido.");
                            break;
                    }
                    
                    break;

                case 2:
                    System.out.println("\n===== LISTA DE ANIMALES =====");

                    if (animales.isEmpty()) {
                        System.out.println("No hay animales registrados.");
                    } else {
                        for (Animal animal : animales) {
                            animal.imprimirDescripcion();
                            System.out.println("Costo de mantenimiento: $" + animal.calcularCostoMantenimiento());
                            System.out.println("--------------------------------");
                        }
                    }

                    break;

                case 3:
                    System.out.println("\n===== REPORTE DE ANIMALES =====");

                    if (animales.isEmpty()) {
                        System.out.println("No hay animales registrados.");
                    } else {
                        int totalMamiferos = 0;
                        int totalAves = 0;
                        int totalReptiles = 0;
                        int totalPeces = 0;
                        double costoTotal = 0;

                        for (Animal animal : animales) {
                            costoTotal = costoTotal + animal.calcularCostoMantenimiento();

                            if (animal instanceof Mamífero) {
                                totalMamiferos++;
                            }

                            if (animal instanceof Ave) {
                                totalAves++;
                            }

                            if (animal instanceof Reptil) {
                                totalReptiles++;
                            }

                            if (animal instanceof Pez) {
                                totalPeces++;
                            }
                        }

                        System.out.println("Cantidad total de animales: " + animales.size());
                        System.out.println("Cantidad de mamiferos: " + totalMamiferos);
                        System.out.println("Cantidad de aves: " + totalAves);
                        System.out.println("Cantidad de reptiles: " + totalReptiles);
                        System.out.println("Cantidad de peces: " + totalPeces);
                        System.out.println("Costo total de mantenimiento: $" + costoTotal);
                    }
                    
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
