/*
 * From setting_financial_rpt_detail2
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
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.gl.objectclasses.setting_financial_rpt_detail2ext;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmsetting_financial_rpt_detail2 extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmsetting_financial_rpt_detail2";
    
    FrmMainFrame mf ;

    setting_financial_rpt_detail2ext obj=new setting_financial_rpt_detail2ext();
   
    /** Creates new form Area */
    public Frmsetting_financial_rpt_detail2() throws CodeException {
        initComponents();
    }
    
    public Frmsetting_financial_rpt_detail2(FrmMainFrame mf) throws CodeException{
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
        jlbldocentry = new javax.swing.JLabel();
        jtxtdocentry = new javax.swing.JTextField();
        jlbllineno = new javax.swing.JLabel();
        jtxtlineno = new javax.swing.JTextField();
        jlbllinenodetail = new javax.swing.JLabel();
        jtxtlinenodetail = new javax.swing.JTextField();
        jlbltextformulation = new javax.swing.JLabel();
        jtxttextformulation = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("setting_financial_rpt_detail2");
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
        jHeader.setText(" : : setting_financial_rpt_detail2");
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

        jlbldocentry.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocentry.setText("docentry");
        getContentPane().add(jlbldocentry);
        jlbldocentry.setBounds(70, 100, 140, 13);

        jtxtdocentry.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocentry.setText("docentry");
        jtxtdocentry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocentryFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocentry);
        jtxtdocentry.setBounds(260, 100, 150, 23);

        jlbllineno.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbllineno.setText("lineno");
        getContentPane().add(jlbllineno);
        jlbllineno.setBounds(70, 117, 140, 13);

        jtxtlineno.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtlineno.setText("lineno");
        jtxtlineno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtlinenoFocusGained(evt);
            }
        });
        getContentPane().add(jtxtlineno);
        jtxtlineno.setBounds(260, 117, 150, 23);

        jlbllinenodetail.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbllinenodetail.setText("linenodetail");
        getContentPane().add(jlbllinenodetail);
        jlbllinenodetail.setBounds(70, 134, 140, 13);

        jtxtlinenodetail.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtlinenodetail.setText("linenodetail");
        jtxtlinenodetail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtlinenodetailFocusGained(evt);
            }
        });
        getContentPane().add(jtxtlinenodetail);
        jtxtlinenodetail.setBounds(260, 134, 150, 23);

        jlbltextformulation.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbltextformulation.setText("textformulation");
        getContentPane().add(jlbltextformulation);
        jlbltextformulation.setBounds(70, 151, 140, 13);

        jtxttextformulation.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxttextformulation.setText("textformulation");
        jtxttextformulation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttextformulationFocusGained(evt);
            }
        });
        getContentPane().add(jtxttextformulation);
        jtxttextformulation.setBounds(260, 151, 150, 23);

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

private void jtxtdocentryFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtdocentry.setSelectionStart(0);
    jtxtdocentry.setSelectionEnd(jtxtdocentry.getText().length());
}                                        

private void jtxtlinenoFocusGained(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
    jtxtlineno.setSelectionStart(0);
    jtxtlineno.setSelectionEnd(jtxtlineno.getText().length());
}                                      

private void jtxtlinenodetailFocusGained(java.awt.event.FocusEvent evt) {                                          
        // TODO add your handling code here:
    jtxtlinenodetail.setSelectionStart(0);
    jtxtlinenodetail.setSelectionEnd(jtxtlinenodetail.getText().length());
}                                            

private void jtxttextformulationFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxttextformulation.setSelectionStart(0);
    jtxttextformulation.setSelectionEnd(jtxttextformulation.getText().length());
}                                               

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("setting_financial_rpt_detail2", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmsetting_financial_rpt_detail2.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmsetting_financial_rpt_detail2().setVisible(true);
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
    private javax.swing.JLabel jlbldocentry;
    private javax.swing.JLabel jlbllineno;
    private javax.swing.JLabel jlbllinenodetail;
    private javax.swing.JLabel jlbltextformulation;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtdocentry;
    private javax.swing.JTextField jtxtlineno;
    private javax.swing.JTextField jtxtlinenodetail;
    private javax.swing.JTextField jtxttextformulation;
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
        jtxtdocentry.setText("");
        jtxtlineno.setText("");
        jtxtlinenodetail.setText("");
        jtxttextformulation.setText("");
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

        jtxtdocentry.setText(GlobalUtils.churuf(obj.getdocentry()));
        jtxtlineno.setText(GlobalUtils.churuf(obj.getlineno()));
        jtxtlinenodetail.setText(GlobalUtils.churuf(obj.getlinenodetail()));
        jtxttextformulation.setText(obj.gettextformulation());
        

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
        obj.setdocentry(GlobalUtils.toInt(jtxtdocentry.getText()));
        obj.setlineno(GlobalUtils.toInt(jtxtlineno.getText()));
        obj.setlinenodetail(GlobalUtils.toInt(jtxtlinenodetail.getText()));
        obj.settextformulation(jtxttextformulation.getText());
        
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
