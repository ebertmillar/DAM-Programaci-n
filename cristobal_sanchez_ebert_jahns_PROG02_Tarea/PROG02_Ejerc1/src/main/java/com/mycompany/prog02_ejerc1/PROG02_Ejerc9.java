/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

import java.util.Scanner;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc9 {

    public static void main(String[] args) {
        
        /*
         9. Diseña un programa Java, denominado PROG02_Ejerc9, que dado un año indique si es bisiesto o no. 
        
        */
        
        //declarando variables 
        int año;
        String mensaje;
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca el año:  " );
        año = teclado.nextInt();
        
        //proceso       
        mensaje= ((año%4==0 && año%100!=0)? "bisiesto": "no bisiesto");
        
        System.out.println("el año ingresado es un año -> " + mensaje);
    
    }
}
