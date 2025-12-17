import java.util.Scanner;

public class Ordenador{
    Scanner entrada=new Scanner(System.in);
    private String cpu;
    private String gpu;
    private String ram;
    private String psu;
    
public Ordenador(String cpu, String gpu, String ram, String psu){
    this.cpu=cpu;
    this.gpu=gpu;
    this.ram=ram;
    this.psu=psu;
}

public String getCpu(){
    return cpu;
}
public String getGpu(){
    return gpu;
}
public String getRam(){
    return ram;
}
public String getPsu(){
    return psu;
}
public void setCpu(String cpu){
    this.cpu=cpu;
}
public void setGpu(String gpu){
    this.gpu=gpu;
}
public void setRam(String ram){
    this.ram=ram;
}
public void setPsu(String psu){
    this.psu=psu;
}

public String toString(){
    return "GPU: " + this.getGpu() + "\n\n " + "CPU: " + this.getCpu() + "\n\n" + "RAM: " + this.getRam() + "\n\n" + "PSU: " + this.getPsu();
}
}