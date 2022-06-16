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
import model.Supplier;
import model.Gudang;
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
                + d.getKodeSupplier().getKodeSupplier() + "', '" + d.getKodeGudang().getKodeGudang() + "')";
        
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
    
    public List<Stok> showStok(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT mk.*, d.*, g.* FROM stok as mk JOIN supplier as d ON d.kodeSupplier = mk.kodeSupplier"
                + "JOIN gudang as g ON d.kodeGudang = g.kodeGudang "
                + " WHERE (mk.kodeSupplier LIKE "
                + "'%" + query + "%'"
                + "OR mk.kodeGudang LIKE '%" + query + "%')";
        System.out.println("Mengambil Stok...");
        List<Stok> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Supplier d = new Supplier (
                        rs.getString("d.kodeSupplier"),
                        rs.getString("d.namaSupplier"),
                        rs.getString("d.alamatSupplier")
                    );
                    Gudang g = new Gudang (
                        rs.getString("g.kodeGudang"),
                        rs.getString("g.namaGudang"),
                        rs.getString("g.alamatGudang")
                    );
                    Stok mk = new Stok(rs.getString("mk.kodeStok"), rs.getString("mk.namaStok"), rs.getInt("mk.kuantitas"), d, g);
                    list.add(mk);
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

    public Stok searchStok(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM stok WHERE nomor_induk_stok = '" + noInduk + "'";
        System.out.println("Searching Stok...");
        Stok d = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Supplier s = new Supplier (
                        rs.getString("kodeSupplier"),
                        rs.getString("namaSupplier"),
                        rs.getString("alamatSupplier")
                    );
                    Gudang g = new Gudang (
                        rs.getString("kodeGudang"),
                        rs.getString("namaGudang"),
                        rs.getString("alamatGudang")
                    );
                    d = new Stok(
                        rs.getString("kodeStok"), 
                        rs.getString("namaStok"), 
                        rs.getInt("kuantitas"), 
                        s, 
                        g
                    );
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
        
        return d;
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
