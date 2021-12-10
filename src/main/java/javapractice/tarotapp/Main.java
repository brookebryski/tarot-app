package javapractice.tarotapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a card");
        String input = scanner.nextLine();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IFlowControl flowControl = (IFlowControl) context.getBean("iFlowControl");

        flowControl.run(input);
    }
}
