package jour9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

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

    @ParameterizedTest
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    public void shouldReturnFizzBuzzWhenIsMutipleOf3And5(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }


    private static String fizzbuzz(int i) {
        Map<Integer, String> specialValues = Map.of(3, "fizz", 5, "buzz");
        String result = "";
        if(i % 3 == 0) result += specialValues.get(3);
        if(i % 5 == 0) result += "buzz";
        return result.isBlank() ? String.valueOf(i) : result;
    }
}
