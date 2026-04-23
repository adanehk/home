
package peliculas;


public class Peli {
    String titulo; 
    int duracion; 
    String genero; 
    int nota; 
    String sinopsis;

public Peli(String titulo,int duracion,String genero,int nota,String sinopsis){
    this.titulo=titulo;
    this.duracion=duracion;
    this.genero=genero;
    this.nota=nota;
    this.sinopsis=sinopsis;
}

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public int getNota() {
        return nota;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

public String toString(){
    return getTitulo();
}
}