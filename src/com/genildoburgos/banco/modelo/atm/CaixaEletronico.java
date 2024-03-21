package com.genildoburgos.banco.modelo.atm;

import com.genildoburgos.banco.modelo.Conta;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome() );
        System.out.println("Sald0: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }

    public void pagar(XXXXX documento, Conta conta){

    }
}
