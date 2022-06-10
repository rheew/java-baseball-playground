package baseball;

public class Referee {

    public BaseballState compareBall(Ball ball1, Ball ball2) {

        if (ball1.equals(ball2)) {
            return BaseballState.STRIKE;
        }

        if (ball1.isBall(ball2)) {
            return BaseballState.BALL;
        }

        return BaseballState.NOTHING;
    }
}
