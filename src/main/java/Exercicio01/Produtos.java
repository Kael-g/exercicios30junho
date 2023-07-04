package Exercicio01;

abstract class Produtos {
    private String nome;
    private String quantidade;

    public Produtos(String nome, String quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

}
