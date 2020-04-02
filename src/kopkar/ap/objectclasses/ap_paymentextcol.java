/*
 * To change this ap_payment, choose Tools | Templates
 * and open the ap_payment in the editor.
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
public class ap_paymentextcol extends ArrayList<ap_paymentext> {
    ap_paymentext data=new ap_paymentext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ap_paymentext();
    }
    public ap_paymentextcol(Integer id){
        this.id=id;
    }

    public ap_paymentext getData() {
        return data;
    }

    public void setData(ap_paymentext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setbatchentry(rs.getInt("batchentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.settotal_entry(rs.getDouble("total_entry"));
        data.settotal_payment(rs.getDouble("total_payment"));
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

    public void initdata() throws SQLException{
        squery="select * from ap_payment where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ap_paymentext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer document_number){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocument_number().equals(document_number)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ap_paymentext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ap_paymentextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
