/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

/**
 *
 * @author Kleisler
 */
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Soal02 {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG, GIF, and PNG Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);

        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();

        Image image = null;
        try {
            image = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(image);
            
            JFrame frame = new JFrame();
            JLabel label = new JLabel();
            label.setIcon(imageIcon);
            frame.getContentPane().add(label, BorderLayout.CENTER);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (IOException ioe) {

        }

    }
}
