package com.genildoburgos.banco.app;

import com.genildoburgos.banco.modelo.*;
import com.genildoburgos.banco.modelo.atm.CaixaEletronico;
import com.genildoburgos.banco.modelo.excecao.SaldoInsuficienteException;
import com.genildoburgos.banco.modelo.pagamento.Boleto;
import com.genildoburgos.banco.modelo.pagamento.DocumentoPagavel;
import com.genildoburgos.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da silva");
        titular1.setDocumento("121212123423");
        titular1.setRendimentoAnual(new BigDecimal(15000));
        titular1.setTipo(TipoPessoa.JURIDICA);

        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-06-27T13:20:00"));
        System.out.println(titular1.getTipo());
        System.out.println(titular1.getDataUltimaAtualizacao());

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("134343243");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 8898);
        ContaEspecial suaConta = new ContaEspecial(titular2, 123, 123343, new BigDecimal(1000));

        try {
            minhaConta.depositar(new BigDecimal(35000));
            minhaConta.sacar(new BigDecimal(1000));
            minhaConta.creditarRendimentos(new BigDecimal(0.8));
            minhaConta.debitarTarifaMensal();

            suaConta.depositar(new BigDecimal(15000));
            suaConta.sacar(new BigDecimal(1550));
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, new BigDecimal(800));
            Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal(100), 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);

            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta" + e.getMessage());
        }

//        System.out.println("Boleto pago: " + boletoEscola.estaPago());
//        System.out.println("Holerite pago: " + salarioFuncionario.estaPago());


        caixaEletronico.imprimirSaldo(minhaConta);
        caixaEletronico.imprimirSaldo(suaConta);

   }

}
