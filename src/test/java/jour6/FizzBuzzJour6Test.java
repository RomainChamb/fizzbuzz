package jour6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"1, 1", "2, 2"})
    public void returnValueWhenIsNotMultiple(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"3, fizz"})
    public void returnFizzWhenIsMultipleOf3(int input, String expectedOutput) {
        String fizzbuuzz = fizzbuzz(input);
        assertThat(fizzbuuzz).isEqualTo(expectedOutput);
    }



    private static String fizzbuzz(int i) {
        if(i == 3) return "fizz";
        return String.valueOf(i);
    }
}
