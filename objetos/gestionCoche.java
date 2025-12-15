
public class gestionCoche{
    private String matricula;
    private String modelo;
    private int deposito;//cuanta gasolina le cabe 
    private int consumo;//cada litro son 100km
    private int gasolina;//cuanta gasolina tiene
    


public gestionCoche(String matricula, String modelo, int deposito, int consumo, int gasolina){
    this.matricula=matricula;
    this.modelo=modelo;
    this.deposito=deposito;
    this.consumo=consumo;
    this.gasolina=gasolina;
}
public gestionCoche(){
    matricula="XXXXXXXX";
}

public String getMatricula(){
    return matricula;
}
public String getModelo(){
    return modelo;
}
public int getDeposito(){
    return deposito;
}
public int getConsumo(){
    return consumo;
}
public int getGasolina(){
    return gasolina;
}


public void setMatricula(String matricula){
    this.matricula=matricula;
}
public void setModelo(String modelo){
    this.modelo=modelo;
}
public void setDeposito(int deposito){
    this.deposito=deposito;
}
public void setConsumo(int consumo){
    this.consumo=consumo;
}
public void setGasolina(int gasolina){
    this.gasolina=gasolina;
}


public void repostar(int repostar){
 gasolina += repostar;

}

public void viajar(int kms){
    //cuantos km quieres viajar
    //kms = entrada.nextInt
    
        
    
}


}