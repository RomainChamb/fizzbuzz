package jour4;

public class FizzBuzzJour4 {
    public static String fizzbuzz(int i) {
        if(i % 3 == 0) return "fizz";
        if(i % 5 == 0) return "buzz";
        return String.valueOf(i);
    }
}
