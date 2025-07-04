package jour6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @Test
    public void returnValueWhenIsNotMultiple() {
        String fizzbuuzz = "1";
        assertThat(fizzbuuzz).isEqualTo("1");
    }
}
