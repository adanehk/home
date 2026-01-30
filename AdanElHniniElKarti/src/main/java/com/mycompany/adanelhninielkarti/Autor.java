
package com.mycompany.adanelhninielkarti;


public class Autor {
    private String nombre;
    private String nacionalidad;
   
public Autor(String nombre,String nacionalidad){
    this.nombre=nombre;
    this.nacionalidad=nacionalidad;
}
public Autor(String nombre){
    this.nombre=nombre;
    nacionalidad="Desconocida";
}
public String getNombreAutor(){
    return nombre;
}

}