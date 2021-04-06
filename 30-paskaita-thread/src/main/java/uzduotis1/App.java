package uzduotis1;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

        JTextField pirmasSkaicius = new JTextField(20);
        JTextField antrasSkaicius = new JTextField(20);


    }
}
