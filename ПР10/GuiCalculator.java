import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCalculator extends JFrame {

    private JTextField display = new JTextField(15);
    private double num1 = 0, num2 = 0;
    private String op = "";

    public GuiCalculator() {
        super("Калькулятор");
        setSize(300, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        display.setEditable(false);
        add(display);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7","8","9","+",
                "4","5","6","-",
                "1","2","3","*",
                "0","C","=","/"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            panel.add(btn);
            btn.addActionListener(e -> press(b));
        }

        add(panel);
        setVisible(true);
    }

    private void press(String b) {
        if (b.matches("[0-9]")) {  
            display.setText(display.getText() + b);
        } 
        else if (b.matches("[+\\-*/]")) {  
            num1 = Double.parseDouble(display.getText());
            op = b;
            display.setText("");
        } 
        else if (b.equals("=")) {  
            num2 = Double.parseDouble(display.getText());
            double res = switch (op) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default -> 0;
            };
            display.setText(String.valueOf(res));
        } 
        else if (b.equals("C")) {
            display.setText("");
            op = "";
        }
    }

    public static void main(String[] args) {
        new GuiCalculator();
    }
}
