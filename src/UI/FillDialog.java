/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Helpers.Help;
import Models.AbsorbentModel;
import Models.DirectModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jf_me
 */
public class FillDialog extends javax.swing.JDialog {
    private DirectModel dmod;
    private AbsorbentModel amod;
    private Help h;
    /**
     * Creates new form FillDialog
     */
    public FillDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        h=new Help();
        initComponents();
    }

    public void setDmod(DirectModel dmod) {
        this.dmod = dmod;
    }

    public void setAmod(AbsorbentModel amod) {
        this.amod = amod;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        CVAVbtngrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        submitbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtventas = new javax.swing.JFormattedTextField();
        txtpdeventas = new javax.swing.JFormattedTextField();
        txtIVIn = new javax.swing.JFormattedTextField();
        txtprod = new javax.swing.JFormattedTextField();
        txtCapNorm = new javax.swing.JFormattedTextField();
        txtCVdP = new javax.swing.JFormattedTextField();
        rbtnund = new javax.swing.JRadioButton();
        rbtntot = new javax.swing.JRadioButton();
        txtCVAyMund = new javax.swing.JFormattedTextField();
        txtCVAyMtot = new javax.swing.JFormattedTextField();
        txtCFdP = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCFAyM = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        submitbtn.setText("Enviar");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Ventas (x und)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Precio de Venta (x und)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Inventario Inicial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Producción Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Capacidad Normal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Costo Variable de Producción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Costo Variable de Adm. y Ventas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Costo Fijo de Producción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel8, gridBagConstraints);

        txtventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtventasKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtventas, gridBagConstraints);

        txtpdeventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpdeventasKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtpdeventas, gridBagConstraints);

        txtIVIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIVInKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtIVIn, gridBagConstraints);

        txtprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprodKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtprod, gridBagConstraints);

        txtCapNorm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapNormKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtCapNorm, gridBagConstraints);

        txtCVdP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCVdPKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtCVdP, gridBagConstraints);

        CVAVbtngrp.add(rbtnund);
        rbtnund.setText("x Und");
        rbtnund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnundActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 1, 5);
        jPanel2.add(rbtnund, gridBagConstraints);

        CVAVbtngrp.add(rbtntot);
        rbtntot.setText("x Total");
        rbtntot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtntotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 5, 1, 5);
        jPanel2.add(rbtntot, gridBagConstraints);

        txtCVAyMund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCVAyMundActionPerformed(evt);
            }
        });
        txtCVAyMund.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCVAyMundKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel2.add(txtCVAyMund, gridBagConstraints);

        txtCVAyMtot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCVAyMtotKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel2.add(txtCVAyMtot, gridBagConstraints);

        txtCFdP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCFdPKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtCFdP, gridBagConstraints);

        jLabel11.setText("Costo Fijo de Adm. y Ventas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(jLabel11, gridBagConstraints);

        txtCFAyM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCFAyMKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 11, 5);
        jPanel2.add(txtCFAyM, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(448, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CVAVbtngrp.setSelected(rbtnund.getModel(), true);
        stanceChange();
    }//GEN-LAST:event_formWindowOpened

    private void txtCVAyMundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCVAyMundActionPerformed
        
    }//GEN-LAST:event_txtCVAyMundActionPerformed

    private void rbtnundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnundActionPerformed
        stanceChange();
    }//GEN-LAST:event_rbtnundActionPerformed

    private void rbtntotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtntotActionPerformed
        stanceChange();
    }//GEN-LAST:event_rbtntotActionPerformed

    private void txtventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtventasKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtventasKeyTyped

    private void txtpdeventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpdeventasKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtpdeventasKeyTyped

    private void txtIVInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIVInKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtIVInKeyTyped

    private void txtprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtprodKeyTyped

    private void txtCapNormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapNormKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCapNormKeyTyped

    private void txtCVdPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVdPKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCVdPKeyTyped

    private void txtCVAyMundKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVAyMundKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCVAyMundKeyTyped

    private void txtCVAyMtotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVAyMtotKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCVAyMtotKeyTyped

    private void txtCFdPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCFdPKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCFdPKeyTyped

    private void txtCFAyMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCFAyMKeyTyped
        noLetters(evt);
    }//GEN-LAST:event_txtCFAyMKeyTyped

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        String ventas=txtventas.getText();
        String pdv=txtpdeventas.getText();
        String ivi=txtIVIn.getText();
        String prod=txtprod.getText();
        String cnorm=txtCapNorm.getText();
        String cvp=txtCVdP.getText();
        String cvav=null;boolean cvavflag=false; 
        if(CVAVbtngrp.isSelected(rbtnund.getModel())){
            cvav=txtCVAyMund.getText();
            cvavflag=true;
        }else if(CVAVbtngrp.isSelected(rbtntot.getModel())){
            cvav=txtCVAyMtot.getText();
        }
        String cfp=txtCFdP.getText();
        String cfav=txtCFAyM.getText();
        String args[]={ventas, pdv, ivi, prod, cnorm, cvp,cvav, cfp,cfav};
        if(!Help.noEmpty(args)){
            JOptionPane.showMessageDialog(this, "Error\nNo se han llenado todos los campos", "",JOptionPane.ERROR_MESSAGE);
            return;
        }
        h.parseDataVector(args);
        dmod.updateData(h.direct(cvavflag, dmod.getAccounts().size()));
        amod.updateData(h.asborbent(cvavflag, amod.getAccounts().size()));
        dispose();
    }//GEN-LAST:event_submitbtnActionPerformed
    
    private void noLetters(java.awt.event.KeyEvent evt){
        char key=evt.getKeyChar();
        if(Character.isLetter(key)){
            evt.consume();
        }
    }
    
    private void stanceChange(){
        if(CVAVbtngrp.isSelected(rbtnund.getModel())){
            txtCVAyMund.setEnabled(true);
            txtCVAyMtot.setEnabled(false);
        }else if(CVAVbtngrp.isSelected(rbtntot.getModel())){
            txtCVAyMund.setEnabled(false);
            txtCVAyMtot.setEnabled(true);
        }
    }
    
   
    
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
            java.util.logging.Logger.getLogger(FillDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FillDialog dialog = new FillDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup CVAVbtngrp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtntot;
    private javax.swing.JRadioButton rbtnund;
    private javax.swing.JButton submitbtn;
    private javax.swing.JFormattedTextField txtCFAyM;
    private javax.swing.JFormattedTextField txtCFdP;
    private javax.swing.JFormattedTextField txtCVAyMtot;
    private javax.swing.JFormattedTextField txtCVAyMund;
    private javax.swing.JFormattedTextField txtCVdP;
    private javax.swing.JFormattedTextField txtCapNorm;
    private javax.swing.JFormattedTextField txtIVIn;
    private javax.swing.JFormattedTextField txtpdeventas;
    private javax.swing.JFormattedTextField txtprod;
    private javax.swing.JFormattedTextField txtventas;
    // End of variables declaration//GEN-END:variables
}
