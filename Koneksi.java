/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ChairulHamni
 */
public class Koneksi {
    public Statement state;
    public Connection connect;
    private String namaDatabase = "jdbc:mysql://localhost:3306/db_laundry";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(namaDatabase,"root","123");
            System.out.println("tidak ada masalah dalam koneksi");
            state = connect.createStatement();
        } catch (SQLException ex) {
            System.err.println("Cek url, dan hostnya");
            System.err.println(""+ex.getMessage());
        }
    }
    
}