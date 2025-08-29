package academy.stackmobile.cursocompletojava.introducao;

import java.util.Scanner;

public class Aula11Switch {
    public static void main(String[] args) {

        /*
            SWITCH case
            compara o valor que esta dentro da variavel e mostra casos de acordo com as escolhas
         */

        byte opcoesBanco;

        System.out.println("Escolha uma opção: \n " +
                "1- Ver fatura do cartão \n " +
                "2- Saldo conta corrente \n " +
                "3- Poupança \n " +
                "4- Cãmbio"
        );

        Scanner entradaUsuario = new Scanner(System.in);

        opcoesBanco = entradaUsuario.nextByte();

        switch (opcoesBanco) {
            case 1:
                System.out.println("Ver fatura do cartão");
                break;

            case 2:
                System.out.println("Ver saldo conta corrente");
                break;

            case 3:
                System.out.println("Ver poupança");
                break;

            case 4:
                System.out.println("Ver cãmbio");
                break;

            default:
                System.out.println("Nenhuma opção valida selecionada");

        }
    }
}
