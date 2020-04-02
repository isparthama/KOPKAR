/*
 * FrmKazao.java
 *
 * Created on September 1, 2009, 8:34 PM
 */

package common.component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author  wgata
 */
public class FrmKazaoCalender extends javax.swing.JDialog {
    protected int coltable1 = 0;
    protected int rowtable1 = 0;
    protected JTable jtableparam;
    protected TableModel tmodelparam;
    DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
        
    /** Creates new form FrmKazao */
    public FrmKazaoCalender(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public FrmKazaoCalender(TableModel tmodel, int row, int col) {
        initComponents();        

        rowtable1 = row;
        coltable1 = col;
        tmodelparam = tmodel;
        
        this.kazaoCalendar.setDate(new Date());
        
    } 

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kazaoCalendarDialog1 = new org.kazao.calendar.KazaoCalendarDialog();
        kazaoCalendarLocal1 = new org.kazao.calendar.KazaoCalendarLocal();
        kazaoCalendarLocalID1 = new org.kazao.calendar.KazaoCalendarLocalID();
        kazaoCalendar = new org.kazao.calendar.KazaoCalendar();
        jbtnPilih = new javax.swing.JButton();
        jbtnTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pilih Tanggal");
        getContentPane().setLayout(null);

        kazaoCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kazaoCalendarMouseClicked(evt);
            }
        });
        kazaoCalendar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kazaoCalendarKeyPressed(evt);
            }
        });
        getContentPane().add(kazaoCalendar);
        kazaoCalendar.setBounds(0, 0, 400, 300);

        jbtnPilih.setText("Pilih");
        jbtnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPilihActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPilih);
        jbtnPilih.setBounds(10, 310, 61, 25);

        jbtnTutup.setText("Tutup");
        jbtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTutupActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTutup);
        jbtnTutup.setBounds(100, 310, 71, 25);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-410)/2, (screenSize.height-372)/2, 410, 372);
    }// </editor-fold>//GEN-END:initComponents

private void kazaoCalendarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kazaoCalendarKeyPressed
    
}//GEN-LAST:event_kazaoCalendarKeyPressed

private void kazaoCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kazaoCalendarMouseClicked

    

}//GEN-LAST:event_kazaoCalendarMouseClicked

private void jbtnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPilihActionPerformed
    tmodelparam.setValueAt(dateformat.format(kazaoCalendar.getCalendar().getTime()), rowtable1, coltable1);
    this.dispose();
    
}//GEN-LAST:event_jbtnPilihActionPerformed

private void jbtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTutupActionPerformed
    this.dispose();
}//GEN-LAST:event_jbtnTutupActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmKazaoCalender dialog = new FrmKazaoCalender(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnPilih;
    private javax.swing.JButton jbtnTutup;
    private org.kazao.calendar.KazaoCalendar kazaoCalendar;
    private org.kazao.calendar.KazaoCalendarDialog kazaoCalendarDialog1;
    private org.kazao.calendar.KazaoCalendarLocal kazaoCalendarLocal1;
    private org.kazao.calendar.KazaoCalendarLocalID kazaoCalendarLocalID1;
    // End of variables declaration//GEN-END:variables

}
