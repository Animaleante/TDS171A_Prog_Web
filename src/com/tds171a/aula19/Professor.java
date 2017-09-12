
package com.tds171a.aula19;

public class Professor extends Funcionario
{
    private static final double BONUS = 0.2;

    public Professor(String pNome, double pSalario)
    {
        super(pNome, pSalario);
    }

    @Override
    public double pagarBonus()
    {
        return getSalario() * BONUS;
    }
}
