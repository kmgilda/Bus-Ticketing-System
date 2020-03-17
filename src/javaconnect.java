import java.sql.*;
import javax.swing.*;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejas
 */
public class javaconnect {
   Connection conn = null;
    public static Connection ConnecrDb(){
        
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketing","root","123");
    return conn;
    } catch(Exception e)
{JOptionPane.showMessageDialog(null,e);
 return null;

}
}}
