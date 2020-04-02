/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import common.component.FrmMainFrame;
import ikan.common.component.FrmMainFrameIkan;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import kopkar.in.objectclasses.in_warehouseext;
import utils.CodeException;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, CodeException {
        if (appsettinghandler.InitConnection()){
            appsettinghandler.dbcom.connect();
        }

        FrmMainFrame frm = new FrmMainFrame();
        frm.setVisible(true);

//        FrmMainFrameIkan frm = new FrmMainFrameIkan();
//        frm.setVisible(true);
        // TODO code application logic here
    }

}
