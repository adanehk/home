

package com.mycompany.hospital;


public class Hospital {
private String nombre;
private String ciudad;
private Medico[] medicos;
private int numMedicos;

public Hospital(String nombre,String ciudad,Medico[]medicos){
    this.nombre=nombre;
    this.ciudad=ciudad;
    this.medicos=medicos;
    medicos=new Medico[50];
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public String getCiudad(){
    return ciudad;
}
public void setCiudad(String ciudad){
    this.ciudad=ciudad;
}
public Medico[] getMedicos(){
    return medicos;
}
public void setMedicos(Medico[]medicos){
    this.medicos=medicos;
}
public void addMedico(Medico medico){
  if(numMedicos<medicos.length){
      medicos[numMedicos]=medico;
      numMedicos++;
  }
}
}

