package EJERCICIO2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ebert
 */
public class Concesionario {
 
    //declaracion de atributos para consecionario
    //arraylist para poder agregar todos los vehiculos que queramos.
    private ArrayList <Vehiculo> vehiculos;
    
    public Concesionario(){
        this.vehiculos = new ArrayList<>();
    }
    
    public Vehiculo buscaVehiculo(String matricula){
        
        for (Vehiculo vehiculo:this.vehiculos) {            
            if(vehiculo.getMatricula().equals(matricula)){
                return vehiculo;
            }
        }
        return null;
    }
    
    public int insertarVehiculo(Vehiculo vehiculo){
        
        if(this.buscaVehiculo(vehiculo.getMatricula()) != null){
            return -2;
        }else{
            
            this.vehiculos.add(vehiculo);
            
            
            //clase collection.sort que permitira que los vehiculos se ordenen por matriculas al agregarles
            Collections.sort(vehiculos);
            
            return 0;
        }
        
        
    }
    
    public void listarVehiculos(){
         for (Vehiculo vehiculo:this.vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
    
    public boolean actualizaKms(String matricula, int kms){
            
         for (Vehiculo vehiculo:this.vehiculos) {
                       
            if(vehiculo.getMatricula().equals(matricula)){
                vehiculo.setNumeroKM(kms);
                return true;
            }
        }
        return false;
        
    }
    
    
    public boolean eliminarVehiculo(String matricula){
            
         for (Vehiculo vehiculo:this.vehiculos) {
                       
            if(vehiculo.getMatricula().equals(matricula)){
                this.vehiculos.remove(vehiculo);
                return true;
            }
        }
        return false;
        
    }
    
        
    
    
   
    
}


