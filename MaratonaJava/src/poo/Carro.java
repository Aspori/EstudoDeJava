package poo;

import java.util.Scanner;

public class Carro {
    // propriedades | atributos | campos | variaveis de instancia

    //variaveis de instancia

    String cor;
    String placaDoCarro;

    //variaveis de classe

    static String pais;


    public Carro(String placaDoCarro, String cor) {
        this.placaDoCarro = placaDoCarro;
        this.cor = cor;
    }
    // Metodo / ações / comportamento do objeto


    // com "public void exemploNome ()  " eu crio um metodo



    public void detalhesCarro (String pais) {
        System.out.println("O carro tem a cor " + cor + " o carro te a placa é " + placaDoCarro);
        this.pais = pais;
        System.out.println("Pais de origem: " + pais);
    }


    public void acelerar() {
        System.out.println("O carro esta em movimento.");
    }

    public void freiar() {
        System.out.println("A velocidade do carro foi reduzida");
    }

    public void abastecer() {
        System.out.println("O carro ta sendo abastecido com gasolina");
    }



    /*

    // Get vai recuperar o valor da propriedade
    // Set vai setar um novo valor para a propriedade

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }

    */



}
