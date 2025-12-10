import java.util.Scanner;


public class alX {  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


	System.out.print("Hasta que número quieres contar ");    
	int num;
	num = entrada.nextInt(); 
	System.out.print("De cuanto en cuanto quieres sumar ");
	int salto;
	salto = entrada.nextInt();

for (int i = 1; i <= num; i++) {
    System.out.println(i);
}

}
}