package javapractice.tarotapp.MinorArcanaTests;

import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WandsTest {

   @Test
   public void given1WandsGetInspirationNewOpportunitiesGrowthPotential() {
      Wands wands = new Wands();
      // Given: I am a user
      String result = wands.generateTraits("1 wands");
      // When: I enter the suit wands, then the number 1
      assertEquals("Inspiration, new opportunities, growth, potential.", result);
      // Then: I get back "Inspiration, new opportunities, growth, potential."
   }

   @Test
   public void given6WandsGetSuccessPublicRecognitionProgressSelfConfidence() {
      Wands wands = new Wands();
      // Given: I am a user
      String result = wands.generateTraits("6 wands");
      // When: I enter the suit wands, then the number 6
      assertEquals("Success, public recognition, progress, self-confidence.", result);
      // Then: I get back "Success, public recognition, progress, self-confidence."
   }

   @Test
   public void given10WandsGetBurdenExtraResponsibilityHardWorkCompletion() {
      Wands wands = new Wands();
      // Given: I am a user
      String result = wands.generateTraits("10 wands");
      // When: I enter the suit wands, then the number 10
      assertEquals("Burden, extra responsibility, hard work, completion.", result);
      // Then: I get back "Burden, extra responsibility, hard work, completion."
   }

   @Test
   public void givenKnightWandsGetEnergyPassionInspiredActionAdventureImpulsiveness() {
      Wands wands = new Wands();
      // Given: I am a user
      String result = wands.generateTraits("knight wands");
      // When: I enter the suit wands, then the court knight
      assertEquals("Energy, passion, inspired action, adventure, impulsiveness.", result);
      // Then: I get back "Energy, passion, inspired action, adventure, impulsiveness."
   }

   @Test
   public void givenKingWandsGetNaturalBornLeaderVisionEntrepreneurHonour() {
      Wands wands = new Wands();
      // Given: I am a user
      String result = wands.generateTraits("king wands");
      // When: I enter the suit wands, then the court king
      assertEquals("Natural-born leader, vision, entrepreneur, honour.", result);
      // Then: I get back "Natural-born leader, vision, entrepreneur, honour."
      }
   }


