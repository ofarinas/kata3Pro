/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3pro.model;

import kata3pro.model.Histogram;
import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class HistogramBuilder<Key> {

    public Histogram<Key> histogram = new Histogram();

    public Histogram calculateHistograma(Key[] array) {
        for (Key number : array) {
            histogram.put(number,getFrequency(number)+1);
        }
        return histogram;
    }

    private Integer getFrequency(Key Key) {
        Integer frequency = (Integer) histogram.get(Key);
        if (frequency == null) {
            return 0;
        }
        return frequency;
    }

    public Histogram getHistogram() {
        return histogram;
    }
}
