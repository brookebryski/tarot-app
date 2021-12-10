package javapractice.tarotapp.MinorArcana;

import java.util.Scanner;

public class NumberOrCourtGetter implements INumberOrCourtGetter {
    public String getInput() {
        System.out.println("Please enter a number between 1 and 10, or a court card - page, knight, king, or queen.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
