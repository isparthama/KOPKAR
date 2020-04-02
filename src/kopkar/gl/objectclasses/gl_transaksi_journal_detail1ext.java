/*
 * To change this gl_transaksi_journal_detail1, choose Tools | gl_transaksi_journal_detail1s
 * and open the gl_transaksi_journal_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.gl.objectclasses.gl_transaksi_journal_detail1cls;
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
public class gl_transaksi_journal_detail1ext extends gl_transaksi_journal_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;
    private String product_name;
    private String uom_code;
    private String nama_akun;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        try {
            if (status==gl_transaksi_journal_detail1ext.Status_Insert){
                squery="call sp_gl_transaksi_journal_detail1_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getkode_akun()+"', "
                        + "'"+this.getjumdebet()+"', "
                        + "'"+this.getjumkredit()+"', "
                        + "'"+this.getreferensi()+"', "
                        + "'"+this.getketerangan()+"', "
                        + "'"+this.getbasenoslip()+"', "
                        + "'"+this.getbaseentry()+"', "
                        + "'"+this.getbaseline()+"', "
                        + "'"+this.getproses()+"', "
                        + "'"+GlobalUtils.userid+"' "
                        + ")";

                    ResultSet rs = db.executeQuery(squery);
                    if (rs.next()){
                        this.setlinenum(rs.getInt("linenum"));
                    }
            } else if (this.status.equals(this.Status_update)) {
                squery="call sp_gl_transaksi_journal_detail1_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getkode_akun()+"', "
                        + "'"+this.getjumdebet()+"', "
                        + "'"+this.getjumkredit()+"', "
                        + "'"+this.getreferensi()+"', "
                        + "'"+this.getketerangan()+"', "
                        + "'"+this.getbasenoslip()+"', "
                        + "'"+this.getbaseentry()+"', "
                        + "'"+this.getbaseline()+"', "
                        + "'"+this.getproses()+"', "
                        + "'"+GlobalUtils.userid+"' "
                        + ")";
                db.execute(squery);
            } else if (this.status==this.Status_delete){
                squery="call sp_gl_transaksi_journal_detail1_delete( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getkode_akun()+"', "
                        + "'"+this.getjumdebet()+"', "
                        + "'"+this.getjumkredit()+"', "
                        + "'"+this.getreferensi()+"', "
                        + "'"+this.getketerangan()+"', "
                        + "'"+this.getbasenoslip()+"', "
                        + "'"+this.getbaseentry()+"', "
                        + "'"+this.getbaseline()+"', "
                        + "'"+this.getproses()+"', "
                        + "'"+GlobalUtils.userid+"' "
                        + ")";
                db.execute(squery);
            }
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_gl_transaksi_journal_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getkode_akun()+"', "
                        + "'"+this.getjumdebet()+"', "
                        + "'"+this.getjumkredit()+"', "
                        + "'"+this.getreferensi()+"', "
                        + "'"+this.getketerangan()+"', "
                        + "'"+this.getbasenoslip()+"', "
                        + "'"+this.getbaseentry()+"', "
                        + "'"+this.getbaseline()+"', "
                        + "'"+this.getproses()+"', "
                        + "'"+GlobalUtils.userid+"' "
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
        squery="select * from gl_transaksi_journal_detail1 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_gl_transaksi_journal_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setlinenum(rs.getInt("linenum"));
        this.setkode_akun(rs.getString("kode_akun"));
        this.setjumdebet(rs.getDouble("jumdebet"));
        this.setjumkredit(rs.getDouble("jumkredit"));
        this.setreferensi(rs.getString("referensi"));
        this.setketerangan(rs.getString("keterangan"));
        this.setproses(rs.getString("proses"));
        this.setbasenoslip(rs.getString("basenoslip"));
        this.setbaseentry(rs.getInt("baseentry"));
        this.setbaseline(rs.getInt("baseline"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));

        this.setnama_akun(rs.getString("nama_akun"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journal_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void setstatus(Integer status) {
        System.out.println(status);
        this.status=status;
    }

    public Integer getstatus() {
        return this.status;
    }

    void setproduct_name(String product_name) {
        this.product_name=product_name;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    void setuom_code(String uom_code) {
        this.uom_code=uom_code;
    }

    /**
     * @return the uom_code
     */
    public String getUom_code() {
        return uom_code;
    }

    public String getnama_akun() {
        return this.nama_akun;
    }

    public void setnama_akun(String nama_akun) {
        this.nama_akun=nama_akun;
    }

}
