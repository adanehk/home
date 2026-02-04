
package puntoejercicio;


public class main {
    public static void main(String[]args){
        Punto p1 = new Punto(2,3);
        Punto p2 = new Punto(3,2);
        
        Punto3D p1D = new Punto3D(2,3,4);
        Punto3D p2D = new Punto3D(4,2,3);
        
        System.out.println(p1);
        System.out.println(p1D);
        p1.desplaza(4,2);
        p1D.desplaza(3,2,6);
        
        System.out.println(p1);
        System.out.println(p1D);
        
        p1.estaALaIzquierda(p2);
        p1D.estaDestras(p2D);
        
    }
}
