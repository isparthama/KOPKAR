/*
 * From gl_account
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
import kopkar.gl.objectclasses.gl_accountext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmgl_account extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmgl_account";
    
    FrmMainFrame mf ;

    gl_accountext obj=new gl_accountext();
   
    /** Creates new form Area */
    public Frmgl_account() throws CodeException {
        initComponents();
    }
    
    public Frmgl_account(FrmMainFrame mf) throws CodeException{
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
        jbtnBrowse_Kode_Akun = new javax.swing.JButton();
        jlblkode_akun = new javax.swing.JLabel();
        jtxtkode_akun = new javax.swing.JTextField();
        jlblnama_akun = new javax.swing.JLabel();
        jtxtnama_akun = new javax.swing.JTextField();
        jlbltipe_rek = new javax.swing.JLabel();
        jlblgroup_rek = new javax.swing.JLabel();
        jtxtgroup_rek = new javax.swing.JTextField();
        jlblentrydate = new javax.swing.JLabel();
        jtxtnama_group = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jchkstatus = new javax.swing.JCheckBox();
        jopttipe_rek_debet = new javax.swing.JRadioButton();
        jopttipe_rek_kredit = new javax.swing.JRadioButton();
        jbtnBrowse_Kode_Group = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Akun");
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
        jHeader.setText(" : : Master Akun");
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

        jbtnBrowse_Kode_Akun.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_Kode_Akun.setText("...");
        jbtnBrowse_Kode_Akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_Kode_AkunActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_Kode_Akun);
        jbtnBrowse_Kode_Akun.setBounds(420, 100, 30, 17);

        jlblkode_akun.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_akun.setText("Kode Akun");
        getContentPane().add(jlblkode_akun);
        jlblkode_akun.setBounds(70, 100, 140, 13);

        jtxtkode_akun.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkode_akun.setText("kode_akun");
        jtxtkode_akun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkode_akunFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkode_akun);
        jtxtkode_akun.setBounds(260, 100, 150, 23);

        jlblnama_akun.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblnama_akun.setText("Nama Akun");
        getContentPane().add(jlblnama_akun);
        jlblnama_akun.setBounds(70, 120, 140, 13);

        jtxtnama_akun.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_akun.setText("nama_akun");
        jtxtnama_akun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_akunFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_akun);
        jtxtnama_akun.setBounds(260, 120, 400, 23);

        jlbltipe_rek.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbltipe_rek.setText("Tipe");
        getContentPane().add(jlbltipe_rek);
        jlbltipe_rek.setBounds(70, 140, 140, 13);

        jlblgroup_rek.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblgroup_rek.setText("Kode Group");
        getContentPane().add(jlblgroup_rek);
        jlblgroup_rek.setBounds(70, 170, 140, 13);

        jtxtgroup_rek.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtgroup_rek.setText("group_rek");
        jtxtgroup_rek.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtgroup_rekFocusGained(evt);
            }
        });
        getContentPane().add(jtxtgroup_rek);
        jtxtgroup_rek.setBounds(260, 170, 70, 23);

        jlblentrydate.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblentrydate.setText("Nama Group");
        getContentPane().add(jlblentrydate);
        jlblentrydate.setBounds(70, 190, 140, 13);

        jtxtnama_group.setEditable(false);
        jtxtnama_group.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_group.setText("nama_group");
        getContentPane().add(jtxtnama_group);
        jtxtnama_group.setBounds(260, 190, 260, 23);

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

        jchkstatus.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkstatus.setSelected(true);
        jchkstatus.setText("Aktif");
        getContentPane().add(jchkstatus);
        jchkstatus.setBounds(420, 70, 54, 24);

        buttonGroup1.add(jopttipe_rek_debet);
        jopttipe_rek_debet.setFont(new java.awt.Font("Dialog", 1, 10));
        jopttipe_rek_debet.setSelected(true);
        jopttipe_rek_debet.setText("Debit");
        getContentPane().add(jopttipe_rek_debet);
        jopttipe_rek_debet.setBounds(260, 140, 106, 24);

        buttonGroup1.add(jopttipe_rek_kredit);
        jopttipe_rek_kredit.setFont(new java.awt.Font("Dialog", 1, 10));
        jopttipe_rek_kredit.setText("Kredit");
        getContentPane().add(jopttipe_rek_kredit);
        jopttipe_rek_kredit.setBounds(370, 140, 100, 24);

        jbtnBrowse_Kode_Group.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_Kode_Group.setText("...");
        jbtnBrowse_Kode_Group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_Kode_GroupActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_Kode_Group);
        jbtnBrowse_Kode_Group.setBounds(330, 170, 30, 17);

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

private void jbtnBrowse_Kode_AkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_Kode_AkunActionPerformed
    // TODO add your handling code here:
    browsecontroller obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_account, "", jtxtkode_akun);

    if (!jtxtkode_akun.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtkode_akun.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmgl_account.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowse_Kode_AkunActionPerformed

private void jbtnBrowse_Kode_GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_Kode_GroupActionPerformed
    // TODO add your handling code here:
    browsecontroller obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.gl_group, "", jtxtgroup_rek,jtxtnama_group);
}//GEN-LAST:event_jbtnBrowse_Kode_GroupActionPerformed

private void jtxtkode_akunFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtkode_akun.setSelectionStart(0);
    jtxtkode_akun.setSelectionEnd(jtxtkode_akun.getText().length());
}                                         

private void jtxtnama_akunFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtnama_akun.setSelectionStart(0);
    jtxtnama_akun.setSelectionEnd(jtxtnama_akun.getText().length());
}                                         

private void jtxtgroup_rekFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtgroup_rek.setSelectionStart(0);
    jtxtgroup_rek.setSelectionEnd(jtxtgroup_rek.getText().length());
}                                         

private void jtxtentrydateFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtnama_group.setSelectionStart(0);
    jtxtnama_group.setSelectionEnd(jtxtnama_group.getText().length());
}                                         


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("gl_account", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmgl_account.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmgl_account().setVisible(true);
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
    private javax.swing.JButton jbtnBrowse_Kode_Akun;
    private javax.swing.JButton jbtnBrowse_Kode_Group;
    private javax.swing.JCheckBox jchkstatus;
    private javax.swing.JLabel jlblentrydate;
    private javax.swing.JLabel jlblgroup_rek;
    private javax.swing.JLabel jlblkode_akun;
    private javax.swing.JLabel jlblnama_akun;
    private javax.swing.JLabel jlbltipe_rek;
    private javax.swing.JRadioButton jopttipe_rek_debet;
    private javax.swing.JRadioButton jopttipe_rek_kredit;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtgroup_rek;
    private javax.swing.JTextField jtxtkode_akun;
    private javax.swing.JTextField jtxtnama_akun;
    private javax.swing.JTextField jtxtnama_group;
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
        jtxtkode_akun.setText("");
        jtxtnama_akun.setText("");
        jopttipe_rek_debet.setSelected(true);
        jtxtgroup_rek.setText("");
        jchkstatus.setSelected(true);
        jtxtnama_group.setText("");

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

        jtxtkode_akun.setText(obj.getkode_akun());
        jtxtnama_akun.setText(obj.getnama_akun());
        if (obj.gettipe_rek().equalsIgnoreCase("D")){
        jopttipe_rek_debet.setSelected(true);
        } else {
            jopttipe_rek_kredit.setSelected(true);
        }
        jtxtgroup_rek.setText(obj.getgroup_rek());
        if (obj.getstatus().equalsIgnoreCase("Y")){
        jchkstatus.setSelected(true);
        } else {
        jchkstatus.setSelected(false);
        }
        jtxtnama_group.setText(obj.getnama_group());
        
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
            jbtnBrowse_Kode_Akun.setEnabled(false);
        } else {
            jbtnBrowse_Kode_Akun.setEnabled(true);
        }
    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }
        obj.setkode_akun(jtxtkode_akun.getText());
        obj.setnama_akun(jtxtnama_akun.getText());
        if (jopttipe_rek_debet.isSelected()){
        obj.settipe_rek("D");
        } else {
        obj.settipe_rek("K");
        }
        obj.setgroup_rek(jtxtgroup_rek.getText());
        if (jchkstatus.isSelected()){
            obj.setstatus("Y");
        } else {
            obj.setstatus("N");
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
