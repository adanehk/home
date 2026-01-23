/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoejercicio;
/**
 *
 * @author a.elhnini
 */
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
