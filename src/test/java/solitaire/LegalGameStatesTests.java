package solitaire;

import com.fbergeron.solitaire.LegalGameStates;
import org.junit.Test;

import static org.junit.Assert.*;

public class LegalGameStatesTests {
    @Test
    public void gsIdx_Success(){
        LegalGameStates legalGameStates = new LegalGameStates();
        int gsIdx = legalGameStates.getGsIdx();
        assertEquals(0, gsIdx);
    }
}
