package jour8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour8Test {

    @Test
    public void shouldReturnValueWhenIsNotMultiple() {
        String fizzbuzz = fizzbuzz(1);
        assertThat(fizzbuzz).isEqualTo("1");
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
