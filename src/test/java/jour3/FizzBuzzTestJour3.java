package jour3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour3 {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }


    @ParameterizedTest(name = "Quand input est {0} doit retourner {1}")
    @CsvSource({"1,1","2,2"})
    @DisplayName("Pas de conversion")
    public void doitRetourner1QuandInputEst1(int input, String expected) {
        assertThat(fizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }

    @ParameterizedTest(name = " Quand input est {0} doit retourner {1}")
    @CsvSource({"3, fizz", "6, fizz"})
    @DisplayName("Multiple de 3 doit retourner fizz")
    public void doitRetournerfizzQuandInputEst3(int input, String expected) {
        assertThat(fizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }


    @ParameterizedTest(name = " Quand input est {0} doit retourner {1}")
    @CsvSource({"5, buzz", "5, buzz"})
    @DisplayName("Multiple de 5 doit retourner buzz")
    public void doitRetournerBuzzQuandInputEst5(int input, String expected) {
        assertThat(fizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }

    @ParameterizedTest(name = " Quand input est {0} doit retourner {1}")
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    @DisplayName("Multiple de 15 doit retourner fizzbuzz")
    public void doitRetournerfizzBuzzQuandInputEst15(int input, String expected) {
        assertThat(FizzBuzz.fizzBuzz(input)).isEqualTo(expected);
    }
}
