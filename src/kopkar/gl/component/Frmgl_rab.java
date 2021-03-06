/*
 * From gl_rab
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

package kopkar.gl.component;


import classinterface.NavigatorFormInt;
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import kopkar.gl.objectclasses.gl_rabext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalUtils;
import utils.JTextFieldLimit;

/**
 *
 * @author  Generator
 */

public class Frmgl_rab extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmgl_rab";
    
    FrmMainFrame mf ;

    gl_rabext obj=new gl_rabext();
    private browsecontroller obrowse;
   
    /** Creates new form Area */
    public Frmgl_rab() throws CodeException {
        initComponents();
    }
    
    public Frmgl_rab(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();

        jtxtkode_rab.setDocument(new JTextFieldLimit(3));
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
        jbtnBrowse_akun_kredit = new javax.swing.JButton();
        jlblkode_rab = new javax.swing.JLabel();
        jtxtkode_rab = new javax.swing.JTextField();
        jlblnama_rab = new javax.swing.JLabel();
        jtxtnama_rab = new javax.swing.JTextField();
        jlblrab_debet = new javax.swing.JLabel();
        jtxtrab_debet = new javax.swing.JTextField();
        jlblrab_kredit = new javax.swing.JLabel();
        jtxtrab_kredit = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jtxtrab_debet_name = new javax.swing.JTextField();
        jtxtrab_kredit_name = new javax.swing.JTextField();
        jbtnBrowse_kode_rab = new javax.swing.JButton();
        jbtnBrowse_akun_debit = new javax.swing.JButton();
        jchkaktif = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master RAB");
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
        jHeader.setText(" : : Master RAB");
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

        jbtnBrowse_akun_kredit.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_akun_kredit.setText("...");
        jbtnBrowse_akun_kredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_akun_kreditActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_akun_kredit);
        jbtnBrowse_akun_kredit.setBounds(420, 160, 30, 17);

        jlblkode_rab.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_rab.setText("Kode RAB");
        getContentPane().add(jlblkode_rab);
        jlblkode_rab.setBounds(70, 100, 140, 13);

        jtxtkode_rab.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkode_rab.setText("kode_rab");
        jtxtkode_rab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkode_rabFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkode_rab);
        jtxtkode_rab.setBounds(260, 100, 150, 23);

        jlblnama_rab.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblnama_rab.setText("Keterangan");
        getContentPane().add(jlblnama_rab);
        jlblnama_rab.setBounds(70, 120, 140, 13);

        jtxtnama_rab.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_rab.setText("nama_rab");
        jtxtnama_rab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_rabFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_rab);
        jtxtnama_rab.setBounds(260, 120, 270, 23);

        jlblrab_debet.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblrab_debet.setText("Akun Debit");
        getContentPane().add(jlblrab_debet);
        jlblrab_debet.setBounds(70, 140, 140, 13);

        jtxtrab_debet.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtrab_debet.setText("rab_debet");
        jtxtrab_debet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtrab_debetFocusGained(evt);
            }
        });
        getContentPane().add(jtxtrab_debet);
        jtxtrab_debet.setBounds(260, 140, 150, 23);

        jlblrab_kredit.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblrab_kredit.setText("Akun Kredit");
        getContentPane().add(jlblrab_kredit);
        jlblrab_kredit.setBounds(70, 160, 140, 13);

        jtxtrab_kredit.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtrab_kredit.setText("rab_kredit");
        jtxtrab_kredit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtrab_kreditFocusGained(evt);
            }
        });
        getContentPane().add(jtxtrab_kredit);
        jtxtrab_kredit.setBounds(260, 160, 150, 23);

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

        jtxtrab_debet_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtrab_debet_name.setText("rab_debet");
        jtxtrab_debet_name.setFocusable(false);
        jtxtrab_debet_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtrab_debet_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtrab_debet_name);
        jtxtrab_debet_name.setBounds(460, 140, 330, 23);

        jtxtrab_kredit_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtrab_kredit_name.setText("rab_kredit");
        jtxtrab_kredit_name.setFocusable(false);
        jtxtrab_kredit_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtrab_kredit_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtrab_kredit_name);
        jtxtrab_kredit_name.setBounds(460, 160, 330, 23);

        jbtnBrowse_kode_rab.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_kode_rab.setText("...");
        jbtnBrowse_kode_rab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_kode_rabActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_kode_rab);
        jbtnBrowse_kode_rab.setBounds(420, 100, 30, 17);

        jbtnBrowse_akun_debit.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_akun_debit.setText("...");
        jbtnBrowse_akun_debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_akun_debitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_akun_debit);
        jbtnBrowse_akun_debit.setBounds(420, 140, 30, 17);

        jchkaktif.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkaktif.setText("Aktif");
        getContentPane().add(jchkaktif);
        jchkaktif.setBounds(420, 70, 54, 24);

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

private void jtxtrab_debet_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtrab_debet_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtrab_debet_nameFocusGained

private void jtxtrab_kredit_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtrab_kredit_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtrab_kredit_nameFocusGained

private void jbtnBrowse_kode_rabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_kode_rabActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_rab, "", jtxtkode_rab);

    if (!jtxtkode_rab.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtkode_rab.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmgl_rab.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowse_kode_rabActionPerformed

private void jbtnBrowse_akun_debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_akun_debitActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_account, "", jtxtrab_debet,jtxtrab_debet_name);
}//GEN-LAST:event_jbtnBrowse_akun_debitActionPerformed

private void jbtnBrowse_akun_kreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_akun_kreditActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_account, "", jtxtrab_kredit,jtxtrab_kredit_name);
}//GEN-LAST:event_jbtnBrowse_akun_kreditActionPerformed

private void jtxtkode_rabFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtkode_rab.setSelectionStart(0);
    jtxtkode_rab.setSelectionEnd(jtxtkode_rab.getText().length());
}                                        

private void jtxtnama_rabFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtnama_rab.setSelectionStart(0);
    jtxtnama_rab.setSelectionEnd(jtxtnama_rab.getText().length());
}                                        

private void jtxtrab_debetFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtrab_debet.setSelectionStart(0);
    jtxtrab_debet.setSelectionEnd(jtxtrab_debet.getText().length());
}                                         

private void jtxtrab_kreditFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtrab_kredit.setSelectionStart(0);
    jtxtrab_kredit.setSelectionEnd(jtxtrab_kredit.getText().length());
}                                          


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("gl_rab", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmgl_rab.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmgl_rab().setVisible(true);
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
    private javax.swing.JButton jbtnBrowse_akun_debit;
    private javax.swing.JButton jbtnBrowse_akun_kredit;
    private javax.swing.JButton jbtnBrowse_kode_rab;
    private javax.swing.JCheckBox jchkaktif;
    private javax.swing.JLabel jlblkode_rab;
    private javax.swing.JLabel jlblnama_rab;
    private javax.swing.JLabel jlblrab_debet;
    private javax.swing.JLabel jlblrab_kredit;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtkode_rab;
    private javax.swing.JTextField jtxtnama_rab;
    private javax.swing.JTextField jtxtrab_debet;
    private javax.swing.JTextField jtxtrab_debet_name;
    private javax.swing.JTextField jtxtrab_kredit;
    private javax.swing.JTextField jtxtrab_kredit_name;
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
        jtxtkode_rab.setText("");
        jtxtnama_rab.setText("");
        jtxtrab_debet.setText("");
        jtxtrab_kredit.setText("");
        jchkaktif.setSelected(true);

        jtxtrab_debet_name.setText("");
        jtxtrab_kredit_name.setText("");

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

        jtxtkode_rab.setText(obj.getkode_rab());
        jtxtnama_rab.setText(obj.getnama_rab());
        jtxtrab_debet.setText(obj.getrab_debet());
        jtxtrab_kredit.setText(obj.getrab_kredit());
        if (obj.getaktif().equalsIgnoreCase("Y")){
            jchkaktif.setSelected(true);
        } else {
            jchkaktif.setSelected(false);
        }

        jtxtrab_debet_name.setText(obj.getnama_akun_dbt());
        jtxtrab_kredit_name.setText(obj.getnama_akun_krd());

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
            jbtnBrowse_kode_rab.setEnabled(false);
        } else {
            jbtnBrowse_kode_rab.setEnabled(true);
        }
    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }
        obj.setkode_rab(jtxtkode_rab.getText());
        obj.setnama_rab(jtxtnama_rab.getText());
        obj.setrab_debet(jtxtrab_debet.getText());
        obj.setrab_kredit(jtxtrab_kredit.getText());
        if (jchkaktif.isSelected()){
        obj.setaktif("Y");
        } else {
        obj.setaktif("N");
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
