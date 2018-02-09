import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUp1 extends JDialog {
    private JPanel contentPane;
    private JButton dismissButton;

    public PopUp1() {
        setContentPane(contentPane);

        dismissButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
