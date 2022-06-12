/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.StokDAO;
import java.util.List;
import model.Stok;
/**
 *
 * @author ASUS
 */
public class StokControl {
    private StokDAO dDao = new StokDAO();
    
    public void insertDataStok(Stok d) {
        dDao.insertStok(d);
    }
    
    public String showDataStok() {
        List<Stok> dataStok = dDao.showStok();
        
        String dosenString = "";
        for (int i=0; i < dataStok.size(); i++){
            dosenString = dosenString + dataStok.get(i).showDataStok() + "\n";
        }
        
        return dosenString;
    }
    
    public void deleteDataStok(String noInduk) {
        dDao.deleteStok(noInduk);
    }
}
