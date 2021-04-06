package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        MyThreadClass mt = new MyThreadClass("Thread-1");
//        mt.start();
//        for(int i = 0; i < 500; i++){
//            System.out.println("i = " + i + ", i * i = " + i * i);
//        }
//
//        MyRunnablaClass mr= new MyRunnablaClass();
//        mr.run();

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);


        JButton button = new JButton("Press");
        frame.getContentPane().add(button);

        JPanel virsutinisPanel = new JPanel();
        virsutinisPanel.setBackground(Color.BLUE);
        frame.getContentPane().add(BorderLayout.NORTH, virsutinisPanel);

        JButton mygtukas1 = new JButton("Mygtukas 1");
        JButton mygtukas2 = new JButton("Mygtukas 2");

        virsutinisPanel.add(mygtukas1);
        virsutinisPanel.add(mygtukas2);
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> sarasas = new JList<>(model);

        JLabel labelVardas = new JLabel("Vardas");
        JTextField vardas = new JTextField(20);
        JButton itrauktiMygtukas = new JButton("Itraukti i sarasa");
        itrauktiMygtukas.addActionListener(e -> {
            String ivestasVardas = vardas.getText();
            model.addElement(ivestasVardas);
            vardas.setText(null);
        });

        frame.setVisible(true);


    }
}
