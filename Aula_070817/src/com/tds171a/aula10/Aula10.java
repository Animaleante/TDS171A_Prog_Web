package com.tds171a.aula10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tds171a.aula08.pessoa.Pessoa;
import com.tds171a.aula08.utilitario.Leitor;

public class Aula10
{
    private List<Pessoa> listaPessoa;

    public static void main(String[] args)
    {
        new Aula10();
    }

    public Aula10()
    {
        listaPessoa = new ArrayList<Pessoa>();

        int op = -1;
        do {
            op = menuPrincipal();
        } while(op != 9);
    }

    private int menuPrincipal()
    {
        System.out.println("Menu");
        System.out.println("--------------");
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar");
        System.out.println("9- Sair");

        int op = Leitor.readInt("Digite sua op��o: ");

        switch (op)
        {
            case 1:
                cadastro();
                break;
            case 2:
                listar();
                break;
            case 9:
                break;
            default:
                System.out.println("");
                break;
        }

        return op;
    }

    private void cadastro()
    {
        String nome = Leitor.readString("Informe o nome:");
        String sexo = Leitor.readString("Informe o sexo:");
        String dtNascimento = Leitor.readString("Informe a data de nascimento:");

        listaPessoa.add(new Pessoa(nome, sexo, new Date(dtNascimento)));
        System.out.println("--> Pessoa cadastrada");
    }

    private void listar()
    {
        for (Pessoa tPessoa : listaPessoa)
        {
            System.out.println("Nome: " + tPessoa.getNome() + ", Sexo: " + tPessoa.getSexo() + ", Data de nascimento: " + tPessoa.getDataNascimento());
        }
    }
}
