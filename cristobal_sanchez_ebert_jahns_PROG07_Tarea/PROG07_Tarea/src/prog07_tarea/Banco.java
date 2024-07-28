/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog07_tarea;

/**
 *
 * @author Ebert
 */
public class Banco {

    //Atributos de la clase banco
    private CuentaBancaria[] cuentas; 
    private final int TOTAL_CUENTAS = 100;
    private int numeroCuentasExistentes;

    //Constructor banco sin parameteros
    public Banco() {
        this.cuentas = new CuentaBancaria[this.TOTAL_CUENTAS];
        this.numeroCuentasExistentes = 0;
    }
    
    
    /*
    Metodo abriCuenta
    Recibe por parámetro un objeto CuentaBancaria y lo almacena en la estructura. 
    Devuelve true o false indicando si la operación se realizó con éxito.
    */
    public boolean abrirCuenta(CuentaBancaria cuenta) {
        
        /*
        Si el numero de cuentas existentes es igual o mayor que numero maximo permitido 
        retornara un false y no permitira que se cree una nueva cuenta.
        */
        if (this.numeroCuentasExistentes >= this.TOTAL_CUENTAS) {
            System.out.println("No hay espacio suficiente para aperturar una nueva cuenta");
            return false;
        }

        //si se intenta crear una cuenta con un IBAN ya existente retornara false
        CuentaBancaria existe = this.buscarCuenta(cuenta.getIBAN());
        if (existe != null) {
            System.out.println("Esta cuenta bancaria ya existe ");
            return false;
        }

        this.cuentas[this.numeroCuentasExistentes] = cuenta;
        this.numeroCuentasExistentes++;
        return true;

    }

    /*
    Metodo listadoCuentas
    No recibe parámetro y devuelve un array donde cada elemento es una cadena 
    que representa la información de una cuenta.
    */
    public String[] listadoCuentas() {
        String[] listaCuentas = new String[this.numeroCuentasExistentes];
        for (int i = 0; i < this.numeroCuentasExistentes; i++) {
            listaCuentas[i] = this.cuentas[i].devolverInfoString();
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
    Metodo buscarCuenta
    Este metodo permite encontrar una cuenta, recorre el array hasta encontrar
    la cuenta que tenga el mismo IBAN que se ha ingresado por parametro.
    Este metodo se reutiliza en los demas metodos
    */
    private CuentaBancaria buscarCuenta(String IBAN) {

        for (int i = 0; i < this.numeroCuentasExistentes; i++) {
            if (this.cuentas[i].getIBAN().equals(IBAN)) {
                return this.cuentas[i];
            }
        }
        return null;
    }

}
