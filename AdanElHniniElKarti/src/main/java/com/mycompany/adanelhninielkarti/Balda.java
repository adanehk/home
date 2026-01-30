
package com.mycompany.adanelhninielkarti;


public class Balda {
    private String tema;
    private Libro[] libro;
    private int numLibros;
    
    
public Balda(String tema,int numLibros){
    this.tema=tema;
    libro = new Libro[numLibros];
    this.numLibros=0;
    
}

public void agregarLibro(Libro libro){
    if(numLibros<this.libro.length){
        this.libro[numLibros++]=libro;
    }


}
public int contarLibrosGrandes(int numPaginas){
    int num = 0;
    for(int i=0;i<numLibros;i++){
        if(libro[i].getPaginas()>numPaginas){
            num++;
        }
    }
    
    return num;
}

}
