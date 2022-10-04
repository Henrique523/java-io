package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            System.out.println(line);

            Scanner linhaScanner = new Scanner(line);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt","BR"),
                    "Tipo de conta: %s; Ag.: %04d; Conta: %08d; Nome Titular: %20s; Saldo: R$ %08.2f",
                    tipoConta, agencia, numeroConta, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

//            String[] valores = line.split(",");
//            System.out.println(Arrays.toString(valores));
        }

        scanner.close();
    }
}
