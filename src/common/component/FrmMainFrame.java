/*
 * MainFrame.java
 *
 * Created on December 12, 2008, 2:55 PM
 * 
 * FrmMainFrame is the Main Form, It Provide Menus and Navigator Icons.
 * 
 * How To run JinternalForm and Plugin To 
 * 
 * 1. Add Menuitem 
 * Sample : JmniFrm<table>
 * 
 * 2. Type "Frm<table>" on Properties 'Menu' 
 * Sample : Frm<Table>
 * 
 * 3. Add "Frm<table>" to table Mastermodule (mysql)
 * 4. Run program Setting Previliges using Form Group
 * 5. Type this on FrmMainFrame
 * 
 * import common.component.FrmMaster<table>;
 * 
 * .......
 * 
 try {
        if (frmmaster<table> == null) {
            frmmaster<table> = new FrmMaster<table>(this);
        }
        
        showForm(frmmaster<table>);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 *Sample : 
 *    
 * import common.component.FrmMastergroup;
 * 
 * .......
 * 
 try {
        if (frmmastergroup == null) {
            frmmastergroup = new FrmMastergroup(this);
        }
        
        showForm(frmmastergroup);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package common.component;


import classinterface.NavigatorFormInt;
import classinterface.NavigatorFormReportInt;
import common.objectclasses.extended.MasterModuleExt;
import common.objectclasses.extended.MastergroupdetailExt;
import generator.forms.FrmGenerator;
import kopkar.ko.component.Frmko_transaksi_bayar;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import kopkar.ap.component.FrmFMAS01;
import kopkar.ap.component.Frmap_account_set;
import kopkar.ap.component.Frmap_option;
import kopkar.ap.component.Frmap_payment;
import kopkar.ap.component.Frmap_purchase_dnote;
import kopkar.ap.component.Frmap_purchase_invoice;
import kopkar.ap.component.Frmap_purchase_order;
import kopkar.ap.component.Frmap_purchase_receive;
import kopkar.ap.component.Frmap_purchase_return;
import kopkar.ap.component.Frmap_supplier;
import kopkar.ap.component.Frmko_util_import_toko;
import kopkar.ar.component.Frmar_customer;
import kopkar.ar.component.Frmar_pos_sales;
import kopkar.ar.component.Frmar_sales_delivery;
import kopkar.ar.component.Frmar_sales_order;
import kopkar.ar.component.Frmar_sales_return;
import kopkar.gl.component.Frmgl_account;
import kopkar.gl.component.Frmgl_group;
import kopkar.gl.component.Frmgl_group_data_entry;
import kopkar.gl.component.Frmgl_kalender;
import kopkar.gl.component.Frmgl_rab;
import kopkar.gl.component.Frmgl_sumber_data;
import kopkar.gl.component.Frmgl_transaksi_journal;
import kopkar.gl.component.Frmgl_transaksi_rab;
import kopkar.in.component.Frmin_ProsesBulanan;
import kopkar.in.component.Frmin_brand;
import kopkar.in.component.Frmin_category;
import kopkar.in.component.Frmin_discount;
import kopkar.in.component.Frmin_function;
import kopkar.in.component.Frmin_goods_issue;
import kopkar.in.component.Frmin_goods_receipt;
import kopkar.in.component.Frmin_goods_transfer;
import kopkar.in.component.Frmin_measure;
import kopkar.in.component.Frmin_price;
import kopkar.in.component.Frmin_product;
import kopkar.in.component.Frmin_product_price_info;
import kopkar.in.component.Frmin_so_entry;
import kopkar.in.component.Frmin_so_process;
import kopkar.in.component.Frmin_so_sheet;
import kopkar.in.component.Frmin_warehouse;
import kopkar.in.component.Frmin_warehouse_type;
import kopkar.ko.component.Frmko_Auto_Pot_Pinjaman;
import kopkar.ko.component.Frmko_Auto_Pot_Simpanan;
import kopkar.ko.component.Frmko_anggota;
import kopkar.ko.component.Frmko_departemen;
import kopkar.ko.component.Frmko_jabatan;
import kopkar.ko.component.Frmko_monthly_process;
import kopkar.ko.component.Frmko_pinjaman;
import kopkar.ko.component.Frmko_pinjaman_tipe;
import kopkar.ko.component.Frmko_transaksi_cair_pinjaman;
import kopkar.ko.component.Frmko_transaksi_mohon;
import kopkar.ko.component.Frmko_transaksi_registrasi;
import kopkar.ko.component.Frmko_transaksi_revisi_simpanan;
import kopkar.ko.component.Frmko_transaksi_setor_simpanan;
import kopkar.ko.component.Frmko_transaksi_setuju;
import kopkar.ko.component.Frmko_transaksi_tarik_simpanan;
import kopkar.op.component.Frmop_payment_term;
import kopkar.op.component.Frmop_salesman;
import kopkar.ko.component.Frmrp_anggota;
import kopkar.ko.component.Frmrp_anggota_simpanan;
import kopkar.in.component.Frmrp_brand;
import kopkar.in.component.Frmrp_category;
import kopkar.ar.component.Frmrp_customer;
import kopkar.ko.component.Frmrp_departemen;
import kopkar.in.component.Frmrp_discount;
import kopkar.in.component.Frmrp_function;
import kopkar.in.component.Frmrp_goods_issue;
import kopkar.in.component.Frmrp_goods_receipt;
import kopkar.in.component.Frmrp_goods_transfer;
import kopkar.ko.component.Frmrp_jabatan;
import kopkar.in.component.Frmrp_kartu_stok;
import kopkar.in.component.Frmrp_measure;
import kopkar.in.component.Frmrp_mutasi_stok;
import kopkar.op.component.Frmrp_payment_term;
import kopkar.ko.component.Frmrp_pinjaman;
import kopkar.ko.component.Frmrp_pinjaman_tipe;
import kopkar.ko.component.Frmrp_potong_gaji;
import kopkar.in.component.Frmrp_price;
import kopkar.in.component.Frmrp_product;
import kopkar.ap.component.Frmrp_purchase_order;
import kopkar.ap.component.Frmrp_purchase_receive;
import kopkar.ap.component.Frmrp_purchase_return;
import kopkar.ar.component.Frmrp_salesman;
import kopkar.ko.component.Frmrp_slip_anggota;
import kopkar.ap.component.Frmrp_supplier;
import kopkar.ap.component.Frmrp_supplier_analisa;
import kopkar.ar.component.FrmFTPS0302;
import kopkar.ar.component.FrmRMKK03;
import kopkar.ar.component.FrmRMKK04;
import kopkar.ar.component.FrmRTPS03;
import kopkar.ar.component.FrmRTSC0101;
import kopkar.ar.component.Frmar_account_set;
import kopkar.ar.component.Frmar_option;
import kopkar.ar.component.Frmar_pos_chasier;
import kopkar.ar.component.Frmar_pos_close;
import kopkar.ar.component.Frmar_pos_counter;
import kopkar.ar.component.Frmar_pos_open;
import kopkar.ar.component.Frmar_pos_option;
import kopkar.ar.component.Frmar_pos_return;
import kopkar.ar.component.Frmar_sales_cnote;
import kopkar.ar.component.Frmar_sales_invoice;
import kopkar.component.Frmrp_mutasi_simpanan;
import kopkar.component.Frmrp_transaksi_mohon;
import kopkar.gl.component.FrmRFKK01;
import kopkar.gl.component.FrmRFKK02;
import kopkar.gl.component.FrmRMKK05;
import kopkar.gl.component.FrmRMKK06;
import kopkar.gl.component.FrmRMKK07;
import kopkar.gl.component.FrmRMKK08;
import kopkar.gl.component.FrmRTKK01;
import kopkar.gl.component.FrmRTKK02;
import kopkar.gl.component.FrmRTKK03;
import kopkar.gl.component.FrmRTKK04;
import kopkar.gl.component.Frmgl_option;
import kopkar.gl.component.Frmposting_journal_entry;
import kopkar.gl.component.Frmproses_day_end_to_gl;
import kopkar.gl.component.Frmsetting_financial_rpt;
import kopkar.in.component.FrmFTSO01;
import kopkar.in.component.FrmFTSO02;
import kopkar.in.component.FrmKo_recal_simpanan_pinjaman;
import kopkar.in.component.FrmRMKK09;
import kopkar.in.component.FrmRMKK21;
import kopkar.in.component.Frmin_account_set;
import kopkar.in.component.Frmin_option;
import kopkar.in.component.Frmlabel_product;
import kopkar.in.component.Frmrp_warehouse;
import kopkar.ko.component.FrmRMKO03;
import kopkar.ko.component.FrmRMKO04;
import kopkar.ko.component.FrmRMKO05;
import kopkar.ko.component.FrmRMKO06;
import kopkar.ko.component.FrmRTKO02;
import kopkar.ko.component.FrmRTKO03;
import kopkar.ko.component.FrmRTKO04;
import kopkar.ko.component.FrmRTKO05;
import kopkar.ko.component.FrmRTKO06;
import kopkar.ko.component.FrmRTKO07;
import kopkar.ko.component.FrmRTKO08;
import kopkar.ko.component.FrmRTSP10;
import kopkar.ko.component.Frmko_account_set;
import kopkar.ko.component.Frmko_auto_persetujuan;
import kopkar.ko.component.Frmko_option;
import kopkar.ko.component.Frmko_pendidikan;
import kopkar.ko.component.Frmko_transaksi_bayar_toko;
import kopkar.ko.component.Frmko_transaksi_lembar_tagihan;
import kopkar.ko.component.Frmko_transaksi_setuju_rubah;
import kopkar.ko.component.Frmko_transaksi_tagihan;
import kopkar.ko.component.Frmko_transaksi_tagihan_new;
import kopkar.op.component.Frmop_bank;
import kopkar.report_files.component.Frmreport_category;
import kopkar.report_files.component.Frmreport_files;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;



/**
 *
 * @author  windu
 */
public class FrmMainFrame extends javax.swing.JFrame {
         
    boolean bactivate = false;
    /*Navigator eih*/
    NavigatorFormInt nfi;
    NavigatorFormReportInt nrfi;


    Action stopwatch = new AbstractAction(){
                                    public void actionPerformed(ActionEvent e) {
                                        jlblSystemDateTime.setText(GlobalUtils.showDateTime(0, "T"));
                                    }
                        };

 
    FrmLogin login;

    FrmCompany frmCompany=null;
    
    FrmMasteruser frmmasteruser=null;
    FrmMastergroup frmmastergroup=null;
    FrmMastermodule frmmastermodule=null;
    FrmGenerator frmGenerator=null;

    Frmap_supplier frmap_supplier=null;

    Frmar_customer frmar_customer=null;
    Frmin_product frmin_product=null;
    Frmin_brand frmin_brand=null;
    Frmap_purchase_order frmap_purchase_order=null;
    private MasterModuleExt mm;
    private Frmin_goods_receipt frmin_goods_receipt=null;
    private Frmin_goods_issue frmin_goods_issue;
    private Frmin_goods_transfer frmin_goods_transfer;
    private Frmap_purchase_receive frmap_purchase_receive;
    private Frmap_purchase_return frmap_purchase_return;
    private Frmar_sales_order frmar_sales_order;
    private Frmar_sales_delivery frmar_sales_delivery;
    private Frmar_sales_return frmar_sales_return;
    private Frmko_departemen frmko_departemen;
    private Frmko_jabatan frmko_jabatan;
    private Frmko_anggota frmko_anggota;
    private Frmko_pinjaman frmko_pinjaman;
    private Frmar_pos_sales frmar_pos_sales;
    private Frmin_category frmin_category;
    private Frmin_function frmin_function;
    private Frmin_price frmin_price;
    private Frmin_discount frmin_discount;
    private Frmin_measure frmin_measure;
    private Frmin_warehouse_type frmin_warehouse_type;
    private Frmin_warehouse frmin_warehouse;
    private Frmop_salesman frmop_salesman;
    private Frmop_payment_term frmop_payment_term;
    private Frmko_transaksi_registrasi frmko_transaksi_registrasi;
    private Frmko_transaksi_setor_simpanan frmko_transaksi_setor_simpanan;
    private Frmko_transaksi_tarik_simpanan frmko_transaksi_tarik_simpanan;
    private Frmko_transaksi_mohon frmko_transaksi_mohon;
    private Frmko_pinjaman_tipe frmko_pinjaman_tipe;
    private Frmko_transaksi_setuju frmko_transaksi_setuju;
    private Frmko_transaksi_bayar frmko_transaksi_bayar;
    private Frmko_Auto_Pot_Pinjaman frmko_Auto_Pot_Pinjaman;
    private Frmko_Auto_Pot_Simpanan frmko_Auto_Pot_Simpanan;
    private Frmin_so_sheet frmin_so_sheet;
    private Frmin_so_entry frmin_so_entry;
    private Frmrp_anggota frmrp_anggota;
    private Frmrp_warehouse frmrp_warehouse;
    private Frmrp_supplier frmrp_supplier;
    private Frmrp_salesman frmrp_salesman;
    private Frmrp_product frmrp_product;
    private Frmrp_price frmrp_price;
    private Frmrp_pinjaman_tipe frmrp_pinjaman_tipe;
    private Frmrp_pinjaman frmrp_pinjaman;
    private Frmrp_payment_term frmrp_payment_term;
    private Frmrp_measure frmrp_measure;
    private Frmrp_jabatan frmrp_jabatan;
    private Frmrp_function frmrp_function;
    private Frmrp_discount frmrp_discount;
    private Frmrp_departemen frmrp_departemen;
    private Frmrp_category frmrp_category;
    private Frmrp_customer frmrp_customer;
    private FrmRMKK09 frmrp_brand;
    private Frmrp_anggota_simpanan frmrp_anggota_simpanan;
    private Frmin_so_process frmin_so_process;
    private Frmin_product_price_info frmin_product_price_info;
    private Frmin_ProsesBulanan frmin_ProsesBulanan;
    private Frmrp_kartu_stok frmrp_kartu_stok;
    private Frmrp_mutasi_stok frmrp_mutasi_stok;
    private Frmrp_purchase_order frmrp_purchase_order;
    private Frmko_monthly_process frmko_monthly_process;
    private Frmrp_slip_anggota frmrp_slip_anggota;
    private Frmrp_potong_gaji frmrp_potong_gaji;
    private Frmrp_purchase_return frmrp_purchase_return;
    private Frmrp_purchase_receive frmrp_purchase_receive;
    private Frmrp_goods_transfer frmrp_goods_transfer;
    private Frmrp_goods_receipt frmrp_goods_receipt;
    private Frmrp_goods_issue frmrp_goods_issue;
    private Frmgl_group frmgl_group;
    private Frmgl_account frmgl_account;
    private Frmgl_group_data_entry frmgl_group_data_entry;
    private Frmgl_rab frmgl_rab;
    private Frmgl_sumber_data frmgl_sumber_data;
    private Frmgl_kalender frmgl_kalender;
    private Frmgl_transaksi_journal frmgl_transaksi_journal;
    private Frmgl_transaksi_rab frmgl_transaksi_rab;
    private Frmko_transaksi_cair_pinjaman frmko_transaksi_cair_pinjaman;
    private Frmko_transaksi_revisi_simpanan frmko_transaksi_revisi_simpanan;
    private Frmar_pos_return frmar_pos_return;
    private Frmar_pos_open frmar_pos_open;
    private Frmar_pos_close frmar_pos_close;
    private Frmar_pos_counter frmar_pos_counter;
    private Frmrp_mutasi_simpanan frmrp_mutasi_simpanan;
    private Frmrp_transaksi_mohon frmrp_transaksi_mohon;
    private Frmko_transaksi_tagihan frmko_transaksi_tagihan;
    private FrmRMKK03 frmRMKK03;
    private FrmRMKK04 frmRMKK04;
    private FrmRMKK05 frmRMKK05;
    private FrmRMKK06 frmRMKK06;
    private FrmRMKK08 frmRMKK08;
    private FrmRMKK21 frmRMKK21;
    private Frmap_account_set frmap_account_set;
    private Frmar_account_set frmar_account_set;
    private Frmin_account_set frmin_account_set;
    private Frmko_account_set frmko_account_set;
    private Frmko_option frmko_option;
    private Frmsetting_financial_rpt frmsetting_financial_rpt;
    private Frmproses_day_end_to_gl frmproses_day_end_to_gl;
    private Frmgl_option frmgl_option;
    private FrmRFKK02 frmRFKK02;
    private FrmRTKK03 frmRTKK03;
    private FrmRTKK01 frmRTKK01;
    private FrmRTKK02 frmRTKK02;
    private FrmRFKK01 frmRFKK01;
    private FrmRMKK07 frmRMKK07;
    private Frmposting_journal_entry frmposting_journal_entry;
    private FrmRTKK04 frmRTKK04;
    private Frmap_purchase_invoice frmap_purchase_invoice;
    private Frmap_purchase_dnote frmap_purchase_dnote;
    private Frmar_sales_invoice frmar_sales_invoice;
    private Frmar_sales_cnote frmar_sales_cnote;
    private Frmar_option frmar_option;
    private Frmap_option frmap_option;
    private Frmin_option frmin_option;
    private Frmar_pos_chasier frmar_pos_chasier;
    private Frmap_payment frmap_payment;
    private FrmRMKO03 frmRMKO03;
    private Frmar_pos_option frmar_pos_option;
    private FrmRTKO02 frmRTKO02;
    private FrmRTKO03 frmRTKO03;
    private FrmRTKO04 frmRTKO04;
    private FrmRTKO05 frmRTKO05;
    private FrmRTKO06 frmRTKO06;
    private FrmRTKO07 frmRTKO07;
    private FrmRMKO04 frmRMKO04;
    private FrmRMKO05 frmRMKO05;
    private FrmFMAS01 frmFMAS01;
    private Frmop_bank frmop_bank;
    private FrmFTSO02 frmFTSO02;
    private FrmFTSO01 frmFTSO01;
    private Frmko_transaksi_bayar_toko frmko_transaksi_bayar_toko;
    private Frmlabel_product frmlabel_product;
    private FrmRTKO08 frmRTKO08;
    private Frmko_auto_persetujuan frmko_auto_persetujuan;
    private Frmko_transaksi_setuju_rubah frmko_transaksi_setuju_rubah;
    private Frmko_util_import_toko frmko_util_import_toko;
    private FrmRTPS03 frmRTPS03;
    private Frmsetting_common_rpt frmsetting_common_rpt;
    private FrmRTSP10 frmRTSP10;
    private FrmFTPS0302 frmFTPS0302;
    private FrmRMKO06 frmRMKO06;
    private FrmKo_recal_simpanan_pinjaman frmKo_recal_simpanan_pinjaman;
    private Frmko_pendidikan frmko_pendidikan;
    private Frmko_transaksi_lembar_tagihan frmko_transaksi_lembar_tagihan;
    private Frmko_transaksi_tagihan_new frmko_transaksi_tagihan_new;
    private Frmrp_supplier_analisa frmrp_supplier_analisa;
    private FrmRTSC0101 frmRTSC0101;
    private Frmreport_files frmreport_files;
    private Frmreport_category frmreport_category;
    
    
    /** Creates new form MainFrame */
    public FrmMainFrame() {
        initComponents();
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(appsettinghandler.getbackground_image()))); // NOI18N
        setToolTip();
            
        Timer timer = new Timer(1000, stopwatch);
        timer.start();
        setToolBar(-1,0);


        setCursor(GlobalUtils.HOURGLASSCURSOR);
        login = new FrmLogin();
        setCursor(GlobalUtils.NORMALCURSOR);
   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnImpXls = new javax.swing.JButton();
        btnImpTxt = new javax.swing.JButton();
        btnExXls = new javax.swing.JButton();
        btnExTxt = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPrevScreen = new javax.swing.JButton();
        btnNextScreen = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLblUser = new javax.swing.JLabel();
        jLblWarning = new javax.swing.JLabel();
        jlblSystemDateTime = new javax.swing.JLabel();
        jMenuMain = new javax.swing.JMenuBar();
        jmnuParameter = new javax.swing.JMenu();
        jmniAktivitasUser = new javax.swing.JMenuItem();
        jmniMaintenaceUser = new javax.swing.JMenuItem();
        jmniResetPassword = new javax.swing.JMenuItem();
        jmniGroup = new javax.swing.JMenuItem();
        jmniModule = new javax.swing.JMenuItem();
        jmniMasterCompany = new javax.swing.JMenuItem();
        jmniGenerator = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jmniLogOut = new javax.swing.JMenuItem();
        jmniExit = new javax.swing.JMenuItem();
        jmnuMaster = new javax.swing.JMenu();
        jmnuMPembelian = new javax.swing.JMenu();
        jmniSupplier = new javax.swing.JMenuItem();
        jmniap_account_set = new javax.swing.JMenuItem();
        jmniap_option = new javax.swing.JMenuItem();
        jmnuMInventory = new javax.swing.JMenu();
        jmnuMProducts = new javax.swing.JMenu();
        jmniProductInfo = new javax.swing.JMenuItem();
        jmniProductPrice = new javax.swing.JMenuItem();
        jmnuBrand = new javax.swing.JMenuItem();
        jmniKategori = new javax.swing.JMenuItem();
        jmniFungsi = new javax.swing.JMenuItem();
        jmniPrice = new javax.swing.JMenuItem();
        jmniDiscount = new javax.swing.JMenuItem();
        jmniMeasure = new javax.swing.JMenuItem();
        jmniWarehouseType = new javax.swing.JMenuItem();
        jmniWarehouse = new javax.swing.JMenuItem();
        jmniin_account_set = new javax.swing.JMenuItem();
        jmniFrmIn_Option = new javax.swing.JMenuItem();
        jmnuMPenjualan = new javax.swing.JMenu();
        jmniCustomer = new javax.swing.JMenuItem();
        jmniFrmar_pos_counter = new javax.swing.JMenuItem();
        jmniar_account_set = new javax.swing.JMenuItem();
        jmniar_option = new javax.swing.JMenuItem();
        jmniar_pos_cashier = new javax.swing.JMenuItem();
        jmniar_pos_option = new javax.swing.JMenuItem();
        jmnuMOptional = new javax.swing.JMenu();
        jmniPaymentTerm = new javax.swing.JMenuItem();
        jmniSalesman = new javax.swing.JMenuItem();
        jmniBank = new javax.swing.JMenuItem();
        jmnuKoperasi = new javax.swing.JMenu();
        jmniDepartemen = new javax.swing.JMenuItem();
        jmniJabatan = new javax.swing.JMenuItem();
        jmniAnggota = new javax.swing.JMenuItem();
        jmniPinjaman = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmniko_account_set = new javax.swing.JMenuItem();
        jmniko_option = new javax.swing.JMenuItem();
        jmniko_pendidikan = new javax.swing.JMenuItem();
        jmnuTransaksi = new javax.swing.JMenu();
        jmnuTPembelian = new javax.swing.JMenu();
        jmniOrderPembelian = new javax.swing.JMenuItem();
        jmnipenerimaanpembelian = new javax.swing.JMenuItem();
        jmnuReturPembelian = new javax.swing.JMenuItem();
        jmniAPInvoice = new javax.swing.JMenuItem();
        jmniAPDebitNote = new javax.swing.JMenuItem();
        jmniAPPayment = new javax.swing.JMenuItem();
        jmnuTInventory = new javax.swing.JMenu();
        jmniTerimaLainLain = new javax.swing.JMenuItem();
        jmniKeluarLainlain = new javax.swing.JMenuItem();
        jmniTransferAntarGudang = new javax.swing.JMenuItem();
        jmniin_prosesbulanan = new javax.swing.JMenuItem();
        jmnuStockOpname = new javax.swing.JMenu();
        jmniLembarKerjaStockOpname = new javax.swing.JMenuItem();
        jmniEntriStockOpname = new javax.swing.JMenuItem();
        jmniFrmin_so_process = new javax.swing.JMenuItem();
        jmnuTPenjualan = new javax.swing.JMenu();
        jmniSalesOrder = new javax.swing.JMenuItem();
        jmniDelivery = new javax.swing.JMenuItem();
        jmniSalesReturn = new javax.swing.JMenuItem();
        jmniFrmar_invoice = new javax.swing.JMenuItem();
        jmniPOS = new javax.swing.JMenuItem();
        jmniFrmar_pos_return = new javax.swing.JMenuItem();
        jmniFrmar_pos_open = new javax.swing.JMenuItem();
        jmniFrmar_pos_close = new javax.swing.JMenuItem();
        jmniFrmar_cnote = new javax.swing.JMenuItem();
        jmnuSimpanPinjam = new javax.swing.JMenu();
        jmniFrmko_transaksi_registrasi = new javax.swing.JMenuItem();
        jmniSetor_Simpanan = new javax.swing.JMenuItem();
        jmniTarikSimpanan = new javax.swing.JMenuItem();
        jmniPermohonanPinjaman = new javax.swing.JMenuItem();
        jmniPersetujuanPinjaman = new javax.swing.JMenuItem();
        jmniPembayaranPinjaman = new javax.swing.JMenuItem();
        jmnuFrmko_transaksi_cair_pinjaman = new javax.swing.JMenuItem();
        jmnuko_Auto_Pot_Pinjaman = new javax.swing.JMenuItem();
        jmniko_Auto_Pot_Simpanan = new javax.swing.JMenuItem();
        jmniko_monthly_process = new javax.swing.JMenuItem();
        jmniFrmko_transaksi_revisi_simpanan = new javax.swing.JMenuItem();
        jmniFrmko_transaksi_tagihan = new javax.swing.JMenuItem();
        jmniFrmko_transaksi_tagihan_new = new javax.swing.JMenuItem();
        jmniFrmko_transaksi_lembar_tagihan = new javax.swing.JMenuItem();
        jmniFrmko_transaksi_bayar_toko = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmniFrmko_auto_persetujuan = new javax.swing.JMenuItem();
        jmniPersetujuanPinjamanRubah = new javax.swing.JMenuItem();
        jmniFrmko_util_import_toko = new javax.swing.JMenuItem();
        jmniFrmKo_recal_simpanan_pinjaman = new javax.swing.JMenuItem();
        jmnuAkunting = new javax.swing.JMenu();
        jmniFrmgl_group = new javax.swing.JMenuItem();
        jmniFrmgl_account = new javax.swing.JMenuItem();
        jmniFrmgl_group_data_entry = new javax.swing.JMenuItem();
        jmniFrmgl_rab = new javax.swing.JMenuItem();
        jmniFrmgl_sumber_data = new javax.swing.JMenuItem();
        jmniFrmgl_kalender = new javax.swing.JMenuItem();
        jmniFrmgl_transaksi_journal = new javax.swing.JMenuItem();
        jmniFrmgl_transaksi_rab = new javax.swing.JMenuItem();
        jmniFrmsetting_financial_rpt = new javax.swing.JMenuItem();
        jmniFrmproses_day_end_to_gl = new javax.swing.JMenuItem();
        jmniFrmgl_option = new javax.swing.JMenuItem();
        jmniFrmposting_journal_entry = new javax.swing.JMenuItem();
        jmnuReports = new javax.swing.JMenu();
        jmnuReport_Pembelian = new javax.swing.JMenu();
        jmnuRPAP_Master = new javax.swing.JMenu();
        jmnuFrmrp_supplier = new javax.swing.JMenuItem();
        jmnuFrmFMAS01 = new javax.swing.JMenuItem();
        jmnuFrmrp_supplier1 = new javax.swing.JMenuItem();
        jmnuRPAP_Transaksi = new javax.swing.JMenu();
        jmniFrmrp_kartu_stok = new javax.swing.JMenuItem();
        jmniFrmrp_purchase_order = new javax.swing.JMenuItem();
        jmniFrmrp_purchase_return = new javax.swing.JMenuItem();
        jmniFrmrp_purchase_receive = new javax.swing.JMenuItem();
        jmnuReport_Penjualan = new javax.swing.JMenu();
        jmnuRPJ_Master = new javax.swing.JMenu();
        jmniFrmrp_salesman = new javax.swing.JMenuItem();
        jmniFrmrp_customer = new javax.swing.JMenuItem();
        jmniFrmRMKK03 = new javax.swing.JMenuItem();
        jmniFrmRMKK04 = new javax.swing.JMenuItem();
        jmnuRP_J_Transaksi = new javax.swing.JMenu();
        jmniFrmRTPS03 = new javax.swing.JMenuItem();
        jmniFTPS0302 = new javax.swing.JMenuItem();
        jmniRTSC0101 = new javax.swing.JMenuItem();
        jmnuReport_Inventory = new javax.swing.JMenu();
        jmnuRI_Master = new javax.swing.JMenu();
        jmniFrmRMKK21 = new javax.swing.JMenuItem();
        jmniFrmrp_warehouse = new javax.swing.JMenuItem();
        jmniFrmrp_product = new javax.swing.JMenuItem();
        jmniFrmrp_price = new javax.swing.JMenuItem();
        jmniFrmrp_measure = new javax.swing.JMenuItem();
        jmniFrmrp_function = new javax.swing.JMenuItem();
        jmniFrmrp_discount = new javax.swing.JMenuItem();
        jmniFrmrp_category = new javax.swing.JMenuItem();
        jmniFrmrp_brand = new javax.swing.JMenuItem();
        jmniFrmlabel_product = new javax.swing.JMenuItem();
        jmnuRPIn_Transaksi = new javax.swing.JMenu();
        jmniFrmrp_mutasi_stok = new javax.swing.JMenuItem();
        jmniFrmrp_goods_transfer = new javax.swing.JMenuItem();
        jmniFrmrp_goods_receipt = new javax.swing.JMenuItem();
        jmniFrmrp_goods_issue = new javax.swing.JMenuItem();
        jmnuFTSO02 = new javax.swing.JMenuItem();
        jmnuFTSO01 = new javax.swing.JMenuItem();
        jmnuReport_Koperasi = new javax.swing.JMenu();
        jmnuRK_Master = new javax.swing.JMenu();
        jmniFrmrp_pinjaman_tipe = new javax.swing.JMenuItem();
        jmniFrmrp_pinjaman = new javax.swing.JMenuItem();
        jmniFrmrp_jabatan = new javax.swing.JMenuItem();
        jmniFrmrp_departemen = new javax.swing.JMenuItem();
        jmniFrmrp_anggota = new javax.swing.JMenuItem();
        jmniFrmrp_anggota_simpanan = new javax.swing.JMenuItem();
        jmniFrmRMKO01 = new javax.swing.JMenuItem();
        jmniFrmrp_slip_anggota = new javax.swing.JMenuItem();
        jmniFrmrp_potong_gaji = new javax.swing.JMenuItem();
        jmniFrmrp_mutasi_simpanan = new javax.swing.JMenuItem();
        jmniFrmrp_transaksi_mohon = new javax.swing.JMenuItem();
        jmniFrmRMKO03 = new javax.swing.JMenuItem();
        jmniFrmRTKO02 = new javax.swing.JMenuItem();
        jmniFrmRTKO03 = new javax.swing.JMenuItem();
        jmniFrmRTKO04 = new javax.swing.JMenuItem();
        jmniFrmRTKO05 = new javax.swing.JMenuItem();
        jmniFrmRTKO06 = new javax.swing.JMenuItem();
        jmniFrmRTKO07 = new javax.swing.JMenuItem();
        jmniFrmRMKO04 = new javax.swing.JMenuItem();
        jmniFrmRMKO05 = new javax.swing.JMenuItem();
        jmniFrmRTKO08 = new javax.swing.JMenuItem();
        jmniFrmRTSP10 = new javax.swing.JMenuItem();
        jmniFrmRMKO6 = new javax.swing.JMenuItem();
        jmnuReport_Option = new javax.swing.JMenu();
        jmniFrmrp_payment_term = new javax.swing.JMenuItem();
        jmnuReport_Akunting = new javax.swing.JMenu();
        jmnuRA_Master = new javax.swing.JMenu();
        jmniFrmRMKK05 = new javax.swing.JMenuItem();
        jmniFrmRMKK06 = new javax.swing.JMenuItem();
        jmniFrmRMKK07 = new javax.swing.JMenuItem();
        jmniFrmRMKK08 = new javax.swing.JMenuItem();
        jmnuRA_Transaksi = new javax.swing.JMenu();
        jmniFrmRTKK01 = new javax.swing.JMenuItem();
        jmniFrmRTKK02 = new javax.swing.JMenuItem();
        jmnuRA_FinancialReport = new javax.swing.JMenu();
        jmniFrmRTKK03 = new javax.swing.JMenuItem();
        jmniFrmRTKK04 = new javax.swing.JMenuItem();
        jmniFrmRFKK02 = new javax.swing.JMenuItem();
        jmniFrmRFKK01 = new javax.swing.JMenuItem();
        jmnuReport_Common = new javax.swing.JMenu();
        jmniFrmsetting_common_rpt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KOPKAR V.1.0.2");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_newfile.gif"))); // NOI18N
        btnNew.setMnemonic('n');
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNew);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_save.gif"))); // NOI18N
        btnSave.setMnemonic('s');
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSave);

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_undo.gif"))); // NOI18N
        btnUndo.setMnemonic('u');
        btnUndo.setToolTipText("Undo");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUndo);

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_del.gif"))); // NOI18N
        btnDel.setMnemonic('d');
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDel);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btnPrint.setMnemonic('p');
        btnPrint.setFocusable(false);
        btnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPrint);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_move_first.gif"))); // NOI18N
        btnFirst.setMnemonic('q');
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_move_prev.gif"))); // NOI18N
        btnPrev.setMnemonic('w');
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPrev);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_move_next.gif"))); // NOI18N
        btnNext.setMnemonic('e');
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_move_last.gif"))); // NOI18N
        btnLast.setMnemonic('r');
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLast);

        btnImpXls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_export_toexcel.gif"))); // NOI18N
        btnImpXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpXlsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImpXls);

        btnImpTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_export_to_txt.gif"))); // NOI18N
        btnImpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpTxtActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImpTxt);

        btnExXls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_import_fr_excel.gif"))); // NOI18N
        btnExXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExXlsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExXls);

        btnExTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_import_fr_txt.gif"))); // NOI18N
        btnExTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExTxtActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExTxt);

        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PNG-Symbol-Check.png-256x256.png"))); // NOI18N
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConfirm);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_close.gif"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnClose);

        btnPrevScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_prev_screen.gif"))); // NOI18N
        btnPrevScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevScreenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPrevScreen);

        btnNextScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_next_screen.gif"))); // NOI18N
        btnNextScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextScreenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNextScreen);

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_help.gif"))); // NOI18N
        btnHelp.setPreferredSize(new java.awt.Dimension(30, 32));
        jToolBar1.add(btnHelp);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/layout-aplikasi-accounting.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1010, 770);

        jLblUser.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLblUser.setText("Loged User Name");

        jLblWarning.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblWarning.setForeground(new java.awt.Color(255, 51, 102));
        jLblWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlblSystemDateTime.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblSystemDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblSystemDateTime.setText("System Date Time ");

        jmnuParameter.setMnemonic('O');
        jmnuParameter.setText("Parameter");
        jmnuParameter.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniAktivitasUser.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniAktivitasUser.setText("Aktivitas User");
        jmniAktivitasUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAktivitasUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniAktivitasUser);

        jmniMaintenaceUser.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniMaintenaceUser.setText("Maintenace User");
        jmniMaintenaceUser.setName("FrmMasteruser"); // NOI18N
        jmniMaintenaceUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMaintenaceUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMaintenaceUser);

        jmniResetPassword.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniResetPassword.setText("Reset Password");
        jmniResetPassword.setName("Reset Password"); // NOI18N
        jmniResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniResetPasswordActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniResetPassword);

        jmniGroup.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniGroup.setText("Group");
        jmniGroup.setName("FrmMastergroup"); // NOI18N
        jmniGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGroupActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGroup);

        jmniModule.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniModule.setText("Module");
        jmniModule.setName("FrmMastermodule"); // NOI18N
        jmniModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniModuleActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniModule);

        jmniMasterCompany.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniMasterCompany.setText("Company");
        jmniMasterCompany.setName("FrmMasterCompany"); // NOI18N
        jmniMasterCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMasterCompanyActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMasterCompany);

        jmniGenerator.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniGenerator.setText("Generator");
        jmniGenerator.setName("FrmGenerator"); // NOI18N
        jmniGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGeneratorActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGenerator);

        jMenu1.setText("Report");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jMenuItem14.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jMenuItem14.setText("Setting Parameter Program ");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jMenuItem15.setText("Repoort Files");
        jMenuItem15.setName("report_files"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jMenuItem16.setText("Report Category");
        jMenuItem16.setName("report_category"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jmnuParameter.add(jMenu1);

        jmniLogOut.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniLogOut.setText("Log Out");
        jmniLogOut.setName("LogOut"); // NOI18N
        jmniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniLogOutActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniLogOut);

        jmniExit.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniExit.setText("Exit");
        jmniExit.setName("Exit"); // NOI18N
        jmniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniExitActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniExit);

        jMenuMain.add(jmnuParameter);

        jmnuMaster.setText("Master");
        jmnuMaster.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuMPembelian.setText("Pembelian");
        jmnuMPembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniSupplier.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniSupplier.setText("Supplier");
        jmniSupplier.setName("frmap_supplier"); // NOI18N
        jmniSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSupplierActionPerformed(evt);
            }
        });
        jmnuMPembelian.add(jmniSupplier);

        jmniap_account_set.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniap_account_set.setText("AP Account Set");
        jmniap_account_set.setName("frmap_account_set"); // NOI18N
        jmniap_account_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniap_account_setActionPerformed(evt);
            }
        });
        jmnuMPembelian.add(jmniap_account_set);

        jmniap_option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniap_option.setText("AP Option");
        jmniap_option.setName("frmap_option"); // NOI18N
        jmniap_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniap_optionActionPerformed(evt);
            }
        });
        jmnuMPembelian.add(jmniap_option);

        jmnuMaster.add(jmnuMPembelian);

        jmnuMInventory.setText("Inventory");
        jmnuMInventory.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuMProducts.setText("Product");
        jmnuMProducts.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniProductInfo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniProductInfo.setText("Product Info");
        jmniProductInfo.setName("Frmin_product"); // NOI18N
        jmniProductInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniProductInfoActionPerformed(evt);
            }
        });
        jmnuMProducts.add(jmniProductInfo);

        jmniProductPrice.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniProductPrice.setText("Product Price");
        jmniProductPrice.setName("Frmin_product_price_info"); // NOI18N
        jmniProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniProductPriceActionPerformed(evt);
            }
        });
        jmnuMProducts.add(jmniProductPrice);

        jmnuMInventory.add(jmnuMProducts);

        jmnuBrand.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuBrand.setText("Brand");
        jmnuBrand.setName("Frmin_brand"); // NOI18N
        jmnuBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBrandActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmnuBrand);

        jmniKategori.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniKategori.setText("Kategori");
        jmniKategori.setName("Frmin_category"); // NOI18N
        jmniKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniKategoriActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniKategori);

        jmniFungsi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFungsi.setText("Fungsi");
        jmniFungsi.setName("Frmin_function"); // NOI18N
        jmniFungsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFungsiActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniFungsi);

        jmniPrice.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPrice.setText("Price");
        jmniPrice.setName("Frmin_price"); // NOI18N
        jmniPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPriceActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniPrice);

        jmniDiscount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniDiscount.setText("Discount");
        jmniDiscount.setName("Frmin_discount"); // NOI18N
        jmniDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDiscountActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniDiscount);

        jmniMeasure.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniMeasure.setText("Measure");
        jmniMeasure.setName("Frmin_measure"); // NOI18N
        jmniMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMeasureActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniMeasure);

        jmniWarehouseType.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniWarehouseType.setText("Warehouse Type");
        jmniWarehouseType.setName("Frmin_warehouse_type"); // NOI18N
        jmniWarehouseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniWarehouseTypeActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniWarehouseType);

        jmniWarehouse.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniWarehouse.setText("Warehouse");
        jmniWarehouse.setName("Frmin_warehouse"); // NOI18N
        jmniWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniWarehouseActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniWarehouse);

        jmniin_account_set.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniin_account_set.setText("Inventory Account Set");
        jmniin_account_set.setName("frmin_account_set"); // NOI18N
        jmniin_account_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniin_account_setActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniin_account_set);

        jmniFrmIn_Option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmIn_Option.setText("Inventory Option");
        jmniFrmIn_Option.setName("Frmin_option"); // NOI18N
        jmniFrmIn_Option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmIn_OptionActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniFrmIn_Option);

        jmnuMaster.add(jmnuMInventory);

        jmnuMPenjualan.setText("Penjualan");
        jmnuMPenjualan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniCustomer.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniCustomer.setText("Customer");
        jmniCustomer.setName("Frmar_customer"); // NOI18N
        jmniCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniCustomerActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniCustomer);

        jmniFrmar_pos_counter.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_pos_counter.setText("Master Loket");
        jmniFrmar_pos_counter.setName("Frmar_pos_counter"); // NOI18N
        jmniFrmar_pos_counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_pos_counterActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniFrmar_pos_counter);

        jmniar_account_set.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniar_account_set.setText("AR Account Set");
        jmniar_account_set.setName("frmar_account_set"); // NOI18N
        jmniar_account_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniar_account_setActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniar_account_set);

        jmniar_option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniar_option.setText("AR Option");
        jmniar_option.setName("frmar_option"); // NOI18N
        jmniar_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniar_optionActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniar_option);

        jmniar_pos_cashier.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniar_pos_cashier.setText("Master Kasir");
        jmniar_pos_cashier.setName("Frmar_pos_chasier"); // NOI18N
        jmniar_pos_cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniar_pos_cashierActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniar_pos_cashier);

        jmniar_pos_option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniar_pos_option.setText("AR POS Option");
        jmniar_pos_option.setName("frmar_pos_option"); // NOI18N
        jmniar_pos_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniar_pos_optionActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniar_pos_option);

        jmnuMaster.add(jmnuMPenjualan);

        jmnuMOptional.setText("Optional");
        jmnuMOptional.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniPaymentTerm.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPaymentTerm.setText("Payment Term");
        jmniPaymentTerm.setName("op_payment_term"); // NOI18N
        jmniPaymentTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPaymentTermActionPerformed(evt);
            }
        });
        jmnuMOptional.add(jmniPaymentTerm);

        jmniSalesman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniSalesman.setText("Salesman");
        jmniSalesman.setName("op_salesman"); // NOI18N
        jmniSalesman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesmanActionPerformed(evt);
            }
        });
        jmnuMOptional.add(jmniSalesman);

        jmniBank.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniBank.setText("Bank");
        jmniBank.setName("op_bank"); // NOI18N
        jmniBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniBankActionPerformed(evt);
            }
        });
        jmnuMOptional.add(jmniBank);

        jmnuMaster.add(jmnuMOptional);

        jmnuKoperasi.setText("Koperasi");
        jmnuKoperasi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniDepartemen.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniDepartemen.setText("Departemen");
        jmniDepartemen.setName("Frmko_departemen"); // NOI18N
        jmniDepartemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDepartemenActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniDepartemen);

        jmniJabatan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniJabatan.setText("Jabatan");
        jmniJabatan.setName("Frmko_jabatan"); // NOI18N
        jmniJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniJabatanActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniJabatan);

        jmniAnggota.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniAnggota.setText("Anggota");
        jmniAnggota.setName("Frmko_anggota"); // NOI18N
        jmniAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAnggotaActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniAnggota);

        jmniPinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPinjaman.setText("Pinjaman");
        jmniPinjaman.setName("Frmko_pinjaman"); // NOI18N
        jmniPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPinjamanActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniPinjaman);

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jMenuItem1.setText("Tipe Pinjaman");
        jMenuItem1.setName("Frmko_pinjaman_tipe"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jMenuItem1);

        jmniko_account_set.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniko_account_set.setText("Koperasi Account Set");
        jmniko_account_set.setName("frmko_account_set"); // NOI18N
        jmniko_account_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_account_setActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniko_account_set);

        jmniko_option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniko_option.setText("Option Koperasi");
        jmniko_option.setName("frmko_option"); // NOI18N
        jmniko_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_optionActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniko_option);

        jmniko_pendidikan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniko_pendidikan.setText("Pendidikan");
        jmniko_pendidikan.setName("frmko_pendidikan"); // NOI18N
        jmniko_pendidikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_pendidikanActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniko_pendidikan);

        jmnuMaster.add(jmnuKoperasi);

        jMenuMain.add(jmnuMaster);

        jmnuTransaksi.setText("Transaksi");
        jmnuTransaksi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuTPembelian.setText("Pembelian");
        jmnuTPembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniOrderPembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniOrderPembelian.setText("Order Pembelian");
        jmniOrderPembelian.setName("Frmap_purchase_order"); // NOI18N
        jmniOrderPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniOrderPembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmniOrderPembelian);

        jmnipenerimaanpembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnipenerimaanpembelian.setText("Penerimaan Pembelian");
        jmnipenerimaanpembelian.setName("Frmap_purchase_receive"); // NOI18N
        jmnipenerimaanpembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnipenerimaanpembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmnipenerimaanpembelian);

        jmnuReturPembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuReturPembelian.setText("Retur Pembelian");
        jmnuReturPembelian.setName("Frmap_purchase_return"); // NOI18N
        jmnuReturPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuReturPembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmnuReturPembelian);

        jmniAPInvoice.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniAPInvoice.setText("AP Invoice");
        jmniAPInvoice.setName("Frmap_purchase_invoice"); // NOI18N
        jmniAPInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAPInvoiceActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmniAPInvoice);

        jmniAPDebitNote.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniAPDebitNote.setText("AP Debit Note");
        jmniAPDebitNote.setName("Frmap_purchase_dnote"); // NOI18N
        jmniAPDebitNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAPDebitNoteActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmniAPDebitNote);

        jmniAPPayment.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniAPPayment.setText("AP Payment");
        jmniAPPayment.setName("Frmap_payment"); // NOI18N
        jmniAPPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAPPaymentActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmniAPPayment);

        jmnuTransaksi.add(jmnuTPembelian);

        jmnuTInventory.setText("Inventory");
        jmnuTInventory.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniTerimaLainLain.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniTerimaLainLain.setText("Terima Lain-lain");
        jmniTerimaLainLain.setName("Frmin_goods_receipt"); // NOI18N
        jmniTerimaLainLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTerimaLainLainActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniTerimaLainLain);

        jmniKeluarLainlain.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniKeluarLainlain.setText("Keluar Lain-lain");
        jmniKeluarLainlain.setName("Frmin_goods_issue"); // NOI18N
        jmniKeluarLainlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniKeluarLainlainActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniKeluarLainlain);

        jmniTransferAntarGudang.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniTransferAntarGudang.setText("Transfer Antar Gudang");
        jmniTransferAntarGudang.setName("Frmin_goods_transfer"); // NOI18N
        jmniTransferAntarGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTransferAntarGudangActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniTransferAntarGudang);

        jmniin_prosesbulanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniin_prosesbulanan.setText("Proses Bulanan");
        jmniin_prosesbulanan.setName("Frmin_ProsesBulanan"); // NOI18N
        jmniin_prosesbulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniin_prosesbulananActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniin_prosesbulanan);

        jmnuStockOpname.setText("Stock Opname");
        jmnuStockOpname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuStockOpname.setName("StockOpname"); // NOI18N

        jmniLembarKerjaStockOpname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniLembarKerjaStockOpname.setText("Lembar Kerja Stock Opname");
        jmniLembarKerjaStockOpname.setName("Frmin_so_sheet"); // NOI18N
        jmniLembarKerjaStockOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniLembarKerjaStockOpnameActionPerformed(evt);
            }
        });
        jmnuStockOpname.add(jmniLembarKerjaStockOpname);

        jmniEntriStockOpname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniEntriStockOpname.setText("Entri Stock Opname");
        jmniEntriStockOpname.setName("Frmin_so_entry"); // NOI18N
        jmniEntriStockOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEntriStockOpnameActionPerformed(evt);
            }
        });
        jmnuStockOpname.add(jmniEntriStockOpname);

        jmniFrmin_so_process.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmin_so_process.setText("Prosess Adjustment Stok Opname");
        jmniFrmin_so_process.setName("Frmin_so_process"); // NOI18N
        jmniFrmin_so_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmin_so_processActionPerformed(evt);
            }
        });
        jmnuStockOpname.add(jmniFrmin_so_process);

        jmnuTInventory.add(jmnuStockOpname);

        jmnuTransaksi.add(jmnuTInventory);

        jmnuTPenjualan.setText("Penjualan");
        jmnuTPenjualan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniSalesOrder.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniSalesOrder.setText("Sales Order");
        jmniSalesOrder.setName("Frmar_sales_order"); // NOI18N
        jmniSalesOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesOrderActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniSalesOrder);

        jmniDelivery.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniDelivery.setText("Delivery");
        jmniDelivery.setName("Frmar_sales_delivery"); // NOI18N
        jmniDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDeliveryActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniDelivery);

        jmniSalesReturn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniSalesReturn.setText("Sales Return");
        jmniSalesReturn.setName("Frmar_sales_return"); // NOI18N
        jmniSalesReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesReturnActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniSalesReturn);

        jmniFrmar_invoice.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_invoice.setText("AR Invoice");
        jmniFrmar_invoice.setName("Frmar_sales_invoice"); // NOI18N
        jmniFrmar_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_invoiceActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniFrmar_invoice);

        jmniPOS.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPOS.setText("Point Of Sales");
        jmniPOS.setName("Frmar_pos_sales"); // NOI18N
        jmniPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPOSActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniPOS);

        jmniFrmar_pos_return.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_pos_return.setText("POS Return");
        jmniFrmar_pos_return.setName("Frmar_pos_return"); // NOI18N
        jmniFrmar_pos_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_pos_returnActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniFrmar_pos_return);

        jmniFrmar_pos_open.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_pos_open.setText("Open Point Of Sales");
        jmniFrmar_pos_open.setName("Frmar_pos_open"); // NOI18N
        jmniFrmar_pos_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_pos_openActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniFrmar_pos_open);

        jmniFrmar_pos_close.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_pos_close.setText("Close Point of Sales Process");
        jmniFrmar_pos_close.setName("Frmar_pos_close"); // NOI18N
        jmniFrmar_pos_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_pos_closeActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniFrmar_pos_close);

        jmniFrmar_cnote.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmar_cnote.setText("AR Credit Note");
        jmniFrmar_cnote.setName("Frmar_sales_cnote"); // NOI18N
        jmniFrmar_cnote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmar_cnoteActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniFrmar_cnote);

        jmnuTransaksi.add(jmnuTPenjualan);

        jMenuMain.add(jmnuTransaksi);

        jmnuSimpanPinjam.setText("Simpan Pinjam");
        jmnuSimpanPinjam.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmko_transaksi_registrasi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_registrasi.setText("Registrasi Anggota");
        jmniFrmko_transaksi_registrasi.setName("Frmko_transaksi_registrasi"); // NOI18N
        jmniFrmko_transaksi_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_registrasiActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_registrasi);

        jmniSetor_Simpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniSetor_Simpanan.setText("Setor Simpanan");
        jmniSetor_Simpanan.setName("Frmko_transaksi_setor_simpanan"); // NOI18N
        jmniSetor_Simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSetor_SimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniSetor_Simpanan);

        jmniTarikSimpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniTarikSimpanan.setText("Tarik Simpanan");
        jmniTarikSimpanan.setName("Frmko_transaksi_tarik_simpanan"); // NOI18N
        jmniTarikSimpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTarikSimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniTarikSimpanan);

        jmniPermohonanPinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPermohonanPinjaman.setText("Permohonan Pinjaman");
        jmniPermohonanPinjaman.setName("Frmko_transaksi_mohon"); // NOI18N
        jmniPermohonanPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPermohonanPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPermohonanPinjaman);

        jmniPersetujuanPinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPersetujuanPinjaman.setText("Persetujuan Pinjaman");
        jmniPersetujuanPinjaman.setName("Frmko_transaksi_setuju"); // NOI18N
        jmniPersetujuanPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPersetujuanPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPersetujuanPinjaman);

        jmniPembayaranPinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPembayaranPinjaman.setText("Pembayaran/Pelunasan Pinjaman");
        jmniPembayaranPinjaman.setName("Frmko_transaksi_bayar"); // NOI18N
        jmniPembayaranPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPembayaranPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPembayaranPinjaman);

        jmnuFrmko_transaksi_cair_pinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFrmko_transaksi_cair_pinjaman.setText("Pencairan Pinjaman");
        jmnuFrmko_transaksi_cair_pinjaman.setName("Frmko_transaksi_cair_pinjaman"); // NOI18N
        jmnuFrmko_transaksi_cair_pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFrmko_transaksi_cair_pinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmnuFrmko_transaksi_cair_pinjaman);

        jmnuko_Auto_Pot_Pinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuko_Auto_Pot_Pinjaman.setText("Proses Otomatis Potongan Pinjaman");
        jmnuko_Auto_Pot_Pinjaman.setName("Frmko_Auto_Pot_Pinjaman"); // NOI18N
        jmnuko_Auto_Pot_Pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuko_Auto_Pot_PinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmnuko_Auto_Pot_Pinjaman);

        jmniko_Auto_Pot_Simpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniko_Auto_Pot_Simpanan.setText("Proses Otomatis Potongan Simpanan");
        jmniko_Auto_Pot_Simpanan.setName("Frmko_Auto_Pot_Simpanan"); // NOI18N
        jmniko_Auto_Pot_Simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_Auto_Pot_SimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniko_Auto_Pot_Simpanan);

        jmniko_monthly_process.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniko_monthly_process.setText("Proses Tagihan Potongan Simpanan dan Pinjaman");
        jmniko_monthly_process.setName("Frmko_monthly_process"); // NOI18N
        jmniko_monthly_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_monthly_processActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniko_monthly_process);

        jmniFrmko_transaksi_revisi_simpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_revisi_simpanan.setText("Revisi Potongan Simpanan");
        jmniFrmko_transaksi_revisi_simpanan.setName("Frmko_transaksi_revisi_simpanan"); // NOI18N
        jmniFrmko_transaksi_revisi_simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_revisi_simpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_revisi_simpanan);

        jmniFrmko_transaksi_tagihan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_tagihan.setText("Penerimaan Tagihan");
        jmniFrmko_transaksi_tagihan.setName("Frmko_transaksi_tagihan"); // NOI18N
        jmniFrmko_transaksi_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_tagihanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_tagihan);

        jmniFrmko_transaksi_tagihan_new.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_tagihan_new.setText("Penerimaan Tagihan New");
        jmniFrmko_transaksi_tagihan_new.setName("Frmko_transaksi_tagihan_new"); // NOI18N
        jmniFrmko_transaksi_tagihan_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_tagihan_newActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_tagihan_new);

        jmniFrmko_transaksi_lembar_tagihan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_lembar_tagihan.setText("Lembar Tagihan");
        jmniFrmko_transaksi_lembar_tagihan.setName("Frmko_transaksi_lembar_tagihan"); // NOI18N
        jmniFrmko_transaksi_lembar_tagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_lembar_tagihanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_lembar_tagihan);

        jmniFrmko_transaksi_bayar_toko.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_transaksi_bayar_toko.setText("Pelunasan Tagihan Toko");
        jmniFrmko_transaksi_bayar_toko.setName("Frmko_transaksi_bayar_toko"); // NOI18N
        jmniFrmko_transaksi_bayar_toko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_bayar_tokoActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_bayar_toko);
        jmnuSimpanPinjam.add(jSeparator1);

        jmniFrmko_auto_persetujuan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_auto_persetujuan.setText("Proses Persetujuan Permohonan");
        jmniFrmko_auto_persetujuan.setName("Frmko_auto_persetujuan"); // NOI18N
        jmniFrmko_auto_persetujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_auto_persetujuanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_auto_persetujuan);

        jmniPersetujuanPinjamanRubah.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniPersetujuanPinjamanRubah.setText("Perubahan Persetujuan Pinjaman");
        jmniPersetujuanPinjamanRubah.setName("Frmko_transaksi_setuju_rubah"); // NOI18N
        jmniPersetujuanPinjamanRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPersetujuanPinjamanRubahActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPersetujuanPinjamanRubah);

        jmniFrmko_util_import_toko.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmko_util_import_toko.setText("Import Saldo Pinjaman Toko");
        jmniFrmko_util_import_toko.setName("Frmko_util_import_toko"); // NOI18N
        jmniFrmko_util_import_toko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_util_import_tokoActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_util_import_toko);

        jmniFrmKo_recal_simpanan_pinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmKo_recal_simpanan_pinjaman.setText("Recalculate Simpanan Pinjaman Anggota");
        jmniFrmKo_recal_simpanan_pinjaman.setName("FrmKo_recal_simpanan_pinjaman"); // NOI18N
        jmniFrmKo_recal_simpanan_pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmKo_recal_simpanan_pinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmKo_recal_simpanan_pinjaman);

        jMenuMain.add(jmnuSimpanPinjam);

        jmnuAkunting.setText("Akunting");
        jmnuAkunting.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmgl_group.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_group.setText("Master Group Akun");
        jmniFrmgl_group.setName("Frmgl_group"); // NOI18N
        jmniFrmgl_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_groupActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_group);

        jmniFrmgl_account.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_account.setText("Master Akun");
        jmniFrmgl_account.setName("Frmgl_account"); // NOI18N
        jmniFrmgl_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_accountActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_account);

        jmniFrmgl_group_data_entry.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_group_data_entry.setText("Master Group Data Entry");
        jmniFrmgl_group_data_entry.setName("Frmgl_group_data_entry"); // NOI18N
        jmniFrmgl_group_data_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_group_data_entryActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_group_data_entry);

        jmniFrmgl_rab.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_rab.setText("Master RAB");
        jmniFrmgl_rab.setName("Frmgl_rab"); // NOI18N
        jmniFrmgl_rab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_rabActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_rab);

        jmniFrmgl_sumber_data.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_sumber_data.setText("Master Asal Data");
        jmniFrmgl_sumber_data.setName("Frmgl_sumber_data"); // NOI18N
        jmniFrmgl_sumber_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_sumber_dataActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_sumber_data);

        jmniFrmgl_kalender.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_kalender.setText("Master Kalender");
        jmniFrmgl_kalender.setName("Frmgl_kalender"); // NOI18N
        jmniFrmgl_kalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_kalenderActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_kalender);

        jmniFrmgl_transaksi_journal.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_transaksi_journal.setText("Jurnal Entry");
        jmniFrmgl_transaksi_journal.setName("Frmgl_transaksi_journal"); // NOI18N
        jmniFrmgl_transaksi_journal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_transaksi_journalActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_transaksi_journal);

        jmniFrmgl_transaksi_rab.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_transaksi_rab.setText("Entry RAB");
        jmniFrmgl_transaksi_rab.setName("Frmgl_transaksi_rab"); // NOI18N
        jmniFrmgl_transaksi_rab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_transaksi_rabActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_transaksi_rab);

        jmniFrmsetting_financial_rpt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmsetting_financial_rpt.setText("Setting Financial Report");
        jmniFrmsetting_financial_rpt.setName("Frmsetting_financial_rpt"); // NOI18N
        jmniFrmsetting_financial_rpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmsetting_financial_rptActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmsetting_financial_rpt);

        jmniFrmproses_day_end_to_gl.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmproses_day_end_to_gl.setText("Day End Process");
        jmniFrmproses_day_end_to_gl.setName("Frmproses_day_end_to_gl"); // NOI18N
        jmniFrmproses_day_end_to_gl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmproses_day_end_to_glActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmproses_day_end_to_gl);

        jmniFrmgl_option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmgl_option.setText("GL Option");
        jmniFrmgl_option.setName("Frmgl_option"); // NOI18N
        jmniFrmgl_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmgl_optionActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmgl_option);

        jmniFrmposting_journal_entry.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmposting_journal_entry.setText("Posting Journal Entry");
        jmniFrmposting_journal_entry.setName("Frmposting_journal_entry"); // NOI18N
        jmniFrmposting_journal_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmposting_journal_entryActionPerformed(evt);
            }
        });
        jmnuAkunting.add(jmniFrmposting_journal_entry);

        jMenuMain.add(jmnuAkunting);

        jmnuReports.setText("Report");
        jmnuReports.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuReport_Pembelian.setText("Pembelian");
        jmnuReport_Pembelian.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuRPAP_Master.setText("Master");
        jmnuRPAP_Master.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuFrmrp_supplier.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFrmrp_supplier.setText("Daftar Supplier");
        jmnuFrmrp_supplier.setName("Frmrp_supplier"); // NOI18N
        jmnuFrmrp_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFrmrp_supplierActionPerformed(evt);
            }
        });
        jmnuRPAP_Master.add(jmnuFrmrp_supplier);

        jmnuFrmFMAS01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFrmFMAS01.setText("AP Account Set");
        jmnuFrmFMAS01.setName("Frmrp_supplier"); // NOI18N
        jmnuFrmFMAS01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFrmFMAS01ActionPerformed(evt);
            }
        });
        jmnuRPAP_Master.add(jmnuFrmFMAS01);

        jmnuFrmrp_supplier1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFrmrp_supplier1.setText("Daftar Supplier Analisa");
        jmnuFrmrp_supplier1.setName("Frmrp_supplier_analisa"); // NOI18N
        jmnuFrmrp_supplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFrmrp_supplier1ActionPerformed(evt);
            }
        });
        jmnuRPAP_Master.add(jmnuFrmrp_supplier1);

        jmnuReport_Pembelian.add(jmnuRPAP_Master);

        jmnuRPAP_Transaksi.setText("Transaksi");
        jmnuRPAP_Transaksi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmrp_kartu_stok.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_kartu_stok.setText("Cetak Kartu Stok");
        jmniFrmrp_kartu_stok.setName("Frmrp_kartu_stok"); // NOI18N
        jmniFrmrp_kartu_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_kartu_stokActionPerformed(evt);
            }
        });
        jmnuRPAP_Transaksi.add(jmniFrmrp_kartu_stok);

        jmniFrmrp_purchase_order.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_purchase_order.setText("Laporan Permintaan Pembelian");
        jmniFrmrp_purchase_order.setName("Frmrp_purchase_order"); // NOI18N
        jmniFrmrp_purchase_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_purchase_orderActionPerformed(evt);
            }
        });
        jmnuRPAP_Transaksi.add(jmniFrmrp_purchase_order);

        jmniFrmrp_purchase_return.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_purchase_return.setText("Laporan Pengembalian Pembelian");
        jmniFrmrp_purchase_return.setName("Frmrp_purchase_return"); // NOI18N
        jmniFrmrp_purchase_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_purchase_returnActionPerformed(evt);
            }
        });
        jmnuRPAP_Transaksi.add(jmniFrmrp_purchase_return);

        jmniFrmrp_purchase_receive.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_purchase_receive.setText("Laporan Penerimaan Pembelian");
        jmniFrmrp_purchase_receive.setName("Frmrp_purchase_receive"); // NOI18N
        jmniFrmrp_purchase_receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_purchase_receiveActionPerformed(evt);
            }
        });
        jmnuRPAP_Transaksi.add(jmniFrmrp_purchase_receive);

        jmnuReport_Pembelian.add(jmnuRPAP_Transaksi);

        jmnuReports.add(jmnuReport_Pembelian);

        jmnuReport_Penjualan.setText("Penjualan");
        jmnuReport_Penjualan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuRPJ_Master.setText("Master");
        jmnuRPJ_Master.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmrp_salesman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_salesman.setText("Daftar Salesman");
        jmniFrmrp_salesman.setName("Frmrp_salesman"); // NOI18N
        jmniFrmrp_salesman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_salesmanActionPerformed(evt);
            }
        });
        jmnuRPJ_Master.add(jmniFrmrp_salesman);

        jmniFrmrp_customer.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_customer.setText("Daftar Pelanggan");
        jmniFrmrp_customer.setName("Frmrp_customer"); // NOI18N
        jmniFrmrp_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_customerActionPerformed(evt);
            }
        });
        jmnuRPJ_Master.add(jmniFrmrp_customer);

        jmniFrmRMKK03.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK03.setText("Daftar Kasir");
        jmniFrmRMKK03.setName("Frmrp_customer"); // NOI18N
        jmniFrmRMKK03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK03ActionPerformed(evt);
            }
        });
        jmnuRPJ_Master.add(jmniFrmRMKK03);

        jmniFrmRMKK04.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK04.setText("Daftar Counter");
        jmniFrmRMKK04.setName("Frmrp_customer"); // NOI18N
        jmniFrmRMKK04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK04ActionPerformed(evt);
            }
        });
        jmnuRPJ_Master.add(jmniFrmRMKK04);

        jmnuReport_Penjualan.add(jmnuRPJ_Master);

        jmnuRP_J_Transaksi.setText("Transaksi");
        jmnuRP_J_Transaksi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmRTPS03.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTPS03.setText("POS Sales Report");
        jmniFrmRTPS03.setName("FrmRTPS03"); // NOI18N
        jmniFrmRTPS03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTPS03ActionPerformed(evt);
            }
        });
        jmnuRP_J_Transaksi.add(jmniFrmRTPS03);

        jmniFTPS0302.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFTPS0302.setText("Pos Sales Form/Struk");
        jmniFTPS0302.setName("FrmFTPS0302"); // NOI18N
        jmniFTPS0302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFTPS0302ActionPerformed(evt);
            }
        });
        jmnuRP_J_Transaksi.add(jmniFTPS0302);

        jmniRTSC0101.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniRTSC0101.setText("Laporan Penjualan");
        jmniRTSC0101.setName("FrmFTPS0302"); // NOI18N
        jmniRTSC0101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniRTSC0101ActionPerformed(evt);
            }
        });
        jmnuRP_J_Transaksi.add(jmniRTSC0101);

        jmnuReport_Penjualan.add(jmnuRP_J_Transaksi);

        jmnuReports.add(jmnuReport_Penjualan);

        jmnuReport_Inventory.setText("Inventori");
        jmnuReport_Inventory.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuRI_Master.setText("Master");
        jmnuRI_Master.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmRMKK21.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK21.setText("Daftar Tipe Gudang");
        jmniFrmRMKK21.setName("Frmrp_warehouse"); // NOI18N
        jmniFrmRMKK21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK21ActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmRMKK21);

        jmniFrmrp_warehouse.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_warehouse.setText("Daftar Gudang");
        jmniFrmrp_warehouse.setName("Frmrp_warehouse"); // NOI18N
        jmniFrmrp_warehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_warehouseActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_warehouse);

        jmniFrmrp_product.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_product.setText("Daftar Produk");
        jmniFrmrp_product.setName("Frmrp_product"); // NOI18N
        jmniFrmrp_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_productActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_product);

        jmniFrmrp_price.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_price.setText("Daftar Harga");
        jmniFrmrp_price.setName("Frmrp_price"); // NOI18N
        jmniFrmrp_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_priceActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_price);

        jmniFrmrp_measure.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_measure.setText("Daftar Satuan Produk");
        jmniFrmrp_measure.setName("Frmrp_measure"); // NOI18N
        jmniFrmrp_measure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_measureActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_measure);

        jmniFrmrp_function.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_function.setText("Daftar Fungsi Produk");
        jmniFrmrp_function.setName("Frmrp_function"); // NOI18N
        jmniFrmrp_function.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_functionActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_function);

        jmniFrmrp_discount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_discount.setText("Daftar Discount Produk");
        jmniFrmrp_discount.setName("Frmrp_discount"); // NOI18N
        jmniFrmrp_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_discountActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_discount);

        jmniFrmrp_category.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_category.setText("Daftar Kategori Produk");
        jmniFrmrp_category.setName("Frmrp_category"); // NOI18N
        jmniFrmrp_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_categoryActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_category);

        jmniFrmrp_brand.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_brand.setText("Daftar Merek Produk");
        jmniFrmrp_brand.setName("Frmrp_brand"); // NOI18N
        jmniFrmrp_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_brandActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmrp_brand);

        jmniFrmlabel_product.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmlabel_product.setText("Print Label Barcode Product");
        jmniFrmlabel_product.setName("Frmlabel_product"); // NOI18N
        jmniFrmlabel_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmlabel_productActionPerformed(evt);
            }
        });
        jmnuRI_Master.add(jmniFrmlabel_product);

        jmnuReport_Inventory.add(jmnuRI_Master);

        jmnuRPIn_Transaksi.setText("Transaksi");
        jmnuRPIn_Transaksi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmrp_mutasi_stok.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_mutasi_stok.setText("Cetak Mutasi Stok");
        jmniFrmrp_mutasi_stok.setName("Frmrp_mutasi_stok"); // NOI18N
        jmniFrmrp_mutasi_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_mutasi_stokActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmniFrmrp_mutasi_stok);

        jmniFrmrp_goods_transfer.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_goods_transfer.setText("Laporan Perpindahan Barang");
        jmniFrmrp_goods_transfer.setName("Frmrp_goods_transfer"); // NOI18N
        jmniFrmrp_goods_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_goods_transferActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmniFrmrp_goods_transfer);

        jmniFrmrp_goods_receipt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_goods_receipt.setText("Laporan Penerimaan Barang");
        jmniFrmrp_goods_receipt.setName("Frmrp_goods_receipt"); // NOI18N
        jmniFrmrp_goods_receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_goods_receiptActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmniFrmrp_goods_receipt);

        jmniFrmrp_goods_issue.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_goods_issue.setText("Laporan Pengeluaran Barang");
        jmniFrmrp_goods_issue.setName("Frmrp_goods_issue"); // NOI18N
        jmniFrmrp_goods_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_goods_issueActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmniFrmrp_goods_issue);

        jmnuFTSO02.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFTSO02.setText("Report Stock Opaname");
        jmnuFTSO02.setName("FrmFTSO02"); // NOI18N
        jmnuFTSO02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFTSO02ActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmnuFTSO02);

        jmnuFTSO01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmnuFTSO01.setText("Lembar Kerja S/O");
        jmnuFTSO01.setName("FrmFTSO01"); // NOI18N
        jmnuFTSO01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuFTSO01ActionPerformed(evt);
            }
        });
        jmnuRPIn_Transaksi.add(jmnuFTSO01);

        jmnuReport_Inventory.add(jmnuRPIn_Transaksi);

        jmnuReports.add(jmnuReport_Inventory);

        jmnuReport_Koperasi.setText("Simpan Pinjam");
        jmnuReport_Koperasi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuRK_Master.setText("Master");
        jmnuRK_Master.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmrp_pinjaman_tipe.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_pinjaman_tipe.setText("Tipe Pinjaman");
        jmniFrmrp_pinjaman_tipe.setName("Frmrp_pinjaman_tipe"); // NOI18N
        jmniFrmrp_pinjaman_tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_pinjaman_tipeActionPerformed(evt);
            }
        });
        jmnuRK_Master.add(jmniFrmrp_pinjaman_tipe);

        jmniFrmrp_pinjaman.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_pinjaman.setText("Daftar Pinjaman");
        jmniFrmrp_pinjaman.setName("Frmrp_pinjaman"); // NOI18N
        jmniFrmrp_pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_pinjamanActionPerformed(evt);
            }
        });
        jmnuRK_Master.add(jmniFrmrp_pinjaman);

        jmniFrmrp_jabatan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_jabatan.setText("Daftar Jabatan");
        jmniFrmrp_jabatan.setName("Frmrp_jabatan"); // NOI18N
        jmniFrmrp_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_jabatanActionPerformed(evt);
            }
        });
        jmnuRK_Master.add(jmniFrmrp_jabatan);

        jmniFrmrp_departemen.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_departemen.setText("Daftar Departemen");
        jmniFrmrp_departemen.setName("Frmrp_departemen"); // NOI18N
        jmniFrmrp_departemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_departemenActionPerformed(evt);
            }
        });
        jmnuRK_Master.add(jmniFrmrp_departemen);

        jmniFrmrp_anggota.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_anggota.setText("Daftar Anggota");
        jmniFrmrp_anggota.setName("Frmrp_anggota"); // NOI18N
        jmniFrmrp_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_anggotaActionPerformed(evt);
            }
        });
        jmnuRK_Master.add(jmniFrmrp_anggota);

        jmnuReport_Koperasi.add(jmnuRK_Master);

        jmniFrmrp_anggota_simpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_anggota_simpanan.setText("Laporan Simpanan Anggota");
        jmniFrmrp_anggota_simpanan.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmrp_anggota_simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_anggota_simpananActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmrp_anggota_simpanan);

        jmniFrmRMKO01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKO01.setText("Daftar Simpanan Anggota");
        jmniFrmRMKO01.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRMKO01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKO01ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRMKO01);

        jmniFrmrp_slip_anggota.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_slip_anggota.setText("Slip Anggota");
        jmniFrmrp_slip_anggota.setName("Frmrp_slip_anggota"); // NOI18N
        jmniFrmrp_slip_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_slip_anggotaActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmrp_slip_anggota);

        jmniFrmrp_potong_gaji.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_potong_gaji.setText("Report Potong Gaji");
        jmniFrmrp_potong_gaji.setName("Frmrp_potong_gaji"); // NOI18N
        jmniFrmrp_potong_gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_potong_gajiActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmrp_potong_gaji);

        jmniFrmrp_mutasi_simpanan.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_mutasi_simpanan.setText("Report Mutasi Simpanan");
        jmniFrmrp_mutasi_simpanan.setName("Frmrp_mutasi_simpanan"); // NOI18N
        jmniFrmrp_mutasi_simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_mutasi_simpananActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmrp_mutasi_simpanan);

        jmniFrmrp_transaksi_mohon.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_transaksi_mohon.setText("Report Permohonan Pinjaman");
        jmniFrmrp_transaksi_mohon.setName("Frmrp_transaksi_mohon"); // NOI18N
        jmniFrmrp_transaksi_mohon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_transaksi_mohonActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmrp_transaksi_mohon);

        jmniFrmRMKO03.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKO03.setText("Report Potong Gaji Ke PT");
        jmniFrmRMKO03.setName("Frmrp_potong_gaji"); // NOI18N
        jmniFrmRMKO03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKO03ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRMKO03);

        jmniFrmRTKO02.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO02.setText("Laporan Persetujuan Pinjaman");
        jmniFrmRTKO02.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO02ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO02);

        jmniFrmRTKO03.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO03.setText("Laporan Pencairan Pinjaman");
        jmniFrmRTKO03.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO03ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO03);

        jmniFrmRTKO04.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO04.setText("Laporan Bayar Pinjaman");
        jmniFrmRTKO04.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO04ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO04);

        jmniFrmRTKO05.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO05.setText("Laporan Angsuran Pinjaman");
        jmniFrmRTKO05.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO05ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO05);

        jmniFrmRTKO06.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO06.setText("Laporan Setor Pinjaman");
        jmniFrmRTKO06.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO06ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO06);

        jmniFrmRTKO07.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO07.setText("Laporan Tarik Pinjaman");
        jmniFrmRTKO07.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmRTKO07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO07ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO07);

        jmniFrmRMKO04.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKO04.setText("Daftar Setting Simpanan Anggota");
        jmniFrmRMKO04.setName("Frmko_transaksi_tagihan"); // NOI18N
        jmniFrmRMKO04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKO04ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRMKO04);

        jmniFrmRMKO05.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKO05.setText("Master Simpanan Potongan Anggota");
        jmniFrmRMKO05.setName("Frmko_transaksi_tagihan"); // NOI18N
        jmniFrmRMKO05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKO05ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRMKO05);

        jmniFrmRTKO08.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKO08.setText("Bon Bukti Pemotongan Gaji");
        jmniFrmRTKO08.setName("FrmRTKO08"); // NOI18N
        jmniFrmRTKO08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKO08ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTKO08);

        jmniFrmRTSP10.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTSP10.setText("Buku Simpanan  Report");
        jmniFrmRTSP10.setName("FrmRTSP10"); // NOI18N
        jmniFrmRTSP10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTSP10ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRTSP10);

        jmniFrmRMKO6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKO6.setText("Master Simpanan Potongan Anggota By Periode");
        jmniFrmRMKO6.setName("FrmRMKO06"); // NOI18N
        jmniFrmRMKO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKO6ActionPerformed(evt);
            }
        });
        jmnuReport_Koperasi.add(jmniFrmRMKO6);

        jmnuReports.add(jmnuReport_Koperasi);

        jmnuReport_Option.setText("Report Optional");
        jmnuReport_Option.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmrp_payment_term.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmrp_payment_term.setText("Daftar Payment Term");
        jmniFrmrp_payment_term.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmrp_payment_term.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_payment_termActionPerformed(evt);
            }
        });
        jmnuReport_Option.add(jmniFrmrp_payment_term);

        jmnuReports.add(jmnuReport_Option);

        jmnuReport_Akunting.setText("Report Akunting");
        jmnuReport_Akunting.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmnuRA_Master.setText("Master");
        jmnuRA_Master.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmRMKK05.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK05.setText("Daftar Akun");
        jmniFrmRMKK05.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRMKK05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK05ActionPerformed(evt);
            }
        });
        jmnuRA_Master.add(jmniFrmRMKK05);

        jmniFrmRMKK06.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK06.setText("Daftar Grup Akun");
        jmniFrmRMKK06.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRMKK06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK06ActionPerformed(evt);
            }
        });
        jmnuRA_Master.add(jmniFrmRMKK06);

        jmniFrmRMKK07.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK07.setText("Daftar Grup Data Entry");
        jmniFrmRMKK07.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRMKK07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK07ActionPerformed(evt);
            }
        });
        jmnuRA_Master.add(jmniFrmRMKK07);

        jmniFrmRMKK08.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRMKK08.setText("Daftar RAB");
        jmniFrmRMKK08.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRMKK08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRMKK08ActionPerformed(evt);
            }
        });
        jmnuRA_Master.add(jmniFrmRMKK08);

        jmnuReport_Akunting.add(jmnuRA_Master);

        jmnuRA_Transaksi.setText("Transaksi");
        jmnuRA_Transaksi.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmRTKK01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKK01.setText("Transaksi RAB");
        jmniFrmRTKK01.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRTKK01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKK01ActionPerformed(evt);
            }
        });
        jmnuRA_Transaksi.add(jmniFrmRTKK01);

        jmniFrmRTKK02.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKK02.setText("Transaksi GL Journal Entry");
        jmniFrmRTKK02.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRTKK02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKK02ActionPerformed(evt);
            }
        });
        jmnuRA_Transaksi.add(jmniFrmRTKK02);

        jmnuReport_Akunting.add(jmnuRA_Transaksi);

        jmnuRA_FinancialReport.setText("Financial Report");
        jmnuRA_FinancialReport.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmRTKK03.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKK03.setText("Financial Report");
        jmniFrmRTKK03.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRTKK03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKK03ActionPerformed(evt);
            }
        });
        jmnuRA_FinancialReport.add(jmniFrmRTKK03);

        jmniFrmRTKK04.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRTKK04.setText("Account Transaction List");
        jmniFrmRTKK04.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRTKK04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRTKK04ActionPerformed(evt);
            }
        });
        jmnuRA_FinancialReport.add(jmniFrmRTKK04);

        jmniFrmRFKK02.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRFKK02.setText("Financial Report");
        jmniFrmRFKK02.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRFKK02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRFKK02ActionPerformed(evt);
            }
        });
        jmnuRA_FinancialReport.add(jmniFrmRFKK02);

        jmniFrmRFKK01.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmRFKK01.setText("Trial Balance");
        jmniFrmRFKK01.setName("Frmrp_payment_term"); // NOI18N
        jmniFrmRFKK01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmRFKK01ActionPerformed(evt);
            }
        });
        jmnuRA_FinancialReport.add(jmniFrmRFKK01);

        jmnuReport_Akunting.add(jmnuRA_FinancialReport);

        jmnuReports.add(jmnuReport_Akunting);

        jmnuReport_Common.setText("Report Common");
        jmnuReport_Common.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jmniFrmsetting_common_rpt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jmniFrmsetting_common_rpt.setText("Daftar Akun");
        jmniFrmsetting_common_rpt.setName("Frmsetting_common_rpt"); // NOI18N
        jmniFrmsetting_common_rpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmsetting_common_rptActionPerformed(evt);
            }
        });
        jmnuReport_Common.add(jmniFrmsetting_common_rpt);

        jmnuReports.add(jmnuReport_Common);

        jMenuMain.add(jmnuReports);

        setJMenuBar(jMenuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSystemDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSystemDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLblUser)
                    .addComponent(jLblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(1020, 885));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.newData();//GEN-LAST:event_btnNewActionPerformed
        setCursor(GlobalUtils.NORMALCURSOR);
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);
        
    }
}                                      

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    try {
        
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.saveData();
        setCursor(GlobalUtils.NORMALCURSOR);
        
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

}//GEN-LAST:event_btnSaveActionPerformed

private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
    try {
        int n=JOptionPane.showConfirmDialog(this,"Undo this data?","Undo data",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_NO_OPTION){
           setCursor(GlobalUtils.HOURGLASSCURSOR);
           nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
           nfi.undo();
           setCursor(GlobalUtils.NORMALCURSOR);
        }
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnUndoActionPerformed

private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    try {
        int n=JOptionPane.showConfirmDialog(this,"Delete this data?","Delete data",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_NO_OPTION){
           setCursor(GlobalUtils.HOURGLASSCURSOR);
           nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
           nfi.delete();
           setCursor(GlobalUtils.NORMALCURSOR);
        }
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnDelActionPerformed

private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.moveFirst();
        setCursor(GlobalUtils.NORMALCURSOR);
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);        
    }
}//GEN-LAST:event_btnFirstActionPerformed

private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.movePrevious();
        setCursor(GlobalUtils.NORMALCURSOR);
    } catch (CodeException ex) {
        
    }
}//GEN-LAST:event_btnPrevActionPerformed

private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.moveNext();
        setCursor(GlobalUtils.NORMALCURSOR);
    } catch (CodeException ex) {
        
    }
}//GEN-LAST:event_btnNextActionPerformed

private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.moveLast();
        setCursor(GlobalUtils.NORMALCURSOR);
    } catch (CodeException ex) {
        setCursor(GlobalUtils.NORMALCURSOR);        
    }
}//GEN-LAST:event_btnLastActionPerformed

private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
    try {
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        if (jDesktopPane1.getSelectedFrame() instanceof NavigatorFormInt) {
            nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
            nfi.execute();
        }else if (jDesktopPane1.getSelectedFrame() instanceof NavigatorFormReportInt) {
            nrfi = (NavigatorFormReportInt) jDesktopPane1.getSelectedFrame();
            nrfi.execute();
        }
        setCursor(GlobalUtils.NORMALCURSOR);

        
    } catch (CodeException ex) {
         setCursor(GlobalUtils.NORMALCURSOR);       
    }
}//GEN-LAST:event_btnConfirmActionPerformed

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    setToolBar(-1,0);
    if(jDesktopPane1.getAllFrames().length > 0){
            jDesktopPane1.getSelectedFrame().doDefaultCloseAction();
            jDesktopPane1.selectFrame(true);
            if(jDesktopPane1.getSelectedFrame()==null){
                jDesktopPane1.selectFrame(false);                
            }
        }
}//GEN-LAST:event_btnCloseActionPerformed

private void btnPrevScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevScreenActionPerformed
        //jDesktopPane1.getSelectedFrame().moveToBack();
        jDesktopPane1.selectFrame(false);
}//GEN-LAST:event_btnPrevScreenActionPerformed

private void btnNextScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextScreenActionPerformed
        //jDesktopPane1.getSelectedFrame().toBack();
        jDesktopPane1.selectFrame(true);
}//GEN-LAST:event_btnNextScreenActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            this.setLocationRelativeTo(null);//GEN-LAST:event_formWindowOpened

            
}                                 

private void btnExTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExTxtActionPerformed
    

    
    setCursor(GlobalUtils.HOURGLASSCURSOR);
    try {
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.exportText();
    } catch (CodeException ex) {
        JOptionPane.showMessageDialog(this,ex.getMessage());        
    }    
    setCursor(GlobalUtils.NORMALCURSOR);//GEN-LAST:event_btnExTxtActionPerformed

}                                        

private void btnImpXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpXlsActionPerformed
    
    
    
    
    setCursor(GlobalUtils.HOURGLASSCURSOR);
    try {
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.importCsv();
    } catch (CodeException ex) {
        JOptionPane.showMessageDialog(this,ex.getMessage());
    }    
    setCursor(GlobalUtils.NORMALCURSOR);//GEN-LAST:event_btnImpXlsActionPerformed

}                                         

private void btnImpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpTxtActionPerformed
    setCursor(GlobalUtils.HOURGLASSCURSOR);

    try {
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.importText();
    } catch (CodeException ex) {
        JOptionPane.showMessageDialog(this,ex.getMessage());        
    }    
    setCursor(GlobalUtils.NORMALCURSOR);

}//GEN-LAST:event_btnImpTxtActionPerformed

private void btnExXlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExXlsActionPerformed
    setCursor(GlobalUtils.HOURGLASSCURSOR);
    try {
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.exportCsv();
    } catch (CodeException ex) {
        javax.swing.JOptionPane.showMessageDialog(this,ex.getMessage());        
    }    
    setCursor(GlobalUtils.NORMALCURSOR);

}//GEN-LAST:event_btnExXlsActionPerformed

private void jmniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniExitActionPerformed

    System.exit(0);
    
}//GEN-LAST:event_jmniExitActionPerformed

 


/*private void jmniMasterWIPActionPerformed(java.awt.event.ActionEvent evt) {                                         

}*/

private void jmniMaintenaceUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniMaintenaceUserActionPerformed
    try {
        if (frmmasteruser == null) {
            frmmasteruser = new FrmMasteruser(this);
            frmmasteruser.moveFirst();
        }
        showForm(frmmasteruser);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniMaintenaceUserActionPerformed

private void jmniModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniModuleActionPerformed
    try {
        if (frmmastermodule == null) {
            frmmastermodule = new FrmMastermodule(this);
            frmmastermodule.moveFirst();
        }
        showForm(frmmastermodule);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniModuleActionPerformed



private void jmniNonMatrialProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniNonMatrialProsesActionPerformed

}//GEN-LAST:event_jmniNonMatrialProsesActionPerformed

private void jmniGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniGroupActionPerformed
    try {
        if (frmmastergroup == null) {
            frmmastergroup = new FrmMastergroup(this);
            frmmastergroup.moveFirst();
        }
        showForm(frmmastergroup);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniGroupActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    if (!bactivate) {
        logOff();
        bactivate = true;
    }
}//GEN-LAST:event_formWindowActivated

private void jmniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniLogOutActionPerformed
        
         
    logOff();

}//GEN-LAST:event_jmniLogOutActionPerformed

private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
    try {
        nfi = (NavigatorFormInt) jDesktopPane1.getSelectedFrame();
        nfi.printData();
    } catch (CodeException ex) {
        
    }
}//GEN-LAST:event_btnPrintActionPerformed

private void jmniResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniResetPasswordActionPerformed

}//GEN-LAST:event_jmniResetPasswordActionPerformed

private void jmniTarikDepositoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jmniTarikDepositoAncestorAdded
    // TODO add your handling code here:
}//GEN-LAST:event_jmniTarikDepositoAncestorAdded

private void jmniLaporanMasterFrmAP_VendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniLaporanMasterFrmAP_VendorActionPerformed
        
}//GEN-LAST:event_jmniLaporanMasterFrmAP_VendorActionPerformed

private void jmnuLaporanMasterARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuLaporanMasterARActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmnuLaporanMasterARActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
   
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
   
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jmniFrmGL_PostJournalEntryBatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmGL_PostJournalEntryBatchesActionPerformed
    // TODO add your handling code here:
    
}//GEN-LAST:event_jmniFrmGL_PostJournalEntryBatchesActionPerformed

private void jmniMasterCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniMasterCompanyActionPerformed
    // TODO add your handling code here:
    try {
        if (frmCompany == null) {
            frmCompany = new FrmCompany(this);
            frmCompany.setTitle("Master Company");
        }
        showForm(frmCompany);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniMasterCompanyActionPerformed

private void jmniARAgedTrialBalancebyDueDateActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniARAgedTrialBalancebyDueDateActionPerformed1
    
}//GEN-LAST:event_jmniARAgedTrialBalancebyDueDateActionPerformed1

private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    try {
        if (frmreport_files == null) {
            frmreport_files = new Frmreport_files(this);
            frmreport_files.setTitle("Master Company");
        }
        showForm(frmreport_files);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jMenuItem15ActionPerformed

private void jmniMasterCurrency3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniMasterCurrency3ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniMasterCurrency3ActionPerformed

private void jmniMasterCurrency5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniMasterCurrency5ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniMasterCurrency5ActionPerformed

private void jmniAktivitasUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAktivitasUserActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniAktivitasUserActionPerformed

private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
    // TODO add your handling code here:
    
}//GEN-LAST:event_jMenuItem21ActionPerformed

private void jmniDaftarSetorDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniDaftarSetorDepositoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniDaftarSetorDepositoActionPerformed

private void jmniReportDaftarSumberDataEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniReportDaftarSumberDataEntryActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniReportDaftarSumberDataEntryActionPerformed

private void jmniEntryDaftarPenerimaBonusWadiahDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEntryDaftarPenerimaBonusWadiahDepositoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jmniEntryDaftarPenerimaBonusWadiahDepositoActionPerformed

private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem13ActionPerformed

private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jMenuItem14ActionPerformed

private void jmniGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniGeneratorActionPerformed
    // TODO add your handling code here:
    try {
        if (frmGenerator == null) {
            frmGenerator = new FrmGenerator(this);
        }
        showForm(frmGenerator);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniGeneratorActionPerformed

private void jmniSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSupplierActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_supplier == null) {
            frmap_supplier = new Frmap_supplier(this);
        }
        showForm(frmap_supplier);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniSupplierActionPerformed

private void jmniCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniCustomerActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_customer == null) {
            frmar_customer = new Frmar_customer(this);
        }
        showForm(frmar_customer);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniCustomerActionPerformed

private void jmniProductInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniProductInfoActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_product == null) {
            frmin_product = new Frmin_product(this);
        }
        showForm(frmin_product);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniProductInfoActionPerformed

private void jmnuBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuBrandActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_brand == null) {
            frmin_brand = new Frmin_brand(this);
        }
        showForm(frmin_brand);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmnuBrandActionPerformed

private void jmniOrderPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniOrderPembelianActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_purchase_order == null) {
            frmap_purchase_order = new Frmap_purchase_order(this);
        }
        showForm(frmap_purchase_order);
        frmap_purchase_order.newData();
    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniOrderPembelianActionPerformed

private void jmniTerimaLainLainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniTerimaLainLainActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_goods_receipt == null) {
            frmin_goods_receipt = new Frmin_goods_receipt(this);
        }
        showForm(frmin_goods_receipt);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniTerimaLainLainActionPerformed

private void jmniKeluarLainlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniKeluarLainlainActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_goods_issue == null) {
            frmin_goods_issue = new Frmin_goods_issue(this);
        }
        showForm(frmin_goods_issue);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniKeluarLainlainActionPerformed

private void jmniTransferAntarGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniTransferAntarGudangActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_goods_transfer == null) {
            frmin_goods_transfer = new Frmin_goods_transfer(this);
        }
        showForm(frmin_goods_transfer);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniTransferAntarGudangActionPerformed

private void jmnipenerimaanpembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnipenerimaanpembelianActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_purchase_receive == null) {
            frmap_purchase_receive = new Frmap_purchase_receive(this);
        }
        showForm(frmap_purchase_receive);
        frmap_purchase_receive.newData();
    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnipenerimaanpembelianActionPerformed

private void jmnuReturPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuReturPembelianActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_purchase_return == null) {
            frmap_purchase_return = new Frmap_purchase_return(this);
        }
        showForm(frmap_purchase_return);
        frmap_purchase_return.newData();
    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnuReturPembelianActionPerformed

private void jmniSalesOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalesOrderActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_sales_order == null) {
            frmar_sales_order = new Frmar_sales_order(this);
        }
        showForm(frmar_sales_order);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniSalesOrderActionPerformed

private void jmniDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniDeliveryActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_sales_delivery == null) {
            frmar_sales_delivery = new Frmar_sales_delivery(this);
        }
        showForm(frmar_sales_delivery);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniDeliveryActionPerformed

private void jmniSalesReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalesReturnActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_sales_return == null) {
            frmar_sales_return = new Frmar_sales_return(this);
        }
        showForm(frmar_sales_return);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniSalesReturnActionPerformed

private void jmniDepartemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniDepartemenActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_departemen == null) {
            frmko_departemen = new Frmko_departemen(this);
        }
        showForm(frmko_departemen);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniDepartemenActionPerformed

private void jmniJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniJabatanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_jabatan == null) {
            frmko_jabatan = new Frmko_jabatan(this);
        }
        showForm(frmko_jabatan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniJabatanActionPerformed

private void jmniAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAnggotaActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_anggota == null) {
            frmko_anggota = new Frmko_anggota(this);
        }
        showForm(frmko_anggota);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniAnggotaActionPerformed

private void jmniPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_pinjaman == null) {
            frmko_pinjaman = new Frmko_pinjaman(this);
        }
        showForm(frmko_pinjaman);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniPinjamanActionPerformed

private void jmniPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPOSActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_sales == null) {
            frmar_pos_sales = new Frmar_pos_sales(this);
        }
        showForm(frmar_pos_sales);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniPOSActionPerformed

private void jmniKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniKategoriActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_category == null) {
            frmin_category = new Frmin_category(this);
        }
        showForm(frmin_category);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniKategoriActionPerformed

private void jmniFungsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFungsiActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_function == null) {
            frmin_function = new Frmin_function(this);
        }
        showForm(frmin_function);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFungsiActionPerformed

private void jmniPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPriceActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_price == null) {
            frmin_price = new Frmin_price(this);
        }
        showForm(frmin_price);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniPriceActionPerformed

private void jmniDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniDiscountActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_discount == null) {
            frmin_discount = new Frmin_discount(this);
        }
        showForm(frmin_discount);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniDiscountActionPerformed

private void jmniMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniMeasureActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_measure == null) {
            frmin_measure = new Frmin_measure(this);
        }
        showForm(frmin_measure);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniMeasureActionPerformed

private void jmniWarehouseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniWarehouseTypeActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_warehouse_type == null) {
            frmin_warehouse_type = new Frmin_warehouse_type(this);
        }
        showForm(frmin_warehouse_type);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniWarehouseTypeActionPerformed

private void jmniWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniWarehouseActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_warehouse == null) {
            frmin_warehouse = new Frmin_warehouse(this);
        }
        showForm(frmin_warehouse);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniWarehouseActionPerformed

private void jmniSalesmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSalesmanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmop_salesman == null) {
            frmop_salesman = new Frmop_salesman(this);
        }
        showForm(frmop_salesman);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniSalesmanActionPerformed

private void jmniPaymentTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPaymentTermActionPerformed
    // TODO add your handling code here:
    try {
        if (frmop_payment_term == null) {
            frmop_payment_term = new Frmop_payment_term(this);
        }
        showForm(frmop_payment_term);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniPaymentTermActionPerformed

private void jmniFrmko_transaksi_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_registrasiActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_registrasi == null) {
            frmko_transaksi_registrasi = new Frmko_transaksi_registrasi(this);
        }
        showForm(frmko_transaksi_registrasi);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_transaksi_registrasiActionPerformed

private void jmniSetor_SimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniSetor_SimpananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_setor_simpanan == null) {
            frmko_transaksi_setor_simpanan = new Frmko_transaksi_setor_simpanan(this);
        }
        showForm(frmko_transaksi_setor_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }


}//GEN-LAST:event_jmniSetor_SimpananActionPerformed

private void jmniTarikSimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniTarikSimpananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_tarik_simpanan == null) {
            frmko_transaksi_tarik_simpanan = new Frmko_transaksi_tarik_simpanan(this);
        }
        showForm(frmko_transaksi_tarik_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniTarikSimpananActionPerformed

private void jmniPermohonanPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPermohonanPinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_mohon == null) {
            frmko_transaksi_mohon = new Frmko_transaksi_mohon(this);
        }
        showForm(frmko_transaksi_mohon);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniPermohonanPinjamanActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_pinjaman_tipe == null) {
            frmko_pinjaman_tipe = new Frmko_pinjaman_tipe(this);
        }
        showForm(frmko_pinjaman_tipe);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jmniPersetujuanPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPersetujuanPinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_setuju == null) {
            frmko_transaksi_setuju = new Frmko_transaksi_setuju(this);
        }
        showForm(frmko_transaksi_setuju);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniPersetujuanPinjamanActionPerformed

private void jmniPembayaranPinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPembayaranPinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_bayar == null) {
            frmko_transaksi_bayar = new Frmko_transaksi_bayar(this);
        }
        showForm(frmko_transaksi_bayar);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniPembayaranPinjamanActionPerformed

private void jmnuko_Auto_Pot_PinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuko_Auto_Pot_PinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_Auto_Pot_Pinjaman == null) {
            frmko_Auto_Pot_Pinjaman = new Frmko_Auto_Pot_Pinjaman(this);
        }
        showForm(frmko_Auto_Pot_Pinjaman);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnuko_Auto_Pot_PinjamanActionPerformed

private void jmniko_Auto_Pot_SimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniko_Auto_Pot_SimpananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_Auto_Pot_Simpanan == null) {
            frmko_Auto_Pot_Simpanan = new Frmko_Auto_Pot_Simpanan(this);
        }
        showForm(frmko_Auto_Pot_Simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniko_Auto_Pot_SimpananActionPerformed

private void jmniLembarKerjaStockOpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniLembarKerjaStockOpnameActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_so_sheet == null) {
            frmin_so_sheet = new Frmin_so_sheet(this);
        }
        showForm(frmin_so_sheet);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniLembarKerjaStockOpnameActionPerformed

private void jmniEntriStockOpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniEntriStockOpnameActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_so_entry == null) {
            frmin_so_entry = new Frmin_so_entry(this);
        }
        showForm(frmin_so_entry);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniEntriStockOpnameActionPerformed

private void jmniFrmrp_warehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_warehouseActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_warehouse == null) {
            frmrp_warehouse = new Frmrp_warehouse(this);
        }
        showForm(frmrp_warehouse);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_warehouseActionPerformed

private void jmnuFrmrp_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFrmrp_supplierActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_supplier == null) {
            frmrp_supplier = new Frmrp_supplier(this);
        }
        showForm(frmrp_supplier);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnuFrmrp_supplierActionPerformed

private void jmniFrmrp_salesmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_salesmanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_salesman == null) {
            frmrp_salesman = new Frmrp_salesman(this);
        }
        showForm(frmrp_salesman);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_salesmanActionPerformed

private void jmniFrmrp_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_productActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_product == null) {
            frmrp_product = new Frmrp_product(this);
        }
        showForm(frmrp_product);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_productActionPerformed

private void jmniFrmrp_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_priceActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_price == null) {
            frmrp_price = new Frmrp_price(this);
        }
        showForm(frmrp_price);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_priceActionPerformed

private void jmniFrmrp_pinjaman_tipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_pinjaman_tipeActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_pinjaman_tipe == null) {
            frmrp_pinjaman_tipe = new Frmrp_pinjaman_tipe(this);
        }
        showForm(frmrp_pinjaman_tipe);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_pinjaman_tipeActionPerformed

private void jmniFrmrp_pinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_pinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_pinjaman == null) {
            frmrp_pinjaman = new Frmrp_pinjaman(this);
        }
        showForm(frmrp_pinjaman);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_pinjamanActionPerformed

private void jmniFrmrp_payment_termActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_payment_termActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_payment_term == null) {
            frmrp_payment_term = new Frmrp_payment_term(this);
        }
        showForm(frmrp_payment_term);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_payment_termActionPerformed

private void jmniFrmrp_measureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_measureActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_measure == null) {
            frmrp_measure = new Frmrp_measure(this);
        }
        showForm(frmrp_measure);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_measureActionPerformed

private void jmniFrmrp_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_jabatanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_jabatan == null) {
            frmrp_jabatan = new Frmrp_jabatan(this);
        }
        showForm(frmrp_jabatan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_jabatanActionPerformed

private void jmniFrmrp_functionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_functionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_function == null) {
            frmrp_function = new Frmrp_function(this);
        }
        showForm(frmrp_function);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_functionActionPerformed

private void jmniFrmrp_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_discountActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_discount == null) {
            frmrp_discount = new Frmrp_discount(this);
        }
        showForm(frmrp_discount);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_discountActionPerformed

private void jmniFrmrp_departemenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_departemenActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_departemen == null) {
            frmrp_departemen = new Frmrp_departemen(this);
        }
        showForm(frmrp_departemen);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_departemenActionPerformed

private void jmniFrmrp_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_customerActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_customer == null) {
            frmrp_customer = new Frmrp_customer(this);
        }
        showForm(frmrp_customer);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_customerActionPerformed

private void jmniFrmrp_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_categoryActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_category == null) {
            frmrp_category = new Frmrp_category(this);
        }
        showForm(frmrp_category);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_categoryActionPerformed

private void jmniFrmrp_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_brandActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_brand == null) {
            frmrp_brand = new FrmRMKK09(this);
        }
        showForm(frmrp_brand);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_brandActionPerformed

private void jmniFrmrp_anggota_simpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_anggota_simpananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_anggota_simpanan == null) {
            frmrp_anggota_simpanan = new Frmrp_anggota_simpanan(this);
        }
        showForm(frmrp_anggota_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_anggota_simpananActionPerformed

private void jmniFrmrp_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_anggotaActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_anggota == null) {
            frmrp_anggota = new Frmrp_anggota(this);
        }
        showForm(frmrp_anggota);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_anggotaActionPerformed

private void jmniFrmin_so_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmin_so_processActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_so_process == null) {
            frmin_so_process = new Frmin_so_process(this);
        }
        showForm(frmin_so_process);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmin_so_processActionPerformed

private void jmniProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniProductPriceActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_product_price_info == null) {
            frmin_product_price_info = new Frmin_product_price_info(this);
        }
        showForm(frmin_product_price_info);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniProductPriceActionPerformed

private void jmniin_prosesbulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniin_prosesbulananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_ProsesBulanan == null) {
            frmin_ProsesBulanan = new Frmin_ProsesBulanan(this);
        }
        showForm(frmin_ProsesBulanan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniin_prosesbulananActionPerformed

private void jmniFrmrp_kartu_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_kartu_stokActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_kartu_stok == null) {
            frmrp_kartu_stok = new Frmrp_kartu_stok(this);
        }
        showForm(frmrp_kartu_stok);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_kartu_stokActionPerformed

private void jmniFrmrp_mutasi_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_mutasi_stokActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_mutasi_stok == null) {
            frmrp_mutasi_stok = new Frmrp_mutasi_stok(this);
        }
        showForm(frmrp_mutasi_stok);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_mutasi_stokActionPerformed

private void jmniFrmrp_purchase_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_purchase_orderActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_purchase_order == null) {
            frmrp_purchase_order = new Frmrp_purchase_order(this);
        }
        showForm(frmrp_purchase_order);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_purchase_orderActionPerformed

private void jmniko_monthly_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniko_monthly_processActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_monthly_process == null) {
            frmko_monthly_process = new Frmko_monthly_process(this);
        }
        showForm(frmko_monthly_process);

    }catch(Exception e) {
        e.printStackTrace();
    }


}//GEN-LAST:event_jmniko_monthly_processActionPerformed

private void jmniFrmrp_slip_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_slip_anggotaActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_slip_anggota == null) {
            frmrp_slip_anggota = new Frmrp_slip_anggota(this);
        }
        showForm(frmrp_slip_anggota);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_slip_anggotaActionPerformed

private void jmniFrmrp_potong_gajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_potong_gajiActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_potong_gaji == null) {
            frmrp_potong_gaji = new Frmrp_potong_gaji(this);
        }
        showForm(frmrp_potong_gaji);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_potong_gajiActionPerformed

private void jmniFrmrp_purchase_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_purchase_returnActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_purchase_return == null) {
            frmrp_purchase_return = new Frmrp_purchase_return(this);
        }
        showForm(frmrp_purchase_return);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_purchase_returnActionPerformed

private void jmniFrmrp_purchase_receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_purchase_receiveActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_purchase_receive == null) {
            frmrp_purchase_receive = new Frmrp_purchase_receive(this);
        }
        showForm(frmrp_purchase_receive);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_purchase_receiveActionPerformed

private void jmniFrmrp_goods_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_goods_transferActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_goods_transfer == null) {
            frmrp_goods_transfer = new Frmrp_goods_transfer(this);
        }
        showForm(frmrp_goods_transfer);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_goods_transferActionPerformed

private void jmniFrmrp_goods_receiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_goods_receiptActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_goods_receipt == null) {
            frmrp_goods_receipt = new Frmrp_goods_receipt(this);
        }
        showForm(frmrp_goods_receipt);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_goods_receiptActionPerformed

private void jmniFrmrp_goods_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_goods_issueActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_goods_issue == null) {
            frmrp_goods_issue = new Frmrp_goods_issue(this);
        }
        showForm(frmrp_goods_issue);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_goods_issueActionPerformed

private void jmniFrmgl_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_groupActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_group == null) {
            frmgl_group = new Frmgl_group(this);
        }
        showForm(frmgl_group);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_groupActionPerformed

private void jmniFrmgl_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_accountActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_account == null) {
            frmgl_account = new Frmgl_account(this);
        }
        showForm(frmgl_account);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_accountActionPerformed

private void jmniFrmgl_group_data_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_group_data_entryActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_group_data_entry == null) {
            frmgl_group_data_entry = new Frmgl_group_data_entry(this);
        }
        showForm(frmgl_group_data_entry);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_group_data_entryActionPerformed

private void jmniFrmgl_rabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_rabActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_rab == null) {
            frmgl_rab = new Frmgl_rab(this);
        }
        showForm(frmgl_rab);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_rabActionPerformed

private void jmniFrmgl_sumber_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_sumber_dataActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_sumber_data == null) {
            frmgl_sumber_data = new Frmgl_sumber_data(this);
        }
        showForm(frmgl_sumber_data);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_sumber_dataActionPerformed

private void jmniFrmgl_kalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_kalenderActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_kalender == null) {
            frmgl_kalender = new Frmgl_kalender(this);
        }
        showForm(frmgl_kalender);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_kalenderActionPerformed

private void jmniFrmgl_transaksi_journalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_transaksi_journalActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_transaksi_journal == null) {
            frmgl_transaksi_journal = new Frmgl_transaksi_journal(this);
        }
        frmgl_transaksi_journal = new Frmgl_transaksi_journal(this);
        showForm(frmgl_transaksi_journal);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_transaksi_journalActionPerformed

private void jmniFrmgl_transaksi_rabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_transaksi_rabActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_transaksi_rab == null) {
            frmgl_transaksi_rab = new Frmgl_transaksi_rab(this);
        }
        showForm(frmgl_transaksi_rab);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmgl_transaksi_rabActionPerformed

private void jmnuFrmko_transaksi_cair_pinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFrmko_transaksi_cair_pinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_cair_pinjaman == null) {
            frmko_transaksi_cair_pinjaman = new Frmko_transaksi_cair_pinjaman(this);
        }
        showForm(frmko_transaksi_cair_pinjaman);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnuFrmko_transaksi_cair_pinjamanActionPerformed

private void jmniFrmko_transaksi_revisi_simpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_revisi_simpananActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_revisi_simpanan == null) {
            frmko_transaksi_revisi_simpanan = new Frmko_transaksi_revisi_simpanan(this);
        }
        showForm(frmko_transaksi_revisi_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_transaksi_revisi_simpananActionPerformed

private void jmniFrmar_pos_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_pos_returnActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_return == null) {
            frmar_pos_return = new Frmar_pos_return(this);
        }
        showForm(frmar_pos_return);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmar_pos_returnActionPerformed

private void jmniFrmar_pos_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_pos_openActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_open == null) {
            frmar_pos_open = new Frmar_pos_open(this);
        }
        showForm(frmar_pos_open);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmar_pos_openActionPerformed

private void jmniFrmar_pos_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_pos_closeActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_close == null) {
            frmar_pos_close = new Frmar_pos_close(this);
        }
        showForm(frmar_pos_close);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmar_pos_closeActionPerformed

private void jmniFrmar_pos_counterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_pos_counterActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_counter == null) {
            frmar_pos_counter = new Frmar_pos_counter(this);
        }
        showForm(frmar_pos_counter);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmar_pos_counterActionPerformed

private void jmniFrmrp_mutasi_simpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_mutasi_simpananActionPerformed
    // TODO add your handling code here:

    try {
        if (frmrp_mutasi_simpanan == null) {
            frmrp_mutasi_simpanan = new Frmrp_mutasi_simpanan(this);
        }
        showForm(frmrp_mutasi_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmrp_mutasi_simpananActionPerformed

private void jmniFrmrp_transaksi_mohonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_transaksi_mohonActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_transaksi_mohon == null) {
            frmrp_transaksi_mohon = new Frmrp_transaksi_mohon(this);
        }
        showForm(frmrp_transaksi_mohon);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_transaksi_mohonActionPerformed

private void jmniFrmko_transaksi_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_tagihanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_tagihan == null) {
            frmko_transaksi_tagihan = new Frmko_transaksi_tagihan(this);
        }
        showForm(frmko_transaksi_tagihan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_transaksi_tagihanActionPerformed

private void jmniFrmRMKK03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK03ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK03 == null) {
            frmRMKK03 = new FrmRMKK03(this);
        }
        showForm(frmRMKK03);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK03ActionPerformed

private void jmniFrmRMKK04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK04ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK04 == null) {
            frmRMKK04 = new FrmRMKK04(this);
        }
        showForm(frmRMKK04);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK04ActionPerformed

private void jmniFrmRMKK05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK05ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK05 == null) {
            frmRMKK05 = new FrmRMKK05(this);
        }
        showForm(frmRMKK05);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK05ActionPerformed

private void jmniFrmRMKK06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK06ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK06 == null) {
            frmRMKK06 = new FrmRMKK06(this);
        }
        showForm(frmRMKK06);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK06ActionPerformed

private void jmniFrmRMKK08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK08ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK08 == null) {
            frmRMKK08 = new FrmRMKK08(this);
        }
        showForm(frmRMKK08);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK08ActionPerformed

private void jmniFrmRMKK21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK21ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK21 == null) {
            frmRMKK21 = new FrmRMKK21(this);
        }
        showForm(frmRMKK21);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK21ActionPerformed

private void jmniap_account_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniap_account_setActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_account_set == null) {
            frmap_account_set = new Frmap_account_set(this);
        }
        showForm(frmap_account_set);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniap_account_setActionPerformed

private void jmniar_account_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniar_account_setActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_account_set == null) {
            frmar_account_set = new Frmar_account_set(this);
        }
        showForm(frmar_account_set);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniar_account_setActionPerformed

private void jmniin_account_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniin_account_setActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_account_set == null) {
            frmin_account_set = new Frmin_account_set(this);
        }
        showForm(frmin_account_set);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniin_account_setActionPerformed

private void jmniko_account_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniko_account_setActionPerformed
    // TODO add your handling code here:

    try {
        if (frmko_account_set == null) {
            frmko_account_set = new Frmko_account_set(this);
        }
        showForm(frmko_account_set);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniko_account_setActionPerformed

private void jmniko_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniko_optionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_option == null) {
            frmko_option = new Frmko_option(this);
        }
        showForm(frmko_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniko_optionActionPerformed

private void jmniFrmsetting_financial_rptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmsetting_financial_rptActionPerformed
    // TODO add your handling code here:
    try {
        if (frmsetting_financial_rpt == null) {
            frmsetting_financial_rpt = new Frmsetting_financial_rpt(this);
        }
        showForm(frmsetting_financial_rpt);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmsetting_financial_rptActionPerformed

private void jmniFrmproses_day_end_to_glActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmproses_day_end_to_glActionPerformed
    // TODO add your handling code here:
    try {
        
            frmproses_day_end_to_gl = new Frmproses_day_end_to_gl(this);
        
        showForm(frmproses_day_end_to_gl);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmproses_day_end_to_glActionPerformed

private void jmniFrmgl_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmgl_optionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmgl_option == null) {
            frmgl_option = new Frmgl_option(this);
        }
        showForm(frmgl_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmgl_optionActionPerformed

private void jmniFrmRFKK02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRFKK02ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRFKK02 == null) {
            frmRFKK02 = new FrmRFKK02(this);
        }
        showForm(frmRFKK02);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRFKK02ActionPerformed

private void jmniFrmRTKK03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKK03ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKK03 == null) {
            frmRTKK03 = new FrmRTKK03(this);
        }
        showForm(frmRTKK03);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKK03ActionPerformed

private void jmniFrmRTKK01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKK01ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKK01 == null) {
            frmRTKK01 = new FrmRTKK01(this);
        }
        showForm(frmRTKK01);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKK01ActionPerformed

private void jmniFrmRTKK02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKK02ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKK02 == null) {
            frmRTKK02 = new FrmRTKK02(this);
        }
        showForm(frmRTKK02);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKK02ActionPerformed

private void jmniFrmRFKK01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRFKK01ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRFKK01 == null) {
            frmRFKK01 = new FrmRFKK01(this);
        }
        showForm(frmRFKK01);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRFKK01ActionPerformed

private void jmniFrmRMKK07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKK07ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKK07 == null) {
            frmRMKK07 = new FrmRMKK07(this);
        }
        showForm(frmRMKK07);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKK07ActionPerformed

private void jmniFrmposting_journal_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmposting_journal_entryActionPerformed
    // TODO add your handling code here:
    try {
        if (frmposting_journal_entry == null) {
            frmposting_journal_entry = new Frmposting_journal_entry(this);
        }
        showForm(frmposting_journal_entry);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmposting_journal_entryActionPerformed

private void jmniFrmRTKK04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKK04ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKK04 == null) {
            frmRTKK04 = new FrmRTKK04(this);
        }
        showForm(frmRTKK04);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKK04ActionPerformed

private void jmniAPInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAPInvoiceActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_purchase_invoice == null) {
            frmap_purchase_invoice = new Frmap_purchase_invoice(this);
        }
        showForm(frmap_purchase_invoice);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniAPInvoiceActionPerformed

private void jmniAPDebitNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAPDebitNoteActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_purchase_dnote == null) {
            frmap_purchase_dnote = new Frmap_purchase_dnote(this);
        }
        showForm(frmap_purchase_dnote);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniAPDebitNoteActionPerformed

private void jmniFrmar_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_invoiceActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_sales_invoice == null) {
            frmar_sales_invoice = new Frmar_sales_invoice(this);
        }
        showForm(frmar_sales_invoice);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmar_invoiceActionPerformed

private void jmniFrmar_cnoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmar_cnoteActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_sales_cnote == null) {
            frmar_sales_cnote = new Frmar_sales_cnote(this);
        }
        showForm(frmar_sales_cnote);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmar_cnoteActionPerformed

private void jmniar_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniar_optionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_option == null) {
            frmar_option = new Frmar_option(this);
        }
        showForm(frmar_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniar_optionActionPerformed

private void jmniap_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniap_optionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_option == null) {
            frmap_option = new Frmap_option(this);
        }
        showForm(frmap_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniap_optionActionPerformed

private void jmniFrmIn_OptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmIn_OptionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmin_option == null) {
            frmin_option = new Frmin_option(this);
        }
        showForm(frmin_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmIn_OptionActionPerformed

private void jmniar_pos_cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniar_pos_cashierActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_chasier == null) {
            frmar_pos_chasier = new Frmar_pos_chasier(this);
        }
        showForm(frmar_pos_chasier);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniar_pos_cashierActionPerformed

private void jmniAPPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniAPPaymentActionPerformed
    // TODO add your handling code here:
    try {
        if (frmap_payment == null) {
            frmap_payment = new Frmap_payment(this);
        }
        showForm(frmap_payment);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniAPPaymentActionPerformed

private void jmniFrmRMKO03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKO03ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKO03 == null) {
            frmRMKO03 = new FrmRMKO03(this);
        }
        showForm(frmRMKO03);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKO03ActionPerformed

private void jmniar_pos_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniar_pos_optionActionPerformed
    // TODO add your handling code here:
    try {
        if (frmar_pos_option == null) {
            frmar_pos_option = new Frmar_pos_option(this);
        }
        showForm(frmar_pos_option);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniar_pos_optionActionPerformed

private void jmniFrmRMKO01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKO01ActionPerformed
    // TODO add your handling code here:
    try {

        frmrp_anggota_simpanan = new Frmrp_anggota_simpanan(this,Frmrp_anggota_simpanan.Report_Name_Daftar);
        showForm(frmrp_anggota_simpanan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKO01ActionPerformed

private void jmniFrmRTKO02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO02ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO02 == null) {
            frmRTKO02 = new FrmRTKO02(this);
        }
        showForm(frmRTKO02);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO02ActionPerformed

private void jmniFrmRTKO03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO03ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO03 == null) {
            frmRTKO03 = new FrmRTKO03(this);
        }
        showForm(frmRTKO03);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO03ActionPerformed

private void jmniFrmRTKO04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO04ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO04 == null) {
            frmRTKO04 = new FrmRTKO04(this);
        }
        showForm(frmRTKO04);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO04ActionPerformed

private void jmniFrmRTKO05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO05ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO05 == null) {
            frmRTKO05 = new FrmRTKO05(this);
        }
        showForm(frmRTKO05);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO05ActionPerformed

private void jmniFrmRTKO06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO06ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO06 == null) {
            frmRTKO06 = new FrmRTKO06(this);
        }
        showForm(frmRTKO06);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO06ActionPerformed

private void jmniFrmRTKO07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO07ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO07 == null) {
            frmRTKO07 = new FrmRTKO07(this);
        }
        showForm(frmRTKO07);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTKO07ActionPerformed

private void jmniFrmRMKO04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKO04ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKO04 == null) {
            frmRMKO04 = new FrmRMKO04(this);
        }
        showForm(frmRMKO04);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKO04ActionPerformed

private void jmniFrmRMKO05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKO05ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKO05 == null) {
            frmRMKO05 = new FrmRMKO05(this);
        }
        showForm(frmRMKO05);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKO05ActionPerformed

private void jmnuFrmFMAS01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFrmFMAS01ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmFMAS01 == null) {
            frmFMAS01 = new FrmFMAS01(this);
        }
        showForm(frmFMAS01);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmnuFrmFMAS01ActionPerformed

private void jmniBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniBankActionPerformed
    // TODO add your handling code here:
    try {
        if (frmop_bank == null) {
            frmop_bank = new Frmop_bank(this);
        }
        showForm(frmop_bank);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniBankActionPerformed

private void jmnuFTSO02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFTSO02ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmFTSO02 == null) {
            frmFTSO02 = new FrmFTSO02(this);
        }
        showForm(frmFTSO02);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmnuFTSO02ActionPerformed

private void jmnuFTSO01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFTSO01ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmFTSO01 == null) {
            frmFTSO01 = new FrmFTSO01(this);
        }
        showForm(frmFTSO01);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmnuFTSO01ActionPerformed

private void jmniFrmko_transaksi_bayar_tokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_bayar_tokoActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_bayar_toko == null) {
            frmko_transaksi_bayar_toko = new Frmko_transaksi_bayar_toko(this);
        }
        showForm(frmko_transaksi_bayar_toko);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_transaksi_bayar_tokoActionPerformed

private void jmniFrmlabel_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmlabel_productActionPerformed
    // TODO add your handling code here:
    try {
        if (frmlabel_product == null) {
            frmlabel_product = new Frmlabel_product(this);
        }
        showForm(frmlabel_product);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmlabel_productActionPerformed

private void jmniFrmRTKO08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTKO08ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTKO08 == null) {
            frmRTKO08 = new FrmRTKO08(this);
        }
        showForm(frmRTKO08);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmRTKO08ActionPerformed

private void jmniFrmko_auto_persetujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_auto_persetujuanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_auto_persetujuan == null) {
            frmko_auto_persetujuan = new Frmko_auto_persetujuan(this);
        }
        showForm(frmko_auto_persetujuan);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_auto_persetujuanActionPerformed

private void jmniPersetujuanPinjamanRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniPersetujuanPinjamanRubahActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_setuju_rubah == null) {
            frmko_transaksi_setuju_rubah = new Frmko_transaksi_setuju_rubah(this);
        }
        showForm(frmko_transaksi_setuju_rubah);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniPersetujuanPinjamanRubahActionPerformed

private void jmniFrmko_util_import_tokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_util_import_tokoActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_util_import_toko == null) {
            frmko_util_import_toko = new Frmko_util_import_toko(this);
        }
        showForm(frmko_util_import_toko);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmko_util_import_tokoActionPerformed

private void jmniFrmRTPS03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTPS03ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTPS03 == null) {
            frmRTPS03 = new FrmRTPS03(this);
        }
        showForm(frmRTPS03);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRTPS03ActionPerformed

private void jmniFrmsetting_common_rptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmsetting_common_rptActionPerformed
    // TODO add your handling code here:
    try {
        if (frmsetting_common_rpt == null) {
            frmsetting_common_rpt = new Frmsetting_common_rpt(this);
        }
        showForm(frmsetting_common_rpt);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmsetting_common_rptActionPerformed

private void jmniFrmRTSP10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRTSP10ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRTSP10 == null) {
            frmRTSP10 = new FrmRTSP10(this);
        }
        showForm(frmRTSP10);

    }catch(Exception e) {
        e.printStackTrace();
    }


}//GEN-LAST:event_jmniFrmRTSP10ActionPerformed

private void jmniFTPS0302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFTPS0302ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmFTPS0302 == null) {
            frmFTPS0302 = new FrmFTPS0302(this);
        }
        showForm(frmFTPS0302);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFTPS0302ActionPerformed

private void jmniFrmRMKO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmRMKO6ActionPerformed
    // TODO add your handling code here:
    try {
        if (frmRMKO06 == null) {
            frmRMKO06 = new FrmRMKO06(this);
        }
        showForm(frmRMKO06);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmRMKO6ActionPerformed

private void jmniFrmKo_recal_simpanan_pinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmKo_recal_simpanan_pinjamanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmKo_recal_simpanan_pinjaman == null) {
            frmKo_recal_simpanan_pinjaman = new FrmKo_recal_simpanan_pinjaman(this);
        }
        showForm(frmKo_recal_simpanan_pinjaman);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmKo_recal_simpanan_pinjamanActionPerformed

private void jmniko_pendidikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniko_pendidikanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_pendidikan == null) {
            frmko_pendidikan = new Frmko_pendidikan(this);
        }
        showForm(frmko_pendidikan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniko_pendidikanActionPerformed

private void jmniFrmko_transaksi_lembar_tagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_lembar_tagihanActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_lembar_tagihan == null) {
            frmko_transaksi_lembar_tagihan = new Frmko_transaksi_lembar_tagihan(this);
        }
        showForm(frmko_transaksi_lembar_tagihan);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmko_transaksi_lembar_tagihanActionPerformed

private void jmniFrmko_transaksi_tagihan_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmko_transaksi_tagihan_newActionPerformed
    // TODO add your handling code here:
    try {
        if (frmko_transaksi_tagihan_new == null) {
            frmko_transaksi_tagihan_new = new Frmko_transaksi_tagihan_new(this);
        }
        showForm(frmko_transaksi_tagihan_new);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmniFrmko_transaksi_tagihan_newActionPerformed

private void jmnuFrmrp_supplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuFrmrp_supplier1ActionPerformed
    // TODO add your handling code here:
        try {
        if (frmrp_supplier_analisa == null) {
            frmrp_supplier_analisa = new Frmrp_supplier_analisa(this);
        }
        showForm(frmrp_supplier_analisa);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmnuFrmrp_supplier1ActionPerformed

    private void jmniRTSC0101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniRTSC0101ActionPerformed
        // TODO add your handling code here:
        try {
            if (frmRTSC0101 == null) {
                frmRTSC0101 = new FrmRTSC0101(this);
            }
            showForm(frmRTSC0101);
             }catch(Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jmniRTSC0101ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        try {
            if (frmreport_category == null) {
                frmreport_category = new Frmreport_category(this);
            }
            showForm(frmreport_category);
             }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed
                

public void chekMenu() {
    
}


public void setToolBar(Integer FORM_TYPE,Integer FORM_STATE){
        ImageIcon icon=null;
               
        boolean showdisabled = false;

        btnPrint.setEnabled(showdisabled);
        btnClose.setEnabled(showdisabled);
        btnConfirm.setEnabled(showdisabled);
        btnDel.setEnabled(showdisabled);
        btnExTxt.setEnabled(showdisabled);
        btnExXls.setEnabled(showdisabled);
        btnFirst.setEnabled(showdisabled);
        btnHelp.setEnabled(showdisabled);
        btnImpTxt.setEnabled(showdisabled);
        btnImpXls.setEnabled(showdisabled);
        btnLast.setEnabled(showdisabled);
        btnNew.setEnabled(showdisabled);
        btnNext.setEnabled(showdisabled);
        btnNextScreen.setEnabled(showdisabled);
        btnPrev.setEnabled(showdisabled);
        btnPrevScreen.setEnabled(showdisabled);
        btnSave.setEnabled(showdisabled);
        btnUndo.setEnabled(showdisabled);

        switch (FORM_TYPE){
            case 0:
               btnClose.setEnabled(!showdisabled);
               btnNextScreen.setEnabled(!showdisabled);
               btnPrevScreen.setEnabled(!showdisabled);
               if (FORM_STATE == -1 || FORM_STATE == 0 ) {
                    btnDel.setEnabled(!showdisabled);
                    btnConfirm.setEnabled(!showdisabled);
                    btnExTxt.setEnabled(!showdisabled);
                    btnExXls.setEnabled(!showdisabled);
                    btnFirst.setEnabled(!showdisabled);
                    btnHelp.setEnabled(!showdisabled);
                    btnImpTxt.setEnabled(!showdisabled);
                    btnImpXls.setEnabled(!showdisabled);
                    btnLast.setEnabled(!showdisabled);
                    btnNew.setEnabled(!showdisabled);
                    btnNext.setEnabled(!showdisabled);
                    btnPrev.setEnabled(!showdisabled);                   
                    btnPrint.setEnabled(!showdisabled);
               }
               
              if (FORM_STATE == 0 || FORM_STATE == 1 ) {
                  if (FORM_STATE == 0) {
                    btnDel.setEnabled(!showdisabled);
                  }else {
                    btnDel.setEnabled(showdisabled);
                  }
                  btnSave.setEnabled(!showdisabled);
                  btnUndo.setEnabled(!showdisabled);                  
              }
              
               if (FORM_STATE == 2 || FORM_STATE == 5) {
                  btnFirst.setEnabled(!showdisabled);
                  btnLast.setEnabled(!showdisabled);
                  btnNext.setEnabled(!showdisabled);
                  btnPrev.setEnabled(!showdisabled);   
               }
               if (FORM_STATE == 3) {
                  btnPrint.setEnabled(!showdisabled);
                  btnNew.setEnabled(!showdisabled);
                  btnDel.setEnabled(!showdisabled);
                  btnSave.setEnabled(!showdisabled);
                  btnConfirm.setEnabled(!showdisabled);
               }
               
               if (FORM_STATE == 4) {
                    btnNew.setEnabled(!showdisabled);
                    btnSave.setEnabled(!showdisabled);
                    btnDel.setEnabled(!showdisabled);
                    btnConfirm.setEnabled(!showdisabled);
                    btnFirst.setEnabled(!showdisabled);
                    btnHelp.setEnabled(!showdisabled);
                    btnLast.setEnabled(!showdisabled);
                    btnNext.setEnabled(!showdisabled);
                    btnPrev.setEnabled(!showdisabled);                 
               }
               if (FORM_STATE == 6) {
                  btnNew.setEnabled(!showdisabled);
                  btnUndo.setEnabled(!showdisabled);
                  btnDel.setEnabled(!showdisabled);
                  btnSave.setEnabled(!showdisabled);
                  btnConfirm.setEnabled(!showdisabled);
               }
               if (FORM_STATE == 7) {
                  btnPrint.setEnabled(!showdisabled);
                  btnNew.setEnabled(!showdisabled);
                  btnConfirm.setEnabled(!showdisabled);
                  btnFirst.setEnabled(!showdisabled);
                  btnHelp.setEnabled(!showdisabled);
                  btnLast.setEnabled(!showdisabled);
                  btnNext.setEnabled(!showdisabled);
                  btnPrev.setEnabled(!showdisabled);
               }
               if (FORM_STATE == 8) {
                  btnPrint.setEnabled(!showdisabled);
                  btnSave.setEnabled(!showdisabled);
                  btnConfirm.setEnabled(!showdisabled);
                  btnFirst.setEnabled(!showdisabled);
                  btnHelp.setEnabled(!showdisabled);
                  btnLast.setEnabled(!showdisabled);
                  btnNext.setEnabled(!showdisabled);
                  btnPrev.setEnabled(!showdisabled);
               }
              break;
            case 1:
                btnClose.setEnabled(!showdisabled);
                btnConfirm.setEnabled(!showdisabled);
                btnNextScreen.setEnabled(!showdisabled);
                btnPrevScreen.setEnabled(!showdisabled);
                break;
            case 2:
                btnClose.setEnabled(!showdisabled);
                btnConfirm.setEnabled(!showdisabled);
                btnNextScreen.setEnabled(!showdisabled);
                btnPrevScreen.setEnabled(!showdisabled);
                break;
            case 3:
                btnPrint.setEnabled(!showdisabled);
                btnClose.setEnabled(!showdisabled);
                btnConfirm.setEnabled(!showdisabled);
                break;

        }
    }

private void setToolTip(){
        btnClose.createToolTip();
        btnClose.setToolTipText("Close");
        btnConfirm.setToolTipText("Execute");
        btnDel.setToolTipText("Delete");
        btnPrint.setToolTipText("Print");
        btnExTxt.setToolTipText("Export To Text Files");
        btnExXls.setToolTipText("Export To Csv Files");
        btnFirst.setToolTipText("Move First");
        btnHelp.setToolTipText("Help");
        btnImpTxt.setToolTipText("Import From Text Files");
        btnImpXls.setToolTipText("Import From Excels Files");
        btnLast.setToolTipText("Move Last");
        btnNew.setToolTipText("New");
        btnNext.setToolTipText("Move Next");
        btnNextScreen.setToolTipText("Next Screen");
        btnPrev.setToolTipText("Move Previous");
        btnPrevScreen.setToolTipText("Previous Screen");
        btnSave.setToolTipText("Save");
        btnUndo.setToolTipText("Undo");
}
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainFrame().setVisible(true);
            }
        });
    }


        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnConfirm;
    public javax.swing.JButton btnDel;
    public javax.swing.JButton btnExTxt;
    public javax.swing.JButton btnExXls;
    public javax.swing.JButton btnFirst;
    public javax.swing.JButton btnHelp;
    public javax.swing.JButton btnImpTxt;
    public javax.swing.JButton btnImpXls;
    public javax.swing.JButton btnLast;
    public javax.swing.JButton btnNew;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnNextScreen;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnPrevScreen;
    public javax.swing.JButton btnPrint;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUndo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLblUser;
    public javax.swing.JLabel jLblWarning;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel jlblSystemDateTime;
    private javax.swing.JMenuItem jmniAPDebitNote;
    private javax.swing.JMenuItem jmniAPInvoice;
    private javax.swing.JMenuItem jmniAPPayment;
    private javax.swing.JMenuItem jmniAktivitasUser;
    private javax.swing.JMenuItem jmniAnggota;
    private javax.swing.JMenuItem jmniBank;
    private javax.swing.JMenuItem jmniCustomer;
    private javax.swing.JMenuItem jmniDelivery;
    private javax.swing.JMenuItem jmniDepartemen;
    private javax.swing.JMenuItem jmniDiscount;
    private javax.swing.JMenuItem jmniEntriStockOpname;
    private javax.swing.JMenuItem jmniExit;
    private javax.swing.JMenuItem jmniFTPS0302;
    private javax.swing.JMenuItem jmniFrmIn_Option;
    private javax.swing.JMenuItem jmniFrmKo_recal_simpanan_pinjaman;
    private javax.swing.JMenuItem jmniFrmRFKK01;
    private javax.swing.JMenuItem jmniFrmRFKK02;
    private javax.swing.JMenuItem jmniFrmRMKK03;
    private javax.swing.JMenuItem jmniFrmRMKK04;
    private javax.swing.JMenuItem jmniFrmRMKK05;
    private javax.swing.JMenuItem jmniFrmRMKK06;
    private javax.swing.JMenuItem jmniFrmRMKK07;
    private javax.swing.JMenuItem jmniFrmRMKK08;
    private javax.swing.JMenuItem jmniFrmRMKK21;
    private javax.swing.JMenuItem jmniFrmRMKO01;
    private javax.swing.JMenuItem jmniFrmRMKO03;
    private javax.swing.JMenuItem jmniFrmRMKO04;
    private javax.swing.JMenuItem jmniFrmRMKO05;
    private javax.swing.JMenuItem jmniFrmRMKO6;
    private javax.swing.JMenuItem jmniFrmRTKK01;
    private javax.swing.JMenuItem jmniFrmRTKK02;
    private javax.swing.JMenuItem jmniFrmRTKK03;
    private javax.swing.JMenuItem jmniFrmRTKK04;
    private javax.swing.JMenuItem jmniFrmRTKO02;
    private javax.swing.JMenuItem jmniFrmRTKO03;
    private javax.swing.JMenuItem jmniFrmRTKO04;
    private javax.swing.JMenuItem jmniFrmRTKO05;
    private javax.swing.JMenuItem jmniFrmRTKO06;
    private javax.swing.JMenuItem jmniFrmRTKO07;
    private javax.swing.JMenuItem jmniFrmRTKO08;
    private javax.swing.JMenuItem jmniFrmRTPS03;
    private javax.swing.JMenuItem jmniFrmRTSP10;
    private javax.swing.JMenuItem jmniFrmar_cnote;
    private javax.swing.JMenuItem jmniFrmar_invoice;
    private javax.swing.JMenuItem jmniFrmar_pos_close;
    private javax.swing.JMenuItem jmniFrmar_pos_counter;
    private javax.swing.JMenuItem jmniFrmar_pos_open;
    private javax.swing.JMenuItem jmniFrmar_pos_return;
    private javax.swing.JMenuItem jmniFrmgl_account;
    private javax.swing.JMenuItem jmniFrmgl_group;
    private javax.swing.JMenuItem jmniFrmgl_group_data_entry;
    private javax.swing.JMenuItem jmniFrmgl_kalender;
    private javax.swing.JMenuItem jmniFrmgl_option;
    private javax.swing.JMenuItem jmniFrmgl_rab;
    private javax.swing.JMenuItem jmniFrmgl_sumber_data;
    private javax.swing.JMenuItem jmniFrmgl_transaksi_journal;
    private javax.swing.JMenuItem jmniFrmgl_transaksi_rab;
    private javax.swing.JMenuItem jmniFrmin_so_process;
    private javax.swing.JMenuItem jmniFrmko_auto_persetujuan;
    private javax.swing.JMenuItem jmniFrmko_transaksi_bayar_toko;
    private javax.swing.JMenuItem jmniFrmko_transaksi_lembar_tagihan;
    private javax.swing.JMenuItem jmniFrmko_transaksi_registrasi;
    private javax.swing.JMenuItem jmniFrmko_transaksi_revisi_simpanan;
    private javax.swing.JMenuItem jmniFrmko_transaksi_tagihan;
    private javax.swing.JMenuItem jmniFrmko_transaksi_tagihan_new;
    private javax.swing.JMenuItem jmniFrmko_util_import_toko;
    private javax.swing.JMenuItem jmniFrmlabel_product;
    private javax.swing.JMenuItem jmniFrmposting_journal_entry;
    private javax.swing.JMenuItem jmniFrmproses_day_end_to_gl;
    private javax.swing.JMenuItem jmniFrmrp_anggota;
    private javax.swing.JMenuItem jmniFrmrp_anggota_simpanan;
    private javax.swing.JMenuItem jmniFrmrp_brand;
    private javax.swing.JMenuItem jmniFrmrp_category;
    private javax.swing.JMenuItem jmniFrmrp_customer;
    private javax.swing.JMenuItem jmniFrmrp_departemen;
    private javax.swing.JMenuItem jmniFrmrp_discount;
    private javax.swing.JMenuItem jmniFrmrp_function;
    private javax.swing.JMenuItem jmniFrmrp_goods_issue;
    private javax.swing.JMenuItem jmniFrmrp_goods_receipt;
    private javax.swing.JMenuItem jmniFrmrp_goods_transfer;
    private javax.swing.JMenuItem jmniFrmrp_jabatan;
    private javax.swing.JMenuItem jmniFrmrp_kartu_stok;
    private javax.swing.JMenuItem jmniFrmrp_measure;
    private javax.swing.JMenuItem jmniFrmrp_mutasi_simpanan;
    private javax.swing.JMenuItem jmniFrmrp_mutasi_stok;
    private javax.swing.JMenuItem jmniFrmrp_payment_term;
    private javax.swing.JMenuItem jmniFrmrp_pinjaman;
    private javax.swing.JMenuItem jmniFrmrp_pinjaman_tipe;
    private javax.swing.JMenuItem jmniFrmrp_potong_gaji;
    private javax.swing.JMenuItem jmniFrmrp_price;
    private javax.swing.JMenuItem jmniFrmrp_product;
    private javax.swing.JMenuItem jmniFrmrp_purchase_order;
    private javax.swing.JMenuItem jmniFrmrp_purchase_receive;
    private javax.swing.JMenuItem jmniFrmrp_purchase_return;
    private javax.swing.JMenuItem jmniFrmrp_salesman;
    private javax.swing.JMenuItem jmniFrmrp_slip_anggota;
    private javax.swing.JMenuItem jmniFrmrp_transaksi_mohon;
    private javax.swing.JMenuItem jmniFrmrp_warehouse;
    private javax.swing.JMenuItem jmniFrmsetting_common_rpt;
    private javax.swing.JMenuItem jmniFrmsetting_financial_rpt;
    private javax.swing.JMenuItem jmniFungsi;
    private javax.swing.JMenuItem jmniGenerator;
    private javax.swing.JMenuItem jmniGroup;
    private javax.swing.JMenuItem jmniJabatan;
    private javax.swing.JMenuItem jmniKategori;
    private javax.swing.JMenuItem jmniKeluarLainlain;
    private javax.swing.JMenuItem jmniLembarKerjaStockOpname;
    private javax.swing.JMenuItem jmniLogOut;
    private javax.swing.JMenuItem jmniMaintenaceUser;
    private javax.swing.JMenuItem jmniMasterCompany;
    private javax.swing.JMenuItem jmniMeasure;
    private javax.swing.JMenuItem jmniModule;
    private javax.swing.JMenuItem jmniOrderPembelian;
    private javax.swing.JMenuItem jmniPOS;
    private javax.swing.JMenuItem jmniPaymentTerm;
    private javax.swing.JMenuItem jmniPembayaranPinjaman;
    private javax.swing.JMenuItem jmniPermohonanPinjaman;
    private javax.swing.JMenuItem jmniPersetujuanPinjaman;
    private javax.swing.JMenuItem jmniPersetujuanPinjamanRubah;
    private javax.swing.JMenuItem jmniPinjaman;
    private javax.swing.JMenuItem jmniPrice;
    private javax.swing.JMenuItem jmniProductInfo;
    private javax.swing.JMenuItem jmniProductPrice;
    private javax.swing.JMenuItem jmniRTSC0101;
    private javax.swing.JMenuItem jmniResetPassword;
    private javax.swing.JMenuItem jmniSalesOrder;
    private javax.swing.JMenuItem jmniSalesReturn;
    private javax.swing.JMenuItem jmniSalesman;
    private javax.swing.JMenuItem jmniSetor_Simpanan;
    private javax.swing.JMenuItem jmniSupplier;
    private javax.swing.JMenuItem jmniTarikSimpanan;
    private javax.swing.JMenuItem jmniTerimaLainLain;
    private javax.swing.JMenuItem jmniTransferAntarGudang;
    private javax.swing.JMenuItem jmniWarehouse;
    private javax.swing.JMenuItem jmniWarehouseType;
    private javax.swing.JMenuItem jmniap_account_set;
    private javax.swing.JMenuItem jmniap_option;
    private javax.swing.JMenuItem jmniar_account_set;
    private javax.swing.JMenuItem jmniar_option;
    private javax.swing.JMenuItem jmniar_pos_cashier;
    private javax.swing.JMenuItem jmniar_pos_option;
    private javax.swing.JMenuItem jmniin_account_set;
    private javax.swing.JMenuItem jmniin_prosesbulanan;
    private javax.swing.JMenuItem jmniko_Auto_Pot_Simpanan;
    private javax.swing.JMenuItem jmniko_account_set;
    private javax.swing.JMenuItem jmniko_monthly_process;
    private javax.swing.JMenuItem jmniko_option;
    private javax.swing.JMenuItem jmniko_pendidikan;
    private javax.swing.JMenuItem jmnipenerimaanpembelian;
    private javax.swing.JMenu jmnuAkunting;
    private javax.swing.JMenuItem jmnuBrand;
    private javax.swing.JMenuItem jmnuFTSO01;
    private javax.swing.JMenuItem jmnuFTSO02;
    private javax.swing.JMenuItem jmnuFrmFMAS01;
    private javax.swing.JMenuItem jmnuFrmko_transaksi_cair_pinjaman;
    private javax.swing.JMenuItem jmnuFrmrp_supplier;
    private javax.swing.JMenuItem jmnuFrmrp_supplier1;
    private javax.swing.JMenu jmnuKoperasi;
    private javax.swing.JMenu jmnuMInventory;
    private javax.swing.JMenu jmnuMOptional;
    private javax.swing.JMenu jmnuMPembelian;
    private javax.swing.JMenu jmnuMPenjualan;
    private javax.swing.JMenu jmnuMProducts;
    private javax.swing.JMenu jmnuMaster;
    private javax.swing.JMenu jmnuParameter;
    private javax.swing.JMenu jmnuRA_FinancialReport;
    private javax.swing.JMenu jmnuRA_Master;
    private javax.swing.JMenu jmnuRA_Transaksi;
    private javax.swing.JMenu jmnuRI_Master;
    private javax.swing.JMenu jmnuRK_Master;
    private javax.swing.JMenu jmnuRPAP_Master;
    private javax.swing.JMenu jmnuRPAP_Transaksi;
    private javax.swing.JMenu jmnuRPIn_Transaksi;
    private javax.swing.JMenu jmnuRPJ_Master;
    private javax.swing.JMenu jmnuRP_J_Transaksi;
    private javax.swing.JMenu jmnuReport_Akunting;
    private javax.swing.JMenu jmnuReport_Common;
    private javax.swing.JMenu jmnuReport_Inventory;
    private javax.swing.JMenu jmnuReport_Koperasi;
    private javax.swing.JMenu jmnuReport_Option;
    private javax.swing.JMenu jmnuReport_Pembelian;
    private javax.swing.JMenu jmnuReport_Penjualan;
    private javax.swing.JMenu jmnuReports;
    private javax.swing.JMenuItem jmnuReturPembelian;
    private javax.swing.JMenu jmnuSimpanPinjam;
    private javax.swing.JMenu jmnuStockOpname;
    private javax.swing.JMenu jmnuTInventory;
    private javax.swing.JMenu jmnuTPembelian;
    private javax.swing.JMenu jmnuTPenjualan;
    private javax.swing.JMenu jmnuTransaksi;
    private javax.swing.JMenuItem jmnuko_Auto_Pot_Pinjaman;
    // End of variables declaration//GEN-END:variables

     
    private void showForm(Object obj) {
        JInternalFrame jf = null;
        if (obj instanceof JInternalFrame) {
            jf = (JInternalFrame) obj;
            if (!jf.isVisible()) {
                jDesktopPane1.add(jf);
            }
            jf.setVisible(true);
            try {        
                jf.setMaximum(true);
                jf.setSelected(true);    
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }        
        }
        jLblWarning.setText("");
        
    }

    private void logOff() {
        
        JInternalFrame[] ji = jDesktopPane1.getAllFrames();
        for (int i = 0; i < ji.length; i++) {
                ji[i].doDefaultCloseAction();
        }
        setToolBar(-1,0);
        
        login.setModal(true);
        login.setVisible(true);
        
        jLblUser.setText("User : " + GlobalUtils.getAuditUser() + " " + GlobalUtils.currentdir + "/" + GlobalUtils.company +"@"+appsettinghandler.getServerIP() );
        
        try {
            setMenuAll();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
 
    public void setMenuAll() throws CodeException {
      int menucount =  jMenuMain.getMenuCount();        
      for (int i =0 ; i< menucount; i++){
          JMenu jmenu = jMenuMain.getMenu(i);
          
          cekMenu(jmenu);
                    
      }
      if (appsettinghandler.getisindevelopment()){
      mm.creategroupdetail();
        }
    }

    private Component[] cekMenu(JMenu jmenu) throws CodeException {
        Component[] me = jmenu.getMenuComponents();
        
        for (int i = 0; i< me.length; i++) {
            if (me[i] instanceof JMenu) {
                Component[] me2 =  cekMenu((JMenu)me[i]);
            }else if(me[i] instanceof JMenuItem) {
                JMenuItem jmi = (JMenuItem) me[i];
                
                
                /// ini buat ngisi mastermodule  *** Jangan dihapus  ***
                if  (jmi.getName() != null&&appsettinghandler.getisindevelopment()) {
                    mm = new MasterModuleExt();
                    if (!mm.initdata(jmi.getName())){
                        mm.insert();
                        mm.setModule(jmi.getName());
                        mm.setDescription(jmi.getText());
                        mm.update();
                    } 
                    //System.out.println(jmi.getName());
                  
                }
                
                
                jmi.setEnabled(false);
                int j=0;
                if (!"LogOut".equalsIgnoreCase(jmi.getName()) && !"Exit".equalsIgnoreCase(jmi.getName()) && !"Reset Password".equalsIgnoreCase(jmi.getName()) && !"calculator".equalsIgnoreCase(jmi.getName())) {
                    for (j=0;j<GlobalUtils.mastergroupdetails.size();j++){
                        MastergroupdetailExt mgd=GlobalUtils.mastergroupdetails.get(j);
                        if (jmi.getName()!=null){
                            String modul=mgd.getModule();
                            String name=jmi.getName();
                            if (modul.equalsIgnoreCase(name)){
                                if (!jmi.isEnabled()){
                                jmi.setEnabled(mgd.getRead()>0);
                                }
                            }
                        }
                    }
                }else {
                    jmi.setEnabled(true);
                }
            }
            
        }
        return me;
    }          
    
    
    public void setIcon(String module) {
       try {
            
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public void gotoproductprice(String product_code, String price_code) {
        try {
            if (frmin_product_price_info == null) {
                frmin_product_price_info = new Frmin_product_price_info(this);
            }
            showForm(frmin_product_price_info);
            frmin_product_price_info.findata(product_code,price_code);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void gotoproductinfo(String product_code) {
        try {
            if (frmin_product == null) {
                frmin_product = new Frmin_product(this);
            }
            showForm(frmin_product);
            frmin_product.findata(product_code);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
