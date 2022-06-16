/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Stok;

/**
 *
 * @author ASUS
 */
public class TableStok extends AbstractTableModel {
    private List<Stok> list;

    public TableStok(List<Stok> list) {
        this.list = list;
    }

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getKodeStok();
            case 1:
                return list.get(rowIndex).getNamaStok();
            case 2:
                return list.get(rowIndex).getKuantitas();
            case 3:
                return list.get(rowIndex).getKodeSupplier().getKodeSupplier();
            case 4:
                   return list.get(rowIndex).getKodeGudang().getKodeGudang();
              
            case 5:
                return list.get(rowIndex).getKodeSupplier().getAlamatSupplier();
            case 6:
                  return list.get(rowIndex).getKodeSupplier().getNamaSupplier();
              
            case 7:
                return list.get(rowIndex).getKodeGudang().getNamaGudang();
            case 8:
                return list.get(rowIndex).getKodeGudang().getAlamatGudang();
            default:
                return null;

        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Stok";
            case 1:
                return "Nama Stok";
            case 2:
                return "Kuantitas";
            case 3:
                return "Kode Supplier";
            case 4:
                return "Kode Gudang";
            default:
                return null;
        }
    }
}
