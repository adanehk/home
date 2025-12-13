
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
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        
   
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

    public String validacionDueno()
    {
        String textoValidacion;
        if(dueno == null)
        {
            textoValidacion = "¡Guau, guau! Soy " + nombre+ ", un " + raza + "de " + edad + " anios y no tengo dueno";
        }
        else
        {
            return "";
        }
        return textoValidacion;
    }
    public String toString(){
        
        return  "¡Guau, guau! Soy " + nombre+ ", un " + raza + "de " + edad + " anios" + " y mi dueno es " + dueno;

    }
        
    }