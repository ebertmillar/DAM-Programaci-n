/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

import java.io.Serializable;

/**
 *
 * @author Ebert
 */


//Para esta tarea se implenta Serializable
public abstract class CuentaBancaria implements Imprimible, Serializable{
    
    //declaracion de atributos de la clase CuentaBancaria
    private Persona titular;
    private double saldo;
    private String IBAN;

    /**
     * Constructor CuentaBancaria con parametros
     * @param titular
     * @param saldo
     * @param IBAN 
     */
    public CuentaBancaria(Persona titular, double saldo, String IBAN) {
        this.titular = titular;
        this.saldo = saldo;
        this.IBAN = IBAN;
    }

    
   //getters and setters de los atributos declarados
    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    
    /*
    devolverInfoString, que devolverá la información de una cuenta como una cadena de caracteres.
    cuando se llame a titular.devolverInfoString() devolvera la cadena declara en la clase Persona
    trayendo asi el nombre, apellidos y dni.
    */
    @Override
    public String devolverInfoString(){
        return "Titular de la Cuenta: " + titular.devolverInfoString() + "\nSaldo: " + saldo + "\nIBAN: " + IBAN;
    }

    

    
    
}
