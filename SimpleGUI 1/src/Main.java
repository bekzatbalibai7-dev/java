//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Java GUI");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Атыңызды енгізіңіз:");
        label.setBounds(20, 20, 150, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 50, 200, 25);
        frame.add(textField);

        JButton button = new JButton("OK");
        button.setBounds(20, 90, 80, 25);
        frame.add(button);

        JLabel result = new JLabel("");
        result.setBounds(20, 120, 250, 25);
        frame.add(result);

        button.addActionListener(e -> {
            String name = textField.getText();
            result.setText("Сәлем, " + name + "!");
        });

        frame.setVisible(true);
    }
}
