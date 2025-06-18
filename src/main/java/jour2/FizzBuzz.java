package jour2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {

    private final Map<Integer, String> specialValues;

    public FizzBuzz(Map<Integer, String> specialValues) {
        this.specialValues = new LinkedHashMap<>(specialValues);
    }

    public String fizzBuzz(int i) {
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer, String> entry : specialValues.entrySet()) {
            if(i % entry.getKey() == 0) result.append(entry.getValue());
        }
        return result.length() == 0 ? String.valueOf(i) : result.toString();
    }
}
