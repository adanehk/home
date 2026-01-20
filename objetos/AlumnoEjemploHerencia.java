public class AlumnoEjemploHerencia extends PersonaEjemploHerencia{

private String curso;

public AlumnoEjemploHerencia(String nombre,int edad,String curso){
     super(nombre,edad);
     this.curso=curso;
    }

public String getCurso(){
    return curso;
}
public void setCurso(String curso){
    this.curso=curso;
}
@Override
public void saludar(){
    System.out.println("Hola soy " + getNombre() + " y soy un alumno");
}
}

