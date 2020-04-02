/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import classinterface.NavigatorObjectInt;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import jdbc.DbBean;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author solution
 */
public class JasperHandler {

    public static void printReportMaster (Object obj) {
        NavigatorObjectInt noi = (NavigatorObjectInt) obj;
        String file   = GlobalUtils.getCurrentDir() +"/Reports/" + noi.getClassName() + ".jrxml";
        String query  = "Select * from " + noi.getTable();
        printReport(file,  query, false);
    }


    public static void printReport(String file, Map map, boolean preview) {
        JasperPrint jasperPrint;

        try {
            DbBean db =appsettinghandler.db;

            String sFile = file.substring(0, file.length() -6);

            File f = new File(sFile + ".jasper");
            if (!f.exists()) {
                JasperReport jasperReport = JasperCompileManager.compileReport(file);
                jasperPrint = JasperFillManager.fillReport(jasperReport, map, db.getConnection());
            }else{
                jasperPrint = JasperFillManager.fillReport(sFile + ".jasper", map, db.getConnection());
            }

            JasperViewer.viewReport(jasperPrint, false);

        } catch(JRException e){
            e.printStackTrace();

        }
    }
    public static void printReport(String file, String query, boolean preview) {
        JasperPrint jasperPrint;

        try {

            DbBean db = appsettinghandler.db;
            ResultSet rs = db.executeQuery(query);
            JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(rs);

            String sFile = file.substring(0, file.length() -6);
            File f = new File(sFile + ".jasper");
            if (!f.exists()) {
                JasperReport jasperReport = JasperCompileManager.compileReport(file);
                jasperPrint = JasperFillManager.fillReport(jasperReport,new HashMap(), resultSetDataSource);
            }else{
                jasperPrint = JasperFillManager.fillReport(sFile + ".jasper",new HashMap(), resultSetDataSource);
            }

            JasperViewer.viewReport(jasperPrint, false);

            
        }catch(JRException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();

        }
    }
    public static void printReport(String file, boolean preview) {
        printReport(file, new HashMap(), preview);
    }
}
