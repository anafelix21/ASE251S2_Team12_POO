package org.example;

import javax.swing.*;

public class EjemploJOptionPane {
    public EjemploJOptionPane() {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
}
