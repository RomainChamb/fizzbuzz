package jour8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour8Test {

    @ParameterizedTest
    @CsvSource({"1, 1"})
    public void shouldReturnValueWhenIsNotMultiple(int input, String expectedOutput) {
        assertThat(fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldReturnValueWhenIsNotMultipleBis() {
        String fizzbuzz = fizzbuzz(2);
        assertThat(fizzbuzz).isEqualTo("2");
    }

    private static String fizzbuzz(int i) {
        return String.valueOf(i);
    }
}
