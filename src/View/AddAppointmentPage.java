
package View;


import Controller.ControllerDeleteData;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;
import Controller.ControllerSendData;
import Controller.ControllerGetData;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AddAppointmentPage extends javax.swing.JFrame {

 
    public AddAppointmentPage() {
        initComponents();
          setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        this.setLocation(381,185);
        table1.fixTable(jScrollPane1);
        for(int i=0;i<7;i++){
        table1.setColumnAlignment(i, JLabel.CENTER);
        table1.setCellAlignment(i, JLabel.CENTER);
        }
             
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new View.TableDark();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPN = new javax.swing.JTextField();
        txtCA = new javax.swing.JTextField();
        txtCNIC = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnAppointment = new javax.swing.JButton();
        panelReasons = new javax.swing.JPanel();
        panelCover = new javax.swing.JPanel();
        panelFemale = new javax.swing.JPanel();
        checkHDF = new javax.swing.JCheckBox();
        checkMUF = new javax.swing.JCheckBox();
        checkHCF = new javax.swing.JCheckBox();
        checkHSF = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        panelMale = new javax.swing.JPanel();
        checkHDM = new javax.swing.JCheckBox();
        checkHCM = new javax.swing.JCheckBox();
        checkHSM = new javax.swing.JCheckBox();
        checkBSM = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSR = new javax.swing.JTextArea();
        txtCN = new javax.swing.JTextField();
        txtSC = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRefresh = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(920, 570));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setAutoCreateRowSorter(true);
        table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Customer Name", "Customer NIC", "Gender", "Moblie", "Reason", "Service Cost"
            }
        ));
        table1.setCellSelectionEnabled(true);
        table1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 397, 860, 150));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Appointment ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Customer Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cannot change Details After Confirmation");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 210, 20));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Customer NIC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, -1));

        txtPN.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtPN.setAlignmentX(5.0F);
        txtPN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 280, 30));

        txtCA.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCA.setAlignmentX(5.0F);
        txtCA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 280, 30));

        txtCNIC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCNIC.setAlignmentX(5.0F);
        txtCNIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 280, 30));

        radioFemale.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        radioFemale.setIconTextGap(8);
        jPanel1.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 130, 30));

        radioMale.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(radioMale);
        radioMale.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        radioMale.setText("Male");
        radioMale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        radioMale.setIconTextGap(8);
        jPanel1.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        btnAppointment.setBackground(new java.awt.Color(255, 102, 51));
        btnAppointment.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnAppointment.setForeground(new java.awt.Color(51, 51, 51));
        btnAppointment.setText("ADD APPOINTMENT");
        btnAppointment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAppointment.setFocusPainted(false);
        btnAppointment.setFocusable(false);
        btnAppointment.setRequestFocusEnabled(false);
        btnAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAppointmentMouseClicked(evt);
            }
        });
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 170, 25));

        panelReasons.setBackground(new java.awt.Color(204, 204, 255));
        panelReasons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        panelReasons.setForeground(new java.awt.Color(204, 204, 255));
        panelReasons.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelCoverLayout = new javax.swing.GroupLayout(panelCover);
        panelCover.setLayout(panelCoverLayout);
        panelCoverLayout.setHorizontalGroup(
            panelCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        panelCoverLayout.setVerticalGroup(
            panelCoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        panelReasons.add(panelCover, "card4");

        panelFemale.setBackground(new java.awt.Color(255, 255, 255));

        checkHDF.setBackground(new java.awt.Color(255, 255, 255));
        checkHDF.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHDF.setForeground(new java.awt.Color(51, 51, 51));
        checkHDF.setText("Hair Dye     Rs 600");
        checkHDF.setIconTextGap(8);

        checkMUF.setBackground(new java.awt.Color(255, 255, 255));
        checkMUF.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkMUF.setForeground(new java.awt.Color(51, 51, 51));
        checkMUF.setText("Make Up     Rs 650");
        checkMUF.setIconTextGap(8);

        checkHCF.setBackground(new java.awt.Color(255, 255, 255));
        checkHCF.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHCF.setForeground(new java.awt.Color(51, 51, 51));
        checkHCF.setText("Hair Colour     Rs 500");
        checkHCF.setIconTextGap(8);

        checkHSF.setBackground(new java.awt.Color(255, 255, 255));
        checkHSF.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHSF.setForeground(new java.awt.Color(51, 51, 51));
        checkHSF.setText("Hair Style     Rs 1000");
        checkHSF.setIconTextGap(8);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Female");

        javax.swing.GroupLayout panelFemaleLayout = new javax.swing.GroupLayout(panelFemale);
        panelFemale.setLayout(panelFemaleLayout);
        panelFemaleLayout.setHorizontalGroup(
            panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFemaleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkHDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkHCF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkMUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkHSF, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFemaleLayout.setVerticalGroup(
            panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFemaleLayout.createSequentialGroup()
                .addGroup(panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFemaleLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkHDF)
                            .addComponent(checkHSF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelFemaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelFemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkMUF, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(checkHCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );

        panelReasons.add(panelFemale, "card3");

        panelMale.setBackground(new java.awt.Color(255, 255, 255));
        panelMale.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        checkHDM.setBackground(new java.awt.Color(255, 255, 255));
        checkHDM.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHDM.setForeground(new java.awt.Color(51, 51, 51));
        checkHDM.setText("Hair Dye     Rs 500");
        checkHDM.setIconTextGap(8);

        checkHCM.setBackground(new java.awt.Color(255, 255, 255));
        checkHCM.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHCM.setForeground(new java.awt.Color(51, 51, 51));
        checkHCM.setText("Hair Colour     Rs 550");
        checkHCM.setIconTextGap(8);
        checkHCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHCMActionPerformed(evt);
            }
        });

        checkHSM.setBackground(new java.awt.Color(255, 255, 255));
        checkHSM.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkHSM.setForeground(new java.awt.Color(51, 51, 51));
        checkHSM.setText("Hair Style     Rs 700");
        checkHSM.setIconTextGap(8);

        checkBSM.setBackground(new java.awt.Color(255, 255, 255));
        checkBSM.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        checkBSM.setForeground(new java.awt.Color(51, 51, 51));
        checkBSM.setText("Beard Shave     Rs 450");
        checkBSM.setIconTextGap(8);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Male");

        javax.swing.GroupLayout panelMaleLayout = new javax.swing.GroupLayout(panelMale);
        panelMale.setLayout(panelMaleLayout);
        panelMaleLayout.setHorizontalGroup(
            panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaleLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkHDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkHCM, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkHSM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBSM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMaleLayout.setVerticalGroup(
            panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaleLayout.createSequentialGroup()
                .addGroup(panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMaleLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkHDM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkHSM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7))
                    .addGroup(panelMaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelMaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkHCM, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(checkBSM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelReasons.add(panelMale, "card2");

        jPanel1.add(panelReasons, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 430, 100));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 1, 360));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Select the reason for appointment");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 260, 20));

        btnSelect.setBackground(new java.awt.Color(255, 102, 51));
        btnSelect.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(51, 51, 51));
        btnSelect.setText("SELECT");
        btnSelect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelect.setFocusPainted(false);
        btnSelect.setFocusable(false);
        btnSelect.setRequestFocusEnabled(false);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, 25));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Confirm Details");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 140, 50));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Customer Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Services Requested");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 130, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("Total Service Cost");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 120, -1));

        txtAID.setEditable(false);
        txtAID.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtAID.setAlignmentX(20.0F);
        txtAID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtAID, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 230, 40));

        txtSR.setEditable(false);
        txtSR.setColumns(20);
        txtSR.setRows(5);
        txtSR.setAlignmentX(20.0F);
        txtSR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(txtSR);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 230, 90));

        txtCN.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtCN.setAlignmentX(5.0F);
        txtCN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, 30));

        txtSC.setEditable(false);
        txtSC.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtSC.setAlignmentX(20.0F);
        txtSC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 230, 40));

        btnConfirm.setBackground(new java.awt.Color(255, 102, 51));
        btnConfirm.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(51, 51, 51));
        btnConfirm.setText("CONFIRM");
        btnConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.setFocusPainted(false);
        btnConfirm.setFocusable(false);
        btnConfirm.setRequestFocusEnabled(false);
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 110, 25));

        btnCancel.setBackground(new java.awt.Color(255, 102, 51));
        btnCancel.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 51, 51));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.setFocusPainted(false);
        btnCancel.setFocusable(false);
        btnCancel.setRequestFocusEnabled(false);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 100, 25));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
      
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void checkHCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHCMActionPerformed
        
    }//GEN-LAST:event_checkHCMActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
    checkBSM.setSelected(false);
    checkHCF.setSelected(false);
    checkHCM.setSelected(false);
    checkHDF.setSelected(false);
    checkHDM.setSelected(false);
    checkHSM.setSelected(false);
    checkMUF.setSelected(false);
    checkHSF.setSelected(false);
    
     if(radioMale.isSelected()){
      panelCover.setVisible(false);
      panelFemale.setVisible(false);
      panelMale.setVisible(true);
     }
     else if(radioFemale.isSelected()){
      panelCover.setVisible(false);
      panelMale.setVisible(false);
      panelFemale.setVisible(true); 
     }
       
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
      FormValidate1();   
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
    if(!("".equals(txtSR.getText()))){
       JOptionPane.showMessageDialog(null,"Details Confirmed !");
       }
    else{
     FormValidate1();
    }
        
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//         ControllerGetData CGD1 = new ControllerGetData();
//        try {
//            ResultSet result = CGD1.getAppointmentData();
//             while(result.next()){
//              String App_id = result.getString("appointment_id");
//              String c_name = result.getString("c_name");
//              String c_nic = result.getString("c_nic");
//              String gender = result.getString("gender");
//              String mobile = result.getString("c_mobile");
//              String reason = result.getString("reason");
//              String service_cost = result.getString("service_cost");
//          String TBLdata[] = {App_id,c_name,c_nic,gender,mobile,reason,service_cost};
//          DefaultTableModel tblModel = (DefaultTableModel)table1.getModel();
//          tblModel.addRow(TBLdata);
//             }
//       
//        } catch (Exception ex) {
//            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
     btnConfirm.setEnabled(true);
     txtCN.setText("");
     txtCNIC.setText("");
     txtCA.setText("");
     txtPN.setText("");
     checkBSM.setSelected(false);
     checkHCF.setSelected(false);
     checkHCM.setSelected(false);
     checkHDF.setSelected(false);
     checkHDM.setSelected(false);
     checkHSM.setSelected(false);
     checkMUF.setSelected(false);
     checkHSF.setSelected(false);
     txtAID.setText("");
     txtSR.setText("");
     txtSC.setText("");
     Fee = 0;
     ReasonDisplay = "";
     ReasonSend = "";
     FinalReason = "";
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAppointmentMouseClicked
       
     if(Fee == 0 || ReasonDisplay.equals("")){
        JOptionPane.showMessageDialog(null,"Details not Confirmed !");
     }else{
        try{
        ControllerSendData CSD = new ControllerSendData();
        CSD.AddAppointment(AppointmentID,customerName, customerNIC,Gender,customerPhone,FinalReason,Fee);
        AddAppointmentPage AAP1 = new AddAppointmentPage();
        AAP1.setVisible(true);
        AAP1.refreshTables();
        this.setVisible(false);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Something Went Wrong !");
        } 
     } 
          
    }//GEN-LAST:event_btnAppointmentMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
          this.dispose();
          AddAppointmentPage page = new  AddAppointmentPage();
          page.setVisible(true);
          page.refreshTables();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.getSelectedRow();
        String id = table1.getModel().getValueAt(row,0).toString();
        try{
         ControllerDeleteData CDD = new  ControllerDeleteData();
         int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete Appointment with id : "+id," Confirmation",JOptionPane.YES_NO_OPTION);
         if(result==JOptionPane.YES_OPTION){
          CDD.DeleteAppointment(id);
          refreshTables();
          
         }
        
        }catch(Exception ex){
        
        }
        
    }//GEN-LAST:event_table1MouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(AddAppointmentPage.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked
   private void FormValidate1(){
     if(txtCA.getText().equals("")|| txtCN.getText().equals("") || txtCNIC.getText().equals("")|| txtPN.getText().equals("") ){
         JOptionPane.showMessageDialog(null,"All Fields Are Required");
     }
     else if(!radioMale.isSelected() && !radioFemale.isSelected()){
         JOptionPane.showMessageDialog(null,"Select Gender");
     }
     else if(!txtCN.getText().matches("^[a-zA-Z\\s]*")){
         JOptionPane.showMessageDialog(null,"Name can only contain Letters");
     }
     else if(!txtPN.getText().matches("^[0-9]*$")){
         JOptionPane.showMessageDialog(null,"Phone number can only contain numbers");
     }
     else if((!txtPN.getText().matches("^[0-9]{9,10}$"))){
         JOptionPane.showMessageDialog(null,"Phone number should be a number between 9 to 10");
     }
     else{
         ProcessData();
       }
    }
   private String customerName,customerNIC,customerAddress,customerPhone,Gender,ReasonSend,ReasonDisplay,AppointmentID,FinalReason;
   private int Fee;
   
   private void ProcessData(){
     if(radioMale.isSelected()){
     Gender = "Male";
     }else if(radioFemale.isSelected()){
     Gender = "Female";
     }
     ReasonDisplay = "";
     FinalReason = "";
     ReasonSend = "";
     if("Male".equals(Gender)){
       if(checkBSM.isSelected()){
       ReasonSend = ReasonSend + "Beard Shave,";
       ReasonDisplay = ReasonDisplay + "Beard Shave\n";
       Fee = Fee + 450;
      }if(checkHDM.isSelected()){
       ReasonSend = ReasonSend + "Hair Dye,";
       ReasonDisplay = ReasonDisplay + "Hair Dye\n";
       Fee = Fee + 500;
      }if(checkHSM.isSelected()){
       ReasonSend = ReasonSend + "Hair Style,";
       ReasonDisplay = ReasonDisplay + "Hair Style\n";
       Fee = Fee + 700;
      }if(checkHCM.isSelected()){
       ReasonSend = ReasonSend + "Hair Colour,";
       ReasonDisplay = ReasonDisplay + "Hair Colour\n";
       Fee = Fee + 550;
      }
     }else if("Female".equals(Gender)){
       if(checkMUF.isSelected()){
       ReasonSend = ReasonSend + "Make Up,";
       ReasonDisplay = ReasonDisplay + "Make Up\n";
       Fee = Fee + 650;
      }if(checkHSF.isSelected()){
       ReasonSend = ReasonSend + "Hair Style,";
       ReasonDisplay = ReasonDisplay + "Hair Style\n";
       Fee = Fee + 1000;
      }if(checkHDF.isSelected()){
       ReasonSend = ReasonSend + "Hair Dye,";
       ReasonDisplay = ReasonDisplay + "Hair Dye\n";
       Fee = Fee + 600;
      }if(checkHCF.isSelected()){
       ReasonSend = ReasonSend + "Hair Colour,";
       ReasonDisplay = ReasonDisplay + "Hair Colour\n";
       Fee = Fee + 500;
      }
     }
     customerName = txtCN.getText();
     customerNIC = txtCNIC.getText();
     customerAddress = txtCA.getText();
     customerPhone = txtPN.getText();
     FinalReason = ReasonSend.substring(0, ReasonSend.length() - 1);
     AppointmentID = customerNIC.substring(customerNIC.length() - 6);
     txtAID.setText(AppointmentID);
     txtSR.setText(ReasonDisplay);
     txtSC.setText(String.valueOf(Fee));
     btnConfirm.setEnabled(false);
     txtCN.setText("");
     txtCNIC.setText("");
     txtCA.setText("");
     txtPN.setText("");
    checkBSM.setSelected(false);
    checkHCF.setSelected(false);
    checkHCM.setSelected(false);
    checkHDF.setSelected(false);
    checkHDM.setSelected(false);
    checkHSM.setSelected(false);
    checkMUF.setSelected(false);
    checkHSF.setSelected(false);
   }
    public void refreshTables(){
    DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
    model1.setRowCount(0);
    
    ControllerGetData CGD1 = new ControllerGetData();
        try {
            ResultSet result = CGD1.getAppointmentData();
             while(result.next()){
              String App_id = result.getString("appointment_id");
              String c_name = result.getString("c_name");
              String c_nic = result.getString("c_nic");
              String gender = result.getString("gender");
              String mobile = result.getString("c_mobile");
              String reason = result.getString("reason");
              String service_cost = result.getString("service_cost");
          String TBLdata[] = {App_id,c_name,c_nic,gender,mobile,reason,service_cost};
          DefaultTableModel tblModel = (DefaultTableModel)table1.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAppointmentPage().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBSM;
    private javax.swing.JCheckBox checkHCF;
    private javax.swing.JCheckBox checkHCM;
    private javax.swing.JCheckBox checkHDF;
    private javax.swing.JCheckBox checkHDM;
    private javax.swing.JCheckBox checkHSF;
    private javax.swing.JCheckBox checkHSM;
    private javax.swing.JCheckBox checkMUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCover;
    private javax.swing.JPanel panelFemale;
    private javax.swing.JPanel panelMale;
    private javax.swing.JPanel panelReasons;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private View.TableDark table1;
    private javax.swing.JTextField txtAID;
    private javax.swing.JTextField txtCA;
    private javax.swing.JTextField txtCN;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtPN;
    private javax.swing.JTextField txtSC;
    private javax.swing.JTextArea txtSR;
    // End of variables declaration//GEN-END:variables
}
