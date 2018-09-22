/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Faizin
 */
public class soal03 {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "wav", "mp3");
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
