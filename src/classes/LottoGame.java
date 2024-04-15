package classes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LottoGame {

    private static int id = 0;  // Static variable to keep track of the number of games played and generate unique game IDs
    private int[] gameNumbers; // Array to store the numbers selected by the player
    private LottoResult result; // Enum to store the result of the game

    public LottoGame(int[] gameNumbers) {
        this.id = ++id;    // Increment the game ID
        this.gameNumbers = gameNumbers;  // Set the game numbers
        this.result = LottoResult.TO_BE_DETERMINED; // Set the result to TO_BE_DETERMINED, this will be updated after the draw
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        LottoGame.id = id;
    }

    public void newReceipt() {
        // Create a new receipt file for the game
        String fileName = "receipt" + id + ".txt";  // File name will be receipt followed by the game ID
        // Path to the file, System.getProperty("user.dir") returns the current working directory
        String path = System.getProperty("user.dir") + File.separator + "receipts" + File.separator + fileName;  // Path to the file (// did not work , so the solution I found was to  use File.separator instead)
        File directory = new File(System.getProperty("user.dir") + File.separator + "receipts");    // Create a directory to store the receipts
       // If the directory does not exist, create it
        if (!directory.exists()) {
            directory.mkdirs();
        }
        // Create the receipt file
        try {
            FileWriter fileWriter = new FileWriter(path); // Create a new file writer
            PrintWriter printWriter = new PrintWriter(fileWriter);  // Create a new print writer
            // Receipt content
            printWriter.println("************************************\n");
            printWriter.println("Lotto Game Receipt");
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
}
