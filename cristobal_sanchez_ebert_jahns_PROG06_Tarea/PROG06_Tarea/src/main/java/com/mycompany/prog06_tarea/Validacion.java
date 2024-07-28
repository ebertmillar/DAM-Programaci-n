package com.mycompany.prog06_tarea;

/**
 *
 * @author Ebert
 */
public class Validacion {

    //validar DNI
    public static boolean validarDNI(String DNI) {
        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
    }

    //validar matricula
    public static boolean validarMatricula(String matricula) {
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }

    //validar nombre - colocar nombres y apellidos
    public static boolean validarNombre(String nombre) {

        if (nombre.length() > 30) {
            return false;
        }

        char caracter;
        int numeroEspacios = 0;
        for (int i = 0; i < nombre.length(); i++) {
            caracter = nombre.charAt(i);
            if (caracter == ' ') {
                numeroEspacios++;
            }
            if (Character.isDigit(caracter)) {
                return false;
            }
        }

        if (numeroEspacios >= 2) {
            return true;
        }
        return false;
    }

}
