/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marksapp.database;

import java.sql.*;

/**
 *
 * @author loq
 */
public class MySqlConnection implements DbConnection{

    @Override
    public Connection openConnect() {
        String username="root";
        String password="admin";
        String database="java1";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,username,password);
            return conn;
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public void closeConnection(Connection conn) {
        try{
            if(conn!=null && !conn.isClosed()){
                conn.close();
            }
        }catch(Exception e){
            
        }
    }

 @Override
   public ResultSet runQuery(Connection conn, String query) {
        
        return null;
        
   }

    @Override
   public int executeUpdate(Connection conn, String query) {
        return 0;
  }

    public Connection openConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
