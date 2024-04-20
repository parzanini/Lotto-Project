package gui;

import classes.LottoGame;
import classes.LottoResult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoGui {
    // Variables
    static ArrayList<LottoGame> games = new ArrayList<>(); // List to hold the purchased games
    static int[] drawResults = new int[4]; // Array to hold the draw results
    static int winCounter = 0; // Counter to keep track of how many games are won
    ArrayList<Integer> buttons = new ArrayList<>(); // List to hold the picked numbers (by button click)
    LottoGame game; // LottoGame object to hold the current game
    int counter = 0; // Counter to keep track of how many numbers are picked
    int[] numbersPicked = new int[4]; // Array to hold the picked numbers
    boolean draw = false; // Flag to indicate if a draw has been made, Will be used in the check Results in the future
    Random random = new Random();
    private JPanel rootPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button;
    private JButton a17Button;
    private JButton a18Button;
    private JButton a19Button;
    private JButton a20Button;
    private JButton a21Button;
    private JButton a22Button;
    private JButton a23Button;
    private JButton a24Button;
    private JButton a25Button;
    private JButton a26Button;
    private JButton a27Button;
    private JButton a28Button;
    private JButton nPicked1Button;
    private JButton nPicked2Button;
    private JButton nPicked3Button;
    private JButton nPicked4Button;
    private JButton quickPickButton;
    private JButton purchaseButton;
    private JButton clearSelectionButton;
    private JButton makeDrawButton;
    private JButton drawN1Button;
    private JButton drawN2Button;
    private JButton drawN3Button;
    private JButton drawN4Button;
    private JButton checkResultButton;
    private JLabel mainLabel;
    private JPanel HeaderPanel;
    private JPanel DrawPanel;
    private JPanel ResultPanel;
    private JPanel UserSelectionPanel;
    private JPanel ButtonsPanel;
    private JLabel mainLabelLeft;
    private JLabel mainLabelRight;
    private JLabel headerLabel;
    private JButton resetButton;

    // List of buttons, at click of a button, the number will be added to the list of buttons and checkCounter method will be called
    public LottoGui() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(1);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(2);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(3);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(4);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(5);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(6);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(7);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(8);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(9);

            }
        });
        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(10);

            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(11);
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(12);
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(13);
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(14);
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(15);
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(16);
            }
        });
        a17Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(17);
            }
        });
        a18Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(18);
            }
        });
        a19Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(19);
            }
        });
        a20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(20);
            }
        });
        a21Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(21);
            }
        });
        a22Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(22);
            }
        });
        a23Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(23);
            }
        });
        a24Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(24);
            }
        });
        a25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(25);
            }
        });
        a26Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(26);
            }
        });
        a27Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(27);
            }
        });
        a28Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCounter(28);
            }
        });
        quickPickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quickPick();
            }
        });
        clearSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGame();
            }
        });
        // Method to make a draw, this will generate 4 random numbers between 1 and 28
        makeDrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> numbersToCheck = new ArrayList<>(); // List to hold the unique random numbers
                int resultCounter = 0; // Counter to keep track of the index in the drawResults array
                while (numbersToCheck.size() < 4) { // Loop until 4 unique numbers are generated
                    int x = (int) (Math.random() * 28) + 1; // Generate a random number between 1 and 28
                    if (!numbersToCheck.contains(x)) { // Check if the number is unique
                        numbersToCheck.add(x); // If the number is unique, add it to the list
                        drawResults[resultCounter] = x; // Add the number to the drawResults array
                        resultCounter++; // Increment the resultCounter
                    }
                }

                bubbleSort(drawResults); // Sort the drawResults array

                Timer timer = new Timer(300, null); // Create a new timer with a delay of 300 milliseconds
                timer.addActionListener(new ActionListener() {
                    int count = 0; // Counter to keep track of the number of iterations

                    public void actionPerformed(ActionEvent e) {
                        if (count < 10) {
                            // Generate random numbers and update drawN1Button, drawN2Button, drawN3Button, drawN4Button, and their background colors to create a nice visual effect
                            drawN1Button.setText(String.valueOf(random.nextInt(28) + 1));
                            drawN1Button.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                            drawN2Button.setText(String.valueOf(random.nextInt(28) + 1));
                            drawN2Button.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                            drawN3Button.setText(String.valueOf(random.nextInt(28) + 1));
                            drawN3Button.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                            drawN4Button.setText(String.valueOf(random.nextInt(28) + 1));
                            drawN4Button.setBackground(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                            count++;
                        } else {
                            // Stop the timer after 10 iterations and display the drawResults, return background colors to white
                            ((Timer) e.getSource()).stop();
                            drawN1Button.setText(String.valueOf(drawResults[0]));
                            drawN1Button.setBackground(Color.WHITE);
                            drawN2Button.setText(String.valueOf(drawResults[1]));
                            drawN2Button.setBackground(Color.WHITE);
                            drawN3Button.setText(String.valueOf(drawResults[2]));
                            drawN3Button.setBackground(Color.WHITE);
                            drawN4Button.setText(String.valueOf(drawResults[3]));
                            drawN4Button.setBackground(Color.WHITE);
                        }
                    }
                });

                timer.start(); // Start the timer
                makeDrawButton.setEnabled(false); // Disable the makeDrawButton
                draw = true; // Set the draw flag to true
                resetButton.setEnabled(true); // Enable the resetButton
            }
        });
        // Method to purchase a game, this method will check if the user has picked exactly 4 numbers and show a confirmation dialog to ask if the user wants to print a receipt (Additional Feature)
        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if the user has picked exactly 4 numbers
                if (counter < 4) {
                    // Show an error message if not enough numbers are picked
                    JOptionPane.showMessageDialog(null, "You must pick 4 numbers", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Create a new LottoGame object with the picked numbers
                    game = new LottoGame(Arrays.copyOf(numbersPicked, numbersPicked.length));
                    // Show a confirmation dialog to ask if the user wants to print a receipt
                    int option = JOptionPane.showConfirmDialog(null, "You have purchased a game with numbers: " + Arrays.toString(numbersPicked) + "\n\nWould you like to print a receipt?", "Receipt", JOptionPane.YES_NO_OPTION);
                    games.add(game); // Add the game to the list of games
                    clearGame(); // Clear the game after purchase

                    if (option == 0) { // If the user selects yes
                        game.newReceipt(); // Create a new receipt
                        String fileName = "receipt" + game.getId() + ".txt"; // File name will be receipt followed by the game ID
                        try { // Open the receipt file using the default text editor
                            Desktop.getDesktop().open(new File(System.getProperty("user.dir") + File.separator + "LottoGame" + File.separator + fileName));
                        } catch (IOException exception) {
                            JOptionPane.showMessageDialog(null, "Error opening receipt file");
                        }
                    } else {
                        game.newReceipt(); // Create a new receipt
                    }
                }
            }
        });
        // Method to check the results, this will check if a draw has been made and compare the game numbers with the draw results
        checkResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!draw) {
                    // Show an error message if the draw has not been made
                    JOptionPane.showMessageDialog(null, "Please make a draw first", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Compare the game numbers with the draw results
                    for (LottoGame game : games) {
                        if (game.getGameNumbers()[0] == drawResults[0] && game.getGameNumbers()[1] == drawResults[1] && game.getGameNumbers()[2] == drawResults[2] && game.getGameNumbers()[3] == drawResults[3]) {
                            game.setResult(LottoResult.WIN); // Set the result to WIN if the game numbers match the draw results
                            game.newReceipt(); // Create a new receipt
                            winCounter++; // Increment the winCounter, to be used in the LottoResultGui
                        } else {
                            game.setResult(LottoResult.LOSS); // Set the result to LOSS if the game numbers do not match the draw results
                            game.newReceipt(); // Create a new receipt
                        }
                    }
                    // Open the LottoResultGui to display the results
                    JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(rootPanel);
                    mainFrame.dispose();
                    JFrame frame = new JFrame("Check results");
                    LottoResultGui resultGui = new LottoResultGui();
                    frame.setContentPane(resultGui.getRootPanel());
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default close
                    frame.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            // Display a confirmation dialog
                            int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?A folder named LottoGame will be created in the current directory to store the game receipts and a report will be generated", "Exit Application", JOptionPane.YES_NO_OPTION);
                            if (option == JOptionPane.YES_OPTION) {
                                LottoGame lottoGame = new LottoGame();
                                // If the user confirms, close the frame
                                lottoGame.saveGame(); // Save the game
                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application
                            }
                        }
                    });
                    frame.pack(); // Pack the frame to size
                    frame.setLocationRelativeTo(null);  // Center the new JFrame on the screen
                    frame.setVisible(true); // Make the frame visible
                }
            }
        });
        // Method to reset the game, this will clear the game, set the winCounter to zero, clear the list of games, set the draw flag to false,
        // and enable the makeDrawButton and purchaseButton,
        // so you can start a new game without having to close the application
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LottoGame lottoGame = new LottoGame(); // Create a new LottoGame object
                lottoGame.saveGame(); // Save the game
                clearGame(); // Clear the game
                winCounter = 0; // Reset the winCounter
                draw = false; // Set the draw flag to false
                games.clear(); // Clear the list of games
                LottoGame.setNextId(0); // Reset the nextId
                makeDrawButton.setEnabled(true); // Enable the makeDrawButton
                purchaseButton.setEnabled(true); // Enable the purchaseButton
                headerLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set the font of the headerLabel
                headerLabel.setText("Welcome to Napoleon Cricket Club Lotto, please make a draw or purchase a game"); // Return to the default text
                resetButton.setEnabled(false); // Disable the resetButton
            }
        });
    }

    // Main method to create the GUI
    public static void main(String[] args) {
        JFrame frame = new JFrame("Napoleon Cricket Club Lotto");
        frame.setContentPane(new LottoGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default close
        // Add a WindowListener to the frame
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                LottoGame lottoGame = new LottoGame();
                lottoGame.saveGame(); // Reset the game
                frame.dispose();  // Dispose the frame after reset
            }
        });
        frame.pack();
        frame.setLocationRelativeTo(null); // Center  JFrame
        frame.setVisible(true);
    }

    // Getters
    public static ArrayList<LottoGame> getGames() {
        return games;
    }

    public static int[] getDrawResults() {
        return drawResults;
    }

    // Method to get the winCounter
    public static int getWinCounter() {
        return winCounter;
    }

    // Method to clear the game selection, this will reset the counter, clear the buttons list, and set all numbers to 0
    private void clearGame() {
        counter = 0; // Reset the counter
        buttons.clear(); // Clear the buttons list
        for (int i = 0; i < 4; i++) {
            numbersPicked[i] = 0; // Set all numbers to 0
        }
        buttonUpdate(numbersPicked); // Update the display of picked numbers
    }

    // Method to update the display of the picked numbers
    private void buttonUpdate(int[] x) {
        // Update the display text of the four picked numbers in the GUI
        nPicked1Button.setText(String.valueOf(x[0]));
        nPicked2Button.setText(String.valueOf(x[1]));
        nPicked3Button.setText(String.valueOf(x[2]));
        nPicked4Button.setText(String.valueOf(x[3]));
    }

    // Method to check the counter, this will check if the selected number is already in the picked numbers list (buttons)
    private void checkCounter(int x) {
        for (Integer button : buttons) { // Loop through the buttons list
            if (button == x) {
                // Display an error message if the number is already picked
                JOptionPane.showMessageDialog(null, "You have already picked this number", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if the number is already picked
            }
        }

        // If less than 4 numbers are picked, add the new number to the numbersPicked array
        if (counter < 4) {
            numbersPicked[counter] = x; // Add the new number to numbersPicked array
            counter++; // Increment the counter
            buttons.add(x); // Add the new number to the picked numbers list (buttons)
            if (counter == 4) {
                bubbleSort(numbersPicked); // Sort the picked numbers
            }
        } else {
            // Display an error message if 4 numbers are already picked
            JOptionPane.showMessageDialog(null, "You have already picked 4 numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
        buttonUpdate(numbersPicked); // Update the display of picked numbers
    }

    // Method to sort the numbers in the numbersPicked array
    private void bubbleSort(int[] numbersPicked) {
        // Perform bubble sort to sort the numbers in the numbersPicked array
        for (int i = 0; i < numbersPicked.length - 1; i++) {
            for (int j = 0; j < numbersPicked.length - 1 - i; j++) {
                if (numbersPicked[j] > numbersPicked[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = numbersPicked[j];
                    numbersPicked[j] = numbersPicked[j + 1];
                    numbersPicked[j + 1] = temp;
                }
            }
        }
    }

    // Method to generate 4 random numbers and add them to the game
    private void quickPick() {
        // If 4 numbers are already picked, clear the game to start over
        if (counter == 4) {
            clearGame();
        }

        // Generate 4 random numbers (unique) and add them to the picked numbers
        ArrayList<Integer> numbersToCheck = new ArrayList<>();
        while (numbersToCheck.size() < 4) {
            int x = (int) (Math.random() * 28) + 1;
            if (!numbersToCheck.contains(x)) {
                numbersToCheck.add(x);
            }
        }

        // Add the randomly generated numbers to the game by checking the counter
        for (int number : numbersToCheck) {
            checkCounter(number);
        }
    }

    // Method to get the root panel
    public JPanel getRootPanel() {
        return rootPanel;
    }

    // Method to set the draw flag
    public void setDraw() {
        draw = true;
        makeDrawButton.setEnabled(false);
        purchaseButton.setEnabled(false);
        resetButton.setEnabled(true);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerLabel.setText("Draw has been made, you can not make another draw or purchase a game, please reset the game to start over");
    }
}