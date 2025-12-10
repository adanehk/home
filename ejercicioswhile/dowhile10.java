import java.util.Scanner;


public class dowhile10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



		System.out.print("Pon un número y te diré su cuadrado");
		int num;
		num = entrada.nextInt();
		int intentos = 10;
		

			
		do{
			System.out.println("El cuadrado es " + (num * num ) + (" Tienes " + (--intentos) + " intentos"));
			num = entrada.nextInt();
			System.out.print("Escribe otro ");

		}while(intentos >= 0);










	}
}