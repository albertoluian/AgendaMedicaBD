/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agendamedica;


import javax.swing.JOptionPane;
import model.dao.MedicoDAO;
import model.dao.PacienteDAO;

/**
 *
 * @author super
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    
    private static Medico medicoLogin = null;
    private static Paciente pacienteLogin = null;
    
    public static void setMedico(Medico medico){
        Cadastro.medicoLogin = medico;
    }
    
    public static void setPaciente(Paciente paciente){
        Cadastro.pacienteLogin = paciente;
    }
    
    public static Medico getMedico(){
        return Cadastro.medicoLogin;
    }
    
    public static Paciente getPaciente(){
        return Cadastro.pacienteLogin;
    }
    
    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        bntLogin = new javax.swing.JButton();
        senhaTxt = new javax.swing.JPasswordField();
        bntCadastrar = new javax.swing.JButton();
        jLabelCRM = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chxMedico = new javax.swing.JCheckBox();
        chxPaciente = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMinimumSize(new java.awt.Dimension(780, 780));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("BEM-VINDO AO SISTEMA DE AGENDAMENTO MEDICO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 430, 70);
        getContentPane().add(nomeTxt);
        nomeTxt.setBounds(290, 110, 211, 30);

        bntLogin.setText("LOGIN");
        bntLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bntLogin);
        bntLogin.setBounds(540, 120, 72, 23);

        senhaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(senhaTxt);
        senhaTxt.setBounds(290, 160, 210, 30);

        bntCadastrar.setForeground(new java.awt.Color(0, 153, 255));
        bntCadastrar.setText("Cadastrar-se");
        bntCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntCadastrar.setBorderPainted(false);
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntCadastrar);
        bntCadastrar.setBounds(390, 700, 130, 18);

        jLabelCRM.setText("CRM:");
        getContentPane().add(jLabelCRM);
        jLabelCRM.setBounds(140, 120, 30, 16);

        jLabelCPF.setText("CPF:");
        getContentPane().add(jLabelCPF);
        jLabelCPF.setBounds(150, 120, 40, 16);

        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 170, 60, 16);

        jLabel4.setText("Voce esta logando como:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 70, 170, 16);

        buttonGroup1.add(chxMedico);
        chxMedico.setText("Medico");
        chxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(chxMedico);
        chxMedico.setBounds(290, 70, 85, 20);

        buttonGroup1.add(chxPaciente);
        chxPaciente.setSelected(true);
        chxPaciente.setText("Paciente");
        chxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(chxPaciente);
        chxPaciente.setBounds(410, 70, 85, 20);

        jLabel6.setText("Ainda não possui conta?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 700, 240, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/cadastro_inicial(1).png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(662, 666));
        jLabel5.setMinimumSize(new java.awt.Dimension(662, 666));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-40, -80, 840, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        
        CadastrarPessoa frame = new CadastrarPessoa();
        frame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void bntLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLoginActionPerformed
        
        try{
        PacienteDAO daop = new PacienteDAO();
        MedicoDAO daom = new MedicoDAO();
        //Caso login medico
        if(chxMedico.isSelected()){
            String crm = nomeTxt.getText().toUpperCase();
            @SuppressWarnings("deprecation")
            String senha = senhaTxt.getText();
            if(daom.checkLogin(crm, senha) == true){
                Medico medico = daom.returnLogin(crm, senha);
                Cadastro.setMedico(medico);
                PosLogin frame = new PosLogin();
                frame.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Inválido ou inativo, Cadastre-se ou cheque se o nome e senha estao corretos.","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        //Caso login paciente
        else if(chxPaciente.isSelected()){
            String cpf = nomeTxt.getText().toUpperCase();
            @SuppressWarnings("deprecation")
            String senha = senhaTxt.getText();
            if(daop.checkLogin(cpf, senha) == true){
                    Paciente paciente = daop.returnkLogin(cpf, senha);
                    Cadastro.setPaciente(paciente);
                    PosLogin frame = new PosLogin();
                    frame.setVisible(true);
                    this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Inválido ou inativo, Cadastre-se ou cheque se o nome e senha estao corretos.","ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Caso erro
        else{
            JOptionPane.showMessageDialog(null, "Olá, o Login nao deu certo! Voce deixou ambas opções ativas ou inativas.","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        }catch (Exception ex) {
            //Logger.getLogger(CadastrarPessoa.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_bntLoginActionPerformed

    private void senhaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTxtActionPerformed
        
    }//GEN-LAST:event_senhaTxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jLabelCRM.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void chxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxPacienteActionPerformed
        
        if(chxPaciente.isSelected()){
            jLabelCPF.setVisible(true);
            jLabelCRM.setVisible(false);
        }else{
            jLabelCPF.setVisible(false);
        }
    }//GEN-LAST:event_chxPacienteActionPerformed

    private void chxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxMedicoActionPerformed
        
        if(chxMedico.isSelected()){
            jLabelCRM.setVisible(true);
            jLabelCPF.setVisible(false);
        }else{
            jLabelCRM.setVisible(false);
        }
    }//GEN-LAST:event_chxMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton bntLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chxMedico;
    private javax.swing.JCheckBox chxPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JPasswordField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
