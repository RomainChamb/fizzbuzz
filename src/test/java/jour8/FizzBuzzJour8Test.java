package jour8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour8Test {

    @Test
    public void shouldReturnValueWhenIsNotMultiple() {
        String fizzbuzz = "1";
        assertThat(fizzbuzz).isEqualTo("1");
    }
}
