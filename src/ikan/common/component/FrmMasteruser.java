/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

import javax.swing.table.DefaultTableModel;
import utils.CodeException;
import utils.GlobalModel;

/**
 *
 * @author mistian
 */
public class FrmMasteruser extends common.component.FrmMasteruser {
    FrmMainFrameIkan mf ;

    public FrmMasteruser() throws CodeException {
       inisialisasicomponents();
    }

    public FrmMasteruser(FrmMainFrameIkan mf) throws CodeException{
        this.mf = mf;
        inisialisasicomponents();
        tmodel=(DefaultTableModel) jtbluser.getModel();
        GlobalModel.clearRow(tmodel);

    }

    



}
