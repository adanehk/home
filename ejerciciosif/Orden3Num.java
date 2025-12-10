import java.util.Scanner;

public class Orden3Num{
        public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

     System.out.print("Ingrese un número:");
     int num1; 
     num1 = entrada.nextInt();
    
     System.out.print("Ingrese otro número:");
     int num2; 
     num2 = entrada.nextInt();
     
     System.out.print("Ingrese otro número:");
     int num3; 
     num3 = entrada.nextInt();
     System.out.print("");
    
	//if((num1 >= num2) && (num2 > num3)){

		//System.out.print(num1 +" "+ num2 +" "+ num3);//123
	 if((num2 >= num1) && (num1 > num3 )){ //
		System.out.print(num2 +" "+  num1 + " "+ num3);//213
	}//else if((num3 >= num1) && (num2 > num1 )){
   		//System.out.print(num3 +" "+  num2 +" "+ num1);//321
	//}
	if((num3 >= num1) && (num1 > num2)){

   		System.out.print(num3 +" "+ num1 +" "+ num2);//312
	}
	if((num1 >= num3) && (num3 > num2)){

   		//System.out.print(num1 +" "+ num3 +" "+ num2);//132
	}
	//if((num2 >= num3) && (num3 > num1)){

   		System.out.print(num3 +" "+ num2 +" "+ num1);//231
	//}
	
}
}

//312 no sale nada
//132 se duplica