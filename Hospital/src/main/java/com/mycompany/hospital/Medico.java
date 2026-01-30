
package com.mycompany.hospital;


public class Medico {
    private String numColegiado;
    private String nombre;
    

    public Medico(String numColegiado,String nombre){
        this.numColegiado=numColegiado;
        this.nombre=nombre;
        
    }
    
public String getNumColegiado(){
    return numColegiado;
}
public void setNumColegiado(String numColegiado){
    this.numColegiado=numColegiado;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void Curar(Paciente paciente){
    paciente.setEnfermo(false);
}
}
