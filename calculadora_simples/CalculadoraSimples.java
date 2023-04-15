package Projetos.calculadora_simples;

import javax.swing.JOptionPane;

public class CalculadoraSimples extends javax.swing.JDialog {
     public CalculadoraSimples(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
          initComponents();
     }

     @SuppressWarnings("unchecked")
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jButtonSair = new javax.swing.JButton();
          jButtonLimpar = new javax.swing.JButton();
          jButtonCalcular = new javax.swing.JButton();
          jTextFieldNumeroUm = new javax.swing.JTextField();
          jTextFieldOperador = new javax.swing.JTextField();
          jTextFieldNumeroDois = new javax.swing.JTextField();
          jLabelResultado = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(204, 204, 204));
          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora Simples", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 0, 12)), "Calculadora Simples", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Helvetica", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
          jPanel1.setForeground(new java.awt.Color(204, 255, 255));
          jPanel1.setToolTipText("");

          jLabel1.setBackground(new java.awt.Color(0, 0, 0));
          jLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(0, 0, 0));
          jLabel1.setText("Número 1:");

          jLabel2.setBackground(new java.awt.Color(0, 0, 0));
          jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(0, 0, 0));
          jLabel2.setText("Número 2:");

          jLabel3.setBackground(new java.awt.Color(0, 0, 0));
          jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(0, 0, 0));
          jLabel3.setText("Operador:");

          jButtonSair.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
          jButtonSair.setText("Sair");
          jButtonSair.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonSairActionPerformed(evt);
               }
          });

          jButtonLimpar.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
          jButtonLimpar.setText("Limpar");
          jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonLimparActionPerformed(evt);
               }
          });

          jButtonCalcular.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
          jButtonCalcular.setText("Calcular");
          jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonCalcularActionPerformed(evt);
               }
          });

          jTextFieldNumeroUm.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
          jTextFieldNumeroUm.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldNumeroUmActionPerformed(evt);
               }
          });

          jTextFieldOperador.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
          jTextFieldOperador.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextFieldOperadorActionPerformed(evt);
               }
          });

          jTextFieldNumeroDois.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N

          jLabelResultado.setFont(new java.awt.Font("Helvetica", 1, 32)); // NOI18N
          jLabelResultado.setForeground(new java.awt.Color(0, 153, 102));

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonCalcular)
                                        .addGap(54, 54, 54)
                                        .addComponent(jButtonLimpar)
                                        .addGap(65, 65, 65)
                                        .addComponent(jButtonSair)))
                              .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(34, 34, 34)
                              .addComponent(jTextFieldNumeroUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                              .addContainerGap()
                              .addComponent(jLabel1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(jLabel2)
                         .addComponent(jTextFieldNumeroDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(jTextFieldOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
          jTextFieldNumeroUm.setText("");
          jTextFieldNumeroDois.setText("");
          jLabelResultado.setText("");
     }//GEN-LAST:event_jButtonLimparActionPerformed

     private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
          int numeroUm, numeroDois;
          String operador;
          
          numeroUm = Integer.parseInt(jTextFieldNumeroUm.getText());
          numeroDois = Integer.parseInt(jTextFieldNumeroDois.getText());
          operador = jTextFieldOperador.getText();
          
                   
          if(operador.equals("+")) {
               int resultado = numeroUm + numeroDois;
               jLabelResultado.setText("Resultado: " + resultado + "!");
          } else if(operador.equals("-")) {
               if(numeroUm > numeroDois) {
                    int resultado = numeroUm - numeroDois;
                    jLabelResultado.setText("O resultado é: " + resultado + "!");
               } else {
                    int resultado = numeroDois - numeroUm;
                    jLabelResultado.setText("O resultado é: " + resultado + "!");
               }
          } else if(operador.equals("*")) {
               int resultado = numeroUm * numeroDois;
               jLabelResultado.setText("O resultado é: " + resultado + "!");
          } else if(operador.equals("/")) {               
               if(numeroUm == 0 || numeroDois == 0) {
                    jLabelResultado.setText("Divisão por 0!");
                    JOptionPane.showMessageDialog(this, "" + "Divisão por 0!");
               } else {
                    int resultado = numeroUm / numeroDois;
                    jLabelResultado.setText("O resultado é: " + resultado + "!");
               }
          } else {
               jLabelResultado.setText("Operador inválido!!");
          }
     }//GEN-LAST:event_jButtonCalcularActionPerformed

     private void jTextFieldNumeroUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroUmActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jTextFieldNumeroUmActionPerformed

     private void jTextFieldOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperadorActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jTextFieldOperadorActionPerformed

     private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
          System.exit(0);
     }//GEN-LAST:event_jButtonSairActionPerformed

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
               java.util.logging.Logger.getLogger(CalculadoraSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(CalculadoraSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(CalculadoraSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(CalculadoraSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the dialog */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    CalculadoraSimples dialog = new CalculadoraSimples(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                         @Override
                         public void windowClosing(java.awt.event.WindowEvent e) {
                              System.exit(0);
                         }
                    });
                    dialog.setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButtonCalcular;
     private javax.swing.JButton jButtonLimpar;
     private javax.swing.JButton jButtonSair;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabelResultado;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JTextField jTextFieldNumeroDois;
     private javax.swing.JTextField jTextFieldNumeroUm;
     private javax.swing.JTextField jTextFieldOperador;
     // End of variables declaration//GEN-END:variables
}
