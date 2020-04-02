/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * This interface is implemented on Abstract Class to Navigate Data
 */

package classinterface;

import utils.CodeException;


/**
 *
 * @author windu
 */
public interface NavigatorObjectInt {
    public Integer Status_normal=0;
    public Integer Status_Insert=1;
    public Integer Status_update=2;
    public Integer Status_delete=3;
    
    public void insert() throws CodeException;
    public Boolean update()  throws CodeException;
    public Boolean delete()  throws CodeException;
    public Boolean initdata()  throws CodeException;
    public Boolean refresh()  throws CodeException;

    public Boolean moveFirst() throws CodeException;
    public Boolean movePrevious() throws CodeException;
    public Boolean moveNext() throws CodeException;
    public Boolean moveLast() throws CodeException;
    public String getTable();
    public String getClassName();
    
    public boolean importCsv();
    public boolean exportCsv();
    public boolean importText();
    public boolean exportText();
}
