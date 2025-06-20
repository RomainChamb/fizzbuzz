package jour4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour4 {

    @Test
    public void doitRetourner1QuandInputEst1() {
        assertThat(FizzBuzzJour4.fizzbuzz(1)).isEqualTo("1");
    }

    @Test
    public void doitRetourner2QuandInputEst2() {
        assertThat(FizzBuzzJour4.fizzbuzz(2)).isEqualTo("2");
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
