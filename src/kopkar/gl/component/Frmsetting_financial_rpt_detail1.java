/*
 * From setting_financial_rpt_detail1
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
import kopkar.gl.objectclasses.setting_financial_rpt_detail1ext;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmsetting_financial_rpt_detail1 extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmsetting_financial_rpt_detail1";
    
    FrmMainFrame mf ;

    setting_financial_rpt_detail1ext obj=new setting_financial_rpt_detail1ext();
   
    /** Creates new form Area */
    public Frmsetting_financial_rpt_detail1() throws CodeException {
        initComponents();
    }
    
    public Frmsetting_financial_rpt_detail1(FrmMainFrame mf) throws CodeException{
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
        jlblid = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jlbldocentry = new javax.swing.JLabel();
        jtxtdocentry = new javax.swing.JTextField();
        jlbllineno = new javax.swing.JLabel();
        jtxtlineno = new javax.swing.JTextField();
        jlblrowno = new javax.swing.JLabel();
        jtxtrowno = new javax.swing.JTextField();
        jlblcolumntype = new javax.swing.JLabel();
        jtxtcolumntype = new javax.swing.JTextField();
        jlbllevelno = new javax.swing.JLabel();
        jtxtlevelno = new javax.swing.JTextField();
        jlbltextheader = new javax.swing.JLabel();
        jtxttextheader = new javax.swing.JTextField();
        jlblallowformulation = new javax.swing.JLabel();
        jtxtallowformulation = new javax.swing.JTextField();
        jlblsummary = new javax.swing.JLabel();
        jtxtsummary = new javax.swing.JTextField();
        jlbltextformulation = new javax.swing.JLabel();
        jtxttextformulation = new javax.swing.JTextField();
        jlblvisorder = new javax.swing.JLabel();
        jtxtvisorder = new javax.swing.JTextField();
        jlblshowdata = new javax.swing.JLabel();
        jtxtshowdata = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("setting_financial_rpt_detail1");
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
        jHeader.setText(" : : setting_financial_rpt_detail1");
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

        jlblid.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblid.setText("id");
        getContentPane().add(jlblid);
        jlblid.setBounds(70, 100, 140, 13);

        jtxtid.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtid.setText("id");
        jtxtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtidFocusGained(evt);
            }
        });
        getContentPane().add(jtxtid);
        jtxtid.setBounds(260, 100, 150, 23);

        jlbldocentry.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocentry.setText("docentry");
        getContentPane().add(jlbldocentry);
        jlbldocentry.setBounds(70, 117, 140, 13);

        jtxtdocentry.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocentry.setText("docentry");
        jtxtdocentry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocentryFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocentry);
        jtxtdocentry.setBounds(260, 117, 150, 23);

        jlbllineno.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbllineno.setText("lineno");
        getContentPane().add(jlbllineno);
        jlbllineno.setBounds(70, 134, 140, 13);

        jtxtlineno.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtlineno.setText("lineno");
        jtxtlineno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtlinenoFocusGained(evt);
            }
        });
        getContentPane().add(jtxtlineno);
        jtxtlineno.setBounds(260, 134, 150, 23);

        jlblrowno.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblrowno.setText("rowno");
        getContentPane().add(jlblrowno);
        jlblrowno.setBounds(70, 151, 140, 13);

        jtxtrowno.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtrowno.setText("rowno");
        jtxtrowno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtrownoFocusGained(evt);
            }
        });
        getContentPane().add(jtxtrowno);
        jtxtrowno.setBounds(260, 151, 150, 23);

        jlblcolumntype.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcolumntype.setText("columntype");
        getContentPane().add(jlblcolumntype);
        jlblcolumntype.setBounds(70, 168, 140, 13);

        jtxtcolumntype.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcolumntype.setText("columntype");
        jtxtcolumntype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtcolumntypeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtcolumntype);
        jtxtcolumntype.setBounds(260, 168, 150, 23);

        jlbllevelno.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbllevelno.setText("levelno");
        getContentPane().add(jlbllevelno);
        jlbllevelno.setBounds(70, 185, 140, 13);

        jtxtlevelno.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtlevelno.setText("levelno");
        jtxtlevelno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtlevelnoFocusGained(evt);
            }
        });
        getContentPane().add(jtxtlevelno);
        jtxtlevelno.setBounds(260, 185, 150, 23);

        jlbltextheader.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbltextheader.setText("textheader");
        getContentPane().add(jlbltextheader);
        jlbltextheader.setBounds(70, 202, 140, 13);

        jtxttextheader.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxttextheader.setText("textheader");
        jtxttextheader.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttextheaderFocusGained(evt);
            }
        });
        getContentPane().add(jtxttextheader);
        jtxttextheader.setBounds(260, 202, 150, 23);

        jlblallowformulation.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblallowformulation.setText("allowformulation");
        getContentPane().add(jlblallowformulation);
        jlblallowformulation.setBounds(70, 219, 140, 13);

        jtxtallowformulation.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtallowformulation.setText("allowformulation");
        jtxtallowformulation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtallowformulationFocusGained(evt);
            }
        });
        getContentPane().add(jtxtallowformulation);
        jtxtallowformulation.setBounds(260, 219, 150, 23);

        jlblsummary.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsummary.setText("summary");
        getContentPane().add(jlblsummary);
        jlblsummary.setBounds(70, 236, 140, 13);

        jtxtsummary.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsummary.setText("summary");
        jtxtsummary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsummaryFocusGained(evt);
            }
        });
        getContentPane().add(jtxtsummary);
        jtxtsummary.setBounds(260, 236, 150, 23);

        jlbltextformulation.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbltextformulation.setText("textformulation");
        getContentPane().add(jlbltextformulation);
        jlbltextformulation.setBounds(70, 253, 140, 13);

        jtxttextformulation.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxttextformulation.setText("textformulation");
        jtxttextformulation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttextformulationFocusGained(evt);
            }
        });
        getContentPane().add(jtxttextformulation);
        jtxttextformulation.setBounds(260, 253, 150, 23);

        jlblvisorder.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblvisorder.setText("visorder");
        getContentPane().add(jlblvisorder);
        jlblvisorder.setBounds(70, 270, 140, 13);

        jtxtvisorder.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtvisorder.setText("visorder");
        jtxtvisorder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtvisorderFocusGained(evt);
            }
        });
        getContentPane().add(jtxtvisorder);
        jtxtvisorder.setBounds(260, 270, 150, 23);

        jlblshowdata.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblshowdata.setText("showdata");
        getContentPane().add(jlblshowdata);
        jlblshowdata.setBounds(70, 287, 140, 13);

        jtxtshowdata.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtshowdata.setText("showdata");
        jtxtshowdata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtshowdataFocusGained(evt);
            }
        });
        getContentPane().add(jtxtshowdata);
        jtxtshowdata.setBounds(260, 287, 150, 23);

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
    jtxtid.setSelectionStart(0);
    jtxtid.setSelectionEnd(jtxtid.getText().length());
}                                  

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

private void jtxtrownoFocusGained(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
    jtxtrowno.setSelectionStart(0);
    jtxtrowno.setSelectionEnd(jtxtrowno.getText().length());
}                                     

private void jtxtcolumntypeFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtcolumntype.setSelectionStart(0);
    jtxtcolumntype.setSelectionEnd(jtxtcolumntype.getText().length());
}                                          

private void jtxtlevelnoFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
    jtxtlevelno.setSelectionStart(0);
    jtxtlevelno.setSelectionEnd(jtxtlevelno.getText().length());
}                                       

private void jtxttextheaderFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxttextheader.setSelectionStart(0);
    jtxttextheader.setSelectionEnd(jtxttextheader.getText().length());
}                                          

private void jtxtallowformulationFocusGained(java.awt.event.FocusEvent evt) {                                              
        // TODO add your handling code here:
    jtxtallowformulation.setSelectionStart(0);
    jtxtallowformulation.setSelectionEnd(jtxtallowformulation.getText().length());
}                                                

private void jtxtsummaryFocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
    jtxtsummary.setSelectionStart(0);
    jtxtsummary.setSelectionEnd(jtxtsummary.getText().length());
}                                       

private void jtxttextformulationFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxttextformulation.setSelectionStart(0);
    jtxttextformulation.setSelectionEnd(jtxttextformulation.getText().length());
}                                               

private void jtxtvisorderFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtvisorder.setSelectionStart(0);
    jtxtvisorder.setSelectionEnd(jtxtvisorder.getText().length());
}                                        

private void jtxtshowdataFocusGained(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
    jtxtshowdata.setSelectionStart(0);
    jtxtshowdata.setSelectionEnd(jtxtshowdata.getText().length());
}                                        

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("setting_financial_rpt_detail1", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmsetting_financial_rpt_detail1.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmsetting_financial_rpt_detail1().setVisible(true);
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
    private javax.swing.JLabel jlblallowformulation;
    private javax.swing.JLabel jlblcolumntype;
    private javax.swing.JLabel jlbldocentry;
    private javax.swing.JLabel jlblid;
    private javax.swing.JLabel jlbllevelno;
    private javax.swing.JLabel jlbllineno;
    private javax.swing.JLabel jlblrowno;
    private javax.swing.JLabel jlblshowdata;
    private javax.swing.JLabel jlblsummary;
    private javax.swing.JLabel jlbltextformulation;
    private javax.swing.JLabel jlbltextheader;
    private javax.swing.JLabel jlblvisorder;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtallowformulation;
    private javax.swing.JTextField jtxtcolumntype;
    private javax.swing.JTextField jtxtdocentry;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtlevelno;
    private javax.swing.JTextField jtxtlineno;
    private javax.swing.JTextField jtxtrowno;
    private javax.swing.JTextField jtxtshowdata;
    private javax.swing.JTextField jtxtsummary;
    private javax.swing.JTextField jtxttextformulation;
    private javax.swing.JTextField jtxttextheader;
    private javax.swing.JTextField jtxtvisorder;
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
        jtxtid.setText("");
        jtxtdocentry.setText("");
        jtxtlineno.setText("");
        jtxtrowno.setText("");
        jtxtcolumntype.setText("");
        jtxtlevelno.setText("");
        jtxttextheader.setText("");
        jtxtallowformulation.setText("");
        jtxtsummary.setText("");
        jtxttextformulation.setText("");
        jtxtvisorder.setText("");
        jtxtshowdata.setText("");
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

        jtxtid.setText(GlobalUtils.churuf(obj.getid()));
        jtxtdocentry.setText(GlobalUtils.churuf(obj.getdocentry()));
        jtxtlineno.setText(GlobalUtils.churuf(obj.getlineno()));
        jtxtrowno.setText(GlobalUtils.churuf(obj.getrowno()));
        jtxtcolumntype.setText(obj.getcolumntype());
        jtxtlevelno.setText(GlobalUtils.churuf(obj.getlevelno()));
        jtxttextheader.setText(obj.gettextheader());
        jtxtallowformulation.setText(obj.getallowformulation());
        jtxtsummary.setText(obj.getsummary());
        jtxttextformulation.setText(obj.gettextformulation());
        jtxtvisorder.setText(GlobalUtils.churuf(obj.getvisorder()));
        jtxtshowdata.setText(obj.getshowdata());
        

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
        obj.setid(GlobalUtils.toInt(jtxtid.getText()));
        obj.setdocentry(GlobalUtils.toInt(jtxtdocentry.getText()));
        obj.setlineno(GlobalUtils.toInt(jtxtlineno.getText()));
        obj.setrowno(GlobalUtils.toInt(jtxtrowno.getText()));
        obj.setcolumntype(jtxtcolumntype.getText());
        obj.setlevelno(GlobalUtils.toInt(jtxtlevelno.getText()));
        obj.settextheader(jtxttextheader.getText());
        obj.setallowformulation(jtxtallowformulation.getText());
        obj.setsummary(jtxtsummary.getText());
        obj.settextformulation(jtxttextformulation.getText());
        obj.setvisorder(GlobalUtils.toInt(jtxtvisorder.getText()));
        obj.setshowdata(jtxtshowdata.getText());

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