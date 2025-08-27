package academy.stackmobile.cursocompletojava.introducao;

import java.util.Scanner;

public class Aula07IfElse {
    public static void main(String[] args) {

        // IF E ELSE
        // para definir estruturas de decisões.

        /*

        if (CONDIÇÃO) { true
            Código que vai ser executado caso seja verdadeiro
        } else { false
            Código que vai ser executado caso seja falso
        }

         */

        int idade;

        System.out.println("Qual a sua idade?");
        Scanner entradaUsusario = new Scanner(System.in);
        idade = entradaUsusario.nextByte();

        if (idade <= 10){
            System.out.println("Você é uma criança.");
        } else if (idade <= 17){
            System.out.println("Você é um adolecente");
        } else  {
            System.out.println("Você é um adulto, ja pode ser preso.");
        }
    }
}
