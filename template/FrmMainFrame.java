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
import kopkar.component.Frmko_transaksi_bayar;
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
import kopkar.component.Frmap_purchase_order;
import kopkar.component.Frmap_purchase_receive;
import kopkar.component.Frmap_purchase_return;
import kopkar.component.Frmap_supplier;
import kopkar.component.Frmar_customer;
import kopkar.component.Frmar_pos_sales;
import kopkar.component.Frmar_sales_delivery;
import kopkar.component.Frmar_sales_order;
import kopkar.component.Frmar_sales_return;
import kopkar.component.Frmin_brand;
import kopkar.component.Frmin_category;
import kopkar.component.Frmin_discount;
import kopkar.component.Frmin_function;
import kopkar.component.Frmin_goods_issue;
import kopkar.component.Frmin_goods_receipt;
import kopkar.component.Frmin_goods_transfer;
import kopkar.component.Frmin_measure;
import kopkar.component.Frmin_price;
import kopkar.component.Frmin_product;
import kopkar.component.Frmin_so_entry;
import kopkar.component.Frmin_so_sheet;
import kopkar.component.Frmin_warehouse;
import kopkar.component.Frmin_warehouse_type;
import kopkar.component.Frmko_Auto_Pot_Pinjaman;
import kopkar.component.Frmko_Auto_Pot_Simpanan;
import kopkar.component.Frmko_anggota;
import kopkar.component.Frmko_departemen;
import kopkar.component.Frmko_jabatan;
import kopkar.component.Frmko_pinjaman;
import kopkar.component.Frmko_pinjaman_tipe;
import kopkar.component.Frmko_transaksi_mohon;
import kopkar.component.Frmko_transaksi_registrasi;
import kopkar.component.Frmko_transaksi_setor_simpanan;
import kopkar.component.Frmko_transaksi_setuju;
import kopkar.component.Frmko_transaksi_tarik_simpanan;
import kopkar.component.Frmop_payment_term;
import kopkar.component.Frmop_salesman;
import kopkar.component.Frmrp_anggota;
import kopkar.component.Frmrp_anggota_simpanan;
import kopkar.component.Frmrp_brand;
import utils.CodeException;
import utils.GlobalUtils;



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
    private Frmrp_anggota_simpanan frmrp_anggota_simpanan;
    private Frmrp_brand frmrp_brand;
//generateformdeclare
    private Frmtemplate frmtemplate;
//generateformdeclareend

    /** Creates new form MainFrame */
    public FrmMainFrame() {
        initComponents();

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
        jmniLogOut = new javax.swing.JMenuItem();
        jmniExit = new javax.swing.JMenuItem();
        jmnuMaster = new javax.swing.JMenu();
        jmnuMPembelian = new javax.swing.JMenu();
        jmniSupplier = new javax.swing.JMenuItem();
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
        jmnuMPenjualan = new javax.swing.JMenu();
        jmniCustomer = new javax.swing.JMenuItem();
        jmnuMOptional = new javax.swing.JMenu();
        jmniPaymentTerm = new javax.swing.JMenuItem();
        jmniSalesman = new javax.swing.JMenuItem();
        jmnuKoperasi = new javax.swing.JMenu();
        jmniDepartemen = new javax.swing.JMenuItem();
        jmniJabatan = new javax.swing.JMenuItem();
        jmniAnggota = new javax.swing.JMenuItem();
        jmniPinjaman = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmnuTransaksi = new javax.swing.JMenu();
        jmnuTPembelian = new javax.swing.JMenu();
        jmniOrderPembelian = new javax.swing.JMenuItem();
        jmnipenerimaanpembelian = new javax.swing.JMenuItem();
        jmnuReturPembelian = new javax.swing.JMenuItem();
        jmnuTInventory = new javax.swing.JMenu();
        jmniTerimaLainLain = new javax.swing.JMenuItem();
        jmniKeluarLainlain = new javax.swing.JMenuItem();
        jmniTransferAntarGudang = new javax.swing.JMenuItem();
        jmnuStockOpname = new javax.swing.JMenu();
        jmniLembarKerjaStockOpname = new javax.swing.JMenuItem();
        jmniEntriStockOpname = new javax.swing.JMenuItem();
        jmnuTPenjualan = new javax.swing.JMenu();
        jmniSalesOrder = new javax.swing.JMenuItem();
        jmniDelivery = new javax.swing.JMenuItem();
        jmniSalesReturn = new javax.swing.JMenuItem();
        jmniPOS = new javax.swing.JMenuItem();
        jmnuSimpanPinjam = new javax.swing.JMenu();
        jmniFrmko_transaksi_registrasi = new javax.swing.JMenuItem();
        jmniSetor_Simpanan = new javax.swing.JMenuItem();
        jmniTarikSimpanan = new javax.swing.JMenuItem();
        jmniPermohonanPinjaman = new javax.swing.JMenuItem();
        jmniPersetujuanPinjaman = new javax.swing.JMenuItem();
        jmniPembayaranPinjaman = new javax.swing.JMenuItem();
        jmnuko_Auto_Pot_Pinjaman = new javax.swing.JMenuItem();
        jmniko_Auto_Pot_Simpanan = new javax.swing.JMenuItem();
        jmnuAkunting = new javax.swing.JMenu();
        jmnuReport = new javax.swing.JMenu();
        jmnuReport_Master = new javax.swing.JMenu();
        jmnuRpt_Master_Koperasi = new javax.swing.JMenu();
        jmniFrmrp_anggota = new javax.swing.JMenuItem();
        jmniFrmrp_anggota_simpanan = new javax.swing.JMenuItem();
        jmnuRpt_Inventory = new javax.swing.JMenu();
        jmniFrmrp_brand = new javax.swing.JMenuItem();
//generatemenuinit
        jmniFrmtemplate = new javax.swing.JMenuItem();
//generatemenuinitend
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KOPKAR V.1.0.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setFont(new java.awt.Font("Dialog", 1, 10));

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
        jLabel1.setBounds(0, -10, 1010, 770);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLblUser.setFont(new java.awt.Font("Dialog", 1, 10));
        jLblUser.setText("Loged User Name");

        jLblWarning.setFont(new java.awt.Font("Dialog", 1, 14));
        jLblWarning.setForeground(new java.awt.Color(255, 51, 102));
        jLblWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlblSystemDateTime.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblSystemDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblSystemDateTime.setText("System Date Time ");

        jmnuParameter.setMnemonic('O');
        jmnuParameter.setText("Parameter");

        jmniAktivitasUser.setText("Aktivitas User");
        jmniAktivitasUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAktivitasUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniAktivitasUser);

        jmniMaintenaceUser.setText("Maintenace User");
        jmniMaintenaceUser.setName("FrmMasteruser"); // NOI18N
        jmniMaintenaceUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMaintenaceUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMaintenaceUser);

        jmniResetPassword.setText("Reset Password");
        jmniResetPassword.setName("Reset Password"); // NOI18N
        jmniResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniResetPasswordActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniResetPassword);

        jmniGroup.setText("Group");
        jmniGroup.setName("FrmMastergroup"); // NOI18N
        jmniGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGroupActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGroup);

        jmniModule.setText("Module");
        jmniModule.setName("FrmMastermodule"); // NOI18N
        jmniModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniModuleActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniModule);

        jmniMasterCompany.setText("Company");
        jmniMasterCompany.setName("FrmMasterCompany"); // NOI18N
        jmniMasterCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMasterCompanyActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMasterCompany);

        jmniGenerator.setText("Generator");
        jmniGenerator.setName("FrmGenerator"); // NOI18N
        jmniGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGeneratorActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGenerator);

        jMenu1.setText("Report");

        jMenuItem14.setText("Setting Parameter Program ");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jmnuParameter.add(jMenu1);

        jmniLogOut.setText("Log Out");
        jmniLogOut.setName("LogOut"); // NOI18N
        jmniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniLogOutActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniLogOut);

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

        jmnuMPembelian.setText("Pembelian");

        jmniSupplier.setText("Supplier");
        jmniSupplier.setName("Frmap_supplier"); // NOI18N
        jmniSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSupplierActionPerformed(evt);
            }
        });
        jmnuMPembelian.add(jmniSupplier);

        jmnuMaster.add(jmnuMPembelian);

        jmnuMInventory.setText("Inventory");

        jmnuMProducts.setText("Product");

        jmniProductInfo.setText("Product Info");
        jmniProductInfo.setName("Frmin_product"); // NOI18N
        jmniProductInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniProductInfoActionPerformed(evt);
            }
        });
        jmnuMProducts.add(jmniProductInfo);

        jmniProductPrice.setText("Product Price");
        jmnuMProducts.add(jmniProductPrice);

        jmnuMInventory.add(jmnuMProducts);

        jmnuBrand.setText("Brand");
        jmnuBrand.setName("Frmin_brand"); // NOI18N
        jmnuBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBrandActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmnuBrand);

        jmniKategori.setText("Kategori");
        jmniKategori.setName("Frmin_category"); // NOI18N
        jmniKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniKategoriActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniKategori);

        jmniFungsi.setText("Fungsi");
        jmniFungsi.setName("Frmin_function"); // NOI18N
        jmniFungsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFungsiActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniFungsi);

        jmniPrice.setText("Price");
        jmniPrice.setName("Frmin_price"); // NOI18N
        jmniPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPriceActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniPrice);

        jmniDiscount.setText("Discount");
        jmniDiscount.setName("Frmin_discount"); // NOI18N
        jmniDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDiscountActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniDiscount);

        jmniMeasure.setText("Measure");
        jmniMeasure.setName("Frmin_measure"); // NOI18N
        jmniMeasure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMeasureActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniMeasure);

        jmniWarehouseType.setText("Warehouse Type");
        jmniWarehouseType.setName("Frmin_warehouse_type"); // NOI18N
        jmniWarehouseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniWarehouseTypeActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniWarehouseType);

        jmniWarehouse.setText("Warehouse");
        jmniWarehouse.setName("Frmin_warehouse"); // NOI18N
        jmniWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniWarehouseActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmniWarehouse);

        jmnuMaster.add(jmnuMInventory);

        jmnuMPenjualan.setText("Penjualan");

        jmniCustomer.setText("Customer");
        jmniCustomer.setName("Frmar_customer"); // NOI18N
        jmniCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniCustomerActionPerformed(evt);
            }
        });
        jmnuMPenjualan.add(jmniCustomer);

        jmnuMaster.add(jmnuMPenjualan);

        jmnuMOptional.setText("Optional");

        jmniPaymentTerm.setText("Payment Term");
        jmniPaymentTerm.setName("op_payment_term"); // NOI18N
        jmniPaymentTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPaymentTermActionPerformed(evt);
            }
        });
        jmnuMOptional.add(jmniPaymentTerm);

        jmniSalesman.setText("Salesman");
        jmniSalesman.setName("op_salesman"); // NOI18N
        jmniSalesman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesmanActionPerformed(evt);
            }
        });
        jmnuMOptional.add(jmniSalesman);

        jmnuMaster.add(jmnuMOptional);

        jmnuKoperasi.setText("Koperasi");

        jmniDepartemen.setText("Departemen");
        jmniDepartemen.setName("Frmko_departemen"); // NOI18N
        jmniDepartemen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDepartemenActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniDepartemen);

        jmniJabatan.setText("Jabatan");
        jmniJabatan.setName("Frmko_jabatan"); // NOI18N
        jmniJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniJabatanActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniJabatan);

        jmniAnggota.setText("Anggota");
        jmniAnggota.setName("Frmko_anggota"); // NOI18N
        jmniAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAnggotaActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniAnggota);

        jmniPinjaman.setText("Pinjaman");
        jmniPinjaman.setName("Frmko_pinjaman"); // NOI18N
        jmniPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPinjamanActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jmniPinjaman);

        jMenuItem1.setText("Tipe Pinjaman");
        jMenuItem1.setName("Frmko_pinjaman_tipe"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmnuKoperasi.add(jMenuItem1);

        jmnuMaster.add(jmnuKoperasi);

        jMenuMain.add(jmnuMaster);

        jmnuTransaksi.setText("Transaksi");

        jmnuTPembelian.setText("Pembelian");

        jmniOrderPembelian.setText("Order Pembelian");
        jmniOrderPembelian.setName("Frmap_purchase_order"); // NOI18N
        jmniOrderPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniOrderPembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmniOrderPembelian);

        jmnipenerimaanpembelian.setText("Penerimaan Pembelian");
        jmnipenerimaanpembelian.setName("Frmap_purchase_receive"); // NOI18N
        jmnipenerimaanpembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnipenerimaanpembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmnipenerimaanpembelian);

        jmnuReturPembelian.setText("Retur Pembelian");
        jmnuReturPembelian.setName("Frmap_purchase_return"); // NOI18N
        jmnuReturPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuReturPembelianActionPerformed(evt);
            }
        });
        jmnuTPembelian.add(jmnuReturPembelian);

        jmnuTransaksi.add(jmnuTPembelian);

        jmnuTInventory.setText("Inventory");

        jmniTerimaLainLain.setText("Terima Lain-lain");
        jmniTerimaLainLain.setName("Frmin_goods_receipt"); // NOI18N
        jmniTerimaLainLain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTerimaLainLainActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniTerimaLainLain);

        jmniKeluarLainlain.setText("Keluar Lain-lain");
        jmniKeluarLainlain.setName("Frmin_goods_issue"); // NOI18N
        jmniKeluarLainlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniKeluarLainlainActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniKeluarLainlain);

        jmniTransferAntarGudang.setText("Transfer Antar Gudang");
        jmniTransferAntarGudang.setName("Frmin_goods_transfer"); // NOI18N
        jmniTransferAntarGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTransferAntarGudangActionPerformed(evt);
            }
        });
        jmnuTInventory.add(jmniTransferAntarGudang);

        jmnuStockOpname.setText("Stock Opname");
        jmnuStockOpname.setName("StockOpname"); // NOI18N

        jmniLembarKerjaStockOpname.setText("Lembar Kerja Stock Opname");
        jmniLembarKerjaStockOpname.setName("Frmin_so_sheet"); // NOI18N
        jmniLembarKerjaStockOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniLembarKerjaStockOpnameActionPerformed(evt);
            }
        });
        jmnuStockOpname.add(jmniLembarKerjaStockOpname);

        jmniEntriStockOpname.setText("Entri Stock Opname");
        jmniEntriStockOpname.setName("Frmin_so_entry"); // NOI18N
        jmniEntriStockOpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniEntriStockOpnameActionPerformed(evt);
            }
        });
        jmnuStockOpname.add(jmniEntriStockOpname);

        jmnuTInventory.add(jmnuStockOpname);

        jmnuTransaksi.add(jmnuTInventory);

        jmnuTPenjualan.setText("Penjualan");

        jmniSalesOrder.setText("Sales Order");
        jmniSalesOrder.setName("Frmar_sales_order"); // NOI18N
        jmniSalesOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesOrderActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniSalesOrder);

        jmniDelivery.setText("Delivery");
        jmniDelivery.setName("Frmar_sales_delivery"); // NOI18N
        jmniDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniDeliveryActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniDelivery);

        jmniSalesReturn.setText("Sales Return");
        jmniSalesReturn.setName("Frmar_sales_return"); // NOI18N
        jmniSalesReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSalesReturnActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniSalesReturn);

        jmniPOS.setText("Point Of Sales");
        jmniPOS.setName("Frmar_pos_sales"); // NOI18N
        jmniPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPOSActionPerformed(evt);
            }
        });
        jmnuTPenjualan.add(jmniPOS);

        jmnuTransaksi.add(jmnuTPenjualan);

        jMenuMain.add(jmnuTransaksi);

        jmnuSimpanPinjam.setText("Simpan Pinjam");

        jmniFrmko_transaksi_registrasi.setText("Registrasi Anggota");
        jmniFrmko_transaksi_registrasi.setName("Frmko_transaksi_registrasi"); // NOI18N
        jmniFrmko_transaksi_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmko_transaksi_registrasiActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniFrmko_transaksi_registrasi);

        jmniSetor_Simpanan.setText("Setor Simpanan");
        jmniSetor_Simpanan.setName("Frmko_transaksi_setor_simpanan"); // NOI18N
        jmniSetor_Simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniSetor_SimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniSetor_Simpanan);

        jmniTarikSimpanan.setText("Tarik Simpanan");
        jmniTarikSimpanan.setName("Frmko_transaksi_tarik_simpanan"); // NOI18N
        jmniTarikSimpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniTarikSimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniTarikSimpanan);

        jmniPermohonanPinjaman.setText("Permohonan Pinjaman");
        jmniPermohonanPinjaman.setName("Frmko_transaksi_mohon"); // NOI18N
        jmniPermohonanPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPermohonanPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPermohonanPinjaman);

        jmniPersetujuanPinjaman.setText("Persetujuan Pinjaman");
        jmniPersetujuanPinjaman.setName("Frmko_transaksi_setuju"); // NOI18N
        jmniPersetujuanPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPersetujuanPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPersetujuanPinjaman);

        jmniPembayaranPinjaman.setText("Pembayaran Pinjaman");
        jmniPembayaranPinjaman.setName("Frmko_transaksi_bayar"); // NOI18N
        jmniPembayaranPinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniPembayaranPinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniPembayaranPinjaman);

        jmnuko_Auto_Pot_Pinjaman.setText("Proses Otomatis Potongan Pinjaman");
        jmnuko_Auto_Pot_Pinjaman.setName("Frmko_Auto_Pot_Pinjaman"); // NOI18N
        jmnuko_Auto_Pot_Pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuko_Auto_Pot_PinjamanActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmnuko_Auto_Pot_Pinjaman);

        jmniko_Auto_Pot_Simpanan.setText("Proses Otomatis Potongan Simpanan");
        jmniko_Auto_Pot_Simpanan.setName("Frmko_Auto_Pot_Simpanan"); // NOI18N
        jmniko_Auto_Pot_Simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniko_Auto_Pot_SimpananActionPerformed(evt);
            }
        });
        jmnuSimpanPinjam.add(jmniko_Auto_Pot_Simpanan);

        jMenuMain.add(jmnuSimpanPinjam);

        jmnuAkunting.setText("Akunting");
        jMenuMain.add(jmnuAkunting);

        jmnuReport.setText("Report");

        jmnuReport_Master.setText("Report Master");

        jmnuRpt_Master_Koperasi.setText("Koperasi");

        jmniFrmrp_anggota.setText("Anggota");
        jmniFrmrp_anggota.setName("Frmrp_anggota"); // NOI18N
        jmniFrmrp_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_anggotaActionPerformed(evt);
            }
        });
        jmnuRpt_Master_Koperasi.add(jmniFrmrp_anggota);

        jmniFrmrp_anggota_simpanan.setText("Simpanan Anggota");
        jmniFrmrp_anggota_simpanan.setName("Frmrp_anggota_simpanan"); // NOI18N
        jmniFrmrp_anggota_simpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_anggota_simpananActionPerformed(evt);
            }
        });
        jmnuRpt_Master_Koperasi.add(jmniFrmrp_anggota_simpanan);

        jmnuReport_Master.add(jmnuRpt_Master_Koperasi);

        jmnuRpt_Inventory.setText("Inventory");

        jmniFrmrp_brand.setText("Daftar Brand");
        jmniFrmrp_brand.setName("Frmrp_brand"); // NOI18N
        jmniFrmrp_brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmrp_brandActionPerformed(evt);
            }
        });
        jmnuRpt_Inventory.add(jmniFrmrp_brand);
//generatemenuprop
	jmniFrmtemplate.setText("template");
        jmniFrmtemplate.setName("Frmtemplate"); // NOI18N
        jmniFrmtemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniFrmtemplateActionPerformed(evt);
            }
        });
        jmnuRpt_Inventory.add(jmniFrmtemplate);
//generatemenupropend

        jmnuReport_Master.add(jmnuRpt_Inventory);

        jmnuReport.add(jmnuReport_Master);

        jMenuMain.add(jmnuReport);

        setJMenuBar(jMenuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSystemDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSystemDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(jLblUser)
                    .addComponent(jLblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1020)/2, (screenSize.height-885)/2, 1020, 885);
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

private void jmniFrmrp_brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmrp_brandActionPerformed
    // TODO add your handling code here:
    try {
        if (frmrp_brand == null) {
            frmrp_brand = new Frmrp_brand(this);
        }
        showForm(frmrp_brand);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmrp_brandActionPerformed
                
//generatemenuevent
private void jmniFrmtemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmniFrmtemplateActionPerformed
    // TODO add your handling code here:
    try {
        if (frmtemplate == null) {
            frmtemplate = new Frmtemplate(this);
        }
        showForm(frmtemplate);

    }catch(Exception e) {
        e.printStackTrace();
    }

}//GEN-LAST:event_jmniFrmtemplateActionPerformed
//generatemenueventend
public void chekMenu() {
    
}


public void setToolBar(Integer FORM_TYPE,Integer FORM_STATE){
        ImageIcon icon=null;
               
        boolean showdisabled = false;

        btnPrint.setEnabled(true);
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
                  btnNew.setEnabled(!showdisabled);
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
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel jlblSystemDateTime;
    private javax.swing.JMenuItem jmniAktivitasUser;
    private javax.swing.JMenuItem jmniAnggota;
    private javax.swing.JMenuItem jmniCustomer;
    private javax.swing.JMenuItem jmniDelivery;
    private javax.swing.JMenuItem jmniDepartemen;
    private javax.swing.JMenuItem jmniDiscount;
    private javax.swing.JMenuItem jmniEntriStockOpname;
    private javax.swing.JMenuItem jmniExit;
    private javax.swing.JMenuItem jmniFrmko_transaksi_registrasi;
    private javax.swing.JMenuItem jmniFrmrp_anggota;
    private javax.swing.JMenuItem jmniFrmrp_anggota_simpanan;
    private javax.swing.JMenuItem jmniFrmrp_brand;
//generatemenuitemdeclare
    private javax.swing.JMenuItem jmniFrmtemplate;
//generatemenuitemdeclareend
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
    private javax.swing.JMenuItem jmniPinjaman;
    private javax.swing.JMenuItem jmniPrice;
    private javax.swing.JMenuItem jmniProductInfo;
    private javax.swing.JMenuItem jmniProductPrice;
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
    private javax.swing.JMenuItem jmniko_Auto_Pot_Simpanan;
    private javax.swing.JMenuItem jmnipenerimaanpembelian;
    private javax.swing.JMenu jmnuAkunting;
    private javax.swing.JMenuItem jmnuBrand;
    private javax.swing.JMenu jmnuKoperasi;
    private javax.swing.JMenu jmnuMInventory;
    private javax.swing.JMenu jmnuMOptional;
    private javax.swing.JMenu jmnuMPembelian;
    private javax.swing.JMenu jmnuMPenjualan;
    private javax.swing.JMenu jmnuMProducts;
    private javax.swing.JMenu jmnuMaster;
    private javax.swing.JMenu jmnuParameter;
    private javax.swing.JMenu jmnuReport;
    private javax.swing.JMenu jmnuReport_Master;
    private javax.swing.JMenuItem jmnuReturPembelian;
    private javax.swing.JMenu jmnuRpt_Inventory;
    private javax.swing.JMenu jmnuRpt_Master_Koperasi;
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
        
        jLblUser.setText("User : " + GlobalUtils.getAuditUser() + " " + GlobalUtils.currentdir + "/" + GlobalUtils.company );
        
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
      mm.creategroupdetail();
    }

    private Component[] cekMenu(JMenu jmenu) throws CodeException {
        Component[] me = jmenu.getMenuComponents();
        
        for (int i = 0; i< me.length; i++) {
            if (me[i] instanceof JMenu) {
                Component[] me2 =  cekMenu((JMenu)me[i]);
            }else if(me[i] instanceof JMenuItem) {
                JMenuItem jmi = (JMenuItem) me[i];
                
                
                /// ini buat ngisi mastermodule  *** Jangan dihapus  ***
                if  (jmi.getName() != null) {
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

}
