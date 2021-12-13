package javapractice.tarotapp.MinorArcana;

import java.util.Locale;

public class NumberOrCourtValidator {
    public boolean isValid(String input) {
        String cleanInput = input.toLowerCase();
        switch (cleanInput) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "page":
            case "knight":
            case "king":
            case "queen":
                return true;
            default:
                return false;
        }
    }
}
