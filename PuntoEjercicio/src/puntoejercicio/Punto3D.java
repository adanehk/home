
package puntoejercicio;

public class Punto3D extends Punto{
    private int z;
    
    public Punto3D(int x, int y,int z){
        super(x,y);
        this.z=z;
    }
    public int getZ(){
        return z;
    }
    public void desplaza(int dx,int dy, int dz) {
        
         setX((dx + getX()));
         setY((dy + getY()));   
         setX((dz + this.z));
    }
    public boolean estaDestras(Punto3D otroPunto3D){
        boolean estaDetras = false;
        if(otroPunto3D.getZ()<z){
             estaDetras = true;
        }
        if(estaDetras==true){
            System.out.println("X");
        }
        return estaDetras;
    }
    
    public String toString(){
        return "x:" + getX() + " y:" + getY() + " z:" + z;
    }

}
