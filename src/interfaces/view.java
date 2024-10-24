/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arthur Dias
 */
public class view extends javax.swing.JFrame {
    private Connection conn;
    // Variáveis Banco de dados - PostGreSQL
    public static String iddd;
    public static String idddd;
    private static final String table = "acic_cads";
    private static final String database = "acicDATA";
    private static final String URL = "jdbc:postgresql://localhost:5432/"+database;  // URL do banco (Não altere se deixar sistema local)
    private static final String USER = "acicUSER";  // Usuário do banco
    private static final String PASSWORD = "123";

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        try {
            // Estabelece a conexão com o banco
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao banco de dados com sucesso!");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jPanel2 = new javax.swing.JPanel();
        Saida = new javax.swing.JLabel();
        CPesqueceusenha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cadastro = new rojerusan.RSMaterialButtonCircle();
        Login = new rojerusan.RSMaterialButtonCircle();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jLabel12 = new javax.swing.JLabel();
        CPlogin = new javax.swing.JTextField();
        CPsenha = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        olho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("DESENVOLVIMENTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 102));
        jLabel5.setText("ACIC");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagens/9204943-design-de-moderno-de-conta-de-phishing-ilustracao-plana-vetor.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 890, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 870));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saida.setBackground(new java.awt.Color(255, 255, 255));
        Saida.setFont(new java.awt.Font("Arial Black", 0, 35)); // NOI18N
        Saida.setForeground(new java.awt.Color(255, 255, 255));
        Saida.setText("x");
        Saida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaidaMouseClicked(evt);
            }
        });
        jPanel2.add(Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 70, -1));

        CPesqueceusenha.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CPesqueceusenha.setForeground(new java.awt.Color(255, 255, 255));
        CPesqueceusenha.setText("esqueceu a senha?");
        CPesqueceusenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CPesqueceusenha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CPesqueceusenhaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CPesqueceusenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CPesqueceusenhaMouseClicked(evt);
            }
        });
        jPanel2.add(CPesqueceusenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 160, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bem Vindo !");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("senha");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        jLabel9.setDoubleBuffered(true);
        jLabel9.setFocusCycleRoot(true);
        jLabel9.setFocusTraversalPolicyProvider(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 50, 50));

        Cadastro.setBackground(new java.awt.Color(204, 255, 153));
        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });
        jPanel2.add(Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 320, 60));

        Login.setBackground(new java.awt.Color(102, 255, 153));
        Login.setText("login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel2.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 320, 60));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Account_50px.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Secure_50px (1).png"))); // NOI18N
        jLabel12.setDoubleBuffered(true);
        jLabel12.setFocusCycleRoot(true);
        jLabel12.setFocusTraversalPolicyProvider(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, 50));

        CPlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPloginActionPerformed(evt);
            }
        });
        CPlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CPloginKeyPressed(evt);
            }
        });
        jPanel2.add(CPlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, 30));

        CPsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPsenhaActionPerformed(evt);
            }
        });
        CPsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CPsenhaKeyPressed(evt);
            }
        });
        jPanel2.add(CPsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 210, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("usuario");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 80, -1));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Invisible_2.png"))); // NOI18N
        disable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel2.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 30, 40));

        olho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Eye_1.png"))); // NOI18N
        olho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olhoMouseClicked(evt);
            }
        });
        jPanel2.add(olho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 30, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 550, 880));

        setSize(new java.awt.Dimension(1507, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaidaMouseClicked
       System.exit(0);
    }//GEN-LAST:event_SaidaMouseClicked

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        System.out.println("Cadastro");
        //new IntCADASTRO().setVisible(true);         
    }//GEN-LAST:event_CadastroActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        System.out.println("Login");
        if(checarLogin(CPlogin.getText().toString(), CPsenha.getText().toString()))
        {
            new tela_interativa().setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void CPesqueceusenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPesqueceusenhaMouseClicked
         //new ResetSenha().setVisible(true);
         System.out.println("Esqueci");
    }//GEN-LAST:event_CPesqueceusenhaMouseClicked

    private void CPesqueceusenhaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CPesqueceusenhaAncestorAdded
        
    }//GEN-LAST:event_CPesqueceusenhaAncestorAdded

    private void CPloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPloginActionPerformed
      
      
    }//GEN-LAST:event_CPloginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i+0.1){
        String val = i+ "";
        float f = Float.valueOf(val);
        this.setOpacity(f);
        try{
        Thread.sleep(50);
        }catch(Exception e ){
                }
        }
    }//GEN-LAST:event_formWindowOpened

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
     CPsenha.setEchoChar((char)0);
     disable1.setVisible(false);
     disable1.setEnabled(false);
     olho.setEnabled(true);
     olho.setEnabled(true);
        
    }//GEN-LAST:event_disable1MouseClicked

    private void olhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhoMouseClicked
    CPsenha.setEchoChar((char)8226);
     disable1.setVisible(true);
     disable1.setEnabled(true);
     olho.setEnabled(false);
     olho.setEnabled(false);
        
    }//GEN-LAST:event_olhoMouseClicked

    private void CPsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPsenhaActionPerformed

    private void CPloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPloginKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           CPsenha.requestFocus();
       
       }
    }//GEN-LAST:event_CPloginKeyPressed

    private void CPsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPsenhaKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           Login.requestFocus();
       
       }
        
    }//GEN-LAST:event_CPsenhaKeyPressed

    public boolean checarLogin(String usuario, String senha) {
        // Inicializa uma variável boolean para controlar o status do login
        boolean check = false;

        // Define a consulta SQL para selecionar o id, senha e usuário da tabela
        String sql = "SELECT id, senha, usuar FROM " + table;

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            // Executa a consulta e itera sobre os resultados
            while (rs.next()) {
                // Verifica se o usuário encontrado na base de dados corresponde ao usuário informado
                if (rs.getString("usuar").equals(usuario)) {
                    System.out.println("Existe esse usuário");

                    // Verifica se a senha informada corresponde à senha armazenada
                    if (rs.getString("senha").equals(senha)) {
                        System.out.println("Login Efetuado com sucesso");
                        check = true; // Marca que o login foi bem-sucedido
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo");
                        iddd = rs.getString("id");
                        return true;
                    } else {
                        // Caso a senha não corresponda, exibe mensagem de erro
                        JOptionPane.showMessageDialog(null, "usuario negado !");
                        check = true; // Marca que o usuário foi encontrado, mas a senha está incorreta
                    }
                }
            }

            // Se nenhum usuário foi encontrado ou o login não foi bem-sucedido
            if (!check) {
                JOptionPane.showMessageDialog(null, "usuario não encontrado");
            }
        } catch (SQLException e) {
            // Tratamento de exceções para falhas na consulta ao banco de dados
            System.out.println("Erro ao carregar serviços");
            e.printStackTrace(); // Exibe a stack trace do erro
        }
        return false;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPesqueceusenha;
    private javax.swing.JTextField CPlogin;
    private javax.swing.JPasswordField CPsenha;
    private rojerusan.RSMaterialButtonCircle Cadastro;
    private rojerusan.RSMaterialButtonCircle Login;
    private javax.swing.JLabel Saida;
    private javax.swing.JLabel disable1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel olho;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    // End of variables declaration//GEN-END:variables

    private void initcomponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
