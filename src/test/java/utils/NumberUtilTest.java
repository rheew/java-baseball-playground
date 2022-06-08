package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilTest {

    @DisplayName("숫자 세개를 넘겨 받고 각 자리수를 가져온다.")
    @Test
    void numTest() {

        int num = 123;

        assertThat(NumberUtil.firstNum(num)).isEqualTo(1);
        assertThat(NumberUtil.secondNum(num)).isEqualTo(2);
        assertThat(NumberUtil.thirdNum(num)).isEqualTo(3);
    }

}