package jour2;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if(i == 3) return "fizz";
        if(i == 5) return "buzz";
        return String.valueOf(i);
    }
}
