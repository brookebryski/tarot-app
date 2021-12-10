package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CupsTest {

    private ISuitGetter suitGetter;
    private INumberOrCourtGetter numberOrCourtGetter;
    private ICups cups;

    @BeforeEach
    public void startup() {
        this.suitGetter = mock(SuitGetter.class);
        this.numberOrCourtGetter = mock(NumberOrCourtGetter.class);

        this.cups = new Cups(numberOrCourtGetter, suitGetter);
    }

    @Test
    public void given1CupsGetLoveNewRelationshipsCompassionCreativity() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("cups");
        when(numberOrCourtGetter.getInput()).thenReturn("1");
        // When: I enter the suit cups, then the number 1
        String result = cups.generateTraits();
        // Then: I get back "Love, new relationships, compassion, creativity."
        assertEquals("Love, new relationships, compassion, creativity.", result);
    }

    // Given: I am a user
    // When: I enter the suit cups, then the number 6
    // Then: I get back the string "Revisiting the past, childhood memories, innocence, joy."

}
