
package View;

import Controller.ControllerGetData;
import Controller.ControllerSendAndGetStoreData;
import Controller.ControllerSendData;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

public class AssignStaff extends javax.swing.JFrame {

  SelectDetails SD1 = new SelectDetails();  
 public AssignStaff() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        this.setLocation(381,185);
          tableAssignments.fixTable(jScrollPane3);
        for(int i = 0;i<7;i++){
          tableAssignments.setColumnAlignment(i, JLabel.CENTER);
          tableAssignments.setCellAlignment(i, JLabel.CENTER);
          }
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSelectStaff = new javax.swing.JButton();
        btnAddAppointment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStaffDetails = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAppoitmentDetails = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datePicker = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnSelectAppointment = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spinnerTime = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAssignments = new View.TableDark();
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

        btnSelectStaff.setBackground(new java.awt.Color(255, 102, 51));
        btnSelectStaff.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnSelectStaff.setForeground(new java.awt.Color(51, 51, 51));
        btnSelectStaff.setText("SELECT STAFF");
        btnSelectStaff.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelectStaff.setFocusPainted(false);
        btnSelectStaff.setFocusable(false);
        btnSelectStaff.setRequestFocusEnabled(false);
        btnSelectStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectStaffMouseEntered(evt);
            }
        });
        btnSelectStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 25));

        btnAddAppointment.setBackground(new java.awt.Color(255, 102, 51));
        btnAddAppointment.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnAddAppointment.setForeground(new java.awt.Color(51, 51, 51));
        btnAddAppointment.setText("ASSIGN");
        btnAddAppointment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddAppointment.setFocusPainted(false);
        btnAddAppointment.setFocusable(false);
        btnAddAppointment.setRequestFocusEnabled(false);
        btnAddAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAppointmentMouseClicked(evt);
            }
        });
        btnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 140, 30));

        txtStaffDetails.setEditable(false);
        txtStaffDetails.setColumns(20);
        txtStaffDetails.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        txtStaffDetails.setForeground(new java.awt.Color(102, 102, 102));
        txtStaffDetails.setRows(5);
        txtStaffDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtStaffDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStaffDetails.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtStaffDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 610, 130));

        txtAppoitmentDetails.setEditable(false);
        txtAppoitmentDetails.setColumns(20);
        txtAppoitmentDetails.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        txtAppoitmentDetails.setForeground(new java.awt.Color(102, 102, 102));
        txtAppoitmentDetails.setRows(5);
        txtAppoitmentDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAppoitmentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAppoitmentDetails.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(txtAppoitmentDetails);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 26, 610, 130));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Select Time");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 20));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Appointment To Assign");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, 50));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Select Staff Member To Assign");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 50));

        datePicker.setDateFormatString("yyyy-MM-dd");
        datePicker.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jPanel1.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 170, 30));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Select Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        btnSelectAppointment.setBackground(new java.awt.Color(255, 102, 51));
        btnSelectAppointment.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        btnSelectAppointment.setForeground(new java.awt.Color(51, 51, 51));
        btnSelectAppointment.setText("SELECT APPOINTMENT");
        btnSelectAppointment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSelectAppointment.setFocusPainted(false);
        btnSelectAppointment.setFocusable(false);
        btnSelectAppointment.setRequestFocusEnabled(false);
        btnSelectAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectAppointmentMouseClicked(evt);
            }
        });
        btnSelectAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAppointmentActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 25));

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
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 90, 30));

        spinnerTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        spinnerTime.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(spinnerTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 170, 30));
        JSpinner.DateEditor de = new JSpinner.DateEditor(spinnerTime, "HH:mm:ss");
        spinnerTime.setEditor(de);

        tableAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Member ID", "Appointment ID", "Time", "Date", "Status"
            }
        ));
        tableAssignments.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(tableAssignments);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 860, 170));

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
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectStaffMouseClicked
      if(SD1.isVisible()){
       SD1.dispose();
      }else{
       SD1.setVisible(true);
       SD1.panelStaffData.setVisible(true);
       SD1.refreshStaffDetails();
       SD1.panelAppointmentData.setVisible(false);
       AssignmentTable();
       }
     
         
    }//GEN-LAST:event_btnSelectStaffMouseClicked

    private void btnSelectStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectStaffActionPerformed

    }//GEN-LAST:event_btnSelectStaffActionPerformed
    
  
  
    private void btnAddAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAppointmentMouseClicked
      
      String AppointmentID ="";
      String StaffID ="";
      String Time = (spinnerTime.getValue().toString()).substring(11); //get time value
      String NewTime = Time.substring(0, Time.length() - 9);
      Date selectedDate = datePicker.getDate(); //get the date from datepicker
      String dateString="";
     
      if (selectedDate == null) {
      JOptionPane.showMessageDialog(null,"Date Not Selected !");
      }else if(NewTime == null){
        JOptionPane.showMessageDialog(null,"Time Not Selected !");
      }else if(txtAppoitmentDetails.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Appointment Not Selected !");
      }else if(txtStaffDetails.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Staff Member Not Selected !");
      }
      else{
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      dateString = dateFormat.format(selectedDate);
      ControllerSendAndGetStoreData csd = new ControllerSendAndGetStoreData();
      AppointmentID = csd.GetCurrentID();
      StaffID = csd.GetCurrentID2();
      System.out.println("Staff iD : "+StaffID );
      System.out.println("AppointmentID  : "+ AppointmentID);
       try{
        ControllerSendData CSD = new ControllerSendData();
        CSD.InsertAssigmentDetails(StaffID,AppointmentID,NewTime,dateString);     
        AssignStaff AS = new  AssignStaff();
        AS.setVisible(true);
        AS.refreshTables();
        this.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Something Went Wrong !"+e.getMessage()); 
        } 
      SD1.CleanAppointmentFile();
      SD1.CleanStaffFile();
      }
     
    }//GEN-LAST:event_btnAddAppointmentMouseClicked

    private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAppointmentActionPerformed

    private void btnSelectAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectAppointmentMouseClicked
      if(SD1.isVisible()){
           SD1.dispose();
      }
      else{ 
           SD1.setVisible(true);
           SD1.panelAppointmentData.setVisible(true);
           SD1.loadAppointmentData();
           SD1.panelStaffData.setVisible(false);
           
      }
        
    
    }//GEN-LAST:event_btnSelectAppointmentMouseClicked

    private void btnSelectAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAppointmentActionPerformed
   
    }//GEN-LAST:event_btnSelectAppointmentActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
      
         this.dispose();
         SD1.CleanAppointmentFile();
         SD1.CleanStaffFile();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
   
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        ControllerGetData CGD1 = new ControllerGetData();
//        try {
//            ResultSet result = CGD1.getAssignData();
//             while(result.next()){
//              String App_id = result.getString("appointment_id");
//              String sm_id = result.getString("sm_id");
//              String time = result.getString("time");
//              String date = result.getString("date");
//              String status = result.getString("status");
//          String TBLdata[] = {App_id,sm_id,time,date,status};
//          DefaultTableModel tblModel = (DefaultTableModel)tableAssignments.getModel();
//          tblModel.addRow(TBLdata);
//             }
//       
//        } catch (Exception ex) {
//            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_formWindowOpened

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
          this.dispose();
          AssignStaff page = new AssignStaff();
          page.AssignmentTable();
          page.setVisible(true);
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

    private void btnSelectStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectStaffMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectStaffMouseEntered

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(AssignStaff.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked
public void refreshTables(){
    // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableAssignments.getModel();
    model1.setRowCount(0);

    // Populate tableAppointmentDetails4 with fresh data
    ControllerGetData CGD1 = new ControllerGetData();
    try {
        ResultSet result = CGD1.getAppointmentDataToManage();
        while (result.next()) {
         String App_id = result.getString("appointment_id");
              String sm_id = result.getString("sm_id");
              String time = result.getString("time");
              String date = result.getString("date");
              String status = result.getString("status");
          String TBLdata[] = {App_id,sm_id,time,date,status};
          DefaultTableModel tblModel = (DefaultTableModel)tableAssignments.getModel();
          tblModel.addRow(TBLdata); 
        }
    } catch (Exception ex) {
        Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
    }


}
public void AssignmentTable(){
      // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableAssignments.getModel();
    model1.setRowCount(0);
    //Get All data to table
      ControllerGetData CGD1 = new ControllerGetData();
        try {
            ResultSet result = CGD1.getAssignData();
             while(result.next()){
              String App_id = result.getString("appointment_id");
              String sm_id = result.getString("sm_id");
              String time = result.getString("time");
              String date = result.getString("date");
              String status = result.getString("status");
          String TBLdata[] = {App_id,sm_id,time,date,status};
          DefaultTableModel tblModel = (DefaultTableModel)tableAssignments.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppointment;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnSelectAppointment;
    private javax.swing.JButton btnSelectStaff;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinnerTime;
    private View.TableDark tableAssignments;
    public javax.swing.JTextArea txtAppoitmentDetails;
    public javax.swing.JTextArea txtStaffDetails;
    // End of variables declaration//GEN-END:variables

    void bringFront() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
