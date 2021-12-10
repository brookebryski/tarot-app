package javapractice.tarotapp.MinorArcana;

import java.util.Scanner;

public class NumberGetter implements INumberGetter {
    public String getInput() {
        System.out.println("Please enter a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
