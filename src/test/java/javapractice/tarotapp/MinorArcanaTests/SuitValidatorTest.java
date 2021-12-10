package javapractice.tarotapp.MinorArcanaTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitValidatorTest {

    @Test
    public void givenCardsGetTrue() {
        // Given: I am a user
        // When: I enter the string "cups"
        // Then: I get back true
    }

    @Test
    public void givenPentaclesGetTrue() {
        // Given: I am a user
        // When: I enter the string "pentacles"
        // Then: I get back true
    }

    @Test
    public void givenSwordsGetTrue() {
        // Given: I am a user
        // When: I enter the string "swords"
        // Then: I get back true
    }

    @Test
    public void givenWandsGetTrue() {
        // Given: I am a user
        // When: I enter the string "wands"
        // Then: I get back true
    }

    @Test
    public void givenBobGetFalse() {
        // Given: I am a user
        // When: I enter the string "bob"
        // Then: I get back false
    }

    @Test
    public void givenQueenGetFalse() {
        // Given: I am a user
        // When: I enter the string "queen"
        // Then: I get back false
    }

}