/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2;

import java.util.Scanner;

/**
 *
 * @author Ebert
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        //declaraciony asignacion de variables
        String nombre, apellidos, dni, listaEntidadesAutorizada, IBAN, informacionCuenta;
        int opcion, tipoCuenta;
        String[] listaCuentas;

        double tipoInteres, comisionMantenimiento, saldo, comisionFijaDescubierto;
        double maximoDescubierto, tipoInteresDescubierto, ingresoCuenta, cantidad;
        boolean salir = false;
        boolean salirCuenta = false;
        Persona titularCuenta;
        CuentaBancaria cuenta = null;
        Banco banco = new Banco();

        Scanner teclado = new Scanner(System.in);
        
        //while que permite que el programa se ejecute hasta que se presione el numero 6
        while (!salir) {

            try {

                System.out.println("\n=======MENU========");
                System.out.println("1. Abrir una nueva cuenta ");
                System.out.println("2. Ver un listado de cuentas disponibles ");
                System.out.println("3. Obtener los datos de una cuenta concreta ");
                System.out.println("4. ingresar Efectivo de una cuenta ");
                System.out.println("5. Retirar Efectivo de una cuenta ");
                System.out.println("6. Consultar el saldo actual de una cuenta");
                System.out.println("7. Eliminiar Cuenta");
                System.out.println("8. Listado Clientes");
                System.out.println("9. Salir de la aplicacion");
                System.out.print("Selecciona una opcion : ");
                opcion = teclado.nextInt();
                
        
                switch (opcion) {
                    case 1:
                        System.out.println("\n==REGISTRAR DATOS PERSONALES==");
                        System.out.print("Ingresa nombre del Titular: ");
                        nombre = teclado.next().toUpperCase();

                        System.out.print("Ingresa apellidos del Titular: ");
                        apellidos = teclado.next().toUpperCase();
                        ;

                        System.out.print("ingresa DNI del Titular: ");
                        dni = teclado.next().toUpperCase();

                        //ingresados se crea el objeto persona y se le signa a la varaible titularCuenta
                        titularCuenta = new Persona(nombre, apellidos, dni);

                        System.out.print("Ingresa el IBAN :  ");
                        IBAN = teclado.next();

                        if (!IBAN.matches("^ES[0-9]{20}$")) {
                            System.err.println("El IBAN no tiene el formato correcto");
                            throw new Exception("El IBAN no tiene el formato correcto");
                        }

                        System.out.print("Ingresar el Saldo: ");
                        saldo = teclado.nextDouble();
                        
                        
                        salirCuenta = false;
                        
                        //while (!salirCuenta), va a obligar a que se escoja un tipo de cuenta bancaria
                        //el bucle se repite hasta que no se elija la opcion correspondiente a unh tipo de cuenta
                        while (!salirCuenta) {
                            System.out.println("\n==TIPO DE CUENTA QUE VA A ABRIR");
                            System.out.println("1. Cuenta de ahorros  ");
                            System.out.println("2. Cuenta corriente Personal ");
                            System.out.println("3. Cuenta Corriente Empresa ");
                            System.out.print("Seleccione el tipo de cuenta: ");
                            tipoCuenta = teclado.nextInt();

                            switch (tipoCuenta) {
                                case 1:
                                    System.out.print("Introduce tipo de interes : ");
                                    tipoInteres = teclado.nextDouble();
                                    
                                    
                                    //si se selecciona la opcion 1, se crea el objeto CuentaAhorro y se le signa a la variable cuenta
                                    cuenta = new CuentaAhorro(tipoInteres, titularCuenta, saldo, IBAN);
                                    salirCuenta = true; //si se escoge esta opcion salirCuenta se hace true y termina el bucle
                                    break;
                                    
                                case 2:
                                    System.out.print("Introduce entidad autorizada: ");
                                    listaEntidadesAutorizada = teclado.next().toUpperCase();
                                    System.out.print("Introduce la comision de mantenimiento:  ");
                                    comisionMantenimiento = teclado.nextDouble();
                                    
                                    //si se selecciona la opcion 2, se crea el objeto CuentaCorrientePersonal y se le asigna a la variable cuenta
                                    cuenta = new CuentaCorrientePersonal(comisionMantenimiento, listaEntidadesAutorizada, titularCuenta, saldo, IBAN);
                                    salirCuenta = true;//si se escoge esta opcion salirCuenta se hace true y termina el bucle
                                    break;
                                    
                                case 3:
                                    System.out.print("Introduce entidad autorizada: ");
                                    listaEntidadesAutorizada = teclado.next().toUpperCase();
                                    System.out.print("Introduce tipo de interes Descubierto:  ");
                                    tipoInteresDescubierto = teclado.nextDouble();
                                    System.out.print("Introduce el Maximo Descubierto:  ");
                                    maximoDescubierto = teclado.nextDouble();
                                    System.out.print("Ingresa comision fija por Descubierto:  ");
                                    comisionFijaDescubierto = teclado.nextDouble();
                                    
                                    //si se selecciona la opcion 3, se crea el objeto CuentaCorrienteEmpresa y se le asigna a la variable cuenta
                                    cuenta = new CuentaCorrienteEmpresa(tipoInteresDescubierto, maximoDescubierto, comisionFijaDescubierto,
                                            listaEntidadesAutorizada, titularCuenta, saldo, IBAN);
                                    salirCuenta = true;//si se escoge esta opcion salirCuenta se hace true y termina el bucle
                                    break;

                                default:
                                    System.err.println("Ingresa un numero entre 1 y 3");
                            }

                            //hacer si la cuenta se ha creado correctamente.
                            if (banco.abrirCuenta(cuenta)) {
                                System.out.println("LA CUENTA SE ABRIO CORRECTAMENTE\n");

                            } else {
                                System.out.println("NO SE PUDO ABRIR LA CUENTA\n");
                            }

                        }

                         
                        break;

                    case 2:
                        
                        listaCuentas = banco.listadoCuentas();
                        
                        //recorre el array listaCuentas y los muestra todos
                        for (int i = 0; i < listaCuentas.length; i++) {
                            System.out.println("\n" + (i + 1) + ".- DATOS DE LA CUENTA");
                            System.out.println(listaCuentas[i]);
                        }
                        break;
                    case 3:
                        
                        System.out.print("Ingresa el IBAN :  ");
                        IBAN = teclado.next();

                        //busca la informacion de la cuenta que tenga el IBAN ingresado por parametro 
                        //y se la asiga a la variable informacionCuenta
                        informacionCuenta = banco.informacionCuenta(IBAN);

                        if (informacionCuenta != null) {
                            System.out.println("\n" + informacionCuenta);
                        } else {
                            System.out.println("lA CUENTA SOLICITADA NO EXISTE");

                        }

                        break;
                                               
                    case 4:
                        
                        System.out.print("Ingresa el IBAN:  ");
                        IBAN = teclado.next();
                        
                        System.out.print("Ingresa cantidad  que va a ingresar:  ");
                        cantidad = teclado.nextDouble();
                        
                        //busca la informacion de la cuenta que tenga el IBAN ingresado por parametro
                        //en el metodo retiradaCuenta, si al saldo se le resta la cantida y el resultado no es menor  ó = 0 es true
                        if (banco.ingresoCuenta(IBAN, cantidad)) {
                            System.out.println("\nEL INGRESO SE REALIZO CORRECTAMENTE"  );
                        } else {
                            System.out.println("NO SE PUDO INGRESAR LA CANTIDAD");
                        }

                        break;
                        
                    case 5:
                        
                        System.out.print("Ingresa el IBAN:  ");
                        IBAN = teclado.next();
                        
                        System.out.print("Ingresa cantidad  que va a retirar:  ");
                        cantidad = teclado.nextDouble();
                        
                        //busca la informacion de la cuenta que tenga el IBAN ingresado por parametro
                        //en el metodo retiradaCuenta, si al saldo se le resta la cantida y el resultado no es menor  ó = 0 es true
                        if (banco.retiradaCuenta(IBAN, cantidad)) {
                            System.out.println("\nEL RETIRO SE REALIZO CORRECTAMENTE"  );
                        } else {
                            System.out.println("NO SE PUDO RETIRAR LA CANTIDAD");
                        }

                        break;

                    case 6:
                        
                        System.out.print("Ingresa el IBAN:  ");
                        IBAN = teclado.next();
                        
                        //busca la informacion de la cuenta que tenga el IBAN ingresado por parametro
                        // el metodo obtnerSaldo se le asigna a la variable saldo, para poderla mostrar por pantalla
                        saldo = banco.obtenerSaldo(IBAN);
                        
                        if (saldo != -1) {
                            System.out.println("\nEL SALDO ES: " +saldo  );
                        } else {
                            System.out.println("\n LA CUENTA INGRESADA NO EXISTE");
                        }
                        
                        break;
                        
                    // al metodo borrarCuenta se le pasa como parametro el IBAN 
                    // si el IBAN ingresado por teclado existe elimina la cuenta     
                    case 7:
                        System.out.print("Introduce IBAN: ");
                        IBAN = teclado.next();
                        
                        if(banco.borrarCuenta(IBAN)){
                            System.out.println("\nLA CUENTA SE HA ELIMINADO"  );
                        }else{
                            System.out.println("\nLA CUENTA NO SE HA ELIMINADO"  );
                        }
                        
                        break;
                    case 8:
                        banco.generarListadoClientes();
                        System.out.println("SE HA GENERADO UN LISTADO DE CLIENTES");
                        
                        break;
                    case 9:
                        salir = true;
                        System.out.println("EL PROGRAMA HA FINALIZADO");
                        break;
                    default:
                        System.err.println("Ingresa un numero entre 1 y 6");
                }

            } catch (Exception e) {
                System.err.println("algo salio mal al ejecutar la aplicacion");
            }

        }

    }

}
