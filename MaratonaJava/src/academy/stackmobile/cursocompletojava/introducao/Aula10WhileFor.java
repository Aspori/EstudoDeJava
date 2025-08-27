package academy.stackmobile.cursocompletojava.introducao;

public class Aula10WhileFor {
    public static void main(String[] args) {
        /*
        WHILE e FOR


         */

        String[] listaCompras = {"Banana", "Carne", "Ovos", "Feijão", "Arroz", "Abacate", "Batata"};

        // enquanto for verdareiro vai continuar executando


        /*int indice = 0;

        while (listaCompras.length <= 7) {
            System.out.println(listaCompras[indice]);
            indice++;
        }
        */

        for (int indice = 0; listaCompras.length <= 7; indice++) {
            System.out.println(listaCompras[indice]);
        }
    }
}
