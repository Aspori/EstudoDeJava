package poo;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n -------------------------------------------- \n");

        Carro carro1 = new Carro("Azul", "ABR43N");
        carro1.detalhesVeiculo("Carro");
        carro1.abastecer("Carro", "Gasolina");
        carro1.acelerar("Carro");

        System.out.println("\n -------------------------------------------- \n");

        Moto moto1 = new Moto("Vermelha", "ABR22V");
        moto1.detalhesVeiculo("Moto");
        moto1.freiar("Moto");

        System.out.println("\n -------------------------------------------- \n");
    }


}
