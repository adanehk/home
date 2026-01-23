public class EjemploHerenciaEmpleado extends PersonaEjemploHerencia{
    
    private int sueldo;

    public EjemploHerenciaEmpleado(String nombre,int edad,int sueldo){
        super(nombre, edad);
        this.sueldo=sueldo;
        
    }

    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
    }

    public void trabajar(){
        System.out.println("A trabajar payo azbi");
    }
    @Override 
    public void saludar(){
        System.out.println("Hola, soy " + getNombre() + " y soy un payo trabajador");
    }

}