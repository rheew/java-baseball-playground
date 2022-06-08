package utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NumberUtil {

    final int firstNumInd = 0;
    final int secondNumInd = 1;
    final int thirdNumInd = 2;

    private String numberToString(int num) {

        return String.valueOf(num);
    }

    public int firstNum(int num) {

        return Character.getNumericValue(numberToString(num).charAt(firstNumInd));
    }

    public int thirdNum(int num) {

        return Character.getNumericValue(numberToString(num).charAt(thirdNumInd));
    }

    public int secondNum(int num) {

        return Character.getNumericValue(numberToString(num).charAt(secondNumInd));
    }
}
