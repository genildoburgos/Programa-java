package com.genildoburgos.banco.app;

import com.genildoburgos.banco.modelo.*;
import com.genildoburgos.banco.modelo.atm.CaixaEletronico;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da silva");
        titular1.setDocumento("121212123423");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("134343243");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 8898);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 123343, 1000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1000);
        minhaConta.creditarRendimentos(0.8);
        minhaConta.debitarTarifaMensal();

        suaConta.depositar(15_000);
        suaConta.sacar(15500);
        suaConta.debitarTarifaMensal();

        caixaEletronico.imprimirSaldo(minhaConta);
        caixaEletronico.imprimirSaldo(suaConta);

   }

}
