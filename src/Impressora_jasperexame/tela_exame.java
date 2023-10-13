/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressora_jasperexame;

import Impressora_Jaspe.Tela_Cadastramento;
import ModeloBeans.BeansExame;
import ModeloBeans.ModeloTab;
import ModeloConection.ConexaoBd;
import ModeloDao.DaoExames;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author gabri
 */
public class tela_exame extends javax.swing.JFrame {

    DaoExames dao = new DaoExames();
    ConexaoBd conex = new ConexaoBd();
    BeansExame ex  = new BeansExame();
    int flag=0;
    int respostas=0;
    public tela_exame() {
        initComponents();
        PreencherNome();
        PreencherTabela("select cod_exame,nome_cliente_exame,idade_exame,end_exame,avod_exame,avoe_exame,cc1_exame,cc2_exame,diabetes1_exame,diabetes2_exame,obs_exame,lezood1_exame,lezood2_exame,lezood3_exame, oe1_exame, oe2_exame,oe3_exame,adiçao_exame,rxod1_exame,rxod2_exame,rxod3_exame,dnp_exame,rxoe1_exame,rxoe2_exame,rxoe3_exame,adiçao2_exame,alt_exame,data_exame,fone_exame from exames inner join clientes2 on cod_exame=cod_cliente order by cod_cliente");
        
    }

    public void PreencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Nº","Nome","Idade","Endereço","AV OD","AV OE","CC","CC2","DIABETE SIM","DIABETE NAO","Obs","LEZOMETRIA1 OD ","LEZOMETRIA2 OD ","LEZOMETRIA 3OD ","LEZOMETRIA1 OE ","LEZOMETRIA2 OE ","LEZOMETRIA3 OE ","Adiçao","RX1 OD","RX2 OD","RX3 OD","DNP","RX1 OE","RX2 OE","RX3 OE","Adiçao","ALT","DATA","FONE"};
        conex.Conexao();
        conex.executaSql(sql);
        
        try {
              conex.ResultSet.first();
              do {
                  
                 dados.add(new Object[] {conex.ResultSet.getInt("cod_exame"),conex.ResultSet.getString("nome_cliente_exame"),conex.ResultSet.getString("idade_exame"),conex.ResultSet.getString("end_exame"),conex.ResultSet.getString("avod_exame"),conex.ResultSet.getString("avoe_exame"),conex.ResultSet.getString("cc1_exame"),conex.ResultSet.getString("cc2_exame"),conex.ResultSet.getString("diabetes1_exame"),conex.ResultSet.getString("diabetes2_exame"),conex.ResultSet.getString("obs_exame"),conex.ResultSet.getString("lezood1_exame"),conex.ResultSet.getString("lezood2_exame"),conex.ResultSet.getString("lezood3_exame"),conex.ResultSet.getString("oe1_exame"),conex.ResultSet.getString("oe2_exame"),conex.ResultSet.getString("oe3_exame"),    conex.ResultSet.getString("adiçao_exame"),conex.ResultSet.getString("rxod1_exame"),conex.ResultSet.getString("rxod2_exame"),   conex.ResultSet.getString("rxod3_exame"),conex.ResultSet.getString("dnp_exame"),conex.ResultSet.getString("rxoe1_exame"),  conex.ResultSet.getString("rxoe2_exame"),conex.ResultSet.getString("rxoe3_exame"),conex.ResultSet.getString("adiçao2_exame"),conex.ResultSet.getString("alt_exame"),conex.ResultSet.getString("data_exame"),conex.ResultSet.getString("fone_exame")});
                  
              }while (conex.ResultSet.next());
          }catch (SQLException ex) {
              
          }
               ModeloTab modelo = new ModeloTab(dados, colunas);
        
        
          jTableexame.setModel(modelo);
          jTableexame.getColumnModel().getColumn(0).setPreferredWidth(50);
          jTableexame.getColumnModel().getColumn(0).setResizable(false);
          jTableexame.getColumnModel().getColumn(1).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(1).setResizable(false);
          jTableexame.getColumnModel().getColumn(2).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(2).setResizable(false);
          jTableexame.getColumnModel().getColumn(3).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(3).setResizable(false);
          jTableexame.getColumnModel().getColumn(4).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(4).setResizable(false);
          jTableexame.getColumnModel().getColumn(5).setPreferredWidth(80);
          jTableexame.getColumnModel().getColumn(5).setResizable(false);
          jTableexame.getColumnModel().getColumn(6).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(6).setResizable(false);
          jTableexame.getColumnModel().getColumn(7).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(7).setResizable(false);
          jTableexame.getColumnModel().getColumn(8).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(8).setResizable(false);
          jTableexame.getColumnModel().getColumn(9).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(9).setResizable(false);
          jTableexame.getColumnModel().getColumn(10).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(10).setResizable(false); 
          jTableexame.getColumnModel().getColumn(11).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(11).setResizable(false);
          jTableexame.getColumnModel().getColumn(12).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(12).setResizable(false);
          jTableexame.getColumnModel().getColumn(13).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(13).setResizable(false);
          jTableexame.getColumnModel().getColumn(14).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(14).setResizable(false);
          jTableexame.getColumnModel().getColumn(15).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(15).setResizable(false);
          jTableexame.getColumnModel().getColumn(16).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(16).setResizable(false);
          jTableexame.getColumnModel().getColumn(17).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(17).setResizable(false);
          jTableexame.getColumnModel().getColumn(18).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(18).setResizable(false);
          jTableexame.getColumnModel().getColumn(19).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(19).setResizable(false);
          jTableexame.getColumnModel().getColumn(20).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(20).setResizable(false);
          jTableexame.getColumnModel().getColumn(21).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(21).setResizable(false);
          jTableexame.getColumnModel().getColumn(22).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(22).setResizable(false);
          jTableexame.getColumnModel().getColumn(23).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(23).setResizable(false);
          jTableexame.getColumnModel().getColumn(24).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(24).setResizable(false);
          jTableexame.getColumnModel().getColumn(25).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(25).setResizable(false);
          jTableexame.getColumnModel().getColumn(26).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(26).setResizable(false);
          jTableexame.getColumnModel().getColumn(27).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(27).setResizable(false);
          jTableexame.getColumnModel().getColumn(28).setPreferredWidth(100);
          jTableexame.getColumnModel().getColumn(28).setResizable(false);
          
          
          
          
          
          jTableexame.getTableHeader().setReorderingAllowed(false);
          jTableexame.setAutoResizeMode(jTableexame.AUTO_RESIZE_OFF);
          jTableexame.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.Desconecta();
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jTextCOD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextIDADE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFONE = new javax.swing.JFormattedTextField();
        jTextEND = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jButtonsalvar = new javax.swing.JButton();
        jButtonalterar = new javax.swing.JButton();
        jButtonexcluir = new javax.swing.JButton();
        jButtonimprimir = new javax.swing.JButton();
        jButtonlimpar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableexame = new javax.swing.JTable();
        jButtonnovo = new javax.swing.JButton();
        jTextbuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextAVOD = new javax.swing.JTextField();
        jTextAVOE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextCC1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextCC2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSIM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNAO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textAreaOBS = new java.awt.TextArea();
        jLabel14 = new javax.swing.JLabel();
        jTextlezood1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextlezood2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextlezood3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextlezooe1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextlezooe2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextlezooe3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextadiçao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextrx2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextrx3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextrx1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldDNP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextrxe2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextrxe3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextrxe1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextadiçao2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldALT = new javax.swing.JTextField();
        jFormattedTextdata = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Exame");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 182, 0, 400));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 39));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ED-OTICA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 46));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 340, 30));

        jTextCOD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextCOD.setEnabled(false);
        jTextCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCODActionPerformed(evt);
            }
        });
        getContentPane().add(jTextCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 38, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDADE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jTextIDADE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextIDADE.setEnabled(false);
        jTextIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDADEActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIDADE, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FONE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        try {
            jFormattedTextFONE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFONE.setEnabled(false);
        jFormattedTextFONE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jFormattedTextFONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 190, -1));

        jTextEND.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextEND.setEnabled(false);
        getContentPane().add(jTextEND, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 340, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("END:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 80, -1));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, 80));

        jDesktopPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.setForeground(new java.awt.Color(0, 0, 0));
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME:");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jButtonsalvar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonsalvar.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonsalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsalvar.setText("SALVAR");
        jButtonsalvar.setEnabled(false);
        jButtonsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalvarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, 40));

        jButtonalterar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonalterar.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonalterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonalterar.setText("ALTERAR");
        jButtonalterar.setEnabled(false);
        jButtonalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonalterarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonalterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 90, 40));

        jButtonexcluir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonexcluir.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonexcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonexcluir.setText("EXCLUIR");
        jButtonexcluir.setEnabled(false);
        jButtonexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexcluirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, -1, 40));

        jButtonimprimir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonimprimir.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonimprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonimprimir.setText("IMPRIMIR");
        jButtonimprimir.setEnabled(false);
        jButtonimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonimprimirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 650, -1, 40));

        jButtonlimpar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonlimpar.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonlimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlimpar.setText("LIMPAR");
        jButtonlimpar.setEnabled(false);
        jButtonlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimparActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 100, 40));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, 30));

        jTableexame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableexame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableexameMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableexame);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 580, 200));

        jButtonnovo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonnovo.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jButtonnovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonnovo.setText("NOVO");
        jButtonnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnovoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 90, 40));

        jTextbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDesktopPane1.add(jTextbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 260, 30));
        jDesktopPane1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jDesktopPane1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 40, 430));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AV OD:");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTextAVOD.setBackground(new java.awt.Color(240, 240, 240));
        jTextAVOD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextAVOD.setEnabled(false);
        jDesktopPane1.add(jTextAVOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 140, -1));

        jTextAVOE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextAVOE.setEnabled(false);
        jDesktopPane1.add(jTextAVOE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OE:");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C/C");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jTextCC1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextCC1.setEnabled(false);
        jDesktopPane1.add(jTextCC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 80, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("X");
        jDesktopPane1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 20, 30));

        jTextCC2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextCC2.setEnabled(false);
        jDesktopPane1.add(jTextCC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 80, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DIABETES:");
        jDesktopPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SIM:");
        jDesktopPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jTextFieldSIM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldSIM.setEnabled(false);
        jDesktopPane1.add(jTextFieldSIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 60, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NAO:");
        jDesktopPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jTextFieldNAO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNAO.setEnabled(false);
        jDesktopPane1.add(jTextFieldNAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 60, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("OBS.");
        jDesktopPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        textAreaOBS.setEnabled(false);
        textAreaOBS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jDesktopPane1.add(textAreaOBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 190, 70));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LEZOMETRIA OD:");
        jDesktopPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jTextlezood1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezood1.setEnabled(false);
        jTextlezood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlezood1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextlezood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 57, -1));

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("X");
        jDesktopPane1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jTextlezood2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezood2.setEnabled(false);
        jDesktopPane1.add(jTextlezood2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 56, -1));

        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("X");
        jDesktopPane1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        jTextlezood3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezood3.setEnabled(false);
        jDesktopPane1.add(jTextlezood3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 60, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("OE:");
        jDesktopPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jTextlezooe1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezooe1.setEnabled(false);
        jDesktopPane1.add(jTextlezooe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 57, -1));

        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("X");
        jDesktopPane1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        jTextlezooe2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezooe2.setEnabled(false);
        jDesktopPane1.add(jTextlezooe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 60, -1));

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("X");
        jDesktopPane1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jTextlezooe3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextlezooe3.setEnabled(false);
        jDesktopPane1.add(jTextlezooe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 60, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ADIÇAO:");
        jDesktopPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 90, -1));

        jTextadiçao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextadiçao.setEnabled(false);
        jDesktopPane1.add(jTextadiçao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 180, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RX OD:");
        jDesktopPane1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jTextrx2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrx2.setEnabled(false);
        jDesktopPane1.add(jTextrx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 60, -1));

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("X");
        jDesktopPane1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jTextrx3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrx3.setEnabled(false);
        jDesktopPane1.add(jTextrx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 60, -1));

        jLabel32.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("X");
        jDesktopPane1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jTextrx1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrx1.setEnabled(false);
        jDesktopPane1.add(jTextrx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 60, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("DNP:");
        jDesktopPane1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        jTextFieldDNP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldDNP.setEnabled(false);
        jDesktopPane1.add(jTextFieldDNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 95, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("OE:");
        jDesktopPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jTextrxe2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrxe2.setEnabled(false);
        jDesktopPane1.add(jTextrxe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, 30));

        jLabel33.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("X");
        jDesktopPane1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jTextrxe3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrxe3.setEnabled(false);
        jDesktopPane1.add(jTextrxe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 60, -1));

        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("X");
        jDesktopPane1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        jTextrxe1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextrxe1.setEnabled(false);
        jDesktopPane1.add(jTextrxe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 60, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ADIÇAO:");
        jDesktopPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jTextadiçao2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextadiçao2.setEnabled(false);
        jDesktopPane1.add(jTextadiçao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 190, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ALT:");
        jDesktopPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jTextFieldALT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldALT.setEnabled(false);
        jDesktopPane1.add(jTextFieldALT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 95, -1));

        try {
            jFormattedTextdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextdata.setEnabled(false);
        jFormattedTextdata.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jDesktopPane1.add(jFormattedTextdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 200, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DATA:");
        jDesktopPane1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 920));

        setSize(new java.awt.Dimension(1378, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void PreencherNome(){
        conex.Conexao();
        conex.executaSql("select *from clientes2 order by nome_cliente");
        try {
            conex.ResultSet.first();
            jComboBox1.removeAllItems();
            
            do{
                jComboBox1.addItem(conex.ResultSet.getString("nome_cliente"));
            }while(conex.ResultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "erro"+ex);
        }
        
        
        conex.Desconecta();
    }
    
    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ex.setPesquisa(jTextbuscar.getText());
        BeansExame ex1= dao.BuscaExame(ex);
       
        jComboBox1.setEnabled(true);
        jTextIDADE.setEnabled(true);
       jTextEND.setEnabled(true);
       jTextAVOD.setEnabled(true);
       jTextAVOE.setEnabled(true);
       jTextCC1.setEnabled(true);
       jTextCC2.setEnabled(true);
       jTextFieldSIM.setEnabled(true);
       jTextFieldNAO.setEnabled(true);
       textAreaOBS.setEnabled(true);
       jTextlezood1.setEnabled(true);
       jTextlezood2.setEnabled(true);
       jTextlezood3.setEnabled(true);
       jTextlezooe1.setEnabled(true);
       jTextlezooe2.setEnabled(true);
       jTextlezooe3.setEnabled(true);
       jTextadiçao.setEnabled(true);
       jTextrx1.setEnabled(true);
       jTextrx2.setEnabled(true);
       jTextrx3.setEnabled(true);
       jTextFieldDNP.setEnabled(true);
       jTextrxe1.setEnabled(true);
       jTextrxe2.setEnabled(true);
       jTextrxe3.setEnabled(true);
       jTextadiçao2.setEnabled(true);
       jTextFieldALT.setEnabled(true);
       jFormattedTextdata.setEnabled(true);
       jFormattedTextFONE.setEnabled(true);
       
       jButtonsalvar.setEnabled(true);
       jButtonnovo.setEnabled(false);
       jButtonalterar.setEnabled(true);
       jButtonlimpar.setEnabled(true);
       jButtonexcluir.setEnabled(!false);
       jButtonimprimir.setEnabled(!false);
       
        
        
       jTextCOD.setText(String.valueOf(ex1.getCod_exame()));
       jComboBox1.setSelectedItem(ex1.getNome_cliente_exame());
       jTextIDADE.setText(ex1.getIdade());
       jTextEND.setText(ex1.getEnd());
       jTextAVOD.setText(ex1.getAvoe());
       jTextAVOE.setText(ex1.getAvoe());
       jTextCC1.setText(ex1.getCc1());
       jTextCC2.setText(ex1.getCc2());
       jTextFieldSIM.setText(ex1.getDiabetes1());
       jTextFieldNAO.setText(ex1.getDiabetes2());
       textAreaOBS.setText(ex1.getObs());
       jTextlezood1.setText(ex1.getLezood1());
       jTextlezood2.setText(ex1.getLezood2());
       jTextlezood3.setText(ex1.getLezood3());
       jTextlezooe1.setText(ex1.getOe1());
       jTextlezooe2.setText(ex1.getOe2());
       jTextlezooe3.setText(ex1.getOe3());
       jTextadiçao.setText(ex1.getAdiçao());
       jTextrx1.setText(ex1.getRxod1());
       jTextrx2.setText(ex1.getRxod2());
       jTextrx3.setText(ex1.getRxod3());
       jTextFieldDNP.setText(ex1.getDnp());
       jTextrxe1.setText(ex1.getRxoe1());
       jTextrxe2.setText(ex1.getRxoe2());
       jTextrxe3.setText(ex1.getRxoe3());
       jTextadiçao2.setText(ex1.getAdiçao2());
       jTextFieldALT.setText(ex1.getAlt());
       jFormattedTextdata.setText(ex1.getData());
       jFormattedTextFONE.setText(ex1.getFone());
       
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTableexameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableexameMouseClicked
        // TODO add your handling code here:
        
        String nome_paciente = ""+jTableexame.getValueAt(jTableexame.getSelectedRow(), 1);
        conex.Conexao();
        conex.executaSql("select *from exames where nome_cliente_exame='"+nome_paciente+"'");
       try {
           conex.ResultSet.first();
           jTextCOD.setText(String.valueOf(conex.ResultSet.getInt("cod_exame")));
           
           ConexaoBd conexPesquisa = new ConexaoBd();
           conexPesquisa.Conexao();
           conexPesquisa.executaSql("select *from clientes2 where cod_cliente="+conex.ResultSet.getInt("cod_exame"));
           conexPesquisa.ResultSet.first();
           jComboBox1.setSelectedItem(conexPesquisa.ResultSet.getString("nome_cliente"));
           jTextIDADE.setText(conex.ResultSet.getString("idade_exame"));
           jTextEND.setText(conex.ResultSet.getString("end_exame"));
           jTextAVOD.setText(conex.ResultSet.getString("avod_exame"));
           jTextAVOE.setText(conex.ResultSet.getString("avoe_exame"));
           jTextCC1.setText(conex.ResultSet.getString("cc1_exame"));
           jTextCC2.setText(conex.ResultSet.getString("cc2_exame"));
           jTextFieldSIM.setText(conex.ResultSet.getString("diabetes1_exame"));
           jTextFieldNAO.setText(conex.ResultSet.getString("diabetes2_exame"));
           textAreaOBS.setText(conex.ResultSet.getString("obs_exame"));
           jTextlezood1.setText(conex.ResultSet.getString("lezood1_exame"));
           jTextlezood2.setText(conex.ResultSet.getString("lezood2_exame"));
           jTextlezood3.setText(conex.ResultSet.getString("lezood3_exame"));
           jTextlezooe1.setText(conex.ResultSet.getString("oe1_exame"));
           jTextlezooe2.setText(conex.ResultSet.getString("oe2_exame"));
           jTextlezooe3.setText(conex.ResultSet.getString("oe3_exame"));
           jTextadiçao.setText(conex.ResultSet.getString("adiçao_exame"));
           jTextrx1.setText(conex.ResultSet.getString("rxod1_exame"));
           jTextrx2.setText(conex.ResultSet.getString("rxod2_exame"));
           jTextrx3.setText(conex.ResultSet.getString("rxod3_exame"));
           jTextFieldDNP.setText(conex.ResultSet.getString("dnp_exame")); 
           jTextrxe1.setText(conex.ResultSet.getString("rxoe1_exame"));
           jTextrxe2.setText(conex.ResultSet.getString("rxoe2_exame"));
           jTextrxe3.setText(conex.ResultSet.getString("rxoe3_exame"));
           jTextadiçao2.setText(conex.ResultSet.getString("adiçao2_exame"));
           jTextFieldALT.setText(conex.ResultSet.getString("alt_exame"));
           jFormattedTextdata.setText(conex.ResultSet.getString("data_exame"));
           jFormattedTextFONE.setText(conex.ResultSet.getString("fone_exame"));
           
        
           
           jButtonalterar.setEnabled(true);
           jButtonnovo.setEnabled(false);
           jButtonsalvar.setEnabled(!true);
           jButtonimprimir.setEnabled(true);
           jButtonlimpar.setEnabled(true);
           jButtonexcluir.setEnabled(true);
          
           
           conexPesquisa.Desconecta();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro Ao Selecionar Dados"+ex.getMessage());
        
    }                                           

    
        
    }//GEN-LAST:event_jTableexameMouseClicked

    private void jButtonimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonimprimirActionPerformed
        // TODO add your handling code here:

          jComboBox1.setEnabled(true);
        jTextIDADE.setEnabled(true);
       jTextEND.setEnabled(true);
       jTextAVOD.setEnabled(true);
       jTextAVOE.setEnabled(true);
       jTextCC1.setEnabled(true);
       jTextCC2.setEnabled(true);
       jTextFieldSIM.setEnabled(true);
       jTextFieldNAO.setEnabled(true);
       textAreaOBS.setEnabled(true);
       jTextlezood1.setEnabled(true);
       jTextlezood2.setEnabled(true);
       jTextlezood3.setEnabled(true);
       jTextlezooe1.setEnabled(true);
       jTextlezooe2.setEnabled(true);
       jTextlezooe3.setEnabled(true);
       jTextadiçao.setEnabled(true);
       jTextrx1.setEnabled(true);
       jTextrx2.setEnabled(true);
       jTextrx3.setEnabled(true);
       jTextFieldDNP.setEnabled(true);
       jTextrxe1.setEnabled(true);
       jTextrxe2.setEnabled(true);
       jTextrxe3.setEnabled(true);
       jTextadiçao2.setEnabled(true);
       jTextFieldALT.setEnabled(true);
       jFormattedTextdata.setEnabled(true);
       jFormattedTextFONE.setEnabled(true);
        
        Impressao2 Imprime = new Impressao2();
        List listade_dados = GetDados();
        Imprime.Imprime_Relatorio(listade_dados);

    }//GEN-LAST:event_jButtonimprimirActionPerformed

    private void jButtonexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexcluirActionPerformed
        // TODO add your handling code here:

        respostas=JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir?");
        if(respostas==JOptionPane.YES_OPTION){
            ex.setCod_exame(Integer.parseInt(jTextCOD.getText()));
            dao.Excluir(ex);

            jTextCOD.setText("");
            jTextIDADE.setText("");
            jTextEND.setText("");
            jTextAVOD.setText("");
            jTextAVOE.setText("");
            jTextCC1.setText("");
            jTextCC2.setText("");
            jTextFieldSIM.setText("");
            jTextFieldNAO.setText("");
            textAreaOBS.setText("");
            jTextlezood1.setText("");
            jTextlezood2.setText("");
            jTextlezood3.setText("");
            jTextlezooe1.setText("");
            jTextlezooe2.setText("");
            jTextlezooe3.setText("");
            jTextadiçao.setText("");
            jTextrx1.setText("");
            jTextrx2.setText("");
            jTextrx3.setText("");
            jTextFieldDNP.setText("");
            jTextrxe1.setText("");
            jTextrxe2.setText("");
            jTextrxe3.setText("");
            jTextadiçao2.setText("");
            jTextFieldALT.setText("");
            jFormattedTextdata.setText("");
            jFormattedTextFONE.setText("");

            //

            jComboBox1.setEnabled(!true);
            jTextIDADE.setEnabled(!true);
            jTextEND.setEnabled(!true);
            jTextAVOD.setEnabled(!true);
            jTextAVOE.setEnabled(!true);
            jTextCC1.setEnabled(!true);
            jTextCC2.setEnabled(!true);
            jTextFieldSIM.setEnabled(!true);
            jTextFieldNAO.setEnabled(!true);
            textAreaOBS.setEnabled(!true);
            jTextlezood1.setEnabled(!true);
            jTextlezood2.setEnabled(!true);
            jTextlezood3.setEnabled(!true);
            jTextlezooe1.setEnabled(!true);
            jTextlezooe2.setEnabled(!true);
            jTextlezooe3.setEnabled(!true);
            jTextadiçao.setEnabled(!true);
            jTextrx1.setEnabled(!true);
            jTextrx2.setEnabled(!true);
            jTextrx3.setEnabled(!true);
            jTextFieldDNP.setEnabled(!true);
            jTextrxe1.setEnabled(!true);
            jTextrxe2.setEnabled(!true);
            jTextrxe3.setEnabled(!true);
            jTextadiçao2.setEnabled(!true);
            jTextFieldALT.setEnabled(!true);
            jFormattedTextdata.setEnabled(!true);
            jFormattedTextFONE.setEnabled(!true);

            jButtonnovo.setEnabled(!false);
            jButtonalterar.setEnabled(false);
            jButtonlimpar.setEnabled(!true);
            jButtonexcluir.setEnabled(false);
            jButtonimprimir.setEnabled(false);

            PreencherTabela("select cod_exame,nome_cliente_exame,idade_exame,end_exame,avod_exame,avoe_exame,cc1_exame,cc2_exame,diabetes1_exame,diabetes2_exame,obs_exame,lezood1_exame,lezood2_exame,lezood3_exame, oe1_exame, oe2_exame,oe3_exame,adiçao_exame,rxod1_exame,rxod2_exame,rxod3_exame,dnp_exame,rxoe1_exame,rxoe2_exame,rxoe3_exame,adiçao2_exame,alt_exame,data_exame,fone_exame from exames inner join clientes2 on cod_exame=cod_cliente order by cod_cliente");

        }

    }//GEN-LAST:event_jButtonexcluirActionPerformed

    private void jButtonlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimparActionPerformed
        // TODO add your handling code here:
        jTextCOD.setText("");
        jTextIDADE.setText("");
        jTextEND.setText("");
        jTextAVOD.setText("");
        jTextAVOE.setText("");
        jTextCC1.setText("");
        jTextCC2.setText("");
        jTextFieldSIM.setText("");
        jTextFieldNAO.setText("");
        textAreaOBS.setText("");
        jTextlezood1.setText("");
        jTextlezood2.setText("");
        jTextlezood3.setText("");
        jTextlezooe1.setText("");
        jTextlezooe2.setText("");
        jTextlezooe3.setText("");
        jTextadiçao.setText("");
        jTextrx1.setText("");
        jTextrx2.setText("");
        jTextrx3.setText("");
        jTextFieldDNP.setText("");
        jTextrxe1.setText("");
        jTextrxe2.setText("");
        jTextrxe3.setText("");
        jTextadiçao2.setText("");
        jTextFieldALT.setText("");
        jFormattedTextdata.setText("");
        jFormattedTextFONE.setText("");

        jComboBox1.setEnabled(!true);
        jTextIDADE.setEnabled(!true);
        jTextEND.setEnabled(!true);
        jTextAVOD.setEnabled(!true);
        jTextAVOE.setEnabled(!true);
        jTextCC1.setEnabled(!true);
        jTextCC2.setEnabled(!true);
        jTextFieldSIM.setEnabled(!true);
        jTextFieldNAO.setEnabled(!true);
        textAreaOBS.setEnabled(!true);
        jTextlezood1.setEnabled(!true);
        jTextlezood2.setEnabled(!true);
        jTextlezood3.setEnabled(!true);
        jTextlezooe1.setEnabled(!true);
        jTextlezooe2.setEnabled(!true);
        jTextlezooe3.setEnabled(!true);
        jTextadiçao.setEnabled(!true);
        jTextrx1.setEnabled(!true);
        jTextrx2.setEnabled(!true);
        jTextrx3.setEnabled(!true);
        jTextFieldDNP.setEnabled(!true);
        jTextrxe1.setEnabled(!true);
        jTextrxe2.setEnabled(!true);
        jTextrxe3.setEnabled(!true);
        jTextadiçao2.setEnabled(!true);
        jTextFieldALT.setEnabled(!true);
        jFormattedTextdata.setEnabled(!true);
        jFormattedTextFONE.setEnabled(!true);

        jButtonnovo.setEnabled(!false);
        jButtonalterar.setEnabled(false);
        jButtonlimpar.setEnabled(!true);
        jButtonexcluir.setEnabled(false);
        jButtonimprimir.setEnabled(false);

    }//GEN-LAST:event_jButtonlimparActionPerformed

    private void jButtonnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnovoActionPerformed
        // TODO add your handling code here:

        flag=1;

        jComboBox1.setEnabled(true);
        jTextIDADE.setEnabled(true);
        jTextEND.setEnabled(true);
        jTextAVOD.setEnabled(true);
        jTextAVOE.setEnabled(true);
        jTextCC1.setEnabled(true);
        jTextCC2.setEnabled(true);
        jTextFieldSIM.setEnabled(true);
        jTextFieldNAO.setEnabled(true);
        textAreaOBS.setEnabled(true);
        jTextlezood1.setEnabled(true);
        jTextlezood2.setEnabled(true);
        jTextlezood3.setEnabled(true);
        jTextlezooe1.setEnabled(true);
        jTextlezooe2.setEnabled(true);
        jTextlezooe3.setEnabled(true);
        jTextadiçao.setEnabled(true);
        jTextrx1.setEnabled(true);
        jTextrx2.setEnabled(true);
        jTextrx3.setEnabled(true);
        jTextFieldDNP.setEnabled(true);
        jTextrxe1.setEnabled(true);
        jTextrxe2.setEnabled(true);
        jTextrxe3.setEnabled(true);
        jTextadiçao2.setEnabled(true);
        jTextFieldALT.setEnabled(true);
        jFormattedTextdata.setEnabled(true);
        jFormattedTextFONE.setEnabled(true);

        jButtonsalvar.setEnabled(true);
        jButtonnovo.setEnabled(false);
        jButtonalterar.setEnabled(false);
        jButtonlimpar.setEnabled(true);

    }//GEN-LAST:event_jButtonnovoActionPerformed

    private void jButtonalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonalterarActionPerformed
        // TODO add your handling code here:
        flag=2;
        jComboBox1.setEnabled(true);
        jTextIDADE.setEnabled(true);
        jTextEND.setEnabled(true);
        jTextAVOD.setEnabled(true);
        jTextAVOE.setEnabled(true);
        jTextCC1.setEnabled(true);
        jTextCC2.setEnabled(true);
        jTextFieldSIM.setEnabled(true);
        jTextFieldNAO.setEnabled(true);
        textAreaOBS.setEnabled(true);
        jTextlezood1.setEnabled(true);
        jTextlezood2.setEnabled(true);
        jTextlezood3.setEnabled(true);
        jTextlezooe1.setEnabled(true);
        jTextlezooe2.setEnabled(true);
        jTextlezooe3.setEnabled(true);
        jTextadiçao.setEnabled(true);
        jTextrx1.setEnabled(true);
        jTextrx2.setEnabled(true);
        jTextrx3.setEnabled(true);
        jTextFieldDNP.setEnabled(true);
        jTextrxe1.setEnabled(true);
        jTextrxe2.setEnabled(true);
        jTextrxe3.setEnabled(true);
        jTextadiçao2.setEnabled(true);
        jTextFieldALT.setEnabled(true);
        jFormattedTextdata.setEnabled(true);
        jFormattedTextFONE.setEnabled(true);

        jButtonsalvar.setEnabled(true);
        jButtonnovo.setEnabled(false);
        jButtonalterar.setEnabled(false);
        jButtonlimpar.setEnabled(true);
        jButtonexcluir.setEnabled(false);
        jButtonimprimir.setEnabled(false);

    }//GEN-LAST:event_jButtonalterarActionPerformed

    private void jButtonsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalvarActionPerformed
        // TODO add your handling code here:

        if(flag==1){

            ex.setNome_cliente_exame((String) jComboBox1.getSelectedItem());

            ex.setIdade(jTextIDADE.getText());
            ex.setEnd(jTextEND.getText());
            ex.setAvod(jTextAVOD.getText());
            ex.setAvoe(jTextAVOE.getText());
            ex.setCc1(jTextCC1.getText());
            ex.setCc2(jTextCC2.getText());
            ex.setDiabetes1(jTextFieldSIM.getText());
            ex.setDiabetes2(jTextFieldNAO.getText());
            ex.setObs(textAreaOBS.getText());
            ex.setLezood1(jTextlezood1.getText());
            ex.setLezood2(jTextlezood2.getText());
            ex.setLezood3(jTextlezood3.getText());
            ex.setOe1(jTextlezooe1.getText());
            ex.setOe2(jTextlezooe2.getText());
            ex.setOe3(jTextlezooe3.getText());
            ex.setAdiçao(jTextadiçao.getText());
            ex.setRxod1(jTextrx1.getText());
            ex.setRxod2(jTextrx2.getText());
            ex.setRxod3(jTextrx3.getText());
            ex.setDnp(jTextFieldDNP.getText());
            ex.setRxoe1(jTextrxe1.getText());
            ex.setRxoe2(jTextrxe2.getText());
            ex.setRxoe3(jTextrxe3.getText());
            ex.setAdiçao2(jTextadiçao2.getText());
            ex.setAlt(jTextFieldALT.getText());
            ex.setData(jFormattedTextdata.getText());
            ex.setFone(jFormattedTextFONE.getText());
            dao.Salvar(ex);
            PreencherTabela("select cod_exame,nome_cliente_exame,idade_exame,end_exame,avod_exame,avoe_exame,cc1_exame,cc2_exame,diabetes1_exame,diabetes2_exame,obs_exame,lezood1_exame,lezood2_exame,lezood3_exame, oe1_exame, oe2_exame,oe3_exame,adiçao_exame,rxod1_exame,rxod2_exame,rxod3_exame,dnp_exame,rxoe1_exame,rxoe2_exame,rxoe3_exame,adiçao2_exame,alt_exame,data_exame,fone_exame from exames inner join clientes2 on cod_exame=cod_cliente order by cod_cliente");

            jTextIDADE.setEnabled(!true);
            jTextEND.setEnabled(!true);
            jTextAVOD.setEnabled(!true);
            jTextAVOE.setEnabled(!true);
            jTextCC1.setEnabled(!true);
            jTextCC2.setEnabled(!true);
            jTextFieldSIM.setEnabled(!true);
            jTextFieldNAO.setEnabled(!true);
            textAreaOBS.setEnabled(!true);
            jTextlezood1.setEnabled(!true);
            jTextlezood2.setEnabled(!true);
            jTextlezood3.setEnabled(!true);
            jTextlezooe1.setEnabled(!true);
            jTextlezooe2.setEnabled(!true);
            jTextlezooe3.setEnabled(!true);
            jTextadiçao.setEnabled(!true);
            jTextrx1.setEnabled(!true);
            jTextrx2.setEnabled(!true);
            jTextrx3.setEnabled(!true);
            jTextFieldDNP.setEnabled(!true);
            jTextrxe1.setEnabled(!true);
            jTextrxe2.setEnabled(!true);
            jTextrxe3.setEnabled(!true);
            jTextadiçao2.setEnabled(!true);
            jTextFieldALT.setEnabled(!true);
            jFormattedTextdata.setEnabled(!true);
            jFormattedTextFONE.setEnabled(!true);

            jButtonsalvar.setEnabled(false);
            jButtonnovo.setEnabled(!false);
            jButtonalterar.setEnabled(false);
            jButtonlimpar.setEnabled(!true);
            jButtonexcluir.setEnabled(false);
            jButtonimprimir.setEnabled(false);

            jTextCOD.setText("");
            jTextIDADE.setText("");
            jTextEND.setText("");
            jTextAVOD.setText("");
            jTextAVOE.setText("");
            jTextCC1.setText("");
            jTextCC2.setText("");
            jTextFieldSIM.setText("");
            jTextFieldNAO.setText("");
            textAreaOBS.setText("");
            jTextlezood1.setText("");
            jTextlezood2.setText("");
            jTextlezood3.setText("");
            jTextlezooe1.setText("");
            jTextlezooe2.setText("");
            jTextlezooe3.setText("");
            jTextadiçao.setText("");
            jTextrx1.setText("");
            jTextrx2.setText("");
            jTextrx3.setText("");
            jTextFieldDNP.setText("");
            jTextrxe1.setText("");
            jTextrxe2.setText("");
            jTextrxe3.setText("");
            jTextadiçao2.setText("");
            jTextFieldALT.setText("");
            jFormattedTextdata.setText("");
            jFormattedTextFONE.setText("");

        }else{
            ex.setNome_cliente_exame((String) jComboBox1.getSelectedItem());
            ex.setIdade(jTextIDADE.getText());
            ex.setEnd(jTextEND.getText());
            ex.setAvod(jTextAVOD.getText());
            ex.setAvoe(jTextAVOE.getText());
            ex.setCc1(jTextCC1.getText());
            ex.setCc2(jTextCC2.getText());
            ex.setDiabetes1(jTextFieldSIM.getText());
            ex.setDiabetes2(jTextFieldNAO.getText());
            ex.setObs(textAreaOBS.getText());
            ex.setLezood1(jTextlezood1.getText());
            ex.setLezood2(jTextlezood2.getText());
            ex.setLezood3(jTextlezood3.getText());
            ex.setOe1(jTextlezooe1.getText());
            ex.setOe2(jTextlezooe2.getText());
            ex.setOe3(jTextlezooe3.getText());
            ex.setAdiçao(jTextadiçao.getText());
            ex.setRxod1(jTextrx1.getText());
            ex.setRxod2(jTextrx2.getText());
            ex.setRxod3(jTextrx3.getText());
            ex.setDnp(jTextFieldDNP.getText());
            ex.setRxoe1(jTextrxe1.getText());
            ex.setRxoe2(jTextrxe2.getText());
            ex.setRxoe3(jTextrxe3.getText());
            ex.setAdiçao2(jTextadiçao2.getText());
            ex.setAlt(jTextFieldALT.getText());
            ex.setData(jFormattedTextdata.getText());
            ex.setFone(jFormattedTextFONE.getText());
            ex.setCod_exame(Integer.parseInt(jTextCOD.getText()));
            dao.Alterar(ex);

            PreencherTabela("select cod_exame,nome_cliente_exame,idade_exame,end_exame,avod_exame,avoe_exame,cc1_exame,cc2_exame,diabetes1_exame,diabetes2_exame,obs_exame,lezood1_exame,lezood2_exame,lezood3_exame, oe1_exame, oe2_exame,oe3_exame,adiçao_exame,rxod1_exame,rxod2_exame,rxod3_exame,dnp_exame,rxoe1_exame,rxoe2_exame,rxoe3_exame,adiçao2_exame,alt_exame,data_exame,fone_exame from exames inner join clientes2 on cod_exame=cod_cliente order by cod_cliente");
            jTextIDADE.setEnabled(!true);
            jTextEND.setEnabled(!true);
            jTextAVOD.setEnabled(!true);
            jTextAVOE.setEnabled(!true);
            jTextCC1.setEnabled(!true);
            jTextCC2.setEnabled(!true);
            jTextFieldSIM.setEnabled(!true);
            jTextFieldNAO.setEnabled(!true);
            textAreaOBS.setEnabled(!true);
            jTextlezood1.setEnabled(!true);
            jTextlezood2.setEnabled(!true);
            jTextlezood3.setEnabled(!true);
            jTextlezooe1.setEnabled(!true);
            jTextlezooe2.setEnabled(!true);
            jTextlezooe3.setEnabled(!true);
            jTextadiçao.setEnabled(!true);
            jTextrx1.setEnabled(!true);
            jTextrx2.setEnabled(!true);
            jTextrx3.setEnabled(!true);
            jTextFieldDNP.setEnabled(!true);
            jTextrxe1.setEnabled(!true);
            jTextrxe2.setEnabled(!true);
            jTextrxe3.setEnabled(!true);
            jTextadiçao2.setEnabled(!true);
            jTextFieldALT.setEnabled(!true);
            jFormattedTextdata.setEnabled(!true);
            jFormattedTextFONE.setEnabled(!true);

            jButtonsalvar.setEnabled(false);
            jButtonnovo.setEnabled(!false);
            jButtonalterar.setEnabled(false);
            jButtonlimpar.setEnabled(!true);
            jButtonexcluir.setEnabled(false);
            jButtonimprimir.setEnabled(false);

            jTextCOD.setText("");
            jTextIDADE.setText("");
            jTextEND.setText("");
            jTextAVOD.setText("");
            jTextAVOE.setText("");
            jTextCC1.setText("");
            jTextCC2.setText("");
            jTextFieldSIM.setText("");
            jTextFieldNAO.setText("");
            textAreaOBS.setText("");
            jTextlezood1.setText("");
            jTextlezood2.setText("");
            jTextlezood3.setText("");
            jTextlezooe1.setText("");
            jTextlezooe2.setText("");
            jTextlezooe3.setText("");
            jTextadiçao.setText("");
            jTextrx1.setText("");
            jTextrx2.setText("");
            jTextrx3.setText("");
            jTextFieldDNP.setText("");
            jTextrxe1.setText("");
            jTextrxe2.setText("");
            jTextrxe3.setText("");
            jTextadiçao2.setText("");
            jTextFieldALT.setText("");
            jFormattedTextdata.setText("");
            jFormattedTextFONE.setText("");

        }

    }//GEN-LAST:event_jButtonsalvarActionPerformed

    private void jTextIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDADEActionPerformed

    private void jTextlezood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlezood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlezood1ActionPerformed

    private void jTextCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCODActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_exame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_exame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonalterar;
    private javax.swing.JButton jButtonexcluir;
    private javax.swing.JButton jButtonimprimir;
    private javax.swing.JButton jButtonlimpar;
    private javax.swing.JButton jButtonnovo;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextFONE;
    private javax.swing.JFormattedTextField jFormattedTextdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableexame;
    private javax.swing.JTextField jTextAVOD;
    private javax.swing.JTextField jTextAVOE;
    private javax.swing.JTextField jTextCC1;
    private javax.swing.JTextField jTextCC2;
    private javax.swing.JTextField jTextCOD;
    private javax.swing.JTextField jTextEND;
    private javax.swing.JTextField jTextFieldALT;
    private javax.swing.JTextField jTextFieldDNP;
    private javax.swing.JTextField jTextFieldNAO;
    private javax.swing.JTextField jTextFieldSIM;
    private javax.swing.JTextField jTextIDADE;
    private javax.swing.JTextField jTextadiçao;
    private javax.swing.JTextField jTextadiçao2;
    private javax.swing.JTextField jTextbuscar;
    private javax.swing.JTextField jTextlezood1;
    private javax.swing.JTextField jTextlezood2;
    private javax.swing.JTextField jTextlezood3;
    private javax.swing.JTextField jTextlezooe1;
    private javax.swing.JTextField jTextlezooe2;
    private javax.swing.JTextField jTextlezooe3;
    private javax.swing.JTextField jTextrx1;
    private javax.swing.JTextField jTextrx2;
    private javax.swing.JTextField jTextrx3;
    private javax.swing.JTextField jTextrxe1;
    private javax.swing.JTextField jTextrxe2;
    private javax.swing.JTextField jTextrxe3;
    private java.awt.TextArea textAreaOBS;
    // End of variables declaration//GEN-END:variables

public List GetDados(){
        List lista = new ArrayList();
        AuxiExame print1 = new AuxiExame();
        print1.setCod_exame(Integer.parseInt(jTextCOD.getText()));
        print1.setNome_cliente_exame(jComboBox1.getSelectedItem().toString());
        print1.setIdade(jTextIDADE.getText());
        print1.setEnd(jTextEND.getText());
        print1.setAvod(jTextAVOD.getText());
        print1.setAvoe(jTextAVOE.getText());
        print1.setCc1(jTextCC1.getText());
        print1.setCc2(jTextCC2.getText());
        print1.setDiabetes1(jTextFieldSIM.getText());
        print1.setDiabetes2(jTextFieldNAO.getText());
        print1.setObs(textAreaOBS.getText());
        print1.setLezood1(jTextlezood1.getText());
        print1.setLezood2(jTextlezood2.getText());
        print1.setLezood3(jTextlezood3.getText());
        print1.setOe1(jTextlezooe1.getText());
        print1.setOe2(jTextlezooe2.getText());
        print1.setOe3(jTextlezooe3.getText());
        print1.setAdiçao(jTextadiçao.getText());
        print1.setRxod1(jTextrx1.getText());
        print1.setRxod2(jTextrx2.getText());
        print1.setRxod3(jTextrx3.getText());
        print1.setDnp(jTextFieldDNP.getText());
        print1.setRxoe1(jTextrxe1.getText());
        print1.setRxoe2(jTextrxe2.getText());
        print1.setRxoe3(jTextrxe3.getText());
        print1.setAdiçao2(jTextadiçao2.getText());
        print1.setAlt(jTextFieldALT.getText());
        print1.setData(jFormattedTextdata.getText());
        print1.setFone(jFormattedTextFONE.getText());
        
        
        
        
        lista.add(print1);
        
        
        return lista; 
    }















}
