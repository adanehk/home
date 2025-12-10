import java.util.Scanner;

public class WhileUsuPositivo{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

	
	System.out.println("Ingrese un número");
	int num1; 
        num1 = entrada.nextInt();
	

	while(num1 < 0){
	System.out.println("Ingrese otro número");
	num1 = entrada.nextInt();
}


	


	}
}