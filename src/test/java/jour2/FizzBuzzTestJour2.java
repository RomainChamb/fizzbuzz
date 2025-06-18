package jour2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour2 {

    @Test
    public void doitRetourner1QuandInputEst1() {
        assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1");
    }
}
