/*
 * From ko_pinjaman_tipe
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

package kopkar.ko.component;


import classinterface.NavigatorFormInt;
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.ko.objectclasses.ko_pinjaman_tipeext;
import kopkar.utils.browsecontroller;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmko_pinjaman_tipe extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmko_pinjaman_tipe";
    
    FrmMainFrame mf ;

    ko_pinjaman_tipeext obj=new ko_pinjaman_tipeext();
   
    /** Creates new form Area */
    public Frmko_pinjaman_tipe() throws CodeException {
        initComponents();
    }
    
    public Frmko_pinjaman_tipe(FrmMainFrame mf) throws CodeException{
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
        jlblkode_pinjaman_tipe = new javax.swing.JLabel();
        jtxtkode_pinjaman_tipe = new javax.swing.JTextField();
        jlblnama_pinjaman_tipe = new javax.swing.JLabel();
        jtxtnama_pinjaman_tipe = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipe Pinjaman");
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
        jHeader.setText(" : : Tipe Pinjaman");
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
        jbtnBrowse.setBounds(410, 120, 30, 17);

        jlblkode_pinjaman_tipe.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_pinjaman_tipe.setText("Kode Tipe Pinjaman");
        getContentPane().add(jlblkode_pinjaman_tipe);
        jlblkode_pinjaman_tipe.setBounds(70, 117, 140, 13);

        jtxtkode_pinjaman_tipe.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkode_pinjaman_tipe.setText("kode_pinjaman_tipe");
        jtxtkode_pinjaman_tipe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkode_pinjaman_tipeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkode_pinjaman_tipe);
        jtxtkode_pinjaman_tipe.setBounds(260, 117, 150, 23);

        jlblnama_pinjaman_tipe.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblnama_pinjaman_tipe.setText("Nama Tipe Pinjaman");
        getContentPane().add(jlblnama_pinjaman_tipe);
        jlblnama_pinjaman_tipe.setBounds(70, 134, 140, 13);

        jtxtnama_pinjaman_tipe.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_pinjaman_tipe.setText("nama_pinjaman_tipe");
        jtxtnama_pinjaman_tipe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_pinjaman_tipeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_pinjaman_tipe);
        jtxtnama_pinjaman_tipe.setBounds(260, 134, 150, 23);

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

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowseActionPerformed
        // TODO add your handling code here:
        browsecontroller obrowse = new browsecontroller();
        obrowse.showbrowser(obrowse.ko_pinjaman_tipe, "", jtxtkode_pinjaman_tipe);

        if (!jtxtkode_pinjaman_tipe.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtkode_pinjaman_tipe.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmko_pinjaman_tipe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}//GEN-LAST:event_jbtnBrowseActionPerformed

private void jtxtkode_pinjaman_tipeFocusGained(java.awt.event.FocusEvent evt) {                                                
        // TODO add your handling code here:
    jtxtkode_pinjaman_tipe.setSelectionStart(0);
    jtxtkode_pinjaman_tipe.setSelectionEnd(jtxtkode_pinjaman_tipe.getText().length());
}                                                  

private void jtxtnama_pinjaman_tipeFocusGained(java.awt.event.FocusEvent evt) {                                                
        // TODO add your handling code here:
    jtxtnama_pinjaman_tipe.setSelectionStart(0);
    jtxtnama_pinjaman_tipe.setSelectionEnd(jtxtnama_pinjaman_tipe.getText().length());
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
                    new Frmko_pinjaman_tipe().setVisible(true);
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
    private javax.swing.JLabel jlblkode_pinjaman_tipe;
    private javax.swing.JLabel jlblnama_pinjaman_tipe;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtkode_pinjaman_tipe;
    private javax.swing.JTextField jtxtnama_pinjaman_tipe;
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
        jtxtkode_pinjaman_tipe.setText("");
        jtxtnama_pinjaman_tipe.setText("");
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

        jtxtkode_pinjaman_tipe.setText(obj.getkode_pinjaman_tipe());
        jtxtnama_pinjaman_tipe.setText(obj.getnama_pinjaman_tipe());
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
        obj.setkode_pinjaman_tipe(jtxtkode_pinjaman_tipe.getText());
        obj.setnama_pinjaman_tipe(jtxtnama_pinjaman_tipe.getText());
        
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