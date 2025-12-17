import java.util.Scanner;
public class objetosOrdenador{
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     System.out.println("¿Cuantos ordenadores tienes?");
     int cantidad = entrada.nextInt();   
     entrada.nextLine();
     Ordenador[] ordenadores = new Ordenador[cantidad];
     
     for(int i = 0;i<ordenadores.length;i++) {
        
        System.out.println("Datos del " + (i+1) + "º ordenador: \n");
        System.out.println("CPU: ");
        String cpu =entrada.nextLine();
        
        
        System.out.println("GPU: ");
        String gpu =entrada.nextLine();
        

        System.out.println("RAM: ");
        String ram =entrada.nextLine();
        

        System.out.println("PSU: ");
        String psu =entrada.nextLine();
        System.out.println("\n \n \n");
        Ordenador ordenador = new Ordenador(cpu, gpu, ram, psu);

        ordenadores[i] = ordenador; 
        
        for (int x = 0;x<ordenadores.length;x++) {
            System.out.println("Informacion del " + (x+1) + "º ordenador: \n");
            System.out.println(ordenadores[x] + "\n \n \n");
        }
        
     }
    }
}