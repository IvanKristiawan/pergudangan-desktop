/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.SupplierDAO;
import java.util.List;
import model.Supplier;
/**
 *
 * @author ASUS
 */
public class SupplierControl {
    private SupplierDAO dDao = new SupplierDAO();
    
    public void insertDataSupplier(Supplier d) {
        dDao.insertSupplier(d);
    }
    
    public String showDataSupplier() {
        List<Supplier> dataSupplier = dDao.showSupplier();
        
        String dosenString = "";
        for (int i=0; i < dataSupplier.size(); i++){
            dosenString = dosenString + dataSupplier.get(i).showDataSupplier() + "\n";
        }
        
        return dosenString;
    }
    
    public void deleteDataSupplier(String noInduk) {
        dDao.deleteSupplier(noInduk);
    }
}
