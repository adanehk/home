/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculoejercicio;

/**
 *
 * @author a.elhnini
 */
public class Vehiculo{
    private String matricula;
    private int velocidadMax;
    private int deposito;

    public Vehiculo(String matricula,int velocidadMax,int deposito){
        this.matricula=matricula;
        this.velocidadMax=velocidadMax;
        this.deposito=deposito;
    }
public String getMatricula(){
    return matricula;
}
public void setMatricula(String matricula){
    this.matricula=matricula;
}
public int getVelocidadMax(){
    return velocidadMax;
}
public void setVelocidadMax(int velocidadMax){
    this.velocidadMax=velocidadMax;
}
public int getDeposito(){
    return deposito;
}
public void setDeposito(int deposito){
    this.deposito=deposito;
}
public void viajar(){
    System.out.println("Soy un vehiculo y estoy viajando");
}

public String toString(){
    return "Hola soy un vehiculo";
}
}
