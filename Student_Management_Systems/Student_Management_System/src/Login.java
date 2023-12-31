 

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setTitle("Student Management System");
        star.setVisible(false);
        star_1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Cancel1 = new javax.swing.JButton();
        star = new javax.swing.JLabel();
        star_1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        setLocation(new java.awt.Point(400, 150));
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 58, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Form");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("UserName");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, -1));

        jTextField1_Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 125, -1));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 125, -1));

        jButton_Login.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(0, 51, 153));
        jButton_Login.setText("LogIn");
        jButton_Login.setBorder(null);
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 30));

        jButton_Cancel1.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Cancel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_Cancel1.setForeground(new java.awt.Color(0, 51, 153));
        jButton_Cancel1.setText("Cancel");
        jButton_Cancel1.setBorder(null);
        jButton_Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, 30));

        star.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        star.setForeground(new java.awt.Color(255, 0, 51));
        star.setText("*");
        jPanel2.add(star, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 10, -1));

        star_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        star_1.setForeground(new java.awt.Color(255, 0, 51));
        star_1.setText("*");
        jPanel2.add(star_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 11, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_UsernameActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        star.setVisible(false);
        star_1.setVisible(false);
        if(jTextField1_Username.getText().equals(""))
        {
            star.setVisible(true);
        }
        if(String.valueOf(jPasswordField1.getPassword()).equals(""))
                {
                    star_1.setVisible(true);
                } 
        else{
            Connection con = MyConnection.getConnection();
            PreparedStatement ps;
            
            try {
                ps = con.prepareStatement("SELECT * FROM users WHERE username = ? And  password = ?");
                ps.setString(1,jTextField1_Username.getText());
                ps.setString(2,String.valueOf(jPasswordField1.getPassword()));
                
                ResultSet rs = ps.executeQuery();
                
                if(rs.next())
                {
                    MainForm mf = new MainForm();
                    mf.setVisible(true); 
                    mf.pack();
                    mf.setLocationRelativeTo(null);
//                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    MainForm.jLabel_Username.setText("Welcome "+jTextField1_Username.getText()+"");
                    // we will change this with student table
                    MainForm.jLabel_StdsCount.setText(" Students Count = "+Integer.toString(MyFunction.countData("student")));
                    // we will change this with course table
                    MainForm.jLabel_CrsCount.setText(" Courses Count = "+Integer.toString(MyFunction.countData("course")));
                    
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "username or password is incorrect");
            } 
            }catch (SQLException ex) {
//                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,ex);
            }
                
    
            }
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_Cancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel1;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1_Username;
    private javax.swing.JLabel star;
    private javax.swing.JLabel star_1;
    // End of variables declaration//GEN-END:variables

    
   
}
