package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> elements = new ArrayList<>();
        elements.add(new Item(3, 10));
        elements.add(new Item(0.5f, 2));
        elements.add(new Item(8, 11));
        elements.add(new Item(26, 20));
        elements.add(new Item(4, 14));
        elements.add(new Item(1, 20));
        elements.add(new Item(40, 100));
        elements.add(new Item(14, 5));
        elements.add(new Item(6, 10));
        elements.add(new Item(5, 15));
        try {
            Genetic genetic = new Genetic(elements, 30);
            genetic.solving();

            AnnealingSimulation annealingSim = new AnnealingSimulation(elements, 30);
            annealingSim.solving();
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректные данные");
        }
    }
}
