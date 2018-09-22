/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul02;

/**
 *
 * @author Kleisler
 */
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;

public class Soal01 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
//            String destination = "e:/Java NetBeans/documentku.txt";
//            OutputStream output = new FileOutputStream(destination);
//            System.out.println("Opened " + destination + " For Writing");
            FileWriter qq = new FileWriter("e:/Java NetBeans/baru.txt");
            BufferedWriter ww = new BufferedWriter(qq);
            FileReader ee = new FileReader("e:/Java NetBeans/copy.txt");
            BufferedReader rr = new BufferedReader(ee);

            String line;
            line = rr.readLine();

            while (line != null) {
                try {
                    ww.write(line, 0, line.length());
                    ww.newLine();
                    line = rr.readLine();
                    System.out.println("data berhasil di copy");
                } catch (Exception e) {
                    System.out.println("data gagal di copy");
                }
            }

            //output.close();
            rr.close();
            ww.close();
            System.out.println("output stream closed");
        } catch (Exception e) {
            System.out.println("");

        }

    }
}

