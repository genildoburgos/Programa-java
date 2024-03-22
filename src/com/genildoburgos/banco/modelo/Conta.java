package com.genildoburgos.banco.modelo;

import com.genildoburgos.banco.modelo.excecao.SaldoInsuficienteException;

import java.util.Objects;

    public abstract class Conta {

        private Pessoa titular;
        private int agencia;
        private int numero;
        private double saldo;

        Conta (){

        }
        public Conta(Pessoa titular, int agencia, int numero){
            Objects.requireNonNull(titular);

            this.titular = titular;
            this.agencia = agencia;
            this.numero = numero;
        }

        public void depositar(double valor) {
            if (valor <= 0 ){
                throw new IllegalArgumentException("VALOR DEVE SER MAIOR QUE 0");
            }
            saldo = saldo + valor;
        }

        public void sacar(double valor){
            if (getSaldoDisponivel() - valor < 0){
                throw new SaldoInsuficienteException("Saldo insuficiente");
            }
            saldo = saldo - valor;
        }
        public void sacar (double valor, double taxaSaque){
            sacar(valor + taxaSaque);
        }

        public abstract void debitarTarifaMensal();

        public Pessoa getTitular() {
            return titular;
        }

        public int getAgencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public double getSaldoDisponivel(){
            return getSaldo();
        }
    }
