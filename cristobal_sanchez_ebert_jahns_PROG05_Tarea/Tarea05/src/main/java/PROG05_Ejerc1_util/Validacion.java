/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1_util;

import java.time.LocalDate;

/**
 *
 * @author Ebert
 */
public class Validacion {

    //validacion para ingresar el kilometraje en numero positivo
    public static boolean esPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // validacion para no ingresar una fecha mayor a la actual (hoy)
    public static boolean fechaMayorHoy(LocalDate fecha) {

        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(fecha)) {
            return true;
        } else {
            return false;
        }

    }
    
    //validacion para no ingrear mas de nueve caracteres en el dni
    public static boolean validarDNI(String DNI) {

        if (DNI.length() != 9) {
            return false;
        }
        
        
        String DNInum = DNI.substring(0, DNI.length() - 1);
        char DNILetra = DNI.charAt(DNI.length() - 1);

        int numDNI;
        
        // Se utilizan excepciones para informar de error en el DNI.
        //si el dni ingresado contiene 9 digitos arrojar un error
        try {
            numDNI = Integer.parseInt(DNInum);
        } catch (NumberFormatException e) {
            return false;
        }
        
        //comprueba que el caracter sea una letra
        if (!Character.isAlphabetic(DNILetra)) {
            return false;
        }

        String DNINuevo = DNInum + DNILetra;

        if (DNI.equals(DNINuevo)) {
            return true;
        } else {
            return false;
        }

    }

}
