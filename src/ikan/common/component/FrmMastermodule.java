/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

import utils.CodeException;

/**
 *
 * @author mistian
 */
public class FrmMastermodule extends common.component.FrmMastermodule{
    FrmMainFrameIkan mf ;

    public FrmMastermodule() throws CodeException {
        inisialisasicomponents();
    }

    public FrmMastermodule(FrmMainFrameIkan mf) throws CodeException{
        this.mf = mf;
        inisialisasicomponents();
    }

    @Override
    protected void mfseticon() {
        mf.setIcon(CLASSNAME);
    }

    @Override
    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);   
    }



}
