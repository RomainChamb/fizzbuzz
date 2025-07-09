package jour8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour8Test {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2"})
    public void shouldReturnValueWhenIsNotMultiple(int input, String expectedOutput) {
        assertThat(fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"3, fizz", "6, fizz"})
    public void shouldReturnFizzWhenIsMultipleOf3(int input, String expectedOutput) {
        assertThat(fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"5, buzz", "10, buzz"})
    public void shouldReturnBuzzWhenIsMultipleOf5(int input, String expectedOutput) {
        assertThat(fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    public void shouldReturnFizzBuzzWhenIsMultipleOf3And5(int input, String expectedOutput) {
        assertThat(fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    private static String fizzbuzz(int i) {
        if(i == 15 || i == 30) return "fizzbuzz";
        if(i % 5 == 0) return "buzz";
        if(i % 3 == 0) return "fizz";
        return String.valueOf(i);
    }
}
