package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    @Test
    void 숫자검증_1부터_9까지() {
        final Number number = new Number(1);

        assertThat(number.validNo(9)).isEqualTo(true);
        assertThat(number.validNo(0)).isEqualTo(true);
        assertThat(number.validNo(-1)).isEqualTo(false);
        assertThat(number.validNo(10)).isEqualTo(false);
    }

    @Test
    void 숫자_비교() {
        final Number number1 = new Number(1);
        final Number number2 = new Number(1);
        final Number number3 = new Number(2);

        assertThat(number1.equals(number2)).isEqualTo(true);
        assertThat(number1.equals(number3)).isEqualTo(false);
    }
}
