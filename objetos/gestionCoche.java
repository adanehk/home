
import java.util.Scanner;

public class gestionCoche{
    Scanner entrada=new Scanner(System.in);
    private String matricula;
    private String modelo;
    private int deposito;//cuanta gasolina le cabe 
    private int consumo;//cada litro son 5km
    private int gasolina = 0;//cuanta gasolina tiene
    // viaje 70km 
    //consumo 14 L

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

public void viajar(){
    int kilometros;
    
    if(gasolina > 0){
    System.out.println("¿De cuantos kilometros va a ser el viaje?");
    kilometros = entrada.nextInt();
    while (kilometros < 0) { 
        System.out.println("No puedes viajar 0 o menos kilometros");
        kilometros = entrada.nextInt();
    }
    int num = kilometros / 5;
    while (gasolina < num) { 
        System.out.println("No tienes la gasolina suficiente para el viaje");
    }
    gasolina -= num;
    }
    
}
public void repostar(){
    System.out.println("¿Cuanto quieres repostar?");
    int repostar = entrada.nextInt();
    int resultado = gasolina += repostar;

    System.out.println("Tenias " + gasolina + " L de gasolina y ahora tienes " + resultado);
    while(repostar > deposito){
        System.out.println("Tu coche no tiene el deposito para tanta gasolina");
        repostar=entrada.nextInt();
    }
}


}