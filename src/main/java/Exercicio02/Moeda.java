package Exercicio02;

import java.math.BigDecimal;

public class Moeda {
    private BigDecimal valorMoedaEstrangeira;
    private BigDecimal valorReal;
    CotacoesEnum[] cotacoesEnum = CotacoesEnum.values();

    CotacoesEnum moeda;

    public void setValorMoedaEstrangeira(String valorMoedaEstrangeira) {
        this.valorMoedaEstrangeira = new BigDecimal(valorMoedaEstrangeira);
    }

    public void setMoeda(String moeda){
        for (CotacoesEnum c : cotacoesEnum){
            if (moeda.equalsIgnoreCase(c.moeda)){
                this.moeda = c;
            }
        }
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public BigDecimal getValorMoedaEstrangeira() {
        return valorMoedaEstrangeira;
    }

    public CotacoesEnum getMoeda() {
        return moeda;
    }

    public void converter(){
        this.valorReal = valorMoedaEstrangeira.multiply(new BigDecimal(moeda.valor));
    }



    public void validaMoeda(String moeda){
        if (!moeda.matches("(?i)dólar americano|(?i)dólar canadense|(?i)euro|(?i)libra esterlina")){
            throw new IllegalArgumentException("Tipo de moeda inválido");
        }
    }

    public void validaValor(String valor){
        if (!valor.matches("[0-9]+[.]?[0-9]*")){
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
        }
    }

    public boolean validaValorPositivo() {
        return this.valorMoedaEstrangeira.compareTo(BigDecimal.ZERO)>0;
    }
}
