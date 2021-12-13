package javapractice.tarotapp.MinorArcana;

public class Wands implements IWands {

    private ISuitGetter _suitGetter;
    private INumberOrCourtGetter _numberOrCourtGetter;

    public Wands(INumberOrCourtGetter numberOrCourtGetter, ISuitGetter suitGetter) {
        this._numberOrCourtGetter = numberOrCourtGetter;
        this._suitGetter = suitGetter;
    }

    public String generateTraits() {
        String card = _numberOrCourtGetter.getInput() + " " + _suitGetter.getInput();
        switch (card) {
            case "1 wands":
                return "Inspiration, new opportunities, growth, potential.";
            case "2 wands":
                return "Future planning, progress, decisions, discovery.";
            case "3 wands":
                return "Progress, expansion, foresight, overseas opportunities.";
            case "4 wands":
                return "Celebration, joy, harmony, relaxation, homecoming.";
            case "5 wands":
                return "Conflict, disagreements, competition, tension, diversity.";
            case "6 wands":
                return "Success, public recognition, progress, self-confidence.";
            case "7 wands":
                return "Challenge, competition, protection, perseverance.";
            case "8 wands":
                return  "Movement, fast paced change, action, alignment, air travel.";
            case "9 wands":
                return "Resilience, courage, persistence, test of faith, boundaries.";
            case "10 wands":
                return "Burden, extra responsibility, hard work, completion.";
            case "page wands":
                return "Inspiration, ideas, discovery, limitless potential, free spirit.";
            case "knight wands":
                return "Energy, passion, inspired action, adventure, impulsiveness.";
            case "queen wands":
                return "Courage, confidence, independence, social butterfly, determination.";
            default:
                return "Natural-born leader, vision, entrepreneur, honour.";
        }
    }
    // Ace of Wands: "Inspiration, new opportunities, growth, potential."
    // 2 of Wands: "Future planning, progress, decisions, discovery."
    // 3 of Wands: "Progress, expansion, foresight, overseas opportunities."
    // 4 of Wands: "Celebration, joy, harmony, relaxation, homecoming."
    // 5 of Wands: "Conflict, disagreements, competition, tension, diversity."
    // 6 of Wands: "Success, public recognition, progress, self-confidence."
    // 7 of Wands: "Challenge, competition, protection, perseverance."
    // 8 of Wands: "Movement, fast paced change, action, alignment, air travel."
    // 9 of Wands: "Resilience, courage, persistence, test of faith, boundaries."
    // 10 of Wands: "Burden, extra responsibility, hard work, completion."
    // Page of Wands: "Inspiration, ideas, discovery, limitless potential, free spirit."
    // Knight of Wands: "Energy, passion, inspired action, adventure, impulsiveness."
    // Queen of Wands: "Courage, confidence, independence, social butterfly, determination."
    // King of Wands: "Natural-born leader, vision, entrepreneur, honour."
}
