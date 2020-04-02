/*
 * To change this ko_transaksi_mohon, choose Tools | ko_transaksi_mohons
 * and open the ko_transaksi_mohon in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_mohoncls;
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
public class ko_transaksi_mohonext extends ko_transaksi_mohoncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String nama_pinjaman;
    private ko_transaksi_mohon_detail1extcol detail=new ko_transaksi_mohon_detail1extcol(null);

    public ko_transaksi_mohonext() {
        this.setsatuan_waktu("3");
        this.sethitung_bunga("1");
        this.setmop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "MM")));
        this.setyop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "yyyy")));
        this.setmop_start(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "MM")));
        this.setyop_start(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "yyyy")));
        this.setauto_sts("Y");
        this.setdocument_date(GlobalUtils.sessiondate);
        this.settgl_cair(GlobalUtils.sessiondate);
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(),"yyyy-MM-dd"));
        this.settgl_cair(GlobalUtils.formatDate(this.gettgl_cair(),"yyyy-MM-dd"));
        ko_transaksi_mohon_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_mohon_insert( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.gettgl_cair()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getmasa_kerja()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getsuku_bunga()+"', "
                        + "'"+this.gethitung_bunga()+"', "
                        + "'"+this.getjangka_waktu()+"', "
                        + "'"+this.getsatuan_waktu()+"', "
                        + "'"+this.getjumlah_angsuran()+"', "
                        + "'"+this.getyop_start()+"', "
                        + "'"+this.getmop_start()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                ResultSet rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocentry(rs.getInt("docentry"));
                    this.setdocument_number(rs.getString("document_number"));

                    for (int i=0;i<detail.size();i++){
                        o=detail.get(i);
                        o.insert();
                        o.setdocentry(this.getdocentry());
                        o.setline_number(i);
                        o.update();
                    }
                }
            } else {
                squery="call sp_ko_transaksi_mohon_update( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.gettgl_cair()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getmasa_kerja()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getsuku_bunga()+"', "
                        + "'"+this.gethitung_bunga()+"', "
                        + "'"+this.getjangka_waktu()+"', "
                        + "'"+this.getsatuan_waktu()+"', "
                        + "'"+this.getjumlah_angsuran()+"', "
                        + "'"+this.getyop_start()+"', "
                        + "'"+this.getmop_start()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
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
        squery="call sp_ko_transaksi_mohon_delete( "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.gettgl_cair()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getmasa_kerja()+"', "
                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getjumlah_pinjaman()+"', "
                    + "'"+this.getsuku_bunga()+"', "
                    + "'"+this.gethitung_bunga()+"', "
                    + "'"+this.getjangka_waktu()+"', "
                    + "'"+this.getsatuan_waktu()+"', "
                    + "'"+this.getjumlah_angsuran()+"', "
                    + "'"+this.getyop_start()+"', "
                    + "'"+this.getmop_start()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+this.getauto_sts()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
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
        squery="select * from ko_transaksi_mohon where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.settgl_cair(rs.getString("tgl_cair"));
        this.setdop_tagih(rs.getInt("dop_tagih"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setmember_number(rs.getString("member_number"));
        this.setmasa_kerja(rs.getString("masa_kerja"));
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        this.setsuku_bunga(rs.getDouble("suku_bunga"));
        this.sethitung_bunga(rs.getString("hitung_bunga"));
        this.setjangka_waktu(rs.getInt("jangka_waktu"));
        this.setsatuan_waktu(rs.getString("satuan_waktu"));
        this.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        this.setyop_start(rs.getInt("yop_start"));
        this.setmop_start(rs.getInt("mop_start"));
        this.setauto_sts(rs.getString("auto_sts"));
        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setnama_pinjaman(rs.getString("nama_pinjaman"));

        setDetail(new ko_transaksi_mohon_detail1extcol(this.getdocentry()));
        getDetail().initdata(this.getmember_number(),2);
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_mohon_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
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

    private void setnama_pinjaman(String nama_pinjaman) {
        this.nama_pinjaman=nama_pinjaman;
    }

    public String getnama_pinjaman() {
        return this.nama_pinjaman;
    }

    public String getdocument_status_description() {
        if (this.getdocument_status().equalsIgnoreCase("C")){
            return "Close";
        }
        return "Open";
    }

    /**
     * @return the detail
     */
    public ko_transaksi_mohon_detail1extcol getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(ko_transaksi_mohon_detail1extcol detail) {
        this.detail = detail;
    }

    public Object getcaljumlahbunga() {
        return this.getjumlah_pinjaman()*(this.getsuku_bunga()/100);
    }

    public Object getcaljtxtjumlah_pokok_bunga() {
        return this.getjumlah_pinjaman()+(this.getjumlah_pinjaman()*(this.getsuku_bunga()/100));
    }

    public boolean run_sp_ko_pinjaman_calculate() {
        try {
            squery="call sp_ko_pinjaman_calculate ("+
                    "'"+this.getdocument_number()+"',"+
                    "'"+this.getjumlah_pinjaman()+"',"+
                    "'"+this.getsuku_bunga()+"',"+
                    "'"+this.getjangka_waktu()+"',"+
                    "'"+this.gethitung_bunga()+"',"+
                    "'"+GlobalUtils.audituser+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean getsisa_pinjaman(String member_number, int get) throws SQLException {
        this.detail=new ko_transaksi_mohon_detail1extcol(0);
        return detail.initdata(member_number, get);
    }

    public boolean runsp_ko_transaksi_setuju_get_rincian_pinjaman(Double jumlahpinjaman, Double sukubunga, Double jangkawaktu, Integer modelhitung) {
        squery="call sp_ko_transaksi_setuju_get_rincian_pinjaman ("+
                jumlahpinjaman+","+
                sukubunga+","+
                jangkawaktu+","+
                modelhitung+")";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                this.setjumlah_angsuran(rs.getDouble("jumlahangsuran"));
                this.setjumlah_pinjaman(rs.getDouble("pinjaman"));

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
