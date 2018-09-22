/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul02;

/**
 *
 * @author Kleisler
 */
import java.io.*;

public class Copy_Paste {
    public static void main(String args[]){
    try{
        FileReader fr=new FileReader("e:/Java NetBeans/1.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("e:/Java NetBeans/2.txt");
        BufferedWriter bf=new BufferedWriter(fw);
        String line;
        line=br.readLine();
        while(line !=null){
            try{
            bf.write(line,0,line.length());
            bf.newLine();
            line=br.readLine();
            System.out.println("data berhasil di copy");
        } catch(Exception e){
            System.out.println("data gagal di copy");
        }
        }
        br.close();
        bf.close();
    }    catch(Exception e){
        e.printStackTrace();
    }
}
}
