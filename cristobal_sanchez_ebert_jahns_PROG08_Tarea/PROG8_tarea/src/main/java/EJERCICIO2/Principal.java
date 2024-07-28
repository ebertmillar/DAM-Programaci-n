package EJERCICIO2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ebert
 */
public class Principal {

    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        teclado.useLocale(Locale.US);
        
        /*declaracion y asignacion de varaibles*/
        boolean salir = false;
        boolean correcto = false;
        int opcion;

        Concesionario concesionario = new Concesionario();
        Vehiculo v;
        String marca, matricula, descripcion, nombreProp, DNIProp;
        int kms = 0, dia, mes, anio;
        double precio = 0;
        LocalDate fechaMatriculacion = null;

        while (!salir) {

            System.out.println("*********************************");
            System.out.println("*****  MENÚ CONSESIONARIO   *****");
            System.out.println("*********************************");
            System.out.println("1. Nuevo Vehiculo");
            System.out.println("2. Listar Vehiculo");
            System.out.println("3. Buscar Vehiculo");
            System.out.println("4. Modificar Vehiculo");
            System.out.println("5. Eliminar Vehiculo");
            System.out.println("6. SALIR");
            System.out.print("ELIGE UNA OPCION : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Introduce la marca");
                    marca = teclado.next();

                    do {
                        System.out.println("Introduce la matricula");
                        matricula = teclado.next();
                    } while (!Validacion.validarMatricula(matricula));

                    do {
                        correcto = true;

                        try {
                            System.out.println("Introduce el numero de km");
                            kms = teclado.nextInt();
                        } catch (InputMismatchException e) {
                            correcto = false;
                            teclado.next();
                        }

                    } while (!correcto);

                    do {
                        correcto = true;

                        try {
                            System.out.println("Introduce el dia de la fecha de matriculacion");
                            dia = teclado.nextInt();

                            System.out.println("Introduce el mes de la fecha de matriculacion");
                            mes = teclado.nextInt();

                            System.out.println("Introduce el año de la fecha de matriculacion");
                            anio = teclado.nextInt();

                            fechaMatriculacion = LocalDate.of(anio, mes, dia);
                        } catch (InputMismatchException e) {
                            correcto = false;
                            teclado.next();
                        } catch (DateTimeException e) {
                            correcto = false;
                        }

                    } while (!correcto);

                    System.out.println("Introduce la descripcion");
                    descripcion = teclado.next();

                    do {
                        System.out.println("Introduce el nombre del propietario (NOMBRE Y DOS APELLIDOS)");
                        nombreProp = teclado.next();
                    } while (!Validacion.validarNombre(nombreProp));

                    do {
                        System.out.println("Introduce el dni del propietario");
                        DNIProp = teclado.next();
                    } while (!Validacion.validarDNI(DNIProp));

                    do {
                        correcto = true;

                        try {
                            System.out.println("Introduce el precio");
                            precio = teclado.nextDouble();
                        } catch (InputMismatchException e) {
                            correcto = false;
                            teclado.next();
                        }

                    } while (!correcto);

                    v = new Vehiculo(marca, matricula, kms, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);

                    switch (concesionario.insertarVehiculo(v)) {
                        case -2:
                            System.out.println("El vehiculo existe");
                            break;
                        case -1:
                            System.out.println("El concesionario esta lleno");
                            break;
                        case 0:
                            System.out.println("Vehiculo insertado correctamente");
                            break;
                    }

                    break;
                case 2:
                    concesionario.listarVehiculos();
                    break;
                case 3:

                    System.out.println("Inserta la matricula");
                    matricula = teclado.next();

                    v = concesionario.buscaVehiculo(matricula);

                    if (v != null) {
                        System.out.println(v.getMarca());
                        System.out.println(v.getMatricula());
                        System.out.println(v.getPrecio());
                    } else {
                        System.out.println("No existe el vehiculo con la matricula introducida");
                    }

                    break;
                case 4:
                    System.out.println("Inserta la matricula");
                    matricula = teclado.next();

                    System.out.println("Inserta los nuevos kms");
                    kms = teclado.nextInt();

                    if (concesionario.actualizaKms(matricula, kms)) {
                        System.out.println("Los kms se ha actualizado correctamente");
                    } else {
                        System.out.println("No existe el vehiculo con la matricula introducida");
                    }

                    break;

                case 5:
                    System.out.println("Introduce la Matricula");
                    matricula = teclado.next();
                    
                    if (concesionario.eliminarVehiculo(matricula)) {
                        System.out.println("El Vehiculo se ha eliminado");
                    } else {
                        System.out.println("El Vehiculo NO se ha eliminado");
                    }
                    
                    break;

                case 6:
                    salir = true;
                    break;
            }

        }

    }
}
