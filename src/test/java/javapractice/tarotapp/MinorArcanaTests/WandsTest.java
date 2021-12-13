package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WandsTest {

    private ISuitGetter suitGetter;
    private INumberOrCourtGetter numberOrCourtGetter;
    private IWands wands;

    @BeforeEach
    public void startup() {
        this.suitGetter = mock(SuitGetter.class);
        this.numberOrCourtGetter = mock(NumberOrCourtGetter.class);

        this.wands = new Wands(numberOrCourtGetter, suitGetter);
    }

    @Test
    public void given1WandsGetInspirationNewOpportunitiesGrowthPotential() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("wands");
        when(numberOrCourtGetter.getInput()).thenReturn("1");
        // When: I enter the suit wands, then the number 1
        String result = wands.generateTraits();
        // Then: I get back "Inspiration, new opportunities, growth, potential."
        assertEquals("Inspiration, new opportunities, growth, potential.", result);
    }

    @Test
    public void given6WandsGetSuccessPublicRecognitionProgressSelfConfidence() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("wands");
        when(numberOrCourtGetter.getInput()).thenReturn("6");
        // When: I enter the suit wands, then the number 6
        String result = wands.generateTraits();
        // Then: I get back "Success, public recognition, progress, self-confidence."
        assertEquals("Success, public recognition, progress, self-confidence.", result);
    }

    @Test
    public void given10WandsGetBurdenExtraResponsibilityHardWorkCompletion() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("wands");
        when(numberOrCourtGetter.getInput()).thenReturn("10");
        // When: I enter the suit wands, then the number 10
        String result = wands.generateTraits();
        // Then: I get back "Burden, extra responsibility, hard work, completion."
        assertEquals("Burden, extra responsibility, hard work, completion.", result);
    }

    @Test
    public void givenKnightWandsGetEnergyPassionInspiredActionAdventureImpulsiveness() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("wands");
        when(numberOrCourtGetter.getInput()).thenReturn("knight");
        // When: I enter the suit wands, then the court knight
        String result = wands.generateTraits();
        // Then: I get back "Energy, passion, inspired action, adventure, impulsiveness."
        assertEquals("Energy, passion, inspired action, adventure, impulsiveness.", result);
    }

    @Test
    public void givenKingWandsGetNaturalBornLeaderVisionEntrepreneurHonour() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("wands");
        when(numberOrCourtGetter.getInput()).thenReturn("king");
        // When: I enter the suit wands, then the court king
        String result = wands.generateTraits();
        // Then: I get back "Natural-born leader, vision, entrepreneur, honour."
        assertEquals("Natural-born leader, vision, entrepreneur, honour.", result);
    }

}
