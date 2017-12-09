import Algorithm.AnnealingSimulation;
import Algorithm.Item;
import Algorithm.Genetic;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenTest {

    @Test
    public void bag1Test() {
        List<Item> elements = new ArrayList<>();
        elements.add(new Item(10, 16));
        elements.add(new Item(24, 28));
        elements.add(new Item(30, 40));
        elements.add(new Item(26, 32));

        Genetic genetic = new Genetic(elements, 60);
        genetic.solving();
        assertEquals(60, genetic.getBestWeight(), 0.1f);
        assertEquals(76, genetic.getBestCost(), 0.1f);

        AnnealingSimulation annealingSim = new AnnealingSimulation(elements, 60);
        annealingSim.solving();
        assertEquals(60, annealingSim.getBestWeight(), 0.1f);
        assertEquals(76, annealingSim.getBestCost(), 0.1f);
    }

    @Test
    public void bag2Test() {
        List<Item> elements = new ArrayList<>();
        elements.add(new Item(0, 0));
        elements.add(new Item(20.05f, 1000));
        elements.add(new Item(3, 0.9f));
        elements.add(new Item(5.75f, 1.75f));
        elements.add(new Item(14, 3));
        elements.add(new Item(2.5f, 0.66f));

        Genetic genetic = new Genetic(elements, 20);
        genetic.solving();
        assertEquals(19.75f, genetic.getBestWeight(), 0.1f);
        assertEquals(4.75f, genetic.getBestCost(), 0.1f);

        AnnealingSimulation annealingSim = new AnnealingSimulation(elements, 20);
        annealingSim.solving();
        assertEquals(19.75f, annealingSim.getBestWeight(), 0.1f);
        assertEquals(4.75f, annealingSim.getBestCost(), 0.1f);
    }

    @Test
    public void bag3Test() {
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

        Genetic genetic = new Genetic(elements, 30);
        genetic.solving();
        assertEquals(27.5f, genetic.getBestWeight(), 0.1f);
        assertEquals(82.0f, genetic.getBestCost(), 0.1f);

        AnnealingSimulation annealingSim = new AnnealingSimulation(elements, 30);
        annealingSim.solving();
        assertEquals(27.5f, annealingSim.getBestWeight(), 0.1f);
        assertEquals(82.0f, annealingSim.getBestCost(), 0.1f);
    }

    @Test
    public void bag4Test() {
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
        elements.add(new Item(5, 15));
        elements.add(new Item(0.5f, 1));
        elements.add(new Item(40, 65));
        elements.add(new Item(20, 35));
        elements.add(new Item(2, 3));
        elements.add(new Item(0, 0));
        elements.add(new Item(10, 0));
        elements.add(new Item(25, 42));
        elements.add(new Item(7, 10));
        elements.add(new Item(1, 1.5f));
        elements.add(new Item(500, 10000));

        AnnealingSimulation annealingSim = new AnnealingSimulation(elements, 60);
        annealingSim.setT_start(500000);
        annealingSim.solving();
        assertEquals(60.0f, annealingSim.getBestWeight(), 0.1f);
        assertEquals(178.5f, annealingSim.getBestCost(), 0.1f);
    }
}
