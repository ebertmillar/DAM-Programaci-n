/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO1;

/**
 *
 * @author Ebert
 */

//clase CuentaCorrientePersonal que contiene a la clase CuentaCorriente
public class CuentaCorrientePersonal extends CuentaCorriente {

    //declaracion de atributos de la clase CuentaCorrientePersonal
    private double comisionMantenimiento;

    
    //Cosntructor de la clase CuentaCorrienteEmpresa que hereda atributos de la clase CuentaCorriente
    public CuentaCorrientePersonal(double comisionMantenimiento, String entidadesAutorizadasCobro, Persona titular, double saldo, String IBAN) {
        super(entidadesAutorizadasCobro, titular, saldo, IBAN);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    //getters and setters
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    /*
    Cuando se llame a super.devolverInfoString() sirve para acceder a atributos de una clase superior
    es decir que mostrara devolverInfoString() de la clase CuentaCorriente
     */
    @Override
    public String devolverInfoString() {
        return "Cuenta Corriente Personal\n" + super.devolverInfoString() + "\nComision por mantenimiento: " + comisionMantenimiento;
    }

}
