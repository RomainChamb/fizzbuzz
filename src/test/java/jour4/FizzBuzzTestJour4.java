package jour4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTestJour4 {

    //TODO : Input 1 doit retourner "1"
    //TODO : Input 2 doit retourner "2"
    //TODO : Input 3 doit retourner "fizz"
    //TODO : Input 5 doit retourner "buzz"
    //TODO : Input multiple 3 doit retourner "fizz"
    //TODO : Input multiple 5 doit retourner "buzz"
    //TODO : Input multiple 3 ET 5 doit retourner "fizzbuzz"

    @Test
    public void doitRetourner1QuandInputEst1() {
        assertThat(FizzBuzzJour4.fizzbuzz(1)).isEqualTo(1);
    }
}
