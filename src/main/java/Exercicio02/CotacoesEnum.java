package Exercicio02;

public enum CotacoesEnum {
    COTACAO_DOLAR_AMERICANO("5.25","dólar americano"),
    COTACAO_DOLAR_CANADENSE("4.15","dólar canadense"),
    COTACAO_EURO("6.15","euro"),
    COTACAO_LIBRA_ESTERLINA("7.50","libra esterlina");

    String valor;
    String moeda;

    CotacoesEnum(String valor, String moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }
}
