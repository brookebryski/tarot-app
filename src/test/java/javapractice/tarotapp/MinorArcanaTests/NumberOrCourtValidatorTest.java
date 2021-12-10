package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.NumberOrCourtValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOrCourtValidatorTest {

    @Test
    public void given1GetTrue() {
        // Given: I am a user
        NumberOrCourtValidator numberValidator = new NumberOrCourtValidator();
        // When: I enter the string "1"
        Boolean result = numberValidator.isValid("1");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void given5GetTrue() {
        // Given: I am a user
        NumberOrCourtValidator numberValidator = new NumberOrCourtValidator();
        // When: I enter the string "5"
        Boolean result = numberValidator.isValid("5");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void given10GetTrue() {
        // Given: I am a user
        NumberOrCourtValidator numberValidator = new NumberOrCourtValidator();
        // When: I enter the string "10"
        Boolean result = numberValidator.isValid("10");
        // Then: I get back true
        assertTrue(result);
    }

    @Test
    public void given0GetFalse() {
        // Given: I am a user
        NumberOrCourtValidator numberValidator = new NumberOrCourtValidator();
        // When: I enter the string "0"
        Boolean result = numberValidator.isValid("0");
        // Then: I get back false
        assertFalse(result);
    }

    @Test
    public void given11GetFalse() {
        // Given: I am a user
        NumberOrCourtValidator numberValidator = new NumberOrCourtValidator();
        // When: I enter the string "11"
        Boolean result = numberValidator.isValid("11");
        // Then: I get back false
        assertFalse(result);
    }

}