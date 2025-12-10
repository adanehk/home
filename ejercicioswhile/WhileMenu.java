import java.util.Scanner;

public class WhileMenu{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);


		System.out.println("¿Que desea comer?");
		System.out.println(" ");
		System.out.println(" 1. Patatas ");
		System.out.println(" ");
		System.out.println(" 2. Hamburguesa");	
		System.out.println(" ");
		System.out.println(" 3. Pizza");
		System.out.println(" ");
		System.out.println(" 4.Taco ");
		System.out.println(" ");
		int menu; 
                menu = entrada.nextInt();

		while(menu >= 1 && menu <= 4){
		
		System.out.print("Que aproveche");
		
		menu = entrada.nextInt();

}	

		switch(operacion){

		case menu < 1 || > 4:

		System.out.println(" Menú inválido");
		


}	
		
		

	}
}