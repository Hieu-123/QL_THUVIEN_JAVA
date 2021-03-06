/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.sach;

import QLTVController.SachController;
import QLTVController.TheLoaiController;
import QLTVModel.SachClass;
import QLTVModel.TheLoaiClass;
import Util.CustomTableSach;
import Util.IntegerValidate;
import Util.LuuDuLieu;
import Util.StyleHeaderTable;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.text.NumberFormat;
import javax.swing.ButtonGroup;

/**
 *
 * @author WIN1064
 */
public class QuanLySach extends javax.swing.JPanel {

    SachController sc = new SachController();
    TheLoaiController tlc = new TheLoaiController();
    int selectedRow;
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    Vector<TheLoaiClass> dsTL;
    public static QuanLySach qlsach;
    String tongSach, tongSachMuon, tongSachBan, tongSoLuongSach, tongSoLuongSachBan, tongSoLuongSachMuon;

    /**
     * Creates new form QuanLySach
     */
    public QuanLySach() {
        initComponents();

        qlsach = this;
        LuuDuLieu.dsSach = sc.getSach();
        dsTL = new Vector<TheLoaiClass>(tlc.getTL());
        jComboBoxTL.setModel(new DefaultComboBoxModel(dsTL));
        jTableSach.getTableHeader().setDefaultRenderer(new StyleHeaderTable());
        renderer.setHorizontalAlignment(JLabel.CENTER);
        CustomTableSach ct = new CustomTableSach();
        for (int i = 0; i < ct.getColumnCount(); i++) {
            jTableSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        jTableSach.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jTableSach.getColumnModel().getColumn(1).setPreferredWidth(120);
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextGia = new javax.swing.JTextField();
        jTextSoLuong = new javax.swing.JTextField();
        jTextNXB = new javax.swing.JTextField();
        jTextTaiBan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextTenSach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextMaSach = new javax.swing.JTextField();
        jComboBoxTL = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextMucDich = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonXoa = new javax.swing.JButton();
        jButtonThemSach = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jTextKeyWords = new javax.swing.JTextField();
        jButtonTaiLai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelTongSachBan = new javax.swing.JLabel();
        jLabelTongSLSM = new javax.swing.JLabel();
        jLabelTongSLSB = new javax.swing.JLabel();
        jLabelTongSach = new javax.swing.JLabel();
        jLabelTongSLS = new javax.swing.JLabel();
        jLabelTongSachMuon = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Th??? lo???i");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("T??n s??ch");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("S??? l?????ng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nh?? xu???t b???n");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Gi??");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("T??i b???n");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("M?? s??ch");

        jTextMaSach.setEditable(false);

        jComboBoxTL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("M???c ????ch");

        jTextMucDich.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextTaiBan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(47, 47, 47)
                            .addComponent(jTextMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jTextMucDich))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextGia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextMucDich, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextTaiBan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextGia)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTableSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTableSach.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableSach.setRowHeight(25);
        jTableSach.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTableSach.setShowVerticalLines(false);
        jTableSach.getTableHeader().setReorderingAllowed(false);
        jTableSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSach);

        jButtonXoa.setBackground(new java.awt.Color(0, 204, 204));
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletebook.png"))); // NOI18N
        jButtonXoa.setText("X??a");
        jButtonXoa.setBorder(null);
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonThemSach.setBackground(new java.awt.Color(0, 204, 204));
        jButtonThemSach.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addbook.png"))); // NOI18N
        jButtonThemSach.setText("Th??m s??ch");
        jButtonThemSach.setBorder(null);
        jButtonThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemSachActionPerformed(evt);
            }
        });

        jButtonSearch.setBackground(new java.awt.Color(0, 204, 204));
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonSearch.setText("T??m ki???m");
        jButtonSearch.setBorder(null);
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonSua.setBackground(new java.awt.Color(0, 204, 204));
        jButtonSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modifybook.png"))); // NOI18N
        jButtonSua.setText("S???a");
        jButtonSua.setBorder(null);
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jTextKeyWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextKeyWordsActionPerformed(evt);
            }
        });

        jButtonTaiLai.setBackground(new java.awt.Color(0, 204, 204));
        jButtonTaiLai.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-20.png"))); // NOI18N
        jButtonTaiLai.setText("T???i l???i");
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
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextKeyWords))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButtonThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Th??ng k??", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabelTongSachBan.setText("T???ng s??? ?????u s??ch ????? b??n :");

        jLabelTongSLSM.setText("T???ng s??? l?????ng s??ch m?????n :");

        jLabelTongSLSB.setText("T???ng s??? l?????ng s??ch b??n :");

        jLabelTongSach.setText("T???ng s??? ?????u s??ch :");

        jLabelTongSLS.setText("T???ng s??? l?????ng s??ch :");

        jLabelTongSachMuon.setText("T???ng s??? ?????u s??ch ????? m?????n :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTongSach, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addComponent(jLabelTongSachMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTongSachBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addGap(179, 179, 179)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTongSLS, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addComponent(jLabelTongSLSM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTongSLSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTongSach)
                    .addComponent(jLabelTongSLS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTongSachMuon)
                    .addComponent(jLabelTongSLSM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTongSachBan)
                    .addComponent(jLabelTongSLSB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadTable() {
        jTableSach.setModel(new CustomTableSach());
        jTableSach.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        renderer.setHorizontalAlignment(JLabel.CENTER);
        jTableSach.getColumnModel().getColumn(0).setCellRenderer(renderer);
        jTableSach.getColumnModel().getColumn(1).setPreferredWidth(120);
        CustomTableSach ct = new CustomTableSach();
        for (int i = 0; i < ct.getColumnCount(); i++) {
            jTableSach.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        thongKe();
    }

    public void xoaTrang() {
        jTextMaSach.setText("");
        jTextTenSach.setText("");
        jTextGia.setText("");
        jTextNXB.setText("");
        jTextSoLuong.setText("");
        jTextTaiBan.setText("");
        jComboBoxTL.setSelectedIndex(0);
    }

    public void thongKe() {
        tongSach = Integer.toString(LuuDuLieu.dsSach.size());
        tongSachMuon = Integer.toString((int) LuuDuLieu.dsSach.stream().filter(i -> i.getMucDich() == 1).count());
        tongSachBan = Integer.toString((int) LuuDuLieu.dsSach.stream().filter(i -> i.getMucDich() == 0).count());
        tongSoLuongSach = Integer.toString((int) LuuDuLieu.dsSach.stream().mapToInt(s -> s.getSoLuong()).sum());
        tongSoLuongSachMuon = Integer.toString((int) LuuDuLieu.dsSach.stream().filter(i -> i.getMucDich() == 1).mapToInt(s -> s.getSoLuong()).sum());
        tongSoLuongSachBan = Integer.toString((int) LuuDuLieu.dsSach.stream().filter(i -> i.getMucDich() == 0).mapToInt(s -> s.getSoLuong()).sum());

        jLabelTongSach.setText("T???ng s??ch : " + tongSach);
        jLabelTongSachMuon.setText("T???ng s??ch s??? ?????u s??ch ????? m?????n : " + tongSachMuon);
        jLabelTongSachBan.setText("T???ng s??ch s??? ?????u s??ch ????? b??n : " + tongSachBan);
        jLabelTongSLS.setText("T???ng s??? l?????ng s??ch :" + tongSoLuongSach);
        jLabelTongSLSM.setText("T???ng s??? l?????ng s??ch ????? m?????n :" + tongSoLuongSachMuon);
        jLabelTongSLSB.setText("T???ng s??? l?????ng s??ch ????? b??n :" + tongSoLuongSachBan);
    }
    private void jTableSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSachMouseClicked
        selectedRow = jTableSach.getSelectedRow();
        SachClass s = LuuDuLieu.dsSach.get(selectedRow);
        jTextMaSach.setText(s.getMaSach() + "");
        jTextTenSach.setText(s.getTenSach() + "");
        if (s.getMucDich() == 1) {
            jTextMucDich.setText("S??ch m?????n");
        } else {
            jTextMucDich.setText("S??ch b??n");
        }
        jTextNXB.setText(s.getNhaXuatBan() + "");
        TheLoaiClass t = new TheLoaiClass();
        try {
            t.setMaTheLoai(s.getMaTheLoai());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        jComboBoxTL.setSelectedItem(dsTL.get(dsTL.indexOf(t)));
        jTextTaiBan.setText(Integer.toString(s.getTaiBan()) + "");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);
        jTextGia.setText(vn.format(s.getGia()));
        jTextSoLuong.setText(Integer.toString(s.getSoLuong()) + "");
    }//GEN-LAST:event_jTableSachMouseClicked

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        selectedRow = jTableSach.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Ph???i ch???n d??ng mu???n x??a");
        } else {
            int op = JOptionPane.showConfirmDialog(null, "B???n ch???c ch???n mu???n x??a s??ch n??y?", "X??c nh???n",
                    JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (op == 0) {
                SachClass s = LuuDuLieu.dsSach.get(selectedRow);
                if (sc.xoaSach(s) == 1) {
                    LuuDuLieu.dsSach = sc.getSach();
                    JOptionPane.showMessageDialog(null, "X??a th??nh c??ng");
                    loadTable();
                    selectedRow = -1;
                    xoaTrang();
                    thongKe();
                }

            }
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemSachActionPerformed
        setVisible(false);
        ThemSach ts = new ThemSach();
        ts.setVisible(true);
    }//GEN-LAST:event_jButtonThemSachActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        LuuDuLieu.dsSach = sc.timKiem(jTextKeyWords.getText());
        loadTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed

        selectedRow = jTableSach.getSelectedRow();
        TheLoaiClass tlcl = (TheLoaiClass) jComboBoxTL.getSelectedItem();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Ph???i ch???n s??ch c???n s???a");
        } else {
            int op = JOptionPane.showConfirmDialog(null,
                    "B???n x??c nh???n s???a s??ch n??y?", "X??c nh???n", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                SachClass s = new SachClass();
                try {
                    s.setMaSach(jTextMaSach.getText());
                    s.setTenSach(jTextTenSach.getText());

                    if (!IntegerValidate.isInteger(jTextTaiBan.getText())) {
                        throw new Exception("t??i b???n sai ?????nh d???ng");
                    } else {
                        s.setTaiBan(Integer.parseInt(jTextTaiBan.getText()));
                    }
                    s.setNhaXuatBan(jTextNXB.getText());
                    s.setMaTheLoai(tlcl.getMaTheLoai());
                    String gia = jTextGia.getText().replaceAll("\\.", "");
                    if (!IntegerValidate.isInteger(gia)) {
                        throw new Exception("gi?? sai ?????nh d???ng");
                    } else {
                        s.setGia(Integer.parseInt(gia));
                    }
                    if (!IntegerValidate.isInteger(jTextSoLuong.getText())) {
                        throw new Exception("t??i b???n sai ?????nh d???ng");
                    } else {
                        s.setSoLuong(Integer.parseInt(jTextSoLuong.getText()));
                    }
                    if (sc.suaSach(s) == 1) {
                        LuuDuLieu.dsSach = sc.getSach();
                        loadTable();
                        JOptionPane.showMessageDialog(null, "S???a th??nh c??ng");
                        selectedRow = -1;
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Th??ng tin " + ex.getMessage());
                }
            }
        }


    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jTextKeyWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextKeyWordsActionPerformed

    }//GEN-LAST:event_jTextKeyWordsActionPerformed

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTaiLaiActionPerformed
        LuuDuLieu.dsSach = sc.getSach();
        loadTable();
    }//GEN-LAST:event_jButtonTaiLaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonThemSach;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JComboBox<String> jComboBoxTL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTongSLS;
    private javax.swing.JLabel jLabelTongSLSB;
    private javax.swing.JLabel jLabelTongSLSM;
    private javax.swing.JLabel jLabelTongSach;
    private javax.swing.JLabel jLabelTongSachBan;
    private javax.swing.JLabel jLabelTongSachMuon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSach;
    private javax.swing.JTextField jTextGia;
    private javax.swing.JTextField jTextKeyWords;
    private javax.swing.JTextField jTextMaSach;
    private javax.swing.JTextField jTextMucDich;
    private javax.swing.JTextField jTextNXB;
    private javax.swing.JTextField jTextSoLuong;
    private javax.swing.JTextField jTextTaiBan;
    private javax.swing.JTextField jTextTenSach;
    // End of variables declaration//GEN-END:variables
}
