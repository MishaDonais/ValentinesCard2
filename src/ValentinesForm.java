/*
 * This program was made by Misha Donais
 * On January 15th 2019
 * To display valentines day messages
 */

/**
 *
 * @author midon7419
 */
public class ValentinesForm extends javax.swing.JFrame {
    //Global variable
    boolean loop = true;
    
    public ValentinesForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valentineslbl2 = new javax.swing.JLabel();
        valentineslbl3 = new javax.swing.JLabel();
        valentineslbl4 = new javax.swing.JLabel();
        valentineslbl1 = new javax.swing.JLabel();
        messagebtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        valentineslbl2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N

        valentineslbl3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N

        valentineslbl4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N

        valentineslbl1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N

        messagebtn1.setText("Press for a message");
        messagebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valentineslbl1)
                    .addComponent(valentineslbl2)
                    .addComponent(valentineslbl4)
                    .addComponent(valentineslbl3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(messagebtn1)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(valentineslbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valentineslbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valentineslbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valentineslbl4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 164, Short.MAX_VALUE)
                .addComponent(messagebtn1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messagebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagebtn1ActionPerformed
        //Set loop to true again so that a new message can be chosen
        loop = true;
        while (loop == true){
            //picks a random number between 1 and 5
            int i = (int) (Math.random() * 5 + 1);
            //If i is 1, display message 1
            if (i == 1){
                valentineslbl1.setText("Roses are red");
                valentineslbl2.setText("Violets are blue");
                valentineslbl3.setText("I love Vilmos");
                valentineslbl4.setText("And you should too");
                loop = false;
            }
            //If i is 2, display message 2
            if (i == 2){
                valentineslbl1.setText("Roses are red");
                valentineslbl2.setText("Violets are blue");
                valentineslbl3.setText("Nick is a cutie");
                valentineslbl4.setText("But I love you too");
                loop = false;
            }
            //If i is 3, display message 3
            if (i == 3){
                valentineslbl1.setText("Roses are red");
                valentineslbl2.setText("Violets are blue");
                valentineslbl3.setText("Poetry is hard");
                valentineslbl4.setText("I need a fourth line");
                loop = false;
            }
            //If i is 4, display message 4
            if (i == 4){
                valentineslbl1.setText("Roses are red");
                valentineslbl2.setText("Violets are blue");
                valentineslbl3.setText("It isn't valentines day anymore");
                valentineslbl4.setText("Why am I still making this");
                loop = false;
            }
            //If i is 5, display message 5
            if (i == 5){
                valentineslbl1.setText("The point of this");
                valentineslbl2.setText("Isn't to make messages");
                valentineslbl3.setText("It's supposed to demonstrate my");
                valentineslbl4.setText("programming skill");
                loop = false;
            }
        }
    }//GEN-LAST:event_messagebtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(ValentinesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValentinesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValentinesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValentinesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValentinesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton messagebtn1;
    private javax.swing.JLabel valentineslbl1;
    private javax.swing.JLabel valentineslbl2;
    private javax.swing.JLabel valentineslbl3;
    private javax.swing.JLabel valentineslbl4;
    // End of variables declaration//GEN-END:variables
}
