package kata2.view;

import kata2.view.HistogramDisplay;
import kata2.model.Histogram;

public class ConsoleHistogramDisplay implements HistogramDisplay {
    
    @Override
    public void show(Histogram histogram) {
        for (Integer value : histogram) {
            System.out.println(value + " " + histogram.getCounts(value));
        }    
    }

}
