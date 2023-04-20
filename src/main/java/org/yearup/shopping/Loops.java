package org.yearup.shopping;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[3];
        numbers[0] = 49;
        numbers[1] = 23;
        numbers[2] = 170000;

        System.out.println("Your choices are:");
        for (int i: numbers){
            System.out.println(i);
        }


        Scanner scanner = new Scanner(System.in);

        boolean found = false;
        do {
            System.out.println("Pick one from the list, please");
            int usersChoice = scanner.nextInt();

            for (int i : numbers) {
                if (usersChoice == i) {
                    System.out.println("Got it!");
                    found = true;
                }
            }
        } while ( ! found );

    }
}
