package Exercicio01;

public class Outros extends Produtos{
    private int unidades;

    public Outros(String nome, String quantidade) {
        super(nome, quantidade);
        this.unidades = Integer.parseInt(quantidade);
    }

    public int getUnidades() {
        return unidades;
    }
}
