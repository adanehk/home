
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String dueno;

    public Perro(String nombre, String raza, int edad, String dueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.dueno = dueno;
   
    }
    
        public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }
    public String getDueno(){
        return dueno;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setDueno(String dueno){
        this.dueno=dueno;
    }    
        
    }