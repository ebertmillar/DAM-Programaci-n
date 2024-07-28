/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

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
    
    /*
    Metodo abriCuenta
    Recibe por parámetro un objeto CuentaBancaria y lo almacena en la estructura. 
    Devuelve true o false indicando si la operación se realizó con éxito.
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

    /*
    Metodo listadoCuentas
    No recibe parámetro y devuelve un array donde cada elemento es una cadena 
    que representa la información de una cuenta.
    */
    public String[] listadoCuentas() {
        String[] listaCuentas = new String[this.cuentas.size()];
        for (int i = 0; i < listaCuentas.length; i++) {
            listaCuentas[i] = this.cuentas.get(i).devolverInfoString();
        }
        return listaCuentas;

    }

    /*
    Metodo informacionCuenta
    Recibe un iban por parámetro y devuelve una cadena con la información de la cuenta o null si la cuenta no existe.
    */
    public String informacionCuenta(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            return cuenta.devolverInfoString();
        }
        return null;
    }
    
    /*
    Metodo retiradaCuenta
    ecibe un iban por parámetro y una cantidad e ingresa la cantidad en la cuenta. 
    Devuelve true o false indicando si la operación se realizó con éxito.
    */
    public boolean ingresoCuenta(String IBAN, double cantidad) {

        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            return true;
        }
        return false;
    }

    /*
    Metodo retiradaCuenta
    recibe un iban por parámetro y una cantidad y trata de retirar la cantidad de la cuenta. 
    Devuelve true o false indicando si la operación se realizó con éxito..
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

     /*
    Metodo obtenerSaldo
    Recibe un iban por parámetro y devuelve el saldo de la cuenta si existe. 
    En caso contrario devuelve -1.
    */
    public double obtenerSaldo(String IBAN) {
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        return -1;
    }
    
    
     /*
    Metodo borrarCuenta
    Recibe un iban por parámetro recorre todo el array y cuando encuentra la cuents que quiere
    eliminar va a comprobar si la cuenta tiene de saldo 0, de ser asi se procede a eliminar la cuenta .
    */
    public boolean borrarCuenta(String IBAN){
        CuentaBancaria cuenta = this.buscarCuenta(IBAN);
        if(cuenta!=null){
            
            for (CuentaBancaria cuentaSeleccionada: this.cuentas) {
                 if(cuentaSeleccionada.getIBAN().equals(IBAN) && cuentaSeleccionada.getSaldo() == 0){
                     this.cuentas.remove(cuentaSeleccionada);
                     return true;
                 }
            }
            
        }
        return false;
    }
    
    
    /*
    Metodo buscarCuenta
    Este metodo permite encontrar una cuenta, recorre el array hasta encontrar
    la cuenta que tenga el mismo IBAN que se ha ingresado por parametro.
    Este metodo se reutiliza en los demas metodos
    */
    private CuentaBancaria buscarCuenta(String IBAN) {

        for (CuentaBancaria cuenta: this.cuentas) {
            if (cuenta.getIBAN().equals(IBAN)) {
                return cuenta;
            }
        }
        return null;
    }

}
