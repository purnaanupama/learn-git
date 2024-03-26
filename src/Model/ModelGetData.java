
package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class ModelGetData {
     ResultSet result1;
     public ResultSet getData(){
        String query = "SELECT * from AppointmentDetails";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result1 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result1;
    }
    ResultSet result2;
       public ResultSet getAppointmentData(){
        String query = "SELECT * FROM AppointmentDetails LEFT JOIN Assignments ON AppointmentDetails.appointment_id = Assignments.Appointment_id WHERE Assignments.Appointment_id IS NULL";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result2 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result2;
    }

        ResultSet result3;
       public ResultSet getStaffData(){
        String query = "SELECT * from StaffDetails where Availability_Status = 'Available'";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result3 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result3;
    }
       
       ResultSet result4;
       public ResultSet getAssignData(){
        String query = "select * from Assignments;";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result4 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result4;
    }
       ResultSet result5;
       public ResultSet getAppointmentDataToManage(){
        String query = "SELECT Assignments.Appointment_id, AppointmentDetails.c_name, AppointmentDetails.c_nic, AppointmentDetails.gender AS c_gender, AppointmentDetails.c_mobile, StaffDetails.sm_id, StaffDetails.sm_name, StaffDetails.sm_mobile, StaffDetails.sm_nic, Assignments.time, Assignments.date, Assignments.status FROM Assignments JOIN StaffDetails ON Assignments.SM_id = StaffDetails.sm_id JOIN AppointmentDetails ON Assignments.Appointment_id = AppointmentDetails.appointment_id";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result5 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result5;
    }
       ResultSet result6;
       public ResultSet getLoginData(String user,String pass){
        String query = "SELECT * from login where username='"+user+"' and password='"+pass+"'";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result6 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result6;
    }
        ResultSet result7;
       public ResultSet getStaffDetails(){
        String query = "SELECT * from StaffDetails";
        try {
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(query);
            result7 = statement.executeQuery();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result7;
    }
      
}
