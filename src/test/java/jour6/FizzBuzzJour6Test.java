package jour6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"1, 1", "2, 2"})
    public void returnValueWhenIsNotMultiple(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"3, fizz", "6, fizz"})
    public void returnFizzWhenIsMultipleOf3(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"5, buzz", "10, buzz"})
    public void returnBuzzWhenIsMultipleOf5(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    public void returnFizzBuzzWhenIsMultipleOf15(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }


    private static String fizzbuzz(int i) {
        if(isMultiple(i, 15)) return fizz(i) + buzz();
        if(isMultiple(i, 5)) return buzz();
        if(isMultiple(i, 3)) return fizz(i);
        return String.valueOf(i);
    }

    private static boolean isMultiple(int i, int multiple) {
        return i % multiple == 0;
    }

    private static String buzz() {
        return "buzz";
    }

    private static String fizz(int i) {
        return "fizz";
    }
}
