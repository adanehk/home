public class Persona{
    
    private String nombre;
    private String dni;


public Persona(String nombre,String dni){

    this.nombre=nombre;
    this.dni=dni;
}

public String getnombre(){
    return nombre;
}
public void setnombre(String nombre){
    this.nombre= nombre;
}
public void setdni(String dni){
    this.dni= dni;
}
public String getdni(){
    return dni;
}

}
