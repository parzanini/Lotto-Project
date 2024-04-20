package gui;

import classes.LottoGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoResultGui {
    // Instance variables
    private ArrayList<LottoGame> games; // ArrayList to store the games played
    private int[] drawNumbers; // Array to store the numbers drawn in the game
    private int gamesPlayed; // Variable to store the number of games played

    private JPanel rootPanel;
    private JList listOfGames;
    private JButton detailsButton;
    private JTextField searchField;
    private JButton findButton;
    private JButton returnToMainPanelButton;
    private JLabel numberOfGamesField;
    private JLabel numbersDrawField;
    private JLabel numberOfWinnersField;
    private JScrollPane scrollPane;

    public LottoResultGui() {
        returnToMainPanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current JFrame (mainFrame)
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(rootPanel);
                mainFrame.dispose(); // Close the current JFrame
                JFrame frame = new JFrame("Napoleon Cricket Club Lotto"); // Create a new JFrame
                LottoGui lottoGui = new LottoGui(); // Create a new instance of LottoGui
                frame.setContentPane(lottoGui.getRootPanel()); // Set the content pane of the frame to the root panel of LottoGui
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default close

                // Add a WindowListener to the frame
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        // Display a confirmation dialog
                        int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?A folder named LottoGame will be created in the current directory to store the game receipts and a report will be generated", "Exit Application", JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            LottoGame lottoGame = new LottoGame();
                            // If the user confirms, close the frame
                            lottoGame.saveGame();
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
                    }
                });

                frame.pack(); // Pack the frame
                frame.setLocationRelativeTo(null); // Center the frame on the screen
                frame.setVisible(true); // Set the frame to be visible
                lottoGui.setDraw(); // Call the setDraw method to set the draw numbers
            }
        });
        // Details button calls the getGameById method to open the receipt file for the selected game
        detailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the selected game from the list of games
                    String selectedGame = (String) listOfGames.getSelectedValue(); // Get the selected game
                    String[] parts = selectedGame.split(" "); // Split the string to get the game ID
                    int gameId = Integer.parseInt(parts[2]); // Get the game ID
                    getGameById(gameId); // Call the getGameById method to open the receipt file
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Please select a game to view details");
                }
            }
        });

// Find button calls the getGameById method to open the receipt file for the game with the entered ID
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the game ID entered by the user
                try {
                    int gameId = Integer.parseInt(searchField.getText()); // Get the game ID
                    getGameById(gameId); // Call the getGameById method to open the receipt file
                } catch (NumberFormatException ex) { // Case where the user enters a non-numeric value
                    JOptionPane.showMessageDialog(null, "Please enter a numeric game ID");
                } catch (IllegalArgumentException ex) { // Case where the game ID entered is not found
                    JOptionPane.showMessageDialog(null, "Enter a valid game ID");
                }
            }
        });
    }

    // Method to get the root panel of the LottoResultGui
    public JPanel getRootPanel() {
        List<LottoGame> games = LottoGui.getGames(); // Get the list of games played
        int[] drawNumbers = LottoGui.getDrawResults(); // Get the draw numbers
        int gamesPlayed = LottoGame.getNextId(); // Get the number of games played
        int winCounter = LottoGui.getWinCounter(); // Get the number of winner games

        DefaultListModel<String> listModel = new DefaultListModel<>(); // Insert the game details into the list model
        for (LottoGame game : games) { // Loop through the list of games
            listModel.addElement("Game ID: " + game.getId() + " Numbers Played: " + Arrays.toString(game.getGameNumbers()) + " Final Result: " + game.getResult()); // Add the game details to the list model
        }
        listOfGames.setModel(listModel); // Set the list model to the JList
        scrollPane.setViewportView(listOfGames); // Add the JList to the scroll pane
        numberOfWinnersField.setText("Number of Winner Games: " + winCounter); // Update the numberOfWinnersField with the number of winner games
        numberOfGamesField.setText("Number of games played: " + gamesPlayed); // Update the numberOfGamesField with the number of games played
        numbersDrawField.setText("Numbers drawn: " + drawNumbers[0] + " - " + drawNumbers[1] + " - " + drawNumbers[2] + " - " + drawNumbers[3]); // Update the numbersDrawField with the numbers drawn
        return rootPanel; // Return the root panel
    }

    // Method to open the receipt file for the selected game
    private void getGameById(int gameId) {
        String fileName = "receipt" + gameId + ".txt";  // File name will be receipt followed by the game ID
        String path = System.getProperty("user.dir") + java.io.File.separator + "LottoGame" + java.io.File.separator + fileName;  // Path to the file
        java.io.File file = new java.io.File(path); // Create a new file object
        try {
            // Open the file using the default text editor
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Receipt number " + gameId + " does not exist"); // Display an error message if the file does not exist
            } else {
                java.awt.Desktop.getDesktop().edit(file); // Open the file using the default text editor
            }
        } catch (java.io.IOException ex) {
            JOptionPane.showMessageDialog(null, "Error opening receipt file or file does not exist");
        }
    }
}
