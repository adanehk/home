public class Cliente{
     private String DNI;
     private String nombre;
     private String apellidos;
     private String direccion;
     private String telefono;
     private int edad;


    public Cliente(){
        DNI="XXXXXXXX-X";
    }
    
    public Cliente(String DNI, String nombre, String apellidos, String direccion, String telefono, int edad){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.edad=edad;
    }
    
    public String getDni(){
        return DNI;
    } 
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getEdad(){
        return edad;
    }

    public void setDni(String DNI){
        this.DNI=DNI;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setEdad(int edad){
        if(edad < 0 || edad > 150){
            System.out.println("Edad no valida, la edad sigue siendo "+ this.edad);
        }else{
        this.edad=edad;
        }
    }
    public Cliente(String nombre, String apellidos, String direccion, String telefono, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.edad=edad;
    }

    public void cumplirAnios(){
        edad++;
    }
    
    public String toString(){
        return "El cliente " + nombre + " con dni " + DNI +" tiene " + edad + " años ";
    }

}

    