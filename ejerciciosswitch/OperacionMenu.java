import java.util.Scanner;

public class OperacionMenu{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


		System.out.println("¿Que operación quieres hacer?");
		System.out.println(" ");
		System.out.println(" 1. DIVISIÓN ( escriba / )");
		System.out.println(" ");
		System.out.println(" 2. SUMA ( escriba + )");	
		System.out.println(" ");
		System.out.println(" 3. RESTA ( escriba - )");
		System.out.println(" ");
		System.out.println(" 4. MULTIPLICACIÓN ( escriba * )");
		System.out.println(" ");
		String operacion; 
                operacion = entrada.nextLine();
		

		System.out.println("Ingrese un número");
		System.out.println(" ");
		double num1; 
                num1 = entrada.nextDouble();
		System.out.println("Ingrese otro número");
		System.out.println(" ");
		double num2; 
                num2 = entrada.nextDouble();

		switch(operacion){

		case "/":

		System.out.println(" El resultado de la división es: " + num1 / num2);
		break;
		case "+":

		System.out.println(" El resultado de la suma es: " + (num1 + num2));
		break;
		case "-":

		System.out.println(" El resultado de la resta es: " + (num1 - num2));
		break;
		case "*":

		System.out.println(" El resultado de la multiplicación es: " + num1 * num2);
		break;
		default: 
		System.out.print("Operación no válida");


}


	}
}