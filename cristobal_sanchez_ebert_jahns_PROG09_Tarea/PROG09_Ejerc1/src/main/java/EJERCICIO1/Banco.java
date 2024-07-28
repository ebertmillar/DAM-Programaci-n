/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ebert
 */
public class Banco {

    //Atributos de la clase banco
    private ArrayList<CuentaBancaria> cuentas; // reemplazamos private CuentaBancaria[] cuentas por un ArrayList; 

    //Constructor banco sin parameteros
    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    /**
     * Metodo para abri cuenta y añadir cada cuenta a una lista
     *
     * @param cuenta
     * @return
     */
    public boolean abrirCuenta(CuentaBancaria cuenta) {

        //si se intenta crear una cuenta con un IBAN ya existente retornara false
        //Busca si existe la cuenta
        CuentaBancaria existe = this.buscarCuenta(cuenta.getIBAN());

        //si se intenta crear una cuenta con un IBAN ya existente retornara false
        if (existe != null) {
            System.out.println("Esta cuenta bancaria ya existe ");
            return false;
        }
        //añadir cuenta a la lista
        this.cuentas.add(cuenta);
        return true;

    }

    /**
     * Metodo para mostrar las cuentas
     *
     * @return
     */
    public String[] listadoCuentas() {
        // Se crea un array con el numero de cuentas existentes
        String[] listaCuentas = new String[this.cuentas.size()];
        for (int i = 0; i < listaCuentas.length; i++) {
            //Obteniendo la infromacion de cada una de las cuentas
            listaCuentas[i] = this.cuentas.get(i).devolverInfoString();
        }
        return listaCuentas;

    }

    /**
     * Obtenemos la informacion de la cuenta
     *
     * @param IBAN
     * @return
     */
    public String informacionCuenta(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);

        //si la cuenta existe mostramos su informacion
        if (cuenta != null) {
            return cuenta.devolverInfoString();
        }
        return null;
    }

    /**
     * Metodo para ingresar una cantidad a una cuenta
     *
     * @param IBAN
     * @param cantidad
     * @return
     */
    public boolean ingresoCuenta(String IBAN, double cantidad) {

        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            //sumamos la cantidad al saldo
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            return true;
        }
        return false;
    }

    /**
     * Metodo para retirar saldo de una cuenta
     *
     * @param IBAN
     * @param cantidad
     * @return
     */
    public boolean retiradaCuenta(String IBAN, double cantidad) {

        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {

            //Si saldo - cantidad es mayor O igual que 0 retorna true
            if (cuenta.getSaldo() - cantidad >= 0) {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                return true;

            }
            return false;
        }
        return false;

    }

    /**
     * Metodo para obtener saldo de la cuenta
     *
     * @param IBAN
     * @return
     */
    public double obtenerSaldo(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        return -1;
    }

    /**
     * Metodo que eliminar una cuenta
     *
     * @param IBAN
     * @return
     */
    public boolean borrarCuenta(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {

            for (CuentaBancaria cuentaSeleccionada : this.cuentas) {
                // si saldo es igual a 0
                if (cuentaSeleccionada.getIBAN().equals(IBAN) && cuentaSeleccionada.getSaldo() == 0) {
                    this.cuentas.remove(cuentaSeleccionada);
                    return true;
                } else if ( cuentaSeleccionada.getIBAN().equals(IBAN) && cuentaSeleccionada.getSaldo() > 0) {
                    System.out.println("No puede eliminar la cuenta hasta dejar el saldo en 0");
                }

            }

        }
        return false;
    }

    /**
     * Metodo para buscar una cuenta por su IBAN
     *
     * @param IBAN
     * @return
     */
    private CuentaBancaria buscarCuenta(String IBAN) {

        for (CuentaBancaria cuenta : this.cuentas) {
            if (cuenta.getIBAN().equals(IBAN)) {
                return cuenta;
            }
        }
        return null;
    }

    /**
     * Metodo para buscar una cuenta por su IBAN
     *
     * @param IBAN
     * @return
     */
    public void guardarDatosCuentasBancarias() {

        try {

            FileOutputStream datosCuentas = new FileOutputStream("datoscuentasbancarias.dat.");
            ObjectOutputStream os = new ObjectOutputStream(datosCuentas);

            //guarda cada cuenta 
            for (CuentaBancaria cuenta : cuentas) {
                os.writeObject(cuenta);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * Metodo que sirve para guardar informacion de las cuentas en un fichero
     * binario
     */
    public void recuperarDatosCuentasBancarias() {

        try {

            FileInputStream datosCuenta = new FileInputStream("datoscuentasbancarias.dat");
            ObjectInputStream in = new ObjectInputStream(datosCuenta);

            //cuando ya no existan cuentas que recorrer salta el EOFException
            while (true) {
                CuentaBancaria cuenta = (CuentaBancaria) in.readObject();
                this.abrirCuenta(cuenta);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encontraron ficheros");
        } catch (EOFException ex) {
            System.out.println("SE HAN CARGADO LOS DATOS DESDE LE FICHERO BINARIO");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
