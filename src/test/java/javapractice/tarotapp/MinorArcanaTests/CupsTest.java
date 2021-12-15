package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CupsTest {

    @Test
    public void given1CupsGetLoveNewRelationshipsCompassionCreativity() {
        Cups cups = new Cups();
        // Given: I am a user
        String result = cups.generateTraits("1 cups");
        // When: I enter the suit cups, then the number 1
        assertEquals("Love, new relationships, compassion, creativity.", result);
        // Then: I get back "Love, new relationships, compassion, creativity."
    }

    @Test
    public void given6CupsGetRevisitingThePastChildhoodMemoriesInnocenceJoy() {
        Cups cups = new Cups();
        // Given: I am a user
        String result = cups.generateTraits("6 cups");
        // When: I enter the suit cups, then the number 6
        assertEquals("Revisiting the past, childhood memories, innocence, joy.", result);
        // Then: I get back the string "Revisiting the past, childhood memories, innocence, joy."
    }

    @Test
    public void given10CupsGetDivineLoveBlissfulRelationshipsHarmonyAlignment() {
        Cups cups = new Cups();
        // Given: I am a user
        String result = cups.generateTraits("10 cups");
        // When: I enter the suit cups, then the number 10
        assertEquals("Divine love, blissful relationships, harmony, alignment.", result);
        // Then: I get back the string "Divine love, blissful relationships, harmony, alignment."
    }

    @Test
    public void givenKnightCupsGetCreativityRomanceCharmImaginationBeauty() {
        Cups cups = new Cups();
        // Given: I am a user
        String result = cups.generateTraits("knight cups");
        // When: I enter the suit cups, then the court knight
        assertEquals("Creativity, romance, charm, imagination, beauty.", result);
        // Then: I get back the string "Creativity, romance, charm, imagination, beauty."
    }

    @Test
    public void givenKingCupsGetEmotionallyBalancedCompassionateDiplomatic() {
        Cups cups = new Cups();
        // Given: I am a user
        String result = cups.generateTraits("king cups");
        // When: I enter the suit cups, then the court king
        assertEquals( "Emotionally balanced, compassionate, diplomatic.", result);
        // Then: I get back the string "Emotionally balanced, compassionate, diplomatic."
    }
}


