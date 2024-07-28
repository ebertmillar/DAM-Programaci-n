/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog04_ejerc04;

import java.util.Scanner;

/**
 *
 * @author ebert cristobal sanchez
 */
public class PROG04_Ejerc04 {

    /**
     * este es el metodo principal que ejecutara el juego en java
     * el juego conisste en adivinar un numero oculto
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables y constantes
        int NUM_INT = 5;
        int NUM_MAX = 10;
        int numInt = NUM_INT;
        int numMax = NUM_MAX;
        int option = 0;
        
        //proceso
        while (option != 3) {
            //creando el menu con switch
            Scanner sc = new Scanner(System.in);
            System.out.println("================Menu===============");
            System.out.println("1.Configurar");
            System.out.println("2.Jugar");
            System.out.println("3.Salir");
            System.out.print("escoja una opcion : ");
            option = sc.nextInt();
            
            //indicando que hacer al seleccionar cada una de las opciones
            switch (option) {
                case 1:
                    System.out.println("Introduce el numero de intentos");
                    numInt = sc.nextInt();
                    System.out.println("Introduce el numero maximo generado");
                    numMax = sc.nextInt();
                    break;

                case 2:
                    int numOculto = (int) Math.floor(Math.random() * numMax + 1);
                    int intentosJugador = 1;
                    int numJugador = 0;
                    boolean acertado = false;

                    while (intentosJugador <= numInt && !acertado) {

                        System.out.println("Introduce un numero");
                        numJugador = sc.nextInt();

                        if (numJugador == numOculto) {
                            System.out.println("Has ganado!. Has necesitado " + intentosJugador + " intentos");
                            acertado = true;
                        } else {
                            if (numJugador > numOculto) {
                                System.out.println("El numero oculto es menor");
                            } else {
                                System.out.println("El numero oculto es mayor");
                            }
                            System.out.println("Te quedan " + (numInt - intentosJugador) + " intentos");
                            intentosJugador++;
                        }

                    }
                    break;

                case 3:
                    System.out.println("ha finalizado");
                    break;
                default:
                    System.out.println("esta opcion no es valida");
            }

        }
    }

}
