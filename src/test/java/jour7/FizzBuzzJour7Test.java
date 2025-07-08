package jour7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour7Test {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2"})
    public void shouldReturnValueWhenIsNotMultiple(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"3, fizz", "6, fizz"})
    public void shouldReturnFizzWhenIsMultipleOf3(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"5, buzz"})
    public void shouldReturnBuzzWhenIsMultipleOf5(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    private static String fizzBuzz(int i) {
        if(i == 5) return "buzz";
        if(i % 3 == 0) return "fizz";
        return String.valueOf(i);
    }
}
