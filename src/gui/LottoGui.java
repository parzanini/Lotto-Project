package gui;

import classes.LottoGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class LottoGui {

    ArrayList<Integer> buttons = new ArrayList<>(); // List to hold the picked numbers (by button click)
    ArrayList<LottoGame> games = new ArrayList<>(); // List to hold the purchased games
    LottoGame game; // LottoGame object to hold the current game
    int counter = 0; // Counter to keep track of how many numbers are picked
    int[] numbersPicked = new int[4]; // Array to hold the picked numbers
    int[] drawResults = new int[4]; // Array to hold the draw results
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
    private JTextField textField1;
    private JLabel mainLabel;
    private JPanel HeaderPanel;
    private JPanel DrawPanel;
    private JPanel ResultPanel;
    private JPanel UserSelectionPanel;
    private JPanel ButtonsPanel;
    private JLabel mainLabelLeft;
    private JLabel mainLabelRight;

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
                // Create a list to hold unique random numbers
                ArrayList<Integer> numbersToCheck = new ArrayList<>();
                // Counter to keep track of how many numbers have been generated
                int resultCounter = 0;
                // Generate unique random numbers until we have 4 unique numbers
                while (numbersToCheck.size() < 4) {
                    // Generate a random number between 1 and 28 (inclusive)
                    int x = (int) (Math.random() * 28) + 1;
                    // Check if the generated number is not already in the list
                    if (!numbersToCheck.contains(x)) {
                        // Add the unique number to the list
                        numbersToCheck.add(x);
                        // Store the number in the drawResults array
                        drawResults[resultCounter] = x;
                        // Increment the counter to move to the next index in drawResults
                        resultCounter++;
                    }
                }

                // Sort the drawResults array in ascending order
                bubbleSort(drawResults);

                // Create a timer to simulate drawing numbers
                Timer timer = new Timer(300, null);
                timer.addActionListener(new ActionListener() {
                    int count = 0;

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

                // Start the timer to simulate drawing process
                timer.start();

                // Disable the makeDrawButton after drawing to prevent further draws
                makeDrawButton.setEnabled(false);

                // Set draw flag to true indicating drawing has been completed(This is going to be used in the check Results in the future) **************************
                draw = true;
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

                    // Add the purchased game to the games list
                    games.add(game);

                    // Clear the game selection after purchase
                    clearGame();

                    // If the user chooses to print a receipt (option == 0 for YES)
                    if (option == 0) {
                        // Generate and open a new receipt for the purchased game
                        game.newReceipt();
                        String fileName = "receipt" + game.getId() + ".txt";
                        try {
                            // code to open the receipt using the default application for .txt files
                            Desktop.getDesktop().open(new File(System.getProperty("user.dir") + File.separator + "receipts" + File.separator + fileName));
                        } catch (IOException exception) {
                            JOptionPane.showMessageDialog(null, "Error opening receipt file");
                        }
                    }
                }
            }
        });

        checkResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To be implemented this week
                //Create a method to check the results of the games,it will receive the draw results and compare them with the game numbers and return an array of LottoResult
                //create a for loop to iterate through the games list
                //for each game, compare the game numbers with the draw results
                //id have to be reseted so the receipt can be overwritten
                //if the game numbers match the draw results, set the game result to WIN
                //if the game numbers do not match the draw results, set the game result to LOSS
                // return the array of LottoResult

                //**************************************************************************
                // Close the current JFrame (mainFrame)
                JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(rootPanel);
                mainFrame.dispose();

                // Create a new JFrame to display the check results
                JFrame frame = new JFrame("Check results");

                // Create a new instance of the LottoResultGui
                LottoResultGui resultGui = new LottoResultGui();

                // Set the content pane of the new JFrame to the LottoResultGui
                frame.setContentPane(resultGui.getRootPanel());

                // Set default close operation for the frame
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Pack the frame to size
                frame.pack();

                // Center the new JFrame on the screen
                frame.setLocationRelativeTo(null);

                // Make the frame visible
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Napoleon Cricket Club Lotto");
        frame.setContentPane(new LottoGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center  JFrame
        frame.setVisible(true);
    }

    // Method to clear the game selection, this will reset the counter, clear the buttons list, and set all numbers to 0
    private void clearGame() {
        // Reset the counter to zero
        counter = 0;
        // Clear the list of picked buttons
        buttons.clear();
        // Reset all elements in numbersPicked array to zero
        for (int i = 0; i < 4; i++) {
            numbersPicked[i] = 0;
        }
        // Update the display of picked numbers
        buttonUpdate(numbersPicked);
    }

    private void buttonUpdate(int[] x) {
        // Update the display text of the four picked numbers in the GUI
        nPicked1Button.setText(String.valueOf(x[0]));
        nPicked2Button.setText(String.valueOf(x[1]));
        nPicked3Button.setText(String.valueOf(x[2]));
        nPicked4Button.setText(String.valueOf(x[3]));
    }

    private void checkCounter(int x) {
        // Check if the selected number is already in the picked numbers list (buttons)
        for (Integer button : buttons) {
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

            // If 4 numbers are picked, sort the numbers in ascending order
            if (counter == 4) {
                bubbleSort(numbersPicked); // Sort the picked numbers
            }
        } else {
            // Display an error message if 4 numbers are already picked
            JOptionPane.showMessageDialog(null, "You have already picked 4 numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Update the display of picked numbers after adding a new number
        buttonUpdate(numbersPicked);
    }

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
}