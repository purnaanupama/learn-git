
package Controller;

import Model.ModelStoreData;
import java.sql.SQLException;


public class ControllerSendAndGetStoreData {
      public void SendAppointmentID(String app_id) throws SQLException{
     ModelStoreData MSD = new ModelStoreData();
     MSD.getAppointmentId(app_id);

  } 
      
    public void SendStaffID(String staff_id) throws SQLException{
     ModelStoreData MSD1 = new ModelStoreData();
     MSD1.getStaffId(staff_id);

  }   
      
      public String GetCurrentID(){
         ModelStoreData MSD1 = new ModelStoreData();
         return MSD1.SendCurrentID();
         
      }
      
        public String GetCurrentID2(){
         ModelStoreData MSD1 = new ModelStoreData();
         return MSD1.SendStaffID();
         
      }
}
