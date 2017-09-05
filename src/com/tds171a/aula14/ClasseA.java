package com.tds171a.aula14;

import com.tds171a.aula14.exceptions.InvalidDividerException;

public class ClasseA
{
    public double divisao(int i, int j) throws InvalidDividerException {
        if(j == 0) {
            // throw new InvalidDividerException("Não é permitido divisor 0.");
            throw new InvalidDividerException();
        }

        return i / j;
    }
}
