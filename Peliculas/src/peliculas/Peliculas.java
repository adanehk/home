package peliculas;

import java.sql.*;
import java.util.ArrayList;

public class Peliculas {
static ArrayList <Peli> pelis = new ArrayList<>();
    public static void main(String[] args) {
        
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/peliculas", "root", "root");

            Statement statement = conexion.createStatement();   
            
            rs = statement.executeQuery("Select * from pelis");
             
            while(rs.next()){
                String titulo=rs.getString("titulo");
                int duracion=rs.getInt("duracion");
                String genero=rs.getString("genero");
                int nota=rs.getInt("nota");
                String sinopsis=rs.getString("Sinopsis");
                
                pelis.add(new Peli(titulo,duracion,genero,nota,sinopsis));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("jigbgibigtuibtug");
            System.getLogger(Peliculas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(Peliculas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);

        }
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }

}
