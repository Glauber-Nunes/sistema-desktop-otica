/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressora_Jaspe;




import java.io.File;
import java.util.List;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author gabri
 */
public class Impressao {

    public void Imprime_Relatorio(List lista){
        
        File file = new File("/Reporte/Cadastro.jasper");
        
        InputStream arquivo = getClass().getResourceAsStream("/Reporte/cadastro.jasper");
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
        
        Map parametros = new HashMap();
        JasperPrint impressao =null;
        
        try {
            impressao = JasperFillManager.fillReport(arquivo, parametros,ds);
            JasperViewer viewer = new JasperViewer(impressao, false);
            viewer.setVisible(true);
            
        }catch (JRException e){
            System.out.println(e.getMessage());
        }
        
    }
           

    
}
