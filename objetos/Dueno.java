
public class Dueno {
    private String nombre;
    private String direccion;
    private String edad;

    public Dueno(String nombre, String direccion, String edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }
}