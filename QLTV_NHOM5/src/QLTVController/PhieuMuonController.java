/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTVController;

import Connect.ConnectToSql;
import QLTVModel.PhieuMuonChiTiet;
import QLTVModel.PhieuMuonClass;
import QLTVModel.PhieuTraChiTiet;
import QLTVModel.SachClass;
import view.phieumuon.ThongTinPhieuThem;
import Util.LuuDuLieu;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import view.phieumuon.QuanLyPhieuMuonChuaThu;

/**
 *
 * @author WIN1064
 */
public class PhieuMuonController {
    
    Connection conn;
    PreparedStatement pst;
    CallableStatement stm;
    SachController sc = new SachController();
    
    public PhieuMuonController() {
        conn = ConnectToSql.connectDb();
    }
    
    public ArrayList<PhieuMuonClass> getPM(String tuNgay, String denNgay, String keywords) {
        ArrayList<PhieuMuonClass> dsPM = new ArrayList<PhieuMuonClass>();
        String sql;
        if (tuNgay == null && denNgay == null && keywords.trim().equals("")) {
            sql = "select * from PhieuMuon where DaTra = 0";
        } else if (keywords.trim().equals("") && tuNgay != null && denNgay != null) {
            sql = "select * from PhieuMuon where DaTra = 0 AND NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "'";
        } else if (tuNgay == null && denNgay == null && !keywords.trim().equals("")) {
            sql = "select * from PhieuMuon where DaTra = 0 AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
        } else {
            sql = "select * from PhieuMuon where DaTra = 0 AND NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "' AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
        }
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                PhieuMuonClass pm = new PhieuMuonClass(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getInt(4));
                dsPM.add(pm);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return dsPM;
    }
    
    public ArrayList<PhieuMuonClass> getPMDT(String tuNgay, String denNgay, String keywords, String kieuLoc) {
        ArrayList<PhieuMuonClass> dsPM = new ArrayList<PhieuMuonClass>();
        String sql;
        if (tuNgay == null && denNgay == null && keywords.trim().equals("") && kieuLoc.trim().equals("T???t c???")) {
            sql = "select * from PhieuMuon where DaTra = 1";
        } else if (keywords.trim().equals("") && tuNgay != null && denNgay != null) {
            if (kieuLoc.equals("Ng??y m?????n")) {
                sql = "select * from PhieuMuon where DaTra = 1 AND NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "'";
            } else if (kieuLoc.equals("Ng??y tr???")) {
                sql = "select * from PhieuMuon where DaTra = 1 AND NgayTra >= '" + tuNgay + "' AND NgayTra <= '" + denNgay + "'";
            } else {
                sql = "select * from PhieuMuon where DaTra = 1 AND ((NgayTra >= '" + tuNgay + "' AND NgayTra <= '" + denNgay + "') OR (NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "'))";
            }
        } else if (tuNgay == null && denNgay == null && !keywords.trim().equals("")) {
            sql = "select * from PhieuMuon where DaTra = 1 AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
        } else {
            if (kieuLoc.trim().equals("Ng??y m?????n")) {
                sql = "select * from PhieuMuon where DaTra = 1 AND NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "' AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
            } else if (kieuLoc.trim().equals("Ng??y tr???")) {
                sql = "select * from PhieuMuon where DaTra = 1 AND NgayTra >= '" + tuNgay + "' AND NgayTra <= '" + denNgay + "' AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
            } else {
                sql = "select * from PhieuMuon where DaTra = 1 AND ((NgayTra >= '" + tuNgay + "' AND NgayTra <= '" + denNgay + "') OR (NgayMuon >= '" + tuNgay + "' AND NgayMuon <= '" + denNgay + "'))" + " AND (MaPhieu like '%" + keywords + "%' OR MaSinhVien like '%" + keywords + "%')";
                
            }
            
        }
        
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                PhieuMuonClass pm = new PhieuMuonClass(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getInt(4));
                dsPM.add(pm);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return dsPM;
    }
    
    public String getMaSinhVien(String maPhieu) {
        String maSV = "";
        String sql = "Select MaSinhVien from PhieuMuon where MaPhieu = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, maPhieu);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                maSV = rs.getString(1);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return maSV;
    }
    
    public PhieuMuonChiTiet getMotPhieu(String maPhieu) {
        PhieuMuonChiTiet phieu = new PhieuMuonChiTiet();
        String sql = "SELECT PhieuMuon.MaPhieu,MaSach,TienCoc,NgayMuon,NgayTra,GhiChu FROM "
                + "CT_PhieuMuon inner join PhieuMuon on CT_PhieuMuon.MaPhieu = PhieuMuon.MaPhieu where PhieuMuon.MaPhieu = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, maPhieu);
            ResultSet rs = pst.executeQuery();
            ArrayList<SachClass> arr = new ArrayList<SachClass>();
            try {
                int tongTien = 0;
                while (rs.next()) {
                    phieu.setMaPhieu(rs.getString(1));
                    phieu.setMaSV(getMaSinhVien(maPhieu));
                    arr.add(sc.timKiemSachMuon(rs.getString(2)));
                    tongTien += rs.getInt(3);
                    phieu.setNgayMuon(rs.getString(4));
                    phieu.setNgayTra(rs.getString(5));
                    phieu.setGhiChu(rs.getString(6));
                }
                phieu.setArrSach(arr);
                phieu.setTienCoc(tongTien);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "L???y phi???u l???i :" + e.getMessage());
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return phieu;
    }
    
    public ArrayList<PhieuMuonChiTiet> getPMCTCT() {
        // get danh s??ch phi???u m?????n chi ti???t ch??a thu
        ArrayList<PhieuMuonChiTiet> dsPMCT = new ArrayList<PhieuMuonChiTiet>();
        ArrayList<PhieuMuonClass> dsPM = getPM(null, null, "");
        for (PhieuMuonClass p : dsPM) {
            PhieuMuonChiTiet pmct = getMotPhieu(p.getMaPhieu());
            dsPMCT.add(pmct);
        }
        return dsPMCT;
    }
    
    public ArrayList<PhieuMuonChiTiet> getPMCTDT() {
          // get danh s??ch phi???u m?????n chi ti???t ???? thu h???i
        ArrayList<PhieuMuonChiTiet> dsPMCT = new ArrayList<PhieuMuonChiTiet>();
        ArrayList<PhieuMuonClass> dsPM = getPMDT(null, null, "", "T???t c???");
        for (PhieuMuonClass p : dsPM) {
            PhieuMuonChiTiet pmct = getMotPhieu(p.getMaPhieu());
            dsPMCT.add(pmct);
        }
        return dsPMCT;
    }
    
    public int themPhieu(PhieuMuonClass pm, ArrayList<SachClass> arrSach) {
        conn = ConnectToSql.connectDb();
        int insert = 0;
        try {
            stm = conn.prepareCall("{call InSertInPM(?,?,?,?,?)}");
            stm.setString("maSinhVien", pm.getMaSV());
            stm.setString("ngayMuon", pm.getNgayMuon());
            stm.setInt("daTra", pm.getDaTra());
            stm.setString("ghiChu", pm.getGhiChu());
            stm.registerOutParameter("maPhieu", Types.VARCHAR);
            stm.executeUpdate();
            String m_count = stm.getString(5); // l???y out put producer
            // m?? phi???u m?????n v???a t???o
            for (int i = 0; i < arrSach.size(); i++) {
                // l???n l?????t t???o ra c??c phi???u m?????n chi ti???t t??? m?? phi???u m?????n ??? tr??n
                stm = conn.prepareCall("{call InsertCTPhieuMuon(?,?,?)}");
                stm.setString(1, m_count);
                stm.setString(2, arrSach.get(i).getMaSach());
                stm.setInt(3, arrSach.get(i).getGia());
                stm.execute();
                stm.close();
            }
            LuuDuLieu.currentPhieuMuonChiTiet = getMotPhieu(m_count);
            insert = 1;
            ThongTinPhieuThem ttpt = new ThongTinPhieuThem();
            ttpt.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        return insert;
    }
    
    public int updateDaTra(String maPhieu) {
        conn = ConnectToSql.connectDb();
        int update = 0;
        String sql = "update PhieuMuon set DaTra = 1, NgayTra = ? where MaPhieu = ?";
        try {
            pst = conn.prepareStatement(sql);
            Date now = new Date();
            // kh???i t???o ng??y tr???
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(now);
            pst.setString(1, date);
            pst.setString(2, maPhieu);
            update = pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return update;
    }
    public ArrayList<PhieuMuonChiTiet> locPhieu(String tuNgay, String denNgay, String keywords) {
        ArrayList<PhieuMuonChiTiet> dsPMCT = new ArrayList<PhieuMuonChiTiet>();
        ArrayList<PhieuMuonClass> dsPM = getPM(tuNgay, denNgay, keywords);
        for (PhieuMuonClass p : dsPM) {
            PhieuMuonChiTiet pmct = getMotPhieu(p.getMaPhieu());
            dsPMCT.add(pmct);
        }
        return dsPMCT;
    }
    
    public ArrayList<PhieuMuonChiTiet> locPhieuTra(String tuNgay, String denNgay, String maPhieu, String kieuLoc) {
        // H??m l???y v??? c??c phi???u thu h???i ( c?? ??i???u ki???n )
        ArrayList<PhieuMuonChiTiet> dsPMCT = new ArrayList<PhieuMuonChiTiet>();
        ArrayList<PhieuMuonClass> dsPM = getPMDT(tuNgay, denNgay, maPhieu, kieuLoc);
        for (PhieuMuonClass p : dsPM) {
            PhieuMuonChiTiet pmct = getMotPhieu(p.getMaPhieu());
            dsPMCT.add(pmct);
        }
        return dsPMCT;
    }
    public ArrayList<PhieuMuonClass> getPMSV(String maSV) {
        // L???y ra danh s??ch phi???u m?????n v???n ch??a thu h???i => sinh vi??n ???? v???n ??ang m?????n s??ch
        ArrayList<PhieuMuonClass> dsPM = new ArrayList<PhieuMuonClass>();
        String sql = "Select * from PhieuMuon where MaSinhVien = ? AND DaTra = 0";
        // phi???u v???n ch??a ???????c thu
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, maSV);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                PhieuMuonClass pm = new PhieuMuonClass(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(5), rs.getString(6), rs.getInt(4));
                dsPM.add(pm);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return dsPM;
    }
    
    public int kiemTraSinhVien(ArrayList<SachClass> arrSach, String maSV) {
        ArrayList<PhieuMuonClass> dsPM = getPMSV(maSV);
        for (int i = 0; i < dsPM.size(); i++) {
            PhieuMuonChiTiet pmct = getMotPhieu(dsPM.get(i).getMaPhieu());
            for (int j = 0; j < arrSach.size(); j++) {
                if (pmct.getArrSach().contains(arrSach.get(j))) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
