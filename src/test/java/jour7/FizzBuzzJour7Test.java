package jour7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour7Test {

    @Test
    public void shouldReturnValueWhenIsNotMultiple() {
        String fizzBuzz = fizzBuzz(1);
        assertThat(fizzBuzz).isEqualTo("1");
    }

    @Test
    public void shouldReturnValueWhenIsNotMultipleBis() {
        String fizzBuzz = fizzBuzz(2);
        assertThat(fizzBuzz).isEqualTo("2");
    }

    private static String fizzBuzz(int i) {
        if(i == 2) return "2";
        return String.valueOf(i);
    }
}
