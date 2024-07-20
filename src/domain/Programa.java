package domain;

import  java.util.ArrayList;
import  java.util.List;

public class Programa {
    public static void main(String[] args) {
        List <Carro> carros = new ArrayList<Carro>();
        carros.add(new Civic(2024, "Honda"));
        carros.add(new EcoSport(2019, "Ford"));
        carros.add(new Q3(2017, "Audi"));
        System.out.println(carros);
    }
}
