package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int rmegabytes = kiloBytes % 1024;
            System.out.println(megabytes + " MB and " + rmegabytes + " KB");
        }
    }
}
