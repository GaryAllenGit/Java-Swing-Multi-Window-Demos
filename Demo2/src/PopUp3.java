import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUp3 extends JDialog {
    private JPanel contentPane;
    private JLabel northLabel;
    private JButton closeButton;

    public PopUp3(String message) {
        setContentPane(contentPane);
        setModal(true);

        northLabel.setText(message);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
