/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.objects;

import jdbc.DbBean;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class tablefieldscolcls extends ArrayList<tablefieldscls>{
    tablefieldscls data;
    DbBean db;
    String tablename;

    public Integer DEKLARASI=0;
    public Integer GETTERSETTER=1;
    public Integer PARAMETER=2;
    public Integer FILLME=3;
    public Integer SCREEN=4;
    Integer INITCOMPONENT=5;
    Integer PROPERTIES=6;
    Integer VARIABLEDECLARATION=7;
    Integer CLEARFIELD=8;
    Integer SHOWDATA=9;
    Integer SETDATA=10;
    Integer FILLMECOL=11;
    Integer GETFIELD=12;
    Integer GETPARAMINSERT=13;
    Integer GETPARAMUPDATE=14;
    Integer PHP_Setdata=15;
    Integer PHP_FIELDLAYAR=16;
    Integer PHP_FILLMECOL=17;
    Integer FOCUSGAINEVENT=18;

    tablefieldscolcls(DbBean db, String tablename) {
        this.db=db;
        this.tablename=tablename;
    }

    public String getkey(){
        int i=0;
        for (i=0;i<this.size();i++){
            tablefieldscls o = this.get(i);
            if (GlobalUtils.churuf(o.getKey()).equalsIgnoreCase("PRI")){
                return o.getField();
            }
        }
        return "";
    }
    public Boolean initdata(){
        try {
            ResultSet rs = db.executeQuery("desc " + tablename);
            while (rs.next()){
                data=new tablefieldscls(tablename);
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tablefieldscolcls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        data.setField(rs.getString("field"));
        data.setType(rs.getString("type"));
        data.setKey(rs.getString("Key"));
        return true;
    }

    public void writegenerate(BufferedWriter out,Integer itype) throws IOException {
        int i=0;
        String result = null;
        Integer y=100;
        for (i=0;i<this.size();i++){
            tablefieldscls o = this.get(i);
            switch (itype){
                case 0:
                    out.write(o.getDeklarasi());
                break;
                case 1:
                    out.write(o.getGetterSetter());
                    break;
                case 2:
                    if (!o.getField().equalsIgnoreCase("id")&&!o.getField().equalsIgnoreCase("entrydate")&&!o.getField().equalsIgnoreCase("auditdate")&&!o.getField().equalsIgnoreCase("audituser"))
                    out.write(o.getParameter());
                    break;
                case 3:
                    out.write(o.getFillme());
                    break;
                case 4:
                    out.write(o.getScreen(y));
                    y=y+17;
                    break;
                case 5:
                    out.write(o.getinitcomponent());
                    break;
                case 6:
                    out.write(o.getproperties(y));
                    break;
                case 7:
                    out.write(o.getvariabledeclaration());
                    break;
                case 8:
                    out.write(o.getclearfield());
                    break;
                case 9:
                    out.write(o.getshowdata());
                    break;
                case 10:
                    out.write(o.getsetdata());
                    break;
                case 11:
                    out.write(o.getFillmeCol());
                    break;
                case 18:
                    out.write(o.getfocusgainedevent());
                    break;

            }
            out.write("\r\n");
        }
    }

    public void writegeneratephp(BufferedWriter out,Integer itype) throws IOException {
        int i=0;
        String result = null;
        Integer y=100;
        for (i=0;i<this.size();i++){
            tablefieldscls o = this.get(i);
            switch (itype){
                case 0:
                    out.write(o.getDeklarasiphp());
                break;
                case 1:
                    out.write(o.getGetterSetterphp());
                    break;
                case 2:
                    if (!o.getField().equalsIgnoreCase("id")&&!o.getField().equalsIgnoreCase("entrydate")&&!o.getField().equalsIgnoreCase("auditdate")&&!o.getField().equalsIgnoreCase("audituser"))
                    out.write(o.getParameter());
                    break;
                case 3:
                    out.write(o.getFillme());
                    break;
                case 4:
                    out.write(o.getScreen(y));
                    y=y+17;
                    break;
                case 5:
                    out.write(o.getinitcomponent());
                    break;
                case 6:
                    out.write(o.getproperties(y));
                    break;
                case 7:
                    out.write(o.getvariabledeclaration());
                    break;
                case 8:
                    out.write(o.getclearfield());
                    break;
                case 9:
                    out.write(o.getshowdata());
                    break;
                case 10:
                    out.write(o.getsetdata());
                    break;
                case 11:
                    out.write(o.getFillmeCol());
                    break;
                case 12:
                    out.write(o.getFields());
                    break;
                case 13:
                    out.write(o.getParaminsert());
                    break;
                case 14:
                    out.write(o.getParamupdate());
                    break;
                case 15:
                    out.write(o.getPHP_setdata());
                    break;
                case 16:
                    out.write(o.getPHP_fieldlayar());
                    break;
                case 17:
                    out.write(o.getPHP_fillmecol());
                    break;
            }
            out.write("\r\n");
        }
    }
}
