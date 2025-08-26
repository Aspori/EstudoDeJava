package academy.stackmobile.cursocompletojava.introducao;

public class Aula04MutabilidadeImutabilidade {
    public static void main(String[] args) {
        // VARIAVEL MUTAVEL
        // toda variavel que pode mudar de acordo com algo qeu acontece na aplicação

        byte idade = 20;
        idade = 50;

        System.out.println(idade);

        // CONSTANTES ou VALORES IMUTAVEIS
        // final faz ela se tornar constante
        // Variavel constante usa-se em capslock
        final String NOME_SOBRENOME = "Carlos Bezerra";



        System.out.println(NOME_SOBRENOME);
    }
}
