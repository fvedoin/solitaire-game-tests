package solitaire;

import com.fbergeron.solitaire.GameInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameInfoTests {

    @Test
    public void getDefaultType_Success() {
        GameInfo info = new GameInfo();
        String type = info.getType();
        assertEquals("Random", type);
    }

    @Test
    public void getDefaultSeed_Success() {
        GameInfo info = new GameInfo();
        int seed = info.getSeed();
        assertEquals(-1, seed);
    }
}


