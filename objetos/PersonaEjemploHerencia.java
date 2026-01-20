public class PersonaEjemploHerencia{
    private String nombre;
    private int edad;

    public PersonaEjemploHerencia(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre= nombre;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad= edad;
}

public void saludar(){
    System.out.println("Hola, soy "+ nombre+" y soy una persona");
}

public int cumplirAnios(){
    edad++;
    return edad;
    //return ++edad; tambien se puede hacer asi
}

}