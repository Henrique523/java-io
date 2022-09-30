package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("lorem-copy.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while (line != null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }


        bw.close();
        br.close();
    }
}
