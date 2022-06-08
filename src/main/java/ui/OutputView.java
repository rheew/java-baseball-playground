package ui;

public class OutputView {


    public static void gameOverOutput() {

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void ballOutput(int ballNum) {

        System.out.print(ballNum + "볼");
    }

    public static void strikeOutput(int strikeNum) {

        System.out.println(strikeNum + "스트라이크");
    }

    public static void fourBallOutput() {

        System.out.println("포볼");
    }
}