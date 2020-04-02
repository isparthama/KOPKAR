/*
 * consignmentdetail1col.java
 *
 * Created on September 10, 2007, 8:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package file;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class containcol extends ArrayList<contain>{
    private contain ca=new contain();
    

   
    public Integer Find(String name){
        Integer i=0;
        Integer ipos=-1;
        for(i=0;i<=this.size()-1;i++){
            if (this.get(i).getContain().equals(name)){
                ipos=i;
                break;
            }
        }
        System.out.println("ketemu at:" + ipos);
        return ipos;
    }
    public contain getCa() {
        return ca;
    }

    public void setCa(contain ca) {
        this.ca = ca;
    }
    
    public void Insert(){
        setCa(new contain());
    }

    
}
