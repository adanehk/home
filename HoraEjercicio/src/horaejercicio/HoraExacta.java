
package horaejercicio;


public class HoraExacta extends Hora {
    private int segundos;
    
    public HoraExacta(int hora, int minuto,int segundos){
        super(hora,minuto);
        this.segundos=segundos;
        klk();
        
    }
    public void setSegundos(int segundos){
        this.segundos=segundos;
        klk();
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void Inc() {
        
        segundos += 1;
        
    }
    public void klk(){
        if(segundos<0||segundos>59){
            System.out.println("Valores no permitidos, los parametros aceptados son entre 0 y 59. Segundos = 0");
            this.segundos = 0;
        }
    }
    
    public boolean equals(HoraExacta otraHora){
        boolean sonIguales = false;
        if(this.getHora()==otraHora.getHora()&&this.getMinutos()==otraHora.getMinutos()&&this.getSegundos()==otraHora.getSegundos()){
          sonIguales=true;  
        }else{
            sonIguales=false;
        }
        
        return sonIguales;
    }
}
