import java.util.Scanner;
import java.util.Random;

public class AdivinarNum{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


		System.out.println("Adivina el número");
		System.out.println(" ");
		
                int numUsu;
		numUsu = entrada.nextInt();
		Random aleatorio = new Random();
		int solucion=aleatorio.nextInt(0,9);
		

		while(numUsu != solucion){
		System.out.print("¡NO LO HAS ADIVINADO! Vuelve a intentarlo" + " ");
		numUsu = entrada.nextInt();
}System.out.print("¡LO HAS ADIVINADO!");
		

		



	}
}		