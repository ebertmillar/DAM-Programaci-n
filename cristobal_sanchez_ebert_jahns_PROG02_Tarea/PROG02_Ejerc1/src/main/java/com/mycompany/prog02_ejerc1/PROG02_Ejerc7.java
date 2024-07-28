/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc7 {

    public static void main(String[] args) {
        
        /*
        Diseña un programa Java denominado PROG02_Ejerc7 
        para resolver una ecuación de primer grado con una incógnita (x), 
        suponiendo que los coeficientes de la ecuación son C1 y C2 
        se inicializan en el método main:
        C1x + C2 = 0
        Se debe mostrar el resultado con 4 decimales.
        
        x = -C2/C1
        
        */
        
        //declarando variables      
        float c1,c2,x;
        
        //pidiendo ingresar datos por teclado
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca c1 : " );
        c1 = teclado.nextFloat();
        System.out.print( "Introduzca c2: " );
        c2 = teclado.nextFloat();
        
        //proceso
        x= -(c2/c1);
        DecimalFormat decimales = new DecimalFormat(("#.0000")); //con esta linea conseguiremos que se muestren 4 decimales
        
        //imprimir en pantalla       
        System.out.println("el valor de X es: "
                +decimales.format(x));
        
        
        
    }
}
