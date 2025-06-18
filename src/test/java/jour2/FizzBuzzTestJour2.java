package jour2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour2 {

    @Test
    public void doitRetourner1QuandInputEst1() {
        assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void doitRetourner2QuandInputEst2() {
        assertThat(FizzBuzz.fizzBuzz(2)).isEqualTo("2");
    }

    @Test
    public void doitRetournerfizzQuandInputEst3() {
        assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("fizz");
    }

    @Test
    public void doitRetournerBuzzQuandInputEst5() {
        assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("buzz");
    }
}
