
package Controller;

import Model.ModelDeleteData;
import java.sql.SQLException;

public class ControllerDeleteData {
     public void DeleteRecord(String id) throws SQLException{
       ModelDeleteData MDD = new ModelDeleteData();
       MDD.deletRecord(id);
    } 
     public void RemoveAssignment(String id) throws SQLException{
       ModelDeleteData MDD = new ModelDeleteData();
       MDD.RemoveAssignment(id);
    }
    public void DeleteAppointment(String id) throws SQLException{
      ModelDeleteData MDD = new  ModelDeleteData();
      MDD.deleteAppointment(id);
    }
    public void DeleteStaff(String id) throws SQLException{
      ModelDeleteData MDD = new  ModelDeleteData();
      MDD.deleteStaff(id);
    }
}
