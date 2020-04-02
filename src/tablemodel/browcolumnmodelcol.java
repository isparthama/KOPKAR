/*
 * browcolumnmodelcol.java
 *
 * Created on October 23, 2007, 2:02 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tablemodel;

import java.util.ArrayList;

/**
 *
 * @author ISParthama
 */
public class browcolumnmodelcol extends ArrayList<browcolumnmodel>{
    private browcolumnmodel colModel=new browcolumnmodel();
    private String Tbl;
    /** Creates a new instance of browcolumnmodelcol */
    public browcolumnmodelcol() {
    }

    public browcolumnmodel getColModel() {
        return colModel;
    }

    public void setColModel(browcolumnmodel colModel) {
        this.colModel = colModel;
    }
    
    public void Insert(){
        colModel=new browcolumnmodel();
    }
    public void get_ap_transaksi_model(String tablename){
        this.Tbl="(select t.document_number,date(t.document_date) document_date,t.supplier_code,a.supplier_name,document_status "
                + "from "+tablename+" t "
                + "left join ap_supplier a on a.supplier_code=t.supplier_code) "+tablename;
        Insert();
        getColModel().setColName("document_number");
        getColModel().setColDesc("No. Registrasi");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("document_date");
        getColModel().setColDesc("Tanggal");
        getColModel().setColWidth(800);
        add(getColModel());
        Insert();
        getColModel().setColName("supplier_code");
        getColModel().setColDesc("Kd. Supplier");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("supplier_name");
        getColModel().setColDesc("Nm. Supplier");
        getColModel().setColWidth(1500);
        add(getColModel());
    }

    public void get_ar_transaksi_model(String tablename){
        this.Tbl="(select t.document_number,date(t.document_date) document_date,t.customer_code,a.customer_name,document_status "
                + "from "+tablename+" t "
                + "left join ar_customer a on a.customer_code=t.customer_code) "+tablename;
        Insert();
        getColModel().setColName("document_number");
        getColModel().setColDesc("No. Registrasi");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("document_date");
        getColModel().setColDesc("Tanggal");
        getColModel().setColWidth(800);
        add(getColModel());
        Insert();
        getColModel().setColName("customer_code");
        getColModel().setColDesc("Kd. Pelanggan");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("customer_name");
        getColModel().setColDesc("Nm. Pelanggan");
        getColModel().setColWidth(1500);
        add(getColModel());
    }

    public void get_ar_pos_open_close_model(String tablename){
        this.Tbl="(select t.document_number,date(t.document_date) document_date,t.chasier_code,a.chasier_name,document_status "
                + "from "+tablename+" t "
                + "left join ar_pos_chasier a on a.chasier_code=t.chasier_code) "+tablename;
        Insert();
        getColModel().setColName("document_number");
        getColModel().setColDesc("No. Registrasi");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("document_date");
        getColModel().setColDesc("Tanggal");
        getColModel().setColWidth(800);
        add(getColModel());
        Insert();
        getColModel().setColName("chasier_code");
        getColModel().setColDesc("Kd. Kasir");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("chasier_name");
        getColModel().setColDesc("Nm. Kasir");
        getColModel().setColWidth(1500);
        add(getColModel());
    }

    public void get_simpan_pinjam_transaksi_model(String tablename){
        this.Tbl="(select t.document_number,date(t.document_date) document_date,t.member_number,a.member_name,document_status "
                + "from "+tablename+" t "
                + "left join ko_anggota a on a.member_number=t.member_number) "+tablename;
        Insert();
        getColModel().setColName("document_number");
        getColModel().setColDesc("No. Registrasi");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("document_date");
        getColModel().setColDesc("Tanggal");
        getColModel().setColWidth(800);
        add(getColModel());
        Insert();
        getColModel().setColName("member_number");
        getColModel().setColDesc("No. Anggota");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("member_name");
        getColModel().setColDesc("Nama Anggota");
        getColModel().setColWidth(1500);
        add(getColModel());
    }

    public void get_simpan_pinjam_transaksi_model_ref(String tablename){
        this.Tbl="(select t.document_number,date(t.document_date) document_date,t.member_number,a.member_name,document_status,angsur_sts "
                + "from "+tablename+" t "
                + "left join ko_anggota a on a.member_number=t.member_number) "+tablename;
        Insert();
        getColModel().setColName("document_number");
        getColModel().setColDesc("No. Registrasi");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("document_date");
        getColModel().setColDesc("Tanggal");
        getColModel().setColWidth(800);
        add(getColModel());
        Insert();
        getColModel().setColName("member_number");
        getColModel().setColDesc("No. Anggota");
        getColModel().setColWidth(850);
        add(getColModel());
        Insert();
        getColModel().setColName("member_name");
        getColModel().setColDesc("Nama Anggota");
        getColModel().setColWidth(1500);
        add(getColModel());
    }

    public String getTbl() {
        return this.Tbl;
    }
}
