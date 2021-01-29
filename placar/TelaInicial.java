package com.mycompany.mapathamiris;

import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEquipeB2 = new javax.swing.JLabel();
        btnMais3_B1 = new javax.swing.JButton();
        lblEquipeB3 = new javax.swing.JLabel();
        btnMais1_B1 = new javax.swing.JButton();
        lblPlacarB = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        impEquipeA = new javax.swing.JTextPane();
        lblEquipeB5 = new javax.swing.JLabel();
        lblPontosA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        impEquipeB = new javax.swing.JTextPane();
        lblEquipeB7 = new javax.swing.JLabel();
        lblPontosB = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnMais3_A = new javax.swing.JButton();
        lblEquipeB = new javax.swing.JLabel();
        btnMais1_A = new javax.swing.JButton();
        lblEquipeA = new javax.swing.JLabel();
        btnMenos1_A = new javax.swing.JButton();
        lblPlacarA = new javax.swing.JLabel();
        btnMenos1_B1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEquipeB2.setText("Placar");

        btnMais3_B1.setText("+3");
        btnMais3_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMais3_B1ActionPerformed(evt);
            }
        });

        lblEquipeB3.setText("Placar");

        btnMais1_B1.setText("+1");
        btnMais1_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMais1_B1ActionPerformed(evt);
            }
        });

        lblPlacarB.setBackground(new java.awt.Color(0, 0, 0));
        lblPlacarB.setText("0");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(impEquipeA);

        lblEquipeB5.setText("Pontos");

        lblPontosA.setText("0");

        jScrollPane2.setViewportView(impEquipeB);

        lblEquipeB7.setText("Pontos");

        lblPontosB.setText("0");

        btnIniciar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnMais3_A.setText("+3");
        btnMais3_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMais3_AActionPerformed(evt);
            }
        });

        lblEquipeB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEquipeB.setText("Nome da Equipe");

        btnMais1_A.setText("+1");
        btnMais1_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMais1_AActionPerformed(evt);
            }
        });

        lblEquipeA.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblEquipeA.setText("Nome da Equipe");

        btnMenos1_A.setText("-1");
        btnMenos1_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenos1_AActionPerformed(evt);
            }
        });

        lblPlacarA.setText("0");

        btnMenos1_B1.setText("-1");
        btnMenos1_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenos1_B1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEquipeB5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPontosA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMais1_A, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMais3_A, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenos1_A, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnReset)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEquipeB2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlacarA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(267, 267, 267)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMais1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipeB7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipeB3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPontosB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMais3_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMenos1_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPlacarB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipeB3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlacarB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipeB7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPontosB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMais1_B1)
                            .addComponent(btnMais3_B1)
                            .addComponent(btnMenos1_B1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipeB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlacarA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEquipeB5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPontosA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenos1_A)
                            .addComponent(btnMais3_A)
                            .addComponent(btnMais1_A)
                            .addComponent(btnReset))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMais3_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMais3_B1ActionPerformed
        if (pontosB <= 12) {
            pontosB = pontosB + 3;
            lblPontosB.setText(Integer.toString(pontosB));

        }
        if (pontosB >= 12) {
            lblPontosB.setText(Integer.toString(pontosB));
            placarB = placarB + 1;
            lblPlacarB.setText(Integer.toString(placarB));
            pontosA = 0;
            pontosB = 0;
            lblPontosB.setText(Integer.toString(pontosB));
            lblPontosA.setText(Integer.toString(pontosA));

        }

        if (placarA == 2 && placarB == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeA + " Venceu");

            pontosB = 0;
            placarB = 0;
            lblPontosB.setText("0");
            lblPlacarB.setText("0");

        }

        if (placarB == 3 || placarB == 2 && placarA == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeB + " Venceu");

            pontosB = 0;
            placarB = 0;
            lblPontosB.setText("0");
            lblPlacarB.setText("0");

        }
    }//GEN-LAST:event_btnMais3_B1ActionPerformed

    private void btnMais1_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMais1_B1ActionPerformed
        if (pontosB <= 12) {
            pontosB = pontosB + 1;
            lblPontosB.setText(Integer.toString(pontosB));

        }

        if (pontosB >= 12) {
            lblPontosB.setText(Integer.toString(pontosB));
            placarB = placarB + 1;
            lblPlacarB.setText(Integer.toString(placarB));
            pontosA = 0;
            pontosB = 0;
            lblPontosB.setText(Integer.toString(pontosB));
            lblPontosA.setText(Integer.toString(pontosA));

        }

        if (placarA == 2 && placarB == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeA + " Venceu");

            pontosB = 0;
            placarB = 0;
            lblPontosB.setText("0");
            lblPlacarB.setText("0");

        }

        if (placarB == 3 || placarB == 2 && placarA == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeB + " Venceu");

            pontosB = 0;
            placarB = 0;
            lblPontosB.setText("0");
            lblPlacarB.setText("0");
        }
    }//GEN-LAST:event_btnMais1_B1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        lblPontosA.setText("0");
        lblPontosB.setText("0");
        lblPlacarA.setText("0");
        lblPlacarB.setText("0");
        impEquipeA.setText(" ");
        impEquipeB.setText(" ");
        pontosA = 0;
        pontosB = 0;
        placarA = 0;
        placarB = 0;
        nomeA = "";
        nomeB = "";
        lblEquipeA.setText("Nome da Equipe");
        lblEquipeB.setText("Nome da Equipe");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        lblEquipeA.setText(impEquipeA.getText());
        nomeA = impEquipeA.getText();
        lblEquipeB.setText(impEquipeB.getText());
        nomeB = impEquipeB.getText();

        placarA = 0;
        placarB = 0;
        pontosA = 0;
        pontosB = 0;

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMais3_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMais3_AActionPerformed
        if (pontosA <= 12) {
            pontosA = pontosA + 3;
            lblPontosA.setText(Integer.toString(pontosA));

        }
        if (pontosA >= 12) {
            lblPontosA.setText(Integer.toString(pontosA));
            placarA = placarA + 1;
            lblPlacarA.setText(Integer.toString(placarA));
            pontosA = 0;
            pontosB = 0;
            lblPontosA.setText(Integer.toString(pontosA));
            lblPontosB.setText(Integer.toString(pontosB));

        }

        if (placarB == 2 && placarA == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeB + " Venceu");
            pontosA = 0;
            placarA = 0;
            lblPontosA.setText("0");
            lblPlacarA.setText("0");

        }

        if (placarA == 3 || placarA == 2 && placarB == 1) {
            JOptionPane.showMessageDialog(null, "A equipe: " + nomeA + " Venceu");
            pontosA = 0;
            placarA = 0;
            lblPontosA.setText("0");
            lblPlacarA.setText("0");

        }

    }//GEN-LAST:event_btnMais3_AActionPerformed

    private void btnMais1_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMais1_AActionPerformed
        if (pontosA <= 12) {
            pontosA = pontosA + 1;
            lblPontosA.setText(Integer.toString(pontosA));

        }
        if (pontosA >= 12) {
            lblPontosA.setText(Integer.toString(pontosA));
            placarA = placarA + 1;
            lblPlacarA.setText(Integer.toString(placarA));
            pontosA = 0;
            pontosB = 0;
            lblPontosA.setText(Integer.toString(pontosA));
            lblPontosB.setText(Integer.toString(pontosB));

        }
        if (placarB == 2 && placarA == 1) {

            JOptionPane.showMessageDialog(null, "A equipe: " + nomeB + " Venceu");
            pontosA = 0;
            placarA = 0;
            lblPontosA.setText("0");
            lblPlacarA.setText("0");

        }

        if (placarA == 3 && placarB == 0 || placarA == 2 && placarB == 1) {
            JOptionPane.showMessageDialog(null, "A equipe: " + nomeA + " Venceu");
            // essas condiçoes logicas agora estao corretas :)
            pontosA = 0;
            placarA = 0;
            lblPontosA.setText("0");
            lblPlacarA.setText("0");
        }
    }//GEN-LAST:event_btnMais1_AActionPerformed

    private void btnMenos1_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenos1_B1ActionPerformed

        if (pontosB > 0) {
            pontosB = pontosB - 1;
            lblPontosB.setText(Integer.toString(pontosB));
        }
        if (pontosB == 0) {
            JOptionPane.showMessageDialog(null, "Valor ja está em zero");

        }

    }//GEN-LAST:event_btnMenos1_B1ActionPerformed

    private void btnMenos1_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenos1_AActionPerformed

        if (pontosA > 0) {
            pontosA = pontosA - 1;
            lblPontosA.setText(Integer.toString(pontosA));
        }
        if (pontosA == 0) {
            JOptionPane.showMessageDialog(null, "Valor ja está em zero");

        }

    }//GEN-LAST:event_btnMenos1_AActionPerformed
    int placarA = 0, placarB = 0, pontosA = 0, pontosB = 0;
    String nomeA = "", nomeB = "";

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMais1_A;
    private javax.swing.JButton btnMais1_B1;
    private javax.swing.JButton btnMais3_A;
    private javax.swing.JButton btnMais3_B1;
    private javax.swing.JButton btnMenos1_A;
    private javax.swing.JButton btnMenos1_B1;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextPane impEquipeA;
    private javax.swing.JTextPane impEquipeB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEquipeA;
    private javax.swing.JLabel lblEquipeB;
    private javax.swing.JLabel lblEquipeB2;
    private javax.swing.JLabel lblEquipeB3;
    private javax.swing.JLabel lblEquipeB5;
    private javax.swing.JLabel lblEquipeB7;
    private javax.swing.JLabel lblPlacarA;
    private javax.swing.JLabel lblPlacarB;
    private javax.swing.JLabel lblPontosA;
    private javax.swing.JLabel lblPontosB;
    // End of variables declaration//GEN-END:variables
}
