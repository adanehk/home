import java.util.Scanner;
public class objetosGestionCoche{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        gestionCoche coche = new gestionCoche();

        System.out.println("Matricula:");
        String matricula = entrada.nextLine();
        coche.setMatricula(matricula);
        
        System.out.println("Modelo:");
        String modelo=entrada.nextLine();
        coche.setModelo(modelo);

        System.out.println("Deposito:");
        int deposito=entrada.nextInt();
        coche.setDeposito(deposito);

        System.out.println("Cuantos L de gasolina gasta cada 100km:");
        int consumo=entrada.nextInt();
        coche.setConsumo(consumo);

        System.out.println("Gasolina:");
        int gasolina=entrada.nextInt();
        coche.setGasolina(gasolina);
        System.out.println("\n" + "\n");
        
        
    }

}