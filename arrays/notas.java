import java.util.Scanner;

public class notas{
    static Scanner entrada = new Scanner(System.in);
    static int suma;
    static int contadorsuspensos = 0;
    static int max;
    static int min;
    static int cantidadsubir;
    static int opcionnota;
    static int resultado;
    

    public static void main (String[]args){

            System.out.println("¿Cuantas notas quieres añadir?");
            int numnotas = entrada.nextInt();
            int[] notas = new int[numnotas]; 
            
            for (int i = 0; i < notas.length; i++) {
                 System.out.println("Introduce la nota " + (i+1) + ":");
                 notas[i] = entrada.nextInt();
                 while(notas[i] < 0 || notas[i] > 10){
                    System.out.println("Ingresa una nota valida");
                    notas[i] = entrada.nextInt();
                 } 
            }
             max = notas[0];
             min = notas[0];
             int opcionmenu;
            while(true){
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Visualizar notas");
                System.out.println("2. Nota media");
                System.out.println("3. Suspensos");
                System.out.println("4. Nota maxima y minima");
                System.out.println("5. Subir nota");
                System.out.println("6. Salir");
                opcionmenu = entrada.nextInt();
            while(opcionmenu < 1 || opcionmenu>6){
                System.out.println("Pero pon una opcion valida");
                opcionmenu = entrada.nextInt();
            }
            switch(opcionmenu){
                case 1:
                    mostrarNotas(notas);
                    break;
                case 2:
                    calcularMedia(notas);
                    break;
                case 3:
                    mostrarSuspensos(notas);
                    break;
                case 4:
                    mayorMenor(notas);
                    break;
                case 5:
                    subirNota(notas);
                    break;
                case 6:
                    salir();
                    break;
            }
          
            }
    }

    private static void mostrarNotas(int[] notas){
        for(int i = 0; i < notas.length; i++){
        System.out.println("nota numero: "+notas[i]);
        }
    }
    private static void calcularMedia(int[] notas){
        for(int i=0;i<notas.length;i++){
            suma = suma+notas[i];
           
        }System.out.println("media: "+suma / notas.length);
    }
    private static void mostrarSuspensos(int[]notas){
        for(int i=0;i<notas.length;i++){
            
            if(notas[i] < 5){
                contadorsuspensos ++;
            }
            
        }System.out.println("suspensos: "+ contadorsuspensos);
    }
    private static void mayorMenor(int[]notas){
    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > max) {
                max = notas[i];
            }
        if (notas[i] < min) {
                min = notas[i];
            }
       
    }
        System.out.println("La mayor nota encontrada es: "+ max + " Y la menor es: " + min );
    
    }
    private static void salir(){
        System.out.println("Hasta la próxima");
        System.exit(0);
    }
    
    private static void subirNota(int[]notas){
        System.out.println("¿Que nota quieres subir?");
        opcionnota = entrada.nextInt();
        System.out.println("¿Cuanto la quieres subir?");
         cantidadsubir = entrada.nextInt();            
        for(int i=0;i<notas.length;i++){
            resultado=notas[opcionnota] += cantidadsubir;
        }System.out.println(resultado);    
    }
    
}