import java.util.Scanner;

public class MediaAridmética{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);



        System.out.print("Ingrese un numero:");
                int num1; 
                num1 = entrada.nextInt();
      

        System.out.print("Ingrese otro numero:");
                int num2; 
                num2 = entrada.nextInt();
                System.out.println();


        System.out.print("Ingrese otro numero:");
                int num3; 
                num3 = entrada.nextInt();
                System.out.println();

       System.out.print("La media es" + " " + (num1 + num2 + num3 / 3));
       

    }

}