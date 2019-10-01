package Telas;

import BD.Atualizar;
import BD.Consulta;
import BD.Cadastro;
import BD.Deletar;
import Classes.Table;
import Classes.aluno;
import Classes.livro;
import Classes.autor;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastrar extends javax.swing.JFrame {

    DefaultTableModel Modelo;
    public Cadastrar() {
        initComponents();
        Modelo = (DefaultTableModel) jTable1.getModel();
        Table t = new Table();
        t.ModificarTable(jTable1);
    }
    Date data = new Date();
    String mat = Consulta.log;
    int id;
    public void consultar(){
        Modelo.setNumRows(0);  
        Consulta con = new Consulta();
        for (autor al : con.ConsultarLivroEmprestado(jTextField4.getText())) {   
            Modelo.addRow(new Object[]{al.getId(),al.getISBN(),al.getTituloLivro(),al.getDevolucao().substring(0,10)});
        }
        con.FecharConexao();
    }
    private void limpar(){
        jTextField1.setText("");jPasswordField1.setText("");jTextField3.setText("");
        jLabel25.setText("");jLabel26.setText("");
        jLabel27.setText("");jLabel28.setText("");
        jLabel29.setText("");jLabel31.setText("");
        jLabel32.setText("");
        jTextField3.setEnabled(true);jButton2.setEnabled(true);
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(38, 105, 145));

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empréstimos e Devoluções");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 511, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 105, 145)));
        jPanel2.setForeground(new java.awt.Color(38, 105, 145));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 105, 145));
        jLabel4.setText("Matricula");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, 25));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 187, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 105, 145));
        jLabel5.setText("Senha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 13, -1, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 105, 145));
        jLabel6.setText("Nome:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 95, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 105, 145));
        jLabel7.setText("Turma:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 95, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Usuário Liberado  para Empréstimos Em:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 163, -1, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(38, 105, 145));
        jLabel9.setText("Punição:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 165, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(38, 105, 145));
        jLabel10.setText("Material:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 105, 145));
        jLabel12.setText("ISBN:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 253, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 105, 145));
        jLabel13.setText("Data prevista para Devolução:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 249, 23));

        jButton2.setText("Confimar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jToggleButton1.setText("Limpar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(38, 105, 145));
        jLabel11.setText("Autor:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 253, 90, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 123, 230, 29));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 123, 178, 29));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 198, 137, 30));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 198, 105, 30));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 288, 170, 31));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 400, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 286, 96, 33));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 191, 33));

        jButton7.setText("Ok");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 283, 60, 31));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 247, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 10));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 500, 480));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 105, 145)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(38, 105, 145));
        jLabel16.setText("Matricula:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 32));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Punição (Dias)");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jButton8.setText("OK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, 30));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 30));

        jButton4.setText("Devolver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 399, 478, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(38, 105, 145));
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 344, -1, -1));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 280, 30));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 290, 10));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Livro", "Data da devolução"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 660, 170));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15", "30", "45", "60" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 70, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 750, 380));

        jPanel5.setBackground(new java.awt.Color(38, 105, 145));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empréstimos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(141, 141, 141))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 500, -1));

        jPanel6.setBackground(new java.awt.Color(38, 105, 145));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Devoluções");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel3)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 750, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 23, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("") || jPasswordField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos de Matricula e senha estão vazios");
        }else{
            Consulta con = new Consulta();
            for (aluno al : con.ConsultarAluno(jTextField1.getText(), jPasswordField1.getText())) {
                if (al.getQuant_livros()>=3) {
                    jTextField3.setEnabled(false);
                    jButton2.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Este aluno ja possui mais livros emprestados que o numero maximo permitido");                   
                }else{
                    if (!al.getPunicao().equals("")) {
                        try {
                            data.setDate(data.getDate());
                            DateFormat df = new SimpleDateFormat("yyyyMMdd");

                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            Date datab = formato.parse(al.getPunicao());

                            String a = df.format(data);
                            String b = df.format(datab);

                            //JOptionPane.showMessageDialog(null, a);
                            //JOptionPane.showMessageDialog(null, b);

                            try {
                                Date dateA = df.parse(a);
                                Date dateB = df.parse(b);
                                if (dateA.after(dateB)) {
                                    jLabel27.setText("");
                                    jLabel28.setText(0+"");
                                    
                                    String dataFormatada = "";
                                    int punicao = 0;

                                    Atualizar att = new Atualizar();
                                    att.AtualizaPunicao(dataFormatada, punicao, jTextField1.getText());
                                    //JOptionPane.showMessageDialog(null, "after");
                                }else if(dateA.before(dateB)){
                                    jLabel27.setText(al.getPunicao());
                                    jLabel28.setText(al.getQuant_punicao()+" Dias");
                                    //JOptionPane.showMessageDialog(null, "before");
                                }else{
                                    jLabel27.setText(al.getPunicao());
                                    jLabel28.setText(al.getQuant_punicao()+" Dias");
                                    //JOptionPane.showMessageDialog(null, "Este aluno ja possui mais livros emprestados que o numero maximo permitido");
                                }
                            } catch (ParseException ex) {
                               JOptionPane.showMessageDialog(null, "Erro ao verificar data - Erro 1");
                            }
                            jLabel25.setText(al.getNome());
                            jLabel26.setText(al.getTurma());
                        } catch (ParseException ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao verificar data - Erro 2");
                        }
                    }else{
                        jLabel25.setText(al.getNome());
                        jLabel26.setText(al.getTurma());
                    }
                    
                }
            }
            if (!jLabel27.getText().equals("")) {
                
                jTextField3.setEnabled(false);
                jButton2.setEnabled(false);
            }else{
                jTextField3.setEnabled(true);
                jLabel28.setText("");
                jButton2.setEnabled(true);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campos de identificação do livro esta vazio");
        }else{
            Consulta con = new Consulta();
            for (autor al : con.ConsultarLivroAutor(jTextField3.getText())) {
                jLabel29.setText(al.getNome());
                jLabel31.setText(al.getTituloLivro());
                
                
                Date dat = new Date();
                dat.setDate(dat.getDate()+15);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                jLabel32.setText(format.format(dat));
                dat.setDate(dat.getDate()-15);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().equals("") || jLabel32.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informações insufientes para enfetuar o emprestimo. \nPor favor, verifque as informações.");
        }else{
            data.setDate(data.getDate());
            Date dat = new Date();
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formatar.format(dat);
            
            
            Cadastro c = new Cadastro();
            c.CadastrarEmprestimo(jLabel32.getText(), dataFormatada,jTextField1.getText(),mat);
            //JOptionPane.showMessageDialog(null,jLabel32.getText()+"-"+dataFormatada+"-"+mat+"-"+jTextField1.getText());

            Consulta con = new Consulta();
            for (livro at : con.EmprestimoID(dataFormatada)) {
               c.CadastrarEmprestimoLivros(jTextField3.getText(), at.getId());
               //JOptionPane.showMessageDialog(null, jTextField3.getText()+"-"+at.getId());
            }
            limpar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Deletar del = new Deletar();
        Atualizar att = new Atualizar();
        try {
            int LinSelect = jTable1.getSelectedRow();
            if (LinSelect == -1) {
                JOptionPane.showMessageDialog(null, "Selecione o livro que será devolvido", "Advertência", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Devolver",JOptionPane.YES_NO_OPTION);
                if (resp==JOptionPane.YES_OPTION) {
                    int ident = (int) jTable1.getValueAt(LinSelect, 0);
                    del.DeleteProduto(ident);
                    consultar();
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel completar a devolução, verifique!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campos de identificação do livro esta vazio");
        }else{
            consultar();
        }   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if (jTextField4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo de Matricula esta vazio. Impossivel aplicar punição..","Advertência",JOptionPane.WARNING_MESSAGE);
        } else {
            int punicao = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            data.setDate(data.getDate()+punicao);
            
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formatar.format(data);
            
            Atualizar att = new Atualizar();
            att.AtualizaPunicao(dataFormatada,punicao, jTextField4.getText());
            
            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Modelo.setNumRows(0);  
         jTextField4.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
