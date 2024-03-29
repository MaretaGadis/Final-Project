/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Trans
     */
    Connection con;
    Statement stat;
    ResultSet rs;
    Object row = new Object[5];
    PreparedStatement pst;
    public Transaksi() {
        initComponents();
        DB DB = new DB();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        setDate();
        comboBox();
        generateID();
        txtBayar.setText("0");
        txtTotal.setText("0");
        txtKembali.setText("0");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisBayar = new javax.swing.ButtonGroup();
        memDis = new javax.swing.ButtonGroup();
        tablePop = new javax.swing.JPopupMenu();
        hapus = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jBarang = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        hapus.setText("hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        tablePop.add(hapus);

        edit.setText("edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        tablePop.add(edit);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORM TRANSAKSI PENYEWAAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, 14));

        jLabel2.setText("Kode transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, -1, -1));

        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, -1, -1));

        jLabel4.setText("Barang Di Sewa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));

        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 166, 60, -1));

        jLabel6.setText("Jumlah");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 206, -1, -1));

        txtIdTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdTransaksiActionPerformed(evt);
            }
        });
        txtIdTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdTransaksiKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, 170, -1));

        txtHarga.setText(" ");
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 163, 169, -1));

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });
        txtNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaBarangKeyPressed(evt);
            }
        });
        getContentPane().add(txtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 123, 470, -1));

        txtJumlah.setText(" ");
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 203, 169, -1));

        jLabel8.setText("TANGGAL              :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 46, -1, -1));

        txtTanggal.setEditable(false);
        txtTanggal.setText(" ");
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 43, 170, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KD_B", "NAMA_BARANG", "H_SEWA", "JUMLAH", "SUB TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 268, 585, 186));

        jBarang.setBackground(new java.awt.Color(102, 255, 102));
        jBarang.setMaximumRowCount(13);
        jBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barang", "" }));
        jBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBarangMouseClicked(evt);
            }
        });
        jBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBarangActionPerformed(evt);
            }
        });
        jBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBarangKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBarangKeyReleased(evt);
            }
        });
        getContentPane().add(jBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 83, 169, -1));

        jLabel7.setText("Total");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 46, -1));

        jLabel9.setText("Bayar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 46, -1));

        jLabel10.setText("Kembali");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 582, 46, -1));

        txtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txtKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 150, -1));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 150, -1));

        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBayarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBayarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 150, -1));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setLayout(null);

        btnSave.setBackground(new java.awt.Color(0, 204, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/add-button_icon-icons.com_58943.png"))); // NOI18N
        btnSave.setText("Tambah");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);
        btnSave.setBounds(20, 480, 110, 41);

        btnSimpan.setBackground(new java.awt.Color(0, 204, 204));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan);
        btnSimpan.setBounds(20, 550, 110, 40);

        btnHapus.setBackground(new java.awt.Color(0, 204, 204));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/closecircularbutton_79562.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel2.add(btnHapus);
        btnHapus.setBounds(160, 480, 110, 41);

        btnExit.setBackground(new java.awt.Color(0, 204, 204));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PNG/rightarrowsymbolincircularbutton_79594.png"))); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);
        btnExit.setBounds(160, 550, 110, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void comboBox(){
        jBarang.removeAllItems();
        String sql = "select * from tb_menu";
        try{
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String kode = rs.getString("id_menu");
                jBarang.addItem(kode);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void setDate(){
        LocalDateTime ld = LocalDateTime.now();
        
        DateTimeFormatter ldfor = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = ld.format(ldfor);
        txtTanggal.setText(formattedDate);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        DefaultTableModel model  = (DefaultTableModel)table.getModel();
        String kdb = (String)jBarang.getSelectedItem();
        String namaBarang = txtNamaBarang.getText();
        
        String tempharju = txtHarga.getText();
        int hargaJual = Integer.valueOf(tempharju.trim());
        
        String tempjumlah = txtJumlah.getText();
        int jumlah = Integer.valueOf(tempjumlah.trim());
        
        int sub = hargaJual * jumlah;
        
        model.addRow(new Object[]{kdb.trim(),namaBarang.trim(),hargaJual,jumlah,sub});
        
        setTotal();
        txtNamaBarang.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIdTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdTransaksiActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        if(evt.isPopupTrigger()){
            tablePop.show(table,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tableMouseReleased

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        int selectRow = table.getSelectedRow();
        model.removeRow(selectRow);
        setTotal();
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        int selectRow = table.getSelectedRow();

        String j = model.getValueAt(selectRow, 3).toString();
        String sub = model.getValueAt(selectRow, 4).toString();
        
        String newJ = JOptionPane.showInputDialog(null, "Masukkan jumlah baru",j);
        int newSub = Integer.parseInt(j)*Integer.parseInt(sub);
                
        model.setValueAt(newJ, selectRow, 3);
        model.setValueAt(newSub, selectRow, 4);
        setTotal();
    }//GEN-LAST:event_editActionPerformed

    private void hapusAll(){
        txtIdTransaksi.setText("");
        txtNamaBarang.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
        jenisBayar.clearSelection();
        
        
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusAll();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtIdTransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdTransaksiKeyTyped
        // only number
        
    }//GEN-LAST:event_txtIdTransaksiKeyTyped

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // only number
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtHargaKeyTyped

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // only number
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void jBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBarangKeyPressed
        // TODO add your handling code here:
        String kode = (String)jBarang.getSelectedItem();
        String sql = "select * from tb_menu where id_menu='"+kode+"'";
        try{
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String nama = rs.getString("menu");
                txtNamaBarang.setText(nama);
                txtHarga.setText(rs.getString("harga"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBarangKeyPressed

    private void txtNamaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBarangKeyPressed
        // TODO add your handling code here:
        String kode = (String)jBarang.getSelectedItem();
        String sql = "select * from tb_menu where id_menu='"+kode+"'";
        try{
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String nama = rs.getString("menu");
                txtNamaBarang.setText(nama);
                txtHarga.setText(rs.getString("harga"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtNamaBarangKeyPressed
    private void clear(){
        txtIdTransaksi.setText("");
    }
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        int rows = table.getRowCount();
        try{
            String faktur = "insert into tb_transaksi values('"+txtIdTransaksi.getText()+"','"+txtTanggal.getText()+"')";
            stat.executeUpdate(faktur);
            JOptionPane.showMessageDialog(this,"Data Transaksi berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            String DetailBarang = "Insert into tb_penjualan(id_transaksi,id_menu,jumlah,harga) values (?,?,?,?)";
            pst = con.prepareStatement(DetailBarang);
            for (int i = 0; i < rows; i++) {
                String no = txtIdTransaksi.getText();
                String barang = (String)table.getValueAt(i, 0);
                Integer harga = (Integer)table.getValueAt(i, 2);
                Integer qty = (Integer)table.getValueAt(i, 3);
               
                pst.setString(1, no);
                pst.setString(2, barang);
                pst.setInt(3, qty);
                pst.setInt(4, harga);
                pst.addBatch();
            }
            pst.executeBatch();
            JOptionPane.showMessageDialog(this,"Data penjualan berhasil disimpan","Success",JOptionPane.INFORMATION_MESSAGE);
            hapusAll();
            generateID();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jBarangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBarangKeyReleased
        // TODO add your handling code here:
        String kode = (String)jBarang.getSelectedItem();
        String sql = "select * from tb_menu where id_menu='"+kode+"'";
        try{
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String nama = rs.getString("menu");
                txtNamaBarang.setText(nama);
                txtHarga.setText(rs.getString("harga"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBarangKeyReleased

    private void jBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBarangMouseClicked
        // TODO add your handling code here:
        String kode = (String)jBarang.getSelectedItem();
        String sql = "select * from tb_menu where id_menu='"+kode+"'";
        try{
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                String nama = rs.getString("menu");
                txtNamaBarang.setText(nama);
                txtHarga.setText(rs.getString("harga"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jBarangMouseClicked

    private void txtBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyPressed
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());
        int bayar = Integer.parseInt(txtBayar.getText());
        int kembali = (total-bayar)*-1;
        txtKembali.setText(Integer.toString(kembali));
    }//GEN-LAST:event_txtBayarKeyPressed

    private void txtBayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyTyped
        // TODO add your handling code here:
        int total = Integer.parseInt(txtTotal.getText());
        int bayar = Integer.parseInt(txtBayar.getText());
        int kembali = (total-bayar)*-1;
        txtKembali.setText(Integer.toString(kembali));
    }//GEN-LAST:event_txtBayarKeyTyped

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembaliActionPerformed

    private void jBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBarangActionPerformed

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JMenuItem edit;
    private javax.swing.JMenuItem hapus;
    private javax.swing.JComboBox<String> jBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.ButtonGroup jenisBayar;
    private javax.swing.ButtonGroup memDis;
    private javax.swing.JTable table;
    private javax.swing.JPopupMenu tablePop;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdTransaksi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    int i;
    private void generateID() {
        try {
            String sql = "Select * FROM tb_transaksi ORDER BY id_penjualan DESC LIMIT 1";
            rs = stat.executeQuery(sql);
            rs.next();
            String kode = rs.getString("id_penjualan");
            String subKode = kode.substring(3, 5);
            i = Integer.parseInt(subKode);
            i++;
            int no = i;
            String tambahan="000";
            String Id = Integer.toString(no);
            int length = tambahan.length() - Id.length();
            String SubString = tambahan.substring(0, length);
            txtIdTransaksi.setText("TR"+SubString+Id);
        } catch (Exception e) {
            System.err.println(e);
            i++;
            int no;
            no = i;
            String id = Integer.toString(no);
            txtIdTransaksi.setText(id);
        }
    }
    
    private void setTotal(){
        int total = 0;
        for (int i = 0; i <table.getRowCount(); i++) {
            int Amount = Integer.parseInt(table.getValueAt(i, 4)+"");
            total = Amount+total;
        }
        txtTotal.setText(Integer.toString(total));
    }
}
