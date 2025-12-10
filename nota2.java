import java.util.Scanner;


public class nota2 {  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int notamate;
	int notaeus;
	int notageo;
	int numsuspensos = 0;
	int numaprobados = 0;
	int dieces = 0;
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
	numsuspensos++;
	}else{
	numaprobados++;
	}

	if(notamate == 10){
	dieces++;
	}


	if(notaeus < 5){
	suspenso = true;
	numsuspensos++;
	}else{
	numaprobados++;
	}
	
	if(notaeus == 10){
	dieces++;
	}

	if(notageo < 5){
	suspenso = true;
	numsuspensos++;
	}else{
	numaprobados++;
	}
	
	if(notageo == 10){
	dieces++;
	}
	

	System.out.print("Han abido " + numsuspensos + " suspensos  " + numaprobados + " aprobados y " + dieces + " dieces");



}

}