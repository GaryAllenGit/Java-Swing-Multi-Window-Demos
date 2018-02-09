import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUp2 extends JDialog {
    private JPanel contentPane;
    private JButton closeButton;

    public PopUp2() {
        setContentPane(contentPane);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
