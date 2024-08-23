/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendamedica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.TelefoneDAO;

/**
 *
 * @author super
 */
public class GerenciarTelefone extends javax.swing.JFrame {

    /**
     * Creates new form GerarRelatorio
     */
    public GerenciarTelefone() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTelefones = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERAR RELATORIO");
        setMaximumSize(new java.awt.Dimension(960, 693));
        setMinimumSize(new java.awt.Dimension(960, 693));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Gerenciador de Telefones");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 0, 350, 47);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 600, 72, 23);

        jtTelefones = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jtTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefone", "id_telefone"
            }
        ));
        jtTelefones.getTableHeader().setResizingAllowed(false);
        jtTelefones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTelefones);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 65, 688, 520);

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 600, 72, 23);

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 600, 72, 23);

        jButton5.setText("Criar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 600, 72, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackkk.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 1000, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        PosLogin frame = new PosLogin();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int row = jtTelefones.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
        else{
        DefaultTableModel dtmConsultas = (DefaultTableModel) jtTelefones.getModel();
        int id_telefone = (Integer) dtmConsultas.getValueAt(row,1);
        TelefoneDAO daot = new TelefoneDAO();
        daot.delete(id_telefone);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        if (Cadastro.getMedico() == null && Cadastro.getPaciente() != null) {
            Paciente paciente = Cadastro.getPaciente();
            TelefoneDAO daot = new TelefoneDAO();
            int id_paciente = paciente.getId();
            ArrayList<Telefone> telefones = daot.read(id_paciente);

            if (!telefones.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) jtTelefones.getModel(); // Obtendo o modelo da tabela

                for (Telefone telefone : telefones) {
                    Object[] dados = {telefone.getTelefone(), telefone.getId_telefone()};
                    model.addRow(dados); // Adicionando a linha ao modelo da tabela
                }

                paciente.resetConsultas();
            } else {
                JOptionPane.showMessageDialog(null, "Você não possui telefones");
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        TelefoneDAO daot = new TelefoneDAO();
        Paciente pacienteCriado = Cadastro.getPaciente();
        String telefone = JOptionPane.showInputDialog("Cadastre um telefone");
                    String[] vetortelefone = telefone.split("(?!^)");

                    if (vetortelefone.length == 11) {
                        Telefone t = new Telefone(telefone, pacienteCriado.getId());
                        daot.create(t);
                    } else {
                        JOptionPane.showMessageDialog(null, "Olá, telefone inválido formato: 00123456789");
                    }
                    while (true) {
                        telefone = JOptionPane.showInputDialog("Se quiser, cadestre outro telefone (Aperte Ok caso nao queira registrar mais telefones)");

                        if (telefone == null || telefone.isEmpty()) {
                            // Se o telefone for null (usuário clicou em "Cancelar") ou vazio (usuário clicou em "Ok" sem digitar nada)
                            break;
                        }

                        vetortelefone = telefone.split("(?!^)");

                        if (vetortelefone.length == 11) {
                            Telefone t = new Telefone(telefone, pacienteCriado.getId());
                            daot.create(t);
                        } else {
                            JOptionPane.showMessageDialog(null, "Olá, telefone inválido formato: 00123456789");
                        }
                    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int row = jtTelefones.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
        else{
        TelefoneDAO daot = new TelefoneDAO();
        DefaultTableModel dtmConsultas = (DefaultTableModel) jtTelefones.getModel();
        int id_telefone = (Integer) dtmConsultas.getValueAt(row,1);
        String telefone = JOptionPane.showInputDialog("Insira o novo telefone");
        String[] vetortelefone = telefone.split("(?!^)");
        if (vetortelefone.length == 11) {
            daot.update(id_telefone, telefone);
            }else {
               JOptionPane.showMessageDialog(null, "Olá, telefone inválido formato: 00123456789");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTelefones;
    // End of variables declaration//GEN-END:variables
}
