package computer;

import lombok.Getter;

import java.util.Random;

@Getter
public class Computer {

    private final int answer;

    public Computer() {

        this.answer = randomNumberGenerator();
    }

    public int randomNumberGenerator() {
        Random random = new Random();

        return random.nextInt(899) + 100;
    }
}

/*
    볼, 스트라이크 test 하기 위해서 랜덤으로 생성된 숫자를 동적으로 테스트 하는 것이 아닌
    숫자 두개를 넘겨 줘서 테스트를 해야한다.
    하지만 클래스안의 로직에서 테스트를 한다면 굳이 파라미터를 두개 넘거받지 않고, 검증할 숫자 한개만 넘겨 받아 저장 되어 있는 랜덤 숫자와 비교하면 더 간단한 로직이 된다.
    랜덤 숫자를 테스트 하는 방법이 있는가? -> 컴퓨터 클래스에서 검증하는 로직이 필요 없고, 새로운 비즈니스 로직을 담당할 클래스를 만들어서 검증 하면 될것이다.
 */
