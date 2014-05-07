/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WDisplay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author my pc
 */
public class Database {
    private String dbuser = "root";
    private String dbpassword = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

    public Database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/Display",dbuser,dbpassword);
            stmt = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+e.getMessage(),"Comunication ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error"+e.getMessage(),"Comunication ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
}