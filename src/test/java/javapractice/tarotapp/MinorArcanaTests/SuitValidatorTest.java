package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.SuitValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitValidatorTest {

    @Test
    public void givenCardsGetTrue() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "cups"
        Boolean result = suitValidator.isSuit("cups");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenPentaclesGetTrue() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "pentacles"
        Boolean result = suitValidator.isSuit("pentacles");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenSwordsGetTrue() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "swords"
        Boolean result = suitValidator.isSuit("swords");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenWandsGetTrue() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "wands"
        Boolean result = suitValidator.isSuit("wands");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenBobGetFalse() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "bob"
        Boolean result = suitValidator.isSuit("bob");
        // Then: I get back false
        assertFalse(result);
    }

    @Test
    public void givenQueenGetFalse() {
        // Given: I am a user
        SuitValidator suitValidator = new SuitValidator();
        // When: I enter the string "queen"
        Boolean result = suitValidator.isSuit("queen");
        // Then: I get back false
        assertFalse(result);
    }

}