package javapractice.tarotapp;

import java.util.Locale;

public class MajorArcanaValidator implements IMajorArcanaValidator {
    public boolean isMajorArcana(String input) {
        String cleanInput = input.toLowerCase();
        if ((cleanInput.equals("the fool"))) {
            return true;
        } else if ((cleanInput.equals("the magician"))) {
            return true;
        } else if ((cleanInput.equals("the high priestess"))) {
            return true;
        } else if ((cleanInput.equals("the empress"))) {
            return true;
        } else if ((cleanInput.equals("the emperor"))) {
            return true;
        } else if ((cleanInput.equals("the hierophant"))) {
            return true;
        } else if ((cleanInput.equals("the lovers"))) {
            return true;
        } else if ((cleanInput.equals("the chariot"))) {
            return true;
        } else if ((cleanInput.equals("strength"))) {
            return true;
        } else if ((cleanInput.equals("the hermit"))) {
            return true;
        } else if ((cleanInput.equals("the wheel of fortune"))) {
            return true;
        } else if ((cleanInput.equals("justice"))) {
            return true;
        } else if ((cleanInput.equals("the hanged man"))) {
            return true;
        } else if ((cleanInput.equals("death"))) {
            return true;
        } else if ((cleanInput.equals("temperance"))) {
            return true;
        } else if ((cleanInput.equals("devil"))) {
            return true;
        } else if ((cleanInput.equals("the tower"))) {
            return true;
        } else if ((cleanInput.equals("the star"))) {
            return true;
        } else if ((cleanInput.equals("the moon"))) {
            return true;
        } else if ((cleanInput.equals("the sun"))) {
            return true;
        } else if ((cleanInput.equals("judgement"))) {
            return true;
        } else {
            return false;
        }
    }
}