package org.example;

import javax.swing.*;

public class EjemploJLabel extends JFrame {
    public EjemploJLabel() {
        JLabel label = new JLabel("Hola, soy una etiqueta con JLabel");
        add(label);

        setTitle("Ejemplo JLabel");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
