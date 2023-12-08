/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlin
 */
public class sql_connector {
    
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "user_db";
    private static Integer portNumber = 3306;
    private static String password = "";

    
    
    public static Connection getSqlConnection(){
       
        Connection connect = null;
        
        MysqlDataSource sqlDataSource = new MysqlDataSource();
        
        sqlDataSource.setServerName(serverName);
        sqlDataSource.setUser(userName);
        sqlDataSource.setDatabaseName(dbName);
        sqlDataSource.setPortNumber(portNumber);
        sqlDataSource.setPassword(password);
        
        try{
            connect = (Connection) sqlDataSource.getConnection();
            JOptionPane.showMessageDialog(null, "Conexión a BD exitosa", "Conexión", 2);
        }
        catch(SQLException ex){
            Logger.getLogger("Geting Connection -> " + sql_connector.class.
        getName()).log(Level.SEVERE, null, ex);
            System.out.println("Can´t connect to database");
        }
        return connect;
    }
}
