package com.tds171a.aula10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tds171a.aula08.pessoa.Pessoa;
import com.tds171a.aula08.utilitario.Leitor;

/**
 * Classe da Aula 10
 * @author Lab. Desenvolvimento
 *
 */
public class Aula10
{
    private static final int MENU_CADASTRO = 1;
    private static final int MENU_LISTAR = 2;
    private static final int MENU_SAIR = 9;

    /**
     * Atributo que guarda a lista de pessoas
     */
    private List<Pessoa> listaPessoa;

    /**
     * Chamada main da aplica��o
     * @param args
     */
    public static void main(String[] args)
    {
        new Aula10();
    }

    /**
     * Construtor da classe Aula10
     */
    public Aula10()
    {
        listaPessoa = new ArrayList<Pessoa>();

        int op = -1;
        do {
            op = menuPrincipal();
        } while(op != MENU_SAIR);
    }

    /**
     * M�todo que escreve o menu, recebe uma op��o do usu�rio e atua em cima dessa escolha
     * @return
     */
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
            case MENU_CADASTRO:
                cadastro();
                break;
            case MENU_LISTAR:
                listar();
                break;
            case MENU_SAIR:
                break;
            default:
                System.out.println("Op��o inv�lida.");
                break;
        }

        return op;
    }

    /**
     * M�todo que cadastra uma nova pessoa
     */
    @SuppressWarnings("deprecation")
    private void cadastro()
    {
        String nome = Leitor.readString("Informe o nome:");
        String sexo = Leitor.readString("Informe o sexo:");
        String dtNascimento = Leitor.readString("Informe a data de nascimento:");

        listaPessoa.add(new Pessoa(nome, sexo, new Date(dtNascimento)));
        System.out.println("--> Pessoa cadastrada");
    }

    /**
     * M�todo que lista as pessoas
     */
    private void listar()
    {
        for (Pessoa tPessoa : listaPessoa)
        {
            System.out.println("Nome: " + tPessoa.getNome() + ", Sexo: " + tPessoa.getSexo() + ", Data de nascimento: " + tPessoa.getDataNascimento());
        }
    }
}
