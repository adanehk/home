import java.util.Scanner;

public class Salu{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in); 
        

        System.out.print("Ingrese su nombre:");
        String nombre; 
        nombre = entrada.nextLine();
       
       
        System.out.print("Ingrese año de nacimiento:");
        int edad;
        edad = entrada.nextInt();
        System.out.println("Hola " + nombre + "," + " tienes " + (2025 - edad )  +  " " +  "años" +  ".");

    }
}