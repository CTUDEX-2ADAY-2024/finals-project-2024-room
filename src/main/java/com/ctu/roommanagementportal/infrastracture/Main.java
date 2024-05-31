package com.ctu.roommanagementportal.infrastracture;

import java.util.Scanner;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        CreateRoomRecord createRoomRecord = new CreateRoomRecord();
        SearchRoomRecord searchRoomRecord = new SearchRoomRecord();
        UpdateRoomRecord updateRoomRecord = new UpdateRoomRecord();

        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\n|====================================================|");
            System.out.println("|        Welcome to the Room Management System       |");
            System.out.println("|====================================================|");
            System.out.println("|    Please choose an option from the menu below:    |");
            System.out.println("|====================================================|");
            System.out.println("| 1. Create a New Room Record                        |");
            System.out.println("| 2. Search for an Existing Room Record              |");
            System.out.println("| 3. Update an Existing Room Record                  |");
            System.out.println("| 4. Exit the System                                 |");
            System.out.println("|====================================================|");
            System.out.print("\nPlease enter your choice (1-4): ");


            int choice = InputValidator.validateIntegerInput(scanner);

            switch (choice) {
                case 1:
                    System.out.println("\n****************************************");
                    System.out.println("           Room Creation System          ");
                    System.out.println("****************************************");
                    continueRunning = createRoomRecord.execute(); // Pass the scanner for user input
                    break;
                case 2:
                    System.out.println("\n****************************************");
                    System.out.println("           Room Search System            ");
                    System.out.println("****************************************");
                    continueRunning = searchRoomRecord.execute(); // Pass the scanner for user input
                    break;
                case 3:
                    System.out.println("\n****************************************");
                    System.out.println("           Room Update System            ");
                    System.out.println("****************************************");
                    continueRunning = updateRoomRecord.execute(); // Pass the scanner for user input
                    break;
                case 4:
                    System.out.println("\n************************************************");
                    System.out.println("  Exiting the Room Management System. Goodbye!  ");
                    System.out.println("************************************************");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}