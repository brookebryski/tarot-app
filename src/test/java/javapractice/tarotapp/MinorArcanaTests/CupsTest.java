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

    @Test
    public void given6CupsGetRevisitingPastChildhoodMemoriesInnocenceJoy() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("cups");
        when(numberOrCourtGetter.getInput()).thenReturn("6");
        // When: I enter the suit cups, then the number 6
        String result = cups.generateTraits();
        // Then: I get back the string "Revisiting the past, childhood memories, innocence, joy."
        assertEquals("Revisiting the past, childhood memories, innocence, joy.", result);
    }

    @Test
    public void given10CupsGetDivineLoveBlissfulRelationshipsHarmonyAlignment() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("cups");
        when(numberOrCourtGetter.getInput()).thenReturn("10");
        // When: I enter the suit cups, then the number 10
        String result = cups.generateTraits();
        // Then: I get back the string "Divine love, blissful relationships, harmony, alignment."
        assertEquals("Divine love, blissful relationships, harmony, alignment.", result);
    }

    @Test
    public void givenKnightCupsGetCreativityRomanceCharmImaginationBeauty() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("cups");
        when(numberOrCourtGetter.getInput()).thenReturn("knight");
        // When: I enter the suit cups, then the court knight
        String result = cups.generateTraits();
        // Then: I get back the string "Creativity, romance, charm, imagination, beauty."
        assertEquals("Creativity, romance, charm, imagination, beauty.", result);
    }

    @Test
    public void givenKingCupsGetEmotionallyBalancedCompassionateDiplomatic() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("cups");
        when(numberOrCourtGetter.getInput()).thenReturn("king");
        // When: I enter the suit cups, then the court king
        String result = cups.generateTraits();
        // Then: I get back the string "Emotionally balanced, compassionate, diplomatic."
        assertEquals("Emotionally balanced, compassionate, diplomatic.", result);
    }

}
