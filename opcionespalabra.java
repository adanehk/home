import java.util.Scanner;


public class opcionespalabra {

Scanner entrada = new Scanner(System.in);
   
    public  static void main(String[] args) {

        System.out.println("Pon una palabra");
        String palabra;
        palabra = entrada.nextLine();
        System.out.println("¿Que quieres que haga?");
        System.out.println("1. Ponerlo en mayúsculas");
        System.out.println("2. Separar sus letras");
        System.out.println("3. Poner la primera letra en mayúsculas");
        System.out.println("4. Contar las vocales");
        System.out.println("5. Contar las palabras");
        int opcion;
        opcion = entrada.nextInt();

            switch(opcion){
                case 1: 
                    System.out.println("Pues venga escribe que quieres en mayúsculas");
                    String textoMayus;
                    textoMayus = entrada.nextLine();
                    System.out.println(textoMayus.toUpperCase());



            }

 
 
 
 
 
 
 
 
 
 
 
 
 
    }
}