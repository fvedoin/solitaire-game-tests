package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlipCardTests {
    @Test
    public void flipUpCard_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_1, Suit.DIAMOND);
        classicCard.flip();
        Boolean result = classicCard.isFaceDown();
        assertEquals(false, result);
    }

    @Test
    public void flipDownCard_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_1, Suit.DIAMOND);
        classicCard.turnFaceUp();
        classicCard.flip();
        Boolean result = classicCard.isFaceDown();
        assertEquals(true, result);
    }
}
