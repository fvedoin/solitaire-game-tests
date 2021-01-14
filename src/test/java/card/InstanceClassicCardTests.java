package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class InstanceClassicCardTests {
    @Parameter(0)
    public Value value;
    @Parameter(1)
    public Suit suit;

    @Test
    public void getValue_Success() {
        ClassicCard classicCard = new ClassicCard(value, suit);
        Value result = classicCard.getValue();
        assertEquals(value, result);
    }

    @Test
    public void getSuit_Success() {
        ClassicCard classicCard = new ClassicCard(value, suit);
        Suit result = classicCard.getSuit();
        assertEquals(suit, result);
    }

    @Test
    public void getColor_Success() {
        ClassicCard classicCard = new ClassicCard(value, suit);
        Color result = classicCard.getColor();
        if (suit == Suit.SPADE || suit == Suit.CLUB) {
            assertEquals(Color.black, result);
        } else {
            assertEquals(Color.red, result);
        }
    }

    @Parameters(name = "{0} | {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Value.V_1, Suit.DIAMOND},
                {Value.V_2, Suit.CLUB},
                {Value.V_3, Suit.HEART},
                {Value.V_4, Suit.SPADE},
                {Value.V_5, Suit.DIAMOND},
                {Value.V_6, Suit.CLUB},
                {Value.V_7, Suit.HEART},
                {Value.V_8, Suit.SPADE},
                {Value.V_9, Suit.DIAMOND},
                {Value.V_10, Suit.CLUB},
                {Value.V_11, Suit.HEART},
                {Value.V_12, Suit.SPADE},
                {Value.V_13, Suit.DIAMOND},
        });
    }
}
