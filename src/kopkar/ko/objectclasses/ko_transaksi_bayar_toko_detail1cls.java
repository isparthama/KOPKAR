/*
 * To change this ko_transaksi_bayar_toko_detail1, choose Tools | Templates
 * and open the ko_transaksi_bayar_toko_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_bayar_toko_detail1cls implements Serializable {

    private Integer docentry;
    private Integer line_number;
    private String member_number;
    private String invoice_number;
    private Double invoice_amount;
    private Double payment_amount;
    private Double invoice_balance;
    private Double ctrbution_amount;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_bayar_toko_detail1cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getline_number() {
        return line_number;
    }
    public void setline_number(Integer line_number) {
        this.line_number = line_number;
    }

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
    }

    public String getinvoice_number() {
        return invoice_number;
    }
    public void setinvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public Double getinvoice_amount() {
        return invoice_amount;
    }
    public void setinvoice_amount(Double invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public Double getpayment_amount() {
        return payment_amount;
    }
    public void setpayment_amount(Double payment_amount) {
        this.payment_amount = payment_amount;
    }

    public Double getinvoice_balance() {
        return invoice_balance;
    }
    public void setinvoice_balance(Double invoice_balance) {
        this.invoice_balance = invoice_balance;
    }

    public Double getctrbution_amount() {
        return ctrbution_amount;
    }
    public void setctrbution_amount(Double ctrbution_amount) {
        this.ctrbution_amount = ctrbution_amount;
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

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }


}
