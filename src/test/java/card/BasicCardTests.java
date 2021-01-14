package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.awt.*;

public class BasicCardTests {

    @Test
    public void setSize_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.HEART);
        classicCard.setSize(20, 30);
        Dimension result = classicCard.getSize();
        assertEquals(new Dimension(20, 30), result);
    }

    @Test
    public void turnFaceUp_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.DIAMOND);
        classicCard.turnFaceUp();
        Boolean result = classicCard.isFaceDown();
        assertEquals(false, result);
    }

    @Test
    public void isFaceDown_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.DIAMOND);
        Boolean result = classicCard.isFaceDown();
        assertEquals(true, result);
    }

    @Test
    public void turnFaceDown_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.DIAMOND);
        classicCard.turnFaceUp();
        classicCard.turnFaceDown();
        Boolean result = classicCard.isFaceDown();
        assertEquals(true, result);
    }

    @Test
    public void testContains() {
        ClassicCard classicCard = new ClassicCard(Value.V_1, Suit.DIAMOND);
        classicCard.setLocation(20, 30);
        Boolean result = classicCard.contains(classicCard.getLocation());
        assertEquals(true, result);
    }
}
