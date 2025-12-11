import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    private JTextField num1Field = new JTextField(10);
    private JTextField num2Field = new JTextField(10);
    private JButton addBtn = new JButton(" + ");
    private JButton subBtn = new JButton(" - ");
    private JButton mulBtn = new JButton(" * ");
    private JButton divBtn = new JButton(" / ");

    public Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Число 1:"));
        add(num1Field);
        add(new JLabel("Число 2:"));
        add(num2Field);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("+");
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("-");
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("*");
            }
        });

        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("/");
            }
        });

        setVisible(true);
    }

    private void calculate(String op) {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (op) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
            }

            JOptionPane.showMessageDialog(this, "Результат = " + result);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ошибка ввода!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
