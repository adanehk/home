import java.util.Random;
import java.util.Scanner;

public class arrayejemplo {  
    static Random aleatorio = new Random();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
 
       /* int[] edades = new int[5];
        edades[0] = 34;
        edades[1] = 14;
        edades[2] = 46;
        edades[3] = 56;
        edades[4] = 66;
 
        for(int i=0; i<edades.length; i++){
        System.out.println(edades[i]);
        }*/

 //--------------------------------------------------------------------
 
  
 
 //--------------------------------------------------------------------
 
    /*String []nombres = new String[5];
    nombres[0]="Adan1";
    nombres[1]="Adan2";
    nombres[2]="Adan3";
    nombres[3]="Adan4";
    nombres[4]="Adan5";
    int[] notas=new int[5];
   
   notas[i]=aleatorio.nextInt(1,11);
   for (int i=0;i<notas.length;i++){
    System.out.print("La nota de " + nombres[i] + "es "+ i + "ª nota es "+ notas[i]);
  
   }
//--------------------------------------------------------------------
*/
    System.out.println("¿Cuantos alumnos tiene tu clase?");
    int alumnos = entrada.nextInt();
    String []nombres = new String[alumnos];
    System.out.println("Bueno por listo ahora escribes los " + alumnos + " nombres");
    nombres[]=entrada.nextLine();
 
    int[] notas=new int[alumnos];
    
    for(int i=0;i<nombres.length;i++){
        
        notas[i]=aleatorio.nextInt(1,11);
        System.out.println("La nota de "+nombres[i] + " es de " + notas[i]);

    }
    }        
}