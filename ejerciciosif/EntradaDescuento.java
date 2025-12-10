import java.util.Scanner;

public class EntradaDescuento{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

     System.out.print("Ingrese su edad:");
                int edad; 
                edad = entrada.nextInt();

       
     if (edad <= 12 || edad >=65) {
     System.out.println("Tienes descuento.");
     } else {
     System.out.println("A pagar entero.");
}







        }


}