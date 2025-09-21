package org.example;

import javax.swing.*;
import java.awt.*;

public class EjemploJPanel extends JFrame {
    public EjemploJPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Etiqueta dentro del Panel");
        panel.add(label);

        add(panel);

        setTitle("Ejemplo JPanel");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
