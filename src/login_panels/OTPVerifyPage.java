
package login_panels;
import javax.swing.JOptionPane;

/**
 *
 * @author Gelo
 */
public class OTPVerifyPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(OTPVerifyPage.class.getName());
private String email;

    public OTPVerifyPage(String email) {
        initComponents();
         this.email = email;
    }

     // No-argument constructor (for testing/GUI editor)
    public OTPVerifyPage() {
        this.setUndecorated(true);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnVerify = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        edtOTP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Resend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 105, 225));
        jLabel3.setText("Verify Account");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 390, -1));

        btnVerify.setBackground(new java.awt.Color(65, 105, 225));
        btnVerify.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(255, 255, 255));
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 300, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 100, -1));

        jButton2.setBackground(new java.awt.Color(245, 245, 245));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 30));

        edtOTP.setBackground(new java.awt.Color(245, 245, 245));
        edtOTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtOTP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        edtOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtOTPActionPerformed(evt);
            }
        });
        jPanel2.add(edtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Enter OTP");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 100, -1));

        Resend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Resend.setText("Resend");
        Resend.setBorder(new javax.swing.border.MatteBorder(null));
        Resend.setBorderPainted(false);
        Resend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResendActionPerformed(evt);
            }
        });
        jPanel2.add(Resend, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/OTP (1) (1)REDACTED (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:REDACTED
       
                                             
        String enteredOtp = edtOTP.getText().trim();
        
        if (enteredOtp.isEmpty()) {
            Toast.error(this, "Please enter the OTP.");
            return;
        }
        
        Integer storedOtp = OTPManager.getOTP(email);
        
        if (storedOtp == null) {
            Toast.warning(this, "OTP expired! Please request a new one.");
            return;
        }
        
        if (enteredOtp.equals(String.valueOf(storedOtp))) {
           Toast.success(this, "OTP verified successfully!");
            OTPManager.removeOTP(email);
            
            // Open new password page
            NewPassword newPassPage = new NewPassword(email);
            newPassPage.setVisible(true);
            newPassPage.setLocationRelativeTo(null);
            this.dispose();
        } else {
            Toast.warning(this, "Invalid OTP! Please try again.");
        }
      
  
        
        
        
        
    }//GEN-LAST:REDACTED

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edtOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtOTPActionPerformed

    private void ResendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResendActionPerformed
         try {
        // Generate new OTP
        int otp = (int)(Math.random() * 900000) + 100000;
        OTPManager.storeOTP(email, otp);
        
        // Resend email
        EmailSender.sendEmail(email, "Password Reset OTP",
            "Your new OTP code is: " + otp + "\n\nThis code will expire in 10 minutes.");
        
        JOptionPane.showMessageDialog(this, "New OTP sent to your email!");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Failed to resend OTP: " + e.getMessage());
    }
    }//GEN-LAST:event_ResendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.REDACTED ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new OTPVerifyPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resend;
    private javax.swing.JButton btnVerify;
    private javax.swing.JTextField edtOTP;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

