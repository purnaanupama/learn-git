
package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class ModelDataInsert {
    public void InsertAppointmentDetails(String app_id,String C_name,String C_nic,String Gender,String Mobile,String reason,int Service_cost)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Insert Into AppointmentDetails values ('"+app_id+"','"+C_name+"','"+C_nic+"','"+Gender+"','"+Mobile+"','"+reason+"','"+Service_cost+"')");
       if(result>0){ 
       JOptionPane.showMessageDialog(null,"Appointment Added Successfully !");
       }else{
       JOptionPane.showMessageDialog(null,"Something went wrong !");
       }
    }
    
      public void InsertAssigmentDetails(String sm_id,String app_id,String time,String date)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Insert Into Assignments (SM_id,Appointment_id,time,date,status) values ('"+sm_id+"','"+app_id+"','"+time+"','"+date+"','Unhandled')");
       if(result>0){ 
       JOptionPane.showMessageDialog(null,"Appointment Assigned !");
       }else{
       JOptionPane.showMessageDialog(null,"Something went wrong !");
       }
    }
      
       public void InsertAssigmentDetails(String id,String name,String number,String gender,String nic,String skills)throws SQLException{
       Statement statement = DatabaseConnection.getConnection().createStatement();
       int result = statement.executeUpdate("Insert Into StaffDetails (sm_id,sm_name,sm_mobile,sm_nic,gender,sm_skills,Availability_Status) values ('"+id+"','"+name+"','"+number+"','"+gender+"','"+nic+"','"+skills+"','Unavailable')");
       if(result>0){ 
       JOptionPane.showMessageDialog(null,"Staff Member Added !");
       }else{
       JOptionPane.showMessageDialog(null,"Something went wrong !");
       }
    }
      
      
    
}
