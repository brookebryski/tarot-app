package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SwordsTest {

    private ISuitGetter suitGetter;
    private INumberOrCourtGetter numberOrCourtGetter;
    private ISwords swords;

    @BeforeEach
    public void startup() {
        this.suitGetter = mock(SuitGetter.class);
        this.numberOrCourtGetter = mock(NumberOrCourtGetter.class);

        this.swords = new Swords(numberOrCourtGetter, suitGetter);
    }

    @Test
    public void given1SwordsGetBreakthroughsNewIdeasMentalClaritySuccess() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("swords");
        when(numberOrCourtGetter.getInput()).thenReturn("1");
        // When: I enter the suit swords, then the number 1
        String result = swords.generateTraits();
        // Then: I get back "Breakthroughs, new ideas, mental clarity, success."
        assertEquals("Breakthroughs, new ideas, mental clarity, success.", result);
    }

    @Test
    public void given6SwordsGetTransitionChangeRiteOfPassageReleasingBaggage() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("swords");
        when(numberOrCourtGetter.getInput()).thenReturn("6");
        // When: I enter the suit swords, then the number 6
        String result = swords.generateTraits();
        // Then: I get back "Transition, change, rite of passage, releasing baggage."
        assertEquals("Transition, change, rite of passage, releasing baggage.", result);
    }

    @Test
    public void given10SwordsGetPainfulEndingsDeepWoundsBetrayalLossCrisis() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("swords");
        when(numberOrCourtGetter.getInput()).thenReturn("10");
        // When: I enter the suit swords, then the number 10
        String result = swords.generateTraits();
        // Then: I get back "Painful endings, deep wounds, betrayal, loss, crisis."
        assertEquals("Painful endings, deep wounds, betrayal, loss, crisis.", result);
    }

    @Test
    public void givenKnightSwordsGetAmbitiousActionOrientedDrivenToSucceedFastThinking() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("swords");
        when(numberOrCourtGetter.getInput()).thenReturn("knight");
        // When: I enter the suit swords, then the court knight
        String result = swords.generateTraits();
        // Then: I get back "Ambitious, action-oriented, driven to succeed, fast-thinking."
        assertEquals("Ambitious, action-oriented, driven to succeed, fast-thinking.", result);
    }

    @Test
    public void givenKingSwordsGetMentalClarityIntellectualPowerAuthorityTruth() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("swords");
        when(numberOrCourtGetter.getInput()).thenReturn("king");
        // When: I enter the suit swords, then the court king
        String result = swords.generateTraits();
        // Then: I get back "Mental clarity, intellectual power, authority, truth."
        assertEquals("Mental clarity, intellectual power, authority, truth.", result);
    }
}
