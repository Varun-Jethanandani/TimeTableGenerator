/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablecmpn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CHIRAG ROHRA
 */
public class MySQLConnect {
    public static Connection connectDB(){
    try{
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TimeTable_generator","Varun","Ishika02*");
        //JOptionPane.showMessageDialog(null,"Connection Successfulll","Conection",JOptionPane.INFORMATION_MESSAGE);
    
    return conn;
    
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"unsucessful " + e.getMessage(),"Connection",JOptionPane.ERROR_MESSAGE);
          return null;      
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"SOme unusual Error" + e.getMessage(),"Connection",JOptionPane.ERROR_MESSAGE);
          return null;     
    }
    
  }
}
