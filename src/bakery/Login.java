
package bakery;

import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    int attempts=4;
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        combo_level = new javax.swing.JComboBox();
        btn_login = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_error.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(lbl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USERNAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PASSWORD :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 100, 20));
        jPanel1.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 140, 30));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("USERTYPE :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 27));

        combo_level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<select>>", "Admin", "User" }));
        jPanel1.add(combo_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 107, 29));

        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 100, 40));

        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 80, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images(9)_1.jpg"))); // NOI18N
        jLabel5.setAlignmentY(0.0F);
        jLabel5.setAutoscrolls(true);
        jLabel5.setIconTextGap(0);
        jLabel5.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(this, "Do you want to cancel and exit the application ?", "Confirm", 0, 2);
        if (y == 0) {

            this.dispose();


        } else {
            //Do nothing and stay on the same page;
        }
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
//
//        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            Connection con = DriverManager.getConnection("jdbc:odbc:Driver={SQL Server};server=(local);Database=Bakery");
//            String c = combo_level.getSelectedItem().toString();
//            String q = "select * from Login where USERNAME=? and PASSWORD=? and USERTYPE=?";
//            PreparedStatement ps = con.prepareStatement(q);
//            ps.setString(1, txt_uname.getText());
//            ps.setString(2, txt_pass.getText());
//            ps.setString(3, c);
//            ResultSet r = ps.executeQuery();
//            
//            while(attempt!=0){
//            if (r.next()) {
//                if(r.getString(c)=="Admin")
//                {
//                new MDIForm().setVisible(true);
//                this.dispose();
//                }
//                else if(r.getString(c)=="User")
//                {
//                 MDIForm m=new MDIForm();
//                 m.menu_reports.hide();
//                }
//                
//            } else {
//                javax.swing.JOptionPane.showMessageDialog(this, "invalid USERNAME or PASSWORD or USERTYPE maybe invalid");
//                lbl_error.setText("Only  '"+attempt+"' attempts are left");
//                attempt--;
//                  txt_uname.setText("");
//            txt_pass.setText("");
//            }
//            return;
//            }
//            
//          
//            if(attempt==0)
//            {
//            JOptionPane.showMessageDialog(this, "Sorry! Please inform administrator");
//            this.dispose();
//            }
//            
//
//        } catch (ClassNotFoundException c) {
//            javax.swing.JOptionPane.showMessageDialog(this, c);
//        } catch (SQLException s) {
//            //javax.swing.JOptionPane.showMessageDialog(this, s);
//        }
//
//
//

        MDIForm m=new MDIForm();
        //m.getComponentAt(10, 10).disable();
    
//Employee Login...
        try {
            Connection con =ConnectString.ConnectDb();
            if(combo_level.getSelectedItem().equals("User")){
            String q = "select * from Login where USERNAME=? and PASSWORD=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, txt_uname.getText());
            ps.setString(2, txt_pass.getText());
            ResultSet r = ps.executeQuery();
            
            if (r.next()) {
                MDIForm hf = new MDIForm();
                hf.setVisible(true);
                hf.mi_employee.hide();
                hf.mi_product.hide();
                hf.menu_reports.hide();
                hf.mi_user.hide();
                this.dispose();
            } else {
                lbl_error.setText("Incorrect Username And Password !   '" + attempts + "' Attempts are Left");
                attempts--;
            }
            }
            if (attempts == 0) {
                JOptionPane.showMessageDialog(this, "Incorrect Username And Password !", "INFORMATION", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } catch (SQLException s) {
            lbl_error.setText(s.getMessage());
        }
        
//Admin Login...
        try {
            String user = txt_uname.getText();
            String pwd = txt_pass.getText();
            String lev = combo_level.getSelectedItem().toString();
            if (user.equals("") || pwd.equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Username And Password !", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_uname.requestFocus();
            }
            if (user.equals("admin") && pwd.equals("admin") && lev.equals("Admin")) {
                MDIForm mh = new MDIForm();
                mh.setVisible(true);
                this.dispose();
            } else {
                lbl_error.setText("Invalid User Name and Password ! '" + attempts + "' Attempts are Left");
            }
            return;
        } catch (Exception e) {
            lbl_error.setText(e.getMessage());
        }
        txt_uname.setText("");
        txt_pass.setText("");
        SplashScreen s= new SplashScreen();
        s.dispose();




    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Login l=new Login();
                
                l.setTitle("Login Form");
                l.setSize(597, 536);
                l.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox combo_level;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
