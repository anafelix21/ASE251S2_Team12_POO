package org.example;

import javax.swing.*;

public class EjemploJTextField extends JFrame {
    public EjemploJTextField() {
        JTextField textField = new JTextField("Escribe aquí", 20);
        add(textField);

        setTitle("Ejemplo JTextField");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
