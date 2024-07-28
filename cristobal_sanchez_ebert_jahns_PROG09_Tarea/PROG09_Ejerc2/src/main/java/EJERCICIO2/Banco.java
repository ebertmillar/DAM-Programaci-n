/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * @param cuenta
     * @return 
     */
    public boolean abrirCuenta(CuentaBancaria cuenta) {

        //si se intenta crear una cuenta con un IBAN ya existente retornara false
        CuentaBancaria existe = this.buscarCuenta(cuenta.getIBAN());
        if (existe != null) {
            System.out.println("Esta cuenta bancaria ya existe ");
            return false;
        }

        this.cuentas.add(cuenta);
        return true;

    }

    /**
     * Metodo para mostrar las cuentas
     * @return 
     */
    public String[] listadoCuentas() {
        String[] listaCuentas = new String[this.cuentas.size()];
        for (int i = 0; i < listaCuentas.length; i++) {
            listaCuentas[i] = this.cuentas.get(i).devolverInfoString();
        }
        return listaCuentas;

    }

    /**
     * Obtenemos la informacion de la cuenta
     * @param IBAN
     * @return 
     */
    public String informacionCuenta(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            return cuenta.devolverInfoString();
        }
        return null;
    }

    /**
     * Metodo para ingresar una cantidad a una cuenta
     * @param IBAN
     * @param cantidad
     * @return 
     */
    public boolean ingresoCuenta(String IBAN, double cantidad) {

        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            return true;
        }
        return false;
    }

    /**
     * Metodo para retirar saldo de una cuenta
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
     * @param IBAN
     * @return 
     */
    public boolean borrarCuenta(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {

            for (CuentaBancaria cuentaSeleccionada : this.cuentas) {
                if (cuentaSeleccionada.getIBAN().equals(IBAN) && cuentaSeleccionada.getSaldo() == 0) {
                    this.cuentas.remove(cuentaSeleccionada);
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * Metodo para buscar una cuenta por su IBAN
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

    //Genera un fichero .txt con la informacion de las cuentas, se espera datos del titular cuenta, IBAN y numero de cuentas en total
    public void generarListadoClientes() {

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("ListadoClientesCCC.txt"));) {
           
            String lineaTexto;
            // Recorro cada cuenta
            for (CuentaBancaria cuenta : cuentas) {
                lineaTexto = "\n" + cuenta.getTitular().devolverInfoString() + " " + cuenta.getIBAN() + "\r\n";
                bw.write(lineaTexto);
            }
            bw.write("\nN° total de cuentas existentes: " + cuentas.size());
        } catch (IOException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
