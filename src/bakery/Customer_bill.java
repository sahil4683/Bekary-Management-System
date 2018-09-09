
package bakery;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class Customer_bill extends javax.swing.JFrame {

    Object obj1=null;
    Object obj2=null;
    Object obj3=null;
    Object obj4=null;
    Object obj5=null;
    Object obj6=null; 
    Object obj7=null;
    Object obj8=null;  

    public Object GetData(JTable jTable1, int row_index, int column_index) {
        return jTable1.getModel().getValueAt(row_index, column_index);
    }
    public void SetData(Object objj, int row_index, int column_index) {
        tbl_product.getModel().setValueAt(objj, row_index, column_index);
    }
     Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
   
    public Customer_bill() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         currentDateTime();
         autoGenerateId();
        //btn_back.setEnabled(false);        
        btn_save.setEnabled(false);
        btn_new.setEnabled(false);
        btn_printbill.setEnabled(false);
    }

    public void currentDateTime() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        lbl_date.setText(day + "/" + (month + 1) + "/" + year);
        txt_date.setText( year+ "-" + (month + 1) + "-" +day );
        lbl_billdate.setText( year+ "-" + (month + 1) + "-" +day );

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                lbl_time.setText(s.format(d));
            }
        }
        ).start();
    }
    
    
    public void clear()
    {
        txt_pname.setText("");
        txt_cat.setText("");
        txt_type.setText("");
        txt_unit.setText("");
        txt_rate2.setText("");
        txt_quantity.setText("");
        txt_total.setText("");
    }
    
     public void autoGenerateId()
    {
         try {

            con = ConnectString.ConnectDb();
            String num = null;
            int no;
            String sql = "select billno from Bill";
            Statement s=con.createStatement();
        rs=s.executeQuery(sql);

            while (rs.next()) {
                num = (rs.getString("billno"));

            }
           
            no = Integer.parseInt(num) + 1;

            txt_billno.setText(String.valueOf(no));
            lbl_billno.setText(String.valueOf(no));
            clear();
        } catch (Exception e) {
            
        }
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmb_pid = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txt_pname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_unit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        txt_type = new javax.swing.JTextField();
        txt_cat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmb_type = new javax.swing.JComboBox();
        btn_add = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        txt_rate2 = new javax.swing.JTextField();
        txt_billno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_printbill = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        printpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lbl_gst = new javax.swing.JLabel();
        lbl_disc = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_gtotal = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_billno = new javax.swing.JLabel();
        lbl_billdate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_gst = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_discount = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_grandTotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER BILL");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time :");

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_time)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_date)))
                .addGap(220, 220, 220))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_time))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product id :");

        cmb_pid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_pidMouseClicked(evt);
            }
        });
        cmb_pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pidActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Product name :");

        txt_pname.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Category :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Type :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Unit :");

        txt_unit.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Rate :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("/ unit");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity :");

        txt_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_quantityKeyReleased(evt);
            }
        });

        txt_type.setEditable(false);

        txt_cat.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total :");

        txt_total.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Product :");

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fresh", "Snack" }));
        cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_typeActionPerformed(evt);
            }
        });

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/save.png"))); // NOI18N
        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/remove.png"))); // NOI18N
        btn_remove.setText("REMOVE");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        txt_rate2.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(42, 42, 42)
                                .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_unit, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txt_cat)
                                    .addComponent(txt_quantity)))
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_rate2)
                                            .addComponent(txt_type, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel18)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmb_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txt_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_remove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_billno.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bill No :");

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/save.png"))); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_printbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/Print.png"))); // NOI18N
        btn_printbill.setText("PRINT BILL");
        btn_printbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printbillActionPerformed(evt);
            }
        });

        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/new.png"))); // NOI18N
        btn_new.setText("ADD NEW");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/home.png"))); // NOI18N
        btn_back.setText("BACK TO HOME");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Date :");

        txt_date.setBackground(new java.awt.Color(204, 255, 204));

        printpanel.setBackground(new java.awt.Color(255, 255, 255));
        printpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Type", "Rate", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_product);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("GST :");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("%");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Discount :");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("%");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Total :");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Grand total :");

        lbl_gst.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lbl_disc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lbl_total.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lbl_gtotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Thank you for visiting. Visit Again.");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Contact No. : 9422094046");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Address : Tilak Road, Alibag-402201.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl_disc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl_gst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(26, 26, 26)
                                .addComponent(lbl_total))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_gtotal))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel34))
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_total)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_gtotal)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_gst)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_disc)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Bill No. :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Date :");

        lbl_billno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lbl_billdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/images(16)_1.jpg"))); // NOI18N

        javax.swing.GroupLayout printpanelLayout = new javax.swing.GroupLayout(printpanel);
        printpanel.setLayout(printpanelLayout);
        printpanelLayout.setHorizontalGroup(
            printpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(printpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printpanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_billno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_billdate)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printpanelLayout.createSequentialGroup()
                        .addGroup(printpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34))
        );
        printpanelLayout.setVerticalGroup(
            printpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(printpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lbl_billno)
                    .addComponent(lbl_billdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("GST :");

        txt_gst.setText("0");
        txt_gst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_gstKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("%");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("%");

        txt_discount.setText("0");
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_discountKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Discount :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Total :");

        txt_grandTotal.setBackground(new java.awt.Color(255, 255, 204));
        txt_grandTotal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Grand total :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_gst, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_gst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_billno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_printbill, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(printpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(txt_billno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_printbill)
                            .addComponent(btn_save))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_new)
                            .addComponent(btn_back)))
                    .addComponent(printpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(309, 309, 309))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_pidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_pidMouseClicked
        //cmb_cid.setEnabled(false);
    }//GEN-LAST:event_cmb_pidMouseClicked

    private void cmb_pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pidActionPerformed

            try {

            con = ConnectString.ConnectDb();
            Statement st = con.createStatement();
            String sql = "select * from ProductStock where p_id='" + cmb_pid.getSelectedItem() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_pname.setText(rs.getString(4));
                txt_cat.setText(rs.getString(5));
                txt_type.setText(rs.getString(6));
                txt_rate2.setText(rs.getString(7));
                txt_unit.setText(rs.getString(8));

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmb_pidActionPerformed

    private void txt_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantityKeyReleased
        int t = 1;
        String x = txt_quantity.getText();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch >= '0' && ch <= '9') {
                t = 0;
            }
        }
        if (t == 0) {
        } else {
            JOptionPane.showMessageDialog(this, "Characters are not allowed");
            txt_quantity.setText("");
            txt_total.setText("");
        }

        int n1, n2, res;
        n1 = Integer.parseInt(txt_rate2.getText());
        n2 = Integer.parseInt(txt_quantity.getText());
        res = n1 * n2;
        txt_total.setText(String.valueOf(res));

    }//GEN-LAST:event_txt_quantityKeyReleased

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int a=Integer.parseInt(txt_quantity.getText());
        if (txt_billno.getText().equals("") || txt_pname.getText().equals("") || txt_unit.getText().equals("") || txt_cat.getText().equals("") || txt_rate2.getText().equals("") || txt_quantity.getText().equals("") || txt_type.getText().equals("") || txt_total.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all fields properly!");
        }

        else if(a==0)
        {
            JOptionPane.showMessageDialog(this, "Quantity cannot be zero.");
            txt_quantity.setText("");
            txt_total.setText("");
        }

        else {

            DefaultTableModel m = (DefaultTableModel) tbl_product.getModel();
          //  obj1 = cmb_pid.getSelectedItem();
            obj1 = txt_pname.getText();
            obj2 = txt_cat.getText();
            obj3 = txt_type.getText();
           // obj5 = txt_unit.getText();
            obj4 = txt_rate2.getText();
            obj5 = txt_quantity.getText();
            obj6 = txt_total.getText();

//            try {
//
//                con = ConnectString.ConnectDb();
//                String sql = "insert into Bill values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//                PreparedStatement ps1 = con.prepareStatement(sql);
//                ps1.setString(1, txt_billno.getText());
//                ps1.setString(2, txt_billno1.getText());
//                ps1.setString(3, cmb_type.getSelectedItem().toString());
//                ps1.setString(4, cmb_pid.getSelectedItem().toString());
//                ps1.setString(5, txt_pname.getText());
//                ps1.setString(6, txt_cat.getText());
//                ps1.setString(7, txt_type.getText());
//                ps1.setString(8, txt_unit.getText());
//                ps1.setString(9, txt_rate2.getText());
//                ps1.setString(10, txt_quantity.getText());
//                ps1.setString(11, txt_total.getText());
//                ps1.setString(12, null);
//                ps1.setString(13, null);
//                ps1.setString(14, null);
//                ps1.setString(15, null);
//
//                ps1.execute();
//                // update_tbl();
//
//                // JOptionPane.showMessageDialog(this, "Record saved successfully!");
//            } catch (Exception e) {
//                // JOptionPane.showMessageDialog(this, e);
//                //JOptionPane.showMessageDialog(null, "Please fill records in proper format");
//            }
            
//Check Stock Is Available...
            try {
                int newQty = 0;
                Connection con =ConnectString.ConnectDb();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select quantity from ProductStock where p_id='" + cmb_pid.getSelectedItem().toString() + "'");
                rs.next();
                int pqty1 = rs.getInt(1);
                if (pqty1 < 1) {
                    JOptionPane.showMessageDialog(null, "Oopss...Stock Out...!");
                    clear();
                    
                }
                else if (pqty1 < 10) {
                    JOptionPane.showMessageDialog(null, "Stock Are Limited...");
                    
                    
                      try {

                con = ConnectString.ConnectDb();
                String sql = "insert into Bill values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setString(1, txt_billno.getText());
                ps1.setString(2, txt_date.getText());
                ps1.setString(3, cmb_type.getSelectedItem().toString());
                ps1.setString(4, cmb_pid.getSelectedItem().toString());
                ps1.setString(5, txt_pname.getText());
                ps1.setString(6, txt_cat.getText());
                ps1.setString(7, txt_type.getText());
                ps1.setString(8, txt_unit.getText());
                ps1.setString(9, txt_rate2.getText());
                ps1.setString(10, txt_quantity.getText());
                ps1.setString(11, txt_total.getText());
                ps1.setString(12, null);
                ps1.setString(13, null);
                ps1.setString(14, null);
                ps1.setString(15, null);

                ps1.execute();
                // update_tbl();

                // JOptionPane.showMessageDialog(this, "Record saved successfully!");
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, e);
                //JOptionPane.showMessageDialog(null, "Please fill records in proper format");
            }
                    
                    
                    newQty = pqty1 - Integer.parseInt(txt_quantity.getText());
                    String sql2 = "update ProductStock set quantity='" + newQty + "' where p_id='" + cmb_pid.getSelectedItem().toString() + "' ";
                    PreparedStatement ps = con.prepareStatement(sql2);
                    ps.execute();
                    m.insertRow(0, new Object[]{obj1, obj2, obj3, obj4, obj5, obj6});
                    cmb_pid.setSelectedIndex(0);
                    clear();
                } else {
                    
                      try {

                con = ConnectString.ConnectDb();
                String sql = "insert into Bill values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setString(1, txt_billno.getText());
                ps1.setString(2, txt_date.getText());
                ps1.setString(3, cmb_type.getSelectedItem().toString());
                ps1.setString(4, cmb_pid.getSelectedItem().toString());
                ps1.setString(5, txt_pname.getText());
                ps1.setString(6, txt_cat.getText());
                ps1.setString(7, txt_type.getText());
                ps1.setString(8, txt_unit.getText());
                ps1.setString(9, txt_rate2.getText());
                ps1.setString(10, txt_quantity.getText());
                ps1.setString(11, txt_total.getText());
                ps1.setString(12, null);
                ps1.setString(13, null);
                ps1.setString(14, null);
                ps1.setString(15, null);

                ps1.execute();
                // update_tbl();

                // JOptionPane.showMessageDialog(this, "Record saved successfully!");
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(this, e);
                //JOptionPane.showMessageDialog(null, "Please fill records in proper format");
            }
                    
                    
                    
                    newQty = pqty1 - Integer.parseInt(txt_quantity.getText());
                    String sql2 = "update ProductStock set quantity='" + newQty + "' where p_id='" + cmb_pid.getSelectedItem().toString() + "' ";
                    PreparedStatement ps = con.prepareStatement(sql2);
                    ps.execute();
                    m.insertRow(0, new Object[]{obj1, obj2, obj3, obj4, obj5, obj6});
                    cmb_pid.setSelectedIndex(0);
                    clear();
                }
                con.close();
            } catch (Exception e1) {
            }

//            m.insertRow(0, new Object[]{obj1, obj2, obj3, obj4, obj5, obj6});
//            cmb_pid.setSelectedIndex(0);
//            clear();

            //Simultaneously calculate the total and display in table.....
            try {
                int i = 0;
                int rowcount = tbl_product.getRowCount();
                System.out.println(rowcount);
                SetData("Total", rowcount - 1, 4);//total label
                Object o1 = null, o2 = null;
                o2 = GetData(tbl_product, i, 1);
                int sum = 0;
                for (i = 0; i < rowcount; i++) {
                    o1 = GetData(tbl_product, i, 5);//set amount
                    float n1 = Integer.parseInt(o1.toString());
                    sum = (int) (sum + n1);
                    SetData(sum, rowcount - 1, 5);
                    System.out.println(sum);
                    txt_subtotal.setText("" + sum);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //clear();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
//        int filaselecionada = tbl_clientOrder.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel) tbl_clientOrder.getModel();
//        if (filaselecionada >= 0) {
//            model.removeRow(filaselecionada);
//        } else {
//            JOptionPane.showMessageDialog(null, "Select Row From Table");
//        }
//
//        //Try to decrease total
//        try {
//            int i = 0;
//            int rowcount = tbl_clientOrder.getRowCount();
//            System.out.println(rowcount);
//            SetData("Total", rowcount - 1, 5);//total label
//            Object o1 = null, o2 = null;
//            o2 = GetData(tbl_clientOrder, i, 1);
//            int sum = 0;
//            for (i = 0; i < rowcount; i++) {
//                o1 = GetData(tbl_clientOrder, i, 6);//set amount
//                float n1 = Integer.parseInt(o1.toString());
//                sum = (int) (sum + n1);
//                SetData(sum, rowcount - 1, 6);
//                System.out.println(sum);
//                txt_subtotal.setText("" + sum);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }

    }//GEN-LAST:event_btn_removeActionPerformed

    private void txt_gstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gstKeyReleased
        int n1, res, tc, gst;

        gst = Integer.parseInt((String) txt_gst.getText());
        n1 = Integer.parseInt(txt_subtotal.getText());
        res = (n1 * gst) / 100;
        tc = res + n1;
        txt_grandTotal.setText(String.valueOf(tc));
        btn_save.setEnabled(true);

    }//GEN-LAST:event_txt_gstKeyReleased

    private void txt_discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyReleased
        int n1, res, tc, dis, caldis, gst;

        gst = Integer.parseInt((String) txt_gst.getText());
        n1 = Integer.parseInt(txt_subtotal.getText());
        res = (n1 * gst) / 100;
        tc = res + n1;
        //txt_grandTotal.setText(String.valueOf(tc));
        dis = Integer.parseInt(txt_discount.getText());
        caldis = tc * (100 - dis) / 100;
        txt_grandTotal.setText(String.valueOf(caldis));
    }//GEN-LAST:event_txt_discountKeyReleased

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
//        try {
//            String value1 = txt_subtotal.getText();
//            String value2 = txt_gst.getText();
//            String value3 = txt_discount.getText();
//            String value4 = txt_grandTotal.getText();
//            String value5=txt_advanced.getText();
//            String value6=txt_remaining.getText();
//            String sql = "update Orders set total='" + value1 + "',gst='" + value2 + "',disc='" + value3 + "',gtotal='" + value4 + "',advance='" + value5 + "',balance='" + value6 + "' where o_id='" + txt_oid.getText() + "'";
//            con=ConnectString.ConnectDb();
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.execute();
//            JOptionPane.showMessageDialog(this, "Record Saved successfully");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e);
//        }
//        btn_back.setEnabled(true);
//        btn_printbill.setEnabled(true);
//        btn_new.setEnabled(true);
//        btn_add.setEnabled(false);
//        btn_remove.setEnabled(false);

try {
            String value1 = txt_subtotal.getText();
            String value2 = txt_gst.getText();
            String value3 = txt_discount.getText();
            String value4 = txt_grandTotal.getText();
            String sql = "update Bill set subtotal='" + value1 + "',gst='" + value2 + "',disc='" + value3 + "',gtotal='" + value4 + "' where billno='" + txt_billno.getText() + "'";
            con=ConnectString.ConnectDb();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Record Saved successfully");
            lbl_gst.setText(value2);
            lbl_disc.setText(value3);
            lbl_total.setText(value1);
            lbl_gtotal.setText(value4);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
          btn_back.setEnabled(true);
          btn_printbill.setEnabled(true);
          btn_new.setEnabled(true);
          btn_add.setEnabled(false);
          btn_remove.setEnabled(false);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_printbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printbillActionPerformed
//        //saveAll();
//        MessageFormat header = new MessageFormat("Customer bill");
//        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
//        try {
//            jPanel1.print(jPanel1.PrintMode.NORMAL, header, footer);
//        } catch (java.awt.print.PrinterException e) {
//            System.err.format("cnnot print %s%n", e.getMessage());
//        }


        Toolkit tkp=printpanel.getToolkit();
        PrintJob pjb=tkp.getPrintJob(this, null, null);
        Graphics g=pjb.getGraphics();
        printpanel.print(g);
        g.dispose();
        pjb.end();



    }//GEN-LAST:event_btn_printbillActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed

        new Customer_bill().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_typeActionPerformed
        int i=cmb_type.getSelectedIndex();
        if(i==0)
        {
            cmb_pid.removeAllItems();
            try{
                con = ConnectString.ConnectDb();
                String sql="select * from ProductStock where stock='"+"Fresh"+"'";
                Statement s=con.createStatement();
                rs=s.executeQuery(sql);
                while(rs.next())
                {
                    int id=rs.getInt("p_id");
                    cmb_pid.addItem(id);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }

        }
        else if(i==1)
        {
            cmb_pid.removeAllItems();
            try{
                con = ConnectString.ConnectDb();
                String sql="select * from ProductStock where stock='"+"Snack"+"'";
                Statement s=con.createStatement();
                rs=s.executeQuery(sql);
                while(rs.next())
                {
                    int id=rs.getInt("p_id");
                    cmb_pid.addItem(id);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }

        }
        clear();

    }//GEN-LAST:event_cmb_typeActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_printbill;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cmb_pid;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_billdate;
    private javax.swing.JLabel lbl_billno;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_disc;
    private javax.swing.JLabel lbl_gst;
    private javax.swing.JLabel lbl_gtotal;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel printpanel;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txt_billno;
    private javax.swing.JTextField txt_cat;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_discount;
    private javax.swing.JTextField txt_grandTotal;
    private javax.swing.JTextField txt_gst;
    private javax.swing.JTextField txt_pname;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_rate2;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_type;
    private javax.swing.JTextField txt_unit;
    // End of variables declaration//GEN-END:variables
}
