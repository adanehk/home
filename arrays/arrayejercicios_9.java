import java.util.Random;
import java.util.Scanner;

public class arrayejercicios_9{
    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
    static int contador = 0;
    public static void main(String[]args){
        System.out.println("Pon un numero del 1-10");
        int respuesta = entrada.nextInt();
        int[] numeros= new int[20];
        for(int i=0; i< numeros.length;i++){
            numeros[i] = aleatorio.nextInt(0, 10);
            if(respuesta == numeros[i]){
                contador++;
            }
            
        }
        System.out.println("Tu numero esta " + contador + " veces");


    }

}