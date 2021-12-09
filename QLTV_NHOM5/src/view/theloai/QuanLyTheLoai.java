/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.theloai;

import QLTVController.TheLoaiController;
import QLTVModel.TheLoaiClass;
import Util.CustomeTableTheLoai;
import Util.LuuDuLieu;
import Util.StyleHeaderTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author WIN1064
 */
public class QuanLyTheLoai extends javax.swing.JPanel {

    int selectedRow = -1;
    TheLoaiController tlc = new TheLoaiController();
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    public static QuanLyTheLoai qltl;

    /**
     * Creates new form QuanLyTheLoai
     */
    public QuanLyTheLoai() {
        initComponents();
        LuuDuLieu.dsTL = tlc.getTL();
        loadTable();
        qltl = this;
        jTableTheLoai.getTableHeader().setDefaultRenderer(new StyleHeaderTable());
        CustomeTableTheLoai ct = new CustomeTableTheLoai();
        jTableTheLoai.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < ct.getColumnCount(); i++) {
            jTableTheLoai.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
    }

    public void loadTable() {
        jTableTheLoai.setModel(new CustomeTableTheLoai());
        CustomeTableTheLoai ct = new CustomeTableTheLoai();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < ct.getColumnCount(); i++) {
            jTableTheLoai.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        jTableTheLoai.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonXoa = new javax.swing.JButton();
        jButtonThemTheLoai = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jTextKeyWords = new javax.swing.JTextField();
        jButtonTaiLai = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextTenTheLoai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextMaTheLoai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTheLoai = new javax.swing.JTable();

        jButtonXoa.setBackground(new java.awt.Color(0, 204, 204));
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-category-20.png"))); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.setBorder(null);
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonThemTheLoai.setBackground(new java.awt.Color(0, 204, 204));
        jButtonThemTheLoai.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemTheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-category-20.jpg"))); // NOI18N
        jButtonThemTheLoai.setText("Thêm thể loại");
        jButtonThemTheLoai.setBorder(null);
        jButtonThemTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemTheLoaiActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(0, 204, 204));
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonSearch.setText("Tìm kiếm");
        jButtonSearch.setBorder(null);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonSua.setBackground(new java.awt.Color(0, 204, 204));
        jButtonSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modify-category-20.png"))); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.setBorder(null);
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonTaiLai.setBackground(new java.awt.Color(0, 204, 204));
        jButtonTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-20.png"))); // NOI18N
        jButtonTaiLai.setText("Tải lại");
        jButtonTaiLai.setBorder(null);
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextKeyWords, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên thể loại");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã thể loại");

        jTextMaTheLoai.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(jTextMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTableTheLoai.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTheLoai.setFocusable(false);
        jTableTheLoai.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableTheLoai.setRowHeight(25);
        jTableTheLoai.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTableTheLoai.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableTheLoai.setShowVerticalLines(false);
        jTableTheLoai.getTableHeader().setReorderingAllowed(false);
        jTableTheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTheLoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTheLoai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        selectedRow = jTableTheLoai.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Phải chọn dòng muốn xóa");
        } else {
            int op = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa thể loại này?", "Xác nhận",
                    JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (op == 0) {
                TheLoaiClass tl = LuuDuLieu.dsTL.get(selectedRow);
                if (tlc.xoaTheLoai(tl) == 1) {
                    LuuDuLieu.dsTL = tlc.getTL();
                    loadTable();
                    selectedRow = -1;
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }

            }

        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonThemTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemTheLoaiActionPerformed
        ThemTheLoai ttl = new ThemTheLoai();
        ttl.setVisible(true);
    }//GEN-LAST:event_jButtonThemTheLoaiActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        LuuDuLieu.dsTL = tlc.timKiem(jTextKeyWords.getText());
        loadTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        selectedRow = jTableTheLoai.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Phải chọn sách cần sửa");
        } else {
            int op = JOptionPane.showConfirmDialog(null,
                    "Bạn xác nhận sửa thể loại này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                try {
                    TheLoaiClass tl = new TheLoaiClass();
                    tl.setMaTheLoai(jTextMaTheLoai.getText());
                    tl.setTenTheLoai(jTextTenTheLoai.getText());
                    if (tlc.suaTheLoai(tl) == 1) {
                        LuuDuLieu.dsTL = tlc.getTL();
                        loadTable();
                         JOptionPane.showMessageDialog(null, "Sửa thành công");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Thông tin " + ex.getMessage());
                }
            }

        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jTableTheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTheLoaiMouseClicked
        selectedRow = jTableTheLoai.getSelectedRow();
        TheLoaiClass tl = LuuDuLieu.dsTL.get(selectedRow);
        jTextMaTheLoai.setText(tl.getMaTheLoai() + "");
        jTextTenTheLoai.setText(tl.getTenTheLoai() + "");
    }//GEN-LAST:event_jTableTheLoaiMouseClicked

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        LuuDuLieu.dsTL = tlc.getTL();
        loadTable();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThemTheLoai;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTheLoai;
    private javax.swing.JTextField jTextKeyWords;
    private javax.swing.JTextField jTextMaTheLoai;
    private javax.swing.JTextField jTextTenTheLoai;
    // End of variables declaration//GEN-END:variables
}
