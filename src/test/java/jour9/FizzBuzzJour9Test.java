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
    public void shouldReturnValueWhenIsMutipleOf3(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }

    private static String fizzbuzz(int i) {
        if(i == 3 ) return "fizz";
        return String.valueOf(i);
    }
}
