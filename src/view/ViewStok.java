/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import control.StokControl;
import control.GudangControl;
import control.SupplierControl;
import java.util.List;
import exception.InputKosongException;
import exception.NoKodeException;
import javax.swing.JOptionPane;
import model.Stok;
import model.Gudang;
import model.Supplier;
/**
 *
 * @author acer1
 */
public class ViewStok extends javax.swing.JFrame {
    private StokControl stokControl;
    private GudangControl gudangControl;
    private SupplierControl supplierControl;
    List<Gudang> listGudang;
    List<Stok> listStok;
    List<Supplier> listSupplier;
    String action = null;
    /**
     * Creates new form ViewGudang
     */
    public ViewStok() {
        initComponents();
        setComponent(true);
        setEditDeleteBtn(false);
        gudangControl = new GudangControl();
        stokControl = new StokControl();
        supplierControl = new SupplierControl();
        showStok();
        setGudangToDropdown();
        setSupplierToDropdown();
    }
    
    public void setComponent(boolean value) {
        input1.setEnabled(value);
        input2.setEnabled(value);
        dropdown.setEnabled(value);
        dropdown1.setEnabled(value);
        
        tambahButton.setEnabled(true);
        simpanButton.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value) {
        hapusButton.setEnabled(value);
    }
    
    public void clearText() {
        input1.setText("");
        input2.setText("");
        input3.setText("");
    }
    
    public void setGudangToDropdown() {
        listGudang = gudangControl.showListGudang();
        for (int i = 0; i < listGudang.size(); i++){
            dropdown.addItem(listGudang.get(i));
        } 
    }
    
    public void setSupplierToDropdown() {
        listSupplier = supplierControl.showListSupplier();
        for (int i = 0; i < listSupplier.size(); i++){
            dropdown1.addItem(listSupplier.get(i));
        } 
    }
    
    public void showStok() {
        jTable1.setModel(stokControl.showStok(""));
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
        input3 = new javax.swing.JTextField();
        tambahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        inputLabel4 = new javax.swing.JLabel();
        inputLabel5 = new javax.swing.JLabel();
        dropdown = new javax.swing.JComboBox<>();
        dropdown1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        BottomBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        TopBar.setBackground(new java.awt.Color(108, 201, 253));

        TabGudang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabGudang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabGudangMouseClicked(evt);
            }
        });

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
        TabManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabManagerMouseClicked(evt);
            }
        });

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
        TabSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabSupplierMouseClicked(evt);
            }
        });

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
        TabStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabStokMouseClicked(evt);
            }
        });

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

        inputLabel1.setText("Kode Stok");

        inputLabel2.setText("Nama Stok");

        inputLabel3.setText("Kuantitas");

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        inputLabel4.setText("Kode Supplier");

        inputLabel5.setText("Kode Gudang");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLabel1)
                                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLabel5)
                                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputLabel3)
                            .addComponent(inputLabel2)
                            .addComponent(input2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(input3))
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputLabel4)
                                    .addComponent(dropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(simpanButton)
                                .addGap(91, 91, 91))))
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(tambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(55, 55, 55))))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tambahButton)
                        .addComponent(hapusButton)))
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(inputLabel5)
                        .addGap(28, 28, 28))
                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addComponent(inputLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel2)
                    .addComponent(inputLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanButton))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                stokControl.deleteDataStok(input1.getText());
                clearText();
                showStok();
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
            int selectedIndex1 = dropdown1.getSelectedIndex();
            Supplier selectedSupplier = listSupplier.get(selectedIndex);
            
            Stok d = new Stok(input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), selectedSupplier, selectedGudang);
            stokControl.insertDataStok(d);
            clearText();
            showStok();
            setComponent(false);
            setEditDeleteBtn(false);
        } catch(InputKosongException e) {
            JOptionPane.showMessageDialog(this, e.message());
        } catch(NoKodeException e) {
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void TabGudangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabGudangMouseClicked
        // TODO add your handling code here:
        ViewGudang dv = new ViewGudang();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_TabGudangMouseClicked

    private void TabManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabManagerMouseClicked
        // TODO add your handling code here:
        ViewManager dv = new ViewManager();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_TabManagerMouseClicked

    private void TabSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabSupplierMouseClicked
        // TODO add your handling code here:
        ViewStok dv = new ViewStok();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_TabSupplierMouseClicked

    private void TabStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabStokMouseClicked
        // TODO add your handling code here:
        ViewStok dv = new ViewStok();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_TabStokMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        // Ketika button cari diklik maka akan menonaktifkan component Input
        setEditDeleteBtn(true);
        setComponent(false);
        
        try {
            Stok stok = stokControl.searchStok(txtSearch.getText());
            if(stok == null) {
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan",
                    "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else {
                input1.setText(stok.getKodeStok());
                input2.setText(stok.getNamaStok());
                input3.setText(Integer.toString(stok.getKuantitas()));
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStok().setVisible(true);
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Gudang> dropdown;
    private javax.swing.JComboBox<Supplier> dropdown1;
    private javax.swing.JLabel gudang;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JLabel inputLabel1;
    private javax.swing.JLabel inputLabel2;
    private javax.swing.JLabel inputLabel3;
    private javax.swing.JLabel inputLabel4;
    private javax.swing.JLabel inputLabel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel supplier;
    private javax.swing.JButton tambahButton;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
