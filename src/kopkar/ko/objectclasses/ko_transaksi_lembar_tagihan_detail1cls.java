/*
 * To change this ko_transaksi_lembar_tagihan_detail1, choose Tools | Templates
 * and open the ko_transaksi_lembar_tagihan_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_lembar_tagihan_detail1cls implements Serializable {

    private Integer docentry=0;
    private Integer linenum=0;
    private Integer yop=0;
    private Integer mop=0;
    private String member_number;
    private Double total_tagihan=new Double(0);
    private Double total_bayar=new Double(0);
    private Double sisa_tagihan=new Double(0);
    private Double total_simpanan_info=new Double(0);
    private Double total_pinjaman_info=new Double(0);
    private Double toko_info=new Double(0);
    private Double sisa_tagihan_bln_seb_info=new Double(0);
    private Double total_tagihan_info=new Double(0);
    private Double total_bayar_info=new Double(0);
    private Double sisa_tagihan_info=new Double(0);
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String apply_invoice_sts;

    public ko_transaksi_lembar_tagihan_detail1cls() {
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
        this.total_bayar = total_bayar;
    }

    public Double getsisa_tagihan() {
        return sisa_tagihan;
    }
    public void setsisa_tagihan(Double sisa_tagihan) {
        this.sisa_tagihan = sisa_tagihan;
    }

    public Double gettotal_simpanan_info() {
        return total_simpanan_info;
    }
    public void settotal_simpanan_info(Double total_simpanan_info) {
        this.total_simpanan_info = total_simpanan_info;
    }

    public Double gettotal_pinjaman_info() {
        return total_pinjaman_info;
    }
    public void settotal_pinjaman_info(Double total_pinjaman_info) {
        this.total_pinjaman_info = total_pinjaman_info;
    }

    public Double gettoko_info() {
        return toko_info;
    }
    public void settoko_info(Double toko_info) {
        this.toko_info = toko_info;
    }

    public Double getsisa_tagihan_bln_seb_info() {
        return sisa_tagihan_bln_seb_info;
    }
    public void setsisa_tagihan_bln_seb_info(Double sisa_tagihan_bln_seb_info) {
        this.sisa_tagihan_bln_seb_info = sisa_tagihan_bln_seb_info;
    }

    public Double gettotal_tagihan_info() {
        return total_tagihan_info;
    }
    public void settotal_tagihan_info(Double total_tagihan_info) {
        this.total_tagihan_info = total_tagihan_info;
    }

    public Double gettotal_bayar_info() {
        return total_bayar_info;
    }
    public void settotal_bayar_info(Double total_bayar_info) {
        this.total_bayar_info = total_bayar_info;
    }

    public Double getsisa_tagihan_info() {
        return sisa_tagihan_info;
    }
    public void setsisa_tagihan_info(Double sisa_tagihan_info) {
        this.sisa_tagihan_info = sisa_tagihan_info;
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

    public String getapply_invoice_sts() {
        return apply_invoice_sts;
    }
    public void setapply_invoice_sts(String apply_invoice_sts) {
        this.apply_invoice_sts = apply_invoice_sts;
    }


}
