import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowDemo3 {
    private JPanel panel1;
    private JButton getEmployeeDetailsButton;
    private JButton showEmployeeDetailsButton;

    private  Employee emp;

    public WindowDemo3() {
        getEmployeeDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    GetDetailsGUI enterDetails = new GetDetailsGUI(WindowDemo3.this);
                    enterDetails.setModal(true);
                    enterDetails.setSize(250,150);
                    enterDetails.setVisible(true);

            }
        });

        showEmployeeDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel1, "Employee = " + emp);
            }
        });
    }

    public void setEmployee(String id, String fn, String sn, String dept) {
        emp = new Employee(id, fn, sn, dept);
     }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowDemo3");
        frame.setContentPane(new WindowDemo3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
