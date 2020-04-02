/*
 * To change this ko_transaksi_tagihan_detail1, choose Tools | Templates
 * and open the ko_transaksi_tagihan_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_tagihan_detail1cls implements Serializable {

    private Integer docentry=0;
    private Integer linenum=0;
    private Integer yop=0;
    private Integer mop=0;
    private String member_number;
    private Double total_tagihan=new Double(0);
    private Double total_bayar=new Double(0);
    private Double sisa_tagihan=new Double(0);
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_tagihan_detail1cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getlinenum() {
        return linenum;
    }
    public void setlinenum(Integer linenum) {
        this.linenum = linenum;
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

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
    }

    public Double gettotal_tagihan() {
        return total_tagihan;
    }
    public void settotal_tagihan(Double total_tagihan) {
        this.total_tagihan = total_tagihan;
    }

    public Double gettotal_bayar() {
        return total_bayar;
    }
    public void settotal_bayar(Double total_bayar) {
        if (total_bayar>this.total_tagihan){
            total_bayar=this.total_tagihan;
        }
        this.total_bayar = total_bayar;
    }

    public Double getsisa_tagihan() {
        return sisa_tagihan;
    }
    public void setsisa_tagihan(Double sisa_tagihan) {
        this.sisa_tagihan = sisa_tagihan;
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
