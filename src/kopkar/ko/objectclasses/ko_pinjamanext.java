/*
 * To change this ko_pinjaman, choose Tools | ko_pinjamans
 * and open the ko_pinjaman in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_pinjamancls;
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
public class ko_pinjamanext extends ko_pinjamancls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String nama_pinjaman_tipe;
    private String accset_desc="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_pinjaman_insert( "

                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getnama_pinjaman()+"', "
                    + "'"+this.getaktif_sts()+"', "
                    + "'"+this.getbunga()+"', "
                    + "'"+this.gettipe_bunga()+"', "
                    + "'"+this.getjumlah_cicilan()+"', "
                    + "'"+this.getcara_bayar()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getaccset_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_pinjaman_update( "

                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getnama_pinjaman()+"', "
                    + "'"+this.getaktif_sts()+"', "
                    + "'"+this.getbunga()+"', "
                    + "'"+this.gettipe_bunga()+"', "
                    + "'"+this.getjumlah_cicilan()+"', "
                    + "'"+this.getcara_bayar()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getaccset_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_pinjaman_delete( "

                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getnama_pinjaman()+"', "
                    + "'"+this.getaktif_sts()+"', "
                    + "'"+this.getbunga()+"', "
                    + "'"+this.gettipe_bunga()+"', "
                    + "'"+this.getjumlah_cicilan()+"', "
                    + "'"+this.getcara_bayar()+"', "
                    + "'"+this.getkode_pinjaman_tipe()+"', "
                    + "'"+this.getaccset_code()+"', "

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
        squery="select * from ko_pinjaman where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String kode_pinjaman) throws CodeException {
        squery="CALL sp_ko_pinjaman_get('"+kode_pinjaman+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setnama_pinjaman(rs.getString("nama_pinjaman"));
        this.setkode_pinjaman_tipe(rs.getString("kode_pinjaman_tipe"));
        this.setaktif_sts(rs.getString("aktif_sts"));
        this.setbunga(rs.getDouble("bunga"));
        this.settipe_bunga(rs.getString("tipe_bunga"));
        this.setjumlah_cicilan(rs.getInt("jumlah_cicilan"));
        this.setcara_bayar(rs.getString("cara_bayar"));

        this.setaccset_code(rs.getString("accset_code"));
        this.setaccset_desc(rs.getString("accset_desc"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.nama_pinjaman_tipe=rs.getString("nama_pinjaman_tipe");
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_pinjaman_get('"+this.getkode_pinjaman()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_pinjaman_get('"+this.getkode_pinjaman()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_pinjaman_get('"+this.getkode_pinjaman()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_pinjaman_get('"+this.getkode_pinjaman()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getkode_pinjaman())){
            return true;
        }
        return false;
    }

    public String getnama_pinjaman_tipe() {
        return this.nama_pinjaman_tipe;
    }

    public String getaccset_desc() { return accset_desc;}
    public void setaccset_desc(String accset_desc) { this.accset_desc = accset_desc;}


    

}
