package jour6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @Test
    public void returnValueWhenIsNotMultiple() {
        String fizzbuuzz = fizzbuzz();
        assertThat(fizzbuuzz).isEqualTo("1");
    }

    private static String fizzbuzz() {
        return "1";
    }
}
