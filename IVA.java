import java.util.Scanner;

public class IVA{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese un numero y te diré el iva:");
                float num; 
                num = entrada.nextInt();

        float iva = num * 0.21f;
        System.out.println("El iva es :" + iva);


     }
}