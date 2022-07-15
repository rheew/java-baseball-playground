import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @DisplayName("두개의 숫자 합")
    @Test
    void calculatorTest() {

        String[] inputs = new String[]{"1", "+", "2"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("새개의 숫자 합")
    @Test
    void threeNumSum() {

        String[] inputs = new String[]{"1", "+", "2", "+", "3"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(6);
    }

    @DisplayName("나누기 테스트")
    @Test
    void divTest() {

        String[] inputs = new String[]{"3", "/", "3"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(1);
    }

    @DisplayName("빼기 테스트")
    @Test
    void difTest() {

        String[] inputs = new String[]{"3", "-", "3"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(0);
    }

    @DisplayName("곱 테스트")
    @Test
    void multiTest() {

        String[] inputs = new String[]{"3", "*", "3"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(9);
    }

    @DisplayName("모든 연산자 테스트")
    @Test
    void allOperatorTest() {

        String[] inputs = new String[]{"1", "+", "2", "/", "3", "*", "9", "-", "5"};
        int result = StringCalculator.calculator(inputs);

        assertThat(result).isEqualTo(4);
    }
}