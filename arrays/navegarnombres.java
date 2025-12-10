import java.util.Scanner;

public class navegarnombres {  
    static int posicion;
    static String[] nombres;
    static int[] numeros;
    static String opcion;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        posicion = 0;

    System.out.println("¿Cuantos nombres quieres introducir?");
    int cantidad= entrada.nextInt();
    entrada.nextLine();
    System.out.println("Pues venga pon los nombres");
    nombres = new String[cantidad];
    numeros = new int[cantidad];
    for(int i=0; i<cantidad; i++){
        System.out.print("Nombre " + (i+1) + ": ");
        nombres[i] = entrada.nextLine();  
        System.out.print("Su número de teléfono " + ": ");
        numeros[i] = entrada.nextInt();
        entrada.nextLine();
    }
    System.out.println("w para avanzar s para retroceder z para salir");
    
    
    
    
    while(true){
    String opcion=entrada.nextLine();

    if(opcion.equalsIgnoreCase("w")){
        avanzar();
    } else if(opcion.equalsIgnoreCase("s")){
        retroceder();
    } else if(opcion.equalsIgnoreCase("z")){
        salir(); 
    } else {
        System.out.println("Ingrese una opción válida");
    }

    mostrar();
    while(posicion == 0 && opcion.equalsIgnoreCase("s")){
        System.out.println("Estas en el primer nombre");
        opcion=entrada.nextLine();
    }
    int y = nombres.length -1;
     while(posicion == y && opcion.equalsIgnoreCase("w")){
        System.out.println("Estas en el último nombre");
        opcion=entrada.nextLine();
    }
}
    }



private static void avanzar(){

posicion++;

}

private static void retroceder(){

posicion--;

}


private static void mostrar() {
     System.out.println(nombres[posicion]);
     System.out.println("Y su numero es "+numeros[posicion]);
}

private static void salir() {
     System.out.println("Adios");
     System.exit(0);
}
}