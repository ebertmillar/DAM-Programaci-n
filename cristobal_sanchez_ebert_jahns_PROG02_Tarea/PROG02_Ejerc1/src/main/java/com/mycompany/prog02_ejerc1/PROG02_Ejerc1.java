/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author devi_
 */
public class PROG02_Ejerc1 {

    public static void main(String[] args) {
        // 1. Valor máximo no modificable: 5000.
        //Es una constante y el tipo de dato es short porque 5000 esta dentro del rango
        //ocupa menos espacio en memoria y la constante no sufrira cambios
        final short valorMaximo = 5000;
        
        // 2. Si el nuevo empleado tiene carnet de conducir o no.
        // Sólo puede tener 2 valores true o false.
        boolean carnet = true;
        
        // 3.Un mes del año en formato numérido y como cadena.
        //Valor de mesNumerico de tipo short por que lo valores que puede tomar son de 1 a 12
        //y mesCadena de tipo String porque es una cadena
        short mesNumerico = 12; 
        String mesCadena ="diciembre";
        
        // 4. El nombre y apellidos de una persona.
        //nombre y apellido son de tipo String por tratarse de una cadena 
        String nombre ="ebert";
        String apellido="cristobal";
        
        // 5. Sexo: con dos valores posibles 'V' o 'M'.
        // variable de tipo "enumerado" con 2 posibles valores
        enum sexo{M,V}
        
        // 6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días es 1667079634117
        // Por tener un numero de 13 digitos utilizaremos el tipo de dato long
        long milisegundos = 1667079634117L;
        
        // 7. Saldo de una cuenta bancaria.
        // El tipo de dato es float porque la cuenta tiene
        //parte entera y parte decimal y el monto no es muy grande
        float saldoBanco = (float)15264.244;
        
        // 8. Distancia en kms desde la Tierra a Júpiter es 965,6 millones de kilómetros
        //utilizaremos la variable de tipo int al tratarse de 9 digitos esta dentro del rango 
        int distanciaTierraJupiter =965600000 ;
        
        
        /*se imprime el valor en pantalla sin utilizar la orden println*/
        
        System.out.printf("%s%s\n","1. Valor máximo no modificable ->",valorMaximo);
        System.out.printf("%s%s\n","2. El nuevo empleado tiene carnet de conducir? ->",carnet);
        System.out.printf("%s%s%s%s\n","3. el mes de -> ",mesCadena," en formato numerico es ", mesNumerico);
        System.out.printf("%s%s%s%s\n","4 .el nombre y apellido de una persona es: ",nombre," ", apellido);
        System.out.print("5. El sexo de la perosna es "+ sexo.M+ "\n");
        System.out.print("6. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días es -> "+milisegundos);
        System.out.printf("\n%s%s\n","7. El Saldo de una cuenta bancaria es: ",saldoBanco);
        System.out.printf("%s%s\n","8. Distancia en kms desde la Tierra a Júpiter ->",distanciaTierraJupiter);

         
    }
}
