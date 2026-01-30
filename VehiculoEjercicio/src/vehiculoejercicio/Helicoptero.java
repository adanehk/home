
package vehiculoejercicio;


public class Helicoptero extends VehiculoAereo{
    private int numHelices;
    
    public Helicoptero(String matricula,int velocidadMax,int deposito,int altitudMax,int numHelices){
        super(matricula,velocidadMax,deposito,altitudMax);
        this.numHelices=numHelices;
    }
    
    public int numHelices(){
        return numHelices;
    }
    public void setNumHelices(int numHelices){
        this.numHelices=numHelices;
    }
    
    public void Viajar(){
        System.out.println("Viajo como un helicoptero");
    }
}
