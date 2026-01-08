import java.util.Scanner;

public class fronterizo{
    Scanner entrada=new Scanner(System.in);
    private String dni;
    private String nombre;
    private String fechaDpaso;

    public fronterizo(String dni,String nombre,String fechaDpaso){
        this.dni=dni;
        this.nombre=nombre;
        this.fechaDpaso=fechaDpaso;
    }
    
    public String getDni(){
    return dni;
    }
    public String getNombre(){
    return nombre;
    }
    public String getFechaDpaso(){
    return fechaDpaso;
    }
    
    
    public void setDni(String dni){
    this.dni=dni;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public void setFechaDpaso(String fechaDpaso){
    this.fechaDpaso=fechaDpaso;
    }
}