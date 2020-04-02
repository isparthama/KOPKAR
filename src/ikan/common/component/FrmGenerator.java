/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

import generator.objects.databasecls;
import javax.swing.table.DefaultTableModel;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author mistian
 */
public class FrmGenerator extends generator.forms.FrmGenerator{

    FrmMainFrameIkan mf ;

     public FrmGenerator() throws CodeException {
        inisialisasicomponents();
    }

    public FrmGenerator(FrmMainFrameIkan mf) throws CodeException{
        this.mf = mf;
        inisialisasicomponents();
        model=(DefaultTableModel) jTblDetail.getModel();
        odb.initdata();
        this.showDataBase();
    }

    @Override
    public void showDataBase() throws CodeException {
        setToolBar(iformtype,istatus);
        setCursor(GlobalUtils.HOURGLASSCURSOR);

        int i=0;
        jmbdatabase.removeAllItems();
        for (i=0;i<odb.size();i++){
            databasecls t = odb.get(i);
            jmbdatabase.addItem(t.getDatabase_name());
        }


        setCursor(GlobalUtils.NORMALCURSOR);
    }
    @Override
    protected void mfseticon() {
        mf.setIcon(CLASSNAME);
    }

    @Override
    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);
    }

    @Override
    protected void formInternalFrameActivated() {
        setToolBar(iformtype,istatus);
        mf.setIcon(CLASSNAME);
    }


}
