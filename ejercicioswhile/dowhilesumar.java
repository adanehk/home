import java.util.Scanner;


public class dowhilesumar {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

	int sumas = 10;
	int acumulado;
	acumulado = 0;
	
	
	


	do{
		System.out.print(" Dime un número y lo añadiré a la suma"  );
		--sumas;
		int num;
		num = entrada.nextInt();
		if(num == 0){
	System.out.print("Adiós");
	
}else

		
		
		
		
		acumulado = acumulado + num;
		System.out.print("La suma es " + acumulado);
		
		

	}while(sumas > 0);
	

	}
}