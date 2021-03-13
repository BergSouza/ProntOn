/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MedicoController;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.InputMismatchException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author HARDWARE
 */
public class TelaCadastrarMedico extends javax.swing.JFrame {
    
    MedicoController medicoController = new MedicoController();

    /**
     * Creates new form cadastrar_medico
     */
    public TelaCadastrarMedico() throws IOException {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        CampoEndereco = new javax.swing.JTextField();
        CheckMasculino = new javax.swing.JCheckBox();
        CheckFeminino = new javax.swing.JCheckBox();
        CampoSenha = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        CampoIdentity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CampoDep = new javax.swing.JTextField();
        CampoEsp = new javax.swing.JTextField();
        CampoSobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Médico(a)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 476, -1));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Médico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 550, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Nome:*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 183, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPF:*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, -1));

        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        CampoCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoCPFKeyPressed(evt);
            }
        });
        jPanel2.add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 183, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RG:*");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, -1));

        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 183, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Telefone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Endereço:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sexo:*");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 70, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Senha:*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 80, -1));

        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(CampoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 183, 30));

        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(CampoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 183, 30));

        CheckMasculino.setBackground(new java.awt.Color(255, 255, 255));
        CheckMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckMasculino.setForeground(new java.awt.Color(102, 153, 255));
        CheckMasculino.setText("Masculino\n");
        CheckMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMasculinoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 50));

        CheckFeminino.setBackground(new java.awt.Color(255, 255, 255));
        CheckFeminino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckFeminino.setForeground(new java.awt.Color(102, 153, 255));
        CheckFeminino.setText("Feminino\n");
        CheckFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemininoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, 50));

        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 186, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("Identity:*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel2.add(CampoIdentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 180, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Cancelar\n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 130, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 710, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departamento:*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 160, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Especialidade:*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, -1));

        CampoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDepActionPerformed(evt);
            }
        });
        jPanel2.add(CampoDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 183, 30));

        CampoEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEspActionPerformed(evt);
            }
        });
        jPanel2.add(CampoEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 183, 30));
        jPanel2.add(CampoSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 183, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Sobrenome:*");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sexo = "";
        if(CheckMasculino.isSelected()){
            sexo = "M";
        }else if(CheckFeminino.isSelected()){
            sexo = "F";
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um Sexo!");
        }
        medicoController.addMedico(CampoIdentity.getText(), CampoNome.getText(),
                CampoSobrenome.getText(), CampoEndereco.getText(), CampoTelefone.getText(), CampoCPF.getText(),
                CampoSenha.getText(), sexo, CampoRG.getText(), CampoEsp.getText(), CampoDep.getText());  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemininoActionPerformed
        
    }//GEN-LAST:event_CheckFemininoActionPerformed

    private void CheckMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMasculinoActionPerformed
        
    }//GEN-LAST:event_CheckMasculinoActionPerformed

    private void CampoCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCPFKeyPressed
        
    }//GEN-LAST:event_CampoCPFKeyPressed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaActionPerformed

    private void CampoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDepActionPerformed

    private void CampoEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEspActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastrarMedico().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaCadastrarMedico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoDep;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoEsp;
    private javax.swing.JTextField CampoIdentity;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoSobrenome;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
