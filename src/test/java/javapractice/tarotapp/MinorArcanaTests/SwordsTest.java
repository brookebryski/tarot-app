package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SwordsTest {

    @Test
    public void given1SwordsGetBreakthroughsNewIdeasMentalClaritySuccess() {
        Swords swords = new Swords();
        // Given: I am a user
        String result = swords.generateTraits("1 swords");
        // When: I enter the suit swords, then the number 1
        assertEquals("Breakthroughs, new ideas, mental clarity, success.", result);
        // Then: I get back "Breakthroughs, new ideas, mental clarity, success."
    }

    @Test
    public void given6SwordsGetTransitionChangeRiteOfPassageReleasingBaggage() {
        Swords swords = new Swords();
        // Given: I am a user
        String result = swords.generateTraits("6 swords");
        // When: I enter the suit swords, then the number 6
        assertEquals("Transition, change, rite of passage, releasing baggage.", result);
        // Then: I get back "Transition, change, rite of passage, releasing baggage."
    }

    @Test
    public void given10SwordsGetPainfulEndingsDeepWoundsBetrayalLossCrisis() {
        Swords swords = new Swords();
        // Given: I am a user
        String result = swords.generateTraits("10 swords");
        // When: I enter the suit swords, then the number 10
        assertEquals("Painful endings, deep wounds, betrayal, loss, crisis.", result);
        // Then: I get back "Painful endings, deep wounds, betrayal, loss, crisis."
    }

    @Test
    public void givenKnightSwordsGetAmbitiousActionOrientedDrivenToSucceedFastThinking() {
        Swords swords = new Swords();
        // Given: I am a user
        String result = swords.generateTraits("knight swords");
        // When: I enter the suit swords, then the court knight
        assertEquals("Ambitious, action-oriented, driven to succeed, fast-thinking.", result);
        // Then: I get back "Ambitious, action-oriented, driven to succeed, fast-thinking."
    }

    @Test
    public void givenKingSwordsGetMentalClarityIntellectualPowerAuthorityTruth() {
        Swords swords = new Swords();
        // Given: I am a user
        String result = swords.generateTraits("king swords");
        // When: I enter the suit swords, then the court king
        assertEquals("Mental clarity, intellectual power, authority, truth.", result);
        // Then: I get back "Mental clarity, intellectual power, authority, truth."
    }
}
