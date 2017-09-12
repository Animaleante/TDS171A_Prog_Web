package com.tds171a.aula18.contas;

/**
 *
 * @author 1201700066
 *
 */
public class Conta
{
    /**
     *
     */
    private long numeroConta;
    /**
     *
     */
    private double saldo;

    /**
     *
     * @param numeroConta
     * @param saldo
     */
    protected Conta(long numeroConta, double saldo)
    {
        this.setNumeroConta(numeroConta);
        this.setSaldo(saldo);
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean sacar(double valor) {
        if(saldo - valor >= 0)
        {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public double saldo() {
        return getSaldo();
    }

    /**
     * @return the numeroConta
     */
    public long getNumeroConta()
    {
        return numeroConta;
    }

    /**
     * @param pNumeroConta the numeroConta to set
     */
    public void setNumeroConta(long pNumeroConta)
    {
        numeroConta = pNumeroConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo()
    {
        return saldo;
    }

    /**
     * @param pSaldo the saldo to set
     */
    public void setSaldo(double pSaldo)
    {
        saldo = pSaldo;
    }
}
