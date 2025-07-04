package jour6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2"})
    public void returnValueWhenIsNotMultiple(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }

    @Test
    public void returnValueWhenIsNotMultipleBis() {
        String fizzbuuzz = fizzbuzz(2);
        assertThat(fizzbuuzz).isEqualTo("2");
    }


    private static String fizzbuzz(int i) {
        if(i == 2 ) return "2";
        return "1";
    }
}
