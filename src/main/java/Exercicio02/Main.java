package Exercicio02;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //TODO ACRESCENTAR DATA

        Moeda moeda = new Moeda();
        String opcao, valor, sair;

        System.out.println("BOAS VINDAS AO CONVERSOR DE MOEDAS!");
        do {
            System.out.println("Qual moeda deseja converter para Real Brasileiro?");
            System.out.println("Moedas suportadas:");
            System.out.println("Dólar americano\nDólar canadense\nEuro\nLibra Esterlina");

            opcao = in.nextLine();
            try {
                moeda.validaMoeda(opcao);
                moeda.setMoeda(opcao);
                System.out.println("É possível converter somente para Real Brasileiro (R$)");
                System.out.println("Digite o valor a ser convertido: ");
                valor = in.nextLine();
                moeda.validaValor(valor);
                moeda.setValorMoedaEstrangeira(valor);
                while (!moeda.validaValorPositivo()) {
                    System.out.println("Valor inválido, por favor, tente novamente");
                    valor = in.nextLine();
                    moeda.validaValor(valor);
                    moeda.setValorMoedaEstrangeira(valor);
                }
                moeda.converter();
                System.out.printf("A moeda %s na cotação de hoje, %s, está em %s. O valor que pediu para converter (%s) em reais é R$ %s\n", moeda.getMoeda().moeda, dateFormat.format(dataAtual), moeda.getMoeda().valor, df.format(moeda.getValorMoedaEstrangeira()), df.format(moeda.getValorReal()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Deseja sair? [S / N]");
                sair = in.nextLine();
            }
        } while (sair.equalsIgnoreCase("n"));

    }
}
