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

    LottoGui lottoGui = new LottoGui();
    private ArrayList<LottoGame> games; // ArrayList to store the games played
    private int[] drawNumbers; // Array to store the numbers drawn in the game
    private int gamesPlayed; // Variable to store the number of games played
    // Layout to be implemented
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
                mainFrame.dispose();

                // Create a new JFrame to display the check results
                JFrame frame = new JFrame("Napoleon Cricket Club Lotto");

                LottoGui lottoGui = new LottoGui();


                // Set the content pane of the new JFrame to the LottoResultGui
                frame.setContentPane(lottoGui.getRootPanel());
                // Add a WindowListener to the frame
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
                            lottoGame.backupFolder(); // Reset the game
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
                    }
                });

                // Pack the frame to size
                frame.pack();

                // Center the new JFrame on the screen
                frame.setLocationRelativeTo(null);

                // Make the frame visible
                frame.setVisible(true);
                lottoGui.setDraw();
            }
        });
        detailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the selected game from the list of games
                    String selectedGame = (String) listOfGames.getSelectedValue();
                    String[] parts = selectedGame.split(" ");
                    int gameId = Integer.parseInt(parts[2]);
                    getGameById(gameId);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Please select a game to view details");
                }

            }
        }
        );

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the game ID entered by the user
                try {
                    int gameId = Integer.parseInt(searchField.getText());
                    getGameById(gameId);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a numeric game ID");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, "Enter a valid game ID");
                }
            }
        });
    }

    public JPanel getRootPanel() {
        // Retrieve games and drawing results from LottoGui (assuming these methods exist)
        List<LottoGame> games = LottoGui.getGames();
        int[] drawNumbers = LottoGui.getDrawResults();

        // Get number of games played (assuming getNextId() returns the count of games played)
        int gamesPlayed = LottoGame.getNextId();

        // Update the list of games displayed in listOfGames using a DefaultListModel
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (LottoGame game : games) {
            listModel.addElement("Game ID: " + game.getId() + " Numbers Played: " + Arrays.toString(game.getGameNumbers()) + " Final Result: " + game.getResult());
        }
        listOfGames.setModel(listModel);
        scrollPane.setViewportView(listOfGames);

        numberOfWinnersField.setText("Number of Winner Games: " + lottoGui.getWinCounter());


        // Update the numberOfGamesField with the total number of games played
        numberOfGamesField.setText("Number of games played: " + gamesPlayed);

        // Update the numbersDrawField with the drawn numbers
        numbersDrawField.setText("Numbers drawn: " + drawNumbers[0] + " - " + drawNumbers[1] + " - " + drawNumbers[2] + " - " + drawNumbers[3]);

        // Assuming rootPanel is correctly initialized and set up in your GUI class
        return rootPanel;
    }


// TO BE IMPLEMENTED
// This panel will have a JList to display the game results and a button to allow the user to view the details of a game (Extra feature)
// At click of the button, the receipt file for the selected game will be opened

//There will be two panels in the GUI, one with the number of games played and the other with the number of games won

//There will be a form to allow the user to search for a game by ID (Extra feature)
//The user will enter the game ID in a text field and click a button to search for the game
//If the game is found, the details of the game receipt will be displayed in a new window
//If the game is not found, an error message will be displayed

    public void setGames(ArrayList<LottoGame> games) {
        this.games = games;
    }

    public void setDrawNumbers(int[] drawNumbers) {
        this.drawNumbers = drawNumbers;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }



    private void getGameById(int gameId) {
        // Open the receipt file for the selected game
        String fileName = "receipt" + gameId + ".txt";  // File name will be receipt followed by the game ID
        String path = System.getProperty("user.dir") + java.io.File.separator + "LottoGame" + java.io.File.separator + fileName;  // Path to the file
        java.io.File file = new java.io.File(path); // Create a new file object
        try {
            // Open the file using the default text editor
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Receipt number " + gameId + " does not exist");
                return;
            } else {
            java.awt.Desktop.getDesktop().edit(file);
            }
        } catch (java.io.IOException ex) {
            JOptionPane.showMessageDialog(null, "Error opening receipt file or file does not exist");
        }
    }
}
