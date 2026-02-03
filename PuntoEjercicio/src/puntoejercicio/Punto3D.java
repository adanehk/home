
package puntoejercicio;

public class Punto3D extends Punto{
    private int z;
    
    public Punto3D(int x, int y,int z){
        super(x,y);
        this.z=z;
    }
    public void desplaza(int dx,int dy, int dz) {
        
         setX() += dx;
            y += dy;
        
    }
}
