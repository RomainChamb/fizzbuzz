package jour3;

import java.util.Map;

public class FizzBuzz {
    public FizzBuzz(Map<Integer, String> specialValues) {
    }

    public static String fizzBuzz(int i) {
        StringBuilder result = new StringBuilder();
        if(i % 3 == 0) result.append("fizz");
        if(i % 5 == 0) result.append("buzz");
        return result.length() == 0 ? String.valueOf(i) : result.toString();
    }
}
