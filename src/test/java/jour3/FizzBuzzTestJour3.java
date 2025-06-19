package jour3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour3 {


    @ParameterizedTest(name = "Quand input est {0} doit retourner {1}")
    @CsvSource({"1,1","2,2"})
    @DisplayName("Pas de conversion")
    public void doitRetourner1QuandInputEst1(int input, String expected) {
        assertThat(FizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }

    @ParameterizedTest(name = " Quand input est {0} doit retourner {1}")
    @CsvSource({"3, fizz", "6, fizz"})
    @DisplayName("Multiple de 3 doit retourner fizz")
    public void doitRetournerfizzQuandInputEst3(int input, String expected) {
        assertThat(FizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }


    @Test
    public void doitRetournerBuzzQuandInputEst5() {
        assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerbuzzQuandInputEstMultipleDe5() {
        assertThat(FizzBuzz.fizzBuzz(10)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerfizzBuzzQuandInputEst15() {
        assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("fizzbuzz");
    }

    @Test
    public void doitRetournerfizzBuzzQuandInputEstMultipleDe15() {
        assertThat(FizzBuzz.fizzBuzz(30)).isEqualTo("fizzbuzz");
    }
}
