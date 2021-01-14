package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;

import static org.junit.Assert.*;

import java.awt.*;

public class ClassicCardTests {
    @Test
    void testIsLegal() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.DIAMOND);
        test.setLegal(false);
        Boolean result = test.isLegal();
        assertEquals(false, result);
    }

    @Test
    void testEqualsDiferentValues() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.DIAMOND);
        Boolean result = test.equals(new ClassicCard(Value.V_2, Suit.DIAMOND));
        assertEquals(false, result);
    }

    @Test
    void testEqualsDiferentSuit() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.DIAMOND);
        Boolean result = test.equals(new ClassicCard(Value.V_2, Suit.SPADE));
        assertEquals(false, result);
    }

    @Test
    void testToString() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.DIAMOND);
        String result = test.toString();
        assertTrue(!result.isEmpty());
    }

    @Test
    void testEquals() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.DIAMOND);
        Boolean result = test.equals(new ClassicCard(Value.V_1, Suit.DIAMOND));
        assertEquals(true, result);
    }

    @Test
    void testCreatNewClassicCard() {
        ClassicCard test = new ClassicCard(Value.V_1, Suit.CLUB);
        assertNotNull(test);
    }

    @Test
    void testGetColorDiamond() {
        ClassicCard test = new ClassicCard(Value.V_QUEEN, Suit.DIAMOND);
        assertEquals(test.getColor(), Color.red);
    }

    @Test
    void testGetColorHeart() {
        ClassicCard test = new ClassicCard(Value.V_QUEEN, Suit.HEART);
        assertEquals(test.getColor(), Color.red);
    }

    @Test
    void testGetColorClub() {
        ClassicCard test = new ClassicCard(Value.V_QUEEN, Suit.CLUB);
        assertEquals(test.getColor(), Color.black);
    }

    @Test
    void testGetColorSpade() {
        ClassicCard test = new ClassicCard(Value.V_QUEEN, Suit.SPADE);
        assertEquals(test.getColor(), Color.black);
    }

    @Test
    void TestGetSuit() {
        ClassicCard test = new ClassicCard(Value.V_QUEEN, Suit.DIAMOND);
        Suit result = test.getSuit();
        assertEquals(Suit.DIAMOND, result);
    }
}
