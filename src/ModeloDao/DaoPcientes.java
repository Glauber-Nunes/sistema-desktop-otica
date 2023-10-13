
package ModeloDao;



import ModeloBeans.BenasPacientes;
import ModeloConection.ConexaoBd;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoPcientes {
     
  
  //manutençao feita 25/10/2020 02:56 hrs
   ConexaoBd conex = new ConexaoBd();
   ConexaoBd conexclientes2 = new ConexaoBd();
   String nome_cliente;
   int codPaciente;
   
   public void Salvar (BenasPacientes pac){
       BuscarCodPaciente(pac.getNome_cliente());
       conex.Conexao();
       try {
           PreparedStatement pst = conex.con.prepareStatement("insert into pacientes (paci_codigo,paci_dataemissao, paci_nome_cliente,paci_fone,paci_tipodearmaçao,paci_marca,paci_ref,paci_cor,paci_valor,paci_pconta,paci_resta,paci_obs,paci_prometidopara,paci_formadepat,paci_odesflonge,paci_odcillonge,paci_odeixolonge,paci_oeesflonge,paci_oecillonge,paci_oeeixolonge,paci_odesfperto,paci_odcilperto,paci_odeixoperto,paci_oeesfperto,paci_oecilperto,paci_oeeixoperto,paci_dp,paci_alt,paci_tipodelente) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          
           pst.setInt(1, codPaciente);
           pst.setString(2, pac.getDataemissao());
           pst.setString(3, pac.getNome_cliente());
           pst.setString(4, pac.getFone());
           pst.setString(5, pac.getTipoarmaçao());
           pst.setString(6, pac.getMarca());
           pst.setString(7, pac.getRef());
           pst.setString(8, pac.getCor());
           pst.setString(9, pac.getValor());
           pst.setString(10, pac.getPconta());
           pst.setString(11, pac.getResta());
           pst.setString(12,pac.getObs());
           pst.setString(13, pac.getPrometidopara()); 
           pst.setString(14, pac.getFormadepat());
           pst.setString(15, pac.getOdesflonge());
           pst.setString(16, pac.getOdcillonge());
           pst.setString(17, pac.getOdeixolonge());
           pst.setString(18, pac.getOeesflonge());
           pst.setString(19, pac.getOecillonge());
           pst.setString(20, pac.getOeeixolonge()); 
           pst.setString(21, pac.getOdesfperto());
           pst.setString(22, pac.getOdcilperto());
           pst.setString(23, pac.getOdeixoperto());          
           pst.setString(24, pac.getOeesfperto());
           pst.setString(25, pac.getOecilperto());
           pst.setString(26, pac.getOeeixoperto());
           pst.setString(27, pac.getDp());
           pst.setString(28, pac.getAlt());
           pst.setString(29, pac.getTipodelente());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Paciente Salvo");
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO"+ex);
       }
       
       conex.Desconecta();
   }
  
   //manutençao feita 25/10/2020 02:56 hrs
   public void BuscarCodPaciente(String nome){
       conex.Conexao();
       conex.executaSql("select *from clientes2 where nome_cliente ='"+nome+"'");
       try {
           conex.ResultSet.first();
           codPaciente=conex.ResultSet.getInt("cod_cliente");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO"+ex);
       }
       conex.Desconecta();
   }
   
    public void Alterar (BenasPacientes pac){
       BuscarCodPaciente(pac.getNome_cliente());
       conex.Conexao();
       try {
           PreparedStatement pst = conex.con.prepareStatement("update pacientes set paci_codigo=?,paci_dataemissao=?, paci_nome_cliente=?,paci_fone=?,paci_tipodearmaçao=?,paci_marca=?,paci_ref=?,paci_cor=?,paci_valor=?,paci_pconta=?,paci_resta=?,paci_obs=?,paci_prometidopara=?,paci_formadepat=?, paci_odesflonge=?,paci_odcillonge=?,paci_odeixolonge=?,paci_oeesflonge=?,paci_oecillonge=?,paci_oeeixolonge=?,paci_odesfperto=?,paci_odcilperto=?,paci_odeixoperto=?,paci_oeesfperto=?,paci_oecilperto=?,paci_oeeixoperto=?,paci_dp=?,paci_alt=?,paci_tipodelente=? where paci_codigo=?");
           pst.setInt(1, codPaciente);
           pst.setString(2, pac.getDataemissao());
           pst.setString(3, pac.getNome_cliente());
           pst.setString(4, pac.getFone());
           pst.setString(5, pac.getTipoarmaçao());
           pst.setString(6, pac.getMarca());
           pst.setString(7, pac.getRef());
           pst.setString(8, pac.getCor());
           pst.setString(9, pac.getValor());
           pst.setString(10, pac.getPconta());
           pst.setString(11, pac.getResta());
           pst.setString(12,pac.getObs());
           pst.setString(13 , pac.getPrometidopara());
           pst.setString(14, pac.getFormadepat());
           pst.setString(15, pac.getOdesflonge());
           pst.setString(16, pac.getOdcillonge());
           pst.setString(17, pac.getOdeixolonge());
           pst.setString(18, pac.getOeesflonge());
           pst.setString(19, pac.getOecillonge());
           pst.setString(20, pac.getOeeixolonge()); 
           pst.setString(21, pac.getOdesfperto());
           pst.setString(22, pac.getOdcilperto());
           pst.setString(23, pac.getOdeixoperto());          
           pst.setString(24, pac.getOeesfperto());
           pst.setString(25, pac.getOecilperto());
           pst.setString(26, pac.getOeeixoperto());
           pst.setString(27, pac.getDp());
           pst.setString(28, pac.getAlt());
           pst.setString(29, pac.getTipodelente());
           pst.setInt(30, pac.getPaci_codigo());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Dados Alterado Com Sucesso!!!");
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO"+ex);
       }
       
       conex.Desconecta();
   }
   
   public void BuscarNomePaciente(int cod){
       conexclientes2.Conexao();
       
       try {
           conexclientes2.executaSql("select *from clientes2 where cod_cliente="+cod);
           conexclientes2.ResultSet.first();
           nome_cliente=conexclientes2.ResultSet.getString("nome_cliente");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR NOME DO CLIENTE"+ex);
       }
       
       
       conexclientes2.Desconecta();
       
   }
   //manutençao feita 25/10/2020 02:56 hrs
   public BenasPacientes BuscaPaciente(BenasPacientes pac){
       conex.Conexao();
       try {
           conex.executaSql("select *from pacientes where paci_nome_cliente like'%"+pac.getPesquisa()+"%'");
           conex.ResultSet.first();
           BuscarNomePaciente(conex.ResultSet.getInt("paci_codigo"));
           pac.setPaci_codigo(conex.ResultSet.getInt("paci_codigo"));
           pac.setDataemissao(conex.ResultSet.getString("paci_dataemissao"));
           pac.setNome_cliente(conex.ResultSet.getString("paci_nome_cliente"));
           pac.setFone(conex.ResultSet.getString("paci_fone"));
           pac.setTipoarmaçao(conex.ResultSet.getString("paci_tipodearmaçao"));
           pac.setMarca(conex.ResultSet.getString("paci_marca"));
           pac.setRef(conex.ResultSet.getString("paci_ref"));
           pac.setCor(conex.ResultSet.getString("paci_cor"));
           pac.setValor(conex.ResultSet.getString("paci_valor"));
           pac.setPconta(conex.ResultSet.getString("paci_pconta"));
           pac.setResta(conex.ResultSet.getString("paci_resta"));
           pac.setObs(conex.ResultSet.getString("paci_obs"));
           pac.setPrometidopara(conex.ResultSet.getString("paci_prometidopara"));
           pac.setFormadepat(conex.ResultSet.getString("paci_formadepat"));
           pac.setOdesflonge(conex.ResultSet.getString("paci_odesflonge"));
           pac.setOdcillonge(conex.ResultSet.getString("paci_odcillonge"));
           pac.setOdeixolonge(conex.ResultSet.getString("paci_odeixolonge"));
           pac.setOeesflonge(conex.ResultSet.getString("paci_oeesflonge"));
           pac.setOecillonge(conex.ResultSet.getString("paci_oecillonge"));
           pac.setOeeixolonge(conex.ResultSet.getString("paci_oeeixolonge"));
           pac.setOdesfperto(conex.ResultSet.getString("paci_odesfperto"));
           pac.setOdcilperto(conex.ResultSet.getString("paci_odcilperto"));
           pac.setOdeixoperto(conex.ResultSet.getString("paci_odeixoperto")); 
           pac.setOeesfperto(conex.ResultSet.getString("paci_oeesfperto"));
           pac.setOecilperto(conex.ResultSet.getString("paci_oecilperto"));
           pac.setOeeixoperto(conex.ResultSet.getString("paci_oeeixoperto"));
           pac.setDp(conex.ResultSet.getString("paci_dp"));
           pac.setAlt(conex.ResultSet.getString("paci_alt"));
           pac.setTipodelente(conex.ResultSet.getString("paci_tipodelente"));
           
           
           
           pac.setNome_cliente(nome_cliente);
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR PACIENTE"+ex);
       }
       conex.Desconecta();

       return pac;       
   }
   
   public void Excluir(BenasPacientes pac){
       conex.Conexao();
       try {
           PreparedStatement pst = conex.con.prepareStatement("delete from pacientes where paci_codigo=?");
           pst.setInt(1, pac.getPaci_codigo());
           pst.execute();
           JOptionPane.showMessageDialog(null,"PACIENTE EXCLUIDO COM SUCESSO");
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR PACIENTE"+ex);
       }
       conex.Desconecta();
   }
}
