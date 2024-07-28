/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc5 {

    public static void main(String[] args) {
        
        /*
        5.- Diseña un programa Java denominado PROG02_Ejerc5 
        que dado un número de segundos, muestre en pantalla cuántos minutos, 
        horas y días contiene.
        */
        
        //declarando y asignando valor a la variables
        int minutos, horas, dias;
        int segundos = 1000000;
        
        //proceso   
        minutos = segundos/60;
        horas = segundos/3600;
        dias = segundos/86400;
        
        //impresion en pantalla      
        System.out.println(segundos + " segundos contiene "+ minutos + " minutos, " 
                + horas + " horas y  " + dias + " dias." );
    }
}
