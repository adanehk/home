import java.util.Scanner;

public class AreayPerRec{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);



        System.out.print("Ingrese un numero:");
                int num1; 
                num1 = entrada.nextInt();
      

        System.out.print("Ingrese otro numero:");
                int num2; 
                num2 = entrada.nextInt();
                System.out.println();
 
        float area = num1 * num2;
        int perímetro = num1*2 + num2*2;


        System.out.println("El area es:" + area);
        System.out.println("El perímetro es:" + perímetro);


     }


}  