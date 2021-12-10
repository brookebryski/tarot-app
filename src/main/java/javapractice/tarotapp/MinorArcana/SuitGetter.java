package javapractice.tarotapp.MinorArcana;

import java.util.Scanner;

public class SuitGetter implements ISuitGetter {
    public String getInput() {
        System.out.println("Please enter a suit");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
