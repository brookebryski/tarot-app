package javapractice.tarotapp.MinorArcana;

public class Cups implements ICups {

    private ISuitGetter _suitGetter;
    private INumberOrCourtGetter _numberOrCourtGetter;

    public Cups(INumberOrCourtGetter numberOrCourtGetter, ISuitGetter suitGetter) {
        this._numberOrCourtGetter = numberOrCourtGetter;
        this._suitGetter = suitGetter;
    }

    public String generateTraits() {
        String card = _numberOrCourtGetter.getInput() + " " + _suitGetter.getInput();
        switch (card) {
            case "1 cups":
                return "Love, new relationships, compassion, creativity.";
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
