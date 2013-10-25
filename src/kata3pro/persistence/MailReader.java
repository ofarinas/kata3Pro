/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3pro.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailReader {

  public  String[] read(String string) throws FileNotFoundException {
      BufferedReader reader =new BufferedReader( new FileReader(new File(string)));
      ArrayList <String>domainList=new ArrayList<>();
      while(true){
          try {
              String line=reader.readLine();
              if (line ==null)
                  break;
              
              domainList.add(line.split("@")[1]);
          } catch (Exception e) {
              break;
          }
      }   
         return domainList.toArray(new String [0]);
       
    }
    
}
