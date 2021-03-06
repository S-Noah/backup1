/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package none.twitterapp;

import java.io.IOException;

/**
 *
 * @author Noahb
 */
public class ChangeAuthorization extends javax.swing.JFrame {
    APIAuthorization current_auth;
    /**
     * Creates new form ChangeAuthorization
     * @param auth
     */
    public ChangeAuthorization(APIAuthorization auth) {
        current_auth = auth;
        
        initComponents();
        refreshUI();
        
        btnChange.setEnabled(allFieldsFilled());
    }
    private void refreshUI(){
        jtfAPI_KEY.setText(current_auth.get_api_key());
        jtfAPI_SECRET.setText(current_auth.get_api_secret());
        jtfBEARER_TOKEN.setText(current_auth.get_bearer_token());
        jtfACCESS_TOKEN.setText(current_auth.get_access_token());
        jtfACCESS_SECRET.setText(current_auth.get_access_secret());
    }
    private boolean allFieldsFilled(){
        return (!jtfAPI_KEY.getText().equals("") && !jtfAPI_SECRET.getText().equals("") && !jtfBEARER_TOKEN.getText().equals("") && !jtfACCESS_TOKEN.getText().equals("") && !jtfACCESS_SECRET.getText().equals(""));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JToggleButton();
        btnChange = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfAPI_KEY = new javax.swing.JTextField();
        jtfACCESS_SECRET = new javax.swing.JTextField();
        jtfACCESS_TOKEN = new javax.swing.JTextField();
        jtfAPI_SECRET = new javax.swing.JTextField();
        jtfBEARER_TOKEN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setForeground(java.awt.Color.blue);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        jLabel1.setText("API_KEY");

        jLabel2.setText("API_SECRET");

        jLabel3.setText("BEARER_TOKEN");

        jLabel4.setText("ACCESS_TOKEN");

        jLabel5.setText("ACCESS_SECRET");

        jtfAPI_KEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAPI_KEYActionPerformed(evt);
            }
        });
        jtfAPI_KEY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAPI_KEYKeyTyped(evt);
            }
        });

        jtfACCESS_SECRET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfACCESS_SECRETActionPerformed(evt);
            }
        });
        jtfACCESS_SECRET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfACCESS_SECRETKeyTyped(evt);
            }
        });

        jtfACCESS_TOKEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfACCESS_TOKENActionPerformed(evt);
            }
        });
        jtfACCESS_TOKEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfACCESS_TOKENKeyTyped(evt);
            }
        });

        jtfAPI_SECRET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAPI_SECRETActionPerformed(evt);
            }
        });
        jtfAPI_SECRET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAPI_SECRETKeyTyped(evt);
            }
        });

        jtfBEARER_TOKEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBEARER_TOKENActionPerformed(evt);
            }
        });
        jtfBEARER_TOKEN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBEARER_TOKENKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfBEARER_TOKEN)
                    .addComponent(jtfAPI_SECRET)
                    .addComponent(jtfAPI_KEY)
                    .addComponent(jtfACCESS_TOKEN)
                    .addComponent(jtfACCESS_SECRET))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 851, Short.MAX_VALUE)
                .addComponent(btnChange)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfAPI_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAPI_SECRET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfBEARER_TOKEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfACCESS_TOKEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfACCESS_SECRET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnChange))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAPI_KEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAPI_KEYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAPI_KEYActionPerformed

    private void jtfAPI_SECRETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAPI_SECRETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAPI_SECRETActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if(allFieldsFilled()){
            current_auth.set_api_key(jtfAPI_KEY.getText());
            current_auth.set_api_secret(jtfAPI_SECRET.getText());
            current_auth.set_bearer_token(jtfBEARER_TOKEN.getText());
            current_auth.set_access_token(jtfACCESS_TOKEN.getText());
            current_auth.set_access_secret(jtfACCESS_SECRET.getText());
            try{
                current_auth.serialize_out("Auth_1.dat");
            }
            catch(IOException e){
                current_auth.dump();
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void jtfAPI_KEYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAPI_KEYKeyTyped
        btnChange.setEnabled(allFieldsFilled());
    }//GEN-LAST:event_jtfAPI_KEYKeyTyped

    private void jtfAPI_SECRETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAPI_SECRETKeyTyped
        btnChange.setEnabled(allFieldsFilled());
    }//GEN-LAST:event_jtfAPI_SECRETKeyTyped

    private void jtfBEARER_TOKENKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBEARER_TOKENKeyTyped
        btnChange.setEnabled(allFieldsFilled());
    }//GEN-LAST:event_jtfBEARER_TOKENKeyTyped

    private void jtfACCESS_TOKENKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfACCESS_TOKENKeyTyped
        btnChange.setEnabled(allFieldsFilled());
    }//GEN-LAST:event_jtfACCESS_TOKENKeyTyped

    private void jtfACCESS_SECRETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfACCESS_SECRETKeyTyped
        btnChange.setEnabled(allFieldsFilled());
    }//GEN-LAST:event_jtfACCESS_SECRETKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jtfACCESS_TOKENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfACCESS_TOKENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfACCESS_TOKENActionPerformed

    private void jtfBEARER_TOKENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBEARER_TOKENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBEARER_TOKENActionPerformed

    private void jtfACCESS_SECRETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfACCESS_SECRETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfACCESS_SECRETActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jtfACCESS_SECRET;
    private javax.swing.JTextField jtfACCESS_TOKEN;
    private javax.swing.JTextField jtfAPI_KEY;
    private javax.swing.JTextField jtfAPI_SECRET;
    private javax.swing.JTextField jtfBEARER_TOKEN;
    // End of variables declaration//GEN-END:variables
}
