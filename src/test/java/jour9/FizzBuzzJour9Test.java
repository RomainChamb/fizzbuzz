package jour9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzJour9Test {

    @Test
    public void shouldReturnValueWhenIsNotMutiple() {
        assertThat(fizzbuzz(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturnValueWhenIsNotMutipleBiss() {
        assertThat(fizzbuzz(2)).isEqualTo("2");
    }

    private static String fizzbuzz(int i) {
        if(i == 2 ) return "2";
        return "1";
    }
}
