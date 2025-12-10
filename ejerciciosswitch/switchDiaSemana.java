import java.util.Scanner;

public class switchDiaSemana{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);



	 System.out.println("Ingrese el numero de dia de la semana:");
                int dia; 
                dia = entrada.nextInt();

	
	switch(dia){
	
		case 1:
		System.out.print(" Hoy es lunes ");
		break;
		case 2:
		System.out.print(" Hoy es martes ");
		break;
		case 3:
		System.out.print(" Hoy es miércoles ");
		break;
		case 4:
		System.out.print(" Hoy es jueves ");
		break;
		case 5:
		System.out.print(" Hoy es viernes ");
		break;
		case 6:
		System.out.print(" Hoy es sabado ");
		break;
		case 7:
		System.out.print(" Hoy es domingo ");
		break;
		default:
		System.out.print("dia inválido");
}



	}

}

