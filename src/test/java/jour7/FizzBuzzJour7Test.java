package jour7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour7Test {

    @Test
    public void shouldReturnValueWhenIsNotMultiple() {
        String fizzBuzz = fizzBuzz();
        assertThat(fizzBuzz).isEqualTo("1");
    }

    private static String fizzBuzz() {
        return "1";
    }
}
