package br.senai.sp.jandira.model;

public class Conta {
    private int numeroConta = 123;
    private double saldo = 9652;
    private String agencia = "000-35-XX";

    public void realizarDeposito(Double valor){
        this.saldo += valor;
        System.out.println("Saldo da sua conta: " + this.saldo);
    }
    public void realizarSaque(Double valor){
        if (valor > this.saldo){
            System.out.println("Ta duro dorme!");
        }else {
            this.saldo -= valor;
            System.out.println("Saldo da sua conta: " + this.saldo);
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo da sua conta: " + this.saldo);
    }

}
