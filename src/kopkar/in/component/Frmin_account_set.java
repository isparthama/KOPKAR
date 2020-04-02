/*
 * From in_account_set
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

package kopkar.in.component;


import kopkar.ap.component.*;
import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.in.objectclasses.in_account_setext;
import kopkar.utils.browsecontroller;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author  Generator
 */

public class Frmin_account_set extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmin_account_set";
    
    FrmMainFrame mf ;

    in_account_setext obj=new in_account_setext();
    browsecontroller obrowse=new browsecontroller();
    private JasperReport jasperReport;
    private JasperPrint jasperPrint;
   
    /** Creates new form Area */
    public Frmin_account_set() throws CodeException {
        initComponents();
    }
    
    public Frmin_account_set(FrmMainFrame mf) throws CodeException{
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

        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowse = new javax.swing.JButton();
        jlblaccset_kode = new javax.swing.JLabel();
        jtxtaccset_kode = new javax.swing.JTextField();
        jlblaccset_desc = new javax.swing.JLabel();
        jtxtaccset_desc = new javax.swing.JTextField();
        jlblap_account_code = new javax.swing.JLabel();
        jtxtsls_account_code = new javax.swing.JTextField();
        jlbldisc_account_code = new javax.swing.JLabel();
        jtxtinv_account_code = new javax.swing.JTextField();
        jlblppay_account_code = new javax.swing.JLabel();
        jtxthpp_account_code = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jbtnBrowse2 = new javax.swing.JButton();
        jbtnBrowse3 = new javax.swing.JButton();
        jchckactive_sts = new javax.swing.JCheckBox();
        jtxtsls_account_desc = new javax.swing.JTextField();
        jtxtinv_account_desc = new javax.swing.JTextField();
        jtxthpp_account_desc = new javax.swing.JTextField();
        jlblppay_account_code1 = new javax.swing.JLabel();
        jtxtpot_account_code = new javax.swing.JTextField();
        jbtnBrowse4 = new javax.swing.JButton();
        jtxtpot_account_desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventory Account Set");
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
        jHeader.setText(" : : Inventory Account Set");
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
        jbtnBrowse.setBounds(350, 100, 30, 17);

        jlblaccset_kode.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblaccset_kode.setText("Kode Set Akun");
        getContentPane().add(jlblaccset_kode);
        jlblaccset_kode.setBounds(70, 100, 140, 13);

        jtxtaccset_kode.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtaccset_kode.setText("accset_kode");
        jtxtaccset_kode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtaccset_kodeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtaccset_kode);
        jtxtaccset_kode.setBounds(260, 100, 90, 23);

        jlblaccset_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblaccset_desc.setText("Keterangan");
        getContentPane().add(jlblaccset_desc);
        jlblaccset_desc.setBounds(70, 120, 140, 13);

        jtxtaccset_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtaccset_desc.setText("accset_desc");
        jtxtaccset_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtaccset_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtaccset_desc);
        jtxtaccset_desc.setBounds(260, 120, 400, 23);

        jlblap_account_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblap_account_code.setText("Kode Akun Sales");
        getContentPane().add(jlblap_account_code);
        jlblap_account_code.setBounds(70, 160, 140, 13);

        jtxtsls_account_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtsls_account_code.setText("ap_account_code");
        getContentPane().add(jtxtsls_account_code);
        jtxtsls_account_code.setBounds(260, 160, 90, 23);

        jlbldisc_account_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldisc_account_code.setText("Kode Akun Persediaan ");
        getContentPane().add(jlbldisc_account_code);
        jlbldisc_account_code.setBounds(70, 180, 140, 13);

        jtxtinv_account_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtinv_account_code.setText("disc_account_code");
        getContentPane().add(jtxtinv_account_code);
        jtxtinv_account_code.setBounds(260, 180, 90, 23);

        jlblppay_account_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblppay_account_code.setText("Kode Akun HPP");
        getContentPane().add(jlblppay_account_code);
        jlblppay_account_code.setBounds(70, 200, 140, 13);

        jtxthpp_account_code.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxthpp_account_code.setText("ppay_account_code");
        getContentPane().add(jtxthpp_account_code);
        jtxthpp_account_code.setBounds(260, 200, 90, 23);

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

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(350, 160, 30, 17);

        jbtnBrowse2.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse2.setText("...");
        jbtnBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse2);
        jbtnBrowse2.setBounds(350, 180, 30, 17);

        jbtnBrowse3.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse3.setText("...");
        jbtnBrowse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse3);
        jbtnBrowse3.setBounds(350, 200, 30, 17);

        jchckactive_sts.setFont(new java.awt.Font("Dialog", 1, 10));
        jchckactive_sts.setText("Aktif");
        getContentPane().add(jchckactive_sts);
        jchckactive_sts.setBounds(550, 100, 108, 24);

        jtxtsls_account_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsls_account_desc.setText("jtxtap_account_code_desc");
        jtxtsls_account_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsls_account_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtsls_account_desc);
        jtxtsls_account_desc.setBounds(380, 160, 400, 23);

        jtxtinv_account_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtinv_account_desc.setText("jtxtdisc_account_code_desc");
        jtxtinv_account_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtinv_account_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtinv_account_desc);
        jtxtinv_account_desc.setBounds(380, 180, 400, 23);

        jtxthpp_account_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxthpp_account_desc.setText("jtxtdisc_account_code_desc");
        jtxthpp_account_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxthpp_account_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxthpp_account_desc);
        jtxthpp_account_desc.setBounds(380, 200, 400, 23);

        jlblppay_account_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblppay_account_code1.setText("Kode Akun Potongan Sales");
        getContentPane().add(jlblppay_account_code1);
        jlblppay_account_code1.setBounds(70, 220, 180, 13);

        jtxtpot_account_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtpot_account_code.setText("ppay_account_code");
        jtxtpot_account_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtpot_account_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtpot_account_code);
        jtxtpot_account_code.setBounds(260, 220, 90, 23);

        jbtnBrowse4.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse4.setText("...");
        jbtnBrowse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse4);
        jbtnBrowse4.setBounds(350, 220, 30, 17);

        jtxtpot_account_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtpot_account_desc.setText("jtxtdisc_account_code_desc");
        jtxtpot_account_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtpot_account_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtpot_account_desc);
        jtxtpot_account_desc.setBounds(380, 220, 400, 23);

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

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.gl_account, "", jtxtsls_account_code, jtxtsls_account_desc);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jbtnBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse2ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.gl_account, "", jtxtinv_account_code, jtxtinv_account_desc);
}//GEN-LAST:event_jbtnBrowse2ActionPerformed

private void jbtnBrowse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse3ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.gl_account, "", jtxthpp_account_code, jtxthpp_account_desc);
}//GEN-LAST:event_jbtnBrowse3ActionPerformed

private void jtxtsls_account_descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtsls_account_descFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtsls_account_descFocusGained

private void jtxtinv_account_descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtinv_account_descFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtinv_account_descFocusGained

private void jtxthpp_account_descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxthpp_account_descFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxthpp_account_descFocusGained

private void jtxtpot_account_codeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtpot_account_codeFocusGained
    // TODO add your handling code here:
    jtxtpot_account_code.setSelectionStart(0);
    jtxtpot_account_code.setSelectionEnd(jtxtpot_account_code.getText().length());
}//GEN-LAST:event_jtxtpot_account_codeFocusGained

private void jbtnBrowse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse4ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.gl_account, "", jtxtpot_account_code, jtxtpot_account_desc);
}//GEN-LAST:event_jbtnBrowse4ActionPerformed

private void jtxtpot_account_descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtpot_account_descFocusGained
    // TODO add your handling code here:
    jtxtpot_account_desc.setSelectionStart(0);
    jtxtpot_account_desc.setSelectionEnd(jtxtpot_account_desc.getText().length());
}//GEN-LAST:event_jtxtpot_account_descFocusGained

private void jtxtaccset_kodeFocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
    jtxtaccset_kode.setSelectionStart(0);
    jtxtaccset_kode.setSelectionEnd(jtxtaccset_kode.getText().length());
}                                           

private void jtxtaccset_descFocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
    jtxtaccset_desc.setSelectionStart(0);
    jtxtaccset_desc.setSelectionEnd(jtxtaccset_desc.getText().length());
}                                           

private void jtxtap_account_codeFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtsls_account_code.setSelectionStart(0);
    jtxtsls_account_code.setSelectionEnd(jtxtsls_account_code.getText().length());
}                                               

private void jtxtdisc_account_codeFocusGained(java.awt.event.FocusEvent evt) {                                               
        // TODO add your handling code here:
    jtxtinv_account_code.setSelectionStart(0);
    jtxtinv_account_code.setSelectionEnd(jtxtinv_account_code.getText().length());
}                                                 

private void jtxtppay_account_codeFocusGained(java.awt.event.FocusEvent evt) {                                               
        // TODO add your handling code here:
    jtxthpp_account_code.setSelectionStart(0);
    jtxthpp_account_code.setSelectionEnd(jtxthpp_account_code.getText().length());
}                                                 


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {
   obrowse.showbrowser(obrowse.in_account_set, "", jtxtaccset_kode, jtxtaccset_desc);
   try {
        if (!jtxtaccset_kode.getText().equalsIgnoreCase("")){
            if (obj.initdata(jtxtaccset_kode.getText())){
                showData();
            }
        }
    } catch (CodeException ex) {
        Logger.getLogger(Frmap_supplier.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmin_account_set().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowse2;
    private javax.swing.JButton jbtnBrowse3;
    private javax.swing.JButton jbtnBrowse4;
    private javax.swing.JCheckBox jchckactive_sts;
    private javax.swing.JLabel jlblaccset_desc;
    private javax.swing.JLabel jlblaccset_kode;
    private javax.swing.JLabel jlblap_account_code;
    private javax.swing.JLabel jlbldisc_account_code;
    private javax.swing.JLabel jlblppay_account_code;
    private javax.swing.JLabel jlblppay_account_code1;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtaccset_desc;
    private javax.swing.JTextField jtxtaccset_kode;
    private javax.swing.JTextField jtxthpp_account_code;
    private javax.swing.JTextField jtxthpp_account_desc;
    private javax.swing.JTextField jtxtinv_account_code;
    private javax.swing.JTextField jtxtinv_account_desc;
    private javax.swing.JTextField jtxtpot_account_code;
    private javax.swing.JTextField jtxtpot_account_desc;
    private javax.swing.JTextField jtxtsls_account_code;
    private javax.swing.JTextField jtxtsls_account_desc;
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
        jtxtaccset_kode.setText("");
        jtxtaccset_desc.setText("");
        jtxtsls_account_code.setText("");
        jtxtinv_account_code.setText("");
        jtxthpp_account_code.setText("");
        jchckactive_sts.setSelected(true);
        jtxtpot_account_code.setText("");

        jtxtpot_account_desc.setText("");
        jtxtsls_account_desc.setText("");
        jtxtinv_account_desc.setText("");
        jtxthpp_account_desc.setText("");

        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");
    }

    public void newData() throws CodeException {
        istatus=1;
        clearfield();
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

        jtxtaccset_kode.setText(obj.getaccset_kode());
        jtxtaccset_desc.setText(obj.getaccset_desc());
        jtxtsls_account_code.setText(obj.getsls_account_code());
        jtxtinv_account_code.setText(obj.getinv_account_code());
        jtxthpp_account_code.setText(obj.gethpp_account_code());
        jtxtpot_account_code.setText(obj.getpot_account_code());

        jtxtsls_account_desc.setText(obj.getsls_account_desc());
        jtxtinv_account_desc.setText(obj.getinv_account_desc());
        jtxthpp_account_desc.setText(obj.gethpp_account_desc());
        jtxtpot_account_desc.setText(obj.getpot_account_desc());

        if(obj.getactive_sts().equalsIgnoreCase("Y")){
            jchckactive_sts.setSelected(true);
        } else {
            jchckactive_sts.setSelected(false);
        }
        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getentry_date()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getaudit_date()));
        jtxtUserID.setText(obj.getaudit_user());

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
        obj.setaccset_kode(jtxtaccset_kode.getText());
        obj.setaccset_desc(jtxtaccset_desc.getText());
        obj.setsls_account_code(jtxtsls_account_code.getText());
        obj.setinv_account_code(jtxtinv_account_code.getText());
        obj.sethpp_account_code(jtxthpp_account_code.getText());
        obj.setpot_account_code(jtxtpot_account_code.getText());

        if (jchckactive_sts.isSelected()){
        obj.setactive_sts("Y");
        } else {
        obj.setactive_sts("N");
        }

    }

    public void undo() throws CodeException {
        istatus = 0;
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void printData() throws CodeException {
        Map parameter = new HashMap();

        parameter.put("saccset_kode_fr", obj.getaccset_kode());
        parameter.put("saccset_kode_to", obj.getaccset_kode());
        parameter.put("audituser", (GlobalUtils.getUserId()));

        // Versi 1
        String file ="";
        if(GlobalUtils.getAppDir()){
            try{
                    file = GlobalUtils.getCurrentDir() +"/Reports/FMAS-02.jrxml";
                    jasperReport = JasperCompileManager.compileReport(file);
                    //System.out.println("file: "+file);
                    System.out.println("isi parameter "+file+":"+parameter);
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
