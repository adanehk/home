import java.util.Scanner;

public class palabraLetras{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);



        System.out.println("Ingrese una palabra:");
                String palabra; 
                palabra = entrada.nextLine();

		String mayus = palabra.toUpperCase();
	System.out.println(mayus);


		char primeraLetra = palabra.charAt(0);
		char ultimaLetra = palabra.charAt(palabra.length() - 1);
	System.out.println(primeraLetra);
	System.out.println(ultimaLetra);
		

		int posicionA = palabra.indexOf("a");
		
		if(posicionA>=0){
			System.out.println("La letra \"a\" está en la " + (posicionA +1) + "ª posicion");

}else{
			System.out.println("Este texto no tiene la letra a");
}

		int posicionEsp = palabra.indexOf(" ");
		String texto = palabra.substring(0, posicionEsp);
		System.out.println("La 1ª palabra es " + texto);
	
		
}
}