import java.util.Scanner;

public class WhileUsuDecide{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

	
	System.out.println("Por que número quieres empezar a contar");
	int num1; 
        num1 = entrada.nextInt();
	System.out.println("Hasta que número quieres contar");
	int num2; 
        num2 = entrada.nextInt();
	System.out.println("De cuanto en cuanto quieres contar");
	int num3; 
        num3 = entrada.nextInt();

	
	

	
	while(num1 <= num2){
	System.out.println(num1);
	num1 = num1+num3;
}


	


	}
}