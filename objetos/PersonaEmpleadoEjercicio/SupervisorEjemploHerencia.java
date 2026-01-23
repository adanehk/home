public class SupervisorEjemploHerencia extends EjemploHerenciaEmpleado{
    private EjemploHerenciaEmpleado[] empleados;
    private String despacho;
    private int numEmpleados = 0;

public SupervisorEjemploHerencia(String nombre,int edad,int sueldo,String despacho){
    super(nombre,edad,sueldo);
    this.empleados=new EjemploHerenciaEmpleado[2];
    this.despacho=despacho;
    this.numEmpleados=0;
}
public EjemploHerenciaEmpleado[] getEmpleados(){
    return empleados;
}
public void setEmpleados(EjemploHerenciaEmpleado[] empleados){
    this.empleados=empleados;
    numEmpleados=empleados.length;
}

public String getDespacho(){
    return despacho;
}
public void setDespacho(String despacho){
    this.despacho=despacho;
}
public void addEmpleado(EjemploHerenciaEmpleado empleado){
    if(numEmpleados<empleados.length){
        empleados[numEmpleados++]=empleado;
    }
}
}