package com.tds171a.aula19;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    private static List<Funcionario> listaFuncionarios;

    public static void main(String[] args)
    {
        listaFuncionarios = new ArrayList<Funcionario>();

        listaFuncionarios.add(new Diretor("Diogo", 5000));
        listaFuncionarios.add(new Secretario("Silvia", 2000));
        listaFuncionarios.add(new Professor("Jonas", 700));

        for (Funcionario func : listaFuncionarios)
        {
            System.out.println(func.getNome() + " - Bonus: " + func.pagarBonus());
        }
    }

}
