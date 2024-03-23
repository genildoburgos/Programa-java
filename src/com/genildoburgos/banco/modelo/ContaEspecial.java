package com.genildoburgos.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta {

    private BigDecimal valorLimete;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimete) {
        super(titular, agencia, numero);
        this.valorLimete = valorLimete;
    }

    public BigDecimal getSaldoDisponivel(){
        return getSaldo().add(getValorLimete());
    }
    @Override
    public void debitarTarifaMensal(){
        sacar(new BigDecimal(20));
    }

    public BigDecimal getValorLimete() {
        return valorLimete;
    }

    public void setValorLimete(BigDecimal valorLimete) {
        this.valorLimete = valorLimete;
    }
}
