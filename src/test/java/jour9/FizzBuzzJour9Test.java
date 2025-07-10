package jour9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour9Test {

    @Test
    public void shouldReturnValueWhenIsNotMutiple() {
        assertThat(fizzbuzz()).isEqualTo("1");
    }

    private static String fizzbuzz() {
        String fizzbuzz = "1";
        return fizzbuzz;
    }
}
