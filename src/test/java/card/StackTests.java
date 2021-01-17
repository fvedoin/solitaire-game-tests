package card;

import com.fbergeron.card.*;

import org.hamcrest.Matcher;
import org.junit.*;

import java.awt.*;
import java.util.Vector;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StackTests {

    public static Stack stack = new Stack();
    public static ClassicCard[] cards = {
            new ClassicCard(Value.V_1, Suit.DIAMOND),
            new ClassicCard(Value.V_2, Suit.CLUB),
            new ClassicCard(Value.V_3, Suit.HEART),
            new ClassicCard(Value.V_4, Suit.SPADE),
            new ClassicCard(Value.V_5, Suit.DIAMOND),
            new ClassicCard(Value.V_6, Suit.CLUB),
            new ClassicCard(Value.V_7, Suit.HEART),
            new ClassicCard(Value.V_8, Suit.SPADE),
            new ClassicCard(Value.V_9, Suit.DIAMOND),
            new ClassicCard(Value.V_10, Suit.CLUB),
            new ClassicCard(Value.V_11, Suit.HEART),
            new ClassicCard(Value.V_12, Suit.SPADE),
            new ClassicCard(Value.V_13, Suit.DIAMOND)
    };

    @BeforeClass
    public static void beforeCondition() {
        for (ClassicCard card : cards) {
            stack.push(card);
        }

        stack.setLocation(10, 10);

    }

    @Test
    public void isNotEmpty_Success() {
        Boolean result = stack.isEmpty();
        assertEquals(false, result);
    }

    @Test
    public void getLocation_Success() {
        Point point = new Point(10, 10);
        Point result = stack.getLocation();
        assertEquals(point, result);
    }

    @Test
    public void firstElement_Success() {
        Card result = stack.elementAt(0);
        assertEquals(result, new ClassicCard(Value.V_1, Suit.DIAMOND));
    }

    @Test
    public void lastElement_Success() {
        Card result = stack.elementAt(12);
        assertEquals(result, new ClassicCard(Value.V_13, Suit.DIAMOND));
    }

    @Test
    public void verifyCard_Success() {
        Vector result = stack.getCards();
        assertTrue(result.contains(new ClassicCard(Value.V_6, Suit.CLUB)));
    }

    //Fluent Validations
    @Test
    public void cardCount_Success() {
        int result = stack.cardCount();
        assertThat(result, is(13));
    }

    @Test
    public void isValid_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_1, Suit.SPADE);
        Boolean result = stack.isValid(classicCard);
        assertThat(result, is(true));
    }
}
