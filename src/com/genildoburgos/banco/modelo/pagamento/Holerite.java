package com.genildoburgos.banco.modelo.pagamento;

import com.genildoburgos.banco.modelo.Pessoa;

import java.math.BigDecimal;

public class Holerite implements DocumentoPagavel{

    private Pessoa funcionario;
    private BigDecimal valorHora;
    private int quantidadedeHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, BigDecimal valorHora, int quantidadedeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadedeHoras = quantidadedeHoras;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valorHora.multiply(new BigDecimal(quantidadedeHoras));
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;
    }
}
