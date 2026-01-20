public class EjemploHerencia{
    public static void main(String[] args) {
        PersonaEjemploHerencia persona1 = new PersonaEjemploHerencia("Adan",20);
        
        EjemploHerenciaEmpleado empleado1=new EjemploHerenciaEmpleado("Antonio",21,3);
        
        PersonaEjemploHerencia persona2 = new EjemploHerenciaEmpleado("Isma",33,2000);
       
        PersonaEjemploHerencia[] personas=new PersonaEjemploHerencia[3];
        personas[0]=persona1;
        personas[1]=empleado1;
        personas[2]=new AlumnoEjemploHerencia ("Pablo",18,"Dam 1");
        PersonaEjemploHerencia persona3 = new EjemploHerenciaEmpleado("Pepe",30,5000);

        for (int i = 0;i< personas.length;i++) {
            personas[i].saludar();
        }
    }
}