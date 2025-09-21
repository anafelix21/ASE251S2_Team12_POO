package org.example;

import javax.swing.*;

public class EjemploJCheckBox extends JFrame {
    public EjemploJCheckBox() {
        JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
        add(checkBox);

        setTitle("Ejemplo JCheckBox");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
