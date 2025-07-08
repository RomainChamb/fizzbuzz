package jour7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour7Test {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2"})
    public void shouldReturnValueWhenIsNotMultiple(int input, String expectedOutput) {
        assertThat(fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @Test
    public void shouldReturnValueWhenIsNotMultipleBis() {
        String fizzBuzz = fizzBuzz(2);
        assertThat(fizzBuzz).isEqualTo("2");
    }

    private static String fizzBuzz(int i) {
        return String.valueOf(i);
    }
}
