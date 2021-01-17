package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Stack;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StackMovesTests {
    @Test
    public void popCard_Success() {
        Stack stack = new Stack();
        ClassicCard card1 = new ClassicCard(Value.V_1, Suit.SPADE);
        ClassicCard card2 = new ClassicCard(Value.V_1, Suit.CLUB);
        stack.push(card1);
        stack.push(card2);
        stack.pop(card2);
        int result = stack.cardCount();
        assertThat(result, equalTo(1));
    }

    @Test
    public void firstIsNotFaceUp_Success() {
        Stack stack = new Stack();
        ClassicCard card = new ClassicCard(Value.V_1, Suit.SPADE);
        stack.push(card);
        int result = stack.firstFaceUp();
        assertEquals(-1, result);
    }

    @Test
    public void firstIsFaceUp_Success() {
        Stack stack = new Stack();
        ClassicCard card = new ClassicCard(Value.V_1, Suit.SPADE);
        card.turnFaceUp();
        stack.push(card);
        int result = stack.firstFaceUp();
        assertEquals(0, result);
    }
}
