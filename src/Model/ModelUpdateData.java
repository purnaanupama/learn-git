
package Model;

import View.ManageStaffPage;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModelUpdateData {
    //handled to Unhandled
       public void updateStatusUnhandled(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Update Assignments set status = 'Unhandled' where Appointment_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Status Changed !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    }
    //Unhandled to handled
       public void updateStatusHandled(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Update Assignments set status = 'Handled' where Appointment_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Status Changed !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    } 
     //Update Staff Details
       public void updateStaffDetails(String id,String name,String nic,String mobile,String newId)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Update StaffDetails set sm_id = '"+newId+"',sm_name = '"+name+"',sm_nic = '"+nic+"',sm_mobile='"+mobile+"' where sm_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Details Updated !");
            ManageStaffPage MSP = new ManageStaffPage();
            MSP.setVisible(true);
            MSP.pageManageStaff1.setVisible(true);
            MSP.pageAddStaff.setVisible(false);        
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    }  
       //update status
          public void updateStatusAvailable(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Update StaffDetails set Availability_Status = 'Available' where sm_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Status Changed !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    } 
             //update status
          public void updateStatusUnavailable(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Update StaffDetails set Availability_Status = 'Unavailable' where sm_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Status Changed !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    } 
}
