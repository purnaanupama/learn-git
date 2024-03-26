
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelDeleteData {
      //Delete Record
       public void deletRecord(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("delete from Assignments where Appointment_id='"+id+"' ");
       int result2 = statement.executeUpdate("delete from AppointmentDetails where appointment_id='"+id+"' ");
          if(result>0 && result2>0){ 
             JOptionPane.showMessageDialog(null,"Record Deleted !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    }
       
      public void RemoveAssignment(String id)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("delete from Assignments where Appointment_id='"+id+"' ");
          if(result>0){ 
             JOptionPane.showMessageDialog(null,"Removed Assignment !");
          }else{
             JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
    }
      public void deleteAppointment(String id) throws SQLException{
        Statement statement = DatabaseConnection.getConnection().createStatement();
        int result3 = statement.executeUpdate("delete from Assignments where Appointment_id='"+id+"'");
        int result4 = statement.executeUpdate("delete from AppointmentDetails where appointment_id='"+id+"'");
        if(result4>0){
          JOptionPane.showMessageDialog(null,"Appointment Deleted !");
        }else{
          JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
      }
      
        public void deleteStaff(String id) throws SQLException{
        Statement statement = DatabaseConnection.getConnection().createStatement();
        int result4 = statement.executeUpdate("delete from Assignments where SM_id='"+id+"'");
        int result5 = statement.executeUpdate("delete from StaffDetails where sm_id='"+id+"'");
        if(result5>0 || result4>0){
          JOptionPane.showMessageDialog(null,"Record Deleted !");
        }else{
          JOptionPane.showMessageDialog(null,"Something Went Wrong !");
          }
      }
}
