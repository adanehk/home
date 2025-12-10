import java.util.Scanner;

public class arrayejercicios_2{
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[]args){
            String[] nombres={"Messi","Alba","Busquets","Suarez","Iniesta", "Ronaldinho", "Nazario","CR7"};
            System.out.println("Venga leyendas del barca");
            String respuesta ;
           
           while(true){
            respuesta = entrada.nextLine();
           for(int i=0; i< nombres.length; i++){
               
            if(respuesta.equalsIgnoreCase(nombres[i])){
                System.out.println("Muy bueno, esta en la posicion " + (i+1));
                i=9;
            }else if(i==nombres.length-1){
                System.out.println("Eres tonto o q " + respuesta + " no es ninguna leyenda del barca");
                
            }
            
           }
            
            
    }
    }
    
}