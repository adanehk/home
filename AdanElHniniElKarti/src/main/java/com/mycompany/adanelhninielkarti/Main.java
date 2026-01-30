
package com.mycompany.adanelhninielkarti;


public class Main {
    public static void main(String[]args){
    Autor autor1=new Autor("Adan","Barakaldo");
    Autor autor2=new Autor("Javi");
    
    Libro libro1=new Libro("titulo1",100,autor1);
    Libro libro2=new Libro("titulo2",200,autor2);
    Libro libro3=new Libro("titulo3",300,autor1);
    Libro libro4=new Libro("titulo4",400,autor1);
    Libro libro5=new Libro("titulo5",500,autor1);
    
    Balda balda1=new Balda("Terror",30);
    Balda balda2=new Balda("Comedia",20);
    
       
        balda1.agregarLibro(libro1);
        balda1.agregarLibro(libro2);
        balda1.agregarLibro(libro3);
        balda2.agregarLibro(libro4);
        balda2.agregarLibro(libro5);
        System.out.println(libro1);
        System.out.println(balda1.contarLibrosGrandes(200));
        
        
        
        
        
    
    }
}
