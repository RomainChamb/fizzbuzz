package jour6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour6Test {

    @Test
    public void returnValueWhenIsNotMultiple() {
        String fizzbuuzz = fizzbuzz(1);
        assertThat(fizzbuuzz).isEqualTo("1");
    }

    @Test
    public void returnValueWhenIsNotMultipleBis() {
        String fizzbuuzz = fizzbuzz(2);
        assertThat(fizzbuuzz).isEqualTo("2");
    }


    private static String fizzbuzz(int i) {
        if(i == 2 ) return "2";
        return "1";
    }
}
