package javapractice.tarotapp.MinorArcana;

import java.util.Locale;

public class SuitValidator implements ISuitValidator {
    public boolean isSuit(String suit) {
        String cleanSuit = suit.toLowerCase();
        switch (cleanSuit) {
            case "cups":
            case "pentacles":
            case "swords":
            case "wands":
                return true;
            default:
            return false;
        }
    }
}
