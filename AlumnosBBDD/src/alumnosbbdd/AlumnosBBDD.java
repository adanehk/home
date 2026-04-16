package alumnosbbdd;

import java.sql.*;
import java.util.Scanner;

public class AlumnosBBDD {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ResultSet rs;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/ALUMNOSJAVA", "root", "root");

            Statement statement = conexion.createStatement();
            System.out.println("nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("poblacion: ");
            String poblacion = entrada.nextLine();
            statement.executeUpdate("Insert into ALUMNOSJAVA (nombre,poblacion,edad) values ('" + nombre + "','" + poblacion + "','" + edad + "')");
            rs = statement.executeQuery("Select * from ALUMNOSJAVA");

            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("Nombre") + " ");
                System.out.println("Poblacion: " + rs.getString("poblacion"));
                System.out.println("Edad: " + rs.getString("edad"));
            }
            rs = statement.executeQuery("SELECT * FROM ALUMNOSJAVA WHERE edad < 18");
            System.out.println("Menores de edad:");
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Poblacion: " + rs.getString("poblacion"));
                System.out.println("Edad: " + rs.getInt("edad"));
                
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("jigbgibigtuibtug");
            System.getLogger(AlumnosBBDD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(AlumnosBBDD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);

        }
        
    }

}
