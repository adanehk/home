
package vehiculoejercicio;


public class VehiculoAereo extends Vehiculo{
    private int altitudMax;
    
    public VehiculoAereo(String matricula,int velocidadMax,int deposito,int altitudMax){
        super(matricula,velocidadMax,deposito);
        this.altitudMax=altitudMax;
    }
    
    public int getAltitudMax(){
        return altitudMax;
    }
    
    public void setAltitudMax(int altitudMax){
        this.altitudMax=altitudMax;
    }
    
    public void Aterrizar(){
        System.out.println("Estoy aterrizando mmg");
    }
}
