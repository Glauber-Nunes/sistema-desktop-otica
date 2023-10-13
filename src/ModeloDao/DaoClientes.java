 
package ModeloDao;

import ModeloConection.ConexaoBd;
import ModeloBeans.BeansCliente;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.swing.JOptionPane;


public class DaoClientes {
    
    ConexaoBd conex = new ConexaoBd();
    BeansCliente mod = new BeansCliente();
    
    public void Salvar(BeansCliente mod){
        conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes2(nome_cliente, fone_cliente, dn_cliente ,estcivil_cliente ,end_cliente ,bairro_cliente, cidade_cliente, pontoderef_cliente, rg_cliente, exp_cliente, cpf_cliente, mae_cliente, pai_cliente, data_cliente, descriçao_cliente, valor_cliente,vencimento1_cliente, valordaprest1_cliente, datadepgto1_cliente, saldo1_cliente ,vencimento2_cliente, valordaprest2_cliente, datadepgto2_cliente, saldo2_cliente,vencimento3_cliente,valordaprest3_cliente,datadepgto3_cliente,saldo3_cliente,vencimento4_cliente,valordaprest4_cliente,datadepgto4_cliente,saldo4_cliente,vencimento5_cliente,valordaprest5_cliente,datadepgto5_cliente,saldo5_cliente,vencimento6_cliente,valordaprest6_cliente,datadepgto6_cliente,saldo6_cliente,vencimento7_cliente,valordaprest7_cliente,datadepgto7_cliente,saldo7_cliente,vencimento8_cliente,valordaprest8_cliente,datadepgto8_cliente,saldo8_cliente,vencimento9_cliente,valordaprest9_cliente,datadepgto9_cliente,saldo9_cliente,vencimento10_cliente,valordaprest10_cliente,datadepgto10_cliente,saldo10_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getFone());
            pst.setString(3, mod.getDatanasci());
            pst.setString(4, mod.getEstcivil());
            pst.setString(5, mod.getEndereço());
            pst.setString(6, mod.getBairro());
            pst.setString(7, mod.getCidade());
            pst.setString(8, mod.getPontoderef());
            pst.setString(9, mod.getRg());
            pst.setString(10, mod.getExp());
            pst.setString(11, mod.getCpf());
            pst.setString(12, mod.getMae());
            pst.setString(13, mod.getPai());
            pst.setString(14, mod.getData());
            pst.setString(15, mod.getDescriçao());
            pst.setString(16, mod.getValor());
            pst.setString(17, mod.getVencimento1());
            pst.setString(18, mod.getValordaprest1());
            pst.setString(19, mod.getDatadepgto1());
            pst.setString(20, mod.getSaldo1());
            pst.setString(21, mod.getVencimento2());
            pst.setString(22, mod.getValordaprest2());
            pst.setString(23, mod.getDatadepgto2());
            pst.setString(24, mod.getSaldo2());
            pst.setString(25, mod.getVencimento3());
            pst.setString(26, mod.getValordaprest3());
            pst.setString(27, mod.getDatadepgto3());
            pst.setString(28, mod.getSaldo3());
            pst.setString(29, mod.getVencimento4());
            pst.setString(30, mod.getValordaprest4());
            pst.setString(31, mod.getDatadepgto4());
            pst.setString(32, mod.getSaldo4());
            pst.setString(33, mod.getVencimento5());
            pst.setString(34, mod.getValordaprest5());
            pst.setString(35, mod.getDatadepgto5());
            pst.setString(36, mod.getSaldo5());
            pst.setString(37, mod.getVencimento6());
            pst.setString(38, mod.getValordaprest6());
            pst.setString(39, mod.getDatadepgto6());
            pst.setString(40, mod.getSaldo6());
            pst.setString(41, mod.getVencimento7());
            pst.setString(42, mod.getValordaprest7());
            pst.setString(43, mod.getDatadepgto7());
            pst.setString(44, mod.getSaldo7());
            pst.setString(45, mod.getVencimento8());
            pst.setString(46, mod.getValordaprest8());
            pst.setString(47, mod.getDatadepgto8());
            pst.setString(48, mod.getSaldo8());
            pst.setString(49, mod.getVencimento9());
            pst.setString(50, mod.getValordaprest9());
            pst.setString(51, mod.getDatadepgto9());
            pst.setString(52, mod.getSaldo9());
            pst.setString(53, mod.getVencimento10());
            pst.setString(54, mod.getValordaprest10());
            pst.setString(55, mod.getDatadepgto10());
            pst.setString(56, mod.getSaldo10());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Cadastrar" +ex);
        }
                
        conex.Desconecta();
        
    }
     
    public BeansCliente buscaCliente (BeansCliente mod){
        conex.Conexao();
        conex.executaSql("select *from clientes2 where lower (nome_cliente) like lower ('%"+mod.getPesquisa()+"%')");
        try {
            conex.ResultSet.first();
            
            mod.setCodigo(conex.ResultSet.getInt("cod_cliente"));
            mod.setNome(conex.ResultSet.getString("nome_cliente"));
            mod.setFone(conex.ResultSet.getString("fone_cliente"));
            mod.setDatanasci(conex.ResultSet.getString("dn_cliente"));
            mod.setEstcivil(conex.ResultSet.getString("estcivil_cliente"));
            mod.setEndereço(conex.ResultSet.getString("end_cliente"));
            mod.setBairro(conex.ResultSet.getString("bairro_cliente"));
            mod.setCidade(conex.ResultSet.getString("cidade_cliente"));
            mod.setPontoderef(conex.ResultSet.getString("pontoderef_cliente"));
            mod.setRg(conex.ResultSet.getString("rg_cliente"));
            mod.setExp(conex.ResultSet.getString("exp_cliente"));
            mod.setCpf(conex.ResultSet.getString("cpf_cliente"));
            mod.setMae(conex.ResultSet.getString("mae_cliente"));
            mod.setPai(conex.ResultSet.getString("pai_cliente"));
            mod.setData(conex.ResultSet.getString("data_cliente"));
            mod.setDescriçao(conex.ResultSet.getString("descriçao_cliente"));
            mod.setValor(conex.ResultSet.getString("valor_cliente"));
            mod.setVencimento1(conex.ResultSet.getString("vencimento1_cliente"));
            mod.setValordaprest1(conex.ResultSet.getString("valordaprest1_cliente"));
            mod.setDatadepgto1(conex.ResultSet.getString("datadepgto1_cliente"));
            mod.setSaldo1(conex.ResultSet.getString("saldo1_cliente"));
            mod.setVencimento2(conex.ResultSet.getString("vencimento2_cliente"));
            mod.setValordaprest2(conex.ResultSet.getString("valordaprest2_cliente"));
            mod.setDatadepgto2(conex.ResultSet.getString("datadepgto2_cliente"));
            mod.setSaldo2(conex.ResultSet.getString("saldo2_cliente"));
            mod.setVencimento3(conex.ResultSet.getString("vencimento3_cliente"));
            mod.setValordaprest3(conex.ResultSet.getString("valordaprest3_cliente"));
            mod.setDatadepgto3(conex.ResultSet.getString("datadepgto3_cliente"));
            mod.setSaldo3(conex.ResultSet.getString("saldo3_cliente"));
            mod.setVencimento4(conex.ResultSet.getString("vencimento4_cliente"));
            mod.setValordaprest4(conex.ResultSet.getString("valordaprest4_cliente"));
            mod.setDatadepgto4(conex.ResultSet.getString("datadepgto4_cliente"));
            mod.setSaldo4(conex.ResultSet.getString("saldo4_cliente"));
            mod.setVencimento5(conex.ResultSet.getString("vencimento5_cliente"));
            mod.setValordaprest5(conex.ResultSet.getString("valordaprest5_cliente"));
            mod.setDatadepgto5(conex.ResultSet.getString("datadepgto5_cliente"));
            mod.setSaldo5(conex.ResultSet.getString("saldo5_cliente"));
            mod.setVencimento6(conex.ResultSet.getString("vencimento6_cliente"));
            mod.setValordaprest6(conex.ResultSet.getString("valordaprest6_cliente"));
            mod.setDatadepgto6(conex.ResultSet.getString("datadepgto6_cliente"));
            mod.setSaldo6(conex.ResultSet.getString("saldo6_cliente"));
            mod.setVencimento7(conex.ResultSet.getString("vencimento7_cliente"));
            mod.setValordaprest7(conex.ResultSet.getString("valordaprest7_cliente"));
            mod.setDatadepgto7(conex.ResultSet.getString("datadepgto7_cliente"));
            mod.setSaldo7(conex.ResultSet.getString("saldo7_cliente")); 
            mod.setVencimento8(conex.ResultSet.getString("vencimento8_cliente"));
            mod.setValordaprest8(conex.ResultSet.getString("valordaprest8_cliente"));
            mod.setDatadepgto8(conex.ResultSet.getString("datadepgto8_cliente"));
            mod.setSaldo8(conex.ResultSet.getString("saldo8_cliente")); 
            mod.setVencimento9(conex.ResultSet.getString("vencimento9_cliente"));
            mod.setValordaprest9(conex.ResultSet.getString("valordaprest9_cliente"));
            mod.setDatadepgto9(conex.ResultSet.getString("datadepgto9_cliente"));
            mod.setSaldo9(conex.ResultSet.getString("saldo9_cliente"));
            mod.setVencimento10(conex.ResultSet.getString("vencimento10_cliente"));
            mod.setValordaprest10(conex.ResultSet.getString("valordaprest10_cliente"));
            mod.setDatadepgto10(conex.ResultSet.getString("datadepgto10_cliente"));
            mod.setSaldo10(conex.ResultSet.getString("saldo10_cliente"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Cliente Encontrado");
            
        }
        conex.Desconecta();
        return mod;
    }
    
    public void Editar (BeansCliente mod){
        conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes2 set nome_cliente=?, fone_cliente=?,dn_cliente=?,estcivil_cliente=?,end_cliente=?,bairro_cliente=?,cidade_cliente=?,pontoderef_cliente=?,rg_cliente=?,exp_cliente=?,cpf_cliente=?,mae_cliente=?,pai_cliente=?,data_cliente=?,descriçao_cliente=?,valor_cliente=?,vencimento1_cliente=?,valordaprest1_cliente=?,datadepgto1_cliente=?,saldo1_cliente=?,vencimento2_cliente=?,valordaprest2_cliente=?,datadepgto2_cliente=?,saldo2_cliente=?,vencimento3_cliente=?,valordaprest3_cliente=?,datadepgto3_cliente=?,saldo3_cliente=?,vencimento4_cliente=?,valordaprest4_cliente=?,datadepgto4_cliente=?,saldo4_cliente=?,vencimento5_cliente=?,valordaprest5_cliente=?,datadepgto5_cliente=?,saldo5_cliente=?,vencimento6_cliente=?,valordaprest6_cliente=?,datadepgto6_cliente=?,saldo6_cliente=?,vencimento7_cliente=?,valordaprest7_cliente=?,datadepgto7_cliente=?,saldo7_cliente=?,vencimento8_cliente=?,valordaprest8_cliente=?,datadepgto8_cliente=?,saldo8_cliente=?,vencimento9_cliente=?,valordaprest9_cliente=?,datadepgto9_cliente=?,saldo9_cliente=?,vencimento10_cliente=?,valordaprest10_cliente=?,datadepgto10_cliente=?,saldo10_cliente=? where cod_cliente=?");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getFone());
            pst.setString(3, mod.getDatanasci());
            pst.setString(4, mod.getEstcivil());
            pst.setString(5, mod.getEndereço());
            pst.setString(6, mod.getBairro());
            pst.setString(7, mod.getCidade());
            pst.setString(8, mod.getPontoderef());
            pst.setString(9, mod.getRg());
            pst.setString(10, mod.getExp());
            pst.setString(11, mod.getCpf());
            pst.setString(12, mod.getMae());
            pst.setString(13, mod.getPai());
            pst.setString(14, mod.getData());
            pst.setString(15, mod.getDescriçao());
            pst.setString(16, mod.getValor());
            pst.setString(17, mod.getVencimento1());
            pst.setString(18, mod.getValordaprest1());
            pst.setString(19, mod.getDatadepgto1());
            pst.setString(20, mod.getSaldo1());
            pst.setString(21, mod.getVencimento2());
            pst.setString(22, mod.getValordaprest2());
            pst.setString(23, mod.getDatadepgto2());
            pst.setString(24, mod.getSaldo2());
            pst.setString(25, mod.getVencimento3());
            pst.setString(26, mod.getValordaprest3());
            pst.setString(27, mod.getDatadepgto3());
            pst.setString(28, mod.getSaldo3());
            pst.setString(29, mod.getVencimento4());
            pst.setString(30, mod.getValordaprest4());
            pst.setString(31, mod.getDatadepgto4());
            pst.setString(32, mod.getSaldo4());
            pst.setString(33, mod.getVencimento5());
            pst.setString(34, mod.getValordaprest5());
            pst.setString(35, mod.getDatadepgto5());
            pst.setString(36, mod.getSaldo5());
            pst.setString(37, mod.getVencimento6());
            pst.setString(38, mod.getValordaprest6());
            pst.setString(39, mod.getDatadepgto6());
            pst.setString(40, mod.getSaldo6());
            pst.setString(41, mod.getVencimento7());
            pst.setString(42, mod.getValordaprest7());
            pst.setString(43, mod.getDatadepgto7());
            pst.setString(44, mod.getSaldo7());
            pst.setString(45, mod.getVencimento8());
            pst.setString(46, mod.getValordaprest8());
            pst.setString(47, mod.getDatadepgto8());
            pst.setString(48, mod.getSaldo8());
            pst.setString(49, mod.getVencimento9());
            pst.setString(50, mod.getValordaprest9());
            pst.setString(51, mod.getDatadepgto9());
            pst.setString(52, mod.getSaldo9());
            pst.setString(53, mod.getVencimento10());
            pst.setString(54, mod.getValordaprest10());
            pst.setString(55, mod.getDatadepgto10());
            pst.setString(56, mod.getSaldo10());
            pst.setInt(57, mod.getCodigo());
            pst.execute();
             JOptionPane.showMessageDialog(null, "Dados Alterado Com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Editar:"+ex);
        }
        
        conex.Desconecta();
    }
    
    public void Excluir (BeansCliente mod){
        conex.Conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes2 where cod_cliente = ?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos Com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao Excluir Dados");
        }
        
        conex.Desconecta();
    }
}
