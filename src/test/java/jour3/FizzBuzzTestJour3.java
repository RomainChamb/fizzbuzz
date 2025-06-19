package jour3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour3 {

    //TODO: Input 2 doit retourner "2"
    //TODO: Input 3 doit retourner "fizz"
    //TODO: Input multiple de 3 doit retourner "fizz"
    //TODO: Input 5 doit retourner "buzz"
    //TODO: Input multiple de 5 doit retourner "buzz"
    //TODO: Input 15 doit retourner "fizzbuzz"
    //TODO: Input multiple de quinze doit retourner "fizzbuzz"

    @Test
    public void doitRetourner1QuandInputEst1() {
        assertThat(FizzBuzz.fizzBuzz(1)).isEqualTo("1");
    }
}
