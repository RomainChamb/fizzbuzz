package jour1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"1,1"})
    public void doitRetourner1SiInputest1(int input, String expectedOutput) {
        assertThat(Fizzbuzz.fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @Test
    public void doitRetourner2SiInputest2() {
        assertThat(Fizzbuzz.fizzBuzz(2)).isEqualTo("2");
    }

    @Test
    public void doitRetournerfizzSiInputest3() {
        assertThat(Fizzbuzz.fizzBuzz(3)).isEqualTo("fizz");
    }

    @Test
    public void doitRetournerbuzzSiInputest5() {
        assertThat(Fizzbuzz.fizzBuzz(5)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerfizzSiInputEstMultipleDe3() {
        assertThat(Fizzbuzz.fizzBuzz(6)).isEqualTo("fizz");
    }

    @Test
    public void doitRetournerbuzzSiInputEstMultipleDe5() {
        assertThat(Fizzbuzz.fizzBuzz(10)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerfizzbuzzSiInputEstMultipleDe15() {
        assertThat(Fizzbuzz.fizzBuzz(15)).isEqualTo("fizzbuzz");
    }
}
