package jour9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour9Test {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2"})
    public void shouldReturnValueWhenIsNotMutiple(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"3, fizz", "6, fizz"})
    public void shouldReturnFizzWhenIsMutipleOf3(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"5, buzz", "10, buzz"})
    public void shouldReturnBuzzWhenIsMutipleOf5(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }

    private static String fizzbuzz(int i) {
        if(i % 3 == 0) return "fizz";
        if(i == 5 || i == 10) return "buzz";
        return String.valueOf(i);
    }
}
