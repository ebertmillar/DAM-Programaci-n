/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prog04_ejerc03;

import java.util.Scanner;

/**
 *
 * @author ebert cristobal sanchez
 */
public class PROG04_Ejerc03 {
    
    /**
     * este es el metodo principal permite hallar el MCM de dos numeros
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion dee variables
        int num1, num2;
        int maximo;
        int i;
        
        
        ///ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el 1er numero : ");
        num1 = sc.nextInt();
        System.out.print("ingresa el 2do numero : ");
        num2 = sc.nextInt();
        maximo = num1;
        i = maximo;
        
        
        if (num1 >= 0 && num2 >= 0) {

            if (num2 > num1) {
                maximo = num2;
                i = maximo;

                while (i % num1 != 0 || i % num2 != 0) {
                    i++;
                }
                System.out.println("El minimo comun Multiplo de " + num1
                        + " y " + num2 + " es : " + i);
            } else {
                while (i % num1 != 0 || i % num2 != 0) {
                    i++;
                }
                System.out.println("El minimo comun Multiplo de " + num1
                        + " y " + num2 + " es : " + i);
            }
        } else {
            System.out.println("no se pueden ingresar numeros negativos");

        }

    }
}
