package role;

import utils.NumberUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Baseball {

    public boolean checkAnswer(int input, int answer) {
        return input == answer;
    }

    public int strikeCnt(int input, int answer) {

        int strike = 0;

        if (NumberUtils.firstNum(input) == NumberUtils.firstNum(answer)) {
            strike += 1;
        }

        if (NumberUtils.secondNum(input) == NumberUtils.secondNum(answer)) {
            strike += 1;
        }

        if (NumberUtils.thirdNum(input) == NumberUtils.thirdNum(answer)) {
            strike += 1;
        }

        return strike;
    }

    public int ballCnt(int input, int answer) {

        int ball = 0;

        Set<Integer> firstExceptNums = new HashSet<>(Arrays.asList(NumberUtils.secondNum(answer), NumberUtils.thirdNum(answer)));
        Set<Integer> secondExceptNums = new HashSet<>(Arrays.asList(NumberUtils.firstNum(answer), NumberUtils.thirdNum(answer)));
        Set<Integer> thirdExceptNums = new HashSet<>(Arrays.asList(NumberUtils.secondNum(answer), NumberUtils.firstNum(answer)));

        if (firstExceptNums.contains(NumberUtils.firstNum(input))) {
            ball += 1;
        }

        if (secondExceptNums.contains(NumberUtils.secondNum(input))) {
            ball += 1;
        }

        if (thirdExceptNums.contains(NumberUtils.thirdNum(input))) {
            ball += 1;
        }

        return ball;
    }
}