package javapractice.tarotapp.MajorArcanaTests;

import javapractice.tarotapp.MajorArcana.MajorArcanaValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorArcanaValidatorTest {

    @Test
    public void givenTheFoolGetTrue() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "the fool"
        Boolean result = majorArcanaValidator.isMajorArcana("the fool");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenTheEmpressGetTrue() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "the empress"
        Boolean result = majorArcanaValidator.isMajorArcana("the empress");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenStrengthGetTrue() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "strength"
        Boolean result = majorArcanaValidator.isMajorArcana("strength");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenJudgementGetTrue() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "judgement"
        Boolean result = majorArcanaValidator.isMajorArcana("judgement");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void givenBobGetFalse() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "bob"
        Boolean result = majorArcanaValidator.isMajorArcana("bob");
        // Then: I get back false
        assertFalse(result);
    }

    @Test
    public void givenNineOfCupsGetFalse() {
        // Given: I am a user
        MajorArcanaValidator majorArcanaValidator = new MajorArcanaValidator();
        // When: I enter the string "nine of cups"
        Boolean result = majorArcanaValidator.isMajorArcana("nine of cups");
        // Then: I get back false
        assertFalse(result);
    }

}