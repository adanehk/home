
public class Coche{
    private String matricula;
    private String modelo;
    private String marca;
    private String kilometros;


public Coche(String matricula,String modelo,String marca,String kilometros){
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
public String getKilometros(){
        return kilometros;
    }


}