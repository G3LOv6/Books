/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_panels;


import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class LoginPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginPage.class.getName());


int mouseX, mouseY;

    public LoginPage() {
      initComponents();
      
      
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
    animatedPanel.setBounds(0, 0, 550, 700);
    
    // Add the images/labels to animated panel
    JLabel jLabel2 = new JLabel(new ImageIcon(getClass().getResource("/login_panels/search (3) (1).png")));
    animatedPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
    
    JLabel jLabel7 = new JLabel(new ImageIcon(getClass().getResource("/login_panels/dd (2).png")));
    animatedPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));
    
    // Replace jPanel1 with animatedPanel in the frame
    getContentPane().remove(jPanel1);
    getContentPane().add(animatedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 700));
    jPanel1 = animatedPanel;
    
    // Your existing code continues here...
    setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, 1000, 700, 30, 30));
      
      setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, 1000, 700, 30, 30));
   
    // Round the text fields
   jPanel2.add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 290, 40));
jPanel2.add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 40));
    
    // Round the buttons
    btnLogin.setBorder(new RoundedBorder(20, new Color(65, 105, 225)));
    btnRegister.setBorder(new RoundedBorder(20, new Color(65, 105, 225)));
    
    // Make panels rounded 
    jPanel1.setBorder(new RoundedBorder(25, new Color(65, 105, 225)));
    jPanel2.setBorder(new RoundedBorder(25, new Color(245, 245, 245)));
      
    
        setTitle("Login Page");
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
       btnRegister.setBackground(Color.WHITE);
    btnRegister.setForeground(new Color(65, 105, 225));
    btnRegister.setFocusPainted(false);
    btnRegister.setBorder(BorderFactory.createLineBorder(new Color(65, 105, 225), 2));
    btnRegister.setFont(new Font("Segoe UI", Font.BOLD, 14));
    btnRegister.setOpaque(true);
       jButtonForgot.setBorderPainted(false);
    jButtonForgot.setContentAreaFilled(false);
    jButtonForgot.setFocusPainted(false);                      //this is Forgot Password design
    jButtonForgot.setOpaque(false);
    jButtonForgot.setForeground(Color.BLUE);
    jButtonForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    jButtonForgot.setFont(new Font("Segoe UI", Font.PLAIN, 12));

    
    jButtonForgot.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButtonForgot.setText("<html><u>Forget your password?</u></html>");
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButtonForgot.setText("Forget your password?");
        }
    });
      setTitle("Login Page");  
    setPreferredSize(new java.awt.Dimension(1000, 700));
    pack();
    setLocationRelativeTo(null);
    setResizable(true); // allow resizing
  
    }
    public void toggleFullScreen() {
    if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
        setExtendedState(JFrame.MAXIMIZED_BOTH); // enter fullscreen
    } else {
        setExtendedState(JFrame.NORMAL); // exit fullscreen
    }
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtUsername = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        edtPassword = new javax.swing.JPasswordField();
        jButtonForgot = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/bams1 (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gelo\\Downloads\\fullofbook.jpg")); // NOI18N
        jLabel1.setAlignmentX(100.0F);
        jLabel1.setAlignmentY(100.0F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/search (3) (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_panels/dd (2).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 700));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 105, 225));
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, -1));

        edtUsername.setBackground(new java.awt.Color(245, 245, 245));
        edtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        edtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 290, 40));

        btnRegister.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 300, 40));

        btnLogin.setBackground(new java.awt.Color(65, 105, 225));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 300, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

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

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(65, 105, 225));
        jLabel13.setText("Welcome back,");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        edtPassword.setBackground(new java.awt.Color(245, 245, 245));
        edtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 290, 40));

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

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 38)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 105, 225));
        jLabel6.setText("Readers!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 450, 700));

        setSize(new java.awt.Dimension(1000, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:REDACTED
        // TODO add your handling code here:
    }//GEN-LAST:REDACTED

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:REDACTED
RegisterPage registerPage = new RegisterPage();
registerPage.setVisible(true);
registerPage.setLocationRelativeTo(null); // center window
this.dispose(); // close login page        // TODO add your handling code here:
    }//GEN-LAST:REDACTED

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       String email = edtUsername.getText().trim();  
String pss = new String(edtPassword.getPassword());

// VALIDATION 
if (email.isEmpty()) {
    Toast.error(this, "Email is required!");
    return;
}

if (pss.isEmpty()) {
    Toast.warning(this, "Password is required!");
    return;
}

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_users_db", "root", "");

    // LOGIN QUERY using email 
    String query = "SELECT * FROM users WHERE email=? AND password=?";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, email);
    pst.setString(2, pss);

    ResultSet rs = pst.executeQuery();

    if (rs.next()) {
       

        
        HomePage homePage = new HomePage();
            homePage.setVisible(true);
            homePage.setLocationRelativeTo(null);
            dispose(); // Closes the current LoginPage frame
        

    } else {
        Toast.error(this, "Invalid email or password!");
    }

    rs.close();
    pst.close();
    con.close();

} catch (ClassNotFoundException e) {
    JOptionPane.showMessageDialog(this, "MySQL Driver not found", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:REDACTED
        // TODO add your handling code here:
        
        
        FPasswordPage forgotPage = new FPasswordPage();
    forgotPage.setVisible(true);
    forgotPage.setLocationRelativeTo(null); // center on screen

    
    this.dispose();
        
    }//GEN-LAST:REDACTED

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:REDACTED
        // TODO add your handling code here:
    }//GEN-LAST:REDACTED

    public static void main(String args[]) {
       
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
        } catch (ReflectiveOperationException | javax.swing.REDACTED ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonForgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

