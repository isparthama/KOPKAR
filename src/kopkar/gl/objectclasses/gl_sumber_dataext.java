/*
 * To change this gl_sumber_data, choose Tools | gl_sumber_datas
 * and open the gl_sumber_data in the editor.
 */

package kopkar.gl.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.gl.objectclasses.gl_sumber_datacls;
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
public class gl_sumber_dataext extends gl_sumber_datacls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String nama_akun_dbt;
    private String nama_akun_krd;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_gl_sumber_data_insert( "
                    + "'"+this.getkode_data_entry()+"', "
                    + "'"+this.getnama_data_entry()+"', "
                    + "'"+this.getdayseqno()+"', "
                    + "'"+this.getcoa_debet()+"', "
                    + "'"+this.getcoa_kredit()+"', "
                    + "'"+this.getkode_gde()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_gl_sumber_data_update( "
                    + "'"+this.getkode_data_entry()+"', "
                    + "'"+this.getnama_data_entry()+"', "
                    + "'"+this.getdayseqno()+"', "
                    + "'"+this.getcoa_debet()+"', "
                    + "'"+this.getcoa_kredit()+"', "
                    + "'"+this.getkode_gde()+"', "



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
        squery="call sp_gl_sumber_data_delete( "
                    + "'"+this.getkode_data_entry()+"', "
                    + "'"+this.getnama_data_entry()+"', "
                    + "'"+this.getdayseqno()+"', "
                    + "'"+this.getcoa_debet()+"', "
                    + "'"+this.getcoa_kredit()+"', "
                    + "'"+this.getkode_gde()+"', "



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
        squery="select * from gl_sumber_data where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String kode_data_entry) throws CodeException {
        squery="CALL sp_gl_sumber_data_get('"+kode_data_entry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setkode_data_entry(rs.getString("kode_data_entry"));
        this.setnama_data_entry(rs.getString("nama_data_entry"));
        this.setdayseqno(rs.getInt("dayseqno"));
        this.setcoa_debet(rs.getString("coa_debet"));
        this.setcoa_kredit(rs.getString("coa_kredit"));
        this.setkode_gde(rs.getString("kode_gde"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setnama_akun_dbt(rs.getString("nama_akun_dbt"));
        this.setnama_akun_krd(rs.getString("nama_akun_krd"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_gl_sumber_data_get('"+this.getkode_data_entry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_gl_sumber_data_get('"+this.getkode_data_entry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_gl_sumber_data_get('"+this.getkode_data_entry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_gl_sumber_data_get('"+this.getkode_data_entry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_sumber_dataext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getkode_data_entry())){
            return true;
        }
        return false;
    }

    public String getnama_akun_dbt() {
        return this.nama_akun_dbt;
    }

    public String getnama_akun_krd() {
        return this.nama_akun_krd;
    }

    private void setnama_akun_dbt(String nama_akun_dbt) {
        this.nama_akun_dbt=nama_akun_dbt;
    }

    private void setnama_akun_krd(String nama_akun_krd) {
        this.nama_akun_krd=nama_akun_krd;
    }

}
