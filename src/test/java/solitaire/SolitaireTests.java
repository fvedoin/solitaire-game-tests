package solitaire;

import com.fbergeron.solitaire.Solitaire;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolitaireTests {
    @Test
    public void solitaireIsVisible_Success() {
        Solitaire solitaire = new Solitaire(true);
        solitaire.setVisible(true);
        Boolean result = solitaire.isVisible();
        assertTrue(result);
    }
}
