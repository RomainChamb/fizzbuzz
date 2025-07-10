package jour9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.LinkedHashMap;
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
        Map<Integer, String> specialValues = specialValues();
        Integer[] keys = specialValues.keySet().toArray(new Integer[0]);
        String result = "";
        if(i % keys[0] == 0) result += specialValues.get(keys[0]);
        if(i % keys[1] == 0) result += specialValues.get(keys[1]);
        return result.isBlank() ? String.valueOf(i) : result;
    }

    private static Map<Integer, String> specialValues() {
        Map<Integer, String> specialValues = new LinkedHashMap<>();
        specialValues.put(3, "fizz");
        specialValues.put(5, "buzz");
        return specialValues;
    }
}
