package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilsTest {

    @DisplayName("숫자 세개를 넘겨 받고 각 자리수를 가져온다.")
    @Test
    void numTest() {

        int num = 123;

        assertThat(NumberUtils.firstNum(num)).isEqualTo(1);
        assertThat(NumberUtils.secondNum(num)).isEqualTo(2);
        assertThat(NumberUtils.thirdNum(num)).isEqualTo(3);
    }

}