import java.util.Scanner;

public class EdadIf{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

     System.out.print("Ingrese su edad:");
                int edad; 
                edad = entrada.nextInt();

       
     if (edad >= 18) {
     System.out.println("Eres mayor de edad.");
     } else {
     System.out.println("Eres menor de edad.");
}


if (edad>= 40){
 System.out.println("Jubilao.");
     }




        }


}
