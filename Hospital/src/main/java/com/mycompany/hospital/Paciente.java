package com.mycompany.hospital;


public class Paciente {
    private String dni;
    private String nombre;
    private int edad;
    private boolean enfermo=true;
    private Medico medico;
    
 
public Paciente(String dni,String nombre,int edad,boolean enfermo,Medico medico){
    this.dni=dni;
    this.nombre=nombre;
    this.edad=edad;
    this.enfermo=enfermo;
    this.medico=medico;
    
}
public Paciente(String dni,String nombre,int edad){
    this.dni=dni;
    this.nombre=nombre;
    this.edad=edad;
    
}
public String getDni(){
    return dni;
}
public void setDni(String dni){
    this.dni=dni;
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad=edad;
}
public boolean isEnfermo(){
    return enfermo;
}
public void setEnfermo(boolean enfermo){
    this.enfermo=enfermo;
}
public Medico getMedico(){
    return medico;
}
public void setMedico(Medico medico){
    this.medico=medico;
}
public void enfermar(){
    enfermo=true;
}
public String toString(){
    return "Soy " + nombre + " tengo " + edad + " anios, estoy " + enfermo + " y mi medico es " + medico;
}

}

