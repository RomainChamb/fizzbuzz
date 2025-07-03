package jour5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour5 {

    @Test
    public void returnValueWhenIsNotMultiple() {
        String fizzbuzz = fizzbuzz(1);
        assertThat(fizzbuzz).isEqualTo("1");
    }

    @Test
    public void returnValueWhenIsNotMultipleBis() {
        String fizzbuzz = fizzbuzz(2);
        assertThat(fizzbuzz).isEqualTo("2");
    }

    @Test
    public void returnFizzWhenIsMultipleOf3() {
        String fizzbuzz = fizzbuzz(3);
        assertThat(fizzbuzz).isEqualTo("Fizz");
    }

    @Test
    public void returnFizzWhenIsMultipleOf3Bis() {
        String fizzbuzz = fizzbuzz(6);
        assertThat(fizzbuzz).isEqualTo("Fizz");
    }

    @Test
    public void returnBuzzWhenIsMultipleOf5() {
        String fizzbuzz = fizzbuzz(5);
        assertThat(fizzbuzz).isEqualTo("Buzz");
    }

    @Test
    public void returnBuzzWhenIsMultipleOf5Bis() {
        String fizzbuzz = fizzbuzz(10);
        assertThat(fizzbuzz).isEqualTo("Buzz");
    }

    @Test
    public void returnFizzBuzzWhenIsMultipleOf15() {
        String fizzbuzz = fizzbuzz(15);
        assertThat(fizzbuzz).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnFizzBuzzWhenIsMultipleOf15Bis() {
        String fizzbuzz = fizzbuzz(30);
        assertThat(fizzbuzz).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnQixWhenIsMultipleOf7() {
        String fizzbuzz = fizzbuzz(210);
        assertThat(fizzbuzz).isEqualTo("FizzBuzzQix");
    }


    private String fizzbuzz(int i) {
        String s = fizz(i) + buzz(i) + qix(i);
        if( s.isBlank()) return String.valueOf(i);
        return s;
    }

    private String qix(int i) {
        if(isMultiple(i, 7)) return "Qix";
        return "";
    }

    private static String buzz(int i) {
        if(isMultiple(i, 5)) return "Buzz";
        return "";
    }

    private static String fizz(int i) {
        if(isMultiple(i, 3))return "Fizz";
        return "";
    }

    private static boolean isMultiple(int i, int multiple) {
        return i % multiple == 0;
    }
}
