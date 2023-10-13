
package ModeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBd {
    
  public Statement stm; // reponsavel por preparar e realizar pesquisas no BD
  public ResultSet ResultSet; // reponsavel por guardar o que foi pesquisado
  private String driver = "org.postgresql.Driver"; // drive padrao do postgree  
  private String caminho = "jdbc:postgresql://localhost:5432/Ed otica";
  private String usuario = "postgres";
  private String senha = "1234";
  public Connection con;
  
  
  public void Conexao(){
      
      
      try {
          System.setProperty("jdbc.Drivers", driver); // responsavel por setar a propriedade do drive da conexao
          con=DriverManager.getConnection(caminho, usuario, senha);
          //JOptionPane.showMessageDialog(null, "Conexao Realizada");
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Conexao Falhou:\n" +ex.getMessage());
      }
      
  }
  
  public void executaSql(String sql){
      try {
          stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); 
          ResultSet=stm.executeQuery(sql);
          
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro Executa Sql:\n" +ex.getMessage());
      }
      
  }
  
  public void Desconecta(){
      try {
          con.close();
         // JOptionPane.showMessageDialog(null, "Desconectado Do Banco De Dados");
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com BD\n"+ex.getMessage());
      }
  }
}
