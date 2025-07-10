package jour9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour9Test {

    @ParameterizedTest
    @CsvSource({"1,1"})
    public void shouldReturnValueWhenIsNotMutiple(int input, String expected) {
        assertThat(fizzbuzz(input)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnValueWhenIsNotMutipleBiss() {
        assertThat(fizzbuzz(2)).isEqualTo("2");
    }

    private static String fizzbuzz(int i) {
        return String.valueOf(i);
    }
}
