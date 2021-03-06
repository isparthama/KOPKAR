/*
 * From gl_sumber_data
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
import kopkar.gl.objectclasses.gl_sumber_dataext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmgl_sumber_data extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmgl_sumber_data";
    
    FrmMainFrame mf ;

    gl_sumber_dataext obj=new gl_sumber_dataext();
    private browsecontroller obrowse;
   
    /** Creates new form Area */
    public Frmgl_sumber_data() throws CodeException {
        initComponents();
    }
    
    public Frmgl_sumber_data(FrmMainFrame mf) throws CodeException{
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
        jlblkode_data_entry = new javax.swing.JLabel();
        jtxtkode_data_entry = new javax.swing.JTextField();
        jlblnama_data_entry = new javax.swing.JLabel();
        jtxtnama_data_entry = new javax.swing.JTextField();
        jlbldayseqno = new javax.swing.JLabel();
        jtxtdayseqno = new javax.swing.JTextField();
        jlblcoa_debet = new javax.swing.JLabel();
        jtxtcoa_debet = new javax.swing.JTextField();
        jlblcoa_kredit = new javax.swing.JLabel();
        jtxtcoa_kredit = new javax.swing.JTextField();
        jlblkode_gde = new javax.swing.JLabel();
        jtxtkode_gde = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jbtnBrowse2 = new javax.swing.JButton();
        jtxtcoa_debet_name = new javax.swing.JTextField();
        jtxtcoa_kredit_name = new javax.swing.JTextField();
        jbtnBrowse3 = new javax.swing.JButton();
        jtxtnama_gde = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Asal Data");
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
        jHeader.setText(" : : Master Asal Data");
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
        jbtnBrowse.setBounds(410, 100, 30, 17);

        jlblkode_data_entry.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_data_entry.setText("Kode Data Entry");
        getContentPane().add(jlblkode_data_entry);
        jlblkode_data_entry.setBounds(70, 100, 140, 13);

        jtxtkode_data_entry.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkode_data_entry.setText("kode_data_entry");
        jtxtkode_data_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkode_data_entryFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkode_data_entry);
        jtxtkode_data_entry.setBounds(260, 100, 150, 23);

        jlblnama_data_entry.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblnama_data_entry.setText("Keterangan");
        getContentPane().add(jlblnama_data_entry);
        jlblnama_data_entry.setBounds(70, 120, 140, 13);

        jtxtnama_data_entry.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_data_entry.setText("nama_data_entry");
        jtxtnama_data_entry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_data_entryFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_data_entry);
        jtxtnama_data_entry.setBounds(260, 120, 270, 23);

        jlbldayseqno.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldayseqno.setText("No Sequence");
        getContentPane().add(jlbldayseqno);
        jlbldayseqno.setBounds(70, 160, 140, 13);

        jtxtdayseqno.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdayseqno.setText("dayseqno");
        jtxtdayseqno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdayseqnoFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdayseqno);
        jtxtdayseqno.setBounds(260, 160, 150, 23);

        jlblcoa_debet.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcoa_debet.setText("Akun Debit");
        getContentPane().add(jlblcoa_debet);
        jlblcoa_debet.setBounds(70, 180, 140, 13);

        jtxtcoa_debet.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcoa_debet.setText("coa_debet");
        jtxtcoa_debet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcoa_debetFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcoa_debet);
        jtxtcoa_debet.setBounds(260, 180, 150, 23);

        jlblcoa_kredit.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcoa_kredit.setText("Akun Kredit");
        getContentPane().add(jlblcoa_kredit);
        jlblcoa_kredit.setBounds(70, 200, 140, 13);

        jtxtcoa_kredit.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcoa_kredit.setText("coa_kredit");
        jtxtcoa_kredit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcoa_kreditFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcoa_kredit);
        jtxtcoa_kredit.setBounds(260, 200, 150, 23);

        jlblkode_gde.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_gde.setText("Kode Group Data Entry");
        getContentPane().add(jlblkode_gde);
        jlblkode_gde.setBounds(70, 140, 140, 13);

        jtxtkode_gde.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkode_gde.setText("kode_gde");
        jtxtkode_gde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkode_gdeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkode_gde);
        jtxtkode_gde.setBounds(260, 140, 150, 23);

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
        jbtnBrowse1.setBounds(410, 200, 30, 17);

        jbtnBrowse2.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse2.setText("...");
        jbtnBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse2);
        jbtnBrowse2.setBounds(410, 180, 30, 17);

        jtxtcoa_debet_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcoa_debet_name.setText("coa_debet");
        jtxtcoa_debet_name.setFocusable(false);
        jtxtcoa_debet_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcoa_debet_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcoa_debet_name);
        jtxtcoa_debet_name.setBounds(450, 180, 290, 23);

        jtxtcoa_kredit_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcoa_kredit_name.setText("coa_kredit");
        jtxtcoa_kredit_name.setFocusable(false);
        jtxtcoa_kredit_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcoa_kredit_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcoa_kredit_name);
        jtxtcoa_kredit_name.setBounds(450, 200, 290, 23);

        jbtnBrowse3.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse3.setText("...");
        jbtnBrowse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse3);
        jbtnBrowse3.setBounds(410, 140, 30, 17);

        jtxtnama_gde.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_gde.setText("nama_gde");
        jtxtnama_gde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_gdeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_gde);
        jtxtnama_gde.setBounds(450, 140, 260, 23);

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
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_account, "", jtxtcoa_kredit,jtxtcoa_kredit_name);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jbtnBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse2ActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_account, "", jtxtcoa_debet,jtxtcoa_debet_name);
}//GEN-LAST:event_jbtnBrowse2ActionPerformed

private void jtxtcoa_debet_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtcoa_debet_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtcoa_debet_nameFocusGained

private void jtxtcoa_kredit_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtcoa_kredit_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtcoa_kredit_nameFocusGained

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_sumber_data, "", jtxtkode_data_entry);

    if (!jtxtkode_data_entry.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtkode_data_entry.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmgl_sumber_data.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowseActionPerformed

private void jbtnBrowse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse3ActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_group_data_entry, "", jtxtkode_gde,jtxtnama_gde);
}//GEN-LAST:event_jbtnBrowse3ActionPerformed

private void jtxtnama_gdeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtnama_gdeFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtnama_gdeFocusGained

private void jtxtkode_data_entryFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtkode_data_entry.setSelectionStart(0);
    jtxtkode_data_entry.setSelectionEnd(jtxtkode_data_entry.getText().length());
}                                               

private void jtxtnama_data_entryFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtnama_data_entry.setSelectionStart(0);
    jtxtnama_data_entry.setSelectionEnd(jtxtnama_data_entry.getText().length());
}                                               

private void jtxtdayseqnoFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtdayseqno.setSelectionStart(0);
    jtxtdayseqno.setSelectionEnd(jtxtdayseqno.getText().length());
}                                        

private void jtxtcoa_debetFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtcoa_debet.setSelectionStart(0);
    jtxtcoa_debet.setSelectionEnd(jtxtcoa_debet.getText().length());
}                                         

private void jtxtcoa_kreditFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtcoa_kredit.setSelectionStart(0);
    jtxtcoa_kredit.setSelectionEnd(jtxtcoa_kredit.getText().length());
}                                          

private void jtxtkode_gdeFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtkode_gde.setSelectionStart(0);
    jtxtkode_gde.setSelectionEnd(jtxtkode_gde.getText().length());
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
                    new Frmgl_sumber_data().setVisible(true);
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
    private javax.swing.JLabel jlblcoa_debet;
    private javax.swing.JLabel jlblcoa_kredit;
    private javax.swing.JLabel jlbldayseqno;
    private javax.swing.JLabel jlblkode_data_entry;
    private javax.swing.JLabel jlblkode_gde;
    private javax.swing.JLabel jlblnama_data_entry;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtcoa_debet;
    private javax.swing.JTextField jtxtcoa_debet_name;
    private javax.swing.JTextField jtxtcoa_kredit;
    private javax.swing.JTextField jtxtcoa_kredit_name;
    private javax.swing.JTextField jtxtdayseqno;
    private javax.swing.JTextField jtxtkode_data_entry;
    private javax.swing.JTextField jtxtkode_gde;
    private javax.swing.JTextField jtxtnama_data_entry;
    private javax.swing.JTextField jtxtnama_gde;
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
        jtxtkode_data_entry.setText("");
        jtxtnama_data_entry.setText("");
        jtxtdayseqno.setText("");
        jtxtcoa_debet.setText("");
        jtxtcoa_kredit.setText("");
        jtxtkode_gde.setText("");

        jtxtcoa_debet_name.setText("");
        jtxtcoa_kredit_name.setText("");

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

        jtxtkode_data_entry.setText(obj.getkode_data_entry());
        jtxtnama_data_entry.setText(obj.getnama_data_entry());
        jtxtdayseqno.setText(GlobalUtils.formatnumber(obj.getdayseqno()));
        jtxtcoa_debet.setText(obj.getcoa_debet());
        jtxtcoa_kredit.setText(obj.getcoa_kredit());
        jtxtkode_gde.setText(obj.getkode_gde());

        jtxtcoa_debet_name.setText(obj.getnama_akun_dbt());
        jtxtcoa_kredit_name.setText(obj.getnama_akun_krd());
        
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
        obj.setkode_data_entry(jtxtkode_data_entry.getText());
        obj.setnama_data_entry(jtxtnama_data_entry.getText());
        obj.setdayseqno(GlobalUtils.toInt(jtxtdayseqno.getText()));
        obj.setcoa_debet(jtxtcoa_debet.getText());
        obj.setcoa_kredit(jtxtcoa_kredit.getText());
        obj.setkode_gde(jtxtkode_gde.getText());

        
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
