package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RefereeTest {

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Referee referee;

    @BeforeEach
    void setUp() {
        ball1 = new Ball(new Number(1), 1);
        ball2 = new Ball(new Number(1), 1);
        ball3 = new Ball(new Number(1), 2);
        ball4 = new Ball(new Number(2), 1);

        referee = new Referee();
    }

    @Test
    void 두개_볼이_같으면_스트라이크() {

        assertThat(referee.compareBall(ball1, ball2)).isEqualTo(BaseballState.STRIKE);
    }

    @Test
    void 두개_볼이_위치만_다르면_볼() {

        assertThat(referee.compareBall(ball1, ball3)).isEqualTo(BaseballState.BALL);
    }
}
