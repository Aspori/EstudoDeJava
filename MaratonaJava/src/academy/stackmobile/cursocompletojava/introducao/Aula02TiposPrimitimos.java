package academy.stackmobile.cursocompletojava.introducao;

public class Aula02TiposPrimitimos {
    // psvm + tab atalho para a linha abaixco
    public static void main(String[] args) {
        //String não é um tipo primitivo
        String nomeString = "Vinicius";


        // TIPOS PRIMITIVOS
        // int, double, float, char, byte, short, long, boolean

        // numeros inteiros
        long numeroGrande = 100000L;
        int age = 10;

        // CAST
        int idadeCast = (int) 10000000000L;

        // numeros decimais (PRECISA BOTAR O F NO FLOAT)
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;

        // numeros pequeninos
        byte idadeByte = 127;
        short idadeShort = 32000;

        // booleanos
        boolean verdadeiro = true;
        boolean falso = false;

        // Aspas simples para letras unicas 'M'
        char caractere = 87;

        // Sem precisar colocar a variavel pode só usar o 'var'
        var sobrenome = "Cataldi";

        System.out.println("A idade é " + age + " anos.");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("idade cast " + idadeCast);
        // sout + TAB escreve a linha abaixo
        System.out.println("Seu nome é " + nomeString);



    }
}
