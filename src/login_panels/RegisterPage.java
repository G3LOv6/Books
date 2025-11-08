/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_panels;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gelo
 */
public class RegisterPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegisterPage.class.getName());
    private void jButtonBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {                                                
    LoginPage loginPage = new LoginPage();
    loginPage.setVisible(true);
    loginPage.setLocationRelativeTo(null); // center window
    this.dispose(); // close register page
    }
    
int mouseX, mouseY;


    public RegisterPage() {
        this.setUndecorated(true);//minimize, and maximize
        initComponents();
        
        
        
        //DRAGGABLE WINDOW 
jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent evt) {
        mouseX = evt.getX();
        mouseY = evt.getY();
    }
});

jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
    @Override
    public void mouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - mouseX, y - mouseY);
    }
});
        
        
         AnimatedLeftPanel animatedPanel = new AnimatedLeftPanel();
    animatedPanel.setPreferredSize(new java.awt.Dimension(550, 700));
    animatedPanel.setBounds(0, 0, 550, 700);
    
    javax.swing.JLabel jLabel2 = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/login_panels/search (3) (1).png")));
    animatedPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
    
    javax.swing.JLabel jLabel9 = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/login_panels/dd (2).png")));
    animatedPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));
    
    // Properly replace in layout
    getContentPane().removeAll();
    getContentPane().setLayout(new java.awt.BorderLayout());
    getContentPane().add(animatedPanel, java.awt.BorderLayout.WEST);
    getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);
    
    jPanel1 = animatedPanel;
    revalidate();
    repaint();
        
        setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, 1000, 700, 30, 30));
    
    // Round the text fields
    jTextField2.setBorder(BorderFactory.createCompoundBorder(
        new RoundedBorder(15),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)
    ));
    
    passwordField.setBorder(BorderFactory.createCompoundBorder(
        new RoundedBorder(15),
        BorderFactory.createEmptyBorder(5, 10, 5, 10)
    ));
    
    // Round the buttons
    jButton3.setBorder(new RoundedBorder(20, new Color(65, 105, 225)));
    registerButton.setBorder(new RoundedBorder(20, new Color(65, 105, 225)));
    
    // Make panels rounded (optional)
    
    jPanel2.setBorder(new RoundedBorder(25, new Color(245, 245, 245)));
        
         registerButton.setBackground(Color.WHITE);
    loginButton.setForeground(new Color(65, 105, 225));
    loginButton.setFocusPainted(false);
    loginButton.setBorder(BorderFactory.createLineBorder(new Color(65, 105, 225), 2));
    loginButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
    loginButton.setOpaque(true);
       jButtonForgot.setBorderPainted(false);
    loginButton.setContentAreaFilled(false);
    jButtonForgot.setFocusPainted(false);
    jButtonForgot.setOpaque(false);
    jButtonForgot.setForeground(Color.BLUE);
    jButtonForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    jButtonForgot.setFont(new Font("Segoe UI", Font.PLAIN, 12));

    // Optional hover underline
    jButtonForgot.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonForgot.setText("<html><u>Forget your password?</u></html>");
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonForgot.setText("Forget your password?");
        }
    });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jButtonForgot = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sUsername = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        Signupbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        scPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sPassword = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 105, 225));
        jLabel3.setText("Readers!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, -1));

        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 290, 40));

        registerButton.setBackground(new java.awt.Color(204, 204, 204));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 300, 40));

        jButton3.setBackground(new java.awt.Color(65, 105, 225));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 300, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Username");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 0, 50, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(65, 105, 225));
        jLabel13.setText("Welcome back,");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        passwordField.setBorder(null);
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 40));

        jButtonForgot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonForgot.setText("Forget your password?");
        jButtonForgot.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonForgot.setBorderPainted(false);
        jButtonForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 170, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gelo\\Downloads\\fullofbook.jpg")); // NOI18N
        jLabel1.setAlignmentX(100.0F);
        jLabel1.setAlignmentY(100.0F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/search (3) (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/dd (2).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 105, 225));
        jLabel4.setText("SIGN UP");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 240, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Confirm Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 200, -1));

        sUsername.setBackground(new java.awt.Color(245, 245, 245));
        sUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(sUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 290, 40));

        loginButton.setBackground(new java.awt.Color(204, 204, 204));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 290, 40));

        Signupbtn.setBackground(new java.awt.Color(65, 105, 225));
        Signupbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        Signupbtn.setText("Sign Up");
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 290, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Email");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(65, 105, 225));
        jLabel14.setText("Join Us,");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        scPassword.setBackground(new java.awt.Color(245, 245, 245));
        scPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(scPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 290, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(65, 105, 225));
        jLabel7.setText("Readers!");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 330, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Password");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, -1));

        sPassword.setBackground(new java.awt.Color(245, 245, 245));
        sPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(sPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 40));

        jButton6.setBackground(new java.awt.Color(245, 245, 245));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton6.setText("X");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotActionPerformed
     
         FPasswordPage forgotPage = new FPasswordPage();
    forgotPage.setVisible(true);
    forgotPage.setLocationRelativeTo(null);
    this.dispose();
        
    }//GEN-LAST:event_jButtonForgotActionPerformed

    private void sUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sUsernameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        LoginPage loginPage = new LoginPage();
loginPage.setVisible(true);
loginPage.setLocationRelativeTo(null); // center window
this.dispose(); // close register page
    }//GEN-LAST:event_loginButtonActionPerformed

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
       
      String email = sUsername.getText().trim();  
 
String password = new String(sPassword.getPassword());
String cpassword = new String(scPassword.getPassword());

//VALIDATION
if (email.isEmpty()) {
    Toast.error(this, "Email is required!");
    return;
}

if (!email.contains("@") || !email.contains(".")) {
    Toast.warning(this, "Please enter a valid email address!");
    return;
}

if (password.isEmpty()) {
    Toast.warning(this, "Password is required!");
    return;
}

if (cpassword.isEmpty()) {
    Toast.warning(this, "Confirm password is required!");
    return;
}

if (!password.equals(cpassword)) {
    Toast.warning(this, "Passwords do not match!");
    return;
}

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_users_db", "root", "");

    // Check if email already exists
    String checkQuery = "SELECT * FROM users WHERE email=?";
    PreparedStatement checkPst = con.prepareStatement(checkQuery);
    checkPst.setString(1, email);
    ResultSet rs = checkPst.executeQuery();

    if (rs.next()) {
        Toast.warning(this, "Email already exists!");
    } else {
        //Insert new user
        String insertQuery = "INSERT INTO users(email, password) VALUES(?, ?)";
        PreparedStatement pst = con.prepareStatement(insertQuery);
        pst.setString(1, email);
        pst.setString(2, password);

        int result = pst.executeUpdate();

        if (result > 0) {
          

            // Open login page
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
            loginPage.setLocationRelativeTo(null);
            this.dispose();
        }
        pst.close();
    }

    rs.close();
    checkPst.close();
    con.close();

} catch (ClassNotFoundException e) {
    Toast.error(this, "MySQL Driver not found");
} catch (SQLException e) {
    Toast.error(this, "Database Error: " + e.getMessage());
}
        
        
    }//GEN-LAST:event_SignupbtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegisterPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signupbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonForgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JPasswordField sPassword;
    private javax.swing.JTextField sUsername;
    private javax.swing.JPasswordField scPassword;
    // End of variables declaration//GEN-END:variables
}
