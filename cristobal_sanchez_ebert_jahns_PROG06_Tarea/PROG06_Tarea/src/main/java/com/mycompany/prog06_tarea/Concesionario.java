package com.mycompany.prog06_tarea;

/**
 *
 * @author Ebert
 */
public class Concesionario {
 
    //eclaracion de atributos para consecionario
    //array vehiculo[]
    private Vehiculo[] vehiculos;
    private int numVehiculos;
    
    public Concesionario(){
        this.numVehiculos = 0;
        this.vehiculos = new Vehiculo[50];// valor de array para ingresar 50 vehiculos
    }
    
    public Vehiculo buscaVehiculo(String matricula){
        
        for (int i = 0; i < numVehiculos; i++) {
            Vehiculo v = this.vehiculos[i];
            
            if(v.getMatricula().equals(matricula)){
                return v;
            }
        }
        return null;
    }
    
    public int insertarVehiculo(Vehiculo v){
        
        if(this.numVehiculos == this.vehiculos.length){
            return -1;
        }
        
        if(this.buscaVehiculo(v.getMatricula()) != null){
            return -2;
        }else{
            
            this.vehiculos[this.numVehiculos] = v;
            this.numVehiculos++;
            return 0;
        }
        
        
    }
    
    public void listarVehiculos(){
        for (int i = 0; i < numVehiculos; i++) {
            Vehiculo v = this.vehiculos[i];
            System.out.println(v.toString());
        }
    }
    
    public boolean actualizaKms(String matricula, int kms){
            
        for (int i = 0; i < numVehiculos; i++) {
            Vehiculo v = this.vehiculos[i];
            
            if(v.getMatricula().equals(matricula)){
                v.setNumeroKM(kms);
                return true;
            }
        }
        return false;
        
    }

   
    
}


