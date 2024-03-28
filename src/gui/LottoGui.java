package gui;

import javax.swing.*;

public class LottoGui {
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
    private JButton a29Button;
    private JButton nPicked1Button;
    private JButton nPicked2Button;
    private JButton nPicked3Button;
    private JButton nPicked4Button;
    private JButton quickPickButton;
    private JButton purchaseButton;
    private JButton clearFullSelectionButton;
    private JButton makeDrawButton;
    private JButton drawN1Button;
    private JButton drawN2Button;
    private JButton drawN3Button;
    private JButton drawN4Button;
    private JButton checkResultButton;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Napoleon Cricket Club Lotto");
        frame.setContentPane(new LottoGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack( );
        frame.setVisible(true);
    }
}
