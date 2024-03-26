
package View;

import Controller.ControllerDeleteData;
import Controller.ControllerGetData;
import Controller.ControllerUpdateData;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManageAppointments extends javax.swing.JFrame {


    public ManageAppointments() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
       
        DefaultTableModel tblModel = (DefaultTableModel) tableAppointmentDetails4.getModel();
        tblModel.setColumnCount(7); // Set to the number of visible columns
        
        this.setLocation(381,185);
         tableAppointmentDetails4.fixTable(jScrollPane2);
        for(int i = 0;i<7;i++){
         tableAppointmentDetails4.setColumnAlignment(i, JLabel.CENTER);
         tableAppointmentDetails4.setCellAlignment(i, JLabel.CENTER);
 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStaffName = new javax.swing.JTextField();
        txtStaffMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStaffNIC = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        txtCustomerMobile = new javax.swing.JTextField();
        txtCustomerNIC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAppID = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAppointmentDetails4 = new View.TableDark();
        txtCurrentStatus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnChangeStatus = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancelAssignment = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAppointmentDetails3 = new View.TableDark();
        btnMin = new javax.swing.JLabel();
        txtRefresh3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Appoitment Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 160, 40));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 5, 1, 275));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Appoitment Status");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 30));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setText("Assigned Staff Member Details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 40));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel6.setText("Customer Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 30));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel7.setText("Member Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 30));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel8.setText("Member Mobile");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        txtSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 390, 30));

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtGender.setForeground(new java.awt.Color(102, 102, 102));
        txtGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 320, 30));

        txtStaffName.setEditable(false);
        txtStaffName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffName.setForeground(new java.awt.Color(102, 102, 102));
        txtStaffName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtStaffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtStaffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 30));

        txtStaffMobile.setEditable(false);
        txtStaffMobile.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffMobile.setForeground(new java.awt.Color(102, 102, 102));
        txtStaffMobile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtStaffMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 30));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel9.setText("Member ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 30));

        txtStaffNIC.setEditable(false);
        txtStaffNIC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffNIC.setForeground(new java.awt.Color(102, 102, 102));
        txtStaffNIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtStaffNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 281, 880, 1));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel10.setText("Current Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 40));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel11.setText("Appointment ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 30));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel12.setText("Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 30, 30));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel13.setText("Customer Mobile");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, 30));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel15.setText("Customer NIC");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 30));

        txtStaffID.setEditable(false);
        txtStaffID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffID.setForeground(new java.awt.Color(102, 102, 102));
        txtStaffID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 250, 30));

        txtCustomerName.setEditable(false);
        txtCustomerName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(102, 102, 102));
        txtCustomerName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 320, 30));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 130, 30));

        txtCustomerMobile.setEditable(false);
        txtCustomerMobile.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCustomerMobile.setForeground(new java.awt.Color(102, 102, 102));
        txtCustomerMobile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCustomerMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 320, 30));

        txtCustomerNIC.setEditable(false);
        txtCustomerNIC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCustomerNIC.setForeground(new java.awt.Color(102, 102, 102));
        txtCustomerNIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCustomerNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 320, 30));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel16.setText("Customer Name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 100, 30));

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Appointment Time");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 120, 30));

        txtAppID.setEditable(false);
        txtAppID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtAppID.setForeground(new java.awt.Color(102, 102, 102));
        txtAppID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtAppID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 320, 30));

        time.setEditable(false);
        time.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        time.setForeground(new java.awt.Color(102, 102, 102));
        time.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 130, 30));

        tableAppointmentDetails4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "App_ID", "C_name", "SM_ID", "SM_name", "Time", "Date", "Status"
            }
        ));
        tableAppointmentDetails4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tableAppointmentDetails4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAppointmentDetails4MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableAppointmentDetails4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 880, 150));

        txtCurrentStatus.setEditable(false);
        txtCurrentStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCurrentStatus.setForeground(new java.awt.Color(102, 102, 102));
        txtCurrentStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCurrentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentStatusActionPerformed(evt);
            }
        });
        jPanel1.add(txtCurrentStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 250, 30));

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel18.setText("Member NIC");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 30));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setText("View Report");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.setRequestFocusEnabled(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 190, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnify.png"))); // NOI18N
        jButton2.setText("Search Appointments");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setRequestFocusEnabled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 190, 30));

        btnChangeStatus.setBackground(new java.awt.Color(255, 102, 51));
        btnChangeStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnChangeStatus.setText("Change Appointment Status");
        btnChangeStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangeStatus.setFocusPainted(false);
        btnChangeStatus.setRequestFocusEnabled(false);
        btnChangeStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeStatusMouseClicked(evt);
            }
        });
        jPanel1.add(btnChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 190, 30));

        btnDelete.setBackground(new java.awt.Color(255, 102, 51));
        btnDelete.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDelete.setText("Delete Appointment");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setFocusPainted(false);
        btnDelete.setRequestFocusEnabled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 190, 30));

        btnCancelAssignment.setBackground(new java.awt.Color(255, 102, 51));
        btnCancelAssignment.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnCancelAssignment.setText("Cancel Assignment");
        btnCancelAssignment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelAssignment.setFocusPainted(false);
        btnCancelAssignment.setRequestFocusEnabled(false);
        btnCancelAssignment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelAssignmentMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancelAssignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 190, 30));

        tableAppointmentDetails3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "App_ID", "C_name", "SM_ID", "SM_name", "Time", "Date", "Status", "C_nic", "C_mobile", "Customer Gender", "SM_mobile", "SM_nic"
            }
        ));
        tableAppointmentDetails3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tableAppointmentDetails3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAppointmentDetails3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableAppointmentDetails3);
        if (tableAppointmentDetails3.getColumnModel().getColumnCount() > 0) {
            tableAppointmentDetails3.getColumnModel().getColumn(7).setHeaderValue("C_nic");
            tableAppointmentDetails3.getColumnModel().getColumn(8).setHeaderValue("C_mobile");
            tableAppointmentDetails3.getColumnModel().getColumn(9).setHeaderValue("Customer Gender");
            tableAppointmentDetails3.getColumnModel().getColumn(10).setHeaderValue("SM_mobile");
            tableAppointmentDetails3.getColumnModel().getColumn(11).setHeaderValue("SM_nic");
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 0, 150));

        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-macos-minimize-23.png"))); // NOI18N
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 30, 30));

        txtRefresh3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRefresh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        txtRefresh3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRefresh3MouseClicked(evt);
            }
        });
        jPanel1.add(txtRefresh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, -4, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStaffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffNameActionPerformed

    private void txtCurrentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentStatusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void tableAppointmentDetails4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAppointmentDetails4MouseClicked
        int row = tableAppointmentDetails4.getSelectedRow();
        Object app_id = tableAppointmentDetails4.getValueAt(row, 0);
        for (int i = 0; i < tableAppointmentDetails3.getRowCount(); i++) {
           if (tableAppointmentDetails3.getValueAt(i, 0).equals(app_id)) {
           // Row found in table2
             String AppointmentID = tableAppointmentDetails3.getValueAt(i, 0).toString();
             String CustomerName = tableAppointmentDetails3.getValueAt(i, 1).toString();
             String SM_id = tableAppointmentDetails3.getValueAt(i, 2).toString();
             String SM_name = tableAppointmentDetails3.getValueAt(i, 3).toString();
             String Time = tableAppointmentDetails3.getValueAt(i, 4).toString();
             String Date = tableAppointmentDetails3.getValueAt(i, 5).toString();
             String Status = tableAppointmentDetails3.getValueAt(i, 6).toString();
             String CustomerNIC = tableAppointmentDetails3.getValueAt(i, 7).toString();
             String CustomerMobile = tableAppointmentDetails3.getValueAt(i, 8).toString();
             String Gender = tableAppointmentDetails3.getValueAt(i, 9).toString();
             String SM_mobile = tableAppointmentDetails3.getValueAt(i, 10).toString();
             String SM_nic = tableAppointmentDetails3.getValueAt(i, 11).toString();
             txtStaffID.setText(SM_id );
             txtStaffName.setText(SM_name);
             txtStaffMobile.setText(SM_mobile);
             txtStaffNIC.setText(SM_nic);
             txtCurrentStatus.setText(Status);
             txtAppID.setText(AppointmentID);
             txtCustomerNIC.setText(CustomerNIC);
             txtGender.setText(Gender);
             txtCustomerMobile.setText(CustomerMobile);
             txtCustomerName.setText(CustomerName);
             time.setText(Time);
             date.setText(Date);
             break;
               }
         }

    }//GEN-LAST:event_tableAppointmentDetails4MouseClicked

    private void tableAppointmentDetails3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAppointmentDetails3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableAppointmentDetails3MouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      DefaultTableModel object = (DefaultTableModel) tableAppointmentDetails4.getModel();
    TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(object);
    tableAppointmentDetails4.setRowSorter(tableRowSorter);

    // Apply a case-insensitive filter
    tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(txtSearch.getText())));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnChangeStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeStatusMouseClicked
        String currentStatus = txtCurrentStatus.getText();
        String SelectedID = txtAppID.getText();
        if(!currentStatus.equals("")){
         if(currentStatus.equals("Unhandled")){
          ControllerUpdateData CUD = new ControllerUpdateData(); 
            try {
                CUD.UpdateToHandled(SelectedID);
                txtCurrentStatus.setText("Handled");
                refreshTables();
                
            } catch (SQLException ex) {
                Logger.getLogger(ManageAppointments.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(currentStatus.equals("Handled")){
            ControllerUpdateData CUD = new ControllerUpdateData(); 
            try {
                CUD.UpdateToUnhandled(SelectedID);
                txtCurrentStatus.setText("UnHandled");
                refreshTables();
            } catch (SQLException ex) {
                Logger.getLogger(ManageAppointments.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }else{
         JOptionPane.showMessageDialog(null,"Select A Record !");
        }
       
    }//GEN-LAST:event_btnChangeStatusMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
      String SelectedID = txtAppID.getText();
       if(!SelectedID.equals("")){ 
         ControllerDeleteData CDD = new  ControllerDeleteData();
          try {
              CDD.DeleteRecord(SelectedID);
              this.dispose();
              ManageAppointments MA = new  ManageAppointments();
              MA.refreshTables();
              MA.setVisible(true);
          } catch (SQLException ex) {
              Logger.getLogger(ManageAppointments.class.getName()).log(Level.SEVERE, null, ex);
          }
       }else{
        JOptionPane.showMessageDialog(null,"Select A Record !");
       }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnCancelAssignmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelAssignmentMouseClicked
        String SelectedID = txtAppID.getText();
         if(!SelectedID.equals("")){ 
         ControllerDeleteData CDD = new  ControllerDeleteData();
          try {
              CDD.RemoveAssignment(SelectedID);
              this.dispose();
              ManageAppointments MA = new  ManageAppointments();
              MA.setVisible(true);
              MA.refreshTables();
          } catch (SQLException ex) {
              Logger.getLogger(ManageAppointments.class.getName()).log(Level.SEVERE, null, ex);
          }
       }else{
        JOptionPane.showMessageDialog(null,"Select A Record !");
       }
    }//GEN-LAST:event_btnCancelAssignmentMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(ManageAppointments.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void txtRefresh3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRefresh3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefresh3MouseClicked

    
    public void refreshTables(){
    // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableAppointmentDetails4.getModel();
    model1.setRowCount(0);

    // Populate tableAppointmentDetails4 with fresh data
    ControllerGetData CGD1 = new ControllerGetData();
    try {
        ResultSet result = CGD1.getAppointmentDataToManage();
        while (result.next()) {
        String app_id = result.getString("appointment_id");
        String c_name = result.getString("c_name");
        String sm_id = result.getString("sm_id");
        String sm_name = result.getString("sm_name");
        String time = result.getString("time");
        String date = result.getString("date");
        String status = result.getString("status");
        String c_nic = result.getString("c_nic");
        String c_mobile = result.getString("c_mobile");
        String gender = result.getString("c_gender");
        String sm_mobile = result.getString("sm_mobile");
        String sm_nic = result.getString("sm_nic");

        String TBLdata[] = {app_id, c_name, sm_id, sm_name, time, date, status, c_nic, c_mobile, gender, sm_mobile, sm_nic};
        model1.addRow(TBLdata);
        }
    } catch (Exception ex) {
        Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Clear existing data from tableAppointmentDetails3
    DefaultTableModel model2 = (DefaultTableModel) tableAppointmentDetails3.getModel();
    model2.setRowCount(0);

    // Populate tableAppointmentDetails3 with fresh data
    ControllerGetData CGD2 = new ControllerGetData();
    try {
        ResultSet result = CGD2.getAppointmentDataToManage();
        while (result.next()) {
                //appointment
        String app_id = result.getString("appointment_id");
        String c_name = result.getString("c_name");
        String sm_id = result.getString("sm_id");
        String sm_name = result.getString("sm_name");
        String time = result.getString("time");
        String date = result.getString("date");
        String status = result.getString("status");
        String c_nic = result.getString("c_nic");
        String c_mobile = result.getString("c_mobile");
        String gender = result.getString("c_gender");
        String sm_mobile = result.getString("sm_mobile");
        String sm_nic = result.getString("sm_nic");

        String TBLdata[] = {app_id, c_name, sm_id, sm_name, time, date, status, c_nic, c_mobile, gender, sm_mobile, sm_nic};
        model2.addRow(TBLdata);
        }
    } catch (Exception ex) {
        Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelAssignment;
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnMin;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private View.TableDark tableAppointmentDetails3;
    private View.TableDark tableAppointmentDetails4;
    private javax.swing.JTextField time;
    private javax.swing.JTextField txtAppID;
    private javax.swing.JTextField txtCurrentStatus;
    private javax.swing.JTextField txtCustomerMobile;
    private javax.swing.JTextField txtCustomerNIC;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JLabel txtRefresh3;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffMobile;
    private javax.swing.JTextField txtStaffNIC;
    private javax.swing.JTextField txtStaffName;
    // End of variables declaration//GEN-END:variables

}
