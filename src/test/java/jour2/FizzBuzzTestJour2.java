package jour2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour2 {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        Map<Integer, String> specialValues = new LinkedHashMap<>();
        specialValues.put(3, "fizz");
        specialValues.put(5, "buzz");
        fizzBuzz = new FizzBuzz(specialValues);
    }


    @ParameterizedTest(name = "Quand input est {0} doit retourner {1}")
    @CsvSource({"1,1", "2,2"})
    @DisplayName("Doit retourner la même valeur que l'input")
    public void doitRetournerInputSansConversion(int input, String expectedOutput) {
        assertThat(fizzBuzz.fizzBuzz(input)).isEqualTo(expectedOutput);
    }


    @ParameterizedTest(name = "Quand input est multiple de 3 doit retourner fizz")
    @CsvSource({"3, fizz", "6, fizz"})
    @DisplayName("Doit retourner fizz")
    public void doitRetournerfizzQuandInputEstMultipleDe3() {
        assertThat(fizzBuzz.fizzBuzz(3)).isEqualTo("fizz");
    }

    @ParameterizedTest(name = "Quand input est multiple de 5 doit retourner buzz")
    @CsvSource({"5, buzz", "10, buzz"})
    @DisplayName("Doit retourner buzz")
    public void doitRetournerBuzzQuandInputEstMultiple5() {
        assertThat(fizzBuzz.fizzBuzz(5)).isEqualTo("buzz");
    }

    @ParameterizedTest(name = "Quand input est multiple de 15 doit retourner fizzbuzz")
    @CsvSource({"15, fizzbuzz", "30, fizzbuzz"})
    @DisplayName("Doit retourner fizzbuzz")
    public void doitRetournerfizzBuzzQuandInputEst15() {
        assertThat(fizzBuzz.fizzBuzz(15)).isEqualTo("fizzbuzz");
    }
}
