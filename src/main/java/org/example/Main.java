package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {
                "Ejemplo JFrame",
                "Ejemplo JPanel",
                "Ejemplo JLabel",
                "Ejemplo JTextField",
                "Ejemplo JOptionPane",
                "Ejemplo JCheckBox"
        };

        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona el ejemplo que deseas ejecutar:",
                "Menú de ejemplos Swing",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "No seleccionaste nada. Programa finalizado.");
            return;
        }

        switch (seleccion) {
            case "Ejemplo JFrame":
                new EjemploJFrame();
                break;
            case "Ejemplo JPanel":
                new EjemploJPanel();
                break;
            case "Ejemplo JLabel":
                new EjemploJLabel();
                break;
            case "Ejemplo JTextField":
                new EjemploJTextField();
                break;
            case "Ejemplo JOptionPane":
                new EjemploJOptionPane();
                break;
            case "Ejemplo JCheckBox":
                new EjemploJCheckBox();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
