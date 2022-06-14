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
import model.Supplier;
/**
 *
 * @author ASUS
 */
public class SupplierDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertSupplier(Supplier d) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO supplier(kodeSupplier, namaSupplier, alamatSupplier)"
                + "VALUES ('" + d.getKodeSupplier() + "', '" + d.getNamaSupplier() + "', '"
                + d.getAlamatSupplier() + "')";
        
        System.out.println("Adding Supplier...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Supplier");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error adding Supplier...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
    
    public List<Supplier> showSupplier() {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM supplier";
        System.out.println("Mengambil data Supplier...");
        
        List<Supplier> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Supplier d = new Supplier (
                        rs.getString("kodeSupplier"),
                        rs.getString("namaSupplier"),
                        rs.getString("alamatSupplier")
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

    public Supplier searchSupplier(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM supplier WHERE kodeSupplier = '" + noInduk + "'";
        System.out.println("Searching Supplier...");
        Supplier d = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    d = new Supplier(
                            rs.getString("kodeSupplier"),
                            rs.getString("namaSupplier"),
                            rs.getString("alamatSupplier")
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
    
    public void deleteSupplier(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM supplier WHERE kodeSupplier = '" + noInduk + "'";
        System.out.println("Deleting Supplier...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Supplier" + noInduk);
            statement.close();
        } catch(Exception e) {
            System.out.println("Error deleting Supplier...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
}
