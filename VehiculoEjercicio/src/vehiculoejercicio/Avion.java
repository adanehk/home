
package vehiculoejercicio;


public class Avion extends VehiculoAereo{
    private int numMotores;
    
    public Avion(String matricula,int velocidadMax,int deposito,int altitudMax,int numMotores){
        super(matricula,velocidadMax,deposito,altitudMax);
        this.numMotores=numMotores;
        
    }
    
    public int getNumMotores(){
        return numMotores;
    }
    public void setNumMotores(int numMotores){
        this.numMotores=numMotores;
    }
    public void Viajar(){
        System.out.println("Viajo como un avion");
    }
}
