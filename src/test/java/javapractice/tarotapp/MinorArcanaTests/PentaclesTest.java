package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PentaclesTest {

    @Test
    public void given1PentaclesGetNewFinancialOrCareerOpportunityManifestationAbundance() {
        Pentacles pentacles = new Pentacles();
        // Given: I am a user
        String result = pentacles.generateTraits("1 pentacles");
        // When: I enter the suit pentacles, then the number 1
        assertEquals("A new financial or career opportunity, manifestation, abundance", result);
        // Then: I get back "A new financial or career opportunity, manifestation, abundance"
    }

    @Test
    public void given6PentaclesGetGivingReceivingSharingWealthGenerosityCharity() {
        Pentacles pentacles = new Pentacles();
        // Given: I am a user
        String result = pentacles.generateTraits("6 pentacles");
        // When: I enter the suit pentacles, then the number 6
        assertEquals("Giving, receiving, sharing wealth, generosity, charity", result);
        // Then: I get back "Giving, receiving, sharing wealth, generosity, charity"
    }

    @Test
    public void given10PentaclesGetWealthFinancialSecurityFamilyLongTermSuccessContribution() {
        Pentacles pentacles = new Pentacles();
        // Given: I am a user
        String result = pentacles.generateTraits("10 pentacles");
        // When: I enter the suit pentacles, then the number 10
        assertEquals("Wealth, financial security, family, long-term success, contribution.", result);
        // Then: I get back "Wealth, financial security, family, long-term success, contribution."
    }

    @Test
    public void givenKnightPentaclesGetHardWorkProductivityRoutineConservatism() {
        Pentacles pentacles = new Pentacles();
        // Given: I am a user
        String result = pentacles.generateTraits("knight pentacles");
        // When: I enter the suit pentacles, then the court knight
        assertEquals("Hard work, productivity, routine, conservatism.", result);
        // Then: I get back "Hard work, productivity, routine, conservatism."
    }

    @Test
    public void givenKingPentaclesGetWealthBusinessLeadershipSecurityDisciplineAbundance() {
        Pentacles pentacles = new Pentacles();
        // Given: I am a user
        String result = pentacles.generateTraits("king pentacles");
        // When: I enter the suit pentacles, then the court king
        assertEquals("Wealth, business, leadership, security, discipline, abundance.", result);
        // Then: I get back "Wealth, business, leadership, security, discipline, abundance."
    }

}
