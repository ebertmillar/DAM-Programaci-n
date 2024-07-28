/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

/**
 *
 * @author Ebert
 */

//clase abstracta CuentaCorriente que hereda de la clase CuentaBancaria
public abstract class CuentaCorriente  extends CuentaBancaria{
    
    //Declaracion de atributos de la clase CuentaCorriente
    private String entidadesAutorizadasCobro;

    /**
     * constructor de la clase CuentaCorriente que hereda atributos de la la clase Cuentabancaria
     * @param entidadesAutorizadasCobro
     * @param titular
     * @param saldo
     * @param IBAN 
     */
    public CuentaCorriente(String entidadesAutorizadasCobro, Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
        this.entidadesAutorizadasCobro = entidadesAutorizadasCobro;
    }

    //getter and seterr de lso atributos 
    public String getEntidadesAutorizadasCobro() {
        return entidadesAutorizadasCobro;
    }

    public void setEntidadesAutorizadasCobro(String entidadesAutorizadasCobro) {
        this.entidadesAutorizadasCobro = entidadesAutorizadasCobro;
    }


     /*
    Cuando se llame a super.devolverInfoString() sirve para acceder a atributos de una clase superior
    es decir que mostrara devolverInfoString() de la clase CuentaBancaria
    */
    @Override
    public String devolverInfoString(){
        return super.devolverInfoString() + "\nEntidad Autorizada del Cobro: " + entidadesAutorizadasCobro; 
    }
    

   
}
