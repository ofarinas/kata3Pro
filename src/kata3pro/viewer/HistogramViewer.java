/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3pro.viewer;

import kata3pro.model.Histogram;
import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class HistogramViewer<Key> {
 Histogram<Key> histogram; 

    public HistogramViewer(Histogram<Key> histogram) {
        this.histogram = histogram;
    }

   public void show (){
       for (Key key : histogram.keySet()) {
           System.out.println(key +":"+histogram.get(key) );
       }
   
   }
         
    
}
