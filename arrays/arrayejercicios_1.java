import java.util.Scanner;

public class arrayejercicios_1{
    static Scanner entrada = new Scanner (System.in);
    public static void main (String[]args){


        String[] saludos = {"Buenos dias", "Buenas tardes", "Buenas noches"};
        System.out.println("¿Que hora es?");
        int hora = entrada.nextInt();
        if(hora < 12 && hora > 6){
            System.out.println(saludos[0]);
        }else if(hora < 20 && hora > 12){
            System.out.println(saludos[1]);
        }else if(hora == 0 || hora > 20){
            System.out.println(saludos[2]);
        }
        while(hora <0 || hora > 23){
            System.out.println("Pero pon una hora tonto");
            hora = entrada.nextInt();
        }

    }


}