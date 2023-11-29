package demo;

import java.util.Scanner;

public class LoveCalculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get names from user
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String secondName = scanner.nextLine();

        // Calculate love score
        int loveScore = calculateLoveScore(firstName, secondName);

        // Display result
        System.out.println("\nLove Calculator Result:");
        System.out.println(firstName + " and " + secondName + "'s Love Score is: " + loveScore + "%");

        // Determine love level
        determineLoveLevel(loveScore);

        scanner.close();
    }

    // Arbitrary algorithm to calculate love score
    private static int calculateLoveScore(String firstName, String secondName) {
        // Combine names and convert to lowercase
        String combinedNames = (firstName + secondName).toLowerCase();

        // Calculate love score (just a random algorithm for illustration)
        int loveScore = 0;
        for (char letter : combinedNames.toCharArray()) {
            loveScore += letter;
        }

        return loveScore % 101; // Love score is between 0 and 100
    }

    // Determine love level based on the love score
    private static void determineLoveLevel(int loveScore) {
        if (loveScore >= 80) {
            System.out.println("Wow! That's true love!");
        } else if (loveScore >= 60) {
            System.out.println("Looks like a strong connection.");
        } else if (loveScore >= 40) {
            System.out.println("Not bad. There's potential.");
        } else {
            System.out.println("Hmm, maybe not a perfect match.");
        }
    }



	}


