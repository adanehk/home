
package alumnosarraybbdd;

import java.sql.*;
import java.util.ArrayList;
public class AlumnosArrayBBDD {

    
    public static void main(String[] args) {
        ResultSet rs;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/ALUMNOSJAVA", "root", "root");

            Statement statement = conexion.createStatement();
            
            rs = statement.executeQuery("Select * from ALUMNOSJAVA");
            ArrayList<Alumno> alumnos = new ArrayList<>();
            while(rs.next()){
                String nombre=rs.getString("nombre");
                String poblacion=rs.getString("poblacion");
                int edad=rs.getInt("edad");
                
                alumnos.add(new Alumno(nombre,poblacion,edad));
            }
            conexion.close();
            for(Alumno alumno: alumnos){
                System.out.println(alumno);
            }
        
        } catch (ClassNotFoundException ex) {
            System.out.println("jigbgibigtuibtug");
            System.getLogger(AlumnosArrayBBDD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(AlumnosArrayBBDD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);

        }
    }
    
}
