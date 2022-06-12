/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Gudang;
/**
 *
 * @author ASUS
 */
public class GudangDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertGudang(Gudang d) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO gudang(kodeGudang, namaGudang, alamatGudang)"
                + "VALUES ('" + d.getKodeGudang() + "', '" + d.getNamaGudang() + "', '"
                + d.getAlamatGudang() + "')";
        
        System.out.println("Adding Gudang...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Gudang");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error adding Gudang...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
    
    public List<Gudang> showGudang() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM gudang";
        System.out.println("Mengambil data Gudang...");
        
        List<Gudang> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Gudang d = new Gudang (
                        rs.getString("kodeGudang"),
                        rs.getString("namaGudang"),
                        rs.getString("alamatGudang")
                    );
                    list.add(d);
                } 
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
        
        return list;
    }
    
    public void deleteGudang(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM gudang WHERE kodeGudang = '" + noInduk + "'";
        System.out.println("Deleting Gudang...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Gudang" + noInduk);
            statement.close();
        } catch(Exception e) {
            System.out.println("Error deleting Gudang...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
}