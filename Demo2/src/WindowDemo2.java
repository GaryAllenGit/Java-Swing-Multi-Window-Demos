import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowDemo2 {
    private JPanel panel1;
    private JButton getInputButton;
    private JButton showOutputButton;

    private String stringValue;


    public WindowDemo2() {

        getInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stringValue = JOptionPane.showInputDialog("Enter a String");
            }
        });

        showOutputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    PopUp3 p3 = new PopUp3(stringValue);
                    p3.setModal(true);
                    p3.setSize(150,100);
                    p3.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowDemo2");
        frame.setContentPane(new WindowDemo2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
