package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] result1 = "1,2".split(",");
        String[] result2 = "1".split(",");

        assertThat(result1).contains("1","2");
        assertThat(result2).containsExactly("1");
    }

    @Test
    void substring() {
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    void findCharAt() {
        char result = "abc".charAt(1);
        assertThat(result).isEqualTo('b');
    }

    @DisplayName("위차 값을 넘어가면 StringIndexBoundsException이 발생한다")
    @Test
    void findCharAtException() {

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    "abc".charAt(4);
                }).withMessageMatching("String index out of range: 4");
    }
}
