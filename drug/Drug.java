/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drug;

/**
 *
 * @author Abhijeeth V Madalgi
 */
import java.util.*;
import java.sql.*;
public class Drug {

    public static void main(String args[])
    {
    try{
         DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","abhij","naanu");  
        Statement stmt=con.createStatement();

    
    ResultSet rs=stmt.executeQuery("select * from medicine");
    System.out.println("eee");
    int i=0;
    while(rs.next()==true)
    {
        
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
    }
    
    con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
