
package vehiculoejercicio;


public class Camion extends VehiculoTerrestre{
    private int cargaMax;
    
    public Camion(String matricula, int velocidadMax, int deposito, int numRuedas,int cargaMax){
        super(matricula, velocidadMax, deposito, numRuedas);
        this.cargaMax=cargaMax;
    }
    
    public int getCargaMax(){
        return cargaMax;
    }
    
    public void setCargaMax(int cargaMax){
        this.cargaMax=cargaMax;
    }
    
    public void Viajar(){
        System.out.println("Viajo como un camion");
    }
}
