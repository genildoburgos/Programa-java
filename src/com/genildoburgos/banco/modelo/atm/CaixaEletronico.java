package com.genildoburgos.banco.modelo.atm;

import com.genildoburgos.banco.modelo.Conta;
import com.genildoburgos.banco.modelo.pagamento.DocumentoEstornavel;
import com.genildoburgos.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome() );
        System.out.println("Sald0: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta){
        if(documento.estaPago()){
            throw new IllegalStateException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta){
        if(!documento.estaPago()){
            throw new IllegalStateException("Documento não pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }
}
