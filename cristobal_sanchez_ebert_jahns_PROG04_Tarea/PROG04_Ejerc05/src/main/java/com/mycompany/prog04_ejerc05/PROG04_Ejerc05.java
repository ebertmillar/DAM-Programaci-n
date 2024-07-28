/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog04_ejerc05;

import java.util.Scanner;

/**
 *
 * @author ebert cristobal sanchez
 */
public class PROG04_Ejerc05 {
    
    /**
     * este es el metodo principal que ejecutara el programa que no permite
     * una division con resultado interminado para ello se utiliza  la exception
     * try - catch, donde en catch se aplicara una expcetion ArithmeticException
     * en caso de existir una resultado indeterminado
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        int dividendo = 0;
        int divisor = 0;
        int resultado = 0;
        int cantidadOperaciones = 0;
  
        //proceso
            do {
            //ingreso de datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresar dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Ingresar divisor: ");
            divisor = sc.nextInt();
            
            //Exception Try - Catch
            try {
                resultado = dividendo / divisor;
                if ((dividendo != -1) || (divisor != -1)) {
                    System.out.println("Resultado: " + resultado);
                    cantidadOperaciones++;
                    System.out.println("Numero de divisiones calculadas: " + cantidadOperaciones + "\n");
                } else {
                    System.out.println("fin del programa");
                }
            } catch (ArithmeticException ex) {
                System.out.println("No se puede dividir por 0");
                System.out.println("");
            }
        } while ((dividendo != -1) || (divisor != -1));
    }
}
