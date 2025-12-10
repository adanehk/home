import java.util.Scanner;

public class While1a31{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

	
	System.out.println("Ingrese un número del 1 al 31");
	int num1; 
        num1 = entrada.nextInt();
	

	while(num1 < 1 || num1 > 31){
	System.out.println("Ingrese otro número");
	num1 = entrada.nextInt();
}


	


	}
}