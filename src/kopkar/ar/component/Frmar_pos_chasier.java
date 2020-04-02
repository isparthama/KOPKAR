/*
 * From ar_pos_chasier
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
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import common.objectclasses.extended.MasterUserExt;
import kopkar.ar.objectclasses.ar_pos_chasierext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmar_pos_chasier extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmar_pos_chasier";
    
    FrmMainFrame mf ;

    ar_pos_chasierext obj=new ar_pos_chasierext();
    browsecontroller obrowse=new browsecontroller();
   
    /** Creates new form Area */
    public Frmar_pos_chasier() throws CodeException {
        initComponents();
    }
    
    public Frmar_pos_chasier(FrmMainFrame mf) throws CodeException{
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
        jlblchasier_code = new javax.swing.JLabel();
        jtxtchasier_code = new javax.swing.JTextField();
        jlblchasier_name = new javax.swing.JLabel();
        jtxtchasier_name = new javax.swing.JTextField();
        jlbluser_code = new javax.swing.JLabel();
        jtxtuser_code = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlbluser_code1 = new javax.swing.JLabel();
        jtxtuser_code_desc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Kasir");
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
        jHeader.setText(" : : Master Kasir");
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

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(420, 140, 30, 17);

        jlblchasier_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblchasier_code.setText("Kode Kasir");
        getContentPane().add(jlblchasier_code);
        jlblchasier_code.setBounds(70, 100, 140, 13);

        jtxtchasier_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtchasier_code.setText("chasier_code");
        jtxtchasier_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtchasier_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtchasier_code);
        jtxtchasier_code.setBounds(260, 100, 150, 23);

        jlblchasier_name.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblchasier_name.setText("Nama Kasir");
        getContentPane().add(jlblchasier_name);
        jlblchasier_name.setBounds(70, 120, 140, 13);

        jtxtchasier_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtchasier_name.setText("chasier_name");
        jtxtchasier_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtchasier_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtchasier_name);
        jtxtchasier_name.setBounds(260, 120, 340, 23);

        jlbluser_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbluser_code.setText("Kode User");
        getContentPane().add(jlbluser_code);
        jlbluser_code.setBounds(70, 140, 140, 13);

        jtxtuser_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtuser_code.setText("user_code");
        jtxtuser_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtuser_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtuser_code);
        jtxtuser_code.setBounds(260, 140, 150, 23);

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

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(420, 100, 30, 17);

        jlbluser_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbluser_code1.setText("Nama User");
        getContentPane().add(jlbluser_code1);
        jlbluser_code1.setBounds(70, 160, 140, 13);

        jtxtuser_code_desc.setEditable(false);
        jtxtuser_code_desc.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtuser_code_desc.setText("user_code");
        jtxtuser_code_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtuser_code_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtuser_code_desc);
        jtxtuser_code_desc.setBounds(260, 160, 340, 23);

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

private void jtxtuser_code_descFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtuser_code_descFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtuser_code_descFocusGained

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ar_pos_chasier, "", jtxtchasier_code);
   try {
        if (!jtxtchasier_code.getText().equalsIgnoreCase("")){
            if (obj.initdata(jtxtchasier_code.getText())){
                showData();
            }
        }
    } catch (CodeException ex) {
        Logger.getLogger(Frmar_pos_chasier.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.masteruser, "", jtxtuser_code,jtxtuser_code_desc);
}//GEN-LAST:event_jbtnBrowseActionPerformed

private void jtxtchasier_codeFocusGained(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
    jtxtchasier_code.setSelectionStart(0);
    jtxtchasier_code.setSelectionEnd(jtxtchasier_code.getText().length());
}                                            

private void jtxtchasier_nameFocusGained(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
    jtxtchasier_name.setSelectionStart(0);
    jtxtchasier_name.setSelectionEnd(jtxtchasier_name.getText().length());
}                                            

private void jtxtuser_codeFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtuser_code.setSelectionStart(0);
    jtxtuser_code.setSelectionEnd(jtxtuser_code.getText().length());
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
                    new Frmar_pos_chasier().setVisible(true);
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
    private javax.swing.JLabel jlblchasier_code;
    private javax.swing.JLabel jlblchasier_name;
    private javax.swing.JLabel jlbluser_code;
    private javax.swing.JLabel jlbluser_code1;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtchasier_code;
    private javax.swing.JTextField jtxtchasier_name;
    private javax.swing.JTextField jtxtuser_code;
    private javax.swing.JTextField jtxtuser_code_desc;
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
        jtxtchasier_code.setText("");
        jtxtchasier_name.setText("");
        jtxtuser_code.setText("");
        jtxtuser_code_desc.setText("");
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

        jtxtchasier_code.setText(obj.getchasier_code());
        jtxtchasier_name.setText(obj.getchasier_name());
        jtxtuser_code.setText(obj.getuser_code());

        MasterUserExt m=new MasterUserExt();
        if (m.initdata(jtxtuser_code.getText())){
            jtxtuser_code_desc.setText(m.getNama());
        }

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
        obj.setchasier_code(jtxtchasier_code.getText());
        obj.setchasier_name(jtxtchasier_name.getText());
        obj.setuser_code(jtxtuser_code.getText());
        
    }

    public void undo() throws CodeException {
        istatus = 0;
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void printData() throws CodeException {
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
