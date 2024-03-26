
package View;

import Controller.ControllerDeleteData;
import Controller.ControllerGetData;
import Controller.ControllerSendData;
import Controller.ControllerUpdateData;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageStaffPage extends javax.swing.JFrame {

  
    public ManageStaffPage() {
        initComponents();
         setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
         this.setLocation(381,185);
        DefaultTableModel tblModel = (DefaultTableModel) tableStaff.getModel();
        tblModel.setColumnCount(7); 
        tableStaff.fixTable(jScrollPane2);
        for(int i = 0;i<7;i++){
        tableStaff.setColumnAlignment(i, JLabel.CENTER);
        tableStaff.setCellAlignment(i, JLabel.CENTER);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pageAddStaff = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        checkMakeUp = new javax.swing.JCheckBox();
        checkHairDye = new javax.swing.JCheckBox();
        checkHairColour = new javax.swing.JCheckBox();
        checkShave = new javax.swing.JCheckBox();
        checkHairStyle = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pageManageStaff1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStaff = new View.TableDark();
        btnUpdate = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtStaffSkills = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtStaffName = new javax.swing.JTextField();
        txtStaffNIC = new javax.swing.JTextField();
        txtStaffMobile = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        txtStaffGender = new javax.swing.JTextField();
        btnManageMember = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        btnRefresh = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel9.setText("Manage Staff");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        pageAddStaff.setBackground(new java.awt.Color(255, 255, 255));
        pageAddStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Gender");
        pageAddStaff.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 130, 20));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageAddStaff.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 290, 30));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageAddStaff.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 290, 30));

        txtNIC.setBackground(new java.awt.Color(204, 204, 204));
        txtNIC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtNIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageAddStaff.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 290, 30));

        txtMobile.setBackground(new java.awt.Color(204, 204, 204));
        txtMobile.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtMobile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageAddStaff.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 290, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Add New Member");
        pageAddStaff.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 160, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Select Skills");
        pageAddStaff.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 130, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Enter NIC");
        pageAddStaff.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Enter Mobile Number");
        pageAddStaff.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Enter Address");
        pageAddStaff.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 130, 30));

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtAddress);

        pageAddStaff.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 290, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Enter Email");
        pageAddStaff.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 20));

        buttonGroup1.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setIconTextGap(12);
        pageAddStaff.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 90, -1));

        buttonGroup1.add(radioMale);
        radioMale.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        radioMale.setText("Male");
        radioMale.setIconTextGap(12);
        pageAddStaff.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, -1));

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkMakeUp.setBackground(new java.awt.Color(204, 204, 204));
        checkMakeUp.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkMakeUp.setText("Make Up");
        checkMakeUp.setIconTextGap(12);
        jPanel2.add(checkMakeUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        checkHairDye.setBackground(new java.awt.Color(204, 204, 204));
        checkHairDye.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHairDye.setText("Hair Dye");
        checkHairDye.setIconTextGap(12);
        jPanel2.add(checkHairDye, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, 90, -1));

        checkHairColour.setBackground(new java.awt.Color(204, 204, 204));
        checkHairColour.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHairColour.setText("Hair Colour");
        checkHairColour.setIconTextGap(12);
        jPanel2.add(checkHairColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 100, -1));

        checkShave.setBackground(new java.awt.Color(204, 204, 204));
        checkShave.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkShave.setText("Shave and Trim");
        checkShave.setIconTextGap(12);
        jPanel2.add(checkShave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, 20));

        checkHairStyle.setBackground(new java.awt.Color(204, 204, 204));
        checkHairStyle.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHairStyle.setText("Hair Style");
        checkHairStyle.setIconTextGap(12);
        checkHairStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHairStyleActionPerformed(evt);
            }
        });
        jPanel2.add(checkHairStyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        jLayeredPane2.add(jPanel2, "card2");

        pageAddStaff.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 320, 130));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Enter Name");
        pageAddStaff.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 20));

        btnAdd.setBackground(new java.awt.Color(255, 102, 51));
        btnAdd.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAdd.setText("Add Appointment");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pageAddStaff.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 190, 30));

        btnCancel.setBackground(new java.awt.Color(255, 102, 51));
        btnCancel.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pageAddStaff.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 110, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pageAddStaff.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 1, 500));

        jLayeredPane1.add(pageAddStaff, "card2");

        pageManageStaff1.setBackground(new java.awt.Color(255, 255, 255));
        pageManageStaff1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Manage Members");
        pageManageStaff1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 160, 40));

        tableStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member_ID", "Name", "Mobile", "NIC", "Gender", "Skills", "Status"
            }
        ));
        tableStaff.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tableStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStaffMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableStaff);

        pageManageStaff1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 860, 170));

        btnUpdate.setBackground(new java.awt.Color(232, 225, 225));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 102, 0));
        btnUpdate.setText("Update Details");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        pageManageStaff1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        btnStatus.setBackground(new java.awt.Color(232, 225, 225));
        btnStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnStatus.setForeground(new java.awt.Color(255, 102, 0));
        btnStatus.setText("Change Status");
        btnStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatusMouseClicked(evt);
            }
        });
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        pageManageStaff1.add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 30));

        jButton4.setBackground(new java.awt.Color(232, 225, 225));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setText("Delete All Members");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pageManageStaff1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 1, 280));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("Status");
        pageManageStaff1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 50, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Name ");
        pageManageStaff1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 70, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel14.setText("NIC");
        pageManageStaff1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 70, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel15.setText("Mobile");
        pageManageStaff1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 70, 30));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel16.setText("Skills");
        pageManageStaff1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 70, 30));

        txtStaffSkills.setEditable(false);
        txtStaffSkills.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffSkills.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffSkills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStaffSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 250, 30));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(204, 204, 204));
        txtStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 250, 30));

        txtStaffName.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtStaffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffNameActionPerformed(evt);
            }
        });
        pageManageStaff1.add(txtStaffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 250, 30));

        txtStaffNIC.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffNIC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffNIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStaffNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 250, 30));

        txtStaffMobile.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffMobile.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffMobile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStaffMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 250, 30));

        btnDelete.setBackground(new java.awt.Color(232, 225, 225));
        btnDelete.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 102, 0));
        btnDelete.setText("Delete Member");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        pageManageStaff1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 30));

        jButton1.setBackground(new java.awt.Color(232, 225, 225));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Generate Report");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 160, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel17.setText("Staff ID");
        pageManageStaff1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 70, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel18.setText("Gender");
        pageManageStaff1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 50, 30));

        txtStaffID.setEditable(false);
        txtStaffID.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 250, 30));

        txtStaffGender.setEditable(false);
        txtStaffGender.setBackground(new java.awt.Color(204, 204, 204));
        txtStaffGender.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtStaffGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pageManageStaff1.add(txtStaffGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 250, 30));

        jLayeredPane1.add(pageManageStaff1, "card3");

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 900, 520));

        btnManageMember.setBackground(new java.awt.Color(102, 102, 102));
        btnManageMember.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnManageMember.setForeground(new java.awt.Color(255, 255, 255));
        btnManageMember.setText("Manage Members");
        btnManageMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageMemberMouseClicked(evt);
            }
        });
        jPanel1.add(btnManageMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 20));

        btnAddMember.setBackground(new java.awt.Color(102, 102, 102));
        btnAddMember.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnAddMember.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMember.setText("Add New Member");
        btnAddMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMemberMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 20));

        btnRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, -4, 30, 40));

        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-macos-minimize-23.png"))); // NOI18N
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        ManageStaffPage MSP = new  ManageStaffPage();
        this.dispose();
        MSP.setVisible(true);
        MSP.refreshTable();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void checkHairStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHairStyleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHairStyleActionPerformed

    private void btnAddMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMouseClicked
        pageAddStaff.setVisible(true);
        pageManageStaff1.setVisible(false);
        
    }//GEN-LAST:event_btnAddMemberMouseClicked

    private void btnManageMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageMemberMouseClicked
        pageManageStaff1.setVisible(true);
        pageAddStaff.setVisible(false);
    }//GEN-LAST:event_btnManageMemberMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    String name,mobile,nic,gender,skills,id;
    private void SetupData(){
      name = txtName.getText();
      mobile = txtMobile.getText();
      nic=txtNIC.getText();
      skills = "";
      if(radioMale.isSelected()){
      gender = "Male";
      }else if(radioFemale.isSelected()){
      gender = "Female";
      }
      //Skill selection
      if(checkHairStyle.isSelected()){
       skills = skills + "Hair Style,";
      }
      if(checkHairColour.isSelected()){
       skills = skills + "Hair Colour,";
      }
       if(checkHairDye.isSelected()){
       skills = skills + "Hair Dye,";
      }
       if(checkMakeUp.isSelected()){
       skills = skills + "Make Up,";
      }
       if(checkShave.isSelected()){
       skills = skills + "Shave and Trim,";
      }
      skills = skills.substring(0, skills.length() - 1);
      id = nic.substring(nic.length() - 6);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      if(txtName.getText().equals("")||txtMobile.getText().equals("")||txtNIC.getText().equals("")||(!radioMale.isSelected() && !radioFemale.isSelected())){
        JOptionPane.showMessageDialog(null,"All fields are required !");
      }else{
       SetupData();
       if(skills.equals("")){
        JOptionPane.showMessageDialog(null,"No skills selected !");   
       }
       else{
        ControllerSendData CSD = new ControllerSendData();
           try {
               CSD.InsertStaffDetails(id, name, mobile, nic, gender, skills);
               ManageStaffPage MSP = new  ManageStaffPage();
               this.dispose();
               MSP.setVisible(true);
               MSP.refreshTable();
           } catch (SQLException ex) {
               Logger.getLogger(ManageStaffPage.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
      }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       ManageStaffPage MSP = new  ManageStaffPage();
        this.dispose();
         MSP.setVisible(true);
            MSP.refreshTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//         ControllerGetData CGD1 = new ControllerGetData();
//            try {
//            ResultSet result = CGD1.getStaffDetails();
//             while(result.next()){
//              //appointment
//              String id = result.getString("sm_id");
//              String name = result.getString("sm_name");
//              String nic = result.getString("sm_mobile");
//              String mobile = result.getString("sm_nic");
//              String gender = result.getString("gender");
//              String skills  = result.getString("sm_skills");
//              String status  = result.getString("Availability_Status");
//              
//          String TBLdata[] = {id,name,nic,mobile,gender,skills,status};
//          DefaultTableModel tblModel = (DefaultTableModel)tableStaff.getModel();
//          tblModel.addRow(TBLdata);
//             }
//       
//        } catch (Exception ex) {
//            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            
    }//GEN-LAST:event_formWindowOpened

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatusActionPerformed

    private void txtStaffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffNameActionPerformed

    private void tableStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStaffMouseClicked
        int row = tableStaff.getSelectedRow();
        
          txtStaffID.setText("");
          txtStaffName.setText("");
          txtStaffMobile.setText("");
          txtStaffNIC.setText("");
          txtStaffGender.setText("");
          txtStaffSkills.setText("");
          txtStatus.setText("");
           String id ="";
           String name="";
           String nic="";
           String mobile="";
           String gender="";
           String skills="";
           String status="";
           // Row found in table2
             id = tableStaff.getValueAt(row, 0).toString();
             name = tableStaff.getValueAt(row, 1).toString();
             nic = tableStaff.getValueAt(row, 3).toString();
             mobile = tableStaff.getValueAt(row, 2).toString();
             gender = tableStaff.getValueAt(row, 4).toString();
             skills = tableStaff.getValueAt(row, 5).toString();
            status = tableStaff.getValueAt(row, 6).toString();
             txtStaffID.setText(id);
             txtStaffName.setText(name);
             txtStaffMobile.setText(mobile);
             txtStaffNIC.setText(nic);
             txtStaffGender.setText(gender);
             txtStaffSkills.setText(skills);
             txtStatus.setText(status);   
    }//GEN-LAST:event_tableStaffMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
      if(!txtStaffID.getText().equals("")){
       String name,nic,mobile,id,newId;
       id =  txtStaffID.getText();
       name = txtStaffName.getText();
       nic = txtStaffNIC.getText();
       mobile= txtStaffMobile.getText();
       newId = nic.substring(nic.length() - 6);
       ControllerUpdateData CUD = new ControllerUpdateData();
        try {
            CUD.UpdateStaddDetails(id, name, nic, mobile, newId);
            this.dispose();
            ManageStaffPage MSP = new ManageStaffPage();
            MSP.setVisible(true);
            MSP.refreshTable();
            MSP.pageAddStaff.setVisible(false);
            MSP.pageManageStaff1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ManageStaffPage.class.getName()).log(Level.SEVERE, null, ex);
        }
      }else{
      JOptionPane.showMessageDialog(null,"Select a Member to Update !");
      }
        
    
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatusMouseClicked
      if(!txtStaffID.getText().equals("")){
        String status = txtStatus.getText();
        String id = txtStaffID.getText();
        if( status.equals("Unavailable")){
            ControllerUpdateData CUD = new ControllerUpdateData();
            try {
            CUD.UpdateStatusAvailable(id);
            this.dispose();
            ManageStaffPage MSP = new ManageStaffPage();
            MSP.setVisible(true);
            MSP.refreshTable();
            MSP.pageAddStaff.setVisible(false);
            MSP.pageManageStaff1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ManageStaffPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(status.equals("Available")){
        ControllerUpdateData CUD = new ControllerUpdateData();
            try {
                 CUD.UpdateStatusUnavailable(id);
                 this.dispose();
                 ManageStaffPage MSP = new ManageStaffPage();
                 MSP.setVisible(true);
                 MSP.refreshTable();
                 MSP.pageAddStaff.setVisible(false);
                 MSP.pageManageStaff1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ManageStaffPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      }else{
        JOptionPane.showMessageDialog(null,"Select a Member to Update Status !");
      }
    }//GEN-LAST:event_btnStatusMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
         if(!txtStaffID.getText().equals("")){
          String id =txtStaffID.getText(); 
          ControllerDeleteData CDD = new ControllerDeleteData();
             try {
                  CDD.DeleteStaff(id);
                  this.dispose();
                  ManageStaffPage MSP = new ManageStaffPage();
                  MSP.setVisible(true);
                  MSP.refreshTable();
                  MSP.pageAddStaff.setVisible(false);
                  MSP.pageManageStaff1.setVisible(true);
             } catch (SQLException ex) {
                 Logger.getLogger(ManageStaffPage.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else{
           JOptionPane.showMessageDialog(null,"Select a Member to Delete !");
         }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
       this.setExtendedState(ManageStaffPage.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked
  
public void refreshTable(){
  // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableStaff.getModel();
    model1.setRowCount(0);
     // Populate tableAppointmentDetails4 with fresh data
      ControllerGetData CGD1 = new ControllerGetData();
            try {
            ResultSet result = CGD1.getStaffDetails();
             while(result.next()){
              //appointment
              String id = result.getString("sm_id");
              String name = result.getString("sm_name");
              String nic = result.getString("sm_mobile");
              String mobile = result.getString("sm_nic");
              String gender = result.getString("gender");
              String skills  = result.getString("sm_skills");
              String status  = result.getString("Availability_Status");
              
          String TBLdata[] = {id,name,nic,mobile,gender,skills,status};
          DefaultTableModel tblModel = (DefaultTableModel)tableStaff.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  
}
  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStaffPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnManageMember;
    private javax.swing.JLabel btnMin;
    public javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnStatus;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkHairColour;
    private javax.swing.JCheckBox checkHairDye;
    private javax.swing.JCheckBox checkHairStyle;
    private javax.swing.JCheckBox checkMakeUp;
    private javax.swing.JCheckBox checkShave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JPanel pageAddStaff;
    public javax.swing.JPanel pageManageStaff1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    public View.TableDark tableStaff;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtRefresh2;
    private javax.swing.JLabel txtRefresh3;
    private javax.swing.JTextField txtStaffGender;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffMobile;
    private javax.swing.JTextField txtStaffNIC;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtStaffSkills;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
