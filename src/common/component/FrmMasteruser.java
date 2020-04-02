/*
 * From Template
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import common.component.FrmMastergroup;
 * 
 * .......
 * 
 try {
        if (frmmasteruser == null) {
            frmmasteruser = new FrmMasteruser(this);
        }
        
        showForm(frmmasteruser);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */


package common.component;

import classinterface.NavigatorFormInt;
import common.objectclasses.Mastergroup;
import common.objectclasses.extended.MasterGroupExt;
import common.objectclasses.extended.MasterGroupExtcols;
import common.objectclasses.extended.MasterUserExt;
import common.objectclasses.extended.MasteruserdetailExt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalModel;
import utils.GlobalUtils;


/**
 *
 * @author  Generator
 */

public class FrmMasteruser extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmMasteruser";
    
    FrmMainFrame mf ;
    
    
    public MasterUserExt obj = new MasterUserExt();
    
    Object[] data = new Object[4];

    protected DefaultTableModel tmodel;
   
   
    /** Creates new form Area */
    public FrmMasteruser() throws CodeException {
        initComponents();
    }
    
    public FrmMasteruser(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
        tmodel=(DefaultTableModel) jtbluser.getModel();
        GlobalModel.clearRow(tmodel);
  
    }

    protected void inisialisasicomponents(){
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
        jlblUser = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jlblPassword = new javax.swing.JLabel();
        jlblNama = new javax.swing.JLabel();
        jtxtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbluser = new javax.swing.JTable();
        jtxtPassword = new javax.swing.JPasswordField();
        jbtnBrowse = new javax.swing.JButton();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Masteruser");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Masteruser");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 130, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 2);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 2, 400);

        jlblUser.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblUser.setText("User");
        getContentPane().add(jlblUser);
        jlblUser.setBounds(60, 80, 140, 14);

        jtxtUser.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtUser.setText("User");
        jtxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUserKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtUser);
        jtxtUser.setBounds(250, 80, 80, 20);

        jlblPassword.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblPassword.setText("Password");
        getContentPane().add(jlblPassword);
        jlblPassword.setBounds(60, 100, 140, 14);

        jlblNama.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblNama.setText("Nama");
        getContentPane().add(jlblNama);
        jlblNama.setBounds(60, 120, 140, 14);

        jtxtNama.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtNama.setText("Nama");
        getContentPane().add(jtxtNama);
        jtxtNama.setBounds(250, 120, 410, 20);

        jtbluser.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Group", "Deskripsi", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbluser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtbluserFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtbluser);
        jtbluser.getColumnModel().getColumn(0).setMinWidth(0);
        jtbluser.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtbluser.getColumnModel().getColumn(0).setMaxWidth(0);
        jtbluser.getColumnModel().getColumn(1).setMinWidth(200);
        jtbluser.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtbluser.getColumnModel().getColumn(1).setMaxWidth(200);
        jtbluser.getColumnModel().getColumn(2).setMinWidth(400);
        jtbluser.getColumnModel().getColumn(2).setPreferredWidth(400);
        jtbluser.getColumnModel().getColumn(2).setMaxWidth(400);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 730, 270);

        jtxtPassword.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtPassword);
        jtxtPassword.setBounds(250, 100, 80, 20);

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(340, 80, 30, 17);

        jtxtTanggalEntry.setEditable(false);
        jtxtTanggalEntry.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalEntry.setText("TanggalEntry");
        getContentPane().add(jtxtTanggalEntry);
        jtxtTanggalEntry.setBounds(360, 30, 170, 16);

        jtxtTanggalUpdate.setEditable(false);
        jtxtTanggalUpdate.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalUpdate.setText("TanggalUpdate");
        getContentPane().add(jtxtTanggalUpdate);
        jtxtTanggalUpdate.setBounds(530, 30, 130, 16);

        jtxtUserID.setEditable(false);
        jtxtUserID.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtUserID.setText("UserID");
        getContentPane().add(jtxtUserID);
        jtxtUserID.setBounds(660, 30, 140, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            newData();

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

private void jtbluserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtbluserFocusGained


}//GEN-LAST:event_jtbluserFocusGained

private void jtxtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUserKeyTyped
    activeTableUser();
}//GEN-LAST:event_jtxtUserKeyTyped

private void jtxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPasswordKeyTyped
    activeTableUser();
}//GEN-LAST:event_jtxtPasswordKeyTyped

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
    browsecontroller ob=new browsecontroller();
    ob.showbrowser(ob.masteruser, "", jtxtUser);
    try {
        if (obj.initdata(jtxtUser.getText())) {
            showData();
        }
    } catch (CodeException ex) {
        Logger.getLogger(FrmMasteruser.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jbtnBrowseActionPerformed


private void activeTableUser() {
    if (jtxtUser.getText().equals("") || jtxtPassword.getText().equals("")) {
        jtbluser.setEnabled(false);
    }else{
        jtbluser.setEnabled(true);        
    }
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
                    new FrmMasteruser().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JLabel jlblNama;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblUser;
    protected javax.swing.JTable jtbluser;
    private javax.swing.JTextField jtxtNama;
    private javax.swing.JPasswordField jtxtPassword;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUser;
    private javax.swing.JTextField jtxtUserID;
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
        obj = new MasterUserExt();
        obj.initdata(this.jtxtUser.getText());
        showData();
        mf.setIcon(CLASSNAME);
    }
    public void newData() throws CodeException {
        obj = new MasterUserExt();
        istatus=obj.Status_Insert;
        showData();
        activeTableUser();
    }

    public void saveData() throws CodeException {
        
        if (!"".equals(jtxtUser.getText()) && !"".equals(jtxtPassword.getText())) {
            setData();
            obj.update();
            istatus=obj.Status_normal;
            for (int i = 0; i < tmodel.getRowCount(); i++) {
                String kodegroup = tmodel.getValueAt(i, 1) + "";
                boolean bselect = tmodel.getValueAt(i, 3) == null? false : Boolean.parseBoolean(tmodel.getValueAt(i, 3)+"") ;

                MasteruserdetailExt mb = new MasteruserdetailExt();
                mb.initdata(jtxtUser.getText(), kodegroup);
                
                if (bselect) {
                    mb.setUser(jtxtUser.getText());
                    mb.setKodeGroup(kodegroup);
                    if (mb.getId()>0){
                        mb.update();
                    } else {
                        mb.insert();
                        mb.update();
                    }
                }else {
                    if (mb.getId() != null) {
                        mb.delete();
                    }
                }
            }
            showData();

            mf.setIcon(CLASSNAME);
        } else {
            JOptionPane.showMessageDialog(null, "User dan Password Tidak Boleh Kosong", "Form User", JOptionPane.ERROR_MESSAGE);
        }
        

    }

    public void showData() throws CodeException {
	
             jtxtUser.setText(obj.getUser());
             jtxtPassword.setText(obj.getPassword());
             jtxtNama.setText(obj.getNama());
             jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getTanggalEntry()));
             jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getTanggalUpdate()));
             jtxtUserID.setText(obj.getUserId());
             
             GlobalModel.clearRow(tmodel);
             int i = 0;
             MasterGroupExtcols groups = new MasterGroupExtcols();
             if (groups.initdata(obj.getUser())){
                 for (i=0;i<groups.size();i++) {
                    MasterGroupExt group = groups.get(i);

                    tmodel.addRow(data);
                    tmodel.setValueAt(group.getId(), i, 0);
                    tmodel.setValueAt(group.getKodeGroup(), i, 1);
                    tmodel.setValueAt(group.getKeterangan(), i, 2);

                    if (group.getselected()==1) {
                        tmodel.setValueAt(true, i, 3);
                    } else {
                        tmodel.setValueAt(false, i, 3);
                    }
                 }
             }
             activeTableUser();
             setToolBar(iformtype, istatus);
    }

    public void delete() throws CodeException {
        obj.delete();
        obj.moveFirst();
        showData();
        setToolBar(iformtype,istatus);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);        
    }

    public void setData() throws CodeException {
        
          if (istatus==obj.Status_Insert){
              obj.insert();
          }
          obj.setUser(jtxtUser.getText()) ;
          obj.setPassword(jtxtPassword.getText()) ;
          obj.setNama(jtxtNama.getText()) ;
          
    }

    public void undo() throws CodeException {
        istatus = 0;
        moveFirst();
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void importCsv() throws CodeException {
          
    }

    public void exportCsv() throws CodeException {
        
    }

    public void importText() throws CodeException {
        
    }

    public void exportText() throws CodeException {
         
    }

    public void printData() throws CodeException {

    }
    
}
