package EJERCICIO2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Ebert
 */

/*¨implementamos Comparable<Vehiculo> para que  las 
lista del objeto vehiculo se pueden ordenar automáticamente por Collections.sort */
public class Vehiculo implements Comparable<Vehiculo>{

    //atributos del vehiculo: marca, matricula, numeroKM, fechaMatriculacion
    //descripcion, precio, nombrePropietario,dniPropietario
    private String marca;
    private String matricula;
    private int numeroKM;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;

    //contructor
    public Vehiculo() {
    }

    //contructor con parametros
    public Vehiculo(String marca, String matricula, int numeroKM, LocalDate fechaMatriculacion, String descripcion, double precio, String nombrePropietario, String dniPropietario) {
        this.marca = marca;
        this.matricula = matricula;
        this.numeroKM = numeroKM;
        this.fechaMatriculacion = fechaMatriculacion;
        this.nombrePropietario = nombrePropietario;
        this.descripcion = descripcion;
        this.precio = precio;
        this.dniPropietario = dniPropietario;
    }

    //getter and setter de los atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroKM() {
        return numeroKM;
    }

    public void setNumeroKM(int numeroKM) {
        this.numeroKM = numeroKM;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    //metodo creado para mostrar número de años del vehículo desde que se matriculó
    //se importo la clase Period
    public int get_Anios() {

        LocalDate f1 = this.fechaMatriculacion;
        LocalDate f2 = LocalDate.now();

        Period p = Period.between(f1, f2);
        return p.getYears();

    }

    /* al listar vehiculos este es el formato que se utilizara al mostrar la informacion de lso vehiculos*/
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", matricula=" + matricula
                + ", numeroKM=" + numeroKM + ", fechaMatriculacion=" + fechaMatriculacion
                + ", descripcion=" + descripcion + ", precio=" + precio
                + ", nombrePropietario=" + nombrePropietario + ", dniPropietario="
                + dniPropietario + '}';
    }

    /* compareTo()  compara el objeto con el objeto especificado. 
    El valor devuelto por el compareTo() método decide la posición del objeto en relación con el objeto especificado.
    compara las matricula.
    */
    @Override
    public int compareTo(Vehiculo vehiculo) {
        return this.matricula.compareTo(vehiculo.getMatricula());

    }

}
