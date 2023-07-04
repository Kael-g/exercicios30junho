package Exercicio01;

import java.util.Arrays;
import java.util.List;

public class Menu {

    GerenciaCarrinho gerenciaCarrinho = new GerenciaCarrinho();

    public void adicionaProduto(String tipo, String nome, String quantidade){
        switch(tipo){
            case "verdura":
            case "verduras":
                gerenciaCarrinho.add(new Verdura(nome,quantidade));
                gerenciaCarrinho.addVerdura(new Verdura(nome, quantidade));
                break;
            case "legume":
            case "legumes":
                gerenciaCarrinho.add(new Legume(nome,quantidade));
                gerenciaCarrinho.addLegume(new Legume(nome,quantidade));
                break;
            case "grao":
            case "grão":
            case "graos":
            case "grãos":
                gerenciaCarrinho.add(new Grao(nome, quantidade));
                gerenciaCarrinho.addGrao(new Grao(nome, quantidade));
                break;
            case "outro":
            case "outros":
                gerenciaCarrinho.add(new Outros(nome, quantidade));
                gerenciaCarrinho.addOutro(new Outros(nome, quantidade));
                break;
            default:
                System.out.println("Algo deu errado");
        }
    }

    public void mostraMenu(){
        System.out.println("----------- TIPOS DE PRODUTOS DISPONÍVEIS -----------");
        System.out.println("- Verduras");
        System.out.println("- Legumes");
        System.out.println("- Grãos");
        System.out.println("- Outros");
        System.out.println("Digite o tipo de produto que deseja adicionar ao carrinho, ou \"Finalizar\" para encerrar a seleção:");
    }

    public void validaTipo(String tipo){
        String[] tiposValidos = {"verdura", "verduras", "legume", "legumes", "grão", "grãos", "grao", "graos", "outro", "outros", "finalizar"};
        List<String> tiposValidosList = Arrays.asList(tiposValidos);
        if (tiposValidosList.contains(tipo)){
        } else {
            throw new IllegalArgumentException("Tipo de alimento inválido");
        }
    }

    public boolean validaPositivo(String quantidade){
        return !quantidade.contains("-");
    }

    public void validaNome(String nome){
        if (nome.length()>0){
        } else {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }
    }

    public void validaQuantidadeVerduras(String quantidade) {
        if (quantidade.length()>0) {
            if (quantidade.contains(".")) {
            } else {
                throw new NumberFormatException("Para verduras, a quantidade deve ser informada com ponto");
            }
        } else {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        }
    }

    public void validaQuantidadeGraos(String quantidade) {
        if (quantidade.length()>0) {
            if (quantidade.contains(".")) {
            } else {
                throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto");
            }
        } else {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        }
    }

    public void validaQuantidadeLegumes(String quantidade) {
        if (quantidade.length()>0) {
            if (!quantidade.contains(".")) {
            } else {
                throw new NumberFormatException("Para legumes, a quantidade deve ser informada em unidades inteiras");
            }
        } else {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        }
    }

    public void validaQuantidadeOutros(String quantidade) {
        if (quantidade.length()>0) {
            if (!quantidade.contains(".")) {
            } else {
                throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras");
            }
        } else {
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        }
    }

    public void mostraCarrinho(){
        if (gerenciaCarrinho.getVerduras().size() > 0){
            System.out.println("\nVerduras:");
            for (Verdura v : gerenciaCarrinho.getVerduras()){
                System.out.printf("%-35s Quantidade: %s kg\n", v.getNome(), v.getPeso());
            }
        }
        if (gerenciaCarrinho.getLegumes().size() > 0){
            System.out.println("\nLegumes:");
            for (Legume l : gerenciaCarrinho.getLegumes()){
                System.out.printf("%-35s Quantidade: %s unidades\n", l.getNome(), l.getUnidades());
            }
        }
        if (gerenciaCarrinho.getGraos().size() > 0){
            System.out.println("\nGrãos:");
            for (Grao g : gerenciaCarrinho.getGraos()){
                System.out.printf("%-35s Quantidade: %s kg\n", g.getNome(), g.getPeso());
            }
        }
        if (gerenciaCarrinho.getOutros().size() > 0){
            System.out.println("\nOutros:");
            for (Outros o : gerenciaCarrinho.getOutros()){
                System.out.printf("%-35s Quantidade: %s unidades\n", o.getNome(), o.getUnidades());
            }
        }

        System.out.println("\nQuantidade de produtos do tipo verduras: "+gerenciaCarrinho.getVerduras().size());
        System.out.println("Quantidade de produtos do tipo legumes: "+gerenciaCarrinho.getLegumes().size());
        System.out.println("Quantidade de produtos do tipo grãos: "+gerenciaCarrinho.getGraos().size());
        System.out.println("Quantidade de produtos do tipo outros: "+gerenciaCarrinho.getOutros().size());
    }

}
