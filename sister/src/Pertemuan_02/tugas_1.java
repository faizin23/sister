/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_02;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Faizin
 */
public class tugas_1 {

    public static void main(String[] args) throws UnknownHostException {
        try {

            InetAddress localhost = InetAddress.getLocalHost(); //001
            //System.out.println(localhost);
            byte[] ip = localhost.getAddress(); //
            for (int i = 1; i < 256; i++) {
                ip[3] = (byte) i;
                InetAddress add = InetAddress.getByAddress(ip);
                String sejumlahIP = add.getHostAddress();

                String a = InetAddress.getByName(sejumlahIP).getHostName();
                System.out.print("Hostname from ip \"" + sejumlahIP + "\": " + a);//

                String host = InetAddress.getByName(sejumlahIP).getHostName();

                System.out.println("\n# Check connection");
                InetAddress ia = InetAddress.getByName(host);
                if (ia.isReachable(3000)) {
                    System.out.println(ia.getHostAddress() + " is Reachable");
                } else {
                    System.out.println(ia.getHostAddress() + " is unReachable");
                }
                System.out.println("\n");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
