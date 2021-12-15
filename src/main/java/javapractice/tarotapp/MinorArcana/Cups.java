package javapractice.tarotapp.MinorArcana;

public class Cups implements ICups {
    public String generateTraits(String card) {
        switch (card) {
            case "1 cups":
                return "Love, new relationships, compassion, creativity.";
            case "2 cups":
                return "Unified love, partnership, mutual attraction.";
            case "3 cups":
                return "Celebration, friendship, creativity, collaborations.";
            case "4 cups":
                return "Meditation, contemplation, apathy, reevaluation.";
            case "5 cups":
                return "Regret, failure, disappointment, pessimism.";
            case "6 cups":
                return "Revisiting the past, childhood memories, innocence, joy.";
            case "7 cups":
                return "Opportunities, choices, wishful thinking, illusion.";
            case "8 cups":
                return "Disappointment, abandonment, withdrawal, escapism.";
            case "9 cups":
                return "Contentment, satisfaction, gratitude, wish come true.";
            case "10 cups":
                return "Divine love, blissful relationships, harmony, alignment.";
            case "page cups":
                return "Creative opportunities, intuitive messages, curiosity, possibility.";
            case "knight cups":
                return "Creativity, romance, charm, imagination, beauty.";
            case "queen cups":
                return "Compassionate, caring, emotionally stable, intuitive, in flow.";
            default:
                return "Emotionally balanced, compassionate, diplomatic.";
        }
    }
    // Ace of Cups: "Love, new relationships, compassion, creativity."
    // 2 of Cups: "Unified love, partnership, mutual attraction."
    // 3 of Cups: "Celebration, friendship, creativity, collaborations."
    // 4 of Cups: "Meditation, contemplation, apathy, reevaluation."
    // 5 of Cups: "Regret, failure, disappointment, pessimism."
    // 6 of Cups: "Revisiting the past, childhood memories, innocence, joy."
    // 7 of Cups:  "Opportunities, choices, wishful thinking, illusion."
    // 8 of Cups: "Disappointment, abandonment, withdrawal, escapism."
    // 9 of Cups: "Contentment, satisfaction, gratitude, wish come true."
    // 10 of Cups: "Divine love, blissful relationships, harmony, alignment."
    // Page of Cups: "Creative opportunities, intuitive messages, curiosity, possibility."
    // Knight of Cups: "Creativity, romance, charm, imagination, beauty."
    // Queen of Cups: "Compassionate, caring, emotionally stable, intuitive, in flow."
    // King of Cups: "Emotionally balanced, compassionate, diplomatic."
}
