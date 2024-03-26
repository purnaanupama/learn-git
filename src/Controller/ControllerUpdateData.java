
package Controller;

import Model.ModelUpdateData;
import java.sql.SQLException;

public class ControllerUpdateData {
    public void UpdateToHandled(String id) throws SQLException{
     ModelUpdateData MUD = new ModelUpdateData();
     MUD.updateStatusHandled(id);
    }
    
     public void UpdateToUnhandled(String id) throws SQLException{
     ModelUpdateData MUD = new ModelUpdateData();
     MUD.updateStatusUnhandled(id);
    }
     
     public void UpdateStaddDetails(String id,String name,String nic,String mobile,String newId) throws SQLException{
     ModelUpdateData MUD = new ModelUpdateData();
     MUD.updateStaffDetails(id, name, nic, mobile, newId);
    }
     
      public void UpdateStatusAvailable(String id) throws SQLException{
     ModelUpdateData MUD = new ModelUpdateData();
     MUD.updateStatusAvailable(id);
    }
      
     public void UpdateStatusUnavailable(String id) throws SQLException{
     ModelUpdateData MUD = new ModelUpdateData();
     MUD.updateStatusUnavailable(id);
    }
}
