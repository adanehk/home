import java.util.Scanner;


public class notas {  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int notamate;
	int notaeus;
	int notageo;
	boolean suspenso = false; 
	

	System.out.println("¿Que nota has sacado en mate?");
	notamate = entrada.nextInt();
	while (notamate < 0 || notamate > 10) {
                    System.out.println("Ingrese una nota válida");
                    notamate = entrada.nextInt();
                }
	
	System.out.println("¿Y en euskera?");
	notaeus = entrada.nextInt();
	while (notaeus < 0 || notaeus > 10) {
                    System.out.println("Ingrese una nota válida");
                    notaeus = entrada.nextInt();
                }

	System.out.println("¿Y en geo?");
	notageo = entrada.nextInt();
	while (notageo < 0 || notageo > 10) {
                    System.out.println("Ingrese una nota válida");
                    notageo = entrada.nextInt();
                }
	
	
	
		
	if(notamate < 5){
	suspenso = true;
	System.out.println("Has suspendido mate. ");
	}else{

	System.out.println("Has aprobado mate. ");
	}
	
	if(notaeus < 5){
	suspenso = true;
	System.out.println("Has suspendido euskera. ");
	}else{

	System.out.println("Has aprobado euskera. ");
	}
	
	if(notageo < 5){
	suspenso = true;
	System.out.println("Has suspendido geo. ");
	}else{

	System.out.println("Has aprobado geo. ");
	}
	


}
}		