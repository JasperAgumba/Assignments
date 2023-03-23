
package palindromechecker;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PalindromeChecker extends JFrame {

    public PalindromeCheker () {
    setTitle("Palindrome Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        inputField = new JTextField();
        panel.add(inputField);

        checkButton = new JButton("Check");
        PopupMenu resultLabel;
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText("The number is a palindrome.");
                } else {
                    resultLabel.setText("The number is not a palindrome.");
                }
            }
        });
        panel.add(checkButton);

        resultLabel = new JLabel();
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new PalindromeChecker ();
    }
}

     




