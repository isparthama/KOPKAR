/*
 * To change this ko_transaksi_mohon_detail1, choose Tools | ko_transaksi_mohon_detail1s
 * and open the ko_transaksi_mohon_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_mohon_detail1cls;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_mohon_detail1ext extends ko_transaksi_mohon_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String nama_pinjaman;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_transaksi_mohon_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getjumlah_pinjaman()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getjumlah_angsuran()+"', "
                    + "'"+this.getsisa_angsuran()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_transaksi_mohon_detail1_update( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getjumlah_pinjaman()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getjumlah_angsuran()+"', "
                    + "'"+this.getsisa_angsuran()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_mohon_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getjumlah_pinjaman()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getjumlah_angsuran()+"', "
                    + "'"+this.getsisa_angsuran()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from ko_transaksi_mohon_detail1 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setline_number(rs.getInt("line_number"));
        this.setkode_pinjaman_tipe(rs.getString("kode_pinjaman_tipe"));
        this.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        this.setsisa_pinjaman(rs.getDouble("sisa_pinjaman"));
        this.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        this.setsisa_angsuran(rs.getInt("sisa_angsuran"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getdocentry())){
            return true;
        }
        return false;
    }

    void setnama_pinjaman_tipe(String nama_pinjaman) {
        this.nama_pinjaman=nama_pinjaman;
    }

    public Object getnama_pinjaman() {
        return this.nama_pinjaman;
    }

}
