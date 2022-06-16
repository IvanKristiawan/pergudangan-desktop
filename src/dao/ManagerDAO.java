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
import model.Manager;
/**
 *
 * @author ASUS
 */
public class ManagerDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertManager(Manager d) {
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO manager(kodeManager, namaManager, kodeGudang)"
                + "VALUES ('" + d.getKodeManager() + "', '" + d.getNamaManager() + "', '"
                + d.getKodeGudang().getKodeGudang() + "')";
        
        System.out.println("Adding Manager...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Manager");
            statement.close();
        } catch(Exception e) {
            System.out.println("Error adding Manager...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
    
    public List<Manager> showManager(String query) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT mk.*, d.* FROM manager as mk JOIN gudang as d ON d.kodeGudang = mk.kodeGudang WHERE (mk.kodeManager LIKE "
                + "'%" + query + "%')";
        System.out.println("Mengambil Manager...");
        List<Manager> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Gudang d = new Gudang (
                        rs.getString("d.kodeGudang"),
                        rs.getString("d.namaGudang"),
                        rs.getString("d.alamatGudang")
                    );
                    Manager mk = new Manager(rs.getString("mk.kodeManager"), rs.getString("mk.namaManager"), d);
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

    public Manager searchManager(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM manager WHERE kodeManager = '" + noInduk + "'";
        System.out.println("Searching Manager...");
        Manager d = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    Gudang g = new Gudang (
                        rs.getString("d.kodeGudang"),
                        rs.getString("d.namaGudang"),
                        rs.getString("d.alamatGudang")
                    );
                    d = new Manager(
                            rs.getString("mk.kodeManager"), 
                            rs.getString("mk.namaManager"), 
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
    
    public void deleteManager(String noInduk) {
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM manager WHERE kodeManager = '" + noInduk + "'";
        System.out.println("Deleting Manager...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Manager" + noInduk);
            statement.close();
        } catch(Exception e) {
            System.out.println("Error deleting Manager...");
            System.out.println(e);
        } 
        dbCon.closeConnection();
    }
}
