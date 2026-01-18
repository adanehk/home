
public class bancaria{
    private Persona[] Titular;
    private int Saldo;
   

public void bancaria(Persona[] Titular,int SaldoInicial){
    this.Titular = Titular;
        if (SaldoInicial < 0) {
            Saldo = 0;
        } else {
            this.Saldo = SaldoInicial;
        }
}
public Persona[] getTitular(){
    return Titular;
}
public void setTitular(Persona[] Titular){
    this.Titular=Titular;
}
public int getSaldo(){
    return Saldo;
}
public void setSaldo(int Saldo){
    this.Saldo=Saldo;
}
public void ingresar(int cantidad){
    if(cantidad > 0){
        Saldo+= cantidad; 
}
}
public void retirar(int cantidad){
    if(cantidad > Saldo){
        System.out.println("Has intentado sacar mas de lo q tienes tonto"); 
    } else {
        Saldo-=cantidad;
    }
}
public boolean transferir(bancaria otraCuenta,int cantidad){
    if(cantidad > Saldo){
        System.out.println("Has intentado sacar mas de lo q tienes tonto");
        return false;
    }else {
        Saldo -= cantidad;
        otraCuenta.ingresar(cantidad);
        return true;
    }
}

}