package domain;

public abstract class Carro {
    Integer ano;
    String marca;
    String modelo;

    public Carro(Integer ano, String marca) {
        this.ano = ano;
        this.marca = marca;


    }

    public String toString() {
        return "Modelo: " + getClass().getSimpleName() + ", Ano : " + ano + ", Marca : " + marca + "] \n" ;
    }
}
