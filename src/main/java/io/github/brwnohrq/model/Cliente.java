package io.github.brwnohrq.model;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String cidade;

    public Cliente(int id, String nome, String cpf, String email, String cidade) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }
}
