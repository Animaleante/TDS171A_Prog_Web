package com.tds171a.aula08.main;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.tds171a.aula08.pessoa.Pessoa;
import com.tds171a.aula08.utilitario.Leitor;

public class Aula08
{
    /**
     * Atributo estatico e final, definindo número de pessoas na lista
     */
    private final static int NUM_PESSOAS = 100000;

    public static void main(String[] args)
    {
//        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//        List<Pessoa> listaPessoas = new Vector<Pessoa>();
        List<Pessoa> listaPessoas = new LinkedList<Pessoa>();

        long tStart = System.currentTimeMillis();
        for(int i = 0; i < NUM_PESSOAS; i++) {
            //listaPessoas.add(montarPessoa());
            listaPessoas.add(new Pessoa("Bla", "M", new Date()));
        }
        long tEnd = System.currentTimeMillis();

        System.out.println("add::Elapsed: " + (tEnd - tStart) + " milisseconds");

        tStart = System.currentTimeMillis();
        for(Pessoa pessoa : listaPessoas) {
            //System.out.println("Nome: " + pessoa.getNome());
            //System.out.println("Sexo: " + pessoa.getSexo());
            //System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        }
        tEnd = System.currentTimeMillis();
        System.out.println("list::Elapsed: " + (tEnd - tStart) + " milisseconds");

        tStart = System.currentTimeMillis();
        /*for (int i = 0; i < NUM_PESSOAS; i++)
        {
            listaPessoas.remove(0);
        }*/
        /*for(int i = NUM_PESSOAS - 1; i >= 0; i--) {
            listaPessoas.remove(i);
        }*/
        while(listaPessoas.size() > 0) {
            //listaPessoas.remove(0);
            listaPessoas.remove(listaPessoas.size()-1);
        }
        tEnd = System.currentTimeMillis();
        System.out.println("remove::Elapsed: " + (tEnd - tStart) + " milisseconds");
    }

    @SuppressWarnings("deprecation")
    public static Pessoa montarPessoa() {
        String nome = Leitor.readString("Entre com um nome...........................:");
        String sexo = Leitor.readString("Entre com seu sexo..........................:");
        String data = Leitor.readString("Entre com sua data de nascimento(dd/mm/aaaa):");

        return new Pessoa(nome, sexo, new Date(data));
    }
}
