/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog07_tarea;

/**
 *
 * @author Ebert
 */

//clase Persona implementando la interfaz imprimible
public class Persona implements Imprimible{
    
    //declaracion de atrinutos de la clase Persona
    private String nombre;
    private String apellidos;
    private String DNI;

    //Constructor Persona sin prametros
    public Persona() {
    }

    //Constructor Persona con parametros
    public Persona(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }

    
    //getters and setters de los atributos declarados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /*
    Funciona con ToString 
    devolverInfoString, que devolverá la información de una cuenta como una cadena de caracteres.
    cuando se llame al metodo devolvera nombre, apellido y dni de la persona.
    */
    @Override
    public String devolverInfoString() {
        return  nombre + " " + apellidos + "\nDNI: " + DNI;
    }

    
    
    
    
}
