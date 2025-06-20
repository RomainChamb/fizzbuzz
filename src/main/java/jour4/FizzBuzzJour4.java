package jour4;

import java.util.Map;

public class FizzBuzzJour4 {

    public FizzBuzzJour4(Map<Integer, String> specialValues) {
    }

    public static String fizzbuzz(int i) {
        StringBuilder result = new StringBuilder();
        if(i % 3 == 0) result.append("fizz");
        if(i % 5 == 0) result.append("buzz");
        return result.length() == 0 ? String.valueOf(i) : result.toString();
    }
}
