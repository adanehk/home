package arrayventana;

public class Persona {

    String nombre;
    String edad;
    String mail;

    public Persona(String nombre, String edad, String mail) {
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
