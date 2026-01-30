package horaejercicio;

public class Hora12 extends Hora {

    private boolean am = false;

    public Hora12(int hora, int minuto,boolean am){
        super(hora,minuto);
        this.am=am;
    }
    @Override
    public void setHora(int hora){
        
        if(this.hora<1){
            System.out.println("No se puede poner menos de 1 en la hora azbi, hora = 1");
            this.hora = 1;
        }
        if (this.hora>12){
            System.out.println("No se puede poner mas de 12 en la hora hmar, hora = 12");
            this.hora = 12;
        }
    }
    
        
        public String toString(){
            String tAm;
            if(am = true){
                
            }
            return"a";
        }
    }


