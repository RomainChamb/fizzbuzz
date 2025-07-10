package jour9;

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
        StringBuilder result = new StringBuilder() ;
        for(Map.Entry<Integer, String> entry : specialValues.entrySet()) {
            if(i % entry.getKey() == 0) result.append(entry.getValue());
        }
        return result.isEmpty() ? String.valueOf(i) : result.toString();
    }

    private static Map<Integer, String> specialValues() {
        Map<Integer, String> specialValues = new LinkedHashMap<>();
        specialValues.put(3, "fizz");
        specialValues.put(5, "buzz");
        return specialValues;
    }
}
