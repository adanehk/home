package puntoejercicio;

public class Punto {

    private int x = 0;
    private int y = 0;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx) {
       
            x += dx;
        
    }
    public void desplaza(int dx,int dy) {
       
            x += dx;
            y += dy;
        
    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public boolean estaEncima(Punto otroPunto){
        return otroPunto.getY()<y;
    }
    public boolean estaALaIzquierda(Punto otroPunto){
        
        return otroPunto.getX()<x;
             
    }
    public String toString(){
        return "x:" + x + " y:" + y;
    }
   
}
