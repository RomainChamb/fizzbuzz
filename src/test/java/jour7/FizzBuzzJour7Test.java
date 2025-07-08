package jour7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    @CsvSource({"5, buzz", "10, buzz"})
    public void shouldReturnBuzzWhenIsMultipleOf5(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    public void shouldReturnFizzBuzzWhenIsMultipleOf15(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest
    @CsvSource({"7, qix", "14, qix"})
    public void shouldReturnQixWhenIsMultipleOf7(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }


    private static String fizzBuzz(int i) {
        Map<Integer, String> specialValues = specialValues();
        String result = "";
        for(Map.Entry<Integer, String> entry : specialValues.entrySet()) {
            if(i % entry.getKey() == 0) result += entry.getValue();
        }
        return result.length() == 0 ? String.valueOf(i) : result;
    }

    private static Map<Integer, String> specialValues() {
        Map<Integer, String> specialValues = new HashMap<>();
        specialValues.put(3, "fizz");
        specialValues.put(5, "buzz");
        specialValues.put(7, "qix");
        return specialValues;
    }
}
