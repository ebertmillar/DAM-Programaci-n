/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc6 {

    public static void main(String[] args) {
        /*
        
        6. Diseña un programa Java  denominado PROG02_Ejerc6 
        que cree un tipo enumerado para las siguientes razas de perro: 
        Mastín, Terrier, Bulldog, Pekines, Caniche y Galgo. 
        El programa debe realizar las siguientes operaciones:
        
        Crea una variable denominada var1 del tipo enumerador. Asígnale un valor.
        Crea una variable denominada var2 del tipo enumerador. Asígnale un valor.
        Muestra por pantalla el valor obtenido de comparar ambas variables.
        
        */
        
        //declarando y asignando valor a la variables
        enum raza{Mastín, Terrier, Bulldog, Pekines, Caniche,Galgo}       
        raza var1 = raza.Bulldog;
        raza var2 = raza.Mastín;
        
        //impresion en panatlla
        //values().length cuenta la cantidad de elementos del enum
        //ordinal() muestra la posicon del elemento

        System.out.println("la raza de perro de var1 es: " +var1 
                + " la posicion que ocupa en el enumerado es: " +var1.ordinal()
                +"\nla raza de perro de var2 es :" +var2
                + " la posicion que ocupa en el enumerado es: " +var2.ordinal());
        
        System.out.println("\n Exiten " +raza.values().length 
                + " razas de perro");
    }
}
