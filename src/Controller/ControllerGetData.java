
package Controller;
import Model.*;
import java.sql.*;

public class ControllerGetData {
     public ResultSet getAppointmentData()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getData();
    }
       public ResultSet getAppointmentData2()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getAppointmentData();
    }
       public ResultSet getStaffData()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getStaffData();
    }
        public ResultSet getAssignData()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getAssignData();
    }
        public ResultSet getAppointmentDataToManage()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getAppointmentDataToManage();
    }
      public ResultSet getLoginData(String user,String pass)throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getLoginData(user, pass);
    }
      public ResultSet getStaffDetails()throws Exception{
        ModelGetData MGD1 = new ModelGetData();
        return MGD1.getStaffDetails();
    }
}
