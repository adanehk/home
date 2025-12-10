import java.util.Scanner;

public class NotaLetra{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

     System.out.print("Cuanto has sacao en mate:");
     float nota; 
     nota = entrada.nextFloat();

    if(nota >= 5 && nota<6){

   System.out.print("Suficiente ");
   
}
   if(nota < 5 && nota > 0){
System.out.print("Insuficiente");
}
if(nota >= 6 && nota<7){

   System.out.print("Bien ");

}
if(nota >= 7 && nota<8){

   System.out.print("Muy bien ");

}
if(nota >= 8 && nota<9){

   System.out.print("Yo q se mejor ");

}
if(nota >= 9 && nota<10){

   System.out.print("Perfecto");

}
if(nota < 0 || nota > 10){

   System.out.print("Nota Inválida");

}



}
}