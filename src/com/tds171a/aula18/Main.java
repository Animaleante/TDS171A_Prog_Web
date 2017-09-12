package com.tds171a.aula18;

import com.tds171a.aula18.contas.Conta;
import com.tds171a.aula18.contas.ContaCorrente;
import com.tds171a.aula18.contas.ContaPoupanca;

public class Main
{

    public static void main(String[] args)
    {
        //ContaCorrente contaCorrente = new ContaCorrente(123, 55.04);
        Conta contaCorrente = new ContaCorrente(123, 55.04);
        System.out.println("Conta #"+contaCorrente.getNumeroConta());
        System.out.println("Saldo Conta Corrente: " + contaCorrente.saldo());
        System.out.println("Foi feito saque: "+contaCorrente.sacar(12.99));
        System.out.println("Saldo Conta Corrente: " + contaCorrente.saldo());

        System.out.println("----------------------");

        //ContaPoupanca contaPoupanca = new ContaPoupanca(456, 15714.12);
        Conta contaPoupanca = new ContaPoupanca(456, 15714.12);
        System.out.println("Conta #"+contaPoupanca.getNumeroConta());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.saldo());
        System.out.println("Foi feito saque: "+contaPoupanca.sacar(24.50));
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.saldo());
        System.out.println("Foi feito saque: "+contaPoupanca.sacar(2));
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.saldo());
    }

}
