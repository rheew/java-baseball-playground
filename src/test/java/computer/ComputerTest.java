package computer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    private Computer computer;

    @BeforeEach
    void setUp() {
        this.computer = new Computer();
    }

    @DisplayName("랜덤 숫자 3자리를 출력한다.")
    @Test
    void randomNumberTest() {

        int result = computer.randomNumberGenerator();

        Assertions.assertTrue(result >= 100 && result <= 999);
    }

}