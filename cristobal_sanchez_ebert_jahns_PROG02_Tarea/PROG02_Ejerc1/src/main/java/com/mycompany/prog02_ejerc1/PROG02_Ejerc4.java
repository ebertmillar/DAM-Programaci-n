/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc4 {

    public static void main(String[] args) {
        /*
        4. Diseña un programa Java denominado PROG02_Ejerc4 
        que dada la edad de una persona, muestre un mensaje indicando 
        si es mayor de edad. NO se puede utilizar el operador condicional if.       
        */
        
        //declarando y asignando valor a la variables
        int edad= 18;
        String mensaje1 ="mayor de edad";
        String mensaje2 = "menor de edad";
        String mensajeResultante;
       
        //proceso
        mensajeResultante = (edad >=18) ? mensaje1: mensaje2;
        
        //impresion en pantalla
        System.out.println("la persona es  " + mensajeResultante);


        
    }
}
