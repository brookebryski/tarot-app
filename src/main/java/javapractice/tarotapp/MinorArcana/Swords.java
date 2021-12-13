package javapractice.tarotapp.MinorArcana;

public class Swords implements ISwords {
    private ISuitGetter _suitGetter;
    private INumberOrCourtGetter _numberOrCourtGetter;

    public Swords(INumberOrCourtGetter numberOrCourtGetter, ISuitGetter suitGetter) {
        this._numberOrCourtGetter = numberOrCourtGetter;
        this._suitGetter = suitGetter;
    }

    public String generateTraits() {
        String card = _numberOrCourtGetter.getInput() + " " +_suitGetter.getInput();
        switch (card) {
            case "1 swords":
                return "Breakthroughs, new ideas, mental clarity, success.";
            case "2 swords":
                return "Difficult decisions, weighing up options, an impasse, avoidance.";
            case "3 swords":
                return "Heartbreak, emotional pain, sorrow, grief, hurt.";
            case "4 swords":
                return "Rest, relaxation, meditation, contemplation, recuperation.";
            case "5 swords":
                return "Conflict, disagreements, competition, defeat, winning at all costs.";
            case "6 swords":
                return "Transition, change, rite of passage, releasing baggage.";
            case "7 swords":
                return "Betrayal, deception, getting away with something, acting strategically.";
            case "8 swords":
                return "Negative thoughts, self-imposed restriction, imprisonment, victim mentality.";
            case "9 swords":
                return "Anxiety, worry, fear, depression, nightmares.";
            case "10 swords":
                return "Painful endings, deep wounds, betrayal, loss, crisis.";
            case "page swords":
                return "New ideas, curiosity, thirst for knowledge, new ways of communicating.";
            case "knight swords":
                return "Ambitious, action-oriented, driven to succeed, fast-thinking.";
            case "queen swords":
                return "Independent, unbiased judgement, clear boundaries, direct communication.";
            default:
                return "Mental clarity, intellectual power, authority, truth.";
        }
    }
    // Ace of Swords: "Breakthroughs, new ideas, mental clarity, success."
    // 2 of Swords: "Difficult decisions, weighing up options, an impasse, avoidance."
    // 3 of Swords: "Heartbreak, emotional pain, sorrow, grief, hurt."
    // 4 of Swords: "Rest, relaxation, meditation, contemplation, recuperation."
    // 5 of Swords: "Conflict, disagreements, competition, defeat, winning at all costs."
    // 6 of Swords: "Transition, change, rite of passage, releasing baggage."
    // 7 of Swords: "Betrayal, deception, getting away with something, acting strategically."
    // 8 of Swords: "Negative thoughts, self-imposed restriction, imprisonment, victim mentality."
    // 9 of Swords: "Anxiety, worry, fear, depression, nightmares."
    // 10 of Swords: "Painful endings, deep wounds, betrayal, loss, crisis."
    // Page of Swords: "New ideas, curiosity, thirst for knowledge, new ways of communicating."
    // Knight of Swords: "Ambitious, action-oriented, driven to succeed, fast-thinking."
    // Queen of Swords: "Independent, unbiased judgement, clear boundaries, direct communication."
    // King of Swords: "Mental clarity, intellectual power, authority, truth."
}
