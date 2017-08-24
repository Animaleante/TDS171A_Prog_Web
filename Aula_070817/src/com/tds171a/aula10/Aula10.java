package com.tds171a.aula10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
     * Chamada main da aplicação
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
     * Método que escreve o menu, recebe uma opção do usuário e atua em cima dessa escolha
     * @return
     */
    private int menuPrincipal()
    {
        System.out.println("Menu");
        System.out.println("--------------");
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar");
        System.out.println("9- Sair");

        int op = Leitor.readInt("Digite sua opção: ");

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
                System.out.println("Opção inválida.");
                break;
        }

        return op;
    }

    /**
     * Método que cadastra uma nova pessoa
     */
    private void cadastro()
    {
        String nome = Leitor.readString("Informe o nome:");
        String sexo = Leitor.readString("Informe o sexo:");
        String dtNascimento = Leitor.readString("Informe a data de nascimento:");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            listaPessoa.add(new Pessoa(nome, sexo, format.parse(dtNascimento)));
            System.out.println("--> Pessoa cadastrada");
        }
        catch (ParseException Except)
        {
            System.out.println("--> Pessoa não cadastrada");
            Except.printStackTrace();
        }
    }

    /**
     * Método que lista as pessoas
     */
    private void listar()
    {
        for (Pessoa tPessoa : listaPessoa)
        {
            System.out.println("Nome: " + tPessoa.getNome() +
                            ", Sexo: " + tPessoa.getSexo() +
                            ", Data de nascimento: " + tPessoa.getDataNascimento());
        }
    }
}
