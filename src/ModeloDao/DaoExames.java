/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloBeans.BeansExame;
import ModeloConection.ConexaoBd;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class DaoExames {
    
    
    BeansExame ex = new BeansExame();
    ConexaoBd conex =new ConexaoBd();
    ConexaoBd conexclientes2 = new ConexaoBd();
    String nomeexame;
    int codexame;
    
    public void BuscarcodExame(String nome){
        conex.Conexao();
        conex.executaSql("select *from clientes2 where nome_cliente='"+nome+"'");
        try {
            conex.ResultSet.first();
            codexame =conex.ResultSet.getInt("cod_cliente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO"+ex);
        }
        conex.Desconecta();
         
    }
    public void Salvar (BeansExame ex){
       BuscarcodExame(ex.getNome_cliente_exame());
       conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into exames (cod_exame,nome_cliente_exame,idade_exame,end_exame,avod_exame,avoe_exame,cc1_exame,cc2_exame,diabetes1_exame,diabetes2_exame,obs_exame,lezood1_exame,lezood2_exame,lezood3_exame, oe1_exame, oe2_exame,oe3_exame,adiçao_exame,rxod1_exame,rxod2_exame,rxod3_exame,dnp_exame,rxoe1_exame,rxoe2_exame,rxoe3_exame,adiçao2_exame,alt_exame,data_exame,fone_exame)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setInt(1, codexame);
            pst.setString(2, ex.getNome_cliente_exame());
            pst.setString(3, ex.getIdade());
            pst.setString(4, ex.getEnd());
            pst.setString(5, ex.getAvod());
            pst.setString(6, ex.getAvoe());
            pst.setString(7, ex.getCc1());
            pst.setString(8, ex.getCc2());
            pst.setString(9, ex.getDiabetes1());
            pst.setString(10, ex.getDiabetes2());
            pst.setString(11, ex.getObs());
            pst.setString(12, ex.getLezood1());
            pst.setString(13, ex.getLezood2());
            pst.setString(14, ex.getLezood3());
            pst.setString(15, ex.getOe1());
            pst.setString(16, ex.getOe2());
            pst.setString(17, ex.getOe3());
            pst.setString(18, ex.getAdiçao());
            pst.setString(19, ex.getRxod1());
            pst.setString(20, ex.getRxod2());
            pst.setString(21, ex.getRxod3());
            pst.setString(22, ex.getDnp());
            pst.setString(23, ex.getRxoe1());
            pst.setString(24, ex.getRxoe2());
            pst.setString(25, ex.getRxoe3());
            pst.setString(26, ex.getAdiçao2());
            pst.setString(27, ex.getAlt());
            pst.setString(28, ex.getData());
            pst.setString(29, ex.getFone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "EXAME SALVO");
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "ERRO Ao Salvar Exame"+ex1);
        }
       
       conex.Desconecta();
   }
    
    
    public void Alterar (BeansExame ex){
       BuscarcodExame(ex.getNome_cliente_exame());
       conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update exames set cod_exame=?,nome_cliente_exame=?,idade_exame=?,end_exame=?,avod_exame=?,avoe_exame=?,cc1_exame=?,cc2_exame=?,diabetes1_exame=?,diabetes2_exame=?,obs_exame=?,lezood1_exame=?,lezood2_exame=?,lezood3_exame=?, oe1_exame=?, oe2_exame=?,oe3_exame=?,adiçao_exame=?,rxod1_exame=?,rxod2_exame=?,rxod3_exame=?,dnp_exame=?,rxoe1_exame=?,rxoe2_exame=?,rxoe3_exame=?,adiçao2_exame=?,alt_exame=?,data_exame=?,fone_exame=?  where cod_exame=?");
            
            pst.setInt(1, codexame);
            pst.setString(2, ex.getNome_cliente_exame());
            pst.setString(3, ex.getIdade());
            pst.setString(4, ex.getEnd());
            pst.setString(5, ex.getAvod());
            pst.setString(6, ex.getAvoe());
            pst.setString(7, ex.getCc1());
            pst.setString(8, ex.getCc2());
            pst.setString(9, ex.getDiabetes1());
            pst.setString(10, ex.getDiabetes2());
            pst.setString(11, ex.getObs());
            pst.setString(12, ex.getLezood1());
            pst.setString(13, ex.getLezood2());
            pst.setString(14, ex.getLezood3());
            pst.setString(15, ex.getOe1());
            pst.setString(16, ex.getOe2());
            pst.setString(17, ex.getOe3());
            pst.setString(18, ex.getAdiçao());
            pst.setString(19, ex.getRxod1());
            pst.setString(20, ex.getRxod2());
            pst.setString(21, ex.getRxod3());
            pst.setString(22, ex.getDnp());
            pst.setString(23, ex.getRxoe1());
            pst.setString(24, ex.getRxoe2());
            pst.setString(25, ex.getRxoe3());
            pst.setString(26, ex.getAdiçao2());
            pst.setString(27, ex.getAlt());
            pst.setString(28, ex.getData());
            pst.setString(29, ex.getFone());
            pst.setInt(30, ex.getCod_exame());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterado Com Sucesso!!!");
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "ERRO Ao Alterar"+ex1);
        }
       
       conex.Desconecta();
   }
    
    
    public void BuscarNomeCliente(int cod){
        conexclientes2.Conexao();
        
        try {
            conexclientes2.executaSql("select *from clientes2 where cod_cliente="+cod);
            conexclientes2.ResultSet.first();
            nomeexame=conexclientes2.ResultSet.getString("nome_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO"+ex);
        }
        
        conexclientes2.Desconecta();
    }
    public BeansExame BuscaExame(BeansExame ex){
        conex.Conexao();
        
        try {
            conex.executaSql("select *from exames where nome_cliente_exame like'%"+ex.getPesquisa()+"%'");
            conex.ResultSet.first();
            BuscarNomeCliente(conex.ResultSet.getInt("cod_exame"));
            ex.setCod_exame(conex.ResultSet.getInt("cod_exame"));
            ex.setNome_cliente_exame(conex.ResultSet.getString("nome_cliente_exame"));
            ex.setIdade(conex.ResultSet.getString("idade_exame"));
            ex.setEnd(conex.ResultSet.getString("end_exame"));
            ex.setAvod(conex.ResultSet.getString("avod_exame"));
            ex.setAvoe(conex.ResultSet.getString("avoe_exame"));
            ex.setCc1(conex.ResultSet.getString("cc1_exame"));
            ex.setCc2(conex.ResultSet.getString("cc2_exame"));
            ex.setDiabetes1(conex.ResultSet.getString("diabetes1_exame"));
            ex.setDiabetes2(conex.ResultSet.getString("diabetes2_exame"));
            ex.setObs(conex.ResultSet.getString("obs_exame"));
            ex.setLezood1(conex.ResultSet.getString("lezood1_exame"));
            ex.setLezood2(conex.ResultSet.getString("lezood2_exame"));
            ex.setLezood3(conex.ResultSet.getString("lezood3_exame"));
            ex.setOe1(conex.ResultSet.getString("oe1_exame"));
            ex.setOe2(conex.ResultSet.getString("oe2_exame"));
            ex.setOe3(conex.ResultSet.getString("oe3_exame"));
            ex.setAdiçao(conex.ResultSet.getString("adiçao_exame"));
            ex.setRxod1(conex.ResultSet.getString("rxod1_exame"));
            ex.setRxod2(conex.ResultSet.getString("rxod2_exame"));
            ex.setRxod3(conex.ResultSet.getString("rxod3_exame"));
            ex.setDnp(conex.ResultSet.getString("dnp_exame"));
            ex.setRxoe1(conex.ResultSet.getString("rxoe1_exame"));
            ex.setRxoe2(conex.ResultSet.getString("rxoe2_exame"));
            ex.setRxoe3(conex.ResultSet.getString("rxoe3_exame"));
            ex.setAdiçao2(conex.ResultSet.getString("adiçao2_exame"));
            ex.setAlt(conex.ResultSet.getString("alt_exame"));
            ex.setData(conex.ResultSet.getString("data_exame"));
            ex.setFone(conex.ResultSet.getString("fone_exame"));
            
        } catch (SQLException ex1) {
           JOptionPane.showMessageDialog(null, "Nenhum Paciente Encontrado");
        }
        conex.Desconecta();
        
        
        
        return ex;
    }
   
    public void Excluir (BeansExame ex){
        conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from exames where cod_exame=?");
            pst.setInt(1, ex.getCod_exame());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluido Com Sucesso");
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "ERRO Ao Excluir Exame"+ex);
        }
        
        conex.Desconecta();
    }
}
