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
        
        String supplierString = "";
        for (int i=0; i < dataSupplier.size(); i++){
            supplierString = supplierString + dataSupplier.get(i).showDataSupplier() + "\n";
        }
        
        return supplierString;
    }
    
    public void deleteDataSupplier(String noInduk) {
        dDao.deleteSupplier(noInduk);
    }
    
    public Supplier searchSupplier(String noInduk) {
        Supplier d = null;
        d = dDao.searchSupplier(noInduk);
        
        return d;
    }
    
    public List<Supplier> showListSupplier() {
        List<Supplier> dataSupplier = dDao.showSupplier();
        return dataSupplier;
    }
}
