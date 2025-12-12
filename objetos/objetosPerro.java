public class obetosPerro {
    public static void main(String[] args) {
    Perro perro1 = new Perro("Rex", "Pastor Alemán", 5, "Juan Pérez");
    Dueno dueno1 = new Dueno("Juan Pérez", "Calle Falsa 123", "30");
    Perro perro2 = new Perro("Luna", "Labrador", 3, "María Gómez");
    Dueno dueno2 = new Dueno("María Gómez", "Avenida Siempre Viva 456", "28");
    perro1.setDueno(dueno1.getNombre());
    perro2.setDueno(dueno2.getNombre());

    System.out.println("¡Guau, guau! Soy" + perro1.getNombre()+ ", un " + perro1.getRaza() +
}
}