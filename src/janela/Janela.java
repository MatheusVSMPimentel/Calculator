/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;
import Painel.*;
import javax.xml.transform.Result;

/**
 *
 * @author mathe
 */
public class Janela extends javax.swing.JFrame {
    
    private static double resultado = 0; 
    private static double numero1 = 0; 
    private static double numero2 = 0;
    private static int operacao;
    private static String leitor = "";
    
    
    /**
     * Creates new form Janela
     */
    public Janela() {
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

        jButton1 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        result = new javax.swing.JTextField();
        calc = new javax.swing.JToggleButton();
        n1 = new javax.swing.JToggleButton();
        n2 = new javax.swing.JToggleButton();
        n3 = new javax.swing.JToggleButton();
        subtracao = new javax.swing.JToggleButton();
        soma = new javax.swing.JToggleButton();
        divisao = new javax.swing.JToggleButton();
        multiplicar = new javax.swing.JToggleButton();
        n6 = new javax.swing.JToggleButton();
        n4 = new javax.swing.JToggleButton();
        n5 = new javax.swing.JToggleButton();
        n8 = new javax.swing.JToggleButton();
        n9 = new javax.swing.JToggleButton();
        n7 = new javax.swing.JToggleButton();
        n0 = new javax.swing.JToggleButton();
        C = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jInternalFrame1.setBackground(new java.awt.Color(0, 0, 0));
        jInternalFrame1.setVisible(true);

        result.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        result.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                resultInputMethodTextChanged(evt);
            }
        });
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        calc.setBackground(new java.awt.Color(204, 255, 153));
        calc.setText("=");
        calc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calc.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                calcComponentShown(evt);
            }
        });
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(204, 255, 153));
        n1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n1.setLabel("1");
        n1.setName(""); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(204, 255, 153));
        n2.setText("2");
        n2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n2.setName(""); // NOI18N
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(204, 255, 153));
        n3.setText("3");
        n3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n3.setName(""); // NOI18N
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(204, 255, 153));
        subtracao.setText("-");
        subtracao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subtracao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subtracao.setName(""); // NOI18N
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        soma.setBackground(new java.awt.Color(204, 255, 153));
        soma.setText("+");
        soma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        soma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        soma.setName(""); // NOI18N
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        divisao.setBackground(new java.awt.Color(204, 255, 153));
        divisao.setText("/");
        divisao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divisao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divisao.setName(""); // NOI18N
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        multiplicar.setBackground(new java.awt.Color(204, 255, 153));
        multiplicar.setText("X");
        multiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiplicar.setName(""); // NOI18N
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        n6.setBackground(new java.awt.Color(204, 255, 153));
        n6.setText("6");
        n6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n6.setName(""); // NOI18N
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n4.setBackground(new java.awt.Color(204, 255, 153));
        n4.setText("4");
        n4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n4.setName(""); // NOI18N
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setBackground(new java.awt.Color(204, 255, 153));
        n5.setText("5");
        n5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n5.setName(""); // NOI18N
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n8.setBackground(new java.awt.Color(204, 255, 153));
        n8.setText("8");
        n8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n8.setName(""); // NOI18N
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setBackground(new java.awt.Color(204, 255, 153));
        n9.setText("9");
        n9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n9.setName(""); // NOI18N
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n7.setBackground(new java.awt.Color(204, 255, 153));
        n7.setText("7");
        n7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n7.setName(""); // NOI18N
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n0.setBackground(new java.awt.Color(204, 255, 153));
        n0.setText("0");
        n0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        n0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n0.setName(""); // NOI18N
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(204, 255, 153));
        C.setText("C");
        C.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        n1.getAccessibleContext().setAccessibleName("n1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"8");
        leitor = result.getText();
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"9");
        leitor = result.getText();
    }//GEN-LAST:event_n9ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"7");
        leitor = result.getText();
    }//GEN-LAST:event_n7ActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"0");
        leitor = result.getText();
    }//GEN-LAST:event_n0ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"2");
        leitor = result.getText();
        
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
       result.setText(leitor);
       result.setText(leitor+"3");
       leitor = result.getText();
       
    }//GEN-LAST:event_n3ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_resultActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        // TODO add your handling code here:
        Calculadora calculadora = new Calculadora();
        numero2 = Double.valueOf(result.getText());
        if(resultado!= 0){
            calculadora.funcoes(numero2, resultado, operacao);
            result.setText(""+calculadora.getResultado());
            resultado = Double.valueOf(result.getText());
            leitor = "";
        }
            else{
        calculadora.funcoes(numero1, numero2, operacao);}
        result.setText(""+calculadora.getResultado());
        resultado = Double.valueOf(result.getText());
        leitor = "";
        
    }//GEN-LAST:event_calcActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        // TODO add your handling code here:
                operacao = 1;
                if (numero1 != 0){
                    numero2 = Double.valueOf(result.getText());}
                numero1 = Double.valueOf(result.getText());
                result.setText(" ");
                leitor = "";
    }//GEN-LAST:event_somaActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        // TODO add your handling code here:
                operacao = 2;
                if (numero1 != 0){
                    numero2 = Double.valueOf(result.getText());}
                numero1 = Double.valueOf(result.getText());
                result.setText(" ");
                leitor = "";
    }//GEN-LAST:event_subtracaoActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
                operacao = 4;
                if (numero1 != 0){
                    numero2 = Double.valueOf(result.getText());}
                numero1 = Double.valueOf(result.getText());
                result.setText(" ");
                leitor = "";
    }//GEN-LAST:event_multiplicarActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
        // TODO add your handling code here:
                operacao = 3;
                if (numero1 != 0){
                    numero2 = Double.valueOf(result.getText());}
                numero1 = Double.parseDouble(result.getText());
                result.setText(" ");
                leitor = "";
    }//GEN-LAST:event_divisaoActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"1");
        leitor = result.getText();
    }//GEN-LAST:event_n1ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"4");
        leitor = result.getText();
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"5");
        leitor = result.getText();
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
        result.setText(leitor);
        result.setText(leitor+"6");
        leitor = result.getText();
    }//GEN-LAST:event_n6ActionPerformed

    private void calcComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_calcComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_calcComponentShown

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        result.setText("");
        resultado = 0;
        numero1 = 0;
        numero2 = 0;
        operacao = 0;
        leitor = "";
    }//GEN-LAST:event_CActionPerformed

    private void resultInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_resultInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_resultInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JToggleButton calc;
    private javax.swing.JToggleButton divisao;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JToggleButton multiplicar;
    private javax.swing.JToggleButton n0;
    private javax.swing.JToggleButton n1;
    private javax.swing.JToggleButton n2;
    private javax.swing.JToggleButton n3;
    private javax.swing.JToggleButton n4;
    private javax.swing.JToggleButton n5;
    private javax.swing.JToggleButton n6;
    private javax.swing.JToggleButton n7;
    private javax.swing.JToggleButton n8;
    private javax.swing.JToggleButton n9;
    private javax.swing.JTextField result;
    private javax.swing.JToggleButton soma;
    private javax.swing.JToggleButton subtracao;
    // End of variables declaration//GEN-END:variables

}