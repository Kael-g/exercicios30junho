package Exercicio01;

import java.util.ArrayList;

public class GerenciaCarrinho {
    private ArrayList<Produtos> carrinho;
    private ArrayList<Verdura> verduras;
    private ArrayList<Legume> legumes;
    private ArrayList<Grao> graos;
    private ArrayList<Outros> outros;


    public GerenciaCarrinho() {
        this.carrinho = new ArrayList<>();
        this.verduras = new ArrayList<>();
        this.legumes = new ArrayList<>();
        this.graos = new ArrayList<>();
        this.outros = new ArrayList<>();
    }

    public void add(Produtos produto){
        carrinho.add(produto);
    }

    public void addVerdura(Verdura verdura){
        verduras.add(verdura);
    }

    public void addLegume(Legume legume){
        legumes.add(legume);
    }

    public void addGrao(Grao grao){
        graos.add(grao);
    }

    public void addOutro(Outros outro){
        outros.add(outro);
    }

    public ArrayList<Produtos> getCarrinho() {
        return carrinho;
    }

    public ArrayList<Verdura> getVerduras() {
        return verduras;
    }

    public ArrayList<Legume> getLegumes() {
        return legumes;
    }

    public ArrayList<Grao> getGraos() {
        return graos;
    }

    public ArrayList<Outros> getOutros() {
        return outros;
    }
}
