package labs.Lab3_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Алексаелп on 30.01.2017.
 */
public class qwe {
    private JButton button123123123Button;
    private JPanel panelMain;

    public qwe() {
        button123123123Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello world!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("qwe");
        frame.setContentPane(new qwe().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
