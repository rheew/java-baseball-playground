package baseball;

import java.util.Objects;

public class Number {

    public static final int MAX_VALUE = 9;
    public static final int MIN_VALUE = 0;

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public boolean validNo(int num) {
        if (num <= MAX_VALUE && num >= MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return num == number.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
