package gui;

import classes.LottoButton;
import classes.LottoGame;
import classes.LottoResult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.TimerTask;

public class LottoGui {

    ArrayList<LottoButton> buttons = new ArrayList<>();
    ArrayList<LottoGame> games = new ArrayList<>();
    LottoGame game;
    int counter = 0;
    int[] numbersPicked = new int[4];
    String[] numbersPickedText = {"N. Picked 1", "N. Picked 2", "N. Picked 3", "N. Picked 4"};
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
    private JTextField textField2;
    private JLabel mainLabel;



    public LottoGui() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(1);
                buttonUpdate();
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(2);
                buttonUpdate();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(3);
                buttonUpdate();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(4);
                buttonUpdate();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(5);
                buttonUpdate();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(6);
                buttonUpdate();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(7);
                buttonUpdate();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(8);
                buttonUpdate();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(9);
                buttonUpdate();
            }
        });
        a10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(10);
                buttonUpdate();
            }
        });
        a11Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(11);
                buttonUpdate();
            }
        });
        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(12);
                buttonUpdate();
            }
        });
        a13Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(13);
                buttonUpdate();
            }
        });
        a14Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(14);
                buttonUpdate();
            }
        });
        a15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(15);
                buttonUpdate();
            }
        });
        a16Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(16);
                buttonUpdate();
            }
        });
        a17Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(17);
                buttonUpdate();
            }
        });
        a18Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(18);
                buttonUpdate();
            }
        });
        a19Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(19);
                buttonUpdate();
            }
        });
        a20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(20);
                buttonUpdate();
            }
        });
        a21Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(21);
                buttonUpdate();
            }
        });
        a22Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(22);
                buttonUpdate();
            }
        });
        a23Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(23);
                buttonUpdate();
            }
        });
        a24Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(24);
                buttonUpdate();
            }
        });
        a25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(25);
                buttonUpdate();
            }
        });
        a26Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(26);
                buttonUpdate();
            }
        });
        a27Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(27);
                buttonUpdate();
            }
        });
        a28Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               checkCounter(28);
                buttonUpdate();
            }
        });
quickPickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quickPick();
                buttonUpdate();
            }
        });
        clearSelectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              clearGame();

            }
        });
        makeDrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Integer> numbersToCheck = new ArrayList<>();
                while (numbersToCheck.size() < 4) {
                    int x = (int) (Math.random() * 28) + 1;
                    if (!numbersToCheck.contains(x)) {
                        numbersToCheck.add(x);
                    }
                }
                Timer timer = new Timer(300, null);
                timer.addActionListener(new ActionListener() {
                    int count = 0;
                    public void actionPerformed(ActionEvent e) {
                        if (count < 15) {
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
                            ((Timer)e.getSource()).stop();
                            drawN1Button.setText(String.valueOf(numbersToCheck.get(0)));
                            drawN1Button.setBackground(Color.WHITE);
                            drawN2Button.setText(String.valueOf(numbersToCheck.get(1)));
                            drawN2Button.setBackground(Color.WHITE);
                            drawN3Button.setText(String.valueOf(numbersToCheck.get(2)));
                            drawN3Button.setBackground(Color.WHITE);
                            drawN4Button.setText(String.valueOf(numbersToCheck.get(3)));
                            drawN4Button.setBackground(Color.WHITE);
                        }
                    }
                });
                timer.start();
            }
        });
        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter < 4) {
                    JOptionPane.showMessageDialog(null, "You must pick 4 numbers", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    game = new LottoGame(Arrays.copyOf(numbersPicked, numbersPicked.length));
                    JOptionPane.showMessageDialog(null, "Game purchased successfully, your game is: " + Arrays.toString(game.getGameNumbers()), "Success", JOptionPane.INFORMATION_MESSAGE);
                   games.add(game);
                   clearGame();
                }
            }
        });
        checkResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (LottoGame game:games){
                    sb.append("Game: ").append(Arrays.toString(game.getGameNumbers())).append(" Result: ").append(game.getResult()).append("\n");
                }
                textField1.setText(sb.toString());
            }
        });
        mainLabel.addComponentListener(new ComponentAdapter() {
        });
    }

    private void clearGame() {
        counter = 0;
        buttons.clear();
        for (int i = 0; i < 4; i++) {
            numbersPicked[i] = 0;
            numbersPickedText[i] = "N. Picked " + (i + 1);

        }
        buttonUpdate();
    }

    private void buttonUpdate() {
        nPicked1Button.setText(numbersPickedText[0]);
        nPicked2Button.setText(numbersPickedText[1]);
        nPicked3Button.setText(numbersPickedText[2]);
        nPicked4Button.setText(numbersPickedText[3]);
    }
    public void checkCounter(int x) {
        for (LottoButton button : buttons) {
            if (button.getNumber() == x) {
                JOptionPane.showMessageDialog(null, "You have already picked this number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if (counter < 4) {
            numbersPicked[counter] = x;
            numbersPickedText[counter] = String.valueOf(x);
            counter++;
            buttons.add(new LottoButton(x));
        } else {
            JOptionPane.showMessageDialog(null, "You have already picked 4 numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void quickPick() {
        if (counter == 4) {
            clearGame();
        }
        ArrayList<Integer> numbersToCheck = new ArrayList<>();
        while (numbersToCheck.size() < 4) {
            int x = (int) (Math.random() * 28) + 1;
            if (!numbersToCheck.contains(x)) {
                numbersToCheck.add(x);
            }
        }
        for (int number : numbersToCheck) {
            checkCounter(number);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Napoleon Cricket Club Lotto");
        frame.setContentPane(new LottoGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
