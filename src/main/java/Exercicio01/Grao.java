package Exercicio01;

public class Grao extends Produtos{
    private double peso;

    public Grao(String nome, String quantidade) {
        super(nome, quantidade);
        this.peso = Double.parseDouble(quantidade);
    }

    public double getPeso() {
        return peso;
    }
}
