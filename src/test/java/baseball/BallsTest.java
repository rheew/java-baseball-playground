package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;

    private Balls user;

    @BeforeEach
    void setUp() {

        ball1 = new Ball(new Number(1), 1);
        ball2 = new Ball(new Number(1), 2);
        ball3 = new Ball(new Number(2), 1);

        user = new Balls(Arrays.asList(1, 3, 2));
    }

    @Test
    void 두개_볼이_같으면_스트라이크() {

        assertThat(user.compareBall(ball1)).isEqualTo(BaseballState.STRIKE);
    }

    @Test
    void 두개_볼이_위치만_다르면_볼() {

        assertThat(user.compareBall(ball2)).isEqualTo(BaseballState.BALL);
    }

    @Test
    void 아무것도_아니면_낫띵() {

        assertThat(user.compareBall(ball2)).isEqualTo(BaseballState.BALL);
    }
}
