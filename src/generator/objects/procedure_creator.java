/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.objects;

import file.filecls;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class procedure_creator {
    String REMARK_FIELD_LIST="<FIELD_LIST>";
    String REMARK_FIELD_LIST_END="<FIELD_LIST_END>";
    
    private tablecls t;

    procedure_creator(tablecls t) {
        this.t=t;
    }

    public Boolean createprocedure(filecls o) {
        String squery="";
        String c;
        boolean bskip=false;
        tablefieldscls d;
        String e;


        try {
            tablefieldscolcls of=new tablefieldscolcls(t.getdb(),t.getTablename());
            if (of.initdata()){

//                db.execute("drop procedure sp_"+t.getTablename()+"_get");
//                db.execute("drop procedure sp_"+t.getTablename()+"_insert");
//                db.execute("drop procedure sp_"+t.getTablename()+"_update");
//                db.execute("drop procedure sp_"+t.getTablename()+"_delete");

                this.t.setKey(of.getkey());
                for (int i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    String a=c.replace("template", t.getTablename());
                    String b=a.replace("KEY", of.getkey());
                    
                    if (c.contains(this.REMARK_FIELD_LIST)){
                        bskip=true;
                    } else if (bskip&&c.contains(this.REMARK_FIELD_LIST_END)){
                        bskip=false;
                    } else {
                        squery=squery+"\n "+b;
                    }
                    
                    if (bskip){
                        i++;
                        String format=o.getcontain(i);
                        for (int j=0;j<of.size();j++){
                            d=of.get(j);
                            if (!d.getField().equalsIgnoreCase("id")&&!d.getField().equalsIgnoreCase("entrydate")&&!d.getField().equalsIgnoreCase("auditdate")){
                                a=format.replace("FIELD_NAME", d.getField());
                                b=a.replace("FIELD_TYPE", d.getType());
                                if (j==of.size()-1){
                                    e=b.replace(",", "");
                                    b=e;
                                }
                                squery=squery+"\n "+b;
                            }
                        }
                    }
                }
                t.getdb().execute(squery);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(procedure_creator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    void dropprocedure(String procedurename) {
        try {
            t.getdb().execute("drop procedure " + procedurename);
        } catch (SQLException ex) {
            Logger.getLogger(procedure_creator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
