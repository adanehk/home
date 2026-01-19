
public class CuentaBancaria{
    private Persona[] Titulares;
    private int saldo;
    private int numTitulares;
    private final int MAX_TITULARES = 3;

public  CuentaBancaria(Persona titularPrincipal,int saldoInicial){
    this.Titulares = new Persona[MAX_TITULARES];
    Titulares[0] = titularPrincipal;
    numTitulares = 1;
        if (saldoInicial < 0) {
            Saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
}
 public CuentaBancaria(Persona titularPrincipal, Persona titular2, int saldoInicial) {
        this.Titulares = new Persona[MAX_TITULARES];
        Titulares[0] = titularPrincipal;
        Titulares[1] = titular2;
        numTitulares = 2;
        if (saldoInicial < 0) {
            saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
}
public CuentaBancaria(Persona titularPrincipal, Persona titular2,Persona titular3, int saldoInicial) {
        this.Titulares = new Persona[MAX_TITULARES];
        Titulares[0] = titularPrincipal;
        Titulares[1] = titular2;
        Titulares[2] = titular3;
        numTitulares = 3;
        if (saldoInicial < 0) {
            saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
}
public Persona[] getTitulares(){
    return Titulares;
}

public void setTitulares(Persona[] Titulares){
    this.Titulares=Titulares;
}
public int getSaldo(){
    return saldo;
}
public void setSaldo(int Saldo){
    this.saldo=Saldo;
}
public void ingresar(int cantidad){
    if(cantidad > 0){
        saldo+= cantidad; 
}
}
public void retirar(int cantidad){
    if(cantidad > saldo){
        System.out.println("Has intentado sacar mas de lo q tienes tonto"); 
    } else {
        saldo-=cantidad;
    }
}
public boolean transferir(CuentaBancaria otraCuenta,int cantidad){
    if(cantidad > saldo){
        System.out.println("Has intentado sacar mas de lo q tienes tonto");
        return false;
    }else {
        saldo -= cantidad;
        otraCuenta.ingresar(cantidad);
        return true;
    }
}

}