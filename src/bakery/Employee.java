
//    Created on 15th january, 2018....... 


package bakery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Employee extends javax.swing.JFrame {

      Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
 
    public Employee() {
        initComponents();
        currentDateTime();        
        autoGenerateId();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        update_tbl();
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
    }
    
    public void autoGenerateId()
    {
        try
        {
        
            con=ConnectString.ConnectDb();
            String num = null;
            int no;
            String sql="select e_id from Emp";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();

            while(rs.next())
       {
         num=(rs.getString("e_id"));

       }

        no= Integer.parseInt(num)+ 1;

       txt_eid.setText(String.valueOf(no));

        } catch(Exception e)
        {
            //JOptionPane.showMessageDialog(this,e);
        } 
    
    }
    
    public void currentDateTime() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        lbl_dt.setText(day + "/" + (month + 1) + "/" + year);

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                lbl_tm.setText(s.format(d));
            }
        }
        ).start();
    }
     private void update_tbl()
     {
     try
     {
      con=ConnectString.ConnectDb();
            String sql = "select e_id, name, mobno, designation, sal from Emp";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
           tbl_emp.setModel(DbUtils.resultSetToTableModel(rs));
           
     }
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
     }
     
     public void clear()
    {

        txt_eid.setText("");
        txt_name.setText("");
        txt_mobno.setText("");
        txt_addr.setText("");
        jDateChooser1.setDate(null);
        txt_designation.setText("");
        txt_sal.setText("");
        txt_qualification.setText("");
        
       
    }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_dt = new javax.swing.JLabel();
        lbl_tm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_eid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_addr = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_qualification = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mobno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_designation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_sal = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txt_doj = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_addnew = new javax.swing.JButton();
        btn_reset1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_emp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE INFORMATION");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Time :");

        lbl_dt.setForeground(new java.awt.Color(255, 255, 255));

        lbl_tm.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_dt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_tm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl_date)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(lbl_dt))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(lbl_tm)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee id:");

        txt_eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_eidKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address :");

        txt_addr.setColumns(20);
        txt_addr.setRows(5);
        txt_addr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_addrKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_addr);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Qualification :");

        txt_qualification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_qualificationKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile No. :");

        txt_mobno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_mobnoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of join :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Designation :");

        txt_designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_designationKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salary :");

        txt_sal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_salKeyReleased(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        txt_doj.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_name)
                            .addComponent(txt_mobno)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sal, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txt_qualification)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txt_designation))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txt_doj))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_mobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/remove.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/home.png"))); // NOI18N
        btn_back.setText("Back to home");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/new.png"))); // NOI18N
        btn_addnew.setText("Add new");
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });

        btn_reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources2/clear.png"))); // NOI18N
        btn_reset1.setText("Reset");
        btn_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_addnew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_update))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset1)
                    .addComponent(btn_delete))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back)
                    .addComponent(btn_addnew))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbl_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "e_id", "Name", "Address", "DOB", "Qualification", "Mobile no", "Email id", "Date of join", "Designation", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_emp);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
      clear();
      autoGenerateId();
      btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_save.setEnabled(true);
    }//GEN-LAST:event_btn_addnewActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

         if(txt_name.getText().equals("")||txt_addr.getText().equals("")||txt_qualification.getText().equals("")||txt_mobno.getText().equals("")||txt_designation.getText().equals("")||txt_sal.getText().equals(""))
        {
         JOptionPane.showMessageDialog(this,"Please fill all fields properly!");
        }
        else{
        try{                  
            SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            String dt=date.format(jDateChooser1.getDate());
//            SimpleDateFormat date2=new SimpleDateFormat("yyyy-MM-dd");
//            String dt2=date2.format(txt_doj.getText());
          DefaultTableModel m=(DefaultTableModel)tbl_emp.getModel();   
        con=ConnectString.ConnectDb();
        String sql="insert into Emp values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps1=con.prepareStatement(sql);
        String a=txt_eid.getText();
        String b=a.trim();
        
         ps1.setString(1,b);
            ps1.setString(2,txt_name.getText());
            ps1.setString(3,txt_mobno.getText());
            ps1.setString(4,txt_addr.getText());
            ps1.setString(5,txt_doj.getText());
            ps1.setString(6,dt);
            ps1.setString(7,txt_designation.getText());
            ps1.setString(8,txt_sal.getText());
            ps1.setString(9,txt_qualification.getText());
             ps1.execute();           
            
            JOptionPane.showMessageDialog(this,"Record saved successfully!");
            
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        
        }
        update_tbl();
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
         int y=JOptionPane.showConfirmDialog(this,"Do you want to cancel and go back to Main form ?","Confirm",0,2);
        if(y==0)
        {
            this.dispose();
        }
        else
        {
            //Do nothing and stay on the same page;
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

         if (txt_eid.getText().equals("") || txt_name.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No data found.Update operation cannot be performed");
        }
        else 
        {   
            try {
                SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            String dt=date.format(jDateChooser1.getDate());
                DefaultTableModel m=(DefaultTableModel)tbl_emp.getModel(); 
                con = ConnectString.ConnectDb();
                 String value1 = txt_eid.getText();
                  String value2 = txt_name.getText();
                  String value3 = txt_mobno.getText();
                   String value4 = txt_addr.getText();
                  String value5 = txt_doj.getText();
                  String value6 = dt;
                  String value7 = txt_designation.getText();               
                  String value8 = txt_sal.getText();
                  String value9 = txt_qualification.getText();
                  
                 String sql = "update Emp set e_id='" + value1 + "',name='" + value2 + "',mobno='" + value3 + "',address='" + value4 + "',doj='" + value5 + "',dob='" + value6 + "',designation='" + value7 + "',sal='" + value8 + "',qualification='" + value9 + "' where e_id='" + value1 + "'";
                 PreparedStatement ps3 = con.prepareStatement(sql);
                ps3.execute();

                JOptionPane.showMessageDialog(this, "Record updated successfully");

            }
            catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);

            }update_tbl();
            }
            
            //clear();
                  

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       if (txt_eid.getText().equals("") || txt_name.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No data found. Delete operation cannot be performed");
        } else {

            int p = JOptionPane.showConfirmDialog(this, "Do you really want to delete this data ?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                String sql = "delete from Emp where c_id=?";
                try {
                    DefaultTableModel m=(DefaultTableModel)tbl_emp.getModel(); 
                    con = ConnectString.ConnectDb();

                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ps2.setString(1, txt_eid.getText());
                    ps2.execute();
                    JOptionPane.showMessageDialog(this, "Deleted successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
            update_tbl();
            clear();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    
    /* ***********CODE FOR VALIDATION*************** */
    
    
    
    
    private void txt_eidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eidKeyReleased
    
         String n=txt_eid.getText();
        int t= 1;

        String x=txt_eid.getText();

        for(int i=0;i<x.length();i++)
        {
        char ch=x.charAt(i);
        if(ch>'0' && ch<'9')
        {
         t=0;
        }
        }
      if(t==0)
      {
      //JOptionPane.showMessageDialog(this,"Numbers are not allowed");

      }
      else
      {
            JOptionPane.showMessageDialog(this,"Characters are not allowed");
            txt_eid.setText("");
      }
    }//GEN-LAST:event_txt_eidKeyReleased

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased

        boolean flag = false;
        String str = txt_name.getText();
        int l = txt_name.getText().length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && ch != ' ' && ch != '\n') {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            JOptionPane.showMessageDialog(this, "Only text values are allowed");
            txt_name.setText("");
        }
    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_qualificationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qualificationKeyReleased
       boolean flag = false;
        String str = txt_qualification.getText();
        int l = txt_qualification.getText().length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && ch != ' ' && ch != '\n' && ch!='.') {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            JOptionPane.showMessageDialog(this, "Only text values are allowed");
            txt_qualification.setText("");
        }
    }//GEN-LAST:event_txt_qualificationKeyReleased

    private void txt_mobnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobnoKeyReleased
    
         String n=txt_mobno.getText();
        int t=1;
        for(int i=0;i<n.length();i++)
        {
        char ch=n.charAt(i);
        if(ch>='0' && ch<='9')
        {
         t=0;
        }
        }
        if(t==0)
      {
      //JOptionPane.showMessageDialog(this,"Numbers are not allowed");

      }
      else
      {
            JOptionPane.showMessageDialog(this,"Characters are not allowed");
            txt_mobno.setText("");
      }
    }//GEN-LAST:event_txt_mobnoKeyReleased

    private void txt_designationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_designationKeyReleased
       
         boolean flag = false;
        String str = txt_designation.getText();
        int l = txt_designation.getText().length();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') && ch != ' ' && ch != '\n') {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            JOptionPane.showMessageDialog(this, "Only text values are allowed");
            txt_designation.setText("");
        }
    }//GEN-LAST:event_txt_designationKeyReleased

    private void txt_salKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salKeyReleased
        String n=txt_sal.getText();
        int t=1;
        for(int i=0;i<n.length();i++)
        {
        char ch=n.charAt(i);
        if(ch>'0' && ch<'9')
        {
         t=0;
        }
        }
        if(t==0)
      {
      //JOptionPane.showMessageDialog(this,"Numbers are not allowed");

      }
      else
      {
            JOptionPane.showMessageDialog(this,"Characters are not allowed");
            txt_sal.setText("");
      }
    }//GEN-LAST:event_txt_salKeyReleased

    private void txt_addrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addrKeyReleased
        
         
    }//GEN-LAST:event_txt_addrKeyReleased

    private void tbl_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empMouseClicked

        try
        {
            con=ConnectString.ConnectDb();
            int row = tbl_emp.getSelectedRow();
            String table_click = (tbl_emp.getModel().getValueAt(row,0).toString());
            String sql="select * from Emp where e_id='"+table_click+"' ";

            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();

            if(rs.next())
            {
                String add1= rs.getString("e_id");
                txt_eid.setText(add1);
                
                String add2= rs.getString("name");
                txt_name.setText(add2);
                
                String add3=rs.getString("mobno");
                txt_mobno.setText(add3);
            
                String add4= rs.getString("address");
                txt_addr.setText(add4);
                
                String add5=rs.getString("doj");
                txt_doj.setText(add5);
                
                Date dob=rs.getDate("dob");
                jDateChooser1.setDate(dob);
                
                  String add6=rs.getString("designation");
            txt_designation.setText(add6);
            
            String add7=rs.getString("sal");
            txt_sal.setText(add7);
            
            String add8=rs.getString("qualification");
            txt_qualification.setText(add8);
            

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
       btn_delete.setEnabled(true);
        btn_update.setEnabled(true);
        btn_save.setEnabled(false);
    }//GEN-LAST:event_tbl_empMouseClicked

    private void btn_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset1ActionPerformed

        clear();
    }//GEN-LAST:event_btn_reset1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Employee e=new Employee();
                e.setTitle("Employee Details");
                e.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_dt;
    private javax.swing.JLabel lbl_tm;
    private javax.swing.JTable tbl_emp;
    private javax.swing.JTextArea txt_addr;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_eid;
    private javax.swing.JTextField txt_mobno;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_qualification;
    private javax.swing.JTextField txt_sal;
    // End of variables declaration//GEN-END:variables
}
