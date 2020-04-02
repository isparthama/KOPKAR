/*
 * test.java
 *
 * Created on March 9, 2007, 8:31 AM
 */

package common.component;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import jdbc.DbBean;
import tablemodel.bdmodel;
import tablemodel.browcolumnmodelcol;
import utils.appsettinghandler;

/**
 *
 * @author  ISParthama
 */

public class FrmBrowseData extends javax.swing.JDialog {
    private String Value="";
    private String SecondValue="";
    protected browcolumnmodelcol colModel=new browcolumnmodelcol();
    protected String datatoshow;
    String FilterField;
    protected String Tbl;
    String Field1;String Field2;
    DbBean db=appsettinghandler.db;
    DbBean dbins=appsettinghandler.dbcom;
    DefaultTableModel tmodel=new bdmodel();
    private String ThirdValue;

    public FrmBrowseData() {
    }

    /** Creates new form test */

    
    
    public FrmBrowseData(String data,String Filter) {
        datatoshow=data;
        FilterField=Filter;
        initComponents();
        SetFieldInCombo();
        SetColHeader();
        SetColWidth();
        //ConnectToDatabase();
        cbosearchin.setSelectedIndex(1);
        cbosearchmth.setSelectedIndex(1);
        if (!datatoshow.equalsIgnoreCase("controldocument")){
            RetrieveData ();
        }
        txtsearch.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false); 
        this.setTitle("Browse Data "+data); //-->

        
    }

    public FrmBrowseData(String data,String Filter, int i) {
        datatoshow=data;
        FilterField=Filter;
        initComponents();
        SetFieldInCombo();
        SetColHeader();
        SetColWidth();
        //ConnectToDatabase();
        cbosearchin.setSelectedIndex(i);
        cbosearchmth.setSelectedIndex(1);
        if (!datatoshow.equalsIgnoreCase("controldocument")){
            RetrieveData ();
        }
        txtsearch.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        this.setTitle("Browse Data "+data); //-->
    }

    
    protected void SetFieldInCombo(){
        if (datatoshow.equalsIgnoreCase("report_files")){
            Tbl="report_files";
            colModel.Insert();
            colModel.getColModel().setColName("report_code");
            colModel.getColModel().setColDesc("Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("report_desc");
            colModel.getColModel().setColDesc("Description");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("report_category")){
            Tbl="report_category";
            colModel.Insert();
            colModel.getColModel().setColName("report_category_code");
            colModel.getColModel().setColDesc("Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("report_category_desc");
            colModel.getColModel().setColDesc("Description");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        
        if (datatoshow.equalsIgnoreCase("mastercompany")){
            Tbl="mastercompany";
            colModel.Insert();
            colModel.getColModel().setColName("Company");
            colModel.getColModel().setColDesc("Company");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("Description");
            colModel.getColModel().setColDesc("Description");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("module")){
            Tbl="module";
            colModel.Insert();
            colModel.getColModel().setColName("ModuleCode");
            colModel.getColModel().setColDesc("Module. Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("Dscription");
            colModel.getColModel().setColDesc("Module Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("masteruser")){
            Tbl="masteruser";
            colModel.Insert();
            colModel.getColModel().setColName("user");
            colModel.getColModel().setColDesc("Id Pengguna");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama");
            colModel.getColModel().setColDesc("Nama Pengguna");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }

        if (datatoshow.equalsIgnoreCase("ar_pos_chasier")){
            Tbl="ar_pos_chasier";
            colModel.Insert();
            colModel.getColModel().setColName("chasier_code");
            colModel.getColModel().setColDesc("Kode Group");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("chasier_name");
            colModel.getColModel().setColDesc("Nama Group");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("mastergroup")){
            Tbl="mastergroup";
            colModel.Insert();
            colModel.getColModel().setColName("kodegroup");
            colModel.getColModel().setColDesc("Kode Group");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("keterangan");
            colModel.getColModel().setColDesc("Nama Group");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("mastermodule")){
            Tbl="mastermodule";
            colModel.Insert();
            colModel.getColModel().setColName("module");
            colModel.getColModel().setColDesc("Kode module");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("description");
            colModel.getColModel().setColDesc("Nama module");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("employee")){
            Tbl="employee";
            colModel.Insert();
            colModel.getColModel().setColName("emplcode");
            colModel.getColModel().setColDesc("Empl. Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("emplname");
            colModel.getColModel().setColDesc("Employee Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_brand
        if (datatoshow.equalsIgnoreCase("in_brand")){
            Tbl="in_brand";
            colModel.Insert();
            colModel.getColModel().setColName("brand_code");
            colModel.getColModel().setColDesc("Brand Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("brand_name");
            colModel.getColModel().setColDesc("Brand Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_category
        if (datatoshow.equalsIgnoreCase("in_category")){
            Tbl="in_category";
            colModel.Insert();
            colModel.getColModel().setColName("category_code");
            colModel.getColModel().setColDesc("Category Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("category_name");
            colModel.getColModel().setColDesc("Category Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_function
        if (datatoshow.equalsIgnoreCase("in_function")){
            Tbl="in_function";
            colModel.Insert();
            colModel.getColModel().setColName("function_code");
            colModel.getColModel().setColDesc("Function Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("function_name");
            colModel.getColModel().setColDesc("Function Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_measure
        if (datatoshow.equalsIgnoreCase("in_measure")){
            Tbl="in_measure";
            colModel.Insert();
            colModel.getColModel().setColName("uom_code");
            colModel.getColModel().setColDesc("Measure Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("uom_desc");
            colModel.getColModel().setColDesc("Measure Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //op_payment_term
        if (datatoshow.equalsIgnoreCase("op_payment_term")){
            Tbl="op_payment_term";
            colModel.Insert();
            colModel.getColModel().setColName("term_code");
            colModel.getColModel().setColDesc("Term Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("term_desc");
            colModel.getColModel().setColDesc("Term Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //op_payment_term
        if (datatoshow.equalsIgnoreCase("op_bank")){
            Tbl="op_bank";
            colModel.Insert();
            colModel.getColModel().setColName("bank_code");
            colModel.getColModel().setColDesc("Bank Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("bank_desc");
            colModel.getColModel().setColDesc("Bank Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //op_salesman
        if (datatoshow.equalsIgnoreCase("op_salesman")){
            Tbl="op_salesman";
            colModel.Insert();
            colModel.getColModel().setColName("salesman_code");
            colModel.getColModel().setColDesc("Salesman Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("salesman_name");
            colModel.getColModel().setColDesc("Sales Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_price
        if (datatoshow.equalsIgnoreCase("in_price")){
            Tbl="in_price";
            colModel.Insert();
            colModel.getColModel().setColName("price_code");
            colModel.getColModel().setColDesc("Price Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("price_desc");
            colModel.getColModel().setColDesc("Price Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_discount
        if (datatoshow.equalsIgnoreCase("in_discount")){
            Tbl="in_discount";
            colModel.Insert();
            colModel.getColModel().setColName("discount_code");
            colModel.getColModel().setColDesc("Discount Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("discount_desc");
            colModel.getColModel().setColDesc("Discount Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_warehouse_type
        if (datatoshow.equalsIgnoreCase("in_warehouse_type")){
            Tbl="in_warehouse_type";
            colModel.Insert();
            colModel.getColModel().setColName("warehouse_type");
            colModel.getColModel().setColDesc("Warehouse Type Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("warehouse_type_desc");
            colModel.getColModel().setColDesc("Warehouse Type Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_warehouse
        if (datatoshow.equalsIgnoreCase("in_warehouse")){
            Tbl="in_warehouse";
            colModel.Insert();
            colModel.getColModel().setColName("warehouse_code");
            colModel.getColModel().setColDesc("Warehouse Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("warehouse_name");
            colModel.getColModel().setColDesc("Warehouse Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ar_customer
        if (datatoshow.equalsIgnoreCase("ar_customer")){
            Tbl="ar_customer";
            colModel.Insert();
            colModel.getColModel().setColName("customer_code");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("customer_name");
            colModel.getColModel().setColDesc("Customer Name");
            colModel.getColModel().setColWidth(2000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("member_number");
            colModel.getColModel().setColDesc("No Anggota");
            colModel.getColModel().setColWidth(2000);
            colModel.add(colModel.getColModel());

        }
        //ap_supplier
        if (datatoshow.equalsIgnoreCase("ap_supplier")){
            Tbl="ap_supplier";
            colModel.Insert();
            colModel.getColModel().setColName("supplier_code");
            colModel.getColModel().setColDesc("Supplier Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("supplier_name");
            colModel.getColModel().setColDesc("Supplier Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_product
        if (datatoshow.equalsIgnoreCase("in_product")){
            Tbl="in_product";
            colModel.Insert();
            colModel.getColModel().setColName("product_code");
            colModel.getColModel().setColDesc("Product Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("product_name");
            colModel.getColModel().setColDesc("Product Name");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_departemen
        if (datatoshow.equalsIgnoreCase("ko_departemen")){
            Tbl="ko_departemen";
            colModel.Insert();
            colModel.getColModel().setColName("kode_departemen");
            colModel.getColModel().setColDesc("Kode Departemen");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_departemen");
            colModel.getColModel().setColDesc("Nama Departemen");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_pendidikan
        if (datatoshow.equalsIgnoreCase("ko_pendidikan")){
            Tbl="ko_pendidikan";
            colModel.Insert();
            colModel.getColModel().setColName("kode_pendidikan");
            colModel.getColModel().setColDesc("Kode Pendidikan");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_pendidikan");
            colModel.getColModel().setColDesc("Nama Pendidikan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }

        //ko_jabatan
        if (datatoshow.equalsIgnoreCase("ko_jabatan")){
            Tbl="ko_jabatan";
            colModel.Insert();
            colModel.getColModel().setColName("kode_jabatan");
            colModel.getColModel().setColDesc("Kode jabatan");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_jabatan");
            colModel.getColModel().setColDesc("Nama jabatan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_pinjaman
        if (datatoshow.equalsIgnoreCase("ko_pinjaman")){
            Tbl="ko_pinjaman";
            colModel.Insert();
            colModel.getColModel().setColName("kode_pinjaman");
            colModel.getColModel().setColDesc("Kode Pinjaman");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_pinjaman");
            colModel.getColModel().setColDesc("Nama Pinjaman");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_pinjaman_tipe
        if (datatoshow.equalsIgnoreCase("ko_pinjaman_tipe")){
            Tbl="ko_pinjaman_tipe";
            colModel.Insert();
            colModel.getColModel().setColName("kode_pinjaman_tipe");
            colModel.getColModel().setColDesc("Kode Type Pinjaman");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_pinjaman_tipe");
            colModel.getColModel().setColDesc("Nama Type Pinjaman");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_anggota
        if (datatoshow.equalsIgnoreCase("ko_anggota")){
            Tbl="ko_anggota";
            colModel.Insert();
            colModel.getColModel().setColName("member_number");
            colModel.getColModel().setColDesc("Nomor Anggota");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("member_name");
            colModel.getColModel().setColDesc("Nama Anggota");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ap_purchase_order
        if (datatoshow.equalsIgnoreCase("ap_purchase_order")){
            colModel.get_ap_transaksi_model("ap_purchase_order");
            Tbl=colModel.getTbl();
        }
        //ap_purchase_receive
        if (datatoshow.equalsIgnoreCase("ap_purchase_receive")){
            colModel.get_ap_transaksi_model("ap_purchase_receive");
            Tbl=colModel.getTbl();
        }
        //ap_purchase_invoice
        if (datatoshow.equalsIgnoreCase("ap_purchase_invoice")){
            colModel.get_ap_transaksi_model("ap_purchase_invoice");
            Tbl=colModel.getTbl();
        }
        //ap_purchase_dnote
        if (datatoshow.equalsIgnoreCase("ap_purchase_dnote")){
            colModel.get_ap_transaksi_model("ap_purchase_dnote");
            Tbl=colModel.getTbl();
        }

        //ap_purchase_return
        if (datatoshow.equalsIgnoreCase("ap_purchase_return")){
            colModel.get_ap_transaksi_model("ap_purchase_return");
            Tbl=colModel.getTbl();
        }

        //ap_payment
        if (datatoshow.equalsIgnoreCase("ap_payment")){
            Tbl="ap_payment";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }

        //ar_sales_order
        if (datatoshow.equalsIgnoreCase("ar_sales_order")){
            colModel.get_ar_transaksi_model("ar_sales_order");
            Tbl=colModel.getTbl();
        }
        //ar_sales_delivery
        if (datatoshow.equalsIgnoreCase("ar_sales_delivery")){
            colModel.get_ar_transaksi_model("ar_sales_delivery");
            Tbl=colModel.getTbl();
        }
        //ar_sales_invoice
        if (datatoshow.equalsIgnoreCase("ar_sales_invoice")){
            colModel.get_ar_transaksi_model("ar_sales_invoice");
            Tbl=colModel.getTbl();
        }
        //ar_sales_return
        if (datatoshow.equalsIgnoreCase("ar_sales_return")){
            colModel.get_ar_transaksi_model("ar_sales_return");
            Tbl=colModel.getTbl();
        }
        //ar_sales_cnote
        if (datatoshow.equalsIgnoreCase("ar_sales_cnote")){
            colModel.get_ar_transaksi_model("ar_sales_cnote");
            Tbl=colModel.getTbl();
        }
        
        //ar_pos_counter
        if (datatoshow.equalsIgnoreCase("ar_pos_counter")){
            Tbl="ar_pos_counter";
            colModel.Insert();
            colModel.getColModel().setColName("counter_number");
            colModel.getColModel().setColDesc("Nomor Loket");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("counter_name");
            colModel.getColModel().setColDesc("Keterangan Loket");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ar_pos_open
        if (datatoshow.equalsIgnoreCase("ar_pos_open")){
            colModel.get_ar_pos_open_close_model("ar_pos_open");
            Tbl=colModel.getTbl();
        }
        //ar_pos_close
        if (datatoshow.equalsIgnoreCase("ar_pos_close")){
            colModel.get_ar_pos_open_close_model("ar_pos_close");
            Tbl=colModel.getTbl();
        }
        //ar_pos_return
        if (datatoshow.equalsIgnoreCase("ar_pos_return")){
            Tbl="ar_pos_return";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ar_pos_sales
        if (datatoshow.equalsIgnoreCase("ar_pos_sales")){
            colModel.get_ar_transaksi_model("ar_pos_sales");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_registrasi
        if (datatoshow.equalsIgnoreCase("ko_transaksi_registrasi")){
            Tbl="ko_transaksi_registrasi";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_transaksi_setor_simpanan
        if (datatoshow.equalsIgnoreCase("ko_transaksi_setor_simpanan")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_setor_simpanan");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_tarik_simpanan
        if (datatoshow.equalsIgnoreCase("ko_transaksi_tarik_simpanan")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_tarik_simpanan");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_mohon
        if (datatoshow.equalsIgnoreCase("ko_transaksi_mohon")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_mohon");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_setuju
        if (datatoshow.equalsIgnoreCase("ko_transaksi_setuju")){
            colModel.get_simpan_pinjam_transaksi_model_ref("ko_transaksi_setuju");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_bayar
        if (datatoshow.equalsIgnoreCase("ko_transaksi_bayar")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_bayar");
            Tbl=colModel.getTbl();
        }
        //in_so_sheet
        if (datatoshow.equalsIgnoreCase("in_so_sheet")){
            Tbl="in_so_sheet";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_so_entry
        if (datatoshow.equalsIgnoreCase("in_so_entry")){
            Tbl="in_so_entry";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_so_process
        if (datatoshow.equalsIgnoreCase("in_so_process")){
            Tbl="in_so_process";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_goods_transfer
        if (datatoshow.equalsIgnoreCase("in_goods_transfer")){
            colModel.get_ap_transaksi_model("in_goods_transfer");
            Tbl=colModel.getTbl();
        }
        //in_goods_receipt
        if (datatoshow.equalsIgnoreCase("in_goods_receipt")){
            colModel.get_ap_transaksi_model("in_goods_receipt");
            Tbl=colModel.getTbl();
        }
        //in_goods_issue
        if (datatoshow.equalsIgnoreCase("in_goods_issue")){
            colModel.get_ap_transaksi_model("in_goods_issue");
            Tbl=colModel.getTbl();
        }
        //gl_group
        if (datatoshow.equalsIgnoreCase("gl_group")){
            Tbl="gl_group";
            colModel.Insert();
            colModel.getColModel().setColName("kode_group");
            colModel.getColModel().setColDesc("Kode Group");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_group");
            colModel.getColModel().setColDesc("Nama Group");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_account
        if (datatoshow.equalsIgnoreCase("gl_account")){
            Tbl="gl_account";
            colModel.Insert();
            colModel.getColModel().setColName("kode_akun");
            colModel.getColModel().setColDesc("Kode Akun");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_akun");
            colModel.getColModel().setColDesc("Nama Akun");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_group_data_entry
        if (datatoshow.equalsIgnoreCase("gl_group_data_entry")){
            Tbl="gl_group_data_entry";
            colModel.Insert();
            colModel.getColModel().setColName("kode_gde");
            colModel.getColModel().setColDesc("Kode Group");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_gde");
            colModel.getColModel().setColDesc("Nama Group");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_rab
        if (datatoshow.equalsIgnoreCase("gl_rab")){
            Tbl="gl_rab";
            colModel.Insert();
            colModel.getColModel().setColName("kode_rab");
            colModel.getColModel().setColDesc("Kode RAB");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_rab");
            colModel.getColModel().setColDesc("Nama RAB");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_sumber_data
        if (datatoshow.equalsIgnoreCase("gl_sumber_data")){
            Tbl="gl_sumber_data";
            colModel.Insert();
            colModel.getColModel().setColName("kode_data_entry");
            colModel.getColModel().setColDesc("Kode Data");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("nama_data_entry");
            colModel.getColModel().setColDesc("Nama Data");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_kalender
        if (datatoshow.equalsIgnoreCase("gl_kalender")){
            Tbl="gl_kalender";
            colModel.Insert();
            colModel.getColModel().setColName("yop");
            colModel.getColModel().setColDesc("Tahun");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("aktif");
            colModel.getColModel().setColDesc("Aktif");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_transaksi_journal
        if (datatoshow.equalsIgnoreCase("gl_transaksi_journal")){
            Tbl="gl_transaksi_journal";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //gl_transaksi_rab
        if (datatoshow.equalsIgnoreCase("gl_transaksi_rab")){
            Tbl="gl_transaksi_rab";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_transaksi_cair_pinjaman
        if (datatoshow.equalsIgnoreCase("ko_transaksi_cair_pinjaman")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_cair_pinjaman");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_revisi_simpanan
        if (datatoshow.equalsIgnoreCase("ko_transaksi_revisi_simpanan")){
            colModel.get_simpan_pinjam_transaksi_model("ko_transaksi_revisi_simpanan");
            Tbl=colModel.getTbl();
        }
        //ko_transaksi_tagihan
        if (datatoshow.equalsIgnoreCase("ko_transaksi_tagihan")){
            Tbl="ko_transaksi_tagihan";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_transaksi__lember_tagihan
        if (datatoshow.equalsIgnoreCase("ko_transaksi_Lembar_tagihan")){
            Tbl="ko_transaksi_lembar_tagihan";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ko_transaksi_bayar_toko
        if (datatoshow.equalsIgnoreCase("ko_transaksi_bayar_toko")){
            Tbl="ko_transaksi_bayar_toko";
            colModel.Insert();
            colModel.getColModel().setColName("document_number");
            colModel.getColModel().setColDesc("Document Number");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("document_date");
            colModel.getColModel().setColDesc("Document Date");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ap_account_set
        if (datatoshow.equalsIgnoreCase("ap_account_set")){
            Tbl="ap_account_set";
            colModel.Insert();
            colModel.getColModel().setColName("accset_kode");
            colModel.getColModel().setColDesc("Kode Asset");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("accset_desc");
            colModel.getColModel().setColDesc("Keterangan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //ar_account_set
        if (datatoshow.equalsIgnoreCase("ar_account_set")){
            Tbl="ar_account_set";
            colModel.Insert();
            colModel.getColModel().setColName("accset_kode");
            colModel.getColModel().setColDesc("Kode Asset");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("accset_desc");
            colModel.getColModel().setColDesc("Keterangan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //in_account_set
        if (datatoshow.equalsIgnoreCase("in_account_set")){
            Tbl="in_account_set";
            colModel.Insert();
            colModel.getColModel().setColName("accset_kode");
            colModel.getColModel().setColDesc("Kode Asset");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("accset_desc");
            colModel.getColModel().setColDesc("Keterangan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //
        if (datatoshow.equalsIgnoreCase("ko_account_set")){
            Tbl="ko_account_set";
            colModel.Insert();
            colModel.getColModel().setColName("accset_kode");
            colModel.getColModel().setColDesc("Kode Asset");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("accset_desc");
            colModel.getColModel().setColDesc("Keterangan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }
        //setting_financial_rpt
        if (datatoshow.equalsIgnoreCase("setting_financial_rpt")){
            Tbl="setting_financial_rpt";
            colModel.Insert();
            colModel.getColModel().setColName("reportname");
            colModel.getColModel().setColDesc("Report Name");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("reportdesc");
            colModel.getColModel().setColDesc("Keterangan");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }


        Integer i=new Integer(0);
        for(i=0;i<colModel.size();i++){
            cbosearchin.addItem(colModel.get(i).getColDesc());
        }
        txtsearch.setText("");
    }
    private void ConnectToDatabase ()
	{
		try
		{
                        
		}
		catch (Exception e) {System.out.println(e);}
	}
    private void RetrieveData ()
	{
            ResultSet rs =null;
            ConnectToDatabase();
		try
		{	
			int row = tmodel.getRowCount();			
			while(row > 0)
			{	
				row--;				
				tmodel.removeRow(row);
			}	
			
			//execute query		
                        String skode=txtsearch.getText().trim();
                        String Mth=cbosearchmth.getSelectedItem().toString();
                        String Fld=colModel.get(cbosearchin.getSelectedIndex()).getColName();
                        Integer i=new Integer(0);
                        String sFields="";
                        for(i=0;i<colModel.size();i++){
                            sFields=sFields+colModel.get(i).getColName()+",";
                        }
                        sFields=sFields.substring(0,sFields.length()-1);
                        System.out.println(sFields);
                        String sQuery="";
                        if (txtsearch.getText().equalsIgnoreCase("")){
                            skode="";
                        }else{
                            skode=txtsearch.getText();
                        }
                        
                        if (skode=="") {
                            if (FilterField==""){
                                sQuery="select " + sFields + " from " + Tbl + " order by " + colModel.get(0).getColName(); 
                            } else {
                                sQuery="select " + sFields + " from " + Tbl + " Where " + FilterField + " order by " + colModel.get(0).getColName();
                            }
                        } else {       
                            //rs = st.executeQuery("Select * from CourseInfo");
                            if (Mth=="Start With"){
                                if (FilterField==""){
                                    sQuery="select " + sFields + " from "  + Tbl + " where " + Fld + " like '" + skode + "%' order by " + colModel.get(0).getColName();
                                } else {
                                    sQuery="select " + sFields + " from "  + Tbl + " where " + Fld + " like '" + skode + "%' and " + FilterField + " order by " + colModel.get(0).getColName();
                                }
                            }else {
                                if (FilterField==""){
                                    sQuery="select " + sFields + " from "  + Tbl + " where " + Fld + " like '%" + skode + "%' order by " + Fld;
                                } else {
                                    sQuery="select " + sFields + " from "  + Tbl + " where " + Fld + " like '%" + skode + "%' and " + FilterField + " order by " + colModel.get(0).getColName();
                                }
                                 
                            }
                        }
			if (sQuery!=""){
                            if (this.datatoshow.equalsIgnoreCase("employee")||this.datatoshow.equalsIgnoreCase("module")
                                    ||this.datatoshow.equalsIgnoreCase("mastergroup")||this.datatoshow.equalsIgnoreCase("masteruser")
                                    ||this.datatoshow.equalsIgnoreCase("mastermodule")
                                    ||this.datatoshow.equalsIgnoreCase("mastercompany")){
                                rs = dbins.executeQuery(sQuery);
                            } else {
                                rs = db.executeQuery(sQuery);
                            }
                        }
			//get metadata
			ResultSetMetaData md = rs.getMetaData();
			int colcount = md.getColumnCount();
			
			Object[] data = new Object[colcount];
			//extracting data		
				
			while (rs.next())
			{				
				for (i=1; i<=colModel.size(); i++)
				{
					data[i-1] = rs.getString(i);
				}				
				tmodel.addRow(data);
			}
                        jLabel4.setText("Number of Records Found : " + tmodel.getRowCount());
                
		}
		catch(Exception e) {System.out.println(e);	}
	}
    private void SetColHeader()
	{
                Integer i=new Integer(0);
                for (i=0;i<colModel.size();i++){
		tmodel.addColumn(colModel.get(i).getColDesc());
                }
	}
    private void SetColWidth()
	{
                Integer i=new Integer(0);
                for (i=0;i<colModel.size();i++){
                    if (colModel.get(i).getColWidth()>0){
                        setColumnWidth(i,colModel.get(i).getColWidth());
                    }
                }
	}
    private void setColumnWidth(Integer ColumnIdx,Integer Width){
       TableColumn column=jTable1.getColumnModel().getColumn(ColumnIdx);
       column.setMinWidth(0);
       column.setMaxWidth(Width);
       column.setPreferredWidth(Width);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbosearchin = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbosearchmth = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(tmodel);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Search In Field");

        jLabel2.setText("Seach Methode");

        cbosearchmth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Start With", "Contains" }));

        jLabel3.setText("Search Key");

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtsearchPropertyChange(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });
        txtsearch.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtsearchVetoableChange(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Automatic Search");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Number of Records Found : ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(cbosearchmth, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cbosearchin, 0, 179, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnsearch)
                                    .add(jCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 325, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel3)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cbosearchin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(cbosearchmth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnsearch))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(19, 19, 19))
                    .add(jCheckBox1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jLabel4))
                .add(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2){
            doSelect();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        setVisible(false);            					// free the system resources 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
// TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
            if (jTable1.getRowCount()==1){
                doSelect();
            } else {
                RetrieveData();
            }
        } else {
            if (jCheckBox1.isSelected()){
                RetrieveData();
            }
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
// TODO add your handling code here:
       if (evt.getKeyCode()== evt.VK_DOWN){
           jTable1.requestFocusInWindow();
           if (jTable1.getRowCount()>0){
               jTable1.setRowSelectionInterval(0,0);
               jTable1.setColumnSelectionInterval(0,0);
           }
       }
    }//GEN-LAST:event_txtsearchKeyPressed

    private void txtsearchVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtsearchVetoableChange
// TODO add your handling code here:
         
    }//GEN-LAST:event_txtsearchVetoableChange

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
// TODO add your handling code here:
        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
// TODO add your handling code here:
         
    }//GEN-LAST:event_txtsearchKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
// TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
            evt.consume();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
// TODO add your handling code here:
       RetrieveData();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtsearchPropertyChange
// TODO add your handling code here:
           
    }//GEN-LAST:event_txtsearchPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        doSelect(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
            evt.consume();
            doSelect();
        }
    }//GEN-LAST:event_jTable1KeyReleased

    public void clearselection(){
        this.Value="";
        this.SecondValue="";
        this.ThirdValue="";
    }
    
    private void doSelect(){
        Integer irow;
        if (jTable1.getRowCount()>0){
            irow=jTable1.getSelectedRow();
            if (irow<0){
                irow=0;
            } 
            String sVal=tmodel.getValueAt(irow,0).toString();
            Value=tmodel.getValueAt(irow,0).toString();;
            SecondValue=tmodel.getValueAt(irow,1).toString();

            if (jTable1.getColumnCount()>=3){
                ThirdValue=tmodel.getValueAt(irow,2).toString();
            }
            
            setVisible(false);
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getSecondValue() {
        return SecondValue;
    }

    public String getThirdValue() {
        return ThirdValue;
    }

    public void setSecondValue(String SecondValue) {
        this.SecondValue = SecondValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    protected javax.swing.JComboBox cbosearchin;
    protected javax.swing.JComboBox cbosearchmth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    protected javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
    
}
