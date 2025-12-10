import java.util.Scanner;

public class Coche{
    Scanner entrada = new Scanner(System.in); 
    private String matricula;
    private String modelo;
    private String marca;
    private int kilometros;
    private boolean nuevo = false;


public Coche(String matricula,String modelo,String marca,int kilometros){
    this.matricula=matricula;
    this.modelo=modelo;
    this.marca=marca;
    this.kilometros=kilometros;       
}

public Coche(){
    matricula="XXXXXXXX";
}

public String getMatricula(){
        return matricula;
    }
public String getModelo(){
        return modelo;
    }
public String getMarca(){
        return marca;
    }
public int getKilometros(){
        return kilometros;
    }
public boolean getNuevo(){
    return nuevo;
}
public void setMatricula(String matricula){
        this.matricula=matricula;
    }
public void setModelo(String modelo){
        this.modelo=modelo;
    }
public void setMarca(String marca){
        this.marca=marca;
    }
public void setKilometros(int kilometros){
        this.kilometros=kilometros;
    }
public void setNuevo(boolean nuevo){
    this.nuevo=nuevo;
}

public String toString(){
        return  " matricula: " + matricula +" marca: " + marca + " kilometros: " + kilometros;
    }
public void viajar(){
    System.out.println("¿De cuantos kilometros va a ser el viaje?");
    int nuevoskilometros = entrada.nextInt();
    while (nuevoskilometros < 0) { 
        System.out.println("No puedes viajar 0 o menos kilometros");
        nuevoskilometros = entrada.nextInt();
    }
    System.out.println("Tu coche ha pasado de tener " + kilometros + " a tener " + (kilometros + nuevoskilometros) + " kilometros.");
    if(kilometros == 0 && nuevoskilometros == 0){
        nuevo = true;
    }
    if(kilometros > 0){
        nuevo=false;
    }
}


public void compararKilometros(Coche coche){

}

}