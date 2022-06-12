/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.ManagerDAO;
import java.util.List;
import model.Manager;
import table.TableManager;
/**
 *
 * @author ASUS
 */
public class ManagerControl {
    private ManagerDAO dDao = new ManagerDAO();
    
    public void insertDataManager(Manager d) {
        dDao.insertManager(d);
    }
    
    public TableManager showManager(String query){
        List<Manager> dataManager = dDao.showManager(query);
        TableManager tableManager = new TableManager(dataManager);
        
        return tableManager;
    }
    
    public void deleteDataManager(String noInduk) {
        dDao.deleteManager(noInduk);
    }
}
