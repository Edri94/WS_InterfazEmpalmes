/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.bbva.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MI05332
 */
public class ConnectionPool 
{
    private static final String USER= "negint";
    private static final String PASSWORD = "negint";
    private static final String BD = "master";
    private static final String HOST = "150.100.234.142";
    private static final String PORT = "1433";
    private static final String INSTANCE = "INSSQL002";
    private static String baseUrl = "jdbc:jtds:sqlserver://%s:%s/%s;instance=%s;user=%s;password=%s";
    private static Connection conn;
    
    private ConnectionPool()
    {
        baseUrl = String.format(baseUrl, HOST, PORT, BD, INSTANCE, USER, PASSWORD);  
        
    }
    
    public Connection getConnection() 
    {
        try 
        {
            if(conn == null)
        {
            DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
            conn = DriverManager.getConnection(baseUrl);
            
            return conn;
        }
        else 
        {
            return conn;
        }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace(System.out);
            return null;
        }
        
    }
    
    
    public void closeConnection()
    {
        try 
        {
            if(conn != null)
            {
                conn.close();
            }
            else 
            {
                System.out.println("No existe una instancia de conexion a la base de datos");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace(System.out);
        }
    }
}
