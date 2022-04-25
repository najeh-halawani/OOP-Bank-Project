/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String[] args) throws Exception{
        getConnection();
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url, username, null);
            System.out.println("Conncted!");
             return conn;
        } catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
        
    /**
     *
     * @throws Exception
     */
//    public static void createTable() throws Exception{
//        try {
//            Connection con = getConnection();
//            PreparedStatement create con.prepareStatement("");
//        } catch(Exception e) {
//            System.out.println(e);
//        }
//    }

}
