package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        String opcao, nome, quantidade;
        do {
            menu.mostraMenu();
            opcao = in.nextLine().toLowerCase();
            try {
                menu.validaTipo(opcao);
                if (!opcao.equalsIgnoreCase("finalizar")){
                    System.out.printf("Digite o nome produto de tipo %s que deseja adicionar:\n", opcao);
                    nome = in.nextLine().toLowerCase();
                    try {
                        menu.validaNome(nome);
                        try {
                            System.out.println("Digite a quantidade:");
                            quantidade = in.nextLine();
                            while (!menu.validaPositivo(quantidade)){
                                System.out.println("O valor não pode ser negativo, digite um valor válido:");
                                quantidade = in.nextLine();
                            }
                            switch (opcao){
                                case "verdura":
                                case "verduras":
                                    menu.validaQuantidadeVerduras(quantidade);
                                    break;
                                case "legume":
                                case "legumes":
                                    menu.validaQuantidadeLegumes(quantidade);
                                    break;
                                case "grão":
                                case "grãos":
                                case "grao":
                                case "graos":
                                    menu.validaQuantidadeGraos(quantidade);
                                    break;
                                case "outro":
                                case "outros":
                                    menu.validaQuantidadeOutros(quantidade);
                                    break;
                            }
                            menu.adicionaProduto(opcao,nome,quantidade);
                            System.out.println("Produto adicionado com sucesso!");
                        } catch (Exception e){
                                System.out.println(e.getMessage());
                        }
                    } catch (Exception e){
                            System.out.println(e.getMessage());
                    }
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } while(!opcao.equalsIgnoreCase("finalizar"));

        menu.mostraCarrinho();


    }
}
