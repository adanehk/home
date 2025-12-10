import java.util.Scanner;

public class Calculadora{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

                System.out.print("Ingrese un numero:");
                int num1; 
                num1 = entrada.nextInt();
                System.out.println();

                System.out.print("Ingrese otro numero:");
                int num2; 
                num2 = entrada.nextInt();
                System.out.println();
 
                System.out.println("[Versión 1]");
                System.out.println();
                System.out.println("Suma : " + (num1 + num2));
                System.out.println("Resta : " + (num1 - num2));
                System.out.println("Multiplicación : " + (num1 * num2));
                System.out.println("División : " + (num1 / num2));

                System.out.println();
                System.out.println();

                System.out.println("[Versión 2]");
                System.out.println();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                System.out.println(num1 + " : " + num2 + " = " + (num1 / num2));

       }
}
