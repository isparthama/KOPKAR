/*
 * To change this ap_payment_detail1, choose Tools | Templates
 * and open the ap_payment_detail1 in the editor.
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
public class ap_payment_detail1extcol extends ArrayList<ap_payment_detail1ext> {
    ap_payment_detail1ext data;
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private ap_paymentext obj;

    

    public void insert(){
        data= new ap_payment_detail1ext(this.obj);
    }

    public ap_payment_detail1extcol(ap_paymentext obj) {
        this.obj=obj;
    }

    public ap_payment_detail1ext getData() {
        return data;
    }

    public void setData(ap_payment_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setbatchentry(rs.getInt("batchentry"));
        data.setdocentry(rs.getInt("docentry"));
        data.setdocdate(rs.getString("docdate"));
        data.setyop(rs.getInt("yop"));
        data.setmop(rs.getInt("mop"));
        data.setsupplier_code(rs.getString("supplier_code"));
        data.setpayment_type(rs.getString("payment_type"));
        data.setpayment_ammount(rs.getDouble("payment_ammount"));
        data.setpayment_total(rs.getDouble("payment_total"));
        data.setpayment_balance(rs.getDouble("payment_balance"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));
        data.setprocess_sts(rs.getString("process_sts"));
        data.setprocess_date(rs.getString("process_date"));
        data.setprocess_user(rs.getString("process_user"));
        data.setdayseqno(rs.getInt("dayseqno"));

        return true;
    }

    public void initdata(Integer docentry) throws SQLException{
        squery="call sp_ap_payment_detail1_get("
                + "'"+this.obj.getbatchentry()+"',"
                + "'"+docentry+"',";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ap_payment_detail1ext(this.obj);
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
        ap_payment_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ap_payment_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
