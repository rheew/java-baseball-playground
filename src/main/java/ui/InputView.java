package ui;

import computer.Computer;
import role.Baseball;

import java.util.Scanner;

public class InputView {

    static Scanner sc = new Scanner(System.in);

    public static int answerInput() {
        System.out.println("숫자를 입력해 주세요.");

        return sc.nextInt();
    }

    public static int startOrEndInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        return sc.nextInt();
    }
}
