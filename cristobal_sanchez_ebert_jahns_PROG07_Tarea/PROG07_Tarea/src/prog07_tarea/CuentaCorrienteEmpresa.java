/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog07_tarea;

/**
 *
 * @author Ebert
 */
//clase CuentaCorrienteEmpresa que contiene a la clase CuentaCorriente
public class CuentaCorrienteEmpresa extends CuentaCorriente {

    //declaracion de atributos de la clase CuentaCorrienteEmpresa
    private double tipoInteresDescubierto;
    private double maximoDescubiertoPermitido;
    private double comisionFijaDescubierto;

    //Cosntructor de la clase CuentaCorrienteEmpresa que hereda atributos de la clase CuentaCorriente
    public CuentaCorrienteEmpresa(double tipoInteresDescubierto, double maximoDescubiertoPermitido, double comisionFijaDescubierto, String entidadesAutorizadasCobro, Persona titular, double saldo, String IBAN) {
        super(entidadesAutorizadasCobro, titular, saldo, IBAN);
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }

    //getters and setters
    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getMaximoDescubiertoPermitido() {
        return maximoDescubiertoPermitido;
    }

    public void setMaximoDescubiertoPermitido(double maximoDescubiertoPermitido) {
        this.maximoDescubiertoPermitido = maximoDescubiertoPermitido;
    }

    public double getComisionFijaDescubierto() {
        return comisionFijaDescubierto;
    }

    public void setComisionFijaDescubierto(double comisionFijaDescubierto) {
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }

    
     /*
    Cuando se llame a super.devolverInfoString() sirve para acceder a atributos de una clase superior
    es decir que mostrara devolverInfoString() de la clase CuentaCorriente
    */
    @Override
    public String devolverInfoString() {
        return "Cuenta Corriente Empresa\n" + super.devolverInfoString() + "\nTipo de interes por Descubierto: " + tipoInteresDescubierto + " \nMaximo de Descubierto permitido: " + maximoDescubiertoPermitido + "\nComision fija por Descubierto=" + comisionFijaDescubierto;
    }

}
