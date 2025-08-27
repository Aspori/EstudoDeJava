package academy.stackmobile.cursocompletojava.introducao;

public class Aula08OperadoresLogicos {
    public static void main(String[] args) {

        // OPERADORES LOGICOS

        /*
        ( || e && ) ( "ou" e "e" respectivamente)
         */

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;

        if (n1 == n2 || n3 < n4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (n1 == n2 && n3 < n4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

    }
}
