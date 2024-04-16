package classes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LottoGame {

    private int id = 0;  // Variable to store the game ID
    private int[] gameNumbers; // Array to store the numbers selected by the player
    private LottoResult result; // Enum to store the result of the game
    private static int nextId = 0; // Variable to store the next game ID and keep track of the games played
    private LocalDateTime currentDateTime; // Variable to store the current date and time

    public LottoGame(int[] gameNumbers) {
        id = nextId++;  // Set the game ID
        this.gameNumbers = gameNumbers;  // Set the game numbers
        this.result = LottoResult.TO_BE_DETERMINED; // Set the result to TO_BE_DETERMINED, this will be updated after the draw
        this.currentDateTime = LocalDateTime.now(); // Set the current date and time
    }
// Default constructor
    public LottoGame() {

    }


    public void newReceipt() {

        // Create a new receipt file for the game
        String fileName = "receipt" + id + ".txt";  // File name will be receipt followed by the game ID
        // Path to the file, System.getProperty("user.dir") returns the current working directory
        String path = System.getProperty("user.dir") + File.separator + "receipts" + File.separator + fileName;  // Path to the file (// did not work , so the solution I found was to  use File.separator instead)
        File file = new File(path); // Create a new file object
        if (file.exists()) {    // If the file already exists, delete it
            file.delete();
        }
        File directory = new File(System.getProperty("user.dir") + File.separator + "receipts");    // Create a directory to store the receipts
       // If the directory does not exist, create it
        if (!directory.exists()) {
            directory.mkdirs();
        }
        // Create a DateTimeFormatter with a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Create the receipt file
        try {
            FileWriter fileWriter = new FileWriter(path); // Create a new file writer
            PrintWriter printWriter = new PrintWriter(fileWriter);  // Create a new print writer
            // Receipt content
            printWriter.println("************************************\n");
            printWriter.println("Lotto Game Receipt");
            printWriter.println("Date and Time: " + currentDateTime.format(formatter));
            printWriter.println("Game ID: " + id);
            printWriter.println("Game Numbers: ");
            for (int gameNumber : gameNumbers) {
                printWriter.println(gameNumber);
            }
            printWriter.println("Game Result: " + result + "\n");
            printWriter.println("Thank you for playing! Good luck!\n");
            printWriter.println("************************************");
            printWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating receipt file");
        }
    }

    // Method to check reset game and delete the receipt file
    public void resetGame() {
        try {
        String path = System.getProperty("user.dir") + File.separator + "receipts" ;  // Path to the file
        File directory = new File(path); // Create a new file object
        if (directory.exists()) {    // If the directory exists, delete its contents
            for(File file: directory.listFiles()) { //In Java, you cannot delete a directory if it is not empty.
                file.delete();
            }
            directory.delete(); // Then delete the directory
            JOptionPane.showMessageDialog(null, "Game reset successfully");
        } else {
            JOptionPane.showMessageDialog(null, "No game to reset");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error resetting game");
        }
    }
// Getters and setters
    public int[] getGameNumbers() {
        return gameNumbers;
    }

    public void setGameNumbers(int[] gameNumbers) {
        this.gameNumbers = gameNumbers;
    }

    public LottoResult getResult() {
        return result;
    }

    public void setResult(LottoResult result) {
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        LottoGame.nextId = nextId;
    }
}
