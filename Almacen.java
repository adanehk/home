import java.util.Scanner;

public class Almacen{
    static Scanner entrada = new Scanner(System.in);
        static int[]talla={37, 38, 39,40, 41,42,43,44};
        static int stock = 0;
        public static void main(String[]args){

         System.out.println("Ahora mismo el stock es de " + stock + " ¿Quieres meter o sacar stock?");
         System.out.println("1. Meter stock");
         System.out.println("2. Sacar stock");
         int opcionstock = entrada.nextInt();
         while(opcionstock < 1 && opcionstock > 2){
            System.out.println("Ingresa una opción válida");
            opcionstock = entrada.nextInt();
         }
         switch(opcionstock){
            case 1:
                break;
            case 2:
                System.out.println("¿Cuanto quieres sacar?");
                int sacar = entrada.nextInt();
                System.out.println("¿Y de que talla quieres sacar?");
                int sacartalla = entrada.nextInt();
                while(sacar < 0){
                     System.out.println("No puedes sacar menos de 0");
                     sacar = entrada.nextInt();
                }
                while(sacar > stock){
                    System.out.println("No puedes sacar esa cantidad de stock ya que tu tienes " + stock + " de stock y estas intentando sacar " + sacar);
                }   
                break;
         }
    
    }
    
}