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
import model.Stok;
/**
 *
 * @author ASUS
 */
public class StokDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertStok(Stok d) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO stok(kodeStok, namaStok, kuantitas, kodeSupplier, kodeGudang)"
                + "VALUES ('" + d.getKodeStok() + "', '" + d.getNamaStok() + "', '"
                + d.getKuantitas() + "', '" + d.getKuantitas() + "', '"
                + d.getKodeSupplier() + "', '" + d.getKodeGudang() + "')";
        
        System.out.println("Adding Stok...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Stok");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error adding Stok...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
    
    public List<Stok> showStok() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM stok";
        System.out.println("Mengambil data Stok...");
        
        List<Stok> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Stok d = new Stok (
                        rs.getString("kodeStok"),
                        rs.getString("namaStok"),
                        rs.getInt("kuantitas"),
                        rs.getString("kodeSupplier"),
                        rs.getString("kodeGudang")
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
    
    public void deleteStok(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM stok WHERE kodeStok = '" + noInduk + "'";
        System.out.println("Deleting Stok...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Stok" + noInduk);
            statement.close();
        } catch(Exception e) {
            System.out.println("Error deleting Stok...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
}
