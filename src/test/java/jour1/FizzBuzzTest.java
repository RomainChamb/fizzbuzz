package jour1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest(name = "Doit retourner {1} si Input est {0}")
    @CsvSource({"1,1", "2,2", "3, fizz", "5, buzz"})
    public void doitRetournerLaBonneValeurCorrespondanteAInput(int input, String expectedOutput) {
        assertThat(Fizzbuzz.fizzBuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} si Input est multiple de {0}")
    @CsvSource({"6, fizz", "10, buzz", "15, fizzbuzz"})
    public void doitRetournerLaBonneValeurCorrespondanteAInputSiMultiple(int input, String expectedOutput) {
        assertThat(Fizzbuzz.fizzBuzz(input)).isEqualTo(expectedOutput);
    }

}
