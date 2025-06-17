package jour1;

public class Fizzbuzz {

    public static String fizzBuzz(int i) {
        if(i == 3 || i % 3 == 0)
            return "fizz";
        if(i == 5)
            return "buzz";
        return String.valueOf(i);
    }
}
