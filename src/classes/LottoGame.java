package classes;

import gui.LottoGui;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class LottoGame {

    private static int nextId = 0; // Variable to store the next game ID and keep track of the games played
    private int id = 0;  // Variable to store the game ID
    private int[] gameNumbers; // Array to store the numbers selected by the player
    private LottoResult result; // Enum to store the result of the game
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

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        LottoGame.nextId = nextId;
    }

    public void newReceipt() {

        // Create a new receipt file for the game
        String fileName = "receipt" + id + ".txt";  // File name will be receipt followed by the game ID
        // Path to the file, System.getProperty("user.dir") returns the current working directory
        String path = System.getProperty("user.dir") + File.separator + "LottoGame" + File.separator + fileName;  // Path to the file (// did not work , so the solution I found was to  use File.separator instead)
        File file = new File(path); // Create a new file object
        if (file.exists()) {    // If the file already exists, delete it
            file.delete();
        }
        File directory = new File(System.getProperty("user.dir") + File.separator + "LottoGame");    // Create a directory to store the LottoGame
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

    // Method to save the game results to and create a final report (Extra feature)
    public void saveGame() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm"); // Create a DateTimeFormatter with a custom pattern
        String dateBackup = LocalDateTime.now().format(formatter);
        try { //Find the directory and rename it
            String path = System.getProperty("user.dir") + File.separator + "LottoGame";
            File directory = new File(path);
            if (directory.isDirectory()) {
                directory.renameTo(new File(path + " " + dateBackup));
            } else {
                System.out.println("Error creating backup folder, please check if any game has been sold");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error creating backup folder");
        }
        // Create a new final report file
        try {
            String newPath = System.getProperty("user.dir") + File.separator + "LottoGame " + dateBackup + File.separator + "FinalReport.txt";
            FileWriter fileWriter = new FileWriter(newPath); // Create a new file writer
            PrintWriter printWriter = new PrintWriter(fileWriter);  // Create a new print writer
            // Report Content
            LottoGui lottoGui = new LottoGui();
            printWriter.println("************************************\n");
            printWriter.println("Final Report");
            printWriter.println("Lotto Game " + dateBackup + "\n\n");
            printWriter.println("Numbers Drawn: " + Arrays.toString(LottoGui.getDrawResults()));
            printWriter.println("Number of Games Played: " + getNextId());
            printWriter.println("Number of Winner Games: " + lottoGui.getWinCounter());
            printWriter.println("************************************");
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error creating final report file, check if any game has been played");
        }
    }

    // Getters and setters
    public int[] getGameNumbers() {
        return gameNumbers;
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

}
