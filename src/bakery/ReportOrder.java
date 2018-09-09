package bakery;

import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import static sun.net.www.MimeTable.loadTable;

public class ReportOrder extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public ReportOrder() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {
            con = ConnectString.ConnectDb();
            st = con.createStatement();
            rs = st.executeQuery("select distinct o_id from Orders");
            while (rs.next()) {
                cmb_id.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    void Header() {
        tbl_order.getColumnModel().getColumn(0).setHeaderValue("Order id");
        tbl_order.getColumnModel().getColumn(1).setHeaderValue("Client id");
        tbl_order.getColumnModel().getColumn(2).setHeaderValue("Client Name");
        tbl_order.getColumnModel().getColumn(3).setHeaderValue("Product Name");
        tbl_order.getColumnModel().getColumn(4).setHeaderValue("Unit");
        tbl_order.getColumnModel().getColumn(5).setHeaderValue("Rate");
        tbl_order.getColumnModel().getColumn(6).setHeaderValue("Quantity");
        tbl_order.getColumnModel().getColumn(7).setHeaderValue("Sub Total");
        tbl_order.getColumnModel().getColumn(8).setHeaderValue("Total");
        tbl_order.getColumnModel().getColumn(9).setHeaderValue("GST");
        tbl_order.getColumnModel().getColumn(10).setHeaderValue("Discount");
        tbl_order.getColumnModel().getColumn(11).setHeaderValue("Grand Total");
        tbl_order.getColumnModel().getColumn(12).setHeaderValue("Advance");
        tbl_order.getColumnModel().getColumn(13).setHeaderValue("Balance");
    }

    void loadTable() {
        try {
            con = ConnectString.ConnectDb();
                st = con.createStatement();
                String sql = "select o_id, c_id, c_name, p_name, p_unit, p_rate, p_quantity, p_total, total, gst, disc, gtotal, advance, balance from Orders";
                rs = st.executeQuery(sql);
            tbl_order.setModel(DbUtils.resultSetToTableModel(rs));
            Header();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_order = new javax.swing.JTable();
        btn_print = new javax.swing.JButton();
        btn_showall = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dc_to = new com.toedter.calendar.JDateChooser();
        dc_from = new com.toedter.calendar.JDateChooser();
        btn_search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmb_id = new javax.swing.JComboBox();
        btn_back6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("From :");

        tbl_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_order);

        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_showall.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_showall.setText("Show All");
        btn_showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showallActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("To :");

        dc_to.setDateFormatString("yyyy-MM-dd");

        dc_from.setDateFormatString("yyyy-MM-dd");

        btn_search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Search By Order id :");

        cmb_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmb_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Select>>" }));
        cmb_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_idActionPerformed(evt);
            }
        });

        btn_back6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/home.png"))); // NOI18N
        btn_back6.setText("Back to home");
        btn_back6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dc_from, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dc_to, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_search)
                                .addGap(18, 18, 18)
                                .addComponent(btn_showall)
                                .addGap(18, 18, 18)
                                .addComponent(btn_print)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(dc_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_search)
                                        .addComponent(btn_showall)
                                        .addComponent(btn_print))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3)))
                                .addComponent(dc_to, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_back6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
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

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Order Report");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            tbl_order.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("cnnot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showallActionPerformed
        loadTable();
    }//GEN-LAST:event_btn_showallActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

//Search by Date      
//        try {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//            String d1 = df.format(dc_from.getDate());
//            Connection con = ConnectString.ConnectDb();
//            String sql = "select o_id, c_id, c_name, p_name, p_unit, p_rate, p_quantity, p_total, total, gst, disc, gtotal, advance, balance from Orders where o_date='" + d1 + "'";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery(sql);
//            DefaultTableModel dm;
//            dm = (DefaultTableModel) tbl_order.getModel();
//            tbl_order.setModel(DbUtils.resultSetToTableModel(rs));
//            Header();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, e);
//        }
////search by date from and to........
////try {
////            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
////            String d1=df.format(dc_from.getDate());
////            String d2=df.format(dc_to.getDate());
////            Connection con =ConnectString.ConnectDb();
////            String sql = "select o_id, c_id, c_name, p_name, p_unit, p_rate, p_quantity, p_total, total, gst, disc, gtotal, advance, balance from Orders where o_date between '"+d1+"' and '"+d2+"'";
////            PreparedStatement ps = con.prepareStatement(sql);
////            ResultSet rs = ps.executeQuery(sql);
////            DefaultTableModel dm;
////            dm = (DefaultTableModel) tbl_order.getModel();
////            tbl_order.setModel(DbUtils.resultSetToTableModel(rs));
////            Header();
////        } catch (SQLException e) {
////            JOptionPane.showMessageDialog(this, e);
////        }
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String d1 = df.format(dc_from.getDate());
            String d2 = df.format(dc_to.getDate());
            con = ConnectString.ConnectDb();
            st = con.createStatement();
            String sql = "select o_id, c_id, c_name, p_name, p_unit, p_rate, p_quantity, p_total, total, gst, disc, gtotal, advance, balance from Orders where o_date between '"+d1+"' and '"+d2+"'";
            rs = st.executeQuery(sql);
            tbl_order.setModel(DbUtils.resultSetToTableModel(rs));
            Header();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void cmb_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_idActionPerformed

        if (cmb_id.getSelectedIndex() == 0) {
            loadTable();
        } else {

            try {

                con = ConnectString.ConnectDb();
                st = con.createStatement();
                String sql = "select o_id, c_id, c_name, p_name, p_unit, p_rate, p_quantity, p_total, total, gst, disc, gtotal, advance, balance from Orders where o_id='" + cmb_id.getSelectedItem() + "'";
                rs = st.executeQuery(sql);
                tbl_order.setModel(DbUtils.resultSetToTableModel(rs));
                Header();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "2");
            }
        }
    }//GEN-LAST:event_cmb_idActionPerformed

    private void btn_back6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_back6ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back5;
    private javax.swing.JButton btn_back6;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_showall;
    private javax.swing.JComboBox cmb_id;
    private com.toedter.calendar.JDateChooser dc_from;
    private com.toedter.calendar.JDateChooser dc_to;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_order;
    // End of variables declaration//GEN-END:variables
}
