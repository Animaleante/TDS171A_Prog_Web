package com.tds171a.aula18.contas;

/**
 *
 * @author 1201700066
 *
 */
public class ContaPoupanca extends Conta
{
    private int taxaSaque = 10;

    /**
     *
     * @param pNumeroConta
     * @param pSaldo
     */
    public ContaPoupanca(long pNumeroConta, double pSaldo)
    {
        super(pNumeroConta, pSaldo);
    }

    @Override
    public boolean sacar(double pValor)
    {
        pValor += pValor * ((double)taxaSaque/100);
        return super.sacar(pValor);
    }
}
