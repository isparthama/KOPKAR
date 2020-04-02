/*
 * To change this ap_payment_detail1, choose Tools | Templates
 * and open the ap_payment_detail1 in the editor.
 */

package kopkar.ap.objectclasses;

import java.io.Serializable;
import java.util.Date;
import utils.GlobalUtils;

/**
 *
 * @author mtgmis30
 */
public class ap_payment_detail1cls implements Serializable {

    private Integer batchentry=0;
    private Integer docentry=0;
    private String docdate=GlobalUtils.getAuditDate();
    private Integer yop;
    private Integer mop;
    private String supplier_code;
    private String payment_type="1";
    private Double payment_ammount=new Double(0);
    private Double payment_total=new Double(0);
    private Double payment_balance=new Double(0);
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;
    private String process_sts;
    private String process_date;
    private String process_user;
    private Integer dayseqno;

    public ap_payment_detail1cls() {
    }
    
    public Integer getbatchentry() {
        return batchentry;
    }
    public void setbatchentry(Integer batchentry) {
        this.batchentry = batchentry;
    }

    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public String getdocdate() {
        return docdate;
    }
    public void setdocdate(String docdate) {
        this.docdate = docdate;
    }

    public Integer getyop() {
        return yop;
    }
    public void setyop(Integer yop) {
        this.yop = yop;
    }

    public Integer getmop() {
        return mop;
    }
    public void setmop(Integer mop) {
        this.mop = mop;
    }

    public String getsupplier_code() {
        return supplier_code;
    }
    public void setsupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getpayment_type() {
        return payment_type;
    }
    public void setpayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Double getpayment_ammount() {
        return payment_ammount;
    }
    public void setpayment_ammount(Double payment_ammount) {
        this.payment_ammount = payment_ammount;
    }

    public Double getpayment_total() {
        return payment_total;
    }
    public void setpayment_total(Double payment_total) {
        this.payment_total = payment_total;
    }

    public Double getpayment_balance() {
        return payment_balance;
    }
    public void setpayment_balance(Double payment_balance) {
        this.payment_balance = payment_balance;
    }

    public String getentrydate() {
        return entrydate;
    }
    public void setentrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getauditdate() {
        return auditdate;
    }
    public void setauditdate(String auditdate) {
        this.auditdate = auditdate;
    }

    public Integer getobjtype() {
        return objtype;
    }
    public void setobjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }

    public String getprocess_sts() {
        return process_sts;
    }
    public void setprocess_sts(String process_sts) {
        this.process_sts = process_sts;
    }

    public String getprocess_date() {
        return process_date;
    }
    public void setprocess_date(String process_date) {
        this.process_date = process_date;
    }

    public String getprocess_user() {
        return process_user;
    }
    public void setprocess_user(String process_user) {
        this.process_user = process_user;
    }

    public Integer getdayseqno() {
        return dayseqno;
    }
    public void setdayseqno(Integer dayseqno) {
        this.dayseqno = dayseqno;
    }


}
