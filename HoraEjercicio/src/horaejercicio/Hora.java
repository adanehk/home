package horaejercicio;

public class Hora {

    private int hora = 0;
    private int minuto = 0;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
        if(hora <0){
            System.out.println("No se puede poner numeros negativos, hora = 0");
            hora=0;
        }
        if(hora > 23){
            System.out.println("No se puede poner mas de 23 horas, horas = 23");
            hora = 23;
        }
        
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
        if (minuto < 0) {
            System.out.println("No puedes poner menos de 0 minutos tonto, minutos = 0");
            minuto = 0;
        }
        if(minuto>59){
            System.out.println("El maximo es 59 animal, minutos = 59");
        }
    }

    public void Hora(int horaX, int minutoX) {
        Hora hora = new Hora(14, 20);
    }

    public void Inc() {
        minuto += 1;
    }
    public String toString(){
        String tMinuto;
        if(minuto<10){
            tMinuto=":0"+minuto;
        }else{
            tMinuto= ":"+minuto;
        }
        return hora + tMinuto;
    }
    
    
}
