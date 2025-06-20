package jour4;

import java.util.Map;
import java.util.Set;

public class FizzBuzzJour4 {

    private final Map<Integer, String> specialValues;

    public FizzBuzzJour4(Map<Integer, String> specialValues) {
        this.specialValues = Map.copyOf(specialValues);
    }

    public String fizzbuzz(int i) {
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer, String> entry : specialValues.entrySet()) {
            if(i % entry.getKey() == 0) result.append(entry.getValue());
        }
        return result.length() == 0 ? String.valueOf(i) : result.toString();
    }
}
