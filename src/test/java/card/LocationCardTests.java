package card;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class LocationCardTests {
    @Test
    public void setLocationCoordinates_Success() {
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.DIAMOND);
        classicCard.setLocation(20, 30);
        classicCard.getLocation();
        Boolean result = classicCard.contains(classicCard.getLocation());
        assertEquals(true, result);
    }

    @Test
    public void setLocationPoint_Success() {
        Point location = new Point(20, 30);
        ClassicCard classicCard = new ClassicCard(Value.V_ACE, Suit.DIAMOND);
        classicCard.setLocation(location);
        classicCard.getLocation();
        Boolean result = classicCard.contains(classicCard.getLocation());
        assertEquals(true, result);
    }
}
