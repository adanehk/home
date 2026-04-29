
package alumnosarraybbdd;


public class Alumno {
    String nombre;
    String poblacion;
    int edad;
    
    public Alumno(String nombre,String poblacion,int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.poblacion=poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String toString(){
        return "Nombre del alumno: " + nombre + " Poblacion del alumno: " + poblacion + " edad del alumno: " + edad
                + " \n----------------------------------------------------------------------------";
    }
}
