package academy.stackmobile.cursocompletojava.introducao;

import java.util.Arrays;

public class Aula09Arrays {
    public static void main(String[] args) {
        // Arrays
        // SUPER VARIAVEIS
        // varios valores
        // Listas

        String[] listaCompras = {"Banana", "Carne", "Ovos", "Feijão", "Arroz", "Abacate", "Batata"};
        int[] sorteio = {10,20,30,40,50,60,70,80,90};

        // cada item do array esta posicionado em um indice que começa pelo zero, ou seja o primeiro item esta posicionado no indice zero.

        System.out.println(listaCompras[0]);

        // Passar a lista inteira
        System.out.println(Arrays.toString(listaCompras));

    }
}
