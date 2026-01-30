
package com.mycompany.adanelhninielkarti;


public class Libro {
    private String titulo;
    private int paginas;
    private Autor autor;

    public Libro(String titulo, int paginas, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }




public void setTitulo(String titulo){
    this.titulo=titulo;
}
public int getPaginas(){
    return paginas;
}

public void setPaginas(int paginas){
    this.paginas=paginas;
}
public Autor getAutor(){
    return autor;
}
public void setAutor(Autor autor){
    this.autor=autor;
}
@Override
public String toString(){
    return "Libro: " + "titulo= " + getTitulo() + " paginas= " + getPaginas() + " autor= " + autor.getNombreAutor();
}

}
