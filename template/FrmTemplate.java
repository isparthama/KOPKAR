/*
 * From Template
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

package generator.template;


import bmtapp.component.bmtapp.*;
import bmtapp.classinterface.NavigatorFormInt;
import bmtapp.component.FrmMainFrame;
import bmtapp.objectclasses.extended.TemplateExt;
import bmtapp.utils.CodeException;
import bmtapp.utils.GlobalUtils;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  Generator
 */

public class FrmTemplate extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="FrmTemplate";
    
    FrmMainFrame mf ;

    Templateext obj=new Templateext();
   
    /** Creates new form Area */
    public FrmTemplate() throws CodeException {
        initComponents();
    }
    
    public FrmTemplate(FrmMainFrame mf) throws CodeException{
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
//getinitcomponents
        jlblCompany = new javax.swing.JLabel();
        jtxtkd_carabyr = new javax.swing.JTextField();
        jlblDescription = new javax.swing.JLabel();
        jtxtnm_carabyr = new javax.swing.JTextField();
//getinitcomponentsend
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jlblDescription1 = new javax.swing.JLabel();
        jcmbInterval = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Template");
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
        jHeader.setText(" : : template");
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
        jbtnBrowse.setBounds(420, 100, 30, 17);
//getproperties
        jlblCompany.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblCompany.setText("Kode Cara Pembayaran");
        getContentPane().add(jlblCompany);
        jlblCompany.setBounds(70, 100, 140, 13);

        jtxtkd_carabyr.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtkd_carabyr.setText("Company");
	jtxtsupplier_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtkd_carabyrFocusGained(evt);
            }
        });
        getContentPane().add(jtxtkd_carabyr);
        jtxtkd_carabyr.setBounds(260, 100, 150, 23);

        jlblDescription.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblDescription.setText("Interval");
        getContentPane().add(jlblDescription);
        jlblDescription.setBounds(70, 140, 140, 13);

        jtxtnm_carabyr.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnm_carabyr.setText("Description");
        getContentPane().add(jtxtnm_carabyr);
        jtxtnm_carabyr.setBounds(260, 120, 450, 23);

	jlblDescription1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblDescription1.setText("Nama Cara Pembayaran");
        getContentPane().add(jlblDescription1);
        jlblDescription1.setBounds(70, 120, 140, 13);

//getpropertiesend
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

        jcmbInterval.setFont(new java.awt.Font("Dialog", 0, 10));
        jcmbInterval.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "day", "week", "month", "year" }));
        getContentPane().add(jcmbInterval);
        jcmbInterval.setBounds(260, 140, 65, 23);

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

//getfocusgainedevent
private void jtxtkd_carabyrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtsupplier_codeFocusGained
    // TODO add your handling code here:
    jtxtkd_carabyr.setSelectionStart(0);
    jtxtkd_carabyr.setSelectionEnd(jtxtkd_carabyr.getText().length());
}//GEN-LAST:event_jtxtsupplier_codeFocusGained
//getfocusgainedeventend
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("Template", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(FrmTemplate.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmTemplate().setVisible(true);
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
    private javax.swing.JComboBox jcmbInterval;
//getvariabledeclaration
    private javax.swing.JLabel jlblCompany;
    private javax.swing.JTextField jtxtkd_carabyr;
    private javax.swing.JLabel jlblDescription;
    private javax.swing.JTextField jtxtnm_carabyr;
//getvariabledeclarationend
    private javax.swing.JLabel jlblDescription1;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
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
        showData();
        mf.setIcon(CLASSNAME);

    }

    private void clearfield(){
//getclearfield
        jtxtkd_carabyr.setText("");
        jtxtnm_carabyr.setText("");
//getclearfieldend
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

//getshowdata
        jtxtkd_carabyr.setText(obj.getKdCarabyr());
        jtxtnm_carabyr.setText(obj.getNmCarabyr());
        jcmbInterval.setSelectedItem(obj.getInterval());    
//getshowdataend
        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getEntrydate()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getAuditdate()));
        jtxtUserID.setText(obj.getAudituser());

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
//getsetdata
        obj.setKdCarabyr(jtxtkd_carabyr.getText());
        obj.setNmCarabyr(jtxtnm_carabyr.getText());
//getsetdataend
        obj.setInterval(jcmbInterval.getSelectedItem().toString());

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
