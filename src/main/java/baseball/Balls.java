package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;

    public Balls(List<Integer> input) {

        this.balls = mapBalls(input);
    }

    private List<Ball> mapBalls(List<Integer> input) {
        List<Ball> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            result.add(new Ball(new Number(input.get(i)), i + 1));
        }
        return result;
    }

    public BaseballState compareBall(Ball ball) {

        return balls.stream()
                .map(answer -> answer.play(ball))
                .filter(result -> result != BaseballState.NOTHING)
                .findFirst()
                .orElse(BaseballState.NOTHING);
    }
}
