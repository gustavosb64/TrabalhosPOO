package PegadaCarbono;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("Caloi", 26, 32);
        Bicicleta b2 = new Bicicleta("Monark", 29, 36);
        Carro car1 = new Carro("Chevrolet", "ABC9872", 12748.2, Combustivel.GASOLINA);
        Carro car2 = new Carro("Ford", "DEF8765", 458.0, Combustivel.ELETRICO);
        Casa casa1 = new Casa(5, 23.4, 0.2, 3, 2);
        Casa casa2 = new Casa(2, 14.0, 0.09, 5, 3);
        Escola escola1 = new Escola(103, 43.2, 0.6, 30, 73);
        Escola escola2 = new Escola(502, 50.0, 0.5,60,442);

        ArrayList ListaPegadaCarbono = new ArrayList<PegadaDeCarbono>();

        ListaPegadaCarbono.add(b1);
        ListaPegadaCarbono.add(b2);
        ListaPegadaCarbono.add(car1);
        ListaPegadaCarbono.add(car2);
        ListaPegadaCarbono.add(casa1);
        ListaPegadaCarbono.add(casa2);
        ListaPegadaCarbono.add(escola1);
        ListaPegadaCarbono.add(escola2);

        for (int i=0; i < ListaPegadaCarbono.size(); i++){
            PegadaDeCarbono p = (PegadaDeCarbono) ListaPegadaCarbono.get(i);
            System.out.println(p.getPegadaCarbono());
        }

    }
}
