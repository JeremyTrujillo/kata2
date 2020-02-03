package kata2.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram implements Iterable<Integer> {
    private Map<Integer,Integer> data = new HashMap();

    public Histogram(int[] values) {
        for (int value : values) {
            data.put(value, data.containsKey(value) ? data.get(value) + 1 : 1);
        }
    }

    public int getCounts(Integer value) {
        return data.get(value);

    }

    @Override
    public Iterator<Integer> iterator() {
        return data.keySet().iterator();
    }
    
}
