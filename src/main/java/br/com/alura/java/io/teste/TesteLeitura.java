package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com arquivo
        // Padrão decorator
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();

        while (line != null) {

            System.out.println(line);
            line = br.readLine();
        }

        br.close();
    }
}
