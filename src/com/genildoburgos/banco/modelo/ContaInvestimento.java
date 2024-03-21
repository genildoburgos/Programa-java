package com.genildoburgos.banco.modelo;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal(){
        sacar(20);
    }

    public void creditarRendimentos(double percentualJuros){
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
    }

}
