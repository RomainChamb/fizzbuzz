package jour4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour4 {

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"1,1", "2,2"})
    @DisplayName("Pas de transormation attendue")
    public void doitRetourner1QuandInputEst1(int input, String expectedOutput) {
        assertThat(FizzBuzzJour4.fizzbuzz(input)).isEqualTo(expectedOutput);
    }


    @Test
    public void doitRetournerFizzQuandInputEst3() {
        assertThat(FizzBuzzJour4.fizzbuzz(3)).isEqualTo("fizz");
    }

    @Test
    public void doitRetournerBuzzQuandInputEst5() {
        assertThat(FizzBuzzJour4.fizzbuzz(5)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerFizzQuandInputEstMultipleDe3() {
        assertThat(FizzBuzzJour4.fizzbuzz(6)).isEqualTo("fizz");
    }

    @Test
    public void doitRetournerBuzzQuandInputEstMultipleDe5() {
        assertThat(FizzBuzzJour4.fizzbuzz(10)).isEqualTo("buzz");
    }

    @Test
    public void doitRetournerFizzBuzzQuandInputEstMultipleDe3EtMultipleDe5() {
        assertThat(FizzBuzzJour4.fizzbuzz(15)).isEqualTo("fizzbuzz");
    }
}
