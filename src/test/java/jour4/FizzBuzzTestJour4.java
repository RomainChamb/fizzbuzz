package jour4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour4 {

    FizzBuzzJour4 fizzBuzzJour4;

    @BeforeEach
    void setUp() {
        fizzBuzzJour4 = new FizzBuzzJour4();
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"1,1", "2,2"})
    @DisplayName("Pas de transormation attendue")
    public void doitRetourner1QuandInputEst1(int input, String expectedOutput) {
        assertThat(fizzBuzzJour4.fizzbuzz(input)).isEqualTo(expectedOutput);
    }


    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"3, fizz", "6, fizz"})
    @DisplayName("Cas spécifique des multiples de 3")
    public void doitRetournerFizzQuandInputEst3(int input, String expectedOutput) {
        assertThat(fizzBuzzJour4.fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @ParameterizedTest(name = "Doit retourner {1} quand input est {0}")
    @CsvSource({"5, buzz", "10, buzz"})
    @DisplayName("Cas spécifique des multiples de 5")
    public void doitRetournerBuzzQuandInputEst5(int input, String expectedOutput) {
        assertThat(fizzBuzzJour4.fizzbuzz(input)).isEqualTo(expectedOutput);
    }

    @Test
    public void doitRetournerFizzBuzzQuandInputEstMultipleDe3EtMultipleDe5() {
        assertThat(fizzBuzzJour4.fizzbuzz(15)).isEqualTo("fizzbuzz");
    }
}
