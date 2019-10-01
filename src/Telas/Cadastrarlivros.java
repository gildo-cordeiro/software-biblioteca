package Telas;


import BD.Cadastro;
import BD.Consulta;
import Classes.autor;
import Classes.livro;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus Estevam
 */
public class Cadastrarlivros extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarTelaLivro
     */
    public Cadastrarlivros() {
        initComponents();
        editora();
        genero();
        autor();
    }
    int idEditora,idGenero,idAutor;
    private void editora(){
        Consulta c = new  Consulta(); 
        jComboBox1.addItem("Selecione uma Editora");
        for (livro atr: c.ConsultarEditora()) {
            jComboBox1.addItem(atr.getEditora());
        }
    }
    
     private void genero(){
        Consulta d = new  Consulta(); 
        jComboBox2.addItem("Selecione um Genero");
        for (livro at: d.ConsultarGenero()) {
            jComboBox2.addItem(at.getGenero());
        }
    }
     private void autor(){
        Consulta d = new  Consulta(); 
        jComboBox3.addItem("Selecione um autor");
        for (autor at: d.ConsultarAutorNome()) {
            jComboBox3.addItem(at.getNome());
        }
    }
    private void SelecionarEditora(){
        if (jComboBox1.getSelectedIndex()==0) {
            idEditora = 0;
            //JOptionPane.showMessageDialog(null, "Selcione o CPF e Nome de um cliente.","Advertência",JOptionPane.WARNING_MESSAGE);
        } else {
            String b = (String) jComboBox1.getSelectedItem();
            Consulta c = new Consulta();
            for (livro ob : c.idEditora(b)) {
                idEditora = ob.getIdEditora();
                //JOptionPane.showMessageDialog(null, idEditora);
            }
        }
    }
    private void SelecionarGenero(){
        if (jComboBox2.getSelectedIndex()==0) {
            idGenero = 0;
            //JOptionPane.showMessageDialog(null, "Selcione o CPF e Nome de um cliente.","Advertência",JOptionPane.WARNING_MESSAGE);
        } else {
            String b = (String) jComboBox2.getSelectedItem();
            Consulta c = new Consulta();
            for (livro ob : c.idGenero(b)) {
                idGenero = ob.getIdGenero();
                //JOptionPane.showMessageDialog(null, idGenero);
            }
        }
    } 
    private void SelecionarAutor(){
        if (jComboBox3.getSelectedIndex()==0) {
            idAutor = 0;
            //JOptionPane.showMessageDialog(null, "Selcione o CPF e Nome de um cliente.","Advertência",JOptionPane.WARNING_MESSAGE);
        } else {
            String b = (String) jComboBox3.getSelectedItem();
            Consulta c = new Consulta();
            for (autor ob : c.idAutor(b)) {
                idAutor = ob.getId();
                //JOptionPane.showMessageDialog(null, idGenero);
            }
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

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(38, 105, 145));

        jLabel2.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastrar Livros");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 710, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 105, 145)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 36));

        jLabel6.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel6.setText("ISBN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 44));

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel1.setText("Nome do Livro:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 211, 44));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 415, 36));

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel4.setText("Editora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, 118, 32));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 415, 38));

        jButton1.setBackground(new java.awt.Color(0, 16, 78));
        jButton1.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar Livro");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 530, 40));

        jLabel5.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel5.setText("Autor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 118, 32));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sinal-mais.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 30, 40));

        jLabel8.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Selecione o autor");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 130, 32));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 180, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sinal-mais.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 30, 40));

        jLabel3.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OU");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 70, 30));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 150, 40));

        jLabel11.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jLabel11.setText("Genero");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 118, 32));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exclamacao.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 40, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 710, 380));

        jPanel6.setBackground(new java.awt.Color(38, 105, 145));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Harrington", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastrar Livros - Control Book");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 400, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 80));

        jButton2.setBackground(new java.awt.Color(0, 16, 78));
        jButton2.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Recarregar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField2.getText().equals("") || jTextField1.getText().equals("") || 
                (jTextField4.getText().equals("") && idAutor == 0) || idEditora == 0 || idGenero == 0) {
            JOptionPane.showMessageDialog(null, "Existem campos vazios ou você deixou de selcionar o genero e/ou editora do livro");
        }else{
            Cadastro c = new Cadastro();
            Consulta con = new Consulta();
            if (c.CadastrarLivro(jTextField2.getText(), jTextField1.getText(), idEditora)) {
                c.CadastrarLivroGenero(jTextField2.getText(), idGenero);
                
                if (!jTextField4.getText().equals("")) {
                   if (c.CadastrarAutor(jTextField4.getText())) {
                        for (autor at :con.ConsultarAutor()) {
                            c.CadastrarAutorLivro(at.getId(),jTextField2.getText());
                        }   
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao inserir autor", null, JOptionPane.WARNING_MESSAGE);
                    } 
                }else if(idAutor!= 0){
                    c.CadastrarAutorLivro(idAutor,jTextField2.getText());
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao inserir autor", null, JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar livro", null, JOptionPane.WARNING_MESSAGE);
            }
        }
          /*if (jTextField1.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preecncha todos os campos");
        }else{
            String nome = jTextField1.getText();
            String editora = jTextField3.getText();
            String genero = jTextField4.getText();
            
            Cadastro gen = new Cadastro();
            if (gen.CadastrarGenero(genero)){
                Consulta con = new Consulta();
                con.ConsultarGenero(genero);
                Cadastro livros = new Cadastro();
                livros.CadastrarLivros(nome, editora);
            }
            
            jTextField1.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
          String[] array = jTextField4.getText().split(",");
            for (String string : array) {
                JOptionPane.showMessageDialog(null, string);
            }
        }
            */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       new editora().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new genero().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        SelecionarEditora();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new AdicionarGenero().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setToolTipText("Adicionar generos a livros do acervo");
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        SelecionarGenero();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
         jLabel9.setToolTipText("Adicionar mais generos ao acervo");
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setToolTipText("Adicionar novas editoras");
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        editora();
        genero();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setToolTipText("Utilize este botão após adicionar novos generos e/ou editoras.");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        SelecionarAutor();
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrarlivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrarlivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrarlivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrarlivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrarlivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}