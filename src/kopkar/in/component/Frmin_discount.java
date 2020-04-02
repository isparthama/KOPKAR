/*
 * From in_discount
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



import classinterface.NavigatorFormInt;
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.in.objectclasses.in_discountext;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmin_discount extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmin_discount";
    
    FrmMainFrame mf ;

    in_discountext obj=new in_discountext();
   
    /** Creates new form Area */
    public Frmin_discount() throws CodeException {
        initComponents();
    }
    
    public Frmin_discount(FrmMainFrame mf) throws CodeException{
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
        jlbldiscount_code = new javax.swing.JLabel();
        jtxtdiscount_code = new javax.swing.JTextField();
        jlbldiscount_desc = new javax.swing.JLabel();
        jtxtdiscount_desc = new javax.swing.JTextField();
        jlbldiscount = new javax.swing.JLabel();
        jtxtdiscount = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("in_discount");
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
        jHeader.setText(" : : Discount");
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

        jlbldiscount_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldiscount_code.setText("Kode Discount");
        getContentPane().add(jlbldiscount_code);
        jlbldiscount_code.setBounds(70, 100, 140, 13);

        jtxtdiscount_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdiscount_code.setText("discount_code");
        jtxtdiscount_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdiscount_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdiscount_code);
        jtxtdiscount_code.setBounds(190, 100, 150, 23);

        jlbldiscount_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldiscount_desc.setText("Keterangan ");
        getContentPane().add(jlbldiscount_desc);
        jlbldiscount_desc.setBounds(70, 120, 140, 13);

        jtxtdiscount_desc.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdiscount_desc.setText("discount_desc");
        jtxtdiscount_desc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdiscount_descFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdiscount_desc);
        jtxtdiscount_desc.setBounds(190, 120, 360, 23);

        jlbldiscount.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldiscount.setText("Discount");
        getContentPane().add(jlbldiscount);
        jlbldiscount.setBounds(70, 140, 140, 10);

        jtxtdiscount.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdiscount.setText("discount");
        jtxtdiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdiscountFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdiscount);
        jtxtdiscount.setBounds(190, 140, 360, 23);

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

private void jtxtidFocusGained(java.awt.event.FocusEvent evt) {                                
        // TODO add your handling code here:
}                                  

private void jtxtdiscount_codeFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxtdiscount_code.setSelectionStart(0);
    jtxtdiscount_code.setSelectionEnd(jtxtdiscount_code.getText().length());
}                                             

private void jtxtdiscount_descFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxtdiscount_desc.setSelectionStart(0);
    jtxtdiscount_desc.setSelectionEnd(jtxtdiscount_desc.getText().length());
}                                             

private void jtxtdiscountFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtdiscount.setSelectionStart(0);
    jtxtdiscount.setSelectionEnd(jtxtdiscount.getText().length());
}                                        

private void jtxtentrydateFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
}                                         

private void jtxtauditdateFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
}                                         

private void jtxtaudituserFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
}                                         

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("in_discount", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmin_discount.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmin_discount().setVisible(true);
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
    private javax.swing.JLabel jlbldiscount;
    private javax.swing.JLabel jlbldiscount_code;
    private javax.swing.JLabel jlbldiscount_desc;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtdiscount;
    private javax.swing.JTextField jtxtdiscount_code;
    private javax.swing.JTextField jtxtdiscount_desc;
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
        //jtxtid.setText("");
        jtxtdiscount_code.setText("");
        jtxtdiscount_desc.setText("");
        jtxtdiscount.setText("");
        //jtxtentrydate.setText("");
        //jtxtauditdate.setText("");
        //jtxtaudituser.setText("");
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

        //jtxtid.setText(obj.getid());
        jtxtdiscount_code.setText(obj.getdiscount_code());
        jtxtdiscount_desc.setText(obj.getdiscount_desc());
        jtxtdiscount.setText(obj.getdiscount().toString());
        //jtxtentrydate.setText(obj.getentrydate());
        //jtxtauditdate.setText(obj.getauditdate());
        //jtxtaudituser.setText(obj.getaudituser());
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
        //obj.setid(jtxtid.getText());
        obj.setdiscount_code(jtxtdiscount_code.getText());
        obj.setdiscount_desc(jtxtdiscount_desc.getText());
        obj.setdiscount(Double.parseDouble(jtxtdiscount.getText()));
        //obj.setentrydate(jtxtentrydate.getText());
        //obj.setauditdate(jtxtauditdate.getText());
        //obj.setaudituser(jtxtaudituser.getText());
        //obj.setInterval(jcmbInterval.getSelectedItem().toString());

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