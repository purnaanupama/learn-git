
package View;
import Controller.ControllerGetData;
import Controller.ControllerSendAndGetStoreData;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class SelectDetails extends javax.swing.JFrame {

    public SelectDetails() {

        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
        setLocationRelativeTo(null);
        this.setLocation(440,285);
        tableAppointmentData.fixTable(jScrollPane1);
        for(int i = 0;i<7;i++){
        tableAppointmentData.setColumnAlignment(i, JLabel.CENTER);
        tableAppointmentData.setCellAlignment(i, JLabel.CENTER);
        }
         for(int i = 0;i<7;i++){
         tableStaffData.setColumnAlignment(i, JLabel.CENTER);
         tableStaffData.setCellAlignment(i, JLabel.CENTER);
        }
   
    }
       private AssignStaff AS1;
       private AssignStaff AS2;
 

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelContainer = new javax.swing.JPanel();
        panelStaffData = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStaffData = new View.TableDark();
        panelAppointmentData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAppointmentData = new View.TableDark();
        btnCloseTab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelMain.setBackground(new java.awt.Color(135, 132, 132));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContainer.setBackground(new java.awt.Color(255, 204, 204));
        panelContainer.setLayout(new java.awt.CardLayout());

        tableStaffData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Staff Name", "Mobile Number", "Staff NIC", "Gender", "Skill Set"
            }
        ));
        tableStaffData.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tableStaffData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStaffDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableStaffData);

        javax.swing.GroupLayout panelStaffDataLayout = new javax.swing.GroupLayout(panelStaffData);
        panelStaffData.setLayout(panelStaffDataLayout);
        panelStaffDataLayout.setHorizontalGroup(
            panelStaffDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        panelStaffDataLayout.setVerticalGroup(
            panelStaffDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );

        panelContainer.add(panelStaffData, "card3");

        panelAppointmentData.setBackground(new java.awt.Color(204, 204, 255));

        tableAppointmentData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Customer NIC", "Gender", "Mobile", "Reason", "Service Cost"
            }
        ));
        tableAppointmentData.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        tableAppointmentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAppointmentDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAppointmentData);

        javax.swing.GroupLayout panelAppointmentDataLayout = new javax.swing.GroupLayout(panelAppointmentData);
        panelAppointmentData.setLayout(panelAppointmentDataLayout);
        panelAppointmentDataLayout.setHorizontalGroup(
            panelAppointmentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        panelAppointmentDataLayout.setVerticalGroup(
            panelAppointmentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppointmentDataLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        panelContainer.add(panelAppointmentData, "card2");

        panelMain.add(panelContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 740, 252));

        btnCloseTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-20.png"))); // NOI18N
        btnCloseTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseTabMouseClicked(evt);
            }
        });
        panelMain.add(btnCloseTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseTabMouseClicked
      this.dispose();
    }//GEN-LAST:event_btnCloseTabMouseClicked
    public void loadAppointmentData(){
         // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableAppointmentData.getModel();
    model1.setRowCount(0);
    //Add data
         ControllerGetData CGD1 = new ControllerGetData();
          try {
            ResultSet result = CGD1.getAppointmentData2();
             while(result.next()){
              String App_id = result.getString("appointment_id");
              String c_name = result.getString("c_name");
              String c_nic = result.getString("c_nic");
              String gender = result.getString("gender");
              String mobile = result.getString("c_mobile");
              String reason = result.getString("reason");
              String service_cost = result.getString("service_cost");
          String TBLdata[] = {App_id,c_name,c_nic,gender,mobile,reason,service_cost};
          DefaultTableModel tblModel = (DefaultTableModel)tableAppointmentData.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void loadStaffData() {
          ControllerGetData CGD1 = new ControllerGetData();
        try {
            ResultSet result = CGD1.getStaffData();
             while(result.next()){
              String sm_id = result.getString("sm_id");
              String sm_name = result.getString("sm_name");
              String sm_mobile = result.getString("sm_mobile");
              String sm_nic = result.getString("sm_nic");
              String gender = result.getString("gender");
              String sm_skills = result.getString("sm_skills");
 
          String TBLdata[] = {sm_id ,sm_name,sm_mobile,sm_nic,gender,sm_skills};
          DefaultTableModel tblModel = (DefaultTableModel)tableStaffData.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
//        new Thread(() -> {
//            loadAppointmentData();
//            loadStaffData();
//        }).start();
//     
    }//GEN-LAST:event_formWindowOpened

     
   public  String id,name,nic,gender,mobile,reason,serviceCost;  
    private void tableAppointmentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAppointmentDataMouseClicked
      AS1 = new AssignStaff();
        int row = tableAppointmentData.getSelectedRow();
         id = tableAppointmentData.getModel().getValueAt(row,0).toString();
         name = tableAppointmentData.getModel().getValueAt(row,1).toString();
         nic = tableAppointmentData.getModel().getValueAt(row,2).toString();
         gender = tableAppointmentData.getModel().getValueAt(row,3).toString();
         mobile = tableAppointmentData.getModel().getValueAt(row,4).toString();
         reason = tableAppointmentData.getModel().getValueAt(row,5).toString();
         serviceCost = tableAppointmentData.getModel().getValueAt(row,6).toString();
        String SelectedAppointmentData = "Customer ID : '"+id+"'\nCustomer Name : '"+name+"'\nNational Identity Card Number : '"+nic+"'\nGender : '"+gender+"'\nCustomer Mobile Number : '"+mobile+"'\nReason For Appointment : '"+reason+"'\nService Cost : '"+serviceCost+"'\n";
        String file = "AppData.txt";
        //write file using seperate thread
        new Thread(() -> {
            WriteFile(file,SelectedAppointmentData);
        }).start();
        
         AS1.setVisible(true);
         AS1.AssignmentTable();
          AS1.setOpacity(1);
         String line2="";
         AS1.txtAppoitmentDetails.setText(SelectedAppointmentData);              
      try {FileReader fileReader = new FileReader("StaffData.txt");
           BufferedReader reader = new BufferedReader(fileReader);
           StringBuilder staffDetails = new StringBuilder();
            while ((line2 = reader.readLine()) != null) {
                System.out.println(line2);
                staffDetails.append(line2).append("\n");
               }
             AS1.txtStaffDetails.setText(staffDetails.toString());

             ControllerSendAndGetStoreData c1 = new ControllerSendAndGetStoreData();
              try {
                   c1.SendAppointmentID(id);
              } catch (SQLException ex) {
                   Logger.getLogger(SelectDetails.class.getName()).log(Level.SEVERE, null, ex);
                  }    
      }catch (IOException e) {  
            System.err.println("Error reading from file: " + e.getMessage());
        }     
          
      this.dispose();
    }//GEN-LAST:event_tableAppointmentDataMouseClicked
 public String id2,name2,nic2,gender2,mobile2,skills;
    private void tableStaffDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStaffDataMouseClicked
     AS2 = new AssignStaff();
        int row = tableStaffData.getSelectedRow();
        id2 = tableStaffData.getModel().getValueAt(row,0).toString();
        name2 = tableStaffData.getModel().getValueAt(row,1).toString();
        mobile2 = tableStaffData.getModel().getValueAt(row,2).toString();
        nic2 = tableStaffData.getModel().getValueAt(row,3).toString();
        gender2 = tableStaffData.getModel().getValueAt(row,4).toString();
        skills = tableStaffData.getModel().getValueAt(row,5).toString();
        String SelectedStaffData = "Staff Member ID : '"+id2+"'\n"
                + "Staff Member Name : '"+name2+"'\n"
                + "Mobile Number : '"+mobile2+"'\n"
                + "National Identity Card Number : '"+nic2+"'\n"
                + "Gender : '"+gender2+"'\n"
                + "Staff Member Specialization : '"+skills+"'\n";
        String file = "StaffData.txt";
        
        //write file using seperate thread
           new Thread(() -> {
             WriteFile(file,SelectedStaffData);
        }).start();
     
        AS2.setVisible(true);
        AS2.AssignmentTable();
        AS2.setOpacity(1);
        String line2= "";
        AS2.txtStaffDetails.setText(SelectedStaffData);
        
    try { FileReader fileReader = new FileReader("AppData.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            StringBuilder appointmentDetails = new StringBuilder();
            while ((line2 = reader.readLine()) != null) {
                appointmentDetails.append(line2).append("\n");
            }
             AS2.txtAppoitmentDetails.setText(appointmentDetails.toString());
                ControllerSendAndGetStoreData c1 = new ControllerSendAndGetStoreData();
          try {
            c1.SendStaffID(id2);
          }catch (SQLException ex) {
            Logger.getLogger(SelectDetails.class.getName()).log(Level.SEVERE, null, ex);
           }
             reader.close();
     } catch (IOException e) {  
            System.err.println("Error reading from file: " + e.getMessage());
        }   
      this.dispose();
    }//GEN-LAST:event_tableStaffDataMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

 private void WriteFile(String file,String data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){ 
            writer.write(data);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
  }
  public void CleanAppointmentFile(){
     try (BufferedWriter writer = new BufferedWriter(new FileWriter("AppData.txt"))){ 
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
  }
 public void CleanStaffFile(){
     try (BufferedWriter writer = new BufferedWriter(new FileWriter("StaffData.txt"))){ 
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
 }
 public String ReadFile(String file,String line2){
  try { FileReader fileReader = new FileReader("AppData.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line2 = reader.readLine()) != null) {
           
            }
        } catch (IOException e) {  
            System.err.println("Error reading from file: " + e.getMessage());
        }
  return line2; 
 }
 public void refreshStaffDetails(){
     // Clear existing data from tableAppointmentDetails4
    DefaultTableModel model1 = (DefaultTableModel) tableStaffData.getModel();
    model1.setRowCount(0);

    // Populate tableAppointmentDetails4 with fresh data
      ControllerGetData CGD1 = new ControllerGetData();
        try {
            ResultSet result = CGD1.getStaffData();
             while(result.next()){
              String sm_id = result.getString("sm_id");
              String sm_name = result.getString("sm_name");
              String sm_mobile = result.getString("sm_mobile");
              String sm_nic = result.getString("sm_nic");
              String gender = result.getString("gender");
              String sm_skills = result.getString("sm_skills");
 
          String TBLdata[] = {sm_id ,sm_name,sm_mobile,sm_nic,gender,sm_skills};
          DefaultTableModel tblModel = (DefaultTableModel)tableStaffData.getModel();
          tblModel.addRow(TBLdata);
             }
       
        } catch (Exception ex) {
            Logger.getLogger(AddAppointmentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCloseTab;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JPanel panelAppointmentData;
    public javax.swing.JPanel panelContainer;
    public javax.swing.JPanel panelMain;
    public javax.swing.JPanel panelStaffData;
    private View.TableDark tableAppointmentData;
    public View.TableDark tableStaffData;
    // End of variables declaration//GEN-END:variables
}
