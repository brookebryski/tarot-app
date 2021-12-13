package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PentaclesTest {
    private ISuitGetter suitGetter;
    private INumberOrCourtGetter numberOrCourtGetter;
    private IPentacles pentacles;

    @BeforeEach
    public void startup() {
        this.suitGetter = mock(SuitGetter.class);
        this.numberOrCourtGetter = mock(NumberOrCourtGetter.class);

        this.pentacles = new Pentacles(numberOrCourtGetter, suitGetter);
    }

    @Test
    public void given1PentaclesGetANewFinancialOrCareerOpportunityManifestationAbundance() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("pentacles");
        when(numberOrCourtGetter.getInput()).thenReturn("1");
        // When: I enter the suit pentacles, then the number 1
        String result = pentacles.generateTraits();
        // Then: I get back "A new financial or career opportunity, manifestation, abundance"
        assertEquals("A new financial or career opportunity, manifestation, abundance.", result);
    }

    @Test
    public void given6PentaclesGetGivingReceivingSharingWealthGenerosityCharity() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("pentacles");
        when(numberOrCourtGetter.getInput()).thenReturn("6");
        // When: I enter the suit pentacles, then the number 6
        String result = pentacles.generateTraits();
        // Then: I get back "Giving, receiving, sharing wealth, generosity, charity"
        assertEquals("Giving, receiving, sharing wealth, generosity, charity.", result);
    }

    @Test
    public void given10PentaclesGetWealthFinancialSecurityFamilyLongTermSuccessContribution() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("pentacles");
        when(numberOrCourtGetter.getInput()).thenReturn("10");
        // When: I enter the suit pentacles, then the number 10
        String result = pentacles.generateTraits();
        // Then: I get back "Wealth, financial security, family, long-term success, contribution."
        assertEquals("Wealth, financial security, family, long-term success, contribution.", result);
    }

    @Test
    public void givenKnightPentaclesGetHardWorkProductivityRoutineConservatism() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("pentacles");
        when(numberOrCourtGetter.getInput()).thenReturn("knight");
        // When: I enter the suit pentacles, then the court knight
        String result = pentacles.generateTraits();
        // Then: I get back "Hard work, productivity, routine, conservatism."
        assertEquals("Hard work, productivity, routine, conservatism.", result);
    }

    @Test
    public void givenKingPentaclesGetWealthBusinessLeadershipSecurityDisciplineAbundance() {
        // Given: I am a user
        when(suitGetter.getInput()).thenReturn("pentacles");
        when(numberOrCourtGetter.getInput()).thenReturn("king");
        // When: I enter the suit pentacles, then the court king
        String result = pentacles.generateTraits();
        // Then: I get back "Wealth, business, leadership, security, discipline, abundance."
        assertEquals("Wealth, business, leadership, security, discipline, abundance.", result);
    }
}
