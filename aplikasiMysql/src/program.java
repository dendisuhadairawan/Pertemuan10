/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      try {
            Driver driver = new Driver();
           DriverManager.registerDriver(driver);
           System.out.println("Berhasil Menginstal");
        }
      catch(SQLException ex){
          System.out.println("gagal install");
          System.out.println("pesan" +ex.getMessage());
      }
      
      try {
          String url="jdbc:mysql://localhost:3306/db_toko";
          String user="root";
          String pass="";
          Connection koneksi = DriverManager.getConnection(url, user, pass);
          System.out.println("koneksi ke database berhasil");
      }
      catch(SQLException ex){
          System.out.println("gagal install");
          System.out.println("pesan" +ex.getMessage());
      }
    }
    
}
