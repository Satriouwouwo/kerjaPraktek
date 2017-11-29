/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class NewJFrame extends javax.swing.JFrame {
    String scoreJawabanAsString;
    int total;
    int banyakcoba;
    int nomorAcakAsString;
    int coba;
    public NewJFrame() {
        initComponents();
        angkaLabel.setEnabled(false);
        cekButton.setEnabled(false);
        inputTextField.setEnabled(false);
        cobaLabel.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mulaiButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        angkaLabel = new javax.swing.JLabel();
        inputTextField = new javax.swing.JTextField();
        cekButton = new javax.swing.JButton();
        cobaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\monyet.png")); // NOI18N
        jLabel1.setText("jLabel1");

        mulaiButton.setBackground(new java.awt.Color(0, 255, 102));
        mulaiButton.setText("Mulai");
        mulaiButton.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                mulaiButtonAncestorRemoved(evt);
            }
        });
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        infoLabel.setBackground(new java.awt.Color(0, 255, 112));
        infoLabel.setText("Klik Button Mulai untuk Main");

        angkaLabel.setText("labelRandom");

        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        cekButton.setText("Submit");
        cekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekButtonActionPerformed(evt);
            }
        });

        cobaLabel.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angkaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulaiButton)
                    .addComponent(infoLabel)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekButton)
                    .addComponent(cobaLabel)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mulaiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(angkaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cekButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cobaLabel)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateAngka(){
        double random  = Math.random()*100;
        double ceil = Math.ceil(random);
        total = (int)ceil;
        angkaLabel.setText(""+total);
 
    }
    
    private void cekJawaban(){
        try{
           // nomorAcakAsString = Integer.parseInt(inputTextField.getText());
            if(inputTextField.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "TIDAK BOLEH KOSONG!");
            }
            else if(Integer.parseInt(inputTextField.getText()) == total){
                JOptionPane.showMessageDialog(rootPane,"BENER COY");
                cobaLabel.setText("Anda Sudah mencoba " +coba + " kali");
                inputTextField.setEnabled(false);
                angkaLabel.setEnabled(false);
                cekButton.setEnabled(false);
                mulaiButton.setEnabled(true);
                infoLabel.setEnabled(true);
                inputTextField.setText("");
                scoreJawaban();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Salah!!!");
            }
            
           
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Error !");
        }
    }
    
    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiButtonActionPerformed
        // TODO add your handling code here:
        generateAngka();
        infoLabel.setEnabled(false);
        mulaiButton.setEnabled(false);
        angkaLabel.setEnabled(true);
        inputTextField.setEnabled(true);
        cekButton.setEnabled(true);
        coba = 0;
    }//GEN-LAST:event_mulaiButtonActionPerformed

    private void mulaiButtonAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mulaiButtonAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_mulaiButtonAncestorRemoved

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void cekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekButtonActionPerformed
        // TODO add your handling code here:
        coba++;
        cekJawaban();
       
    }//GEN-LAST:event_cekButtonActionPerformed
    
    private void scoreJawaban(){
        if(coba < 4){
         scoreJawabanAsString = "Jago ! ";
         
        }
        else if (coba > 4 && coba < 10)
        {
            scoreJawabanAsString = "Lumayan !";
        }
        else {
            scoreJawabanAsString = "Buruk !";
        }
        JOptionPane.showMessageDialog(rootPane, scoreJawabanAsString);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angkaLabel;
    private javax.swing.JButton cekButton;
    private javax.swing.JLabel cobaLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mulaiButton;
    // End of variables declaration//GEN-END:variables
}
