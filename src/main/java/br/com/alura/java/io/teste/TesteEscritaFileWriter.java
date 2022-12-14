package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de saida com arquivo
        // Padrão decorator
//        FileOutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        bw.close();
    }
}
