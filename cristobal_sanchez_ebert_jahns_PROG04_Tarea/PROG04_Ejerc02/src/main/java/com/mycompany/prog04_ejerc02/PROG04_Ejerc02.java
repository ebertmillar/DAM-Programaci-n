/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc02;

import java.util.Scanner;

/**
 *
 * @author ebert cristobal sanchez
 */
public class PROG04_Ejerc02 {
    /**
     * este es el metodo principal que ejecutara los metodos
     * que permitiran determina si cada uno de los 5 numeros ingresados son
     * primos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroPrimo();
        //NumeroPrimoBoolean();
    }
    
    //meotodo para saber si un numero es primo
    public static void NumeroPrimo(){
    
        for (int i = 1; i <= 5; i++) {
            Scanner sc = new Scanner(System.in); 
            System.out.print("ingresa un numero : ");
            int numero = sc.nextInt();
            
            if (numero < 0) {
                System.out.print("El número es negativo\n");
            } else {
                int contador = 0;
                for (int j = 2; j <= numero; j++) {

                    if (numero % j == 0) {
                        contador++;
                    } 
                }

                if (contador == 1) {
                    System.out.print("El número es Primo\n");
                } else {
                    System.out.print("El número no es Primo\n");
                }
            }
            
        }
    
    };
    
    //metodo para saber si un numero es primo utilizando tipo de dato boleano
    public static void NumeroPrimoBoolean() {

        for (int i = 1; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ingresa un numero : ");
            int numero = sc.nextInt();

            if (numero < 0) {
                System.out.print("El número es negativo\n");
            } else {
                
                boolean primo = true;
                for (int j = 2; j < numero && primo; j++) {

                    if (numero % j == 0) {
                        primo = false;
                    }
                }

                if (primo && numero != 0 && numero != 1) {
                    System.out.print("El número es Primo\n");
                } else {
                    System.out.print("El número no es Primo\n");
                }
            }

        }

    }
}
