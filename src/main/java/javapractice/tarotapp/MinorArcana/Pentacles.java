package javapractice.tarotapp.MinorArcana;

public class Pentacles implements IPentacles {

    private ISuitGetter _suitGetter;
    private INumberOrCourtGetter _numberOrCourtGetter;

    public Pentacles(INumberOrCourtGetter numberOrCourtGetter, ISuitGetter suitGetter) {
        this._numberOrCourtGetter = numberOrCourtGetter;
        this._suitGetter = suitGetter;
    }

    public String generateTraits() {
        String card = _numberOrCourtGetter.getInput() + " " + _suitGetter.getInput();
        switch (card) {
            case "1 pentacles":
                return "A new financial or career opportunity, manifestation, abundance.";
            case "2 pentacles":
                return "Multiple priorities, time management, prioritisation, adaptability.";
            case "3 pentacles":
                return "Teamwork, collaboration, learning, implementation.";
            case "4 pentacles":
                return "Saving money, security, conservatism, scarcity, control.";
            case "5 pentacles":
                return "Financial loss, poverty, lack mindset, isolation, worry.";
            case "6 pentacles":
                return "Giving, receiving, sharing wealth, generosity, charity.";
            case "7 pentacles":
                return "Long-term view, sustainable results, perseverance, investment.";
            case "8 pentacles":
                return "Apprenticeship, repetitive tasks, mastery, skill development.";
            case "9 pentacles":
                return "Abundance, luxury, self-sufficiency, financial independence.";
            case "10 pentacles":
                return "Wealth, financial security, family, long-term success, contribution.";
            case "page pentacles":
                return "Manifestation, financial opportunity, skill development.";
            case "knight pentacles":
                return "Hard work, productivity, routine, conservatism.";
            case "queen pentacles":
                return "Nurturing, practical, providing financially, a working parent.";
            default:
                return "Wealth, business, leadership, security, discipline, abundance.";
    }
}
    // Ace of Pentacles: "A new financial or career opportunity, manifestation, abundance."
    // 2 of Pentacles: "Multiple priorities, time management, prioritisation, adaptability."
    // 3 of Pentacles: "Teamwork, collaboration, learning, implementation."
    // 4 of Pentacles: "Saving money, security, conservatism, scarcity, control."
    // 5 of Pentacles: "Financial loss, poverty, lack mindset, isolation, worry."
    // 6 of Pentacles: "Giving, receiving, sharing wealth, generosity, charity."
    // 7 of Pentacles: "Long-term view, sustainable results, perseverance, investment."
    // 8 of Pentacles: "Apprenticeship, repetitive tasks, mastery, skill development."
    // 9 of Pentacles: "Abundance, luxury, self-sufficiency, financial independence."
    // 10 of Pentacles: "Wealth, financial security, family, long-term success, contribution."
    // Page of Pentacles: "Manifestation, financial opportunity, skill development."
    // Knight of Pentacles: "Hard work, productivity, routine, conservatism."
    // Queen of Pentacles: "Nurturing, practical, providing financially, a working parent."
    // King of Pentacles: " Wealth, business, leadership, security, discipline, abundance."
}
