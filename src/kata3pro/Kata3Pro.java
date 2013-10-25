/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3pro;

import kata3pro.control.HistogramControl;
import kata3pro.persistence.MailReader;

/**
 *
 * @author usuario
 */
public class Kata3Pro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Integer[]array={1,2,3,4,4,4,4,5,5,6};
        HistogramControl control =new HistogramControl();

        HistogramControl<String> controlReader =new HistogramControl<>();
        controlReader.execute(getMail("C:\\Users\\usuario\\Documents\\NetBeansProjects\\kata3Pro\\mail.txt"));
           
    }
    public static String[] getMail(String Filename){
    MailReader reader =new MailReader();
        try {
            return reader.read(Filename);
        } catch (Exception e) {
            return new String[0];
        }
    }
}
