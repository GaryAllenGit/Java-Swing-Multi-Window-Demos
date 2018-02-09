import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowDemo1 {
    private JButton popUp1Button;
    private JPanel panel1;
    private JButton popUp2Button;

    public WindowDemo1() {
        popUp1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PopUp1 p1 = new PopUp1();
                p1.setSize(250,125);
                p1.setModal(true);
                p1.setVisible(true);
            }
        });

        popUp2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PopUp2 p2 = new PopUp2();
                p2.setSize(250,125);
                p2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowDemo1");
        frame.setContentPane(new WindowDemo1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
