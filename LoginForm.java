import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);

        // Action (Controller) - Using _ since we don't use the ActionEvent
        loginButton.addActionListener(_ -> {
            String user = userText.getText();
            String pass = new String(passText.getPassword());

            if (user.equals("admin") && pass.equals("123")) {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid Credentials");
            }
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
