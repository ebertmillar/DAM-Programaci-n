/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc01;

import java.util.Scanner;

/**
 *
 * @author ebert cristobal sanchez
 */


public class PROG04_Ejerc01 {
    
    
    /**
     * este es el metodo principal que ejecutara los metodos
     * que van a mostrar la tabla de multiplicar de un numero 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        tablaMultiplicarFor();
        tablaMultiplicarWhile();
        tablaMultiplicarDoWhile();

    }
    
    //metodo utilizando bucle for
    public static void tablaMultiplicarFor() {
        
        System.out.println("=========== Utillizando Bucle FOR ============");
        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.print("ingresa un numero : ");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 30) {
            System.out.println("=============Tabla de Multiplicar del numero " +
                    numero);
            
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }
            
        } else {
            System.out.println("no hay tabla de multiplicar para el numero " + numero);
        }
    }
    
    //metodo utilizando bucle while
    public static void tablaMultiplicarWhile() {
        System.out.println("\n=========== Utillizando Bucle WHILE ============");
        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.print("ingresa un numero : ");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 30) {
            System.out.println("=============Tabla de Multiplicar del numero "
                    + numero + " =============");
            int i = 1;
            while (i <= 12) {
                System.out.println(numero + " x " + i + " = " + numero * i);
                i++;
            }

        } else {
            System.out.println("no hay tabla de multiplicar para el numero " + numero);
        }
    }
    
    //metodo utilizando bucle do-while
    public static void tablaMultiplicarDoWhile() {
        System.out.println("\n=========== Utillizando Bucle DO - WHILE ============");
        Scanner sc = new Scanner(System.in); //Se crea el lector
        System.out.print("ingresa un numero : ");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 30) {
            System.out.println("=============Tabla de Multiplicar del numero "
                    + numero + " =============");
            int i = 1;

            do {
                System.out.println(numero + " x " + i + " = " + numero * i);
                i++;
            } while (i <= 12);

        } else {
            System.out.println("no hay tabla de multiplicar para el numero " + numero);
        }
    }
    
    
    
}
