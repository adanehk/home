
public class objetos1{
    public static void main(String[]args){
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente("12345678-A" , "Jose", "Hernandez", "Indautxu","672317872", 44);
        
        System.out.println(cliente3.getDni());  
        System.out.println(cliente3.getNombre());  
        Cliente cliente4 = new Cliente("98765432-A" , "Mario", "Marinez", "Abando","324234223", 21);
        Cliente cliente5 = new Cliente("73282372-A" , "Adan", "Messi", "Deusto","432424433", 16);
        System.out.println("La edad de " + cliente4.getNombre() + " es de " + cliente4.getEdad());
        cliente5.setDni("79002509-Q");
        cliente5.getDni();
        cliente1.setDni("12345678-C");
        cliente1.setEdad(13);
        cliente1.setNombre("Paco");
        cliente2.setNombre("Andres");

        System.out.println(cliente1.toString());

        cliente1.cumplirAnios();

        System.out.println(cliente1.toString());

        System.out.println("El nombre del cliente nº 5 es " + cliente2.getNombre());
        
          }
        
}