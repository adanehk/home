public class Coche extends VehiculoTerrestre{
    private int numPuertas;

    public Coche(String matricula,int velocidadMax,int deposito,int numRuedas,int numRuedas,int numPuertas){
        super(matricula,velocidadMax,deposito,numRuedas);
        this.numPuertas=numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas=numPuertas;
    }
    
}