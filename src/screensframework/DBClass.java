/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author T. v Duykeren
 */
public class DBClass {
   
     public Connection getConnection() throws ClassNotFoundException, SQLException{       
           Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://192.168.0.1:3306/dbname","mysqluser","mysqluserpwd"); 
     }
}

