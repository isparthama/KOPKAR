/*
 * From ar_sales_delivery
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import common.component.FrmCompany;
 * 
 * .......
 * 
 * 
 * FrmCompany frmCompany;
 * 
 * .......
 * 
 try {
        if (frmCompany == null) {
            frmmCompany = new FrmCompany(this);
        }
        
        showForm(frmCompany);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package kopkar.ar.component;


import utils.popmenucontroller;
import kopkar.ap.component.Frmap_purchase_order;
import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import kopkar.ar.objectclasses.ar_sales_deliveryext;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import kopkar.ar.objectclasses.ar_sales_delivery_detail1ext;
import kopkar.ar.objectclasses.ar_sales_delivery_detail1extcol;
import kopkar.ar.objectclasses.ar_customerext;
import kopkar.ar.objectclasses.ar_optionext;
import kopkar.ar.objectclasses.ar_sales_orderext;
import kopkar.in.objectclasses.in_product_findcls;
import kopkar.op.objectclasses.op_payment_termext;
import kopkar.report_files.component.FrmReportSelector;
import kopkar.report_files.objectclasses.report_filesext;
import kopkar.utils.browsecontroller;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.kazao.calendar.KazaoCalendar;
import org.kazao.calendar.KazaoCalendarAdapter;
import org.kazao.calendar.KazaoCalendarDateTimeException;
import utils.CodeException;
import utils.GlobalModel;
import utils.GlobalUtils;
import utils.appsettinghandler;
import utils.selectallJTable;

/**
 *
 * @author  Generator
 */

public class Frmar_sales_delivery extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmar_sales_delivery";
    
    FrmMainFrame mf ;

    ar_sales_deliveryext obj=new ar_sales_deliveryext();
    ar_sales_delivery_detail1extcol appods;
    browsecontroller obrowse=new browsecontroller();
    private ar_customerext oar_customer;

    DefaultTableModel model=null;
    private ar_sales_deliveryext objtmp;
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    
    JPopupMenu popup;
   
    /** Creates new form Area */
    public Frmar_sales_delivery() throws CodeException {
        initComponents();
    }
    
    public Frmar_sales_delivery(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
        
        ActionListener menuListener_product_price = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
              gotoproductprice();
            }
          };
        
        ActionListener menuListener_product_info = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
              gotoproductinfo();
            }

            
          };
        

        popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Buka Product Price");
        menuItem.addActionListener(menuListener_product_price);
        menuItem.setFont(new Font("Dialog", Font.PLAIN, 10));
        popup.add(menuItem);
        menuItem = new JMenuItem("Buka Product Info");
        menuItem.addActionListener(menuListener_product_info);
        menuItem.setFont(new Font("Dialog", Font.PLAIN, 10));
        popup.add(menuItem);


        kzodocument_date.addChangeListener(new KazaoCalendarAdapter() {
        public void onChange(Calendar calendar) {
        }
        public void onChange(KazaoCalendar calendar) {
            getduedate();
        }
        public void onDoubleClick() {
        }
        });

        model=(DefaultTableModel) jtbldetail.getModel();

        TableColumn uomColumn = jtbldetail.getColumnModel().getColumn(3);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont( new Font("Dialog", Font.PLAIN, 10));
        comboBox.addItem("Pieces");
        comboBox.addItem("Inner");
        comboBox.addItem("Box");

        uomColumn.setCellEditor(new DefaultCellEditor(comboBox));
    }
     
    
       
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowseDocument_Number = new javax.swing.JButton();
        jlbldocument_number = new javax.swing.JLabel();
        jtxtdocument_number = new javax.swing.JTextField();
        jlbldocument_status = new javax.swing.JLabel();
        jtxtdocument_status = new javax.swing.JTextField();
        jlbldocument_date = new javax.swing.JLabel();
        jlbldocument_duedate = new javax.swing.JLabel();
        jtxtcustomer_code = new javax.swing.JTextField();
        jlblreference_number = new javax.swing.JLabel();
        jtxtreference_number = new javax.swing.JTextField();
        jlblterm_code = new javax.swing.JLabel();
        jtxtterm_code = new javax.swing.JTextField();
        jlbldiscount_code = new javax.swing.JLabel();
        jtxtdiscount_code = new javax.swing.JTextField();
        jlblprice_code = new javax.swing.JLabel();
        jtxtprice_code = new javax.swing.JTextField();
        jlblwarehouse_code = new javax.swing.JLabel();
        jlblreference = new javax.swing.JLabel();
        jtxtwarehouse_code = new javax.swing.JTextField();
        jtxtreference = new javax.swing.JTextField();
        jlbldscription = new javax.swing.JLabel();
        jtxtdscription = new javax.swing.JTextField();
        jlbltax_percent = new javax.swing.JLabel();
        jtxttax_percent = new javax.swing.JTextField();
        jlbltotal_bfr_discount = new javax.swing.JLabel();
        jtxttotal_bfr_discount = new javax.swing.JTextField();
        jlbltotal_discount = new javax.swing.JLabel();
        jtxttotal_discount = new javax.swing.JTextField();
        jlbltotal_aft_discount = new javax.swing.JLabel();
        jtxttotal_aft_discount = new javax.swing.JTextField();
        jtxttax_amount = new javax.swing.JTextField();
        jlbltotal_aft_tax = new javax.swing.JLabel();
        jtxttotal_aft_tax = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jchkinclude_tax = new javax.swing.JCheckBox();
        jlblsupplier_code1 = new javax.swing.JLabel();
        jlblsupplier_code2 = new javax.swing.JLabel();
        jbtnwarehouse_code = new javax.swing.JButton();
        jbtnsupplier_code = new javax.swing.JButton();
        jtxtcustomer_name = new javax.swing.JTextField();
        jtxtcustomer_address = new javax.swing.JTextField();
        kzodocument_date = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_duedate = new org.kazao.calendar.KazaoCalendarDate();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbldetail = new selectallJTable(model);
        jbtnterm_code = new javax.swing.JButton();
        jbtnprice_code = new javax.swing.JButton();
        jbtndiscount_code = new javax.swing.JButton();
        jbtnreference_number = new javax.swing.JButton();
        jopt_complete_status_complete = new javax.swing.JRadioButton();
        jopt_complete_status_draff = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delivery");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Delivery");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);

        jbtnBrowseDocument_Number.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowseDocument_Number.setText("...");
        jbtnBrowseDocument_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseDocument_NumberActionPerformed(evt);
            }
        });

        jlbldocument_number.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldocument_number.setText("No. Dokumen");

        jtxtdocument_number.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtdocument_number.setText("document_number");
        jtxtdocument_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_numberFocusGained(evt);
            }
        });

        jlbldocument_status.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldocument_status.setText("Status");

        jtxtdocument_status.setEditable(false);
        jtxtdocument_status.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtdocument_status.setText("document_status");
        jtxtdocument_status.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_statusFocusGained(evt);
            }
        });

        jlbldocument_date.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldocument_date.setText("Tgl. Dokumen");

        jlbldocument_duedate.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldocument_duedate.setText("Tgl. J.Tempo");

        jtxtcustomer_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtcustomer_code.setText("customer_code");
        jtxtcustomer_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcustomer_codeFocusGained(evt);
            }
        });

        jlblreference_number.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblreference_number.setText("Reff.No");

        jtxtreference_number.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtreference_number.setText("reference_number");
        jtxtreference_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtreference_numberFocusGained(evt);
            }
        });

        jlblterm_code.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblterm_code.setText("Tempo Bayar");

        jtxtterm_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtterm_code.setText("term_code");
        jtxtterm_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtterm_codeFocusGained(evt);
            }
        });

        jlbldiscount_code.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldiscount_code.setText("Kode Diskon");

        jtxtdiscount_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtdiscount_code.setText("discount_code");
        jtxtdiscount_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdiscount_codeFocusGained(evt);
            }
        });

        jlblprice_code.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblprice_code.setText("Kode Harga");

        jtxtprice_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtprice_code.setText("price_code");
        jtxtprice_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtprice_codeFocusGained(evt);
            }
        });

        jlblwarehouse_code.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblwarehouse_code.setText("Kode Gudang");

        jlblreference.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblreference.setText("Referensi");

        jtxtwarehouse_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtwarehouse_code.setText("warehouse_code");
        jtxtwarehouse_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtwarehouse_codeFocusGained(evt);
            }
        });

        jtxtreference.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtreference.setText("reference");
        jtxtreference.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtreferenceFocusGained(evt);
            }
        });

        jlbldscription.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbldscription.setText("Keterangan");

        jtxtdscription.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtdscription.setText("dscription");
        jtxtdscription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdscriptionFocusGained(evt);
            }
        });

        jlbltax_percent.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbltax_percent.setText("PPN");

        jtxttax_percent.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttax_percent.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttax_percent.setText("tax_percent");
        jtxttax_percent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttax_percentFocusGained(evt);
            }
        });
        jtxttax_percent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxttax_percentKeyReleased(evt);
            }
        });

        jlbltotal_bfr_discount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbltotal_bfr_discount.setText("Tot.Seb.Potongan");

        jtxttotal_bfr_discount.setEditable(false);
        jtxttotal_bfr_discount.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttotal_bfr_discount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttotal_bfr_discount.setText("total_bfr_discount");
        jtxttotal_bfr_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttotal_bfr_discountFocusGained(evt);
            }
        });

        jlbltotal_discount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbltotal_discount.setText("Tot.Potongan");

        jtxttotal_discount.setEditable(false);
        jtxttotal_discount.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttotal_discount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttotal_discount.setText("total_discount");
        jtxttotal_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttotal_discountFocusGained(evt);
            }
        });

        jlbltotal_aft_discount.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbltotal_aft_discount.setText("Tot.Set.Potongan");

        jtxttotal_aft_discount.setEditable(false);
        jtxttotal_aft_discount.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttotal_aft_discount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttotal_aft_discount.setText("total_aft_discount");
        jtxttotal_aft_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttotal_aft_discountFocusGained(evt);
            }
        });

        jtxttax_amount.setEditable(false);
        jtxttax_amount.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttax_amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttax_amount.setText("tax_amount");
        jtxttax_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttax_amountFocusGained(evt);
            }
        });

        jlbltotal_aft_tax.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlbltotal_aft_tax.setText("Tot.Plus.Ppn");

        jtxttotal_aft_tax.setEditable(false);
        jtxttotal_aft_tax.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxttotal_aft_tax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttotal_aft_tax.setText("total_aft_tax");
        jtxttotal_aft_tax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttotal_aft_taxFocusGained(evt);
            }
        });

        jtxtTanggalEntry.setEditable(false);
        jtxtTanggalEntry.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jtxtTanggalEntry.setText("TanggalEntry");

        jtxtTanggalUpdate.setEditable(false);
        jtxtTanggalUpdate.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jtxtTanggalUpdate.setText("TanggalUpdate");

        jtxtUserID.setEditable(false);
        jtxtUserID.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jtxtUserID.setText("UserID");

        jchkinclude_tax.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jchkinclude_tax.setSelected(true);
        jchkinclude_tax.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jchkinclude_taxItemStateChanged(evt);
            }
        });

        jlblsupplier_code1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsupplier_code1.setText("Kode Pelanggan");

        jlblsupplier_code2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsupplier_code2.setText("Nama Pelanggan");

        jbtnwarehouse_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnwarehouse_code.setText("...");
        jbtnwarehouse_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnwarehouse_codeActionPerformed(evt);
            }
        });

        jbtnsupplier_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnsupplier_code.setText("...");
        jbtnsupplier_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsupplier_codeActionPerformed(evt);
            }
        });

        jtxtcustomer_name.setEditable(false);
        jtxtcustomer_name.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtcustomer_name.setText("jTextField1");

        jtxtcustomer_address.setEditable(false);
        jtxtcustomer_address.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtcustomer_address.setText("jTextField1");

        kzodocument_date.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date.setFontDate(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date.setOpaque(false);

        kzodocument_duedate.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_duedate.setFontDate(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_duedate.setOpaque(false);

        jtbldetail.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtbldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "UOM", "Jumlah", "Satuan", "Harga", "Total", "Potongan", "Sub Total", "TotalPcs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, true, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbldetail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbldetail.setSurrendersFocusOnKeystroke(true);
        jtbldetail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtbldetailFocusGained(evt);
            }
        });
        jtbldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbldetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtbldetailMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbldetailMouseClicked(evt);
            }
        });
        jtbldetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtbldetailPropertyChange(evt);
            }
        });
        jtbldetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbldetailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbldetailKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtbldetail);
        if (jtbldetail.getColumnModel().getColumnCount() > 0) {
            jtbldetail.getColumnModel().getColumn(0).setMinWidth(50);
            jtbldetail.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtbldetail.getColumnModel().getColumn(0).setMaxWidth(50);
            jtbldetail.getColumnModel().getColumn(1).setMinWidth(120);
            jtbldetail.getColumnModel().getColumn(1).setPreferredWidth(120);
            jtbldetail.getColumnModel().getColumn(1).setMaxWidth(120);
            jtbldetail.getColumnModel().getColumn(2).setMinWidth(200);
            jtbldetail.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtbldetail.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jbtnterm_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnterm_code.setText("...");
        jbtnterm_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnterm_codeActionPerformed(evt);
            }
        });

        jbtnprice_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnprice_code.setText("...");
        jbtnprice_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprice_codeActionPerformed(evt);
            }
        });

        jbtndiscount_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtndiscount_code.setText("...");
        jbtndiscount_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndiscount_codeActionPerformed(evt);
            }
        });

        jbtnreference_number.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnreference_number.setText("...");
        jbtnreference_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnreference_numberActionPerformed(evt);
            }
        });

        buttonGroup1.add(jopt_complete_status_complete);
        jopt_complete_status_complete.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jopt_complete_status_complete.setText("Complete");

        buttonGroup1.add(jopt_complete_status_draff);
        jopt_complete_status_draff.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jopt_complete_status_draff.setSelected(true);
        jopt_complete_status_draff.setText("Draff");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblsupplier_code1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblsupplier_code2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbldscription, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jopt_complete_status_draff)
                                                .addGap(28, 28, 28)
                                                .addComponent(jopt_complete_status_complete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jlblreference, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(190, 190, 190)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtreference, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtxtdscription, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlbltotal_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jtxttotal_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(130, 130, 130)
                                                        .addComponent(jchkinclude_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jlbltotal_aft_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jtxttax_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxttax_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtxttotal_aft_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jlbltotal_aft_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbltotal_bfr_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbltax_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(190, 190, 190)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxttotal_aft_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtxttotal_bfr_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbldiscount_code, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblprice_code, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(310, 310, 310)
                                                .addComponent(jbtnsupplier_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlblreference_number, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jtxtreference_number, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnreference_number, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlbldocument_status, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jlbldocument_number, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(50, 50, 50)
                                                    .addComponent(jtxtdocument_status, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(190, 190, 190)
                                                    .addComponent(kzodocument_duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(190, 190, 190)
                                                    .addComponent(kzodocument_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jlbldocument_duedate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(340, 340, 340)
                                                    .addComponent(jbtnBrowseDocument_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jlbldocument_date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(190, 190, 190)
                                                    .addComponent(jtxtdocument_number, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlblwarehouse_code, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(190, 190, 190)
                                                    .addComponent(jtxtwarehouse_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(340, 340, 340)
                                                    .addComponent(jbtnterm_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jlblterm_code, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(50, 50, 50)
                                                    .addComponent(jtxtterm_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(jbtnwarehouse_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtcustomer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtcustomer_code, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxtcustomer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtxtdiscount_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtndiscount_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtxtprice_code, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnprice_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(536, 536, 536))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                                        .addComponent(jtxtTanggalEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(jtxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtxtTanggalUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HorizontalLine)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jtxtcustomer_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jtxtcustomer_address, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtxtdiscount_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtndiscount_code, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtxtprice_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnprice_code, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jtxtcustomer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtxtreference_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnreference_number, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jbtnsupplier_code, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jlblsupplier_code1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblsupplier_code2)
                                        .addGap(34, 34, 34)
                                        .addComponent(jlblreference_number)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbldiscount_code)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlblprice_code))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jtxtTanggalUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtxtTanggalEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HorizontalLine, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jlbldocument_status)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jlbldocument_number))
                                                    .addComponent(jtxtdocument_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addComponent(kzodocument_duedate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(kzodocument_date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jlbldocument_duedate))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jbtnBrowseDocument_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jlbldocument_date))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jtxtdocument_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblterm_code)
                                            .addComponent(jtxtterm_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbtnterm_code, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtwarehouse_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jbtnwarehouse_code, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jlblwarehouse_code))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtreference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jlbldscription)))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jopt_complete_status_draff)
                                        .addComponent(jopt_complete_status_complete)))
                                .addComponent(jlblreference)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jtxtdscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbltotal_discount)
                                        .addComponent(jtxttotal_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jchkinclude_tax)
                                        .addComponent(jtxttax_percent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxttax_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlbltotal_aft_tax)
                                                .addComponent(jtxttotal_aft_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jtxttotal_aft_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jlbltotal_aft_discount))
                                .addComponent(jtxttotal_bfr_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbltotal_bfr_discount)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jlbltax_percent)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator3)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            moveFirst();

         } catch (CodeException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formInternalFrameOpened

private void kdatePurchaseDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kdatePurchaseDateFocusLost

}//GEN-LAST:event_kdatePurchaseDateFocusLost

private void kdatePurchaseDateCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kdatePurchaseDateCaretPositionChanged

}//GEN-LAST:event_kdatePurchaseDateCaretPositionChanged

private void kdatePurchaseDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kdatePurchaseDatePropertyChange

}//GEN-LAST:event_kdatePurchaseDatePropertyChange

private void jbtnwarehouse_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnwarehouse_codeActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.in_warehouse, "", jtxtwarehouse_code);
}//GEN-LAST:event_jbtnwarehouse_codeActionPerformed

private void jbtnBrowseDocument_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseDocument_NumberActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ar_sales_delivery, "", jtxtdocument_number);
        try {
            if (!jtxtdocument_number.getText().equalsIgnoreCase("")){
                obj.initdata(jtxtdocument_number.getText());
                showData();
            }
        } catch (CodeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}//GEN-LAST:event_jbtnBrowseDocument_NumberActionPerformed

private void jbtnsupplier_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsupplier_codeActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ar_customer, "", jtxtcustomer_code);

    if (!jtxtcustomer_code.getText().equalsIgnoreCase("")){
        showdatasupplier();

    }

}//GEN-LAST:event_jbtnsupplier_codeActionPerformed

private void jtbldetailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtbldetailFocusGained
    // TODO add your handling code here:
    if (jtbldetail.getRowCount()==0){
        insertnewlastrow();
    }
}//GEN-LAST:event_jtbldetailFocusGained

private void jtbldetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbldetailKeyPressed
    // TODO add your handling code here:
    int col=jtbldetail.getSelectedColumn();
    int row=jtbldetail.getSelectedRow();
    switch (evt.getKeyCode()){
        case KeyEvent.VK_F5:
            switch (jtbldetail.getSelectedColumn()){
                case 1:
                    obrowse.showbrowser(obrowse.in_product, "", jtbldetail);
                    showproduct((Integer)jtbldetail.getSelectedRow());
                    jtbldetailPropertyChange(null);
                    GlobalUtils.selectCellTable(jtbldetail, row, 4);
                    break;
            }
            break;
        case KeyEvent.VK_INSERT:
            evt.consume();
            insertnewlastrow();
            break;
        case KeyEvent.VK_DELETE:
            evt.consume();
            if (jtbldetail.getSelectedRow()<appods.size()){
            ar_sales_delivery_detail1ext o = appods.get(jtbldetail.getSelectedRow());
                o.setstatus(ar_sales_delivery_detail1ext.Status_delete);
            }
            jtbldetailPropertyChange(null);
            break;
        case KeyEvent.VK_ENTER:
            evt.consume();
            break;
    }
}//GEN-LAST:event_jtbldetailKeyPressed

private void jtbldetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtbldetailPropertyChange
    // TODO add your handling code here:
    int irow=jtbldetail.getSelectedRow();
    int icol=jtbldetail.getSelectedColumn();

    if (irow>-1){
        switch (icol){
            case 3:
                showproduct(irow);
                break;
        }
        cekdetail();
        obj.settax_percent(GlobalUtils.toDbl(jtxttax_percent.getText()));
        obj.calculatetotal();
        jtxttotal_bfr_discount.setText(GlobalUtils.formatnumber(obj.gettotal_bfr_discount()));
        jtxttotal_discount.setText(GlobalUtils.formatnumber(obj.gettotal_discount()));
        jtxttotal_aft_discount.setText(GlobalUtils.formatnumber(obj.gettotal_aft_discount()));

        jtxttax_amount.setText(GlobalUtils.formatnumber(obj.gettax_amount()));
        jtxttotal_aft_tax.setText(GlobalUtils.formatnumber(obj.gettotal_aft_tax()));
        
    }
}//GEN-LAST:event_jtbldetailPropertyChange

private void jchkinclude_taxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jchkinclude_taxItemStateChanged
    // TODO add your handling code here:
    if (jchkinclude_tax.isSelected()){
        obj.setinclude_tax("Y");
        jtxttax_percent.setText("10");
    } else {
        obj.setinclude_tax("N");
        jtxttax_percent.setText("0");
    }
    jtbldetailPropertyChange(null);
}//GEN-LAST:event_jchkinclude_taxItemStateChanged

private void jbtnterm_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnterm_codeActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.op_payment_term, "", jtxtterm_code);

    if (!jtxtterm_code.getText().equalsIgnoreCase("")){
        getduedate();
    }
}//GEN-LAST:event_jbtnterm_codeActionPerformed

private void jbtnprice_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprice_codeActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.in_price, "", jtxtprice_code);
}//GEN-LAST:event_jbtnprice_codeActionPerformed

private void jbtndiscount_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndiscount_codeActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.in_discount, "", jtxtdiscount_code);
}//GEN-LAST:event_jbtndiscount_codeActionPerformed

private void jbtnreference_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnreference_numberActionPerformed
    // TODO add your handling code here:
    try {
        setData();
        ar_sales_orderext objref=new ar_sales_orderext();
        obrowse.showbrowser(obrowse.ar_sales_order, "document_status='O'", jtxtreference_number,obj,objref);

        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmap_purchase_order.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jbtnreference_numberActionPerformed

private void jtbldetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbldetailKeyReleased
        int col=jtbldetail.getSelectedColumn();
        int row=jtbldetail.getSelectedRow();
    // TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER&&row>-1){
            switch (col){
                case 1:
                    showproduct(row);
                    jtbldetailPropertyChange(null);
                    GlobalUtils.selectCellTable(jtbldetail, row, 4);
                    break;
                case 4:
                    insertnewlastrow();
                    break;
            }
        }
}//GEN-LAST:event_jtbldetailKeyReleased

private void jtxtcustomer_codeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtcustomer_codeFocusGained
    // TODO add your handling code here:
    jtxtcustomer_code.setSelectionStart(0);
    jtxtcustomer_code.setSelectionEnd(jtxtcustomer_code.getText().length());
}//GEN-LAST:event_jtxtcustomer_codeFocusGained

private void jtxttax_percentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttax_percentKeyReleased
    // TODO add your handling code here:
    jtbldetailPropertyChange(null);
}//GEN-LAST:event_jtxttax_percentKeyReleased

    private void jtbldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbldetailMouseClicked
        // TODO add your handling code here:
        maybeShowPopup(evt);
    }//GEN-LAST:event_jtbldetailMouseClicked

    private void jtbldetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbldetailMousePressed
        // TODO add your handling code here:
        maybeShowPopup(evt);
    }//GEN-LAST:event_jtbldetailMousePressed

    private void maybeShowPopup(java.awt.event.MouseEvent evt){
        if (evt.isPopupTrigger()) {
            popup.show(evt.getComponent(),
                       evt.getX(), evt.getY());
        }
    }
    private void jtbldetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbldetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbldetailMouseReleased
                         

private void jtxtdocument_numberFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtdocument_number.setSelectionStart(0);
    jtxtdocument_number.setSelectionEnd(jtxtdocument_number.getText().length());
}                                               

private void jtxtdocument_statusFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtdocument_status.setSelectionStart(0);
    jtxtdocument_status.setSelectionEnd(jtxtdocument_status.getText().length());
}                                                                                                                                   

private void jtxtreference_numberFocusGained(java.awt.event.FocusEvent evt) {                                              
        // TODO add your handling code here:
    jtxtreference_number.setSelectionStart(0);
    jtxtreference_number.setSelectionEnd(jtxtreference_number.getText().length());
}                                                

private void jtxtterm_codeFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtterm_code.setSelectionStart(0);
    jtxtterm_code.setSelectionEnd(jtxtterm_code.getText().length());
}                                         

private void jtxtdiscount_codeFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxtdiscount_code.setSelectionStart(0);
    jtxtdiscount_code.setSelectionEnd(jtxtdiscount_code.getText().length());
}                                             

private void jtxtprice_codeFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtprice_code.setSelectionStart(0);
    jtxtprice_code.setSelectionEnd(jtxtprice_code.getText().length());
}                                          

private void jtxtwarehouse_codeFocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
    jtxtwarehouse_code.setSelectionStart(0);
    jtxtwarehouse_code.setSelectionEnd(jtxtwarehouse_code.getText().length());
}                                              


private void jtxtreferenceFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtreference.setSelectionStart(0);
    jtxtreference.setSelectionEnd(jtxtreference.getText().length());
}                                         

private void jtxtdscriptionFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtdscription.setSelectionStart(0);
    jtxtdscription.setSelectionEnd(jtxtdscription.getText().length());
}                                                                                    

private void jtxttax_percentFocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
    jtxttax_percent.setSelectionStart(0);
    jtxttax_percent.setSelectionEnd(jtxttax_percent.getText().length());
}                                           

private void jtxttotal_bfr_discountFocusGained(java.awt.event.FocusEvent evt) {                                                
        // TODO add your handling code here:
    jtxttotal_bfr_discount.setSelectionStart(0);
    jtxttotal_bfr_discount.setSelectionEnd(jtxttotal_bfr_discount.getText().length());
}                                                  

private void jtxttotal_discountFocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
    jtxttotal_discount.setSelectionStart(0);
    jtxttotal_discount.setSelectionEnd(jtxttotal_discount.getText().length());
}                                              

private void jtxttotal_aft_discountFocusGained(java.awt.event.FocusEvent evt) {                                                
        // TODO add your handling code here:
    jtxttotal_aft_discount.setSelectionStart(0);
    jtxttotal_aft_discount.setSelectionEnd(jtxttotal_aft_discount.getText().length());
}                                                  

private void jtxttax_amountFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxttax_amount.setSelectionStart(0);
    jtxttax_amount.setSelectionEnd(jtxttax_amount.getText().length());
}                                          

private void jtxttotal_aft_taxFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxttotal_aft_tax.setSelectionStart(0);
    jtxttotal_aft_tax.setSelectionEnd(jtxttotal_aft_tax.getText().length());
}                                             


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

                                                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmar_sales_delivery().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowseDocument_Number;
    private javax.swing.JButton jbtndiscount_code;
    private javax.swing.JButton jbtnprice_code;
    private javax.swing.JButton jbtnreference_number;
    private javax.swing.JButton jbtnsupplier_code;
    private javax.swing.JButton jbtnterm_code;
    private javax.swing.JButton jbtnwarehouse_code;
    private javax.swing.JCheckBox jchkinclude_tax;
    private javax.swing.JLabel jlbldiscount_code;
    private javax.swing.JLabel jlbldocument_date;
    private javax.swing.JLabel jlbldocument_duedate;
    private javax.swing.JLabel jlbldocument_number;
    private javax.swing.JLabel jlbldocument_status;
    private javax.swing.JLabel jlbldscription;
    private javax.swing.JLabel jlblprice_code;
    private javax.swing.JLabel jlblreference;
    private javax.swing.JLabel jlblreference_number;
    private javax.swing.JLabel jlblsupplier_code1;
    private javax.swing.JLabel jlblsupplier_code2;
    private javax.swing.JLabel jlbltax_percent;
    private javax.swing.JLabel jlblterm_code;
    private javax.swing.JLabel jlbltotal_aft_discount;
    private javax.swing.JLabel jlbltotal_aft_tax;
    private javax.swing.JLabel jlbltotal_bfr_discount;
    private javax.swing.JLabel jlbltotal_discount;
    private javax.swing.JLabel jlblwarehouse_code;
    private javax.swing.JRadioButton jopt_complete_status_complete;
    private javax.swing.JRadioButton jopt_complete_status_draff;
    private javax.swing.JTable jtbldetail;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtcustomer_address;
    private javax.swing.JTextField jtxtcustomer_code;
    private javax.swing.JTextField jtxtcustomer_name;
    private javax.swing.JTextField jtxtdiscount_code;
    private javax.swing.JTextField jtxtdocument_number;
    private javax.swing.JTextField jtxtdocument_status;
    private javax.swing.JTextField jtxtdscription;
    private javax.swing.JTextField jtxtprice_code;
    private javax.swing.JTextField jtxtreference;
    private javax.swing.JTextField jtxtreference_number;
    private javax.swing.JTextField jtxttax_amount;
    private javax.swing.JTextField jtxttax_percent;
    private javax.swing.JTextField jtxtterm_code;
    private javax.swing.JTextField jtxttotal_aft_discount;
    private javax.swing.JTextField jtxttotal_aft_tax;
    private javax.swing.JTextField jtxttotal_bfr_discount;
    private javax.swing.JTextField jtxttotal_discount;
    private javax.swing.JTextField jtxtwarehouse_code;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_duedate;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {
        obj.moveFirst();
        
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void movePrevious() throws CodeException {
        obj.movePrevious();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveNext() throws CodeException {
        obj.moveNext();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveLast() throws CodeException {
        obj.moveLast();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void searchData() throws CodeException {
        showData();
        mf.setIcon(CLASSNAME);

    }

    private void clearfield(){
        jtxtdocument_number.setText("");
        jtxtdocument_status.setText("Open");
        try {
            kzodocument_date.setDate(GlobalUtils.getCurrentDate());
            kzodocument_duedate.setDate(GlobalUtils.getCurrentDate());
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jtxtcustomer_code.setText("");
        jtxtreference_number.setText("");
        jtxtterm_code.setText("");
        jtxtdiscount_code.setText("");
        jtxtprice_code.setText("");
        jtxtwarehouse_code.setText("");
        jtxtreference.setText("");
        jtxtdscription.setText("");
        jchkinclude_tax.setSelected(false);
        jtxttax_percent.setText("");
        jtxttotal_bfr_discount.setText("");
        jtxttotal_discount.setText("");
        jtxttotal_aft_discount.setText("");
        jtxttax_amount.setText("");
        jtxttotal_aft_tax.setText("");

        jtxtcustomer_name.setText("");
        jtxtcustomer_address.setText("");

        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");

        GlobalModel.clearRow(model);

        if (jtbldetail.getRowCount()==0){
            insertnewlastrow();
        }
    }

    public void newData() throws CodeException {
        istatus=1;
        objtmp=obj;
        obj=new ar_sales_deliveryext();

        ar_optionext aop=new ar_optionext();
        aop.initdata(GlobalUtils.company);
        obj.setterm_code(aop.getterm_code());
        obj.setwarehouse_code(aop.getwarehouse_code());
        obj.setprice_code(aop.getsales_price_code());
        obj.setdiscount_code(aop.getdiscount_code());
        obj.setinclude_tax("Y");
        obj.settax_percent(new Double(10));

        showData();
        setToolBar(iformtype,istatus);
    }

    public void saveData() throws CodeException {
        setData();
        obj.update();
        showData();

        istatus = 0;
        setToolBar(iformtype,istatus);
        mf.setIcon(CLASSNAME);
    }

    public void showData() throws CodeException {
        setToolBar(iformtype,istatus);
        setCursor(GlobalUtils.HOURGLASSCURSOR);

        jtxtdocument_number.setText(obj.getdocument_number());
        jtxtdocument_status.setText(obj.getdocument_status());


        if (obj.getcomplete_status().equalsIgnoreCase("Y")){
        jopt_complete_status_complete.setSelected(true);
        } else {
        jopt_complete_status_draff.setSelected(true);
        }
        try {
            kzodocument_date.setDate(GlobalUtils.formatDate(obj.getdocument_date(),"MM/dd/yyyy"));
            kzodocument_duedate.setDate(GlobalUtils.formatDate(obj.getdocument_duedate(),"MM/dd/yyyy"));
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jtxtcustomer_code.setText(obj.getcustomer_code());
        jtxtreference_number.setText(obj.getreference_number());
        jtxtterm_code.setText(obj.getterm_code());
        jtxtdiscount_code.setText(obj.getdiscount_code());
        jtxtprice_code.setText(obj.getprice_code());
        jtxtwarehouse_code.setText(obj.getwarehouse_code());
        jtxtreference.setText(obj.getreference());
        jtxtdscription.setText(obj.getdscription());
        if (obj.getinclude_tax().equalsIgnoreCase("Y")){
            jchkinclude_tax.setSelected(true);
        } else {
            jchkinclude_tax.setSelected(false);
        }
        jtxttax_percent.setText(GlobalUtils.churuf(obj.gettax_percent()));
        jtxttotal_bfr_discount.setText(GlobalUtils.formatnumber(obj.gettotal_bfr_discount()));
        jtxttotal_discount.setText(GlobalUtils.formatnumber(obj.gettotal_discount()));
        jtxttotal_aft_discount.setText(GlobalUtils.formatnumber(obj.gettotal_aft_discount()));
        jtxttax_amount.setText(GlobalUtils.formatnumber(obj.gettax_amount()));
        jtxttotal_aft_tax.setText(GlobalUtils.formatnumber(obj.gettotal_aft_tax()));
        
        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getentrydate()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getauditdate()));
        jtxtUserID.setText(obj.getaudituser());

        jtxtcustomer_name.setText(obj.getOCustomer().getcustomer_name());
        jtxtcustomer_address.setText(obj.getOCustomer().getaddress1());
        jtxtdocument_status.setText(obj.getDocument_status_desc());

        appods=obj.getDetail1();
        
        GlobalModel.clearRow(model);

        if (jtbldetail.getRowCount()==0){
            insertnewlastrow();
        }
        int i=0;
        for (i=0;i<appods.size();i++){
            ar_sales_delivery_detail1ext appod = appods.get(i);
            model.setValueAt(i+1, i, 0);
            model.setValueAt(appod.getproduct_code(), i, 1);
            model.setValueAt(appod.getProduct_name(), i, 2);
            switch (appod.getuom_id()){
                case 1:
                    model.setValueAt("Pieces", i, 3);
                    break;
                case 2:
                    model.setValueAt("Inner", i, 3);
                    break;
                case 3:
                    model.setValueAt("Box", i, 3);
                    break;
            }
            model.setValueAt(appod.getquantity(), i, 4);
            model.setValueAt(appod.getUom_code(), i, 5);

            model.setValueAt(appod.getprice(), i, 6);
            model.setValueAt(appod.gettotal_gross(), i, 7);
            model.setValueAt(appod.getdiscount_percent(), i, 8);
            model.setValueAt(appod.gettotal_after_discount(), i, 9);
            model.setValueAt(appod.getquantity_pcs(), i, 10);
            insertnewlastrow();
        }
        setCursor(GlobalUtils.NORMALCURSOR);
    }

    public void delete() throws CodeException {
        if (obj.delete()){
            obj.moveNext();
            showData();
        }
        mf.setIcon(CLASSNAME);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);
        if (obj.getdocument_status().equalsIgnoreCase("C")){
            mf.setToolBar(iformtype,7);
        }
        if (istatus==1){
            jbtnBrowseDocument_Number.setEnabled(false);
        } else {
            jbtnBrowseDocument_Number.setEnabled(true);
        }
    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }
        obj.setdocument_number(jtxtdocument_number.getText());
        obj.setdocument_status(jtxtdocument_status.getText());
        if (jopt_complete_status_complete.isSelected()){
            obj.setcomplete_status("Y");
        } else {
            obj.setcomplete_status("N");
        }

        obj.setdocument_date(kzodocument_date.getDate());
        obj.setdocument_duedate(kzodocument_duedate.getDate());
        obj.setcustomer_code(jtxtcustomer_code.getText());
        obj.setreference_number(jtxtreference_number.getText());
        obj.setterm_code(jtxtterm_code.getText());
        obj.setdiscount_code(jtxtdiscount_code.getText());
        obj.setprice_code(jtxtprice_code.getText());
        obj.setwarehouse_code(jtxtwarehouse_code.getText());
        obj.setreference(jtxtreference.getText());
        obj.setdscription(jtxtdscription.getText());
        if (jchkinclude_tax.isSelected()){
            obj.setinclude_tax("Y");
        } else {
            obj.setinclude_tax("N");
        }
        obj.settax_percent(GlobalUtils.toDbl(jtxttax_percent.getText()));
        obj.settotal_bfr_discount(GlobalUtils.toDbl(jtxttotal_bfr_discount.getText()));
        obj.settotal_discount(GlobalUtils.toDbl(jtxttotal_discount.getText()));
        obj.settotal_aft_discount(GlobalUtils.toDbl(jtxttotal_aft_discount.getText()));
        obj.settax_amount(GlobalUtils.toDbl(jtxttax_amount.getText()));
        obj.settotal_aft_tax(GlobalUtils.toDbl(jtxttotal_aft_tax.getText()));
        
    }

    public void undo() throws CodeException {
        istatus = 0;
        obj=objtmp;
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void printData() throws CodeException {
        FrmReportSelector orpt=new FrmReportSelector(1);
        orpt.setModal(true);
        orpt.setVisible(true);
        report_filesext oreport=orpt.getreport_files();
        orpt.dispose();
        
        if (oreport!=null){
            Map parameter = new HashMap();

    //        parameter.put("document_date_fr", obj.getdocument_date().substring(0, 10));
    //        parameter.put("document_date_to", obj.getdocument_date().substring(0, 10));
    //        parameter.put("document_number_fr", obj.getdocument_number());
    //        parameter.put("document_number_to", obj.getdocument_number());
            parameter.put("document_number", obj.getdocument_number());
    //        parameter.put("audituser", (GlobalUtils.getUserId()));

            // Versi 1
            String file ="";
            if(GlobalUtils.getAppDir()){
                try{
                file = GlobalUtils.getCurrentDir() +"/Reports/"+oreport.getreport_file();
                jasperReport = JasperCompileManager.compileReport(file);
                //System.out.println("file: "+file);
    //            System.out.println("isi parameter Daftar Customer:"+parameter);
                jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, appsettinghandler.db.getConnection());
                JasperViewer.viewReport(jasperPrint, false);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void importCsv() throws CodeException {
            

    }

    public void exportCsv() throws CodeException {
        
        
    }

    public void importText() throws CodeException {
        
    }

    public void exportText() throws CodeException {
        
    }

    private void showdatasupplier() {
        oar_customer=new ar_customerext();
        try {
            oar_customer.initdata(jtxtcustomer_code.getText());
            jtxtcustomer_name.setText(oar_customer.getcustomer_name());
            jtxtcustomer_address.setText(oar_customer.getaddress1()+" "+oar_customer.getaddress2());
            jtxtdiscount_code.setText(oar_customer.getdiscount_code());
            jtxtprice_code.setText(oar_customer.getprice_code());
            jtxtterm_code.setText(oar_customer.getterm_code());
            jtxtwarehouse_code.setText(oar_customer.getwarehouse_code());
        } catch (CodeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void insertnewlastrow() {
        if (!lastrowisempty()){
        model.addRow(new Object[model.getColumnCount()]);
        model.setValueAt(model.getRowCount(), model.getRowCount()-1, 0);
        model.setValueAt("Pieces", model.getRowCount()-1, 3);
        model.setValueAt(1, model.getRowCount()-1, 4);
        model.setValueAt(0, model.getRowCount()-1, 6);
        model.setValueAt(0, model.getRowCount()-1, 7);
        model.setValueAt(0, model.getRowCount()-1, 8);
        model.setValueAt(0, model.getRowCount()-1, 9);
        model.setValueAt(1, model.getRowCount()-1, 10);
        GlobalUtils.selectCellTable(jtbldetail, model.getRowCount()-1, 1);
        }
    }

    private void showproduct(Integer irow) {
        in_product_findcls oin_product=new in_product_findcls();

        String sproduct_code=GlobalUtils.churuf(model.getValueAt(irow, 1));
        String suom_id="1";
        if (GlobalUtils.churuf(model.getValueAt(irow, 3)).equalsIgnoreCase("inner")){
            suom_id="2";
        }
        if (GlobalUtils.churuf(model.getValueAt(irow, 3)).equalsIgnoreCase("box")){
            suom_id="3";
        }
        String scost_price_code="BELI";
        String ssales_price_code=jtxtprice_code.getText();
        if (oin_product.initdata(sproduct_code,suom_id,scost_price_code,ssales_price_code)) {
            model.setValueAt(oin_product.getProduct_name(), irow, 2);
            model.setValueAt(oin_product.getUom_code(), irow, 5);
            model.setValueAt(oin_product.getPrice(), irow, 6);
            model.setValueAt(oin_product.getPrice(), irow, 7);
            model.setValueAt(oin_product.getUom(), irow, 10);
            switch (oin_product.getUom_id()){
                case 1:
                model.setValueAt("Pieces", irow, 3);
                break;
                case 2:
                model.setValueAt("Inner", irow, 3);
                break;
                case 3:
                model.setValueAt("Box", irow, 3);
                break;
            }
        }

    }

    private void cekdetail() {
        int row = jtbldetail.getSelectedRow();
        int col = jtbldetail.getSelectedColumn();


        ar_sales_delivery_detail1ext appod=new ar_sales_delivery_detail1ext();
        if (row > appods.size() - 1) {
            appod = new ar_sales_delivery_detail1ext();
            appod.setstatus(ar_sales_delivery_detail1ext.Status_Insert);
            appods.add(appod);
        } else {
            appod = (ar_sales_delivery_detail1ext) appods.get(row);
            if (!appod.getstatus().equals(ar_sales_delivery_detail1ext.Status_Insert)&&!appod.getstatus().equals(ar_sales_delivery_detail1ext.Status_delete)){
                appod.setstatus(ar_sales_delivery_detail1ext.Status_update);
            }
        }

        appod.setproduct_code(GlobalUtils.churuf(model.getValueAt(row, 1)));
        if (GlobalUtils.churuf(model.getValueAt(row, 3)).equalsIgnoreCase("Pieces")){
            appod.setuom_id(1);
        }
        if (GlobalUtils.churuf(model.getValueAt(row, 3)).equalsIgnoreCase("Inner")){
            appod.setuom_id(2);
        }
        if (GlobalUtils.churuf(model.getValueAt(row, 3)).equalsIgnoreCase("Box")){
            appod.setuom_id(3);
        }
        appod.setquantity(GlobalUtils.toDbl(GlobalUtils.churuf(model.getValueAt(row, 4))));
        appod.setprice(GlobalUtils.toDbl(GlobalUtils.churuf(model.getValueAt(row, 6))));
        appod.settotal_gross(appod.getquantity()*appod.getprice());
        model.setValueAt(appod.gettotal_gross(), row, 7);

        appod.setdiscount_percent(GlobalUtils.toDbl(GlobalUtils.churuf(model.getValueAt(row, 8))));
        appod.setdiscount_amount((appod.getquantity()*appod.getprice())*(appod.getdiscount_percent()/100));
        appod.settotal_after_discount((appod.getquantity()*appod.getprice())-((appod.getquantity()*appod.getprice())*(appod.getdiscount_percent()/100)));
        
        model.setValueAt(appod.gettotal_after_discount(), row, 9);

        appods.set(row, appod);

    }

    private void getduedate() {
        op_payment_termext opt=new op_payment_termext();
        try {
            kzodocument_duedate.setDate(opt.initdataduedate(kzodocument_date.getDate(), jtxtterm_code.getText()));
        } catch (CodeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmar_sales_delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean lastrowisempty() {
        if (model.getRowCount()>0){
            if (GlobalUtils.churuf(model.getValueAt(model.getRowCount()-1, 1)).equalsIgnoreCase("")){
                return true;
            }
        }
        return false;
    }

    private void gotoproductprice(){
        int irow=jtbldetail.getSelectedRow();
        if (irow>-1){
            String price_code=jtxtprice_code.getText();
            String product_code=GlobalUtils.churuf(jtbldetail.getValueAt(irow, 1));
            this.mf.gotoproductprice(product_code,price_code);
        }
    }
    
    private void gotoproductinfo() {
        int irow=jtbldetail.getSelectedRow();
        if (irow>-1){
            String product_code=GlobalUtils.churuf(jtbldetail.getValueAt(irow, 1));
            this.mf.gotoproductinfo(product_code);
        }
    }
}
