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
public class PROG02_Ejerc8 {

    public static void main(String[] args) {
        /*
        8. Diseña un programa Java denominado PROG02_Ejerc8 que dados el número 
        de alumnos matriculados en Programación, número de alumnos matriculados
        en Entornos de Desarrollo y número de alumnos matriculados en 
        Base de datos. El programa deberá mostrar el % de alumnos matriculado 
        en cada uno de los tres módulos. Se supone que un alumno sólo 
        puede estar matrículado en un módulo. 
        Trata de mostrar un solo decimal en los porcentajes.
        
        */
        
        //declarando variable y constante
        final int MAXIMO_ALUMNOS_POR_MODULO = 48;
        int progracionMatriculados, bdMatriculados,entornoMatriculados;
        float porcentajeProgramacion, porcentajeBD, porcentajeEntorno;
        
        //ingresar una cantidad de matriculados por teclado para cada modulo
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca cantidad de matriculados en programación: " );
        progracionMatriculados = teclado.nextInt();
        System.out.print( "Introduzca cantidad de matriculados en base de datos: " );
        bdMatriculados = teclado.nextInt();
        System.out.print( "Introduzca cantidad de matriculados en enorno de desarrollo: " );
        entornoMatriculados = teclado.nextInt();
           
        //proceso   
        porcentajeProgramacion =(100 * progracionMatriculados)/MAXIMO_ALUMNOS_POR_MODULO;
        porcentajeBD = (100 * bdMatriculados)/MAXIMO_ALUMNOS_POR_MODULO;
        porcentajeEntorno = (100* entornoMatriculados)/MAXIMO_ALUMNOS_POR_MODULO;
        
        DecimalFormat decimal = new DecimalFormat(("#.0")); //con esta linea conseguiremos que se muestre 1 decimal
        
        //imprimir en pantalla
        
        System.out.printf("%s%s%s\n%s%s%s\n%s%s%s",
                "Porcentaje de matriculados en programacion ->",decimal.format(porcentajeProgramacion),"%",
                "Porcentaje de matriculados en base de datos ->", decimal.format(porcentajeBD),"%",
                "Porcentaje de matriculados en entorno de desarrollo ->", decimal.format(porcentajeEntorno),"%");
        
        
    }
}
