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

    private static String fizzbuzz(int i) {
        return String.valueOf(i);
    }
}
