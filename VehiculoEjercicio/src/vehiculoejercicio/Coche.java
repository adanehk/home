/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoejercicio;
/**
 *
 * @author a.elhnini
 */
public class Coche extends VehiculoTerrestre{
    private int numPuertas;

    public Coche(String matricula,int velocidadMax,int deposito,int numRuedas,int numPuertas){
        super(matricula,velocidadMax,deposito,numRuedas);
        this.numPuertas=numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas=numPuertas;
    }
    public void Viajar(){
        System.out.println("Viajo como un coche");
    }
    
}
