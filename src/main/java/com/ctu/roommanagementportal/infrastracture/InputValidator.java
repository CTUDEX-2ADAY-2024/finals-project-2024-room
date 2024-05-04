/**
 * Package declaration for the InputValidator class
 */

package com.ctu.roommanagementportal.infrastracture;

//Import statement
import java.util.Scanner;

/**
 * Represents a class for validating user input.
 */
public class InputValidator {
    /**
     * Validates string input.
     * @param scanner The Scanner object to read user input.
     * @return The validated string input
     */
    public static String validateStringInput(Scanner scanner) {
        while (true) {
            String input = scanner.next().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Invalid input. Please enter a non-empty string:");
            }
        }
    }

    /**
     * Validates room type input.
     * @param scanner The Scanner object to read user input.
     * @return The validated room type input.
     */
    public static int validateRoomTypeInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int type = scanner.nextInt();
                if (type >= 1 && type <= 4) {
                    return type;
                }
            }
            System.out.println("Invalid input. Please enter: ");
            System.out.println("1 for Classroom");
            System.out.println("2 for Computer Laboratory");
            System.out.println("3 for Library");
            System.out.println("4 for Smart room");
            scanner.next(); // Clear invalid input
        }
    }

    /**
     * Validates integer input
     * @param scanner The Scanner object to read user input.
     * @return The validated integer input.
     */
    public static int validateIntegerInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer:");
                scanner.next(); // Clear invalid input
            }
        }
    }

    /**
     * Validates boolean input.
     * @param scanner The Scanner object to read user input.
     * @return The validated boolean input.
     */
    public static boolean validateBooleanInput(Scanner scanner) {
        while (true) {
            String input = scanner.next().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no':");
            }
        }
    }
}
