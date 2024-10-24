/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Arthur Dias
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Connection conn;
    // Variáveis Banco de dados - PostGreSQL
    private static final String table = "acic_table";
    private static final String database = "acicDATA";
    private static final String URL = "jdbc:postgresql://localhost:5432/"+database;  // URL do banco (Não altere se deixar sistema local)
    private static final String USER = "acicUSER";  // Usuário do banco
    private static final String PASSWORD = "123";
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        // Conexão com banco de dados
        // PostGreSQL Connection
        try {
            // Estabelece a conexão com o banco
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao banco de dados com sucesso!");
            carregarServicos();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar ao banco de dados");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jvdata = new javax.swing.JTextField();
        jvservico = new javax.swing.JTextField();
        jvdescricao = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        CadastrarServico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jvID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBservicos = new rojeru_san.complementos.RSTableMetro();

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(rSTableMetro1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de serviços");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE SERVIÇOS");

        jLabel2.setText("SERVIÇO");

        jLabel3.setText("DESCRIÇÃO");

        jLabel4.setText("DATA");

        jvdata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvdataActionPerformed(evt);
            }
        });

        jvservico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvservicoActionPerformed(evt);
            }
        });

        jvdescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvdescricaoActionPerformed(evt);
            }
        });

        excluir.setText("EXCLUIR");
        excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        atualizar.setText("ATUALIZAR");
        atualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        CadastrarServico.setText("CADASTRAR");
        CadastrarServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarServicoActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        jvID.setEditable(false);
        jvID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jvID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jvID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jvservico, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jvdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jvdata, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CadastrarServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jvservico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jvdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jvdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jvID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarServico)
                    .addComponent(excluir)
                    .addComponent(atualizar))
                .addGap(30, 30, 30))
        );

        TBservicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SERVIÇO", "DESCRIÇÃO", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBservicos.setColorBackgoundHead(new java.awt.Color(0, 0, 0));
        TBservicos.setColorBordeFilas(new java.awt.Color(0, 204, 255));
        TBservicos.setColorBordeHead(new java.awt.Color(255, 255, 255));
        TBservicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBservicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBservicos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jvdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvdataActionPerformed

    private void jvservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvservicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvservicoActionPerformed

    private void jvdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvdescricaoActionPerformed

    private void CadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarServicoActionPerformed
        cadastrarServico(jvservico.getText(),jvdescricao.getText());
        carregarServicos();
    }//GEN-LAST:event_CadastrarServicoActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if(TBservicos.getSelectedRow() != -1)
        {
          int pos = TBservicos.getSelectedRow();
          try
          {
             String idValueSTR = TBservicos.getValueAt(pos,0).toString();
             int idValue = Integer.parseInt(idValueSTR);
             excluirCadastro(idValue);

          }
          catch(Exception e)
          {
              System.out.println("Erro Botão");
          }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um serviço para excluir!");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void jvIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvIDActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        if(TBservicos.getSelectedRow() != -1){
            int pos = TBservicos.getSelectedRow();
            try{
               String idValueSTR = TBservicos.getValueAt(pos,0).toString();
               int idValue = Integer.parseInt(idValueSTR);
               atualizarCadastro(idValue);
            } catch(Exception e) {
                System.out.println("Erro Botão");
                e.printStackTrace();
            }
       }
    }//GEN-LAST:event_atualizarActionPerformed

    private void TBservicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBservicosMouseClicked
       if(TBservicos.getSelectedRow() != -1){
        jvID.setText(TBservicos.getValueAt(TBservicos.getSelectedRow(), 0).toString());
        jvservico.setText(TBservicos.getValueAt(TBservicos.getSelectedRow(), 1).toString());
        jvdescricao.setText(TBservicos.getValueAt(TBservicos.getSelectedRow(), 2).toString());
        jvdata.setText(TBservicos.getValueAt(TBservicos.getSelectedRow(), 3).toString());
         }
    }//GEN-LAST:event_TBservicosMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    
    public Connection getConnection() {
        return conn;
    }
    
    // ADD Database PostGreSQL
    public void cadastrarServico(String servico, String descricao)
    {
        // Ajustar nome das colunas se necessário
        String sql = "INSERT INTO "+table+" (service, descri, data,id_cad) VALUES "
                + "(?, ?, CURRENT_DATE,?)";
        
        // Incremento
        try(PreparedStatement pst = conn.prepareStatement(sql))
        {
           pst.setString(1, servico); // Primeiro "?" é o nome de serviço
           pst.setString(2, descricao); // Segundo "?" é a descrição
           pst.setInt(3, Integer.parseInt(view.iddd)); // Terceiro "?" é a Referência
            
            int rowsAffected = pst.executeUpdate();
            
            if(rowsAffected>0)
            {
                System.out.println("Serviço inserido com sucesso");
            } 
            else
            {
                System.out.println("Erro ai inserir serviço.");
            }
        } 
        catch (SQLException e)
        {
            System.out.println("Erro ao inserir serviço");
            e.printStackTrace();
        }
    }
    
    public void excluirCadastro(int id)
    {
        // Ajustar nome da coluna se necessário
        String sql = "DELETE FROM "+table+" WHERE id = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            // Substitui o placeholder "?" pelo valor do id
            pst.setInt(1, id);
            // Verifica se alteração foi concluida
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Serviço excluído com sucesso!");
            } else {
                System.out.println("Erro ao excluir serviço.");
            }
            
            // Atualizar planilha
            carregarServicos();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao excluir serviço.");
        }
    }
    
    public void atualizarCadastro(int id)
    {
        // Ajustar nome das colunas se necessário
        String sql = "UPDATE "+table+" "
                + "SET service = ?, descri = ?, data = ?"
                + " WHERE id = ?";
        java.sql.Date date;
        
        // UPDATE
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            date = java.sql.Date.valueOf(jvdata.getText());
            // Substitui o placeholder "?" pelo valor do i
            pst.setInt(4, id);
            pst.setString(1, jvservico.getText());  // Atualiza o nome do serviço
            pst.setString(2, jvdescricao.getText()); // Atualiza a descrição
            pst.setDate(3, date);      // Atualiza a data
            
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Serviço atualizar com sucesso!");
                carregarServicos();
            } else {
                System.out.println("Erro ai atualizar serviço.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar serviço.");
            e.printStackTrace();
        }
    }
    
    
    // Atualizar tabela
    public void carregarServicos() {
        // Ajustar nome das colunas se necessário
        String sql = "SELECT id, service, descri, data FROM " + table + " WHERE id_cad="+Integer.valueOf(view.iddd);
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql))
        {
            DefaultTableModel tbprodutos = (DefaultTableModel) TBservicos.getModel();
            tbprodutos.setRowCount(0); // Limpa a tabela antes de adicionar os dados
                
            while (rs.next())
            {
                Object[] dados =
                {
                    rs.getInt("id"),
                    rs.getString("service"),
                    rs.getString("descri"),
                    rs.getDate("data")
                };
                
                tbprodutos.addRow(dados);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Erro ao carregar serviços");
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarServico;
    private rojeru_san.complementos.RSTableMetro TBservicos;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jvID;
    private javax.swing.JTextField jvdata;
    private javax.swing.JTextField jvdescricao;
    private javax.swing.JTextField jvservico;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
