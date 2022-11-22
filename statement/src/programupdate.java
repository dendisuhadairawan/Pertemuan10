/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author hp
 */
public class programupdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection koneksi = koneksidatabase.getKoneksi();
        Statement statement = null ;
        try {
            statement = koneksi.createStatement();
        System.out.println("statement berhasil di buat");
            String url = "UPDATE barang SET nama_barang = 'pencil2B',jumlah=20,harga=2500 WHERE kode_barang= 'B001'";
            statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("Ststement gagal");
            System.out.println("SMS "+ex.getMessage());
        }finally{
        if (statement != null){
            try {
                statement .close();
            System.out.println("Ststement Berhasil Ditutup");
            
            }catch(SQLException ex){
            System.out.println("Ststement gagal Ditutup");
            System.out.println("SMS "+ex.getMessage());
            }
            }
        } 
        }        
    }
    

