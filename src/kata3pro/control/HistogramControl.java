/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3pro.control;

import kata3pro.model.HistogramBuilder;
import kata3pro.viewer.HistogramViewer;

/**
 *
 * @author usuario
 */
public class HistogramControl<Key> {
     public void execute(Key[]array){
         
        HistogramBuilder<Key> builder = new HistogramBuilder();
        builder.calculateHistograma(array);
        HistogramViewer<Key> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
}    
}
