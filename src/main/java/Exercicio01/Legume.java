package Exercicio01;

public class Legume extends Produtos{
    private int unidades;

    public Legume(String nome, String quantidade) {
        super(nome, quantidade);
        this.unidades = Integer.parseInt(quantidade);
    }

    public int getUnidades() {
        return unidades;
    }
}
