package role;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BaseballTest {

    private Baseball baseball;

    @BeforeEach
    void setUp() {
        baseball = new Baseball();
    }

    @DisplayName("컴퓨터가 생성한 숫자가 맞는지 확인")
    @ParameterizedTest
    @CsvSource(value= {"123:true", "999:false"}, delimiter = ':')
    void checkNumber(int input, boolean expect) {
        int answer = 123;

        Assertions.assertEquals(baseball.checkAnswer(input, answer), expect);
    }

    @DisplayName("스트라이크 개수 로직")
    @ParameterizedTest
    @CsvSource(value = {"123:3", "124:2", "134:1", "456:0"}, delimiter = ':')
    void strikeCnt(int input, int expect) {
        int answer = 123;

        assertEquals(expect, baseball.strikeCnt(input, answer));
    }

    @DisplayName("볼 개수 로직")
    @ParameterizedTest
    @CsvSource(value = {"123:0", "312:3", "301:2", "452:1"}, delimiter = ':')
    void ballCnt(int input, int expect) {
        int answer = 123;

        assertEquals(expect, baseball.ballCnt(input, answer));
    }
}