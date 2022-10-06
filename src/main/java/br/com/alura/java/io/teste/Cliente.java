package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente implements Autenticavel,Serializable {

    public static final long serialVersionUID = 1L;
    private String nome;
    private String cpf;
    private String profissao;

    private int senha;

    private AutenticacaoUtil util;

    public Cliente() {
        this.util = new AutenticacaoUtil();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
}
