package jour1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void doitRetourner1SiInputest1() {
        assertThat(Fizzbuzz.fizzBuzz(1)).isEqualTo(1);
    }
}
