public class objetosBancaria{
    public static void main(String[]args){
        Persona titular1 = new Persona("Adan","79002509Q");
        Persona titular2 = new Persona("Pedro","4324246F");
        Persona titular3 = new Persona("Messi","5773008X");
        CuentaBancaria cuenta1 = new CuentaBancaria(titular1, 20);
        CuentaBancaria cuenta2 = new CuentaBancaria(titular2, 10);
        CuentaBancaria cuenta3 = new CuentaBancaria(titular3, 15);
        
        cuenta1.transferir(cuenta2,10);
    }
}