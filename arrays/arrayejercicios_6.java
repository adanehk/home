import java.util.Scanner;
import java.util.Random;

public class arrayejercicios_6{
    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
     final static int cantidad = 6;
    
    public static void main(String[]args){
        String[] felicitacion={"¡Enhorabuena por tu logro!","¡Felicidades, te lo mereces!","¡Qué orgullo, bravo!","¡Excelente trabajo, sigue así!","¡Lo conseguiste, felicidades!", "¡Un éxito más para ti!"};
        String[] animo={"No pasa nada, lo importante es seguir","Cada error es un paso hacia el éxito","Ánimo, mañana será mejor","De los tropiezos nacen las fuerzas","Fallar también es aprender","Eres un trozo de mierda"};
        int[] num1= new int[cantidad];
        int[] num2= new int[cantidad];
        
        for(int i=0; i<cantidad; i++){
            num1[i] = aleatorio.nextInt(1, 100);
            num2[i] = aleatorio.nextInt(1, 100);
            System.out.println(num1[i] + " + " + num2[i]);
            int respuesta = entrada.nextInt();
             while(respuesta < 0){
            System.out.println("No se pueden poner numeros negativos");
            respuesta = entrada.nextInt();
        }
            int resultado = num1[i]+num2[i];
            
            if(respuesta == resultado){
                System.out.println(felicitacion[i]); 
                
            }
            if(respuesta != resultado){
                System.out.println(animo[i]);
            
            }
            
            
        }

    }
}