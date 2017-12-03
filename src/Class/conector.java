/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gabriel
 */
public class conector {
     private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;
    Connection conectar=null;
    public Connection conexion(){
        String url = "jdbc:postgresql://localhost:5433/proyect";
        String password = "123";
        try {
            
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, "postgres", password);
            if (connection != null) {
                System.out.println("Connecting to database...");
            }
        } catch (Exception e) {
            System.out.println("Problem when connecting to the database");
        }
        return conectar;
    }
}
