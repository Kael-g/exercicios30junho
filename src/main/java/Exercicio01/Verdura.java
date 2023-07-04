package Exercicio01;

public class Verdura extends Produtos{
    private double peso;
    public Verdura(String nome, String quantidade) {
        super(nome, quantidade);
        this.peso = Double.parseDouble(quantidade);
    }

    public double getPeso() {
        return peso;
    }
}
