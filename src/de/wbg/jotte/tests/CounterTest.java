package de.wbg.jotte.tests;

import de.wbg.jotte.Counter;
import de.wbg.jotte.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CounterTest {

    public Model getTestInput() {
        String[] line1 = {"*","0","0","0"};
        String[] line2 = {"0", "0","0","0"};
        String[] line3 = {"0", "*","0","0"};
        String[] line4 = {"0", "0","0","0"};
        String[][] input = new String[4][4];
        input[0] = line1;
        input[1] = line2;
        input[2] = line3;
        input[3] = line4;

        Model m = new Model();
        m.setInput(input);

        return m;
    }

    @Test
    public void testCountUpNeighbours() {
        Model input = getTestInput();
        Counter.countUpNeighbours(2, 1, input);

        Assertions.assertEquals("1", input.getInput()[2][0]);
    }

    @Test void testCountBombs() {
        Model input = getTestInput();
        Counter.countBombs(input);

        Assertions.assertEquals("1", input.getInput()[2][0]);
        Assertions.assertEquals("2", input.getInput()[1][0]);
    }
}
