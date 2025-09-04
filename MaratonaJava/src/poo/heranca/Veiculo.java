package poo.heranca;

public class Veiculo {

    String cor;
    String placa;

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesVeiculo (String veiculo) {
        System.out.println("O " + veiculo + " tem a cor " + cor + " e sua placa é " + placa);

    }


    public void acelerar(String veiculo) {
        System.out.println("O " + veiculo + " esta acelerando");
    }

    public void freiar(String veiculo) {
        System.out.println("O " + veiculo + " esta freiando.");
    }

    public void abastecer(String veiculo, String combustivel) {
        System.out.println("O " + veiculo + " esta sendo abastecido com " + combustivel + ".");
    }

}
