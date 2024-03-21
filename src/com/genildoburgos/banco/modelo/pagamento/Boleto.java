package com.genildoburgos.banco.modelo.pagamento;

import com.genildoburgos.banco.modelo.Pessoa;

public class Boleto implements  DocumentoPagavel, DocumentoEstornavel {

    private Pessoa beneficiario;
    private final double valor;
    private boolean pago;

    public Boleto(Pessoa beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    @Override
    public double getValorTotal() {
        return valor;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void estornarPagamento() {
        pago = false;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
