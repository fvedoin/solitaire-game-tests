package solitaire;

import com.fbergeron.card.Card;
import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import com.fbergeron.solitaire.SequentialStack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SequentialStackCardTests {
    @Parameter(0)
    public Value value;
    @Parameter(1)
    public Suit suit;

    @Test
    public void isCardValid_Success(){
        SequentialStack sequentialStack = new SequentialStack();
        Card card = new ClassicCard(value, suit);
        boolean result = sequentialStack.isValid(card);
        assertTrue(result);
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
