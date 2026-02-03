package puntoejercicio;

public class Punto {

    private int x = 0;
    private int y = 0;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx) {
        if (dx > 0) {
            x += dx;
        }
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
        boolean estaEncima = false;
        if(otroPunto.getY()<y){
             estaEncima = true;
        }
        return estaEncima;
    }
    public boolean estaALaIzquierda(Punto otroPunto){
        boolean estaALaIzquierda = false;
        if(otroPunto.getX()<x){
             estaALaIzquierda = true;
        }
        return estaALaIzquierda;
    }
    public String toString(){
        return "x:" + x + " y:" + y;
    }
   
}
