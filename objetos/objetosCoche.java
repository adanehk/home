
public class objetosCoche{
    public static void main(String[] args) {
        Coche coche1 = new Coche("123ABC12", "Skyline", "Nissan", 20000 );
        Coche coche2 = new Coche("321CBA21", "7 Gti", "GOLF", 5000);
        Coche coche3 = new Coche("434ZSD93", "Urus", "Lamborgini", 0);

        System.out.println(coche1);        
        System.out.println(coche2);        
        System.out.println(coche3);       
        coche1.setMatricula("231FDS23");
        System.out.println("");
        System.out.println(coche1);
        
        coche2.setMatricula("434ZSD93");
        System.out.println("");
        System.out.println(coche2);    
        coche3.setMatricula("123ABC12");
        System.out.println("");
        System.out.println(coche3); 
        coche1.viajar();   
        coche1.getKilometros();
        
        }
}