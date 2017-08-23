package com.tds171a.aula08.main;

import java.util.ArrayList;
import java.util.Date;

import com.tds171a.aula08.pessoa.Pessoa;
import com.tds171a.aula08.utilitario.Leitor;

public class Aula08
{
    /**
     * Atributo estatico e final, definindo número de pessoas na lista
     */
    private final static int NUM_PESSOAS = 2;

    public static void main(String[] args)
    {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        for(int i = 0; i < NUM_PESSOAS; i++) {
            listaPessoas.add(montarPessoa());
        }

        for(Pessoa pessoa : listaPessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        }
    }

    @SuppressWarnings("deprecation")
    public static Pessoa montarPessoa() {
        String nome = Leitor.readString("Entre com um nome...........................:");
        String sexo = Leitor.readString("Entre com seu sexo..........................:");
        String data = Leitor.readString("Entre com sua data de nascimento(dd/mm/aaaa):");

        return new Pessoa(nome, sexo, new Date(data));
    }
}
