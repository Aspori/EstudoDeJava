package academy.stackmobile.cursocompletojava.introducao;

import java.util.Scanner;

public class Aula06OperadoresAritimeticos {
    public static void main(String[] args) {

        // OPERADORES ARITIMETICOS

        /*
        + Soma
        - Subtração
        * Multiplicação
        / Divisão
        % Resto da Divisão
         */

        double num1 = 11;
        double num2 = 23;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
        System.out.println(num2 % num1);

        /*
        Operadores Relacionais

        IGUALDADE == . DIFERENTE !=
        Operadores de relacionais retornam true ou false

        ( >, >=, <, <= )


         */
        System.out.println(num1 == num2); //true or false





    }
}
