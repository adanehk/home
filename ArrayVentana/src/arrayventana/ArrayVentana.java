package arrayventana;

import java.util.ArrayList;

public class ArrayVentana {

    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas;
        listaPersonas = new ArrayList<>();
        Persona p1 = new Persona("Carlos", "19", "a@a.a");
        Persona p2 = new Persona("Juan", "91", "b@b.b");
        Persona p3 = new Persona("Oscar", "15", "c@c.c");
        Persona p4 = new Persona("Esther", "24", "d@d.d");
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        Ventana ventana = new Ventana(listaPersonas);
        ventana.setVisible(true);
    }

}
