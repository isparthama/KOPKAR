/*
 * To change this ko_transaksi_tarik_simpanan, choose Tools | ko_transaksi_tarik_simpanans
 * and open the ko_transaksi_tarik_simpanan in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_tarik_simpanancls;
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
public class ko_transaksi_tarik_simpananext extends ko_transaksi_tarik_simpanancls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public ko_transaksi_tarik_simpananext() {
        this.setdocument_date(GlobalUtils.sessiondate);
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_tarik_simpanan_insert( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getsimpanan_wajib_awal()+"', "
                        + "'"+this.getsimpanan_pokok_awal()+"', "
                        + "'"+this.getsimpanan_sukarela_awal()+"', "
                        + "'"+this.getsimpanan_khusus_awal()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
                        + "'"+this.getsimpanan_wajib_akhir()+"', "
                        + "'"+this.getsimpanan_pokok_akhir()+"', "
                        + "'"+this.getsimpanan_sukarela_akhir()+"', "
                        + "'"+this.getsimpanan_khusus_akhir()+"', "
                        + "'"+this.getmanual_sts()+"', "
                        + "'"+this.getregistrasi_sts()+"', "
                        + "'"+this.gettunai_sts()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                ResultSet rs = db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                }
            } else {
                squery="call sp_ko_transaksi_tarik_simpanan_update( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getsimpanan_wajib_awal()+"', "
                        + "'"+this.getsimpanan_pokok_awal()+"', "
                        + "'"+this.getsimpanan_sukarela_awal()+"', "
                        + "'"+this.getsimpanan_khusus_awal()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
                        + "'"+this.getsimpanan_wajib_akhir()+"', "
                        + "'"+this.getsimpanan_pokok_akhir()+"', "
                        + "'"+this.getsimpanan_sukarela_akhir()+"', "
                        + "'"+this.getsimpanan_khusus_akhir()+"', "
                        + "'"+this.getmanual_sts()+"', "
                        + "'"+this.getregistrasi_sts()+"', "
                        + "'"+this.gettunai_sts()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            }

            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_tarik_simpanan_delete( "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getsimpanan_wajib_awal()+"', "
                    + "'"+this.getsimpanan_pokok_awal()+"', "
                    + "'"+this.getsimpanan_sukarela_awal()+"', "
                    + "'"+this.getsimpanan_khusus_awal()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getsimpanan_wajib_akhir()+"', "
                    + "'"+this.getsimpanan_pokok_akhir()+"', "
                    + "'"+this.getsimpanan_sukarela_akhir()+"', "
                    + "'"+this.getsimpanan_khusus_akhir()+"', "
                    + "'"+this.getmanual_sts()+"', "
                    + "'"+this.getregistrasi_sts()+"', "
                    + "'"+this.gettunai_sts()+"', "
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
        squery="select * from ko_transaksi_tarik_simpanan where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_tarik_simpanan_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setmember_number(rs.getString("member_number"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setsimpanan_wajib_awal(rs.getDouble("simpanan_wajib_awal"));
        this.setsimpanan_pokok_awal(rs.getDouble("simpanan_pokok_awal"));
        this.setsimpanan_sukarela_awal(rs.getDouble("simpanan_sukarela_awal"));
        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        this.setsimpanan_wajib_akhir(rs.getDouble("simpanan_wajib_akhir"));
        this.setsimpanan_pokok_akhir(rs.getDouble("simpanan_pokok_akhir"));
        this.setsimpanan_sukarela_akhir(rs.getDouble("simpanan_sukarela_akhir"));
        this.setsimpanan_khusus_akhir(rs.getDouble("simpanan_khusus_akhir"));
        this.setsimpanan_khusus_awal(rs.getDouble("simpanan_khusus_awal"));
        this.setmanual_sts(rs.getString("manual_sts"));
        this.setregistrasi_sts(rs.getString("registrasi_sts"));
        this.settunai_sts(rs.getString("tunai_sts"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_tarik_simpanan_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_tarik_simpanan_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_tarik_simpanan_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_tarik_simpanan_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tarik_simpananext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getdocument_number())){
            return true;
        }
        return false;
    }

    @Override
    public void setsimpanan_khusus(Double simpanan_khusus) {
        super.setsimpanan_khusus(simpanan_khusus);

        this.setsimpanan_khusus_akhir(this.getsimpanan_khusus_awal()-this.getsimpanan_khusus());
    }

    @Override
    public void setsimpanan_pokok(Double simpanan_pokok) {
        super.setsimpanan_pokok(simpanan_pokok);

        this.setsimpanan_pokok_akhir(this.getsimpanan_pokok_awal()-this.getsimpanan_pokok());
    }

    @Override
    public void setsimpanan_sukarela(Double simpanan_sukarela) {
        super.setsimpanan_sukarela(simpanan_sukarela);

        this.setsimpanan_sukarela_akhir(this.getsimpanan_sukarela_awal()-this.getsimpanan_sukarela());
    }

    @Override
    public void setsimpanan_wajib(Double simpanan_wajib) {
        super.setsimpanan_wajib(simpanan_wajib);

        this.setsimpanan_wajib_akhir(this.getsimpanan_wajib_awal()-this.getsimpanan_wajib());
    }

    public String getdocument_status_desc() {
        return GlobalUtils.getdocument_status_desc(this.getdocument_status());
    }






}
