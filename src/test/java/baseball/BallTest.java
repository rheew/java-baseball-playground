package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    @BeforeEach
    void setUp() {
        ball1 = new Ball(new Number(1), 1);
        ball2 = new Ball(new Number(1), 1);
        ball3 = new Ball(new Number(1), 2);
        ball4 = new Ball(new Number(2), 1);
    }

    @Test
    void 스트라이크() {
        assertThat(ball1.play(ball2)).isEqualTo(BaseballState.STRIKE);
    }

    @Test
    void 볼() {
        assertThat(ball1.play(ball3)).isEqualTo(BaseballState.BALL);
    }
    @Test
    void 낫딩() {
        assertThat(ball1.play(ball4)).isEqualTo(BaseballState.NOTHING);
    }

    @Test
    void 같은공인지_비교() {
        assertThat(ball1.equals(ball2)).isEqualTo(true);
        assertThat(ball1.equals(ball3)).isEqualTo(false);
        assertThat(ball1.equals(ball4)).isEqualTo(false);
    }

    @Test
    void 같은위치인지_비교() {
        assertThat(ball1.isEqualPosition(ball2)).isEqualTo(true);
        assertThat(ball1.isEqualPosition(ball3)).isEqualTo(false);
        assertThat(ball1.isEqualPosition(ball4)).isEqualTo(true);
    }

    @Test
    void 같은숫자인지_비교() {
        assertThat(ball1.isEqualNumber(ball2)).isEqualTo(true);
        assertThat(ball1.isEqualNumber(ball3)).isEqualTo(true);
        assertThat(ball1.isEqualNumber(ball4)).isEqualTo(false);
    }
}
