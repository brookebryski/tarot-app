package javapractice.tarotapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorArcanaTest {
    @Test
    public void givenTheFoolGetNewBeginningsInnocenceAdventure() {
        MajorArcana majorArcana = new MajorArcana();
        // Given: I am a user
        String result = majorArcana.generateTraits("the fool");
        // When: I enter the string "The Fool"
        assertEquals("New beginnings, innocence, adventure", result);
        // Then: I get back the string "New beginnings, innocence, adventure"
    }

    @Test
    public void givenTheHighPriestessGetIntuitiveUnconsciousDivineFeminine() {
        MajorArcana majorArcana = new MajorArcana();
        // Given: I am a user
        String result = majorArcana.generateTraits("the high priestess");
        // When: I enter the string "The High Priestess"
        assertEquals("Intuitive, unconscious, divine feminine", result);
        // Then: I get back the string "Intuitive, unconscious, divine feminine"
    }

    @Test
    public void givenTheLoversGetLoveHarmonyPartnershipsChoices() {
        MajorArcana majorArcana = new MajorArcana();
        // Given: I am a user
        String result = majorArcana.generateTraits("the lovers");
        // When: I enter the string "The Lovers"
        assertEquals("Love, harmony, partnerships, choices", result);
        // Then: I get back the string "Love, harmony, partnerships, choices"
    }

    @Test
    public void givenTheWheelOfFortuneGetChanceDestinyFateKarmaTurningPointsLifeCycles() {
        // Given: I am a user
        MajorArcana majorArcana = new MajorArcana();
        // When: I enter the string "The Wheel of Fortune"
        String result = majorArcana.generateTraits("the wheel of fortune");
        // Then: I get back the string "Chance, destiny and fate, karma, turning points, life cycles"
        assertEquals("Chance, destiny and fate, karma, turning points, life cycles", result);
    }

    @Test
    public void givenTheWorldGetFulfillmentHarmonyCompletionIntegrationTravelUnity() {
        // Given: I am a user
        MajorArcana majorArcana = new MajorArcana();
        // When: I enter the string "The World"
        String result = majorArcana.generateTraits("the world");
        // Then: I get back the string "Fulfillment, harmony, completion, integration, travel, unity"
        assertEquals("Fulfillment, harmony, completion, integration, travel, unity", result);
    }

}