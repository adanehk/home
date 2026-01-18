public class Persona{
    private Persona[] titulares;
    private int saldoInicial;


public Persona(int saldoInicial,Persona[] titulares){

    this.saldoInicial=saldoInicial;
    this.titulares=titulares;
}

public Persona[]  gettitulares(){
    return titulares;
}
public void setTitulares(Persona[] Titulares){
    this.titulares= Titulares;
}
public int getsaldoInicial(){
    return saldoInicial;
}

}
