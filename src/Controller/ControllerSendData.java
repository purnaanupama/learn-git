
package Controller;
import java.sql.*;
import Model.*;

public class ControllerSendData {
    public void AddAppointment(String app_id,String C_name,String C_nic,String Gender,String Mobile,String reason,int Service_cost) throws SQLException{
     ModelDataInsert MDI = new ModelDataInsert();
     MDI.InsertAppointmentDetails(app_id, C_name, C_nic, Gender, Mobile, reason, Service_cost);
  } 
    public void InsertAssigmentDetails(String sm_id,String app_id,String time,String date) throws SQLException{
     ModelDataInsert MDI = new ModelDataInsert();
     MDI.InsertAssigmentDetails(sm_id, app_id, time, date);
    }
     public void InsertStaffDetails(String id,String name,String number,String gender,String nic,String skills) throws SQLException{
     ModelDataInsert MDI = new ModelDataInsert();
     MDI.InsertAssigmentDetails(id,name,number,gender,nic,skills);
    }
     
  // 
}
