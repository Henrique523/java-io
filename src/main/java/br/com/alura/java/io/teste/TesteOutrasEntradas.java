package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteOutrasEntradas {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();

        InputStream fis = System.in; // socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out; // socket.getOutputStream();
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while (line != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }


        bw.close();
        br.close();
    }
}
