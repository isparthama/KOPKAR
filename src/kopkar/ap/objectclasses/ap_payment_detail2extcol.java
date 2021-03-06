/*
 * To change this ap_payment_detail2, choose Tools | Templates
 * and open the ap_payment_detail2 in the editor.
 */

package kopkar.ap.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class ap_payment_detail2extcol extends ArrayList<ap_payment_detail2ext> {
    ap_payment_detail2ext data=new ap_payment_detail2ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    String supplier_code;
    Integer batchentry;
    Integer docentry;

    public ap_payment_detail2extcol(String supplier_code, Integer batchentry, Integer docentry) {
        this.supplier_code=supplier_code;
        this.batchentry=batchentry;
        this.docentry=docentry;
    }

    public void insert(){
        data= new ap_payment_detail2ext();
    }
    public ap_payment_detail2extcol(Integer id){
        this.id=id;
    }

    public ap_payment_detail2ext getData() {
        return data;
    }

    public void setData(ap_payment_detail2ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setbatchentry(rs.getInt("batchentry"));
        data.setdocentry(rs.getInt("docentry"));
        data.setlinenum(rs.getInt("linenum"));
        data.setdocument_number(rs.getString("document_number"));
//        data.setdocument_status(rs.getString("document_status"));
//        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setdocument_duedate(rs.getString("document_duedate"));
//        data.setsupplier_code(rs.getString("supplier_code"));
        data.settotal_aft_tax(rs.getDouble("total_aft_tax"));
//        data.setpayment_type(rs.getString("payment_type"));
        data.setjumlah_bayar(rs.getDouble("jumlah_bayar"));
//        data.setjumlah_cash(rs.getDouble("jumlah_cash"));
//        data.setjumlah_transfer(rs.getDouble("jumlah_transfer"));
//        data.setjumlah_dncn(rs.getDouble("jumlah_dncn"));
//        data.setentrydate(rs.getString("entrydate"));
//        data.setauditdate(rs.getString("auditdate"));
//        data.setobjtype(rs.getInt("objtype"));
//        data.setaudituser(rs.getString("audituser"));
//        data.setprocess_sts(rs.getString("process_sts"));
//        data.setprocess_date(rs.getString("process_date"));
//        data.setprocess_user(rs.getString("process_user"));
//        data.setdayseqno(rs.getInt("dayseqno"));


        data.settotalBayar(rs.getDouble("totalBayar"));
        data.setsisaFaktur(rs.getDouble("sisaFaktur"));
        data.setnilaiAkhirFaktur(rs.getDouble("nilaiAkhirFaktur"));

        if (rs.getString("pilih").equalsIgnoreCase("1")){
        data.setpilih(true);
        }
        data.setstatus(data.Status_normal);
        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_ap_payment_detail2_get("
                + "'"+this.supplier_code+"',"
                + "'"+this.batchentry+"',"
                + "'"+this.docentry+"')";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ap_payment_detail2ext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer batchentry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getbatchentry().equals(batchentry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ap_payment_detail2ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ap_payment_detail2extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void initdata_open_invoice(String supplier_code) throws SQLException {
         squery="call sp_ap_payment_detail2_load("
                + "'"+supplier_code+"',"
                + "'"+this.batchentry+"',"
                + "'"+this.docentry+"'"
                + ")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ap_payment_detail2ext();
            if (fillme_open_invoice(rs)){
                this.add(data);
            }
        }
    }

    private boolean fillme_open_invoice(ResultSet rs) throws SQLException {
        data.setpilih(false);
        data.setbatchentry(rs.getInt("batchentry"));
        data.setdocentry(rs.getInt("docentry"));
        data.setlinenum(rs.getInt("linenum"));
        data.setdocument_number(rs.getString("noFaktur"));
        data.setdocument_date(rs.getString("tglFaktur"));
        data.setdocument_duedate(rs.getString("tglJtempo"));
        data.settotal_aft_tax(rs.getDouble("nilAsliFaktur"));
        data.settotalBayar(rs.getDouble("totalBayar"));
        data.setsisaFaktur(rs.getDouble("sisaFaktur"));
        data.setjumlah_bayar(rs.getDouble("jumlahBayar"));
        data.setnilaiAkhirFaktur(rs.getDouble("nilaiAkhirFaktur"));
        return true;
    }

}
