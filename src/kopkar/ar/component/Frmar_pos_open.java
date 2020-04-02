/*
 * From ar_pos_open
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


import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import common.objectclasses.extended.MasterUserExt;
import java.util.HashMap;
import java.util.Map;
import kopkar.ar.objectclasses.ar_pos_openext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.ar.objectclasses.ar_pos_chasierext;
import kopkar.utils.browsecontroller;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.kazao.calendar.KazaoCalendarDateTimeException;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author  Generator
 */

public class Frmar_pos_open extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmar_pos_open";
    
    FrmMainFrame mf ;

    ar_pos_openext obj=new ar_pos_openext();
    private browsecontroller obrowse;
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
    private ar_pos_openext objtmp;
   
    /** Creates new form Area */
    public Frmar_pos_open() throws CodeException {
        initComponents();
    }
    
    public Frmar_pos_open(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
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
        jbtnBrowse = new javax.swing.JButton();
        jlbldocument_number = new javax.swing.JLabel();
        jtxtdocument_number = new javax.swing.JTextField();
        jlbldocument_status = new javax.swing.JLabel();
        jtxtdocument_status = new javax.swing.JTextField();
        jlbldocument_date = new javax.swing.JLabel();
        jlbldscription = new javax.swing.JLabel();
        jtxtdscription = new javax.swing.JTextField();
        jlblcounter_number = new javax.swing.JLabel();
        jtxtcounter_number = new javax.swing.JTextField();
        jlblchasier_code = new javax.swing.JLabel();
        jtxtchasier_code = new javax.swing.JTextField();
        jlblcash_register_modal = new javax.swing.JLabel();
        jtxtcash_register_modal = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        kzodocument_date = new org.kazao.calendar.KazaoCalendarDate();
        jopt_complete_status_draff = new javax.swing.JRadioButton();
        jopt_complete_status_complete = new javax.swing.JRadioButton();
        jtxtcounter_name = new javax.swing.JTextField();
        jbtnBrowse_loket = new javax.swing.JButton();
        jtxtchasier_name = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Open Point of Sales");
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
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Open Point of Sales");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 200, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 6);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 6, 400);

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(760, 100, 30, 17);

        jlbldocument_number.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_number.setText("No Dokumen");
        getContentPane().add(jlbldocument_number);
        jlbldocument_number.setBounds(420, 100, 140, 13);

        jtxtdocument_number.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_number.setText("document_number");
        jtxtdocument_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_numberFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_number);
        jtxtdocument_number.setBounds(610, 100, 150, 23);

        jlbldocument_status.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_status.setText("Dok Status");
        getContentPane().add(jlbldocument_status);
        jlbldocument_status.setBounds(420, 80, 140, 13);

        jtxtdocument_status.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_status.setText("document_status");
        jtxtdocument_status.setFocusable(false);
        jtxtdocument_status.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_statusFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_status);
        jtxtdocument_status.setBounds(610, 80, 150, 23);

        jlbldocument_date.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_date.setText("Tanggal");
        getContentPane().add(jlbldocument_date);
        jlbldocument_date.setBounds(420, 120, 140, 13);

        jlbldscription.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldscription.setText("Kerangan");
        getContentPane().add(jlbldscription);
        jlbldscription.setBounds(70, 180, 140, 13);

        jtxtdscription.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdscription.setText("dscription");
        jtxtdscription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdscriptionFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdscription);
        jtxtdscription.setBounds(260, 180, 340, 23);

        jlblcounter_number.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcounter_number.setText("Loket ");
        getContentPane().add(jlblcounter_number);
        jlblcounter_number.setBounds(70, 220, 140, 13);

        jtxtcounter_number.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcounter_number.setText("counter_number");
        jtxtcounter_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcounter_numberFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcounter_number);
        jtxtcounter_number.setBounds(260, 220, 150, 23);

        jlblchasier_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblchasier_code.setText("Kasir");
        getContentPane().add(jlblchasier_code);
        jlblchasier_code.setBounds(70, 200, 140, 13);

        jtxtchasier_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtchasier_code.setText("chasier_code");
        jtxtchasier_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtchasier_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtchasier_code);
        jtxtchasier_code.setBounds(260, 200, 150, 23);

        jlblcash_register_modal.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcash_register_modal.setText("Cash Register");
        getContentPane().add(jlblcash_register_modal);
        jlblcash_register_modal.setBounds(70, 240, 140, 13);

        jtxtcash_register_modal.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcash_register_modal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtcash_register_modal.setText("cash_register_modal");
        jtxtcash_register_modal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcash_register_modalFocusGained(evt);
            }
        });
        jtxtcash_register_modal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtcash_register_modalKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtcash_register_modal);
        jtxtcash_register_modal.setBounds(260, 240, 150, 23);

        jtxtTanggalEntry.setEditable(false);
        jtxtTanggalEntry.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalEntry.setText("TanggalEntry");
        getContentPane().add(jtxtTanggalEntry);
        jtxtTanggalEntry.setBounds(360, 30, 170, 20);

        jtxtTanggalUpdate.setEditable(false);
        jtxtTanggalUpdate.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalUpdate.setText("TanggalUpdate");
        getContentPane().add(jtxtTanggalUpdate);
        jtxtTanggalUpdate.setBounds(530, 30, 130, 20);

        jtxtUserID.setEditable(false);
        jtxtUserID.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtUserID.setText("UserID");
        getContentPane().add(jtxtUserID);
        jtxtUserID.setBounds(660, 30, 140, 20);

        kzodocument_date.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setOpaque(false);
        getContentPane().add(kzodocument_date);
        kzodocument_date.setBounds(610, 120, 100, 20);

        buttonGroup1.add(jopt_complete_status_draff);
        jopt_complete_status_draff.setFont(new java.awt.Font("Dialog", 0, 10));
        jopt_complete_status_draff.setSelected(true);
        jopt_complete_status_draff.setText("Draff");
        getContentPane().add(jopt_complete_status_draff);
        jopt_complete_status_draff.setBounds(70, 280, 52, 24);

        buttonGroup1.add(jopt_complete_status_complete);
        jopt_complete_status_complete.setFont(new java.awt.Font("Dialog", 0, 10));
        jopt_complete_status_complete.setText("Complete");
        getContentPane().add(jopt_complete_status_complete);
        jopt_complete_status_complete.setBounds(150, 280, 123, 24);

        jtxtcounter_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcounter_name.setText("counter_name");
        jtxtcounter_name.setFocusable(false);
        jtxtcounter_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcounter_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcounter_name);
        jtxtcounter_name.setBounds(450, 220, 290, 23);

        jbtnBrowse_loket.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_loket.setText("...");
        jbtnBrowse_loket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_loketActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_loket);
        jbtnBrowse_loket.setBounds(410, 220, 30, 17);

        jtxtchasier_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtchasier_name.setText("chasier_name");
        jtxtchasier_name.setFocusable(false);
        jtxtchasier_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtchasier_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtchasier_name);
        jtxtchasier_name.setBounds(450, 200, 290, 23);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(410, 200, 30, 17);

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

private void jtxtcounter_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtcounter_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtcounter_nameFocusGained

private void jtxtcash_register_modalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcash_register_modalKeyReleased
    // TODO add your handling code here:
    GlobalUtils.domasking(jtxtcash_register_modal);
}//GEN-LAST:event_jtxtcash_register_modalKeyReleased

private void jtxtchasier_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtchasier_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtchasier_nameFocusGained

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ar_pos_open, "", jtxtdocument_number);

    if (!jtxtdocument_number.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtdocument_number.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmar_pos_open.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowseActionPerformed

private void jbtnBrowse_loketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_loketActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ar_pos_counter, "", jtxtcounter_number,jtxtcounter_name);
}//GEN-LAST:event_jbtnBrowse_loketActionPerformed

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ar_pos_chasier, "", jtxtchasier_code,jtxtchasier_name);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

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

private void jtxtdscriptionFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtdscription.setSelectionStart(0);
    jtxtdscription.setSelectionEnd(jtxtdscription.getText().length());
}                                          

private void jtxtcounter_numberFocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
    jtxtcounter_number.setSelectionStart(0);
    jtxtcounter_number.setSelectionEnd(jtxtcounter_number.getText().length());
}                                              

private void jtxtchasier_codeFocusGained(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
    jtxtchasier_code.setSelectionStart(0);
    jtxtchasier_code.setSelectionEnd(jtxtchasier_code.getText().length());
}                                            

private void jtxtcash_register_modalFocusGained(java.awt.event.FocusEvent evt) {                                                 
        // TODO add your handling code here:
    jtxtcash_register_modal.setSelectionStart(0);
    jtxtcash_register_modal.setSelectionEnd(jtxtcash_register_modal.getText().length());
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
                    new Frmar_pos_open().setVisible(true);
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowse_loket;
    private javax.swing.JLabel jlblcash_register_modal;
    private javax.swing.JLabel jlblchasier_code;
    private javax.swing.JLabel jlblcounter_number;
    private javax.swing.JLabel jlbldocument_date;
    private javax.swing.JLabel jlbldocument_number;
    private javax.swing.JLabel jlbldocument_status;
    private javax.swing.JLabel jlbldscription;
    private javax.swing.JRadioButton jopt_complete_status_complete;
    private javax.swing.JRadioButton jopt_complete_status_draff;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtcash_register_modal;
    private javax.swing.JTextField jtxtchasier_code;
    private javax.swing.JTextField jtxtchasier_name;
    private javax.swing.JTextField jtxtcounter_name;
    private javax.swing.JTextField jtxtcounter_number;
    private javax.swing.JTextField jtxtdocument_number;
    private javax.swing.JTextField jtxtdocument_status;
    private javax.swing.JTextField jtxtdscription;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date;
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
        jtxtdocument_status.setText("");
        jopt_complete_status_draff.setSelected(true);
        try {
            kzodocument_date.setDate(GlobalUtils.getCurrentDate());
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmar_pos_open.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtdscription.setText("");
        jtxtcounter_number.setText("");
        jtxtcounter_name.setText("");
        jtxtchasier_code.setText("");
        jtxtchasier_name.setText("");
        jtxtcash_register_modal.setText("0");
        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");
    }

    public void newData() throws CodeException {
        istatus=1;
        objtmp=obj;
        obj=new ar_pos_openext();
        showData();

        ar_pos_chasierext ochasier=new ar_pos_chasierext();
        ochasier.initdata_by_user_code(GlobalUtils.userid);
        jtxtchasier_code.setText(ochasier.getchasier_code());
        jtxtchasier_name.setText(ochasier.getchasier_name());
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
        jtxtdocument_status.setText(GlobalUtils.getdocument_status_desc(obj.getdocument_status()));
        if (obj.getcomplete_status().equalsIgnoreCase("Y")){
        jopt_complete_status_complete.setSelected(true);
        } else {
            jopt_complete_status_draff.setSelected(true);
        }
        try {
            kzodocument_date.setDate(GlobalUtils.formatDate(obj.getdocument_date(), "MM/dd/yyyy"));
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmar_pos_open.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtdscription.setText(obj.getdscription());
        jtxtcounter_number.setText(obj.getcounter_number());
        jtxtcounter_name.setText(obj.getcounter_name());
        jtxtchasier_code.setText(obj.getchasier_code());
        MasterUserExt m=new MasterUserExt();
        if (m.initdata(jtxtchasier_code.getText())){
            jtxtchasier_name.setText(m.getNama());
        }
        jtxtcash_register_modal.setText(GlobalUtils.formatnumber(obj.getcash_register_modal()));
        
        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getentrydate()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getauditdate()));
        jtxtUserID.setText(obj.getaudituser());

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

        if (istatus==1){
            jbtnBrowse.setEnabled(false);
        } else {
            jbtnBrowse.setEnabled(true);
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
        obj.setdscription(jtxtdscription.getText());
        obj.setcounter_number(jtxtcounter_number.getText());
        obj.setchasier_code(jtxtchasier_code.getText());
        obj.setcash_register_modal(GlobalUtils.toDbl(jtxtcash_register_modal.getText()));

        
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
        Map parameter = new HashMap();

        parameter.put("document_date_fr", obj.getdocument_date().substring(0, 10));
        parameter.put("document_date_to", obj.getdocument_date().substring(0, 10));
        parameter.put("document_number_fr", obj.getdocument_number());
        parameter.put("document_number_to", obj.getdocument_number());
        parameter.put("audituser", (GlobalUtils.getUserId()));

        // Versi 1
        String file ="";
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/FTPS-01.jrxml";
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Daftar Customer:"+parameter);
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, appsettinghandler.db.getConnection());
            JasperViewer.viewReport(jasperPrint, false);
            }catch (Exception e) {
                e.printStackTrace();
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

    
}
