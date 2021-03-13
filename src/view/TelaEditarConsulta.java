/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Paciente.Paciente;
import controller.MedicoController;
import controller.PacienteController;
import funcionarios.Medico;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @auth
 * r HARDWARE
 */
public class TelaEditarConsulta extends javax.swing.JFrame {
    PacienteController pacienteController = new PacienteController();
    MedicoController medicoController = new MedicoController();

    /**
     * Creates new form cadastrar_medico
     */
    public TelaEditarConsulta() throws Exception {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        DefaultTableModel modeloPaciente = (DefaultTableModel) TabelaPac.getModel();
        DefaultTableModel modeloMedico = (DefaultTableModel) TabelaMed.getModel();
        gerarTabelaPac();
        gerarTabelaMed();
    }
    public void gerarTabelaMed(){
         DefaultTableModel modeloMedico = (DefaultTableModel) TabelaMed.getModel();
         modeloMedico.setNumRows(0);
         
         for(Medico med : medicoController.gerarTabela()){
             modeloMedico.addRow(new Object[]{
                med.getIdentity(),
                med.getNome(),
                med.getCpf(),
                med.getRG(),
                med.getTelefone()
            });
         }
     }
    
    public void gerarTabelaPac(){
        DefaultTableModel modeloPaciente = (DefaultTableModel) TabelaPac.getModel();
        modeloPaciente.setNumRows(0);
        for(Paciente pac : pacienteController.gerarTabela()){
            modeloPaciente.addRow(new Object[]{
                pac.getIdentity(),
                pac.getNome(),
                pac.getCpf(),
                pac.getRG(),
                pac.getTelefone()
            });
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox5 = new javax.swing.JComboBox<>();
        campoidd = new javax.swing.JTextField();
        idmedico = new javax.swing.JTextField();
        campof = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        criterioPesquisa1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        SelectMinuto = new javax.swing.JComboBox<>();
        SelectCDia = new javax.swing.JComboBox<>();
        SelectCMes = new javax.swing.JComboBox<>();
        SelectCAno = new javax.swing.JComboBox<>();
        SelectHora = new javax.swing.JComboBox<>();
        txtDC = new javax.swing.JLabel();
        txtDH = new javax.swing.JLabel();
        ScrollTab = new javax.swing.JScrollPane();
        TabelaMed = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoProntuario = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ScrollTab1 = new javax.swing.JScrollPane();
        TabelaPac = new javax.swing.JTable();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(102, 153, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        campof.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Consulta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 476, -1));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Consulta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 50));
        jPanel1.add(CampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 160, 30));

        btnPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaazul.png"))); // NOI18N
        btnPesquisa.setName(""); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 30, 30));

        criterioPesquisa1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa1.setForeground(new java.awt.Color(102, 153, 255));
        criterioPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF", "RG", "Telefone" }));
        criterioPesquisa1.setSelectedIndex(1);
        criterioPesquisa1.setBorder(null);
        criterioPesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        criterioPesquisa1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        criterioPesquisa1.setLightWeightPopupEnabled(false);
        criterioPesquisa1.setOpaque(false);
        jPanel1.add(criterioPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data da Consulta:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horário:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 100, 30));

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
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 130, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 710, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 60, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("/");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("/");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 60, 40));

        SelectMinuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectMinuto.setForeground(new java.awt.Color(102, 153, 255));
        SelectMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(SelectMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 50, 30));

        SelectCDia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCDia.setForeground(new java.awt.Color(102, 153, 255));
        SelectCDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(SelectCDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 50, 30));

        SelectCMes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCMes.setForeground(new java.awt.Color(102, 153, 255));
        SelectCMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12" }));
        SelectCMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCMesActionPerformed(evt);
            }
        });
        jPanel2.add(SelectCMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, 30));

        SelectCAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCAno.setForeground(new java.awt.Color(102, 153, 255));
        SelectCAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));
        jPanel2.add(SelectCAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 70, 30));

        SelectHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectHora.setForeground(new java.awt.Color(102, 153, 255));
        SelectHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(SelectHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 50, 30));

        txtDC.setText("Data Cadastrada:");
        jPanel2.add(txtDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        txtDH.setText("Horário Cadastrado:");
        jPanel2.add(txtDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        TabelaMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaMed.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        ScrollTab.setViewportView(TabelaMed);

        jPanel2.add(ScrollTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 590, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Médico");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        campoProntuario.setEditable(false);
        campoProntuario.setColumns(20);
        campoProntuario.setRows(5);
        jScrollPane1.setViewportView(campoProntuario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 510, 150));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Prontuário:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 153, 255));
        jLabel18.setText("Paciente");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        TabelaPac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPac.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        ScrollTab1.setViewportView(TabelaPac);

        jPanel2.add(ScrollTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 590, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SelectCMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectCMesActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        
    }//GEN-LAST:event_btnPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaEditarConsulta().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaEditarConsulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JScrollPane ScrollTab;
    private javax.swing.JScrollPane ScrollTab1;
    private javax.swing.JComboBox<String> SelectCAno;
    private javax.swing.JComboBox<String> SelectCDia;
    private javax.swing.JComboBox<String> SelectCMes;
    private javax.swing.JComboBox<String> SelectHora;
    private javax.swing.JComboBox<String> SelectMinuto;
    private javax.swing.JTable TabelaMed;
    private javax.swing.JTable TabelaPac;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JTextArea campoProntuario;
    private javax.swing.JTextField campof;
    private javax.swing.JTextField campoidd;
    private javax.swing.JComboBox<String> criterioPesquisa1;
    private javax.swing.JTextField idmedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtDC;
    private javax.swing.JLabel txtDH;
    // End of variables declaration//GEN-END:variables
}
