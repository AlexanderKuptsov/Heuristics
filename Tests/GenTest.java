import Algorithm.Item;
import Algorithm.Solver;
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

        Solver solver = new Solver(elements, 60);
        solver.solving();
        assertEquals(60, solver.getBestWeight(), 0.5f);
        assertEquals(76, solver.getBestCost(), 0.5f);
    }

    @Test
    public void bag2Test() {
        List<Item> elements = new ArrayList<>();
        elements.add(new Item(0, 0));
        elements.add(new Item(20.001f, 1000));
        elements.add(new Item(3, 0.9f));
        elements.add(new Item(5.75f, 1.75f));
        elements.add(new Item(14, 3));
        elements.add(new Item(2.5f, 0.66f));

        Solver solver = new Solver(elements, 20);
        solver.solving();
        assertEquals(19.75f, solver.getBestWeight(), 0.5f);
        assertEquals(4.75f, solver.getBestCost(), 0.5f);
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
        elements.add(new Item(31, 10000));

        Solver solver = new Solver(elements, 30);
        solver.solving();
        assertEquals(27.5f, solver.getBestWeight(), 0.5f);
        assertEquals(82.0f, solver.getBestCost(), 0.5f);
    }
}
