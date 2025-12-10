import java.util.Scanner;


public class al10 {  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


    for (int i = 1; i <= 10; i++) {
    if(i ==10 -1){
	System.out.print(i + " y ");
}else if(i==10){
	System.out.println(i + ".");
}else{
	System.out.print(i + ", ");
}	
    
}



for (int i = 10; i >= 1; -- i ) {
    System.out.println(i);
}



for (int i = 1; i <= 10; i += 2) {
    System.out.println(i);
}





}

}