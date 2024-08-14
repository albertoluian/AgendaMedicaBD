/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendamedica;

import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class PosLogin extends javax.swing.JFrame {
    
    
    /**
     * Creates new form PosLogin
     */
    public PosLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        chxAgendar = new javax.swing.JCheckBox();
        chxCancelar = new javax.swing.JCheckBox();
        chxGerar = new javax.swing.JCheckBox();
        chxRealizar = new javax.swing.JCheckBox();
        chxAvaliar = new javax.swing.JCheckBox();
        btnSair = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE LOGIN");
        setMinimumSize(new java.awt.Dimension(622, 432));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("BEM VINDO AO SISTEMA DE AGENDAMENTO MEDICO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 371, 59);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 320, 72, 23);

        buttonGroup1.add(chxAgendar);
        chxAgendar.setText("Agendar Consulta");
        chxAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(chxAgendar);
        chxAgendar.setBounds(380, 190, 144, 20);

        buttonGroup1.add(chxCancelar);
        chxCancelar.setText("Cancelar Consulta");
        chxCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(chxCancelar);
        chxCancelar.setBounds(380, 160, 140, 20);

        buttonGroup1.add(chxGerar);
        chxGerar.setText("Gerar relatorio");
        getContentPane().add(chxGerar);
        chxGerar.setBounds(380, 220, 144, 20);

        buttonGroup1.add(chxRealizar);
        chxRealizar.setText("Realizar Consulta");
        getContentPane().add(chxRealizar);
        chxRealizar.setBounds(380, 190, 144, 20);

        buttonGroup1.add(chxAvaliar);
        chxAvaliar.setText("Avaliar Consulta");
        getContentPane().add(chxAvaliar);
        chxAvaliar.setBounds(380, 250, 144, 20);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(520, 320, 72, 23);
        getContentPane().add(lblName);
        lblName.setBounds(160, 70, 460, 30);

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Inativar Conta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 330, 120, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/blackkk.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 930, 740);

        jMenu1.setText("Editar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Editar usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//         TODO add your handling code here:;
        if(Cadastro.getPaciente() != null){
        EditarPaciente frame = new EditarPaciente(Cadastro.getPaciente());
        frame.setVisible(true);
        this.dispose();
        }
        else{
        EditarMedico frame = new EditarMedico(Cadastro.getMedico());
        frame.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
        chxRealizar.setVisible(false);
        chxAgendar.setVisible(false);
        chxAvaliar.setVisible(false);
        if (Cadastro.getMedico()!=null&&Cadastro.getPaciente()==null){
        try{
            chxRealizar.setVisible(true);
            chxAvaliar.setVisible(false);
            chxAgendar.setVisible(false);
            lblName.setText("O que deseja fazer, " +Cadastro.getMedico().getNome()+"?");
            
        }catch(Exception e){
            e.getMessage();
        }
        }
        if (Cadastro.getPaciente()!=null&&Cadastro.getMedico()==null){
        try{
            chxAgendar.setVisible(true);
            chxAvaliar.setVisible(true);
            chxRealizar.setVisible(false);
            lblName.setText("O que deseja fazer, "+Cadastro.getPaciente().getNome()+"?");
            
        }catch(Exception e){
            e.getMessage();
        }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            if(Cadastro.getMedico()!=null){
            if(chxRealizar.isSelected()==true&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAgendar.isSelected()==false){
                RealizarConsulta frame = new RealizarConsulta();
                frame.setVisible(true);
                this.dispose();
            }
            else if(chxRealizar.isSelected()==false&&chxGerar.isSelected()==true&&chxCancelar.isSelected()==false&&chxAgendar.isSelected()==false){
                GerarRelatorio frame = new GerarRelatorio();
                frame.setVisible(true);
                this.dispose();
            }
            else if(chxRealizar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==true&&chxAgendar.isSelected()==false){
                CancelarConsulta frame = new CancelarConsulta();
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Olá! Você deixou várias opções ativas ou nenhuma ativa.","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            }
        }catch(HeadlessException e){
            e.getMessage();
        }
        
        try{
            if(Cadastro.getPaciente()!=null){
            if(chxAgendar.isSelected()==true&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==false){
                AgendarConsulta frame = new AgendarConsulta();
                frame.setVisible(true);
                this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==true&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==false){
                GerarRelatorio frame = new GerarRelatorio();
                frame.setVisible(true);
                this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==true&&chxAvaliar.isSelected()==false){
                CancelarConsulta frame = new CancelarConsulta();
                frame.setVisible(true);
                this.dispose();
            }
            else if(chxAgendar.isSelected()==false&&chxGerar.isSelected()==false&&chxCancelar.isSelected()==false&&chxAvaliar.isSelected()==true){
                AvaliarConsulta frame = new AvaliarConsulta();
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Olá! Você deixou várias opções ativas ou nenhuma ativa.","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            }
        }catch(HeadlessException e){
            e.getMessage();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Cadastro frame=new Cadastro();
        Cadastro.setMedico(null);
        Cadastro.setPaciente(null);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void chxAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxAgendarActionPerformed

    private void chxCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxCancelarActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chxAgendar;
    private javax.swing.JCheckBox chxAvaliar;
    private javax.swing.JCheckBox chxCancelar;
    private javax.swing.JCheckBox chxGerar;
    private javax.swing.JCheckBox chxRealizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
