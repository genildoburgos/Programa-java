package com.genildoburgos.banco.modelo;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal(){
        new BigDecimal(20);
    }

    public void creditarRendimentos(BigDecimal percentualJuros){
        BigDecimal valorRendimento = getSaldo().multiply(percentualJuros).divide(new BigDecimal( "100"), 2);
        depositar(valorRendimento);
    }

}
