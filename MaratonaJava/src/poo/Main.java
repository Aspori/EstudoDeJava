package poo;

public class Main {

    public static void main(String[] args) {


        //Carro carro = new Carro();
        Carro carro1 = new Carro("BRA789", "Azul");
        carro1.detalhesCarro("Brasil");
        carro1.acelerar();

        /*
        TENTANDO ENTENDER:
        Chamo a CLASSE Carro crio uma variavel que vai levar um novo(new) Carro (o construtor) que pede varios dados
         */

        Carro carro2 = new Carro("BRA777", "vermelha");
        carro2.detalhesCarro("Brasil");
        carro2.abastecer();


        //carro.setCor("Vermelho");
        //carro.setPlacaDoCarro("AR43N89");



        //System.out.println("" + carro.getPlacaDoCarro() + "\n" + carro.getCor());

    }


}
