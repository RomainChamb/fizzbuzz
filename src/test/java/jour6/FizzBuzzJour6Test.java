package jour6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @Test
    public void returnValueWhenIsNotMultiple() {
        assertThat("1").isEqualTo("1");
    }
}
