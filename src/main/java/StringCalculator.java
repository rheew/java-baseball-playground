import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        calculator(inputs);
    }

    public static int calculator(String[] inputs) {

        int result = Integer.parseInt(inputs[0]);
        int startInd = 1;
        int totalInd = inputs.length - 1;

        while(startInd + 1 <= totalInd) {
            result = calculate(result, inputs[startInd + 1], inputs[startInd]);
            startInd += 2;
        }

        return result;
    }

    private static int calculate(int input1, String input2, String operator) {

        if (operator.equals("+")) {
            return add(input1, input2);
        }
        if (operator.equals("-")) {
            return dif(input1, input2);
        }
        if (operator.equals("/")) {
            return div(input1, input2);
        }
        if (operator.equals("*")) {
            return multi(input1, input2);
        }

        return 0;
    }

    private static int multi(int input1, String input2) {
        return input1 * Integer.parseInt(input2);
    }

    private static int dif(int input1, String input2) {
        return input1 - Integer.parseInt(input2);
    }

    private static int div(int input1, String input2) {
        return input1 / Integer.parseInt(input2);
    }

    private static int add(int input1, String input2) {
        return input1 + Integer.parseInt(input2);
    }
}