package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setProfissao("Programador");
        cliente.setCpf("12345678910");
        String nome = "Guilherme Henrique";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteOutput = (Cliente) ois.readObject();
        ois.close();
        System.out.println(clienteOutput.getCpf());
    }
}
