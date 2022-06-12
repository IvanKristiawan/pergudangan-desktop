/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import control.GudangControl;
import control.ManagerControl;
import java.util.List;
import exception.InputKosongException;
import exception.NoKodeException;
import javax.swing.JOptionPane;
import model.Gudang;
import model.Manager;
/**
 *
 * @author acer1
 */
public class ViewManager extends javax.swing.JFrame {
    private GudangControl gudangControl;
    private ManagerControl managerControl;
    List<Gudang> listGudang;
    List<Manager> listManager;
    String action = null;
    /**
     * Creates new form ViewGudang
     */
    public ViewManager() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        managerControl = new ManagerControl();
        showManager();
        setGudangToDropdown();
    }
    
    public void setComponent(boolean value) {
        input1.setEnabled(value);
        input2.setEnabled(value);
        dropdown.setEnabled(value);
        
        tambahButton.setEnabled(value);
        simpanButton.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value) {
        hapusButton.setEnabled(value);
    }
    
    public void clearText() {
        input1.setText("");
        input2.setText("");
    }
    
    public void setGudangToDropdown() {
        listGudang = gudangControl.showListGudang();
        for (int i = 1; i < listGudang.size(); i++){
            dropdown.addItem(listGudang.get(i));
        } 
    }
    
    public void showManager() {
        outputArea.setText(managerControl.showDataManager());
    }
    
    public void InputKosongException() throws InputKosongException {
        if(input1.getText().isEmpty() || input2.getText().isEmpty()) {
                throw new InputKosongException();
            }
    }
    
    public void NoKodeException() throws NoKodeException {
        if(input1.getText().length() != 5) {
            throw new NoKodeException();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopBar = new javax.swing.JPanel();
        TabGudang = new javax.swing.JPanel();
        gudang = new javax.swing.JLabel();
        TabManager = new javax.swing.JPanel();
        Manager = new javax.swing.JLabel();
        TabSupplier = new javax.swing.JPanel();
        supplier = new javax.swing.JLabel();
        TabStok = new javax.swing.JPanel();
        Stok = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        inputLabel1 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        inputLabel2 = new javax.swing.JLabel();
        input2 = new javax.swing.JTextField();
        inputLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        dropdown = new javax.swing.JComboBox<>();
        BottomBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TopBar.setBackground(new java.awt.Color(108, 201, 253));

        TabGudang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        gudang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gudang.setText("Gudang");

        javax.swing.GroupLayout TabGudangLayout = new javax.swing.GroupLayout(TabGudang);
        TabGudang.setLayout(TabGudangLayout);
        TabGudangLayout.setHorizontalGroup(
            TabGudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabGudangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gudang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabGudangLayout.setVerticalGroup(
            TabGudangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabGudangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gudang)
                .addContainerGap())
        );

        TabManager.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Manager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Manager.setText("Manager");

        javax.swing.GroupLayout TabManagerLayout = new javax.swing.GroupLayout(TabManager);
        TabManager.setLayout(TabManagerLayout);
        TabManagerLayout.setHorizontalGroup(
            TabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manager)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabManagerLayout.setVerticalGroup(
            TabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabManagerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Manager)
                .addContainerGap())
        );

        TabSupplier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        supplier.setText("Supplier");

        javax.swing.GroupLayout TabSupplierLayout = new javax.swing.GroupLayout(TabSupplier);
        TabSupplier.setLayout(TabSupplierLayout);
        TabSupplierLayout.setHorizontalGroup(
            TabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabSupplierLayout.setVerticalGroup(
            TabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabSupplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplier)
                .addContainerGap())
        );

        TabStok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Stok.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Stok.setText("Stok");

        javax.swing.GroupLayout TabStokLayout = new javax.swing.GroupLayout(TabStok);
        TabStok.setLayout(TabStokLayout);
        TabStokLayout.setHorizontalGroup(
            TabStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabStokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabStokLayout.setVerticalGroup(
            TabStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabStokLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Stok)
                .addContainerGap())
        );

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 51));
        Title.setText("Sistem Pergudangan ");

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(TabGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TabManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TabGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TabSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(TopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Container.setBackground(new java.awt.Color(255, 255, 255));

        inputLabel1.setText("Kode Manager");

        inputLabel2.setText("Nama Manager");

        inputLabel3.setText("Kode Gudang");

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(29, 29, 29))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputLabel3)
                            .addComponent(inputLabel2)
                            .addComponent(inputLabel1)
                            .addComponent(input2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(input1)
                            .addComponent(dropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addComponent(tambahButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusButton)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addComponent(simpanButton)
                                .addGap(52, 52, 52))))))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahButton)
                    .addComponent(hapusButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BottomBar.setBackground(new java.awt.Color(108, 201, 253));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Production By : Kelompok 2 ");

        javax.swing.GroupLayout BottomBarLayout = new javax.swing.GroupLayout(BottomBar);
        BottomBar.setLayout(BottomBarLayout);
        BottomBarLayout.setHorizontalGroup(
            BottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomBarLayout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BottomBarLayout.setVerticalGroup(
            BottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomBarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BottomBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdownActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        // TODO add your handling code here:
        setComponent(true);
        clearText();
        action = "Tambah";
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,
            "Apakah yakin ingin menghapus data ?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION) {
            try {
                managerControl.deleteDataManager(input1.getText());
                clearText();
                showManager();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            } catch(Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        try {
            InputKosongException();
            NoKodeException();
            int selectedIndex = dropdown.getSelectedIndex();
            Gudang selectedGudang = listGudang.get(selectedIndex);
            
            if(action.equals("Tambah")) {
                Manager d = new Manager(input1.getText(), input2.getText(), selectedGudang);
                managerControl.insertDataManager(d);
            }
            clearText();
            showManager();
            setComponent(false);
            setEditDeleteBtn(false);
        } catch(InputKosongException e) {
            JOptionPane.showMessageDialog(this, e.message());
        } catch(NoKodeException e) {
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomBar;
    private javax.swing.JPanel Container;
    private javax.swing.JLabel Manager;
    private javax.swing.JLabel Stok;
    private javax.swing.JPanel TabGudang;
    private javax.swing.JPanel TabManager;
    private javax.swing.JPanel TabStok;
    private javax.swing.JPanel TabSupplier;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TopBar;
    private javax.swing.JComboBox<Gudang> dropdown;
    private javax.swing.JLabel gudang;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JLabel inputLabel2;
    private javax.swing.JLabel inputLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel supplier;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
