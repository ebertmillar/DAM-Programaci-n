/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

/**
 *
 * @author Ebert
 */

//clase CuentaAhorro que hereda de la clase CuentaBancaria
public class CuentaAhorro extends CuentaBancaria{
    
    //declaracion de atributo de la clase CuentaAhorro;
    private double tipoInteresAnual;

    /**
     * Cosntructor cuenta de ahorros con paramentros
     * @param tipoInteresAnual
     * @param titular
     * @param saldo
     * @param IBAN 
     */
    public CuentaAhorro(double tipoInteresAnual, Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
        this.tipoInteresAnual = tipoInteresAnual;
    }

    //getters and setters
    public double getTipoInteresAnual() {
        return tipoInteresAnual;
    }

    public void setTipoInteresAnual(double tipoInteresAnual) {
        this.tipoInteresAnual = tipoInteresAnual;
    }

    
     /*
    Cuando se llame a super.devolverInfoString() sirve para acceder a atributos de uan clase superior
    es decir que mostrara devolverInfoString() de la clase CuentaBancaria
    trayendo asi el nombre, apellidos y dni.
    */
    @Override
    public String devolverInfoString(){
        return "Cuenta Ahorro\n" + super.devolverInfoString() + "\nTipo de Interes Anual: " + tipoInteresAnual; 
    }

    

    
}