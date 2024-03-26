package View;

import java.awt.geom.RoundRectangle2D;


public class Dashboard extends javax.swing.JFrame {

 AddAppointmentPage AAP = new AddAppointmentPage();
 AssignStaff AS = new AssignStaff();
 SelectDetails SD = new SelectDetails();
 ManageAppointments MA = new ManageAppointments();
 ManageStaffPage MSP = new ManageStaffPage();
 

public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
 }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnDashClose = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMenu4 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JButton();
        btnMenu3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SMSlogo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Good Looks Appointment Management System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 500, 40));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 1, 60));

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 102, 0));
        btnLogout.setText("LOG OUT");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnLogout.setFocusPainted(false);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 120, 40));

        btnDashClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDashClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close (1).white.png"))); // NOI18N
        btnDashClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnDashClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 50, 40));

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minus (1).white.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu4.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMenu4.setForeground(new java.awt.Color(255, 153, 0));
        btnMenu4.setText("Manage Staff");
        btnMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnMenu4.setFocusPainted(false);
        btnMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 50));

        btnMenu1.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMenu1.setForeground(new java.awt.Color(255, 153, 51));
        btnMenu1.setText("Add Appointment");
        btnMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnMenu1.setFocusPainted(false);
        btnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenu1MouseClicked(evt);
            }
        });
        jPanel2.add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 50));

        btnMenu2.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMenu2.setForeground(new java.awt.Color(255, 153, 0));
        btnMenu2.setText("Assign Staff");
        btnMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnMenu2.setFocusPainted(false);
        btnMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenu2MouseClicked(evt);
            }
        });
        jPanel2.add(btnMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 50));

        btnMenu3.setBackground(new java.awt.Color(102, 102, 102));
        btnMenu3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMenu3.setForeground(new java.awt.Color(255, 153, 0));
        btnMenu3.setText("Manage Appointments");
        btnMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnMenu3.setFocusPainted(false);
        btnMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenu3MouseClicked(evt);
            }
        });
        jPanel2.add(btnMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/myHair.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 589));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainImage.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 76, 973, 593));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnDashCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashCloseMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnDashCloseMouseClicked

    private void btnMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseClicked
       AAP.setVisible(true);
       AAP.refreshTables();
       AS.dispose();
       MA.dispose();
       MSP.dispose();
    }//GEN-LAST:event_btnMenu1MouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
       this.setExtendedState(Dashboard.ICONIFIED);
       AAP.setExtendedState(AAP.ICONIFIED);
       AS.setExtendedState(AS.ICONIFIED);
       SD.setExtendedState(SD.ICONIFIED);
       MA.setExtendedState(MA.ICONIFIED);
       MSP.setExtendedState(MSP.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
       this.dispose();
       AAP.dispose();
       AS.dispose();
       MA.dispose();
       MSP.dispose();
       new Login().setVisible(true); 
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
       if(!((evt.getNewState() & AAP.ICONIFIED) == AAP.ICONIFIED)){
          this.setExtendedState(Dashboard.NORMAL);
          AAP.setExtendedState(AAP.NORMAL);
          AS.setExtendedState(AS.NORMAL);
          MA.setExtendedState(MA.NORMAL);
          MSP.setExtendedState(MSP.NORMAL);
         } 
    }//GEN-LAST:event_formWindowStateChanged

    private void btnMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu2MouseClicked
     AS.setVisible(true);
     AS.refreshTables();
     AAP.dispose();
     MA.dispose();
     MSP.dispose();
     SD.CleanAppointmentFile();
     SD.CleanStaffFile();
    }//GEN-LAST:event_btnMenu2MouseClicked

    private void btnMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu3MouseClicked
      MA.setVisible(true);
      AAP.dispose();
      AS.dispose();
      MSP.dispose();
      MA.refreshTables();
    }//GEN-LAST:event_btnMenu3MouseClicked

    private void btnMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu4ActionPerformed
     MSP.setVisible(true);
     MSP.refreshTable();
     AAP.dispose();
     AS.dispose();
     MA.dispose();
    }//GEN-LAST:event_btnMenu4ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDashClose;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnMenu2;
    private javax.swing.JButton btnMenu3;
    private javax.swing.JButton btnMenu4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
