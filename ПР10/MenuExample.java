import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExample extends JFrame {

    private JTextArea textArea = new JTextArea(8, 25);
    private JButton btn1 = new JButton("Кнопка 1");
    private JButton btn2 = new JButton("Кнопка 2");

    public MenuExample() {
        super("Пример меню");

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- Меню ---
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("Файл");
        JMenu edit = new JMenu("Правка");
        JMenu help = new JMenu("Справка");

        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выход");

        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");

        file.add(save);
        file.add(exit);

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        setJMenuBar(menuBar);

        // Обработчики событий
        exit.addActionListener(e -> System.exit(0));
        copy.addActionListener(e -> textArea.copy());
        cut.addActionListener(e -> textArea.cut());
        paste.addActionListener(e -> textArea.paste());

        // --- Центральная панель ---
        JPanel btnPanel = new JPanel();
        btnPanel.add(btn1);
        btnPanel.add(btn2);

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
