package baseball;

import java.util.Objects;

public class Ball {

    private Number number;
    private int position;

    public Ball(Number number, int position) {
        this.number = number;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && Objects.equals(number, ball.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, position);
    }

    public boolean isEqualPosition(Ball ball) {
        return this.position == ball.position;
    }
}
