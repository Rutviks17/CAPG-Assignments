package com.rutviks.java;
import java.io.*;

public class ReadWrite {
    public static void main(String arg[]) {

        File inf = new File("hello.txt");
        File outf = new File("New.txt");
        FileReader ins = null;
        FileWriter outs = null;

        try {
            ins = new FileReader(inf);
            outs = new FileWriter(outf);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {}
        }
    }
}