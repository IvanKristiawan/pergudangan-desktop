/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Manager;

/**
 *
 * @author ASUS
 */
public class TableManager extends AbstractTableModel {
    private List<Manager> list;

    public TableManager(List<Manager> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKodeManager();
            case 1:
                return list.get(rowIndex).getNamaManager();
            case 2:
                return list.get(rowIndex).getKodeGudang().getKodeGudang();
            case 3:
                return list.get(rowIndex).getKodeGudang().getNamaGudang();
            case 4:
                return list.get(rowIndex).getKodeGudang().getAlamatGudang();
            default:
                return null;

        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Manager";
            case 1:
                return "Nama Manager";
            case 2:
                return "Kode Gudang";
            default:
                return null;
        }
    }
}
