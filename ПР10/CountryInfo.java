import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryInfo extends JFrame {

    private JComboBox<String> menu;
    private JLabel infoLabel;

    public CountryInfo() {
        super("Выбор страны");

        setLayout(new FlowLayout());
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] countries = {"Россия", "Германия", "Франция", "Япония"};
        menu = new JComboBox<>(countries);
        infoLabel = new JLabel("Информация появится здесь");

        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String c = (String) menu.getSelectedItem();
                switch (c) {
                    case "Россия" -> infoLabel.setText("Столица: Москва");
                    case "Германия" -> infoLabel.setText("Столица: Берлин");
                    case "Франция" -> infoLabel.setText("Столица: Париж");
                    case "Япония" -> infoLabel.setText("Столица: Токио");
                }
            }
        });

        add(menu);
        add(infoLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryInfo();
    }
}
