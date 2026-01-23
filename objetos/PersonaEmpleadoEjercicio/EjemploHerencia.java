public class EjemploHerencia{
    public static void main(String[] args) {
        PersonaEjemploHerencia persona1 = new PersonaEjemploHerencia("Adan",20);
        
        EjemploHerenciaEmpleado empleado1=new EjemploHerenciaEmpleado("Antonio",21,3);

        EjemploHerenciaEmpleado empleado2=new EjemploHerenciaEmpleado("CR7",50,3000);
        
        PersonaEjemploHerencia persona2 = new EjemploHerenciaEmpleado("Isma",33,2000);
        SupervisorEjemploHerencia supervisor1 = new SupervisorEjemploHerencia("1", 20, 3000,"4c");

        SupervisorEjemploHerencia supervisor2 = new SupervisorEjemploHerencia("3", 23, 4000,"5c");

        supervisor1.addEmpleado(empleado1);
        supervisor2.addEmpleado(empleado2);
       
        PersonaEjemploHerencia[] personas=new PersonaEjemploHerencia[3];
        personas[0]=persona1;
        personas[1]=empleado1;
        personas[2]=new AlumnoEjemploHerencia ("Pablo",18,"Dam 1");
        PersonaEjemploHerencia persona3 = new EjemploHerenciaEmpleado("Pepe",30,5000);
        EjemploHerenciaEmpleado[] listaEmpleados=new EjemploHerenciaEmpleado[1];
        listaEmpleados[0]=empleado1;
        listaEmpleados[1]=empleado2;

        supervisor1.setEmpleados(listaEmpleados);

        for(int i =0;i<listaEmpleados.length;i++){
            listaEmpleados[i].trabajar();

        }

        for (int i = 0;i< personas.length;i++) {
            personas[i].saludar();
        }
    }
}