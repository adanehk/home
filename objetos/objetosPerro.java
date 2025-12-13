public class objetosPerro {
    public static void main(String[] args) {
    Perro perro1 = new Perro("Rex", "Pastor Alemán", 5, "Juan Pérez ");
    Dueno dueno1 = new Dueno("Juan Pérez", "Calle Falsa 123", "30");
    Perro perro2 = new Perro("Luna", "Labrador", 3, "María Gómez");
    Dueno dueno2 = new Dueno("María Gómez", "Avenida Siempre Viva 456", "28");
    Perro perro3 = new Perro("Gatuituina", "Gato", 2, "Juan Pérez");
    Perro perro4 = new Perro("Roberto Carlos", "pitbull", 4);
    Dueno dueno3 = new Dueno("Leo Messi", "Indautxu por ahi", "22");
    perro1.setDueno(dueno1.getNombre());
    perro2.setDueno(dueno2.getNombre());
    perro3.setDueno(dueno2.getNombre());
    
    
    System.out.println(perro1+ "\n");
    System.out.println(perro2+ "\n");
    System.out.println(perro3+ "\n");
    System.out.println(perro4.validacionDueno()+ "\n");
    perro4.setDueno(dueno3.getNombre());
    System.out.println(perro4+ "\n");    
    perro3.setDueno(dueno1.getNombre());
    System.out.println(perro3);

    
}
}