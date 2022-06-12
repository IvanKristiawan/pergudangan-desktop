/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.StokDAO;
import java.util.List;
import model.Stok;
import table.TableStok;
/**
 *
 * @author ASUS
 */
public class StokControl {
    private StokDAO dDao = new StokDAO();
    
    public void insertDataStok(Stok d) {
        dDao.insertStok(d);
    }
    
    public TableStok showStok(String query){
        List<Stok> dataStok = dDao.showStok(query);
        TableStok tableStok = new TableStok(dataStok);
        
        return tableStok;
    }
    
    public void deleteDataStok(String noInduk) {
        dDao.deleteStok(noInduk);
    }
} 
