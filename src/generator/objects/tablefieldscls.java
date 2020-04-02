/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.objects;

/**
 *
 * @author solution
 */
public class tablefieldscls {
    private String Field;
    private String Type;
    private String Key;
    private String TableName;

    /**
     * @return the Field
     */

    public tablefieldscls(String TableName){
        this.TableName=TableName;
    }
    public String getField() {
        return Field;
    }

    /**
     * @param Field the Field to set
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    private String getTypeData(){
        String result;
        int iend=this.Type.indexOf("(");
        if (iend<0){
            iend=this.Type.length();
        }
        result = this.Type.substring(0,iend);

        if (result.equalsIgnoreCase("varchar")||result.equalsIgnoreCase("char")||result.equalsIgnoreCase("datetime")){
            result="String";
        }
        if (result.equalsIgnoreCase("int")){
            result="Integer";
        }
        if (result.equalsIgnoreCase("decimal")||result.equalsIgnoreCase("double")){
            result="Double";
        }

        return result;
    }
    public String getDeklarasi() {
        String result;
        
        result="    private "+this.getTypeData()+" "+this.Field+";";
        

        return result;
    }
    public String getDeklarasiphp() {
        String result;

        result="	var $"+this.Field+";";


        return result;
    }

    public String getGetterSetter(){
        String result = "";
        result="    public "+this.getTypeData()+" get"+this.Field+"() {";
        result+="\r\n";
        result+="        return "+this.Field+";";
        result+="\r\n";
        result+="    }";
        result+="\r\n";
        result+="    public void set"+this.Field+"("+getTypeData()+" "+this.Field+") {";
        result+="\r\n";
        result+="        this."+this.Field+" = "+this.Field+";";
        result+="\r\n";
        result+="    }";
        result+="\r\n";
        return result;
    }
    public String getGetterSetterphp(){
        String result = "";
        result="	function get"+this.Field+"(){ return $this->"+this.Field+"; }";
        result+="\r\n";
        result+="        function set"+this.Field+"($"+this.Field+") { $this->"+this.Field+"=$"+this.Field+"; }";
        result+="\r\n";
        return result;
    }

    public String getFields(){
        String result = "";
        result="                                "+this.Field+",";
        return result;
    }

    public String getParameter(){
        String result = "";
        result+="                    + \"'\"+this.get"+this.Field+"()+\"', \"";
        return result;
    }

    public String getParaminsert(){
        String result="";
        result+="                                '$this->"+this.Field+"',";
        return result;
    }
    public String getParamupdate(){
        String result="";
        result+="					"+this.Field+"='$this->"+this.Field+"',";
        return result;
    }
    public String getPHP_setdata(){
        String result="";
        result+="		$"+this.TableName+"->set"+this.Field+"($_POST[\""+this.Field+"\"]);";
        return result;
    }
    public String getPHP_fieldlayar(){
        String result="";
        result+="                <tr> ";
        result+="\r\n";
        result+="                  <td height=\"19\" bgcolor=\"#EFEFEF\"><div align=\"right\"><span class=\"style12\">"+this.Field+" &nbsp;&nbsp;</span></div></td>";
        result+="\r\n";
        result+="                  <td colspan=\"3\" bgcolor=\"#FFFFFF\"><div align=\"left\"><span class=\"style12\">&nbsp;&nbsp; ";
        result+="\r\n";
        result+="                      <input name=\""+this.Field+"\" type=\"<? if ($istatus==1||$istatus==2){?>text<? } else {?>hidden<? }?>\" class=\"style12\" id=\""+this.Field+"\" value=\"<? if($istatus!=1){echo $template->get"+this.Field+"();}?>\" size=\"50\" maxlength=\"50\"/>";
        result+="\r\n";
        result+="                      <? if ($istatus==0||$istatus==3){?>";
        result+="\r\n";
        result+="                      <?=$template->get"+this.Field+"();?>";
        result+="\r\n";
        result+="                      <? }?>";
        result+="\r\n";
        result+="                      </span></div></td>";
        result+="\r\n";
        result+="                </tr>";

        return result;
    }
    public String getPHP_fillmecol(){
        String result="";
        result+="			$this->"+this.TableName+"->set"+this.Field+"($row[\""+this.Field+"\"]);";
        return result;
    }
    public String getFillme(){
        String result = "";
        result+="        this.set"+this.Field+"(rs.get"+this.getTypeData()+"(\""+this.Field+"\"));";
        return result;
    }

    public String getFillmeCol(){
        String result = "";
        result+="        data.set"+this.Field+"(rs.get"+this.getTypeData()+"(\""+this.Field+"\"));";
        return result;
    }

    public String getScreen(Integer y){
        String result="";
        result+="<Component class=\"javax.swing.JLabel\" name=\"jlbl"+this.Field+"\">";
        result+="\r\n";
        result+="      <Properties>";
        result+="\r\n";
        result+="        <Property name=\"font\" type=\"java.awt.Font\" editor=\"org.netbeans.beaninfo.editors.FontEditor\">";
        result+="\r\n";
        result+="          <Font name=\"Dialog\" size=\"10\" style=\"1\"/>";
        result+="\r\n";
        result+="        </Property>";
        result+="\r\n";
        result+="        <Property name=\"text\" type=\"java.lang.String\" value=\""+this.Field+"\"/>";
        result+="\r\n";
        result+="      </Properties>";
        result+="\r\n";
        result+="      <Constraints>";
        result+="\r\n";
        result+="        <Constraint layoutClass=\"org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout\" value=\"org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription\">";
        result+="\r\n";
        result+="          <AbsoluteConstraints x=\"70\" y=\""+y+"\" width=\"140\" height=\"-1\"/>";
        result+="\r\n";
        result+="        </Constraint>";
        result+="\r\n";
        result+="      </Constraints>";
        result+="\r\n";
        result+="    </Component>";
        result+="\r\n";
        result+="    <Component class=\"javax.swing.JTextField\" name=\"jtxt"+this.Field+"\">";
        result+="\r\n";
        result+="      <Properties>";
        result+="\r\n";
        result+="        <Property name=\"font\" type=\"java.awt.Font\" editor=\"org.netbeans.beaninfo.editors.FontEditor\">";
        result+="\r\n";
        result+="          <Font name=\"Dialog\" size=\"10\" style=\"0\"/>";
        result+="\r\n";
        result+="        </Property>";
        result+="\r\n";
        result+="        <Property name=\"text\" type=\"java.lang.String\" value=\""+this.Field+"\"/>";
        result+="\r\n";
        result+="      </Properties>";
        result+="\r\n";
        result+="      <Events>";
        result+="\r\n";
        result+="        <EventHandler event=\"focusGained\" listener=\"java.awt.event.FocusListener\" parameters=\"java.awt.event.FocusEvent\" handler=\"jtxt"+this.Field+"FocusGained\"/>";
        result+="\r\n";
        result+="      </Events>";
        result+="\r\n";
        result+="      <Constraints>";
        result+="\r\n";
        result+="        <Constraint layoutClass=\"org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout\" value=\"org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription\">";
        result+="\r\n";
        result+="          <AbsoluteConstraints x=\"260\" y=\""+y+"\" width=\"150\" height=\"-1\"/>";
        result+="\r\n";
        result+="        </Constraint>";
        result+="\r\n";
        result+="      </Constraints>";
        result+="\r\n";
        result+="    </Component>";
        result+="\r\n";
        return result;
    }
    public String getsetdata(){
        String result="";
        result+="        obj.set"+this.Field+"(jtxt"+this.Field+".getText());";
        return result;
    }

    public String getshowdata(){
        String result="";
        result+="        jtxt"+this.Field+".setText(obj.get"+this.Field+"());";
        return result;
    }

    public String getclearfield(){
        String result="";
        result+="        jtxt"+this.Field+".setText(\"\");";
        return result;
    }

    public String getvariabledeclaration(){
        String result="";
        result+="    private javax.swing.JLabel jlbl"+this.Field+";";
        result+="\r\n";
        result+="    private javax.swing.JTextField jtxt"+this.Field+";";
        result+="\r\n";
        return result;
    }

    public String getproperties(Integer y){
        String result="";
        result+="        jlbl"+this.Field+".setFont(new java.awt.Font(\"Dialog\", 1, 10));";
        result+="\r\n";
        result+="        jlbl"+this.Field+".setText(\""+this.Field+"\");";
        result+="\r\n";
        result+="        getContentPane().add(jlbl"+this.Field+");";
        result+="\r\n";
        result+="        jlbl"+this.Field+".setBounds(70, "+y+", 140, 13);";
        result+="\r\n";
        result+="        jtxt"+this.Field+".setFont(new java.awt.Font(\"Dialog\", 0, 10));";
        result+="\r\n";
        result+="        jtxt"+this.Field+".setText(\""+this.Field+"\");";
        result+="\r\n";
        result+="	jtxt"+this.Field+".addFocusListener(new java.awt.event.FocusAdapter() {";
        result+="\r\n";
        result+="            public void focusGained(java.awt.event.FocusEvent evt) {";
        result+="\r\n";
        result+="                jtxt"+this.Field+"FocusGained(evt);";
        result+="\r\n";
        result+="            }";
        result+="\r\n";
        result+="        });";
        result+="\r\n";
        result+="        getContentPane().add(jtxt"+this.Field+");";
        result+="\r\n";
        result+="        jtxt"+this.Field+".setBounds(260, "+y+", 150, 23);";
        result+="\r\n";
        return result;
    }
    public String getinitcomponent(){
        String result="";
        result+="        jlbl"+this.Field+" = new javax.swing.JLabel();";
        result+="\r\n";
        result+="        jtxt"+this.Field+" = new javax.swing.JTextField();";
        result+="\r\n";
        return result;
    }
    public String getfocusgainedevent(){
        String result="";
        result+="private void jtxt"+this.Field+"FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_j"+this.Field+"FocusGained";
        result+="\r\n";
        result+="        // TODO add your handling code here:";
        result+="\r\n";
        result+="    jtxt"+this.Field+".setSelectionStart(0);";
        result+="\r\n";
        result+="    jtxt"+this.Field+".setSelectionEnd(jtxt"+this.Field+".getText().length());";
        result+="\r\n";
        result+="}//GEN-LAST:event_jtxt"+this.Field+"FocusGained";
        result+="\r\n";
        return result;
    }

    public String getKey() {
        return this.Key;
    }
    public void setKey(String Key){
        this.Key=Key;
    }
}

