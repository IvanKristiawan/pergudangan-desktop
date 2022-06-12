/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.ManagerDAO;
import java.util.List;
import model.Manager;
/**
 *
 * @author ASUS
 */
public class ManagerControl {
    private ManagerDAO dDao = new ManagerDAO();
    
    public void insertDataManager(Manager d) {
        dDao.insertManager(d);
    }
    
    public String showDataManager() {
        List<Manager> dataManager = dDao.showManager();
        
        String dosenString = "";
        for (int i=0; i < dataManager.size(); i++){
            dosenString = dosenString + dataManager.get(i).showDataManager() + "\n";
        }
        
        return dosenString;
    }
    
    public void deleteDataManager(String noInduk) {
        dDao.deleteManager(noInduk);
    }
}
