import computer.Computer;
import role.Baseball;
import ui.InputView;
import ui.OutputView;

public class BaseballGame {

    private static final int NO_VALUE = 0;
    private static final int COLLECT_ANSWER = 3;
    private static final int RESTART = 1;
    private static final int EXIT = 2;
    private static Baseball baseball = new Baseball();

    public static void main(String[] args) {

        gameStart(true, null);
    }

    public static void gameStart(boolean newGame, Computer computer) {

        if (newGame) {

            computer = new Computer();
        }

        int input = InputView.answerInput();
        int strike = baseball.strikeCnt(input, computer.getAnswer());
        int ball = baseball.ballCnt(input, computer.getAnswer());
        int gameResult = 0;

        if (ball > 0) {

            OutputView.ballOutput(ball);
        }

        if (strike > NO_VALUE) {

            OutputView.strikeOutput(strike);
        }

        if (strike == NO_VALUE) {
            System.out.println();
        }

        if (strike == COLLECT_ANSWER) {

            OutputView.gameOverOutput();
            gameResult = InputView.startOrEndInput();
        }

        if (gameResult == RESTART) {

            gameStart(true, null);
        }

        if (gameResult == EXIT) {

            return;
        }

        if (strike == 0 && ball == 0) {

            OutputView.fourBallOutput();
        }

        gameStart(false, computer);
    }
}
