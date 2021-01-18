package solitaire;

import com.fbergeron.card.*;
import com.fbergeron.solitaire.SequentialStack;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SequentialStackStackTests {
    public static Stack stack = new Stack();
    public static ClassicCard[] cards = {
            new ClassicCard(Value.V_1, Suit.DIAMOND)
    };

    @BeforeClass
    public static void beforeCondition() {
        for (ClassicCard card : cards) {
            stack.push(card);
        }
        stack.setLocation(10, 10);
    }

    @Test
    public void isStackValid_Success() {
        SequentialStack sequentialStack = new SequentialStack();
        boolean result = sequentialStack.isValid(stack);
        assertTrue(result);
    }
}
