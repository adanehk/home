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

        
        System.out.println("Gasolina:");
        int gasolina=entrada.nextInt();
        coche.setGasolina(gasolina);
        System.out.println("\n" + "\n");
       
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Viajar");
        System.out.println("2. Repostar");
        System.out.println("3. Salir");
        int opcion = entrada.nextInt();
       
        do{

             while(opcion < 0 || opcion > 4){
             System.out.println("Esa no es una opcion valida");
            }
            switch(opcion){
                case 1 -> coche.viajar();
                case 2 -> coche.repostar();
                case 3 -> System.exit(0);
         }
         System.out.println("¿Que quieres hacer?");
         System.out.println("1. Viajar");
         System.out.println("2. Repostar");
         System.out.println("3. Salir");
         opcion = entrada.nextInt();
        }while(opcion != 3);
        
        
        
    }

}