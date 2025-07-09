package jour8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Map;

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
        Map<Integer, String> specialValues = specialValues();
        String result = "";

        String loopResult = "";
        for(Map.Entry<Integer, String> entry : specialValues.entrySet()) {
            if(i % entry.getKey() == 0) loopResult += entry.getValue();
        }
        if(i % 3 == 0) result += specialValues.get(3);
        if(i % 5 == 0) result += specialValues.get(5);
        return loopResult.isBlank() ? String.valueOf(i) : loopResult;
    }

    private static Map<Integer, String> specialValues() {
        return Map.of(3, "fizz", 5, "buzz");
    }
}
