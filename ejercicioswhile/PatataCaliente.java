import java.util.Scanner;
import java.util.Random;

public class PatataCaliente{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


		System.out.print("Adivina el número" + " ");
		
		
                int numUsu;
		numUsu = entrada.nextInt();
		Random aleatorio = new Random();
		int solucion=aleatorio.nextInt(0,9);
		

		while(numUsu != solucion){
		System.out.print("¡NO LO HAS ADIVINADO!" + " ");
		if( numUsu > solucion){
		System.out.print(" Vuelve a intentarlo, el número es menor" + " ");
}else if(numUsu < solucion){
		System.out.print(" Vuelve a intentarlo, el número es mayor" + " ");
}

		numUsu = entrada.nextInt();
}System.out.print("¡LO HAS ADIVINADO!");
		

		



	}
}		