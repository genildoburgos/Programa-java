package com.genildoburgos.banco.modelo.pagamento;

import com.genildoburgos.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel{

    private Pessoa funcionario;
    private double valorHora;
    private int quantidadedeHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, double valorHora, int quantidadedeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadedeHoras = quantidadedeHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora * quantidadedeHoras;
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
