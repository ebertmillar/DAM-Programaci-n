/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.Validacion;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ebert
 */
public class Principal {

    public static void main(String[] args) {

        //declarando variables
        String marca, matricula, descripcion, nombreProp, DNIProp;
        int km, dia, mes, anio;
        double precio;
        LocalDate fechaMatriculacion;

        //leer -> numero de la opcion para seleccionar
        Scanner op = new Scanner(System.in);
        op.useDelimiter("\n");
        op.useLocale(Locale.US);

        //inicializando varaibles salir, opcion y vehiculo
        boolean salir = false;
        int opcion;
        Vehiculo vehiculo = null;

        while (!salir) {

            try {
                //menu de opciones
                System.out.println("1. Nuevo Vehiculo.");
                System.out.println("2. Ver Matrícula.");
                System.out.println("3. Ver Número de Kilómetros.");
                System.out.println("4. Actualizar Kilómetros.");
                System.out.println("5. Ver años de antigüedad.");
                System.out.println("6. Mostrar propietario.");
                System.out.println("7. Mostrar descripción.");
                System.out.println("8. Mostrar Precio.");
                System.out.println("9. Salir.");
                System.out.println("Escoge una opcion : ");
                opcion = op.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Introduce la marca");
                        marca = op.next();

                        System.out.println("Introduce la matricula");
                        matricula = op.next();

                        System.out.println("Introduce el numero de km");
                        km = op.nextInt();

                        if (!Validacion.esPositivo(km)) {
                            throw new Exception("kilometraje no puede ser negativo");
                        }

                        System.out.println("Introduce el dia de la fecha de matriculacion");
                        dia = op.nextInt();

                        System.out.println("Introduce el mes de la fecha de matriculacion");
                        mes = op.nextInt();

                        System.out.println("Introduce el año de la fecha de matriculacion");
                        anio = op.nextInt();

                        fechaMatriculacion = LocalDate.of(anio, mes, dia);

                        if (Validacion.fechaMayorHoy(fechaMatriculacion)) {
                            throw new Exception("la fecha de matriculacion es mayor a la de hoy");
                        }

                        System.out.println("Introduce la descripcion");
                        descripcion = op.next();

                        System.out.println("Introduce el nombre del propietario");
                        nombreProp = op.next();

                        System.out.println("Introduce el dni del propietario");
                        DNIProp = op.next();

                        if (!Validacion.validarDNI(DNIProp)) {
                            throw new Exception("DNI ingresado no es valido");
                        }

                        System.out.println("Introduce el precio");
                        precio = op.nextDouble();

                        //Se instancia Vehiculo con todos los datos ingresados por teclado
                        vehiculo = new Vehiculo(marca, matricula, km, fechaMatriculacion, descripcion, precio, nombreProp, DNIProp);
                        System.out.println("Vehiculo creado");

                        break;

                    case 2:
                        if (vehiculo != null) {
                            System.out.println("Matricula: " + vehiculo.getMatricula());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 3:

                        if (vehiculo != null) {
                            System.out.println("KM: " + vehiculo.getNumeroKM());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 4:

                        if (vehiculo != null) {

                            System.out.println("Introduce el numero de kilometros");
                            km = op.nextInt();

                            if (!Validacion.esPositivo(km)) {
                                throw new Exception("kilometraje no puede ser negativo");
                            }

                            vehiculo.setNumeroKM(km);
                            System.out.println("Kilometraje actualizados");

                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }

                        break;

                    case 5:

                        if (vehiculo != null) {
                            System.out.println("Antiguedad: " + vehiculo.get_Anios() + " años");
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }

                        break;

                    case 6:

                        if (vehiculo != null) {
                            System.out.println("Propietario: " + vehiculo.getDniPropietario() + " " + vehiculo.getNombrePropietario());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 7:

                        if (vehiculo != null) {
                            System.out.println("Descripcion: " + vehiculo.getDescripcion());
                            System.out.println("Matricula: " + vehiculo.getMatricula());
                            System.out.println("KM: " + vehiculo.getNumeroKM());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }

                        break;

                    case 8:

                        if (vehiculo != null) {
                            System.out.println("Precio: " + vehiculo.getPrecio());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Elige una opcion entre 1 y 9");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
