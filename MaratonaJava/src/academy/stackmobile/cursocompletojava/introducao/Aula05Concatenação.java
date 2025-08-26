package academy.stackmobile.cursocompletojava.introducao;

import java.util.Scanner;

public class Aula05Concatenação {
    public static void main(String[] args) {

        // CONCATENAÇÃO
        // Juntar valores de variaveis

        String nome;
        String idade;
        String profissao;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = entradaUsuario.nextLine();

        System.out.println("Qual é a sua idade?");
        idade = entradaUsuario.nextLine();

        System.out.println("Qual é a sua profissão?");
        profissao = entradaUsuario.nextLine();


        System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos e é " + profissao);

    }
}
