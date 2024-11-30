package com.musa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGuessingDemo {
    public static void main(String[] args) {
        int numberTogues = (int) (Math.random() * 100) + 1;
        List<Integer> guesses = new ArrayList<>();
        int guessedNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the number guessing demo, guess a number between 1 and 100");
        while (guessedNumber != numberTogues) {
            System.out.println("Please enter a number between 1 and 100:");
            guessedNumber = scanner.nextInt();
            guesses.add(guessedNumber);
            if (guessedNumber < numberTogues) {
                System.out.println("Your guess is too low.");
            }else if (guessedNumber > numberTogues) {
                System.out.println("Your guess is too high.");
            }else if (guessedNumber == numberTogues) {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("Your guesses: " + guesses);
                break;
            }
        }
        scanner.close();
    }
}
