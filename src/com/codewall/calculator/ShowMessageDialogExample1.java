package com.codewall.calculator;

import javax.swing.*;

public class ShowMessageDialogExample1 {
    public static void main(String[] args)
    {
        String backupDir = "/Users/al/backups";


        // create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame,
                "Problem writing to backup directory: '" + backupDir + "'.");
        System.exit(0);
    }
}
