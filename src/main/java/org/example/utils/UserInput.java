package org.example.utils;

import java.util.Scanner;

public class UserInput {
    public  static int  getInputInteger(String stringToPrint){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringToPrint);
        String input = scanner.nextLine();

        return Integer.parseInt(input);
    }

    public static String getUserInput(String stringToPrint){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringToPrint);
        return scanner.nextLine();

    }
}
