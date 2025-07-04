package jour6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @Test
    public void returnValueWhenIsNotMultiple() {
        String fizzbuuzz = fizzbuzz();
        assertThat(fizzbuuzz).isEqualTo("1");
    }

    @Test
    public void returnValueWhenIsNotMultipleBis() {
        String fizzbuuzz = fizzbuzz();
        assertThat(fizzbuuzz).isEqualTo("2");
    }


    private static String fizzbuzz(int i) {
        return "1";
    }
}
