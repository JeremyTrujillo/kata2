package kata2;

import kata2.view.ConsoleHistogramDisplay;
import kata2.model.Histogram;

public class Kata2 {

    public static void main(String[] args) {
        int [] values = {1,2,-1,6,3,7,-1,2,-1,1,2,4,4,7,1,-1};
        Histogram histogram = new Histogram(values);
        new ConsoleHistogramDisplay().show(histogram);
        
    }    
}
