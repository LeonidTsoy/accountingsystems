import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class userTable extends JFrame implements ActionListener {
    UserJdbcManager userjdbc = new UserJdbcManager();
    Insert_Value insert = new Insert_Value();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new userTable();
            }
        });
    }

    JTextArea log = new JTextArea();
    private final JTextField fieldInput = new JTextField();

    public userTable() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        add(log, BorderLayout.CENTER);
        add(fieldInput, BorderLayout.SOUTH);
        setVisible(true);
        fieldInput.addActionListener(this);
        ArrayList users = userjdbc.users();
        log.setText(String.valueOf(users));
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        String users = insert.users();
        users = fieldInput.getText();
    }
}
