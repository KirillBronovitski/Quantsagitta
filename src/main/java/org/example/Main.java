package org.example;

import org.example.gui.GameFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quantsagitta starter");
        SwingUtilities.invokeLater(GameFrame::new);
    }
}