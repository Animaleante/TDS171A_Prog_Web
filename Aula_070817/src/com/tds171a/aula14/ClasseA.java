package com.tds171a.aula14;

public class ClasseA
{
    public double divisao(int i, int j) {
        if(j == 0) {
            throw new IllegalArgumentException("Não é permitido dividendo 0.");
        }

        return i / j;
    }
}
