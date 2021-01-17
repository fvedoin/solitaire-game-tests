package solitaire;

import com.fbergeron.solitaire.FrameRules;
import org.junit.Test;

import java.awt.*;
import static org.junit.Assert.*;

public class FrameRulesTests {
    @Test
    public void frameRulesDimension_Success() {
        FrameRules frameRules = new FrameRules();
        Dimension result = frameRules.getSize();
        Dimension compare = new Dimension(500, 600);
        assertEquals(compare, result);
    }

    @Test
    public void frameRulesVisible_Success() {
        FrameRules frameRules = new FrameRules();
        Boolean result = frameRules.isVisible();
        assertFalse(result);
    }

    @Test
    public void getTitle_Success() {
        FrameRules frameRules = new FrameRules();
        String result = frameRules.getTitle();
        assertEquals("Rules", result);
    }

    @Test
    public void getLocation_Success() {
        FrameRules frameRules = new FrameRules();
        Point result = frameRules.getLocation();
        assertEquals(result, new Point(50, 50));
    }
}
