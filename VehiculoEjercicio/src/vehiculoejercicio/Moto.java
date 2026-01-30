/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoejercicio;


public class Moto extends VehiculoTerrestre {
    private boolean conSidecar;

    public Moto(String matricula, int velocidadMax, int deposito, int numRuedas,boolean conSidecar) {

        super(matricula, velocidadMax, deposito, numRuedas);
        this.conSidecar=conSidecar;
    }
    public boolean getConSidecar(){
        return conSidecar;
    }
    public void setConSidecar(boolean conSideCar){
        this.conSidecar=conSidecar;
    }
    public void Viajar(){
        System.out.println("Viajo como una moto");
    }
}
