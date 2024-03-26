
package Model;

public class ModelStoreData {
   public static String App_id;
   public static String Staff_id;
   //Get and store appointment ID  
   public void getAppointmentId(String AID){
     App_id = AID;
   } 
    //Get and store Stfaff ID 
    public void getStaffId(String STF){
     Staff_id = STF;
    }
    //Send back the Appoitment ID back again
    public String SendCurrentID(){
      return  App_id;
      }
     //Send back the Staff ID back again
    public String SendStaffID(){
      return  Staff_id;
      }
}
