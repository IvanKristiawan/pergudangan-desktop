/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.GudangDAO;
import java.util.List;
import model.Gudang;
/**
 *
 * @author ASUS
 */
public class GudangControl {
    private GudangDAO dDao = new GudangDAO();
    
    public void insertDataGudang(Gudang d) {
        dDao.insertGudang(d);
    }
    
    public String showDataGudang() {
        List<Gudang> dataGudang = dDao.showGudang();
        
        String dosenString = "";
        for (int i=0; i < dataGudang.size(); i++){
            dosenString = dosenString + dataGudang.get(i).showDataGudang() + "\n";
        }
        
        return dosenString;
    }

    public Gudang searchGudang(String noInduk) {
        Gudang d = null;
        d = dDao.searchGudang(noInduk);
        
        return d;
    }
    
    public void deleteDataGudang(String noInduk) {
        dDao.deleteGudang(noInduk);
    }
    
    public List<Gudang> showListGudang() {
        List<Gudang> dataGudang = dDao.showGudang();
        return dataGudang;
    }
}
