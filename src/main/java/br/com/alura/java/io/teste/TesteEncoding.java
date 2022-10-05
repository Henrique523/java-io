package br.com.alura.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncoding {
    public static void main(String[] args) {
        String s = "CCCC";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();

        System.out.println(charset);

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " , UTF-8");

        byte[] bytes2 = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes2.length + " , UTF-16");

        String novoString = new String(bytes);
        System.out.println(novoString);
    }
}
