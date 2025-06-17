package jour1;

public class Fizzbuzz {

    public static String fizzBuzz(int i) {
        if(i % 15 == 0)
            return "fizzbuzz";
        if(i == 3 || i % 3 == 0)
            return "fizz";
        if(i == 5 || i % 5 == 0)
            return "buzz";
        return String.valueOf(i);
    }
}
