import java.util.Random;

public class arrayejercicios_3{
    static Random aleatorio= new Random();
    public static void main(String[]args){
        int[] numeros= new int[15];
        for(int i=0; i< numeros.length;i++){
            numeros[i] = aleatorio.nextInt(0, 100);
            System.out.println(numeros[i]);
        }
    }
}