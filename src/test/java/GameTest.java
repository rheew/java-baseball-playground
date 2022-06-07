import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
    }

    @DisplayName("랜덤 숫자 3자리를 출력한다.")
    @Test
    void randomNumberTest() {

        int result = game.randomNumberGenerator();

        Assertions.assertTrue(result >= 100 && result <= 999);
    }
}