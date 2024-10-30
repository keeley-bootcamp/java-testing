import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {
    @Test
    public void testBlackjack() {
        Blackjack blackjack = new Blackjack();
        assertEquals(0, blackjack.blackjack(22, 24));
        assertEquals(20, blackjack.blackjack(20, 24));
        assertEquals(19, blackjack.blackjack(15, 19));
        assertEquals(17, blackjack.blackjack(17, 17));
    }
}
