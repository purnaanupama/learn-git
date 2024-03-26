
package sms_final;

import java.io.*;

public class SMS_Final {
 public static void main(String[] args) {
    try{
    String pathOut = "New1.txt";
    FileOutputStream Output = new FileOutputStream(pathOut);
    Byte data = 'A';
    Byte data1 = 'B';
    Output.write(data);
    Output.write(data1);
    String pathIn = "New1.txt";//read the file and get the data
    FileInputStream Input = new FileInputStream(pathIn);
    int dataRead;
    while((dataRead = Input.read()) != -1){
    System.out.println("Here is the data read : "+(char)dataRead);
    }
    }catch(IOException ex){
        }
    }
}
