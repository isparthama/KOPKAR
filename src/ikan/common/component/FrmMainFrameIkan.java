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

package ikan.common.component;


import common.component.*;
import classinterface.NavigatorFormInt;
import classinterface.NavigatorFormReportInt;
import common.objectclasses.extended.MasterModuleExt;
import common.objectclasses.extended.MastergroupdetailExt;
import ikan.in.component.Frmmaster_brand;
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
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;



/**
 *
 * @author  windu
 */
public class FrmMainFrameIkan extends javax.swing.JFrame {
         
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

    private MasterModuleExt mm;
    
    private Frmmaster_brand frmmaster_brand;
    
    /** Creates new form MainFrame */
    public FrmMainFrameIkan() {
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
        jmniLogOut = new javax.swing.JMenuItem();
        jmniExit = new javax.swing.JMenuItem();
        jmnuMaster = new javax.swing.JMenu();
        jmnuMPembelian = new javax.swing.JMenu();
        jmnuMInventory = new javax.swing.JMenu();
        jmnuBrand = new javax.swing.JMenuItem();
        jmnuMPenjualan = new javax.swing.JMenu();

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
        jmnuParameter.setFont(new java.awt.Font("Dialog", 1, 10));

        jmniAktivitasUser.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniAktivitasUser.setText("Aktivitas User");
        jmniAktivitasUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniAktivitasUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniAktivitasUser);

        jmniMaintenaceUser.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniMaintenaceUser.setText("Maintenace User");
        jmniMaintenaceUser.setName("FrmMasteruser"); // NOI18N
        jmniMaintenaceUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMaintenaceUserActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMaintenaceUser);

        jmniResetPassword.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniResetPassword.setText("Reset Password");
        jmniResetPassword.setName("Reset Password"); // NOI18N
        jmniResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniResetPasswordActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniResetPassword);

        jmniGroup.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniGroup.setText("Group");
        jmniGroup.setName("FrmMastergroup"); // NOI18N
        jmniGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGroupActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGroup);

        jmniModule.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniModule.setText("Module");
        jmniModule.setName("FrmMastermodule"); // NOI18N
        jmniModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniModuleActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniModule);

        jmniMasterCompany.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniMasterCompany.setText("Company");
        jmniMasterCompany.setName("FrmMasterCompany"); // NOI18N
        jmniMasterCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniMasterCompanyActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniMasterCompany);

        jmniGenerator.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniGenerator.setText("Generator");
        jmniGenerator.setName("FrmGenerator"); // NOI18N
        jmniGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniGeneratorActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniGenerator);

        jMenu1.setText("Report");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 10));

        jMenuItem14.setFont(new java.awt.Font("Dialog", 1, 10));
        jMenuItem14.setText("Setting Parameter Program ");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jmnuParameter.add(jMenu1);

        jmniLogOut.setFont(new java.awt.Font("Dialog", 1, 10));
        jmniLogOut.setText("Log Out");
        jmniLogOut.setName("LogOut"); // NOI18N
        jmniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmniLogOutActionPerformed(evt);
            }
        });
        jmnuParameter.add(jmniLogOut);

        jmniExit.setFont(new java.awt.Font("Dialog", 1, 10));
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
        jmnuMaster.setFont(new java.awt.Font("Dialog", 1, 10));

        jmnuMPembelian.setText("Pembelian");
        jmnuMPembelian.setFont(new java.awt.Font("Dialog", 1, 10));
        jmnuMaster.add(jmnuMPembelian);

        jmnuMInventory.setText("Inventory");
        jmnuMInventory.setFont(new java.awt.Font("Dialog", 1, 10));

        jmnuBrand.setFont(new java.awt.Font("Dialog", 1, 10));
        jmnuBrand.setText("Brand");
        jmnuBrand.setName("Frmin_brand"); // NOI18N
        jmnuBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBrandActionPerformed(evt);
            }
        });
        jmnuMInventory.add(jmnuBrand);

        jmnuMaster.add(jmnuMInventory);

        jmnuMPenjualan.setText("Penjualan");
        jmnuMPenjualan.setFont(new java.awt.Font("Dialog", 1, 10));
        jmnuMaster.add(jmnuMPenjualan);

        jMenuMain.add(jmnuMaster);

        setJMenuBar(jMenuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSystemDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
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

private void jmnuBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuBrandActionPerformed
    // TODO add your handling code here:
    try {
        if (frmmaster_brand == null) {
            frmmaster_brand = new Frmmaster_brand(this);
        }
        showForm(frmmaster_brand);

    }catch(Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_jmnuBrandActionPerformed
                

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
                new FrmMainFrameIkan().setVisible(true);
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
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel jlblSystemDateTime;
    private javax.swing.JMenuItem jmniAktivitasUser;
    private javax.swing.JMenuItem jmniExit;
    private javax.swing.JMenuItem jmniGenerator;
    private javax.swing.JMenuItem jmniGroup;
    private javax.swing.JMenuItem jmniLogOut;
    private javax.swing.JMenuItem jmniMaintenaceUser;
    private javax.swing.JMenuItem jmniMasterCompany;
    private javax.swing.JMenuItem jmniModule;
    private javax.swing.JMenuItem jmniResetPassword;
    private javax.swing.JMenuItem jmnuBrand;
    private javax.swing.JMenu jmnuMInventory;
    private javax.swing.JMenu jmnuMPembelian;
    private javax.swing.JMenu jmnuMPenjualan;
    private javax.swing.JMenu jmnuMaster;
    private javax.swing.JMenu jmnuParameter;
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

}
