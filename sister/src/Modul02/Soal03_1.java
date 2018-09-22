/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

/**
 *
 * @author Kleisler
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Soal03_1 {

    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "wav", "mp3");
        chooser.setFileFilter(filter);

        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        
        String audioFile = "C:/Windows/Media/Alarm03.wav";
        InputStream in = new FileInputStream(file);

        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
