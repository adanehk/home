public class VehiculoTerrestre extends Vehiculo{
    private int numRuedas;

    public VehiculoTerrestre(String matricula,int velocidadMax,int deposito,int numRuedas){
        super(matricula, velocidadMax, deposito);
        this.numRuedas=numRuedas;
    }
    public int getNumRuedas(){
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas){
        this.numRuedas=numRuedas;
    }
public void derrape(){
    System.out.println("Soy un vehiculo terrestre y estoy derrapando chacho");
}
}