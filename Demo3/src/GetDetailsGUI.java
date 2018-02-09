import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetDetailsGUI extends JDialog {
    private JPanel contentPane;
    private JTextField idTF;
    private JTextField firstnameTF;
    private JTextField surnameTF;
    private JTextField deptTF;
    private JButton doneButton;

    private WindowDemo3 parent;

    public GetDetailsGUI(WindowDemo3 parent) {
        this.parent = parent;

        setContentPane(contentPane);
        setModal(true);

        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTF.getText();
                String fn = firstnameTF.getText();
                String sn = surnameTF.getText();
                String dept = deptTF.getText();

                parent.setEmployee(id, fn, sn, dept);

                dispose();
            }
        });
    }


}
