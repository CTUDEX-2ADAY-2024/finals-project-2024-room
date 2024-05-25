/**
 * Package declaration for the InputValidator class
 */

package com.ctu.roommanagementportal.infrastracture;

//Import statement
import javax.swing.*;
import java.io.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * Represents a class for validating user input.
 */
public class InputValidator {

    public static final Set<String> BUILDING_TYPES = new HashSet<>(Arrays.asList(
            "ADMIN", "ADMIN BUILDING", "COT", "COLLEGE OF TECHNOLOGY", "COE", "COLLEGE OF ENGINEERING"
    ));


    public static final Set<String> ROOM_TYPES = new HashSet<>(Arrays.asList(
            "1", "CLASSROOM", "2", "COMPUTER LABORATORY", "3", "LIBRARY", "4", "SMARTROOM"
    ));


    /**
     * Validates non-empty string input without spaces.
     * @param scanner The Scanner object to read user input.
     * @return The validated non-empty string input.
     */
    public static String validateNonEmptyStringInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.trim().isEmpty()) {
                System.out.print("Invalid input. Please enter a non-empty string:");
            } else {
                return input;
            }
        }
    }

    /**
     * Validates string input.
     * @param scanner The Scanner object to read user input.
     * @return The validated string input
     */
    public static String validateRoomTypeInput(Scanner scanner) {
        while (true) {
            // Read the entire line and trim it to remove any leading/trailing spaces
            String input = scanner.nextLine().trim().toUpperCase();

            // Check if the trimmed input is empty
            if (input.isEmpty()) {
                System.out.print("Invalid input. Please enter a valid room type: ");
                continue;
            }

            // Validate if the input is in the ROOM_TYPES set
            if (ROOM_TYPES.contains(input)) {
                return input; // Return the valid input if it's in the set
            } else {
                System.out.print("Invalid input. Please enter a valid room type: ");
            }
        }
    }

    /**
     * Validates integer input
     * @param scanner The Scanner object to read user input.
     * @return The validated integer input.
     */
    public static int validateIntegerInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim(); // Read entire line and trim whitespace

            if (input.isEmpty()) { // Check if input is empty after trimming
                System.out.print("Invalid input. Please enter a non-empty integer: ");
                continue; // Ask for input again
            }

            try {
                // Attempt to parse the integer
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // Handle invalid integer input
                System.out.print("Invalid input. Please enter an integer: ");
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
            String input = scanner.nextLine().trim().toUpperCase(); // Read and normalize input

            if (input.isEmpty()) { // Check if the trimmed input is empty
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
            } else if (input.equals("YES")) { // Check for 'yes'
                return true;
            } else if (input.equals("NO")) { // Check for 'no'
                return false;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': "); // Handle invalid values
            }
        }
    }

    /**
     * Validates room building name input.
     * @param scanner The Scanner object to read user input.
     * @return The validated building name.
     */
    public static String validateRoomBuilding(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            switch (input) {
                case "A":
                    return "Admin Building";
                case "T":
                    return "College of Technology";
                case "E":
                    return "College of Engineering";
                default:
                    System.out.print("Invalid input. Please enter A, T, or E: ");
            }
        }
    }
}
