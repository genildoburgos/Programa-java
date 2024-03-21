package com.genildoburgos.banco.modelo;

public class ContaEspecial extends Conta {

    private double valorLimete;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimete) {
        super(titular, agencia, numero);
        this.valorLimete = valorLimete;
    }

    public double getSaldoDisponivel(){
        return getSaldo() + getValorLimete();
    }
    @Override
    public void debitarTarifaMensal(){
        if(getSaldo() < 10000){
            sacar(30)
        }
    }

    public double getValorLimete() {
        return valorLimete;
    }

    public void setValorLimete(double valorLimete) {
        this.valorLimete = valorLimete;
    }
}
